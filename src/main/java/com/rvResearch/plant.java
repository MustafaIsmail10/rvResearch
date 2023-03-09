package com.rvResearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class plant {
    boolean alive;
    List<String> colors; 

    public plant() {
        this.alive = true;
    }

    public boolean isAlive() {
        return alive;
    }

    public void kill() {
        this.alive = false;
        colors = new ArrayList<String>(Arrays.asList("gray"));
    }
}
