public class create_constructor {

    public create_constructor(int a){ 
        System.out.println("This is a constructor." + "and the value is " +a);
    }
    
    
    public static void main(String[] args){
        create_constructor obj = new create_constructor(8);
    }
    
}
