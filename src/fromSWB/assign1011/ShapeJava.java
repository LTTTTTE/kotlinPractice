package fromSWB.assign1011;

interface ShapeInterfaceJava{
    double size();
}

class TriangleJava implements ShapeInterfaceJava {
    private double base;
    private double height;

    public TriangleJava(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double size() {
        return 0.5 * base * height;
    }
}

class CircleJava implements ShapeInterfaceJava{
    private double radius;

    public CircleJava(double radius) {
        this.radius = radius;
    }

    @Override
    public double size() {
        return radius * radius * 3.141692;
    }
}

class RectangleJava implements ShapeInterfaceJava{
    private double base;
    private double height;

    public RectangleJava(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double size() {
        return base * height;
    }
}


public class ShapeJava {
    public static void main(String[] args) {
        ShapeInterfaceJava shape1 = new CircleJava(5.5);
        ShapeInterfaceJava shape2 = new TriangleJava(7.3,  9.1);
        ShapeInterfaceJava shape3 = new RectangleJava(8.8, 2.6);

        System.out.println(shape1.size());
        System.out.println(shape2.size());
        System.out.println(shape3.size());
    }
}
