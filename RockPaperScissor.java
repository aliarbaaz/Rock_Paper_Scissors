import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("|<<<<<<<<<< ROCK PAPER SCISSOR 🤘 >>>>>>>>>>|");
        int i = 0,user=-1,u=0,c=0;
        while (i < 3) {
            Random rand = new Random();
            int rnd = rand.nextInt(3);  // Generating random values from 0 to 2

            System.out.println("Enter: R for rock | P for paper | S for scissor");
            Scanner scan = new Scanner(System.in);
            char player = scan.next().charAt(0);
            // Initializing input char to 0,1,2
            if(player=='R')
                user=0;
            else if(player=='P')
                user=1;
            else if(player=='S')
                user=2;

//            rock=0
//            paper=1
//            scissor=2
            switch(rnd){
                // Printing Computer solution after user input
                case 0 -> System.out.println("Computer: R");
                case 1 -> System.out.println("Computer: P");
                case 2 -> System.out.println("Computer: S");
            }
//            System.out.println(user);
//            System.out.println(rnd);
            // Checking the conditions
            if(rnd==0 && user==1)
                u++;
            else if(rnd==0 && user==2)
                c++;
            else if(rnd==1 && user==0)
                c++;
            else if(rnd==1 && user==2)
                u++;
            else if(rnd==2 && user==0)
                u++;
            else if(rnd==2 && user==1)
                c++;

            i++;

        }
        System.out.printf("\nSCORES:");
        System.out.printf("Player: %d\tComputer: %d\n",u,c);
        if(u>c)
            System.out.println("YOU WIN! 🏆🏆🏆");
        else if(c>u)
            System.out.println("YOU LOSE! BETTER LUCK NEXT TIME 🙂🙂🙂");
        else
            System.out.println("DRAW! TRY AGAIN 🙄🙄🙄");

    
    }
}
