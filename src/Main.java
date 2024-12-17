import ucn.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Day 1 of Advent Of Code 2024!!!\n");

        //first of all, we read the txt with all the inputs of both lists.
        ArrayList<String> leftList = new ArrayList<>();
        ArrayList<String> rightList = new ArrayList<>();
        readTxt(leftList, rightList);

        //now we get the distant between both list.
        //ArrayList distantList = new ArrayList<Integer>();
        StdOut.println("The final distance between both lists is: " + getDistant(leftList, rightList));

    }

    private static int getDistant(ArrayList<String> leftList, ArrayList<String> rightList) {

        int distance = 0;

        for (int i = 0; i < leftList.size(); i++) {

            String leftNumber = leftList.get(i);
            String rightNumber = rightList.get(i);

            //System.out.println(leftNumber);
            //System.out.println(rightNumber);

            List<Integer> leftNum = new ArrayList<>();
            List<Integer> rightNum = new ArrayList<>();

            for (char c: leftNumber.toCharArray()) {
                leftNum.add(Character.getNumericValue(c));
            }
            for (char c: rightNumber.toCharArray()) {
                rightNum.add(Character.getNumericValue(c));
            }

            Collections.sort(leftNum);
            Collections.sort(rightNum);

            //System.out.println(leftNum);
            //System.out.println(rightNum);

            distance += calculateDistance(leftNum, rightNum);

            leftNum.clear();
            rightNum.clear();

        }

        return distance;
    }

    private static int calculateDistance(List<Integer> leftNum, List<Integer> rightNum) {

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += Math.abs(leftNum.get(i) - rightNum.get(i));
            //System.out.println(leftNum.get(i) + " " + rightNum.get(i));
            //System.out.println(Math.abs(leftNum.get(i) - rightNum.get(i)));
        }

        return sum;
    }


    public static void readTxt(ArrayList<String> leftList, ArrayList<String> rightList) {

        In inputLine = new In("input.txt");
        int i = 0;

        while (!inputLine.isEmpty()) {
            String line = inputLine.readLine().trim();
            leftList.add(line.substring(0, 5));
            rightList.add(line.substring(8));
            i++;
        }
    }

}