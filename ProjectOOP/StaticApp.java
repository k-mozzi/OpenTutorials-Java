class Foo {
	public static String classVar = "I'm class var";
	public String instanceVar = "I'm instance var";

	public static void classMethod() {
		System.out.println(classVar); // OK
//		System.out.println(instanceVar); // Error
	}

	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(instanceVar); // OK
	}
}

public class StaticApp {

	public static void main(String[] args) {

		System.out.println(Foo.classVar); // OK
//		System.out.println(Foo.instanceVar); // Error
		Foo.classMethod();
//		Foo.instanceMethod(); // 인스턴스 소속이므로 클래스를 통해 접근하는 것은 불가능하다 

		Foo f1 = new Foo();
		Foo f2 = new Foo();

		System.out.println(f1.classVar); // I'm class var
		System.out.println(f1.instanceVar); // I'm instance var

		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); // changed by f1

		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I'm instance var

	}

}
