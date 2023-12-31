package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class EventDataDeserializerTest extends BaseStripeTest {

  @Test
  public void testEventAccountApplicationDeauthorized() throws Exception {
    final String data = getResourceAsString("/api_fixtures/customer_created.json");
    final Event event = ApiResource.GSON.fromJson(data, Event.class);
    assertNotNull(event);
    assertNotNull(event.getId());
    assertNotNull(event.getData());

    // Using deserializeUnsafe() because the fixture uses an older API version
    assertNotNull(event.getDataObjectDeserializer().deserializeUnsafe());

    final Customer customer = (Customer) event.getDataObjectDeserializer().deserializeUnsafe();
    assertNotNull(customer);
    assertNotNull(customer.getId());
  }
}
