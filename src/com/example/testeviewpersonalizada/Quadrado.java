package com.example.testeviewpersonalizada;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class Quadrado extends View {
	//Cor
	private Paint paint;	
	//Tipo ou forma
	private Rect retangulo;
	
	public Quadrado(Context context) {
		// TODO Auto-generated constructor stub
		this(context,null);
	}

	public Quadrado(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		
		paint = new Paint();
		paint.setARGB(255, 255, 0, 0);
		retangulo = new Rect(10,10,80,80);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		canvas.drawRect(retangulo, paint);
	}
	

}
