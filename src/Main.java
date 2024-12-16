import ucn.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Day 1 of Avent Of Code 2024!!!\n");

        //Map<Integer, Integer> inputList = readTxt();


        //first of all, we read the txt with all the inputs of both lists.
        ArrayList leftList = new ArrayList<Integer>();
        ArrayList rightList = new ArrayList<Integer>();
        readTxt(leftList, rightList);

        //now we get the distant between both list.
        ArrayList distantList = new ArrayList<Integer>();
        getDistant(leftList, rightList);

    }

    private static void getDistant(ArrayList leftList, ArrayList rightList) {

        int i = 0;

        for (int j = 0; j < 5; j++) {

        }

    }

    public static void readTxt(ArrayList leftList, ArrayList rightList) {

        In inputLine = new In("input.txt");
        int i = 0;

        while (!inputLine.isEmpty()) {
            String line = inputLine.readLine().trim();
            leftList.set(i, Integer.parseInt(line.substring(0, 5)));
            rightList.set(i, Integer.parseInt(line.substring(8)));
        }
    }

}