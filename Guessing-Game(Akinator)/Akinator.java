/*What is a Guessing Game(AKinator)?*/
/*This program consists of Guessing Game like Akinator where in the pro.*/



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Akinator {

        public static void main(String...args){
            boolean y = true;
            boolean n = false;

            HashMap c1 = new HashMap();c1.put("name","Iron man");c1.put("human",y);c1.put("youtuber",n);c1.put("movie", y);c1.put("original",n);c1.put("inventor",y);c1.put("indian",n);
            HashMap c2 = new HashMap();c2.put("name","Einstein");c2.put("human",y);c2.put("youtuber",n);c2.put("movie",n);c2.put("original",y);c2.put("inventor",y);c2.put("indian",n);
            HashMap c3 = new HashMap();c3.put("name","Carry Minati");c3.put("human",y);c3.put("youtuber",y);c3.put("movie",n);c3.put("original",y);c3.put("inventor",n);c3.put("indian",y);
            HashMap c4 = new HashMap();c4.put("name","PewDiePie");c4.put("human",y);c4.put("youtuber",y);c4.put("movie",n);c4.put("original",y);c4.put("inventor",n);c4.put("indian",n);
            HashMap c5 = new HashMap();c5.put("name","Nemo");c5.put("human",n);c5.put("youtuber",n);c5.put("movie",y);c5.put("original",n);c5.put("inventor",n);c5.put("indian",n);
            HashMap c6 = new HashMap();c6.put("name","Narendra modi");c6.put("human",y);c6.put("youtuber",n);c6.put("movie",n);c6.put("original",y);c6.put("inventor",n);c6.put("indian",y);
            ArrayList database = new ArrayList();
            database.add(c1);database.add(c2);database.add(c3);database.add(c4);database.add(c5);database.add(c6);

            Scanner sc = new Scanner(System.in);

            System.out.println("is your character human");
            take_input(sc.nextInt(), "human", database);

            System.out.println("is your character youtuber");
            take_input(sc.nextInt(),"youtuber",database);

            System.out.println("is your character in a movie");
            take_input(sc.nextInt(),"movie",database);

            System.out.println("is your character original");
            take_input(sc.nextInt(),"original",database);

            System.out.println("is your character inventor");
            take_input(sc.nextInt(),"inventor",database);

            System.out.println("is your character indian");
            take_input(sc.nextInt(),"indian",database);
        }

        public static void take_input(int answer, String property, ArrayList database){
            boolean ans;
            if ( answer == 1){
                ans = true;
            }
            else{
                ans = false;
            }
            ArrayList to_remove = new ArrayList();
            for (Object d: database){
                HashMap character = (HashMap) d;
                boolean prop = (boolean)character.get(property);
                if (prop != ans){
                        to_remove.add(character);
                }

            }
            for (Object ch: to_remove){
                database.remove(ch);
            }
            if (database.size() == 1){

                HashMap character = (HashMap)database.get(0);
                String name = (String)character.get("name");
                System.out.println("your character is "+name);
                System.exit(0);
            }


        }
}
