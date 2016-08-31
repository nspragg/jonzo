package model;

import com.google.api.client.util.Key;

/**
 * Created by spragn01 on 25/08/2016.
 */
public class Transaction {

    // TODO attachments and counter party

    @Key
    private String id;
    @Key
    private String created;
    @Key
    private String description;
    @Key
    private Integer amount;
    @Key
    private String currency;
    @Key
    private String merchant;
    @Key
    private String notes;
    @Key
    private Metadata metadata;
    @Key
    private Integer accountBalence;
    @Key
    private String category;
    @Key
    private boolean isLoad;
    @Key
    private String settled;
    @Key
    private Integer localAmount;
    @Key
    private String localCurrency;
    @Key
    private String accountId;
    @Key
    private String scheme;
    @Key
    private Integer depudeId;
    @Key
    private boolean originator;
    @Key
    private boolean includeInSpending;

    public String getId() {
        return id;
    }

    public String getCreated() {
        return created;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getMerchant() {
        return merchant;
    }

    public String getNotes() {
        return notes;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Integer getAccountBalence() {
        return accountBalence;
    }

    public String getCategory() {
        return category;
    }

    public boolean isLoad() {
        return isLoad;
    }

    public String getSettled() {
        return settled;
    }

    public Integer getLocalAmount() {
        return localAmount;
    }

    public String getLocalCurrency() {
        return localCurrency;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getScheme() {
        return scheme;
    }

    public Integer getDepudeId() {
        return depudeId;
    }

    public boolean isOriginator() {
        return originator;
    }

    public boolean isIncludeInSpending() {
        return includeInSpending;
    }
}
