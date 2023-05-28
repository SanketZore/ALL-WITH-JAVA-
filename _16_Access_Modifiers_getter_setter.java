
import java.util.Random;
import java.util.Scanner;




    class myEmployee{
        private int id;
        private String name;


        public void setName(String n){
            name=n;
        }
        public String getName(){
            return name;
        }
        public void setId(int i){
            this.id=i;
        }
        public int getId(){
            return id;
        }

    }


    class Circle{
        private float radius;
        public void setarea(float r){
             radius=2*3.14f*r;
        }
        public float getarea(){
            return radius;
        }
        public float getPerimeter(){
            return 3.14f*radius*2;
        }
    }


    class rockPaperScissor{

       Scanner sc=new Scanner(System.in);
       Random random=new Random();
       
        public void game(){

            System.out.println("1 for Scissor; 2 for Paper; 3 for Rock");
            System.out.print("Select Item: ");
            int user=sc.nextInt();
            
            int comp=random.nextInt(1,4);
            System.out.println("Computer Choose: "+comp);
            System.out.println("You Choose: "+user);

            if(comp==user){
                System.out.print("Draw");
            }else if((comp==1&&user==2) || (comp==2&&user==3) || (comp==3&&user==1)){
                System.out.println("Computer Win!");
            }else{
                System.out.println("You Win!");
            }
        }
    }




public class _16_Access_Modifiers_getter_setter {
    
    public static void main(String[] args) {



/*
ACCESS MODIFIERS
Specifier where a property/method is accessible
There are four types of access modifiers in java:
1. Private
2. Default
3. Protected
4. Public

GETTERS AND SETTERS
Getter ---> Returns the value       [accessors]
GSetter ---> Sets/Update the value  [mutators]


Ex:
 */


// myEmployee sanket=new myEmployee();
// sanket.id=564;
// sanket.name="sanket zore";   //--->Throws an error due to private eccess modiefier.

// sanket.setName("sanket zore is as Strong as goku");
// System.out.println(sanket.getName());
// sanket.setId(56);
// System.out.println(sanket.getId());


// Circle shape=new Circle();
// shape.setarea(35);
// System.out.println("Area of Circle is "+shape.getarea());
// System.out.println("Perimeter of Circle is "+shape.getPerimeter());


rockPaperScissor game=new rockPaperScissor();
game.game();


    }
}
