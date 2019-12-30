
package com.tpnote.pointet.model.DarkSkyAPI;

import java.util.List;

public class Daily {

    private String summary;
    private String icon;
    private List<DatumDay> data = null;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<DatumDay> getData() {
        return data;
    }

    public void setData(List<DatumDay> data) {
        this.data = data;
    }
}
