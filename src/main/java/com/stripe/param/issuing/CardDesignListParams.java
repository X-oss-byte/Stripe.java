// File generated from our OpenAPI spec
package com.stripe.param.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class CardDesignListParams extends ApiRequestParams {
  /**
   * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, starting with
   * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
   * fetch the previous page of the list.
   */
  @SerializedName("ending_before")
  String endingBefore;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
   * default is 10.
   */
  @SerializedName("limit")
  Long limit;

  /** Only return card designs with the given lookup keys. */
  @SerializedName("lookup_keys")
  List<String> lookupKeys;

  /** Only return card designs with the given preference. */
  @SerializedName("preference")
  Preference preference;

  /**
   * A cursor for use in pagination. {@code starting_after} is an object ID that defines your place
   * in the list. For instance, if you make a list request and receive 100 objects, ending with
   * {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in order to
   * fetch the next page of the list.
   */
  @SerializedName("starting_after")
  String startingAfter;

  /** Only return card designs with the given status. */
  @SerializedName("status")
  Status status;

  private CardDesignListParams(
      String endingBefore,
      List<String> expand,
      Map<String, Object> extraParams,
      Long limit,
      List<String> lookupKeys,
      Preference preference,
      String startingAfter,
      Status status) {
    this.endingBefore = endingBefore;
    this.expand = expand;
    this.extraParams = extraParams;
    this.limit = limit;
    this.lookupKeys = lookupKeys;
    this.preference = preference;
    this.startingAfter = startingAfter;
    this.status = status;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String endingBefore;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Long limit;

    private List<String> lookupKeys;

    private Preference preference;

    private String startingAfter;

    private Status status;

    /** Finalize and obtain parameter instance from this builder. */
    public CardDesignListParams build() {
      return new CardDesignListParams(
          this.endingBefore,
          this.expand,
          this.extraParams,
          this.limit,
          this.lookupKeys,
          this.preference,
          this.startingAfter,
          this.status);
    }

    /**
     * A cursor for use in pagination. {@code ending_before} is an object ID that defines your place
     * in the list. For instance, if you make a list request and receive 100 objects, starting with
     * {@code obj_bar}, your subsequent call can include {@code ending_before=obj_bar} in order to
     * fetch the previous page of the list.
     */
    public Builder setEndingBefore(String endingBefore) {
      this.endingBefore = endingBefore;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardDesignListParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * CardDesignListParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * CardDesignListParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link CardDesignListParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the
     * default is 10.
     */
    public Builder setLimit(Long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Add an element to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CardDesignListParams#lookupKeys} for the field documentation.
     */
    public Builder addLookupKey(String element) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.add(element);
      return this;
    }

    /**
     * Add all elements to `lookupKeys` list. A list is initialized for the first `add/addAll` call,
     * and subsequent calls adds additional elements to the original list. See {@link
     * CardDesignListParams#lookupKeys} for the field documentation.
     */
    public Builder addAllLookupKey(List<String> elements) {
      if (this.lookupKeys == null) {
        this.lookupKeys = new ArrayList<>();
      }
      this.lookupKeys.addAll(elements);
      return this;
    }

    /** Only return card designs with the given preference. */
    public Builder setPreference(CardDesignListParams.Preference preference) {
      this.preference = preference;
      return this;
    }

    /**
     * A cursor for use in pagination. {@code starting_after} is an object ID that defines your
     * place in the list. For instance, if you make a list request and receive 100 objects, ending
     * with {@code obj_foo}, your subsequent call can include {@code starting_after=obj_foo} in
     * order to fetch the next page of the list.
     */
    public Builder setStartingAfter(String startingAfter) {
      this.startingAfter = startingAfter;
      return this;
    }

    /** Only return card designs with the given status. */
    public Builder setStatus(CardDesignListParams.Status status) {
      this.status = status;
      return this;
    }
  }

  public enum Preference implements ApiRequestParams.EnumParam {
    @SerializedName("default")
    DEFAULT("default"),

    @SerializedName("none")
    NONE("none");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Preference(String value) {
      this.value = value;
    }
  }

  public enum Status implements ApiRequestParams.EnumParam {
    @SerializedName("active")
    ACTIVE("active"),

    @SerializedName("inactive")
    INACTIVE("inactive"),

    @SerializedName("rejected")
    REJECTED("rejected"),

    @SerializedName("review")
    REVIEW("review");

    @Getter(onMethod_ = {@Override})
    private final String value;

    Status(String value) {
      this.value = value;
    }
  }
}
