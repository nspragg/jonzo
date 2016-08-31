package model;

import com.google.api.client.util.Key;

/**
 * Created by spragn01 on 26/08/2016.
 */
public class Balance {
    @Key
    private Integer balance;
    @Key
    private String currency;
    @Key
    private Integer spendToday;

    public Integer getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getSpendToday() {
        return spendToday;
    }
}
