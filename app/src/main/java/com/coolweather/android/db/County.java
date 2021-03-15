package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countryName;
    private int cityID;
private String weatherId;

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countryName;
    }

    public void setCountyName(String countryName) {
        this.countryName = countryName;
    }


}
