

class MyThreadRunnable1 implements Runnable{
    public void run(){
        // int i=0;
        while(true){
            System.out.println("I am a Thread1 not a Threat 1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        // int i=0;
        while(true){
        System.out.println("I am a Thread 2");
        }
    }
}







public class _28_Creating_Java_Thread_using_Runnable_Interface {
    public static void main(String[] args) {

        MyThreadRunnable1 bullet1=new MyThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        MyThreadRunnable2 bullet2=new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
        
    }
}
