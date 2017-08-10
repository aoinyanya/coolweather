package com.example.coolweather.gson;

/**
 * Created by lolikon on 2017/08/08.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
