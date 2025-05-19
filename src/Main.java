import ucn.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Day 1 of Advent Of Code 2024!!!\n");

        //first of all, we read the txt with all the inputs of both lists.
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        readTxt(leftList, rightList);

        Collections.sort(leftList);
        Collections.sort(rightList);

        //now we get the distant between both list.
        //ArrayList distantList = new ArrayList<Integer>();
        StdOut.println("The final distance between both lists is: " + distance(leftList, rightList));

    }

    private static int distance(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {

        int distance = 0;

        for (int i = 0; i < leftList.size(); i++) {
            distance += Math.abs(leftList.get(i) - rightList.get(i));
        }

        return distance;
    }


    public static void readTxt(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {

        In inputLine = new In("input.txt");
        int i = 0;

        while (!inputLine.isEmpty()) {
            String line = inputLine.readLine().trim();
            leftList.add(Integer.valueOf(line.substring(0, 5)));
            rightList.add(Integer.valueOf(line.substring(8)));
            i++;
        }
    }

}