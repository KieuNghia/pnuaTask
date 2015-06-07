package com.epam.kiieu.objects;

/**
 * Created by nghia on 07.06.2015.
 */
public class MicroOven {

    public String type;
    public String volume;
    public String innerCoating;
    public String power;

    public MicroOven(String type, String volume, String innerCoating, String power) {
        this.type = type;
        this.volume = volume;
        this.innerCoating = innerCoating;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getInnerCoating() {
        return innerCoating;
    }

    public void setInnerCoating(String innerCoating) {
        this.innerCoating = innerCoating;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
