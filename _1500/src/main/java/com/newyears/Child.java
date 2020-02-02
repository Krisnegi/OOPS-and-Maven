package com.newyears;
import java.util.ArrayList;

public class Child {
    String name;
    int age;
    ArrayList<Gift> gifts=new ArrayList<Gift>();
    public Child(){}
    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void give_gift(Gift gift,Child c)
    {
        c.take_gift(gift);
    }
    public void take_gift(Gift gift)
    {
        gifts.add(gift);
    }
    public void show_gifts()
    {
        System.out.println(this.name+":");
        for(Gift g:gifts)
        {
            System.out.println(g.sweetsList+" Total Weight="+g.find_totalWeight()+"g Message="+g.message);
        }
    }
}
