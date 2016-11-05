package org.KinectAnywhere.Recorder;

import java.io.Serializable;

public class MyPoint3D implements Serializable {
    private float X;
    private float Y;
    private float Z;

    public MyPoint3D(float var1, float var2, float var3) {
        this.X = var1;
        this.Y = var2;
        this.Z = var3;
    }

    public MyPoint3D() {
        this(0.0F, 0.0F, 0.0F);
    }

    public void setPoint(float var1, float var2, float var3) {
        this.X = var1;
        this.Y = var2;
        this.Z = var3;
    }

    public float getX() {
        return this.X;
    }

    public float getY() {
        return this.Y;
    }

    public float getZ() {
        return this.Z;
    }
}
