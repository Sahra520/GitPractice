package day39_Recap.shapeTask;

public class Shape {
/*
Shape:
variables:
name
Encapsulate the field
Add a constructor to set the field
area(){}
perimeter(){}
 */

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1);//something went wrong
        }

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }


    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

}

/*
Square extends Shape:
variables:
side;

Encapsulate the field

Add a constructor to set the field
area():side*side
perimeter():side*4
toString():side, area, perimeter
 */

/*
Rectangle extends Shape:
variables:
length,
width
Encapsulate the field

Add a constructor to set the field
area():length*width
perimeter():2*(length+width)
toString():side, area, perimeter
 */