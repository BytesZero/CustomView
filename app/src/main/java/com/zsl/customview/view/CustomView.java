package com.zsl.customview.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;

import com.zsl.customview.R;
import com.zsl.customview.utils.DisplayUtils;

/**
 * Created by zsl on 15/6/17.
 * 自定义View
 */
public class CustomView extends View {
	//画笔对象
	Paint paint;
	//半径
	int radiu=200;

	Bitmap mBitmap;
	int x,y;

	public CustomView(Context context) {
		super(context);
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initPaint();

		mBitmap= BitmapFactory.decodeResource(context.getResources(), R.drawable.yuan);

		y=DisplayUtils.getScreenHeigh((Activity) context)/2-mBitmap.getHeight()/2;
		x=DisplayUtils.getScreenWidth((Activity) context)/2-mBitmap.getWidth()/2;
	}

	//初始化画笔
	private void initPaint() {
		paint=new Paint();
		//设置抗锯齿
		paint.setAntiAlias(true);
		//设置颜色
//		paint.setColor(Color.BLUE);
//		/**
//		 * 设置画笔样式
//		 * 1.Paint.Style.FILL  填充
//		 * 2.Paint.Style.FILL_AND_STROKE 填充并描边
//		 * 3.Paint.Style.STROKE 描边
//		 */
//		paint.setStyle(Paint.Style.STROKE);
//		//设置描边的粗细，当值为0时，也有一个像素
//		paint.setStrokeWidth(10);
		// 生成色彩矩阵
//		ColorMatrix colorMatrix = new ColorMatrix(new float[]{
//				0.5F, 0, 0, 0, 0,
//				0, 0.5F, 0, 0, 0,
//				0, 0, 0.5F, 0, 0,
//				0, 0, 0, 1, 0,
//		});
		//黑白
//		ColorMatrix colorMatrix = new ColorMatrix(new float[]{
//				0.33F, 0.59F, 0.11F, 0, 0,
//				0.33F, 0.59F, 0.11F, 0, 0,
//				0.33F, 0.59F, 0.11F, 0, 0,
//				0, 0, 0, 1, 0,
//		});
//		paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
//		//光照过滤
//		paint.setColorFilter(new LightingColorFilter(0xFFFF00FF,0X00FFFF00));

		//混合色
		/**
		 * PorterDuff.Mode.DARKEN ：变暗
		 */
		paint.setColorFilter(new PorterDuffColorFilter(Color.BLUE, PorterDuff.Mode.DARKEN));



	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//绘制圆环
//		canvas.drawCircle(300,300,radiu,paint);

		canvas.drawBitmap(mBitmap,x,y,paint);
	}

	public synchronized void setRadiu(int radiu) {
		this.radiu = radiu;
		//重绘
		invalidate();
	}
}
