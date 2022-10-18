import java.util.*;

public class rps_Game {
    public static void main(String[] args){
            try(Scanner sc= new Scanner(System.in)){
                Random random = new Random();
                System.out.println("HEY! Lets play Rock Paper Scissor");
                int count_player = 0;
                int count_computer = 0;
                for(;;){
                    System.out.println("Enter \n 1 for rock \n 2 for Paper \n 3 for Scissors \n To exit enter 0");
                    int player = sc.nextInt();
                    int n = random.nextInt(3)+1;
                    if(player!=0){
                        switch(player){
                            case 1:
                            if(n==1) System.out.println("Rock \n Draw");
                            else if(n==2){
                                count_computer++;
                                System.out.println("Paper \n I win");
                            }
                            else {
                                count_player++;
                                System.out.println("Scissor \n You win");
                            }
                            break;
                            case 2:
                            if(n==1) {
                                count_player++;
                                System.out.println("Rock \n You win");
                            }
                            else if(n==2) System.out.println("Paper \n Draw");
                            else {
                                count_computer++;
                                System.out.println("Scissor \n I win");
                            }
                            break;
                            case 3:
                            if(n==1) {
                                count_computer++;
                                System.out.println("Rock \n I win");
                            }
                            else if(n==2) {
                                count_player++;
                                System.out.println("Paper \n You win");
                            }
                            else System.out.println("Scissor \n Draw");
                            break;
                    }
                        System.out.printf("Score \n Your: %d \n My: %d \n",count_player,count_computer);
                    }
                    else{
                        System.out.println("Thanks for playing");
                        break;
                    }
                }
    }

    }
}
