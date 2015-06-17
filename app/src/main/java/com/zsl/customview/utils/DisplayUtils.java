package com.zsl.customview.utils;

import android.app.Activity;
import android.util.DisplayMetrics;

/**
 * 获取屏幕信息的工具类
 * Created by zsl on 15/6/17.
 */
public class DisplayUtils {
	static DisplayMetrics dm = new DisplayMetrics();


	/**
	 * 获取屏幕宽度
	 * @param activity
	 * @return
	 */
	public static int getScreenWidth(Activity activity){
		//获取屏幕信息
		activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
		return dm.widthPixels;
	}

	/**
	 * 获取屏幕高度
	 * @param activity
	 * @return
	 */
	public static int getScreenHeigh(Activity activity){
		//获取屏幕信息
		activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
		return dm.heightPixels;
	}
}
