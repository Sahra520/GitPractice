package day38_Inheritance_MethodOverriding.shape;

public class Square extends Shape{

    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    public void area(){
        System.out.println(side * side);
    }

    public void perimeter(){
        System.out.println(side * 4);
    }

    public String toString() {
        return "Square{" +
                " name='" + name + '\'' +
                ", side=" + side +
                '}';
    }
}
/*
   Square subclass:
   side
   toString(): name, side, area, perimeter
 */