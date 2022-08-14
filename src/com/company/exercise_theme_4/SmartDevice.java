package com.company.exercise_theme_4;

public abstract class SmartDevice {

    protected double in;
    protected int ram;
    protected int mAh;
    protected boolean tactile;
    protected boolean stereoPort;
    protected boolean stereoSpeakers;
    protected boolean waterProtection;
    protected boolean fingerprintReader;
    protected boolean bluetooth;

    protected boolean GPS;

    public SmartDevice(){
    }
    public SmartDevice(
            double in,
            int ram,
            int mAh,
            boolean tactile,
            boolean stereoPort,
            boolean stereoSpeakers,
            boolean waterProtection,
            boolean fingerprintReader,
            boolean bluetooth,
            boolean GPS
    )
    {
        this.in = in;
        this.ram = ram;
        this.mAh = mAh;
        this.tactile = tactile;
        this.stereoPort = stereoPort;
        this.stereoSpeakers = stereoSpeakers;
        this.waterProtection = waterProtection;
        this.fingerprintReader = fingerprintReader;
        this.bluetooth = bluetooth;
        this.GPS = GPS;
    }

}
