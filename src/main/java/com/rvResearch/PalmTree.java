package com.rvResearch;
import java.util.*;


public class PalmTree extends Tree{


    public PalmTree(){
        colors = new ArrayList<String>(Arrays.asList("green", "brown", "yellow")); 
    }

    public void printColors(){
        Iterator<String> c = colors.iterator();
        
        if (this.alive){
            while(c.hasNext()){
                System.out.println(c.next());
            }
        }else {
            System.out.println(c.next());
        }
    }
}
