

public class Area {
    public static void main(String[] args){
        int length=5;
        int width=3;
        int area=length*width;
        System.out.println("length: " +length);
        System.out.println("width: " +width);
        System.out.println("Area"+area);
        // small to large type casting (widening)
        int x=10;
        double y=x;
        System.out.println(y);
        // large to small type casting (narrowing)
        double a=5.5;
        int b=(int)a;
        System.out.println(b);

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());
    }
    
}
