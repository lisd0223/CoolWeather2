package com.example.lsd.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lsd on 2018/1/25.
 * @author lsd
 * @version 1.0
 * cityName：市的名字
 * cityCode：市的代号
 * provinceId：所属省代号
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityCode() {

        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}