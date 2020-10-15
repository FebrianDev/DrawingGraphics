package com.febrian.drawinggraphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

public class MyGrapichs extends AppCompatImageView {
    Bitmap bitmap;
    Paint paint;

    public MyGrapichs(@NonNull Context context) {
        super(context);
        bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.github_logo), 290, 290, false);
        paint = new Paint();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.WHITE);
        canvas.drawColor(Color.WHITE);
        canvas.translate(getWidth() / 4, 120);
        paint.setShadowLayer(40, 0, 0, getResources().getColor(android.R.color.darker_gray));
        canvas.drawRect(getWidth() / 2, 600, 0, 0, paint);

        //Add Title Text
        paint.setColor(Color.BLACK);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(72);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("My Bio", 520, 100, paint);
        canvas.drawBitmap(bitmap, 80, 150, null);

        paint.setTextSize(42);
        paint.setColor(Color.BLACK);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("Name ", 600, 200, paint);
        paint.setTextSize(36);
        paint.setColor(Color.BLACK);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setShadowLayer(0, 0, 0, getResources().getColor(android.R.color.darker_gray));
        canvas.drawText("Febrian", 750, 200, paint);
        canvas.drawLine(520, 230, 1000, 240, paint);

        paint.setTextSize(42);
        paint.setColor(Color.BLACK);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("NRP   ", 600, 300, paint);
        paint.setTextSize(36);
        paint.setColor(Color.BLACK);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setShadowLayer(0, 0, 0, getResources().getColor(android.R.color.darker_gray));
        canvas.drawText("4210191018", 780, 300, paint);
        canvas.drawLine(520, 330, 1000, 340, paint);

        paint.setTextSize(42);
        paint.setColor(Color.BLACK);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("Prodi ", 600, 400, paint);
        paint.setTextSize(36);
        paint.setColor(Color.BLACK);
        paint.setTypeface(Typeface.DEFAULT);
        paint.setShadowLayer(0, 0, 0, getResources().getColor(android.R.color.darker_gray));
        canvas.drawText("D4 Game Technology", 850, 400, paint);
        canvas.drawLine(520, 430, 1000, 440, paint);

    }
}
