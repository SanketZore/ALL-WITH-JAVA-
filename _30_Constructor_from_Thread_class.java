

/*
THE THREAD CLASS
Below are the commonly used constructors of thread class.

1) Thread()
2) Thread(String name)
3) Thread (Runnable r)
4) Thread (Runnable r, String name)

 */





class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        
        System.out.println("Thank You!");
        
        // while(i<34){
        //     System.out.println("I am a Thread");
        // }
    }
}



public class _30_Constructor_from_Thread_class {
    public static void main(String[] args) {
        MyThr t=new MyThr("Sanket");
        MyThr t1=new MyThr("Rohit");
        t.start();
        System.out.println("The id of the Thread t is "+t.getId());
        System.out.println("The id of the Thread t is "+t.getName());
        System.out.println("The id of the Thread t is "+t.hashCode());
        System.out.println("**********************************");
        System.out.println("The id of the Thread t is "+t1.getId());
        System.out.println("The id of the Thread t is "+t1.getName());
        System.out.println("The id of the Thread t is "+t1.hashCode());
    }
}
