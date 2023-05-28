


/*
DEFAULT METHODS
An interface can have static and default methods.
Default methods enable us to add new functionality to exixting interfaces.
This feature was introduced in java-8 to ensure backward compatibility while updating an interface.
Classes implementing the interface need not implement the default methods.
Interface can also include private methods for default methods to use.
 */







interface myCamera{
    void takesnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void taking4Kvideo(){
        this.greet();
        System.out.println("Taking Video in 4K");
    }

}

class MycellPhone{

    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void callNumber(){
        System.out.println("Connecting... ");
    }

}

interface mywifi{
    String[] getNetwork();
    void connectToNetwork(String network);

}

class MySmartPhone extends MycellPhone implements mywifi,myCamera{
    
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    
    public String[] getNetwork(){
        System.out.println("Getting List of Networks");
        String[] networklist ={ "Sanket", "Omkar", "Meghana"};
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("Conneecting to "+network);
    }
    // public void taking4Kvideo(){
    //     System.out.println("Taking Video in 4K and Snap");
    // }
    
    
    

}



public class _25_JAVA_Interface_Example_and_Default_Method {
    public static void main(String[] args){
    MySmartPhone ms=new MySmartPhone();
    // ms.greet();       //<---- error greet is private.
    ms.taking4Kvideo();
    String[] ar=ms.getNetwork();

    for(String item: ar){
        System.out.println(item);
    }
}
}
