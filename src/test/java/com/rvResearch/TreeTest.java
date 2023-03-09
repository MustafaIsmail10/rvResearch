package com.rvResearch;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import java.util.StringTokenizer;

public class TreeTest {
    @Test
    public void statusTest() {
       PalmTree ptree = new PalmTree(); 
       ptree.kill();
       ptree.printColors();
       Assert.assertTrue(true);
    }

}
