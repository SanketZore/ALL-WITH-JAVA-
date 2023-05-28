





class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        // int i=34;
        System.out.println("Thank You "+this.getName());
        
        while(true){
            System.out.println("Thank You "+this.getName());
        }
    }
}




public class _31_Java_Thread_Priorities {
    public static void main(String[] args) {

        // Ready Queue: t1,t2,t3,t4,t5.
        MyThr t1=new MyThr("Sanket1");
        MyThr t2=new MyThr("Sanket2");
        MyThr t3=new MyThr("Sanket3");
        MyThr t4=new MyThr("Sanket4");
        MyThr t5=new MyThr("Sanket5 - Most Important");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
    
}
