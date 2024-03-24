import javax.swing.*;
import java.util.*;
public class H3 {
    public static void main(String[]agrs ){
        char words[][]=new char[8][10];
        String American ="American";
        String English ="English";
        String China ="China";
        String Japan ="Japan";
        String Italy ="Italy";
        String France ="France";
        String Canada ="Canada";
        words[1]=American.toCharArray();
        words[2]=English.toCharArray();
        words[3]=China.toCharArray();
        words[4]=Japan.toCharArray();
        words[5]=Italy.toCharArray();
        words[6]=France.toCharArray();
        words[7]=Canada.toCharArray();;
        int a=0;
        Random rand = new Random();
        a = rand.nextInt(7)+1;
        char word[]=new char[10];
        for(int i=0;i<words[a].length;i++) {
            word[i] ='_';
            System.out.print(words[a][i]);
        }
        System.out.print("The first letter of this word is "+words[a][0]+"\n");
        int chances=words[a].length+2;
        while (chances!=0){
            switch (chances){
                case 1:
                    System.out.print("\n                                     -------------------|\n" +
                            "                                     |                  |\n"+
                            "                                   ('-’)                |\n"+
                            "                                 ---| |---              |\n"+
                            "                                    | |                 |\n"+
                            "                                    | |                 |\n"+
                            "                                   // \\\\                |\n"+
                            "                                  //   \\\\               |\n"+
                            "                                                        |\n"+
                            "                                                       /|\n"+
                            "                                                      / |\n"+
                            "                                                     /  |\n"+
                            "                                                    /   |\n"+
                            "                                                   /    |\n"+
                            "                                  -----------------------------------------------\n");
                    break;
                case 2:
                    System.out.print("\n                                     -------------------|\n" +
                            "                                     |                  |\n"+
                            "                                   ('-’)                |\n"+
                            "                                 ---| |---              |\n"+
                            "                                    | |                 |\n"+
                            "                                    | |                 |\n"+
                            "                                   //                   |\n"+
                            "                                  //                    |\n"+
                            "                                                        |\n"+
                            "                                                       /|\n"+
                            "                                                      / |\n"+
                            "                                                     /  |\n"+
                            "                                                    /   |\n"+
                            "                                                   /    |\n"+
                            "                                  -----------------------------------------------\n");
                    break;
                case 3:
                    System.out.print("\n                                     -------------------|\n" +
                            "                                     |                  |\n"+
                            "                                   ('-’)                |\n"+
                            "                                 ---| |---              |\n"+
                            "                                    | |                 |\n"+
                            "                                    | |                 |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                       /|\n"+
                            "                                                      / |\n"+
                            "                                                     /  |\n"+
                            "                                                    /   |\n"+
                            "                                                   /    |\n"+
                            "                                  -----------------------------------------------\n");
                    break;
                case 4:
                    System.out.print("\n                                     -------------------|\n" +
                            "                                     |                  |\n"+
                            "                                   ('-’)                |\n"+
                            "                                 ---| |                 |\n"+
                            "                                    | |                 |\n"+
                            "                                    | |                 |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                       /|\n"+
                            "                                                      / |\n"+
                            "                                                     /  |\n"+
                            "                                                    /   |\n"+
                            "                                                   /    |\n"+
                            "                                  -----------------------------------------------\n");
                    break;
                case 5:
                    System.out.print("\n                                     -------------------|\n" +
                            "                                     |                  |\n"+
                            "                                   ('-’)                |\n"+
                            "                                    | |                 |\n"+
                            "                                    | |                 |\n"+
                            "                                    | |                 |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                       /|\n"+
                            "                                                      / |\n"+
                            "                                                     /  |\n"+
                            "                                                    /   |\n"+
                            "                                                   /    |\n"+
                            "                                  -----------------------------------------------\n");
                    break;
                case 6:
                    System.out.print("\n                                     -------------------|\n" +
                            "                                     |                  |\n"+
                            "                                   ('-’)                |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                        |\n"+
                            "                                                       /|\n"+
                            "                                                      / |\n"+
                            "                                                     /  |\n"+
                            "                                                    /   |\n"+
                            "                                                   /    |\n"+
                            "                                  -----------------------------------------------\n");
                    break;
                case 7:
                case 8:
                case 9:        System.out.print("\n                                     -------------------|\n" +
                        "                                     |                  |\n"+
                        "                                                        |\n"+
                        "                                                        |\n"+
                        "                                                        |\n"+
                        "                                                        |\n"+
                        "                                                        |\n"+
                        "                                                        |\n"+
                        "                                                        |\n"+
                        "                                                       /|\n"+
                        "                                                      / |\n"+
                        "                                                     /  |\n"+
                        "                                                    /   |\n"+
                        "                                                   /    |\n"+
                        "                                  -----------------------------------------------\n");
                break;
            }
            int c=0;
            Scanner Word=new Scanner(System.in);
            char word_first_input=Word.next().charAt(0);
            for (int i = 0; i < 50; ++i){
                System.out.println();
            }
            for(int loop=0;loop<words[a].length;loop++) {
                if (word_first_input == words[a][loop]) {
                    word[loop]=words[a][loop];
                }
                System.out.print(word[loop]);
            }

            for(int loop=0;loop<words[a].length;loop++) {
                if (word[loop] != words[a][loop]) {
                    c++;
                    }
                }
            if (c==0){
                System.out.print("you are good");
                return;
            }
            chances--;
        }


            System.out.print("The true answer is ");
        for(int i=0;i<words[a].length;i++){
            System.out.print(words[a][i]);
        }


    }
}

