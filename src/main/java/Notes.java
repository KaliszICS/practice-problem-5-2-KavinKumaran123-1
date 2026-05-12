
class Notes {
	public static void main(String[] args) {

		Sphere r = new Sphere(2, 4, 5);
		System.out.println(r.getLength());
		System.out.println(r.getThisLength());
		System.out.println(r.getSuperLength());


		Rectangle rectangle = new Rectangle(0, 0);
		Sphere rectPrism = new Sphere(2, 2, 2);

		System.out.println(rectangle.area());
		System.out.println(rectPrism.area());
	}
}
