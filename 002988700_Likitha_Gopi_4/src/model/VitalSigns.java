/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Likitha G
 */
public class VitalSigns {


    private int rUB;
    private int rLB;
    private int hUB;
    private int hLB;
    private int bpUB;
    private int bpLB;
    private int wpUB;
    private int wpLB;

    public int getrUB() {
        return rUB;
    }

    public void setrUB(int rUB) {
        this.rUB = rUB;
    }

    public int getrLB() {
        return rLB;
    }

    public void setrLB(int rLB) {
        this.rLB = rLB;
    }

    public int gethUB() {
        return hUB;
    }

    public void sethUB(int hUB) {
        this.hUB = hUB;
    }

    public int gethLB() {
        return hLB;
    }

    public void sethLB(int hLB) {
        this.hLB = hLB;
    }

    public int getBpUB() {
        return bpUB;
    }

    public void setBpUB(int bpUB) {
        this.bpUB = bpUB;
    }

    public int getBpLB() {
        return bpLB;
    }

    public void setBpLB(int bpLB) {
        this.bpLB = bpLB;
    }

    public int getWpUB() {
        return wpUB;
    }

    public void setWpUB(int wpUB) {
        this.wpUB = wpUB;
    }

    public int getWpLB() {
        return wpLB;
    }

    public void setWpLB(int wpLB) {
        this.wpLB = wpLB;
    }

   

    public VitalSigns() {

    }
    public VitalSigns(String age) {

        if (age.equals("NEWBORN")) {
            this.rLB = 30;
            this.rUB = 50;
            this.hLB = 120;
            this.hUB = 160;
            this.bpLB = 50;
            this.bpUB = 70;
            this.wpLB = 4; // Change this to double
            this.wpUB = 7;
        } else if (age.equals("INFANT")) {
            this.rLB = 20;
            this.rUB= 30;
            this.hLB = 80;
            this.hUB = 140;
            this.bpLB = 70;
            this.bpUB = 100;
            this.wpLB = 9; // Change this to double
            this.wpUB = 22;
        } else if (age.equals("TODDLER")) {
            this.rLB = 20;
            this.rUB = 30;
            this.hLB = 80;
            this.hUB = 130;
            this.bpLB = 80;
            this.bpUB = 110;
            this.wpLB = 22; // Change this to double
            this.wpUB = 31;
        } else if (age.equals("PRESCHOOLER")) {
            this.rLB = 20;
            this.rUB = 30;
            this.hLB = 80;
            this.hUB = 120;
            this.bpLB = 80;
            this.bpUB = 110;
            this.wpLB = 31; // Change this to double
            this.wpUB = 40;
        } else if (age.equals("SCHOOLAGE")) {
            this.rLB = 20;
            this.rUB = 30;
            this.hLB = 70;
            this.hUB = 110;
            this.bpLB = 80;
            this.bpUB = 120;
            this.wpLB = 41; // Change this to double
            this.wpUB = 92;
        } else if (age.equals("ADOLESCENT")) {
            this.rLB = 12;
            this.rUB = 20;
            this.hLB = 55;
            this.hUB = 105;
            this.bpLB = 50;
            this.bpUB = 120;
            this.wpLB = 110; // Change this to double
            this.wpUB = Integer.MAX_VALUE;
        }
    }
    int RespiratoryRate;
    int HeartRate;
    int BloodPressure;
    int WeightPounds;

    public int getRespiratoryRate() {
        return RespiratoryRate;
    }

    public void setRespiratoryRate(int RespiratoryRate) {
        this.RespiratoryRate = RespiratoryRate;
    }

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public int getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(int BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public int getWeightPounds() {
        return WeightPounds;
    }

    public void setWeightPounds(int WeightPounds) {
        this.WeightPounds = WeightPounds;
    }



}