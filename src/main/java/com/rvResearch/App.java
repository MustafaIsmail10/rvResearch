package com.rvResearch;

import java.util.Collection;
import java.util.StringTokenizer;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App {

    int counter;

    public static void main(String[] args) {
        System.out.printf("Hello World! %d", add(4, 5));
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public App() {
        counter = 5;
    }

    public int incCounter() {
        counter++;
        return counter;
    }

    public int decCounter(){
        counter--;
        return counter;
    }

    public int tokin() {
        StringTokenizer st = new StringTokenizer("this is a test");
        Object token2 = st.nextElement();
        String token3 = st.nextToken();
        if (st.hasMoreTokens()) {
            token3 += st.nextToken();
        }
        System.out.println(token3);
        return 1;
    }

    public int count(Collection<String> collection) {
        int count = 0;
        for (String element : collection) {
            count++;
        }
        return count;
    }

    public int sumIterator() {
        List<Integer> l = new ArrayList<Integer>(Arrays.asList(0, 5, 2, 3));
        int sum = 0;
        Iterator<Integer> iter = l.iterator();
        iter.next();
        while (iter.hasNext()) {
            sum += iter.next();
        }
        return sum;
    }

}
