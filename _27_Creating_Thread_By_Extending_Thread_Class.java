

class MyThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<500){            System.out.println("I am Chatting With Omkar.");
            System.out.println("I am Happy");
            i++;
        }
    }
}


class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("I am Cooking.");
            System.out.println("I am Sad");
            i++;
        }
    }
}




public class _27_Creating_Thread_By_Extending_Thread_Class {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
        
    }
}
