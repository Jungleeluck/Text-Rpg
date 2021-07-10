
/**
 * Write a description of class Rpg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Timer;

public class Rpg
{
public void main(){
    
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your name");
    String name = sc.nextLine();
    
    
    
    
    System.out.println("Welcome, "+ name + " You have been chosen for a perilous quest. This quest will require all you've got!");
    
    
    
    
    
    System.out.println ("Are you a boy or a girl?");
    
    
    String text = sc.nextLine();
     if (text.equals("boy")){
            System.out.println("You are a boy.");
        }
        else if(text.equals("girl")){
        
            System.out.println("You are a girl.");
        }
        else {System.out.println("Error! Check your spelling, or maybe you typed in upper case letters. Code will be terminated");
               return;
            

        
        }
  
    
    

    System.out.println("You enter a dungeon. You are on the first level of the dungeon.");
    System.out.println("You see two routes. Type 1 to go left and type 2 to go right.");
    
    
    
    String route = sc.nextLine();
    if(route.equals("1")){
        
        
        
        
        
        System.out.println("You go left. You walk ahead, clutching your sword tightly. You hear a noise in front and go ahead to investigate.");
        System.out.println("You reach a dead end. You think to yourself that you should have gone right instead.");
        System.out.println("when suddenly a giant spider appears in front of you.");
        System.out.println("Type 1 to attack it and type 2 to practice ballet.");
        String fight1 = sc.nextLine();
        
        
        
        
        
        
        
        if(fight1.equals("2")){
            
            
            
            
            
            
            System.out.println("You think showing off your ballet moves would impress the spider. You could not have been more wrong.");
            System.out.println("The spider lunges at you when you are doing a three sixty degrees spinning kick your teacher taught you.");
            System.out.println("Your leg finds its mark on the spider's face which was actually quite weak and the spider crumbles into dust.");
            System.out.println("You bow down after performing nicely and notice your audience has crumbled to dust, oh well!");
            System.out.println("You then proceed to go right.");
            
            
            
            
            
            
        }
       else if (fight1.equals("1")){
           
           
           
           System.out.println("Fighting is in your blood. You have to fight this monster!!"); 
           System.out.println("If you want to aim for the belly press 1, If you want to stab yourself press 2");
           String ladai = sc.nextLine();
           
           
           
           if(ladai.equals("1")){
               
               
               
               System.out.println("You rush towards the spider and jab your sword into it's belly. The spider shrieks out loudly before dying");
               System.out.println("Now, that you have reached a dead end, you decide to go right.");
               
               
               
            }
            else if(ladai.equals("2")){
                
                
                
           System.out.println("You smile. This will be a piece of cake. You raise your sword in order to stab te spider, but end up stabbing yourself");
            System.out.println("You stab yourself and die, but look on the bright side! The spider got a tasty meal!!");
            System.out.println("The End");
            return;      
            
            
            
            
            }
            else{System.out.println("That wasn't even an option! Code will be terminated");
            }
        
            
            
            
        
        }else {System.out.println("Error!Now u have to play the whole game again.");
            return;
    }
}



System.out.println("So, you are now moving right. A wise man once said Right is always the right direction!");
System.out.println("You keep moving ahead until...");
System.out.println("A giant worm tears the ground beneath you feet. You rush ahead and come to another crossing.");
System.out.println("Left or right, what will it be? Remeber the clock is ticking, if you don't make the choice fast enough, the worm will eat you");
System.out.println("Enter 1 for left and 2 for right!");
String Crossroad = sc.nextLine();
long start = System.currentTimeMillis();
long end = start + 20*1000;
while (System.currentTimeMillis() < end) {
    
if(Crossroad.equals("1")){
    
    System.out.println("Test");
    end = 0;
    break;
    


}
else if(Crossroad.equals("2")){
System.out.println("Test 2");
end=0;
break;

}

}
 if(start + 20*1000 == end)
 {
    System.out.println("You take too much time to decide.");
    System.out.println("The worm opens its mouth and traps you in it for the rest of your life, which honestly, isn't very long.");
    System.out.println("The End.");   
    return;

}
}
}

    
    
    








