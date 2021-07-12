
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
public void main() throws InterruptedException {
    
      boolean merit1 = false; //ballet power
      boolean sword = false; //ultimate sword
      int atk = 5;
      int def = 5;
      int dext = 5;
      int speed = 5;     
      int mchp = 40;
      
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
            System.out.println("Note: You have earned the ballet merit. This may help you in the future.");
            System.out.println("You then proceed to go right.");
            merit1 = true;
            
            
            
            
            
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




switch(Crossroad){
    
    
    
case"1":
    System.out.println("I thought I told you, Right is always the right way. You dash towards the left side hoping to escape the worm");
    System.out.println("Sadly, you reach a dead end, the worm opens its mouth wide and...");
    System.out.println("The End.");
    return;
    
    
    
case"2":
    System.out.println("The worm follows you and you reach the staircase leading to the second level of the dungeon.");
    System.out.println("At the same time, the worm roars and charges towards you, giving you a clear view of its soft spot.");
    System.out.println("If you want to attack the worm's soft spot press 1, press 2 to go to the second level of the dungeon.");
    String dawg = sc.nextLine(); 
    
    
    
    
    
    if(dawg.equals("1")){
    System.out.println("You charge towards the worm and slash your sword in its weak spot. You unleash carnage in the chink of its armour.");
    System.out.println("As the worm dies, it coughs out a gem. You pick up the gem and look at it.");
    System.out.println("Press 1 to fuse it with your sword");   
    
    
    
    String fusion = sc.nextLine();
    if(fusion.equals("1")){
        System.out.println("Your sword flies out of your hand and glows with a bright light.");
        System.out.println("You have earned the merit upgrade");
        sword = true;
        System.out.println("You then enter the second level of the Dungeon.");
        break;
        
    
    }
    else{System.out.println("Why can't you just press the correct buttons? Game Over!");
    return;}
}




  else if(dawg.equals("2")){
    System.out.println("Fleeing was smart. Better not to risk your life");
    System.out.println("You have now entered Dungeon level Two!");
    sword= false;
        }  
        
        
        break;
    default:
    System.out.println("You presses the wrong button. Code will be terminated.");
    return;
}







System.out.println('\u000C');
System.out.println("Welcome to Dungeon level 2");
System.out.println("You found the game hard so far? The game is just about to get harder.");
System.out.println("You look around and see three directions.");
System.out.println("Press 1 to go left, Press 2 to go right and Press 3 to go forward.");
String CR = sc.nextLine();





if(CR.equals("1")){
System.out.println("Thought you would have learnt by now. Left is not the way to go. Thankfully, this time left is not that lethal.");
System.out.println("You just have to fight a Rock monster.");
System.out.println("You raise your sword and charge towards the rock monster");





if(sword == false){
    
    
    
System.out.println("You rush forward with incredible speed and dodge the oncoming assault of rocks.");
System.out.println("You bring your sword down with all your strength, and as it touches the hard skin of the rock monster, it shatters completely");
System.out.println("Weaponless, you have no hope and as the rock monster approaches you, you know you have reached");
System.out.println("The End");
return;


}
else if(sword == true){
    
    
    
System.out.println("You rush forward with incredible speed and dodge the oncoming assault of rocks.");
System.out.println("You bring your sword down with all your strength, and as it touches the hard skin of the rock monster, it momentarily glows");
System.out.println("Then it penetrates the hard rock shell of the monster and you emerge victorious");



}

}
else if(CR.equals("2")){
System.out.println("So, you choose right, huh? Well, you come across a big monster which seems stronger than you. It seems like bad news");
System.out.println("But, you see, the monster likes dancing and challenges you to a dance off.");
System.out.println("If you outdance the monster, it will let you pass, but if it does not like your dancing, a roasted " + name + " sounds tasty");

if(merit1 == true){
    
    
    System.out.println("'Ha! I'm a master at ballet!' you say and show off your moves. The monster falls in love with your moves");
    System.out.println("'Wow! What Grace!' The monster exclaims. Never have I seen a better dancer, it says wiping a tear.");
    System.out.println("The monster allows you to pass, and begins trying to imitate your moves. You always knew ballet was cool.");
    
    
    }
else if(merit1 == false){
    
    
    
    System.out.println("'Dance?' you ask again. You know nothing about dancing. You are a warrior.");
    System.out.println("'I can't dance mister monster' you say.");
    System.out.println("...And then you are made into a " + name + "-kebab");
    System.out.println("Moral: You should practice dancing.");
    System.out.println("The End");
    return;
    

}




}
else if(CR.equals("3")){
System.out.println("So, you decide to go straight?");
System.out.println("The journey is uneventful. You find no monsters.");

} 
System.out.println("You enter a huge hall. In the middle sits an old woman. \n You walk towards the woman.");
System.out.println("'Come closer " + name + ". I have been watching you.'");
System.out.println("'How do you know my name?' you ask intrigued. \n 'I know many things. I know more about you, than you do yourself'");
System.out.println("'I'm not sure I follow.' you say.");
System.out.println( "Press 1 to continue the conversation.");
String convo = sc.nextLine();
if(convo.equals("1")){
System.out.println("'Why are you here " + name +".' ");
}
else{System.out.println("You have reached so far, to think a stupid spelling mistake will be the end of this game. Oh well.");
    return;}
    System.out.println("'I- I don't remember!' you say realising, you don't know the aim of this missiom.");
    System.out.println("'Why am I here?' you say unsure of everything. \n The woman chuckles and says 'In time great hero, in time.'");
    System.out.println("'Right now you must learn about battles.' \n 'Ya, I have battled a few monsters.' you say innocently.");
    System.out.println("Not those kind of battles! From now on you will have stats which will help you in life threatening situations");
    System.out.println("Attack for the damage you inflict upont the enemy.");
    System.out.println
    System.out.println
    
}
}




    
    









