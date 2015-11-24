package com.eduardoespinosa.aplicacion1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Vector;

/**
 * Created by eduardo on 20/11/15.
 */
public class VistaJuego extends View {
private Vector<Graficos> Meteorits;
    private int numMeteorits = 5;
    private int numFragments = 3;

    public VistaJuego(Context context, AttributeSet attrs) {
        super(context, attrs);
        Drawable drawableFighter, drawableMeteorit, drawableMissil;
        drawableMeteorit = context.getResources().getDrawable(R.drawable.asteroide1);

        Meteorits = new Vector<Graficos>();
        for(int i = 0; i < numMeteorits; i++){
            Graficos meteorit = new Graficos(this, drawableMeteorit);
            meteorit.setvY(Math.random() * 4-2);
            meteorit.setvX(Math.random() * 4-2);
            meteorit.setD((int)(Math.random() * 360));
            meteorit.setR((int)(Math.random() * 8-4));
            Meteorits.add(meteorit);
        }

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        for(Graficos meteorit : Meteorits){
            meteorit.setpX(Math.random() * (w-meteorit.getW()));
            meteorit.setpY(Math.random() * (h-meteorit.getH()));
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for(Graficos meteorit : Meteorits){
            meteorit.renderGraphic(canvas);
        }
    }
}
