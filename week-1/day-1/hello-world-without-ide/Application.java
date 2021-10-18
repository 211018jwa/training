public class Application {

    // The main method is a special method that instructs the JVM
    // Where to begin executing
    public static void main(String[] args) {
        System.out.println("Hello World!");
        myOwnMethod(); // I am invoking the method myOwnMethod()
	    System.out.println("Here is code that " + "I am writing with notepad");
        System.out.println("End of main method");
    }

    public static void myOwnMethod() {
        System.out.println("myOwnMethod executing()");
    }

}