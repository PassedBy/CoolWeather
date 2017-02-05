package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by coderlt on 2017/1/18.
 */

public class Basic {
    @SerializedName("city")  //@SerializedName注解方式
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
