package com.example.lsd.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lsd on 2018/1/25.
 * @author  lsd
 * @version 1.0
 * provinceName：省的名字
 * provinceCode：省的代号
 */

public class Province extends DataSupport {
    private int id ;
    private String provinceName;
    private int provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
