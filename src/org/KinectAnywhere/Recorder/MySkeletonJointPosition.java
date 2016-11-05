package org.KinectAnywhere.Recorder;

import java.io.Serializable;

public class MySkeletonJointPosition implements Serializable {
    private MyPoint3D position;
    private float confidence;

    public MySkeletonJointPosition(MyPoint3D var1, float var2) {
        this.position = var1;
        this.confidence = var2;
    }

    public MyPoint3D getPosition() {
        return this.position;
    }

    public float getConfidence() {
        return this.confidence;
    }
}
