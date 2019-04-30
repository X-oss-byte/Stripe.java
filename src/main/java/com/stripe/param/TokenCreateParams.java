// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class TokenCreateParams extends ApiRequestParams {
  /** The bank account this token will represent. */
  @SerializedName("bank_account")
  BankAccount bankAccount;

  @SerializedName("card")
  Object card;

  /**
   * The customer (owned by the application's account) for which to create a token. For use only
   * with [Stripe Connect](https://stripe.com/docs/connect). Also, this can be used only with an
   * [OAuth access token](https://stripe.com/docs/connect/standard-accounts) or [Stripe-Account
   * header](https://stripe.com/docs/connect/authentication). For more details, see [Shared
   * Customers](https://stripe.com/docs/connect/shared-customers).
   */
  @SerializedName("customer")
  String customer;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** The PII this token will represent. */
  @SerializedName("pii")
  Pii pii;

  private TokenCreateParams(
      BankAccount bankAccount, Object card, String customer, List<String> expand, Pii pii) {
    this.bankAccount = bankAccount;
    this.card = card;
    this.customer = customer;
    this.expand = expand;
    this.pii = pii;
  }

  public static Builder builder() {
    return new com.stripe.param.TokenCreateParams.Builder();
  }

  public static class Builder {
    private BankAccount bankAccount;

    private Object card;

    private String customer;

    private List<String> expand;

    private Pii pii;

    /** Finalize and obtain parameter instance from this builder. */
    public TokenCreateParams build() {
      return new TokenCreateParams(
          this.bankAccount, this.card, this.customer, this.expand, this.pii);
    }

    /** The bank account this token will represent. */
    public Builder setBankAccount(BankAccount bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    public Builder setCard(Card card) {
      this.card = card;
      return this;
    }

    public Builder setCard(String card) {
      this.card = card;
      return this;
    }

    /**
     * The customer (owned by the application's account) for which to create a token. For use only
     * with [Stripe Connect](https://stripe.com/docs/connect). Also, this can be used only with an
     * [OAuth access token](https://stripe.com/docs/connect/standard-accounts) or [Stripe-Account
     * header](https://stripe.com/docs/connect/authentication). For more details, see [Shared
     * Customers](https://stripe.com/docs/connect/shared-customers).
     */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * TokenCreateParams#expand} for the field documentation.
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
     * TokenCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** The PII this token will represent. */
    public Builder setPii(Pii pii) {
      this.pii = pii;
      return this;
    }
  }

  public static class BankAccount {
    /**
     * The name of the person or business that owns the bank account.This field is required when
     * attaching the bank account to a `Customer` object.
     */
    @SerializedName("account_holder_name")
    String accountHolderName;

    /**
     * The type of entity that holds the account. It can be `company` or `individual`. This field is
     * required when attaching the bank account to a `Customer` object.
     */
    @SerializedName("account_holder_type")
    AccountHolderType accountHolderType;

    /** The account number for the bank account, in string form. Must be a checking account. */
    @SerializedName("account_number")
    String accountNumber;

    /** The country in which the bank account is located. */
    @SerializedName("country")
    String country;

    /**
     * The currency the bank account is in. This must be a country/currency pairing that [Stripe
     * supports.](docs/payouts)
     */
    @SerializedName("currency")
    String currency;

    /**
     * The routing number, sort code, or other country-appropriateinstitution number for the bank
     * account. For US bank accounts, this is required and should bethe ACH routing number, not the
     * wire routing number. If you are providing an IBAN for`account_number`, this field is not
     * required.
     */
    @SerializedName("routing_number")
    String routingNumber;

    private BankAccount(
        String accountHolderName,
        AccountHolderType accountHolderType,
        String accountNumber,
        String country,
        String currency,
        String routingNumber) {
      this.accountHolderName = accountHolderName;
      this.accountHolderType = accountHolderType;
      this.accountNumber = accountNumber;
      this.country = country;
      this.currency = currency;
      this.routingNumber = routingNumber;
    }

    public static Builder builder() {
      return new com.stripe.param.TokenCreateParams.BankAccount.Builder();
    }

    public static class Builder {
      private String accountHolderName;

      private AccountHolderType accountHolderType;

      private String accountNumber;

      private String country;

      private String currency;

      private String routingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public BankAccount build() {
        return new BankAccount(
            this.accountHolderName,
            this.accountHolderType,
            this.accountNumber,
            this.country,
            this.currency,
            this.routingNumber);
      }

      /**
       * The name of the person or business that owns the bank account.This field is required when
       * attaching the bank account to a `Customer` object.
       */
      public Builder setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
      }

      /**
       * The type of entity that holds the account. It can be `company` or `individual`. This field
       * is required when attaching the bank account to a `Customer` object.
       */
      public Builder setAccountHolderType(AccountHolderType accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
      }

      /** The account number for the bank account, in string form. Must be a checking account. */
      public Builder setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
      }

      /** The country in which the bank account is located. */
      public Builder setCountry(String country) {
        this.country = country;
        return this;
      }

      /**
       * The currency the bank account is in. This must be a country/currency pairing that [Stripe
       * supports.](docs/payouts)
       */
      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      /**
       * The routing number, sort code, or other country-appropriateinstitution number for the bank
       * account. For US bank accounts, this is required and should bethe ACH routing number, not
       * the wire routing number. If you are providing an IBAN for`account_number`, this field is
       * not required.
       */
      public Builder setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
        return this;
      }
    }

    public enum AccountHolderType implements ApiRequestParams.EnumParam {
      @SerializedName("company")
      COMPANY("company"),

      @SerializedName("individual")
      INDIVIDUAL("individual");

      @Getter(onMethod_ = {@Override})
      private final String value;

      AccountHolderType(String value) {
        this.value = value;
      }
    }
  }

  public static class Card {
    @SerializedName("address_city")
    String addressCity;

    @SerializedName("address_country")
    String addressCountry;

    @SerializedName("address_line1")
    String addressLine1;

    @SerializedName("address_line2")
    String addressLine2;

    @SerializedName("address_state")
    String addressState;

    @SerializedName("address_zip")
    String addressZip;

    @SerializedName("currency")
    String currency;

    @SerializedName("cvc")
    String cvc;

    @SerializedName("exp_month")
    String expMonth;

    @SerializedName("exp_year")
    String expYear;

    @SerializedName("name")
    String name;

    @SerializedName("number")
    String number;

    private Card(
        String addressCity,
        String addressCountry,
        String addressLine1,
        String addressLine2,
        String addressState,
        String addressZip,
        String currency,
        String cvc,
        String expMonth,
        String expYear,
        String name,
        String number) {
      this.addressCity = addressCity;
      this.addressCountry = addressCountry;
      this.addressLine1 = addressLine1;
      this.addressLine2 = addressLine2;
      this.addressState = addressState;
      this.addressZip = addressZip;
      this.currency = currency;
      this.cvc = cvc;
      this.expMonth = expMonth;
      this.expYear = expYear;
      this.name = name;
      this.number = number;
    }

    public static Builder builder() {
      return new com.stripe.param.TokenCreateParams.Card.Builder();
    }

    public static class Builder {
      private String addressCity;

      private String addressCountry;

      private String addressLine1;

      private String addressLine2;

      private String addressState;

      private String addressZip;

      private String currency;

      private String cvc;

      private String expMonth;

      private String expYear;

      private String name;

      private String number;

      /** Finalize and obtain parameter instance from this builder. */
      public Card build() {
        return new Card(
            this.addressCity,
            this.addressCountry,
            this.addressLine1,
            this.addressLine2,
            this.addressState,
            this.addressZip,
            this.currency,
            this.cvc,
            this.expMonth,
            this.expYear,
            this.name,
            this.number);
      }

      public Builder setAddressCity(String addressCity) {
        this.addressCity = addressCity;
        return this;
      }

      public Builder setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
        return this;
      }

      public Builder setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
      }

      public Builder setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
      }

      public Builder setAddressState(String addressState) {
        this.addressState = addressState;
        return this;
      }

      public Builder setAddressZip(String addressZip) {
        this.addressZip = addressZip;
        return this;
      }

      public Builder setCurrency(String currency) {
        this.currency = currency;
        return this;
      }

      public Builder setCvc(String cvc) {
        this.cvc = cvc;
        return this;
      }

      public Builder setExpMonth(String expMonth) {
        this.expMonth = expMonth;
        return this;
      }

      public Builder setExpYear(String expYear) {
        this.expYear = expYear;
        return this;
      }

      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      public Builder setNumber(String number) {
        this.number = number;
        return this;
      }
    }
  }

  public static class Pii {
    /** The `id_number` for the PII, in string form. */
    @SerializedName("id_number")
    String idNumber;

    private Pii(String idNumber) {
      this.idNumber = idNumber;
    }

    public static Builder builder() {
      return new com.stripe.param.TokenCreateParams.Pii.Builder();
    }

    public static class Builder {
      private String idNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public Pii build() {
        return new Pii(this.idNumber);
      }

      /** The `id_number` for the PII, in string form. */
      public Builder setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
      }
    }
  }
}