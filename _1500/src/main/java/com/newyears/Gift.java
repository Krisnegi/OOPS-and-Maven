package com.newyears;
import java.util.ArrayList;

public class Gift {
    ArrayList<Sweets> sweetsList=new ArrayList<Sweets>();
    String message;
    int totalWeight;
    public Gift(){}
    public Gift(ArrayList<Sweets> sweetsList,String message) {
        this.sweetsList = sweetsList;
        this.message=message;
    }
    public int find_totalWeight()
    {
        for(Sweets s:sweetsList)
        {
            totalWeight+=s.weight;
        }
        return totalWeight;
    }
}
