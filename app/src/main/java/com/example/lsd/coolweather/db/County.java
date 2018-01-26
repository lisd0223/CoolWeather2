package com.example.lsd.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lsd on 2018/1/25.
 * @author lsd
 * @version 1.0
 * countyName：县的名字
 * weatherId：对应的天气id
 * cityId：所属市id
 *
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {

        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {

        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
