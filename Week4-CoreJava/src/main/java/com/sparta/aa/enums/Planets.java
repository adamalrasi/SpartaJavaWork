package com.sparta.aa.enums;

public enum Planets {
    MERCURY("0.39", "0.33"),
    VENUS("0.72", "0.81"),
    EARTH("1", "1"),
    MARS("1.52", "0.11"),
    JUPITER("5.2", "317.8"),
    SATURN("9.54", "95.16"),
    URANUS("19.2", "14.54"),
    NEPTUNE("30.06", "17.1");

    private String distanceFromSun;
    private String mass;

    Planets(String distanceFromSun, String mass) {
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
    }

    public String getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(String distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public static void main(String[] args) {
        System.out.println(Planets.JUPITER);
        System.out.println(Planets.EARTH == Planets.EARTH);
        System.out.println(Planets.EARTH.equals(Planets.EARTH));
        System.out.println(Planets.MARS.ordinal());
    }
}
