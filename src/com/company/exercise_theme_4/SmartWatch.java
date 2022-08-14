package com.company.exercise_theme_4;

public class SmartWatch extends SmartDevice{

    boolean speaker;
    boolean compass;
    boolean accelerometer;
    boolean gyroscope;
    boolean pulsometer;

    SmartWatch(){
        super();
    }

    public SmartWatch(double in, int ram, int mAh, boolean tactile, boolean stereoPort, boolean stereoSpeakers, boolean waterProtection, boolean fingerprintReader, boolean bluetooth, boolean GPS, boolean speaker, boolean compass, boolean accelerometer, boolean gyroscope, boolean pulsometer) {
        super(in, ram, mAh, tactile, stereoPort, stereoSpeakers, waterProtection, fingerprintReader, bluetooth, GPS);
        this.speaker = speaker;
        this.compass = compass;
        this.accelerometer = accelerometer;
        this.gyroscope = gyroscope;
        this.pulsometer = pulsometer;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "speaker=" + speaker +
                ", compass=" + compass +
                ", accelerometer=" + accelerometer +
                ", gyroscope=" + gyroscope +
                ", pulsometer=" + pulsometer +
                ", in=" + in +
                ", ram=" + ram +
                ", mAh=" + mAh +
                ", tactile=" + tactile +
                ", stereoPort=" + stereoPort +
                ", stereoSpeakers=" + stereoSpeakers +
                ", waterProtection=" + waterProtection +
                ", fingerprintReader=" + fingerprintReader +
                ", bluetooth=" + bluetooth +
                ", GPS=" + GPS +
                '}';
    }
}
