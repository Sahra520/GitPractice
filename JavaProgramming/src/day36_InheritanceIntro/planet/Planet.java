package day36_InheritanceIntro.planet;

public class Planet {

    public String name;
    public String mass;
    public double radius;
    public String surfaceGravity;
    public double surfaceArea;
    public String volume;
    public long population;

    public Planet(String name, String mass, double radius, String surfaceGravity,
                  double surfaceArea, String volume, long population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.surfaceArea = surfaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", radius=" + radius +
                ", surfaceGravity='" + surfaceGravity + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", volume='" + volume + '\'' +
                ", population=" + population +
                '}';
    }
}
/*
Planet Task:
1. create a class called Planet
variables:
name, mass, radius,
surfaceGravity, surfaceArea, volume, population
methods:
setInfo()
toString()

2. create the following subclasses of Planet
1. Earth
2. Moon
3. Mercury
4. Venus
Note: you can search them on Google


 */