package com.akakanch.qcloudmanager;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by Long Zhang on 2017/3/26.
 */

public class CloudServerItem {
    //简略信息
    public int ImageID = R.drawable.side_nav_bar;
    public String InstanceName = new String();
    public String InstanceIP = new String();
    public String InstanceOS = new String();
    public String Status = new String();
    public String PayMode = new String();

    //详细信息，点击后可见
    public String InstanceID = new String();
    public String InstanceRegion = new String();


    //APIkey信息（用于与Adaptor里面的popupmenu交互）
    public String APIKey = new String();
    public String APIKeyID = new String();

    public CloudServerItem(String name,String ip,String os,String status,String paymode,int image,String id){
        InstanceName = name;
        InstanceIP = ip;
        InstanceOS = os;
        Status = status;
        PayMode = paymode;
        ImageID = image;
        InstanceID = id;
    }

    public void setMoreInfo(){

    }

    public void setAPIInfo(String key,String keyid){
        APIKey = key;
        APIKeyID = keyid;
    }


}