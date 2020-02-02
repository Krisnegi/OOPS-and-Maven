package com.newyears;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Child c1=new Child("Pam",12);
        Child c2=new Child("bob",14);
        Child c3=new Child("max",11);
        Sweets choco1=new Chocolate("Dairy Milk",20,60,10);
        Sweets choco2=new Chocolate("Bar One",30,70,20);
        Sweets cake1=new Cake("Blueberry Cake",100,300,100);
        Sweets cake2=new Cake("Vanilla Cake",150,200,100);
        Sweets candy1=new Candy("Gummy Bear",10,20,2);
        Sweets candy2=new Candy("Peanut m&m",10,25,3);
        ArrayList<Sweets> g1=new ArrayList<Sweets>();
        g1.add(choco1);
        g1.add(cake1);
        g1.add(candy2);
        ArrayList<Sweets> g2=new ArrayList<Sweets>();
        g2.add(choco2);
        g2.add(cake2);
        g2.add(candy1);
        ArrayList<Sweets> g3=new ArrayList<Sweets>();
        g3.add(cake1);
        g3.add(cake2);
        g3.add(candy1);
        Gift gift1=new Gift(g1,"With Love");
        Gift gift2=new Gift(g2,"With Warm Regards");
        Gift gift3=new Gift(g3,"Lots Of Hugs");
        c1.give_gift(gift1,c2);
        c2.give_gift(gift2,c1);
        c3.give_gift(gift3,c1);
        c1.give_gift(gift1,c3);
        c1.show_gifts();
        c2.show_gifts();
        c3.show_gifts();
    }
}
