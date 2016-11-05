package org.KinectAnywhere.Recorder;

import org.OpenNI.SkeletonJoint;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class MySkeletonFrame implements Serializable{
    private HashMap<SkeletonJoint, MySkeletonJointPosition> skeleton;
    private Integer id;
    private Date date;

    public MySkeletonFrame(HashMap<SkeletonJoint, MySkeletonJointPosition> skeleton, Integer id) {
        this.skeleton = skeleton;
        this.id = id;
        this.date = new Date();
    }
}
