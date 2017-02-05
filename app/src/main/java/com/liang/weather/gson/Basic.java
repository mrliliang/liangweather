package com.liang.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liliang on 2017/2/4.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
