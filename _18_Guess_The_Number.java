
import java.util.Random;
import java.util.Scanner;


// class Game{
//     Scanner sc=new Scanner(System.in);
//     Random random=new Random();
//     int rand=random.nextInt(101);    // 101 will consider as 100 in case of bound.
    
//     public void game(int curr){
//         System.out.print("Guess The Number: ");
//         int User=sc.nextInt();
//             do{ 
//                 if(rand==User){
//                     System.out.println("You have Choosen the correct in "+curr+" chances.");break;
//                 }else if(rand>User){
//                     System.out.println("Select Greater Number.");
//                 }else{System.out.println("Select Smaller Number.");
//                 }curr++; 
//                 game(curr);
//             }while(rand==User);
//     } 
// }


class Game{


    private int number;
    private int inputnumber;
    private int noOfGuesses;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }

    Game(){
        Random rand=new Random();
        this.number=rand.nextInt(3);
    }
    int takeUserNumber(){
        System.out.println("Guess The Number.");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
        return inputnumber;

    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputnumber==number){
            System.out.format("Yes you Guesses it right, it was %d\n You Guessed it in %d attempts\n",number,noOfGuesses);
            return true;
        }else 
        if(inputnumber<number){System.out.println("Too Low...");}
        else if(inputnumber>number){System.out.println("Too High...");}
        return false;
    }

}




public class _18_Guess_The_Number {
    public static void main(String[] args) {

        // Game randGame=new Game();
        // randGame.game(1);
        
        
        Game g=new Game();
        boolean b=false;
        while(!b){
        g.takeUserNumber();
        b=g.isCorrectNumber();}


    }
    
}
