package com.liang.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liliang on 2017/2/4.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
