package com.zsl.customview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zsl on 15/6/17.
 * 自定义View
 */
public class CustomView extends View {
	//画笔对象
	Paint paint;
	//半径
	int radiu=200;

	public CustomView(Context context) {
		super(context);
	}

	public CustomView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initPaint();
	}

	//初始化画笔
	private void initPaint() {
		paint=new Paint();
		//设置抗锯齿
		paint.setAntiAlias(true);
		//设置颜色
		paint.setColor(Color.BLUE);
		/**
		 * 设置画笔样式
		 * 1.Paint.Style.FILL  填充
		 * 2.Paint.Style.FILL_AND_STROKE 填充并描边
		 * 3.Paint.Style.STROKE 描边
		 */
		paint.setStyle(Paint.Style.STROKE);
		//设置描边的粗细，当值为0时，也有一个像素
		paint.setStrokeWidth(10);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		//绘制圆环
		canvas.drawCircle(300,300,radiu,paint);
	}

	public synchronized void setRadiu(int radiu) {
		this.radiu = radiu;
		//重绘
		invalidate();
	}
}
