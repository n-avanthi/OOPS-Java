package Worksheet_2;
class Volume{
    double length, breadth, height;

    Volume(double box_length, double box_breadth, double box_height) {
        this.length = box_length;
        this.breadth = box_breadth;
        this.height = box_height;
        //this points to class parameters
    }

    double box_volume(){
        double volume = this.length * this.breadth * this.height;
        return volume;
    }
}

public class VolumeBox {
    public static void main(String[] args) {
        Volume obj1 = new Volume(5.0, 3.0, 2.0);
        double volume = obj1.box_volume();
        System.out.println("Volume of the box: " + volume);
    }
}
