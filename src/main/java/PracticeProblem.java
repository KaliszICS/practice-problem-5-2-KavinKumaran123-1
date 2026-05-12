// PracticeProblem.java
public class PracticeProblem {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 4);

        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());

        Sphere prism = new Sphere(5, 4, 3);

        System.out.println("RectPrism Surface Area: " + prism.area());
        System.out.println("RectPrism Volume: " + prism.volume());
    }
}