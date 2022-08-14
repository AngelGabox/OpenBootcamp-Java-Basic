package com.company.exercise_theme_4;

public class SmartPhone extends SmartDevice{

    protected String typeUSB;
    protected int numberCameras;
    protected boolean frontCamera;
    protected int pixelsCamera;
    protected boolean flash;

    public SmartPhone(){
        super();
    }

    public SmartPhone(double in, int ram, int mAh, boolean tactile, boolean stereoPort, boolean stereoSpeakers, boolean waterProtection, boolean fingerprintReader, boolean bluetooth, String typeUSB, int numberCameras, boolean frontCamera, int pixelsCamera, boolean flash, boolean GPS) {
        super(in, ram, mAh, tactile, stereoPort, stereoSpeakers, waterProtection, fingerprintReader, bluetooth, GPS);
        this.typeUSB = typeUSB;
        this.numberCameras = numberCameras;
        this.frontCamera = frontCamera;
        this.pixelsCamera = pixelsCamera;
        this.flash = flash;
    }
}
