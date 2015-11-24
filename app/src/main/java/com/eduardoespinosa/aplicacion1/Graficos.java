package com.eduardoespinosa.aplicacion1;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * Created by eduardo on 20/11/15.
 */
public class Graficos {
    private Drawable drawable;
    private double pX, pY; //Position X, Position Y
    private double vX, vY;//velocity X, velocity
    private double d, r; //degrees, rotation
    private int w, h; //width, height
    private int radius;
    private View view;
    public static final int MAX_VELOCITY = 20;

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public static int getMaxVelocity() {
        return MAX_VELOCITY;
    }

    public double getpX() {
        return pX;
    }

    public void setpX(double pX) {
        this.pX = pX;
    }

    public double getpY() {
        return pY;
    }

    public void setpY(double pY) {
        this.pY = pY;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public double getvX() {
        return vX;
    }

    public void setvX(double vX) {
        this.vX = vX;
    }

    public double getvY() {
        return vY;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }


    public Graficos(View view, Drawable drawable) {
        this.view = view;
        this.drawable = drawable;
        w = drawable.getIntrinsicWidth();
        h = drawable.getIntrinsicHeight();
        radius = (w + h) / 4;

    }

    public void renderGraphic(Canvas canvas) {
        canvas.save();
        int x = (int) (pX + w / 2);
        int y = (int) (pY + h / 2);
        canvas.rotate((float) d, (float) x, (float) y);
        drawable.setBounds((int) pX, (int) pY, (int) pX + w, (int) pY + h);
        drawable.draw(canvas);
        canvas.restore();
        int rInval = (int) Math.hypot(w, h) / 2 + MAX_VELOCITY;
        view.invalidate(x - rInval, y - rInval, x + rInval, y + rInval);
    }

    public void upPosition(double factor) {
        pX += vX * factor;
        if (pX < -w / 2) {
            pX = view.getWidth() - w / 2;
        }
        if (pX > view.getWidth() - w / 2) {
            pX = -w / 2;
        }

        pY += vY * factor;
        if (pY < -w / 2) {
            pY = view.getHeight() - h / 2;
        }
        if (pY > view.getHeight() - h / 2) {
            pY = -h / 2;
        }

        d += r * factor;
    }

    public double distance(Graficos g) {
        return Math.hypot(pX - g.pX, pY - g.pY);
    }

    public boolean checkColision(Graficos g) {
        return (distance(g) < radius + g.radius);
    }
}
