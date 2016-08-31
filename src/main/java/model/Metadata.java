package model;

import com.google.api.client.util.Key;

/**
 * Created by spragn01 on 26/08/2016.
 */
public class Metadata {
    @Key
    private boolean isTopup;
    @Key
    private String explanationExtended;
    @Key
    private boolean hideAmount;
    @Key
    private boolean hideTransaction;
    @Key
    private String notes;

    public boolean isTopup() {
        return isTopup;
    }

    public String getExplanationExtended() {
        return explanationExtended;
    }

    public boolean isHideAmount() {
        return hideAmount;
    }

    public boolean isHideTransaction() {
        return hideTransaction;
    }

    public String getNotes() {
        return notes;
    }
}
