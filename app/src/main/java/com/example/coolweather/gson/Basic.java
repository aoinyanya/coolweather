package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lolikon on 2017/08/08.
 */

public class Basic {
    @SerializedName("City")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
