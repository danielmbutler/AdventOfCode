

import java.util.ArrayList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Day5 {


    static ArrayList<String> stack1 = new ArrayList<>();
    static ArrayList<String> stack2 = new ArrayList<>();
    static ArrayList<String> stack3 = new ArrayList<>();
    static ArrayList<String> stack4 = new ArrayList<>();
    static ArrayList<String> stack5 = new ArrayList<>();
    static ArrayList<String> stack6 = new ArrayList<>();
    static ArrayList<String> stack7 = new ArrayList<>();
    static ArrayList<String> stack8 = new ArrayList<>();
    static ArrayList<String> stack9 = new ArrayList<>();

    static String [] stackArray1 = new String[]{"W", "R", "T", "G"};
    static String [] stackArray2 = new String[]{"W", "V", "S", "M", "P", "H", "C", "G"};
    static String [] stackArray3 = new String[]{"M", "G", "S", "T", "L", "C"};
    static String [] stackArray4 = new String[]{"F", "R", "W", "M", "D", "H", "J"};
    static String [] stackArray5 = new String[]{"J", "F", "W", "S", "H", "L", "Q", "P"};
    static String [] stackArray6 = new String[]{"S", "M", "F", "N", "D", "J", "P"};
    static String [] stackArray7 = new String[]{"J", "S", "C", "G", "F", "D", "B", "Z"};
    static String [] stackArray8 = new String[]{"B", "T", "R"};
    static String [] stackArray9 = new String[]{"C", "L", "W", "N", "H"};

    static String [] inputs = new String[]{"move 3 from 4 to 3", "move 3 from 8 to 6", "move 2 from 3 to 8", "move 3 from 7 to 2", "move 1 from 1 to 3", "move 6 from 2 to 7", "move 5 from 3 to 6", "move 1 from 8 to 6", "move 4 from 4 to 3", "move 2 from 1 to 2", "move 10 from 7 to 3", "move 1 from 7 to 2", "move 6 from 5 to 8", "move 1 from 1 to 4", "move 7 from 6 to 3", "move 22 from 3 to 4", "move 3 from 2 to 8", "move 4 from 6 to 8", "move 5 from 2 to 1", "move 3 from 9 to 4", "move 2 from 4 to 3", "move 1 from 9 to 2", "move 1 from 5 to 3", "move 1 from 2 to 6", "move 1 from 5 to 2", "move 1 from 2 to 7", "move 4 from 4 to 5", "move 2 from 1 to 9", "move 1 from 1 to 3", "move 2 from 5 to 9", "move 5 from 9 to 8", "move 1 from 5 to 9", "move 1 from 7 to 2", "move 1 from 9 to 4", "move 5 from 6 to 7", "move 1 from 5 to 2", "move 2 from 2 to 4", "move 2 from 7 to 4", "move 2 from 7 to 8", "move 21 from 8 to 6", "move 6 from 3 to 1", "move 1 from 7 to 9", "move 1 from 1 to 7", "move 7 from 6 to 8", "move 3 from 1 to 9", "move 24 from 4 to 8", "move 3 from 1 to 3", "move 10 from 6 to 8", "move 1 from 4 to 5", "move 1 from 3 to 9", "move 5 from 9 to 8", "move 11 from 8 to 3", "move 1 from 5 to 7", "move 1 from 1 to 8", "move 1 from 6 to 1", "move 19 from 8 to 1", "move 1 from 7 to 9", "move 10 from 3 to 1", "move 3 from 3 to 8", "move 1 from 7 to 3", "move 1 from 9 to 2", "move 23 from 1 to 7", "move 1 from 1 to 9", "move 1 from 3 to 6", "move 2 from 6 to 9", "move 7 from 8 to 1", "move 8 from 8 to 1", "move 11 from 7 to 2", "move 2 from 6 to 8", "move 1 from 6 to 8", "move 7 from 8 to 6", "move 1 from 9 to 4", "move 1 from 8 to 1", "move 10 from 7 to 1", "move 6 from 2 to 5", "move 5 from 2 to 9", "move 4 from 5 to 8", "move 1 from 5 to 8", "move 13 from 1 to 6", "move 1 from 2 to 4", "move 1 from 4 to 5", "move 2 from 9 to 4", "move 3 from 9 to 4", "move 2 from 5 to 3", "move 1 from 3 to 9", "move 2 from 8 to 5", "move 2 from 5 to 7", "move 2 from 8 to 6", "move 2 from 7 to 3", "move 2 from 7 to 8", "move 4 from 1 to 3", "move 3 from 8 to 4", "move 8 from 4 to 9", "move 1 from 9 to 8", "move 3 from 3 to 6", "move 4 from 3 to 9", "move 1 from 8 to 2", "move 12 from 1 to 5", "move 9 from 6 to 8", "move 1 from 4 to 8", "move 3 from 1 to 3", "move 12 from 5 to 8", "move 1 from 2 to 6", "move 1 from 3 to 1", "move 1 from 3 to 2", "move 1 from 1 to 2", "move 16 from 6 to 1", "move 1 from 6 to 3", "move 2 from 3 to 8", "move 7 from 8 to 5", "move 1 from 2 to 6", "move 1 from 2 to 1", "move 2 from 9 to 4", "move 1 from 6 to 7", "move 8 from 9 to 8", "move 5 from 5 to 6", "move 9 from 8 to 7", "move 12 from 1 to 3", "move 2 from 6 to 3", "move 6 from 8 to 9", "move 5 from 1 to 4", "move 2 from 5 to 7", "move 11 from 7 to 3", "move 1 from 7 to 4", "move 2 from 6 to 8", "move 7 from 4 to 6", "move 3 from 8 to 7", "move 3 from 8 to 2", "move 19 from 3 to 2", "move 4 from 8 to 7", "move 2 from 9 to 8", "move 1 from 4 to 5", "move 1 from 6 to 8", "move 1 from 5 to 7", "move 8 from 9 to 4", "move 1 from 8 to 5", "move 1 from 5 to 6", "move 4 from 2 to 7", "move 8 from 6 to 9", "move 6 from 7 to 3", "move 4 from 3 to 8", "move 5 from 8 to 7", "move 15 from 2 to 8", "move 8 from 3 to 4", "move 7 from 9 to 7", "move 3 from 2 to 4", "move 2 from 7 to 4", "move 2 from 4 to 3", "move 1 from 9 to 4", "move 9 from 7 to 5", "move 4 from 5 to 9", "move 2 from 5 to 3", "move 2 from 9 to 1", "move 3 from 5 to 2", "move 4 from 3 to 1", "move 7 from 7 to 4", "move 3 from 2 to 6", "move 4 from 4 to 5", "move 2 from 1 to 6", "move 8 from 4 to 1", "move 1 from 8 to 2", "move 1 from 2 to 8", "move 11 from 8 to 7", "move 3 from 5 to 9", "move 1 from 5 to 9", "move 11 from 7 to 1", "move 7 from 8 to 9", "move 11 from 1 to 3", "move 6 from 4 to 5", "move 8 from 1 to 7", "move 4 from 6 to 5", "move 3 from 5 to 8", "move 8 from 7 to 3", "move 7 from 4 to 7", "move 7 from 5 to 6", "move 3 from 3 to 8", "move 2 from 4 to 9", "move 16 from 3 to 1", "move 7 from 7 to 1", "move 2 from 8 to 7", "move 2 from 8 to 1", "move 1 from 8 to 4", "move 1 from 7 to 4", "move 2 from 4 to 2", "move 1 from 8 to 7", "move 1 from 2 to 3", "move 1 from 2 to 4", "move 1 from 7 to 8", "move 8 from 6 to 7", "move 1 from 3 to 5", "move 15 from 1 to 2", "move 4 from 9 to 1", "move 1 from 8 to 1", "move 11 from 9 to 2", "move 21 from 2 to 6", "move 1 from 4 to 2", "move 4 from 2 to 7", "move 1 from 5 to 9", "move 1 from 9 to 4", "move 19 from 1 to 2", "move 5 from 2 to 4", "move 8 from 7 to 6", "move 10 from 6 to 2", "move 5 from 7 to 5", "move 2 from 4 to 1", "move 3 from 6 to 9", "move 3 from 9 to 2", "move 1 from 5 to 2", "move 13 from 6 to 3", "move 2 from 6 to 9", "move 17 from 2 to 3", "move 1 from 6 to 2", "move 2 from 2 to 1", "move 2 from 1 to 5", "move 5 from 5 to 3", "move 2 from 2 to 8", "move 10 from 2 to 1", "move 18 from 3 to 8", "move 13 from 8 to 1", "move 7 from 8 to 2", "move 2 from 2 to 1", "move 4 from 3 to 8", "move 1 from 2 to 7", "move 1 from 2 to 8", "move 2 from 4 to 1", "move 1 from 5 to 4", "move 1 from 9 to 6", "move 1 from 1 to 7", "move 11 from 3 to 4", "move 1 from 6 to 2", "move 7 from 1 to 2", "move 5 from 8 to 5", "move 1 from 7 to 5", "move 3 from 5 to 1", "move 7 from 1 to 6", "move 6 from 1 to 6", "move 6 from 1 to 8", "move 2 from 1 to 3", "move 5 from 2 to 5", "move 1 from 7 to 6", "move 1 from 4 to 2", "move 4 from 2 to 4", "move 1 from 1 to 9", "move 1 from 3 to 8", "move 7 from 8 to 5", "move 1 from 9 to 7", "move 1 from 9 to 4", "move 8 from 5 to 7", "move 5 from 4 to 1", "move 4 from 1 to 6", "move 3 from 1 to 6", "move 3 from 3 to 6", "move 1 from 5 to 6", "move 3 from 7 to 5", "move 15 from 6 to 7", "move 12 from 7 to 4", "move 8 from 5 to 2", "move 3 from 4 to 9", "move 3 from 9 to 7", "move 1 from 6 to 2", "move 9 from 4 to 9", "move 4 from 9 to 1", "move 2 from 1 to 7", "move 3 from 6 to 4", "move 3 from 6 to 4", "move 2 from 1 to 2", "move 1 from 5 to 6", "move 2 from 9 to 4", "move 13 from 4 to 2", "move 22 from 2 to 3", "move 3 from 7 to 8", "move 1 from 9 to 6", "move 1 from 9 to 3", "move 2 from 8 to 9", "move 3 from 9 to 8", "move 5 from 6 to 4", "move 2 from 8 to 6", "move 4 from 7 to 8", "move 2 from 2 to 5", "move 4 from 8 to 7", "move 2 from 5 to 7", "move 7 from 7 to 2", "move 9 from 4 to 7", "move 4 from 2 to 1", "move 3 from 7 to 6", "move 12 from 3 to 5", "move 5 from 2 to 5", "move 1 from 8 to 2", "move 1 from 3 to 5", "move 4 from 3 to 1", "move 2 from 6 to 1", "move 11 from 5 to 3", "move 3 from 6 to 1", "move 8 from 1 to 9", "move 5 from 9 to 8", "move 2 from 9 to 7", "move 1 from 1 to 8", "move 4 from 7 to 6", "move 6 from 3 to 1", "move 1 from 9 to 7", "move 5 from 7 to 4", "move 3 from 8 to 3", "move 1 from 6 to 5", "move 2 from 2 to 1", "move 4 from 7 to 9", "move 3 from 8 to 6", "move 6 from 3 to 8", "move 6 from 8 to 7", "move 4 from 6 to 5", "move 6 from 5 to 8", "move 2 from 9 to 5", "move 2 from 9 to 8", "move 4 from 7 to 4", "move 1 from 6 to 3", "move 5 from 8 to 4", "move 1 from 6 to 9", "move 1 from 7 to 3", "move 7 from 3 to 8", "move 6 from 1 to 4", "move 6 from 1 to 2", "move 17 from 4 to 6", "move 4 from 8 to 5", "move 3 from 3 to 1", "move 5 from 4 to 1", "move 5 from 2 to 7", "move 7 from 8 to 1", "move 7 from 7 to 2", "move 4 from 6 to 3", "move 6 from 1 to 8", "move 2 from 4 to 9", "move 2 from 5 to 4", "move 1 from 4 to 3", "move 1 from 4 to 7", "move 2 from 7 to 5", "move 4 from 5 to 3", "move 1 from 9 to 1", "move 5 from 5 to 3", "move 1 from 8 to 5", "move 7 from 6 to 1", "move 6 from 6 to 8", "move 11 from 3 to 7", "move 2 from 9 to 1", "move 8 from 8 to 2", "move 5 from 7 to 5", "move 5 from 7 to 4", "move 1 from 2 to 6", "move 2 from 4 to 6", "move 1 from 7 to 5", "move 2 from 6 to 4", "move 10 from 2 to 6", "move 3 from 4 to 5", "move 1 from 6 to 4", "move 4 from 6 to 4", "move 6 from 6 to 9", "move 3 from 3 to 8", "move 19 from 1 to 8", "move 23 from 8 to 9", "move 1 from 8 to 1", "move 1 from 1 to 7", "move 1 from 7 to 1", "move 1 from 1 to 6", "move 5 from 9 to 5", "move 1 from 8 to 5", "move 5 from 4 to 5", "move 4 from 5 to 4", "move 1 from 9 to 1", "move 6 from 9 to 3", "move 2 from 2 to 8", "move 1 from 1 to 3", "move 1 from 6 to 7", "move 1 from 7 to 3", "move 1 from 2 to 5", "move 6 from 9 to 8", "move 5 from 4 to 5", "move 10 from 5 to 2", "move 10 from 5 to 2", "move 11 from 9 to 1", "move 4 from 2 to 6", "move 18 from 2 to 9", "move 2 from 6 to 9", "move 3 from 3 to 9", "move 1 from 4 to 3", "move 1 from 6 to 8", "move 6 from 8 to 4", "move 6 from 5 to 7", "move 19 from 9 to 4", "move 7 from 1 to 3", "move 1 from 6 to 8", "move 4 from 8 to 7", "move 2 from 3 to 6", "move 3 from 1 to 8", "move 1 from 1 to 5", "move 7 from 7 to 3", "move 8 from 3 to 1", "move 1 from 5 to 7", "move 2 from 6 to 2", "move 3 from 1 to 8", "move 1 from 2 to 6", "move 3 from 1 to 7", "move 4 from 8 to 9", "move 4 from 7 to 6", "move 3 from 9 to 7", "move 3 from 9 to 3", "move 6 from 7 to 3", "move 13 from 3 to 1", "move 5 from 3 to 4", "move 1 from 8 to 7", "move 1 from 7 to 9", "move 1 from 8 to 5", "move 1 from 9 to 4", "move 1 from 5 to 2", "move 2 from 9 to 2", "move 3 from 6 to 2", "move 1 from 3 to 7", "move 13 from 4 to 8", "move 14 from 1 to 5", "move 6 from 2 to 7", "move 4 from 8 to 7", "move 1 from 1 to 3", "move 1 from 2 to 6", "move 5 from 4 to 2", "move 4 from 8 to 4", "move 12 from 5 to 4", "move 1 from 3 to 8", "move 9 from 4 to 2", "move 9 from 4 to 5", "move 1 from 4 to 5", "move 6 from 4 to 3", "move 5 from 8 to 4", "move 9 from 4 to 7", "move 4 from 2 to 3", "move 8 from 7 to 1", "move 2 from 7 to 1", "move 2 from 2 to 9", "move 1 from 6 to 7", "move 2 from 6 to 3", "move 1 from 2 to 3", "move 2 from 7 to 3", "move 3 from 3 to 7", "move 8 from 1 to 2", "move 9 from 5 to 3", "move 15 from 2 to 7", "move 20 from 7 to 5", "move 23 from 5 to 6", "move 20 from 6 to 8", "move 1 from 6 to 4", "move 2 from 9 to 7", "move 1 from 4 to 6", "move 3 from 7 to 6", "move 2 from 7 to 5", "move 13 from 3 to 5", "move 3 from 7 to 1", "move 13 from 5 to 4", "move 3 from 1 to 4", "move 5 from 6 to 1", "move 6 from 4 to 3", "move 1 from 7 to 4", "move 11 from 8 to 6", "move 1 from 8 to 6", "move 2 from 1 to 5", "move 2 from 5 to 3", "move 11 from 6 to 5", "move 3 from 8 to 3", "move 4 from 3 to 5", "move 15 from 5 to 1", "move 1 from 3 to 5", "move 3 from 8 to 5", "move 1 from 5 to 9", "move 1 from 5 to 3", "move 9 from 4 to 6", "move 7 from 6 to 8", "move 2 from 4 to 6", "move 2 from 5 to 1", "move 8 from 8 to 7", "move 6 from 6 to 2", "move 1 from 5 to 2", "move 4 from 3 to 4", "move 6 from 1 to 5", "move 7 from 3 to 4", "move 2 from 3 to 2", "move 2 from 8 to 9", "move 9 from 2 to 5", "move 9 from 5 to 4", "move 2 from 3 to 6", "move 14 from 1 to 7", "move 15 from 7 to 2", "move 1 from 1 to 7", "move 7 from 5 to 1", "move 2 from 9 to 2", "move 2 from 1 to 7", "move 1 from 1 to 4", "move 2 from 6 to 8", "move 7 from 2 to 8", "move 1 from 9 to 6", "move 7 from 8 to 3", "move 1 from 6 to 4", "move 1 from 8 to 2", "move 6 from 4 to 6", "move 9 from 2 to 1", "move 1 from 3 to 9", "move 3 from 7 to 5"};
    static String [] inputs2 = new String[]{"move 3 from 4 to 3"};

    public static void main(String[] args){

        ArrayList<ArrayList<String>> masterArrayList = new ArrayList<>();

        masterArrayList.add(stack1);
        masterArrayList.add(stack2);
        masterArrayList.add(stack3);
        masterArrayList.add(stack4);
        masterArrayList.add(stack5);
        masterArrayList.add(stack6);
        masterArrayList.add(stack7);
        masterArrayList.add(stack8);
        masterArrayList.add(stack9);

        // setup
        for(int counter=stackArray1.length - 1; counter >= 0; counter--){
            stack1.add(stackArray1[counter]);
        }

        for(int counter=stackArray2.length - 1; counter >= 0; counter--){
            stack2.add(stackArray2[counter]);
        }

        for(int counter=stackArray3.length - 1; counter >= 0; counter--){
            stack3.add(stackArray3[counter]);
        }

        for(int counter=stackArray4.length - 1; counter >= 0; counter--){
            stack4.add(stackArray4[counter]);
        }

        for(int counter=stackArray5.length - 1; counter >= 0; counter--){
            stack5.add(stackArray5[counter]);
        }

        for(int counter=stackArray6.length - 1; counter >= 0; counter--){
            stack6.add(stackArray6[counter]);
        }

        for(int counter=stackArray7.length - 1; counter >= 0; counter--){
            stack7.add(stackArray7[counter]);
        }

        for(int counter=stackArray8.length - 1; counter >= 0; counter--){
            stack8.add(stackArray8[counter]);
        }

        for(int counter=stackArray9.length - 1; counter >= 0; counter--){
            stack9.add(stackArray9[counter]);
        }

        problem1(masterArrayList);


        println(String.valueOf(stack1));
        println(String.valueOf(stack2));
        println(String.valueOf(stack3));
        println(String.valueOf(stack4));
        println(String.valueOf(stack5));
        println(String.valueOf(stack6));
        println(String.valueOf(stack7));
        println(String.valueOf(stack8));
        println(String.valueOf(stack9));

    }

    public static void problem2(ArrayList<ArrayList<String>> masterArrayList){
        for (String input: inputs) {
            int amount = Integer.parseInt(input.substring(input.indexOf(" ") + 1,input.indexOf("f") -1 ));
            int firstInt = Integer.parseInt(input.substring(input.indexOf("r") + 4,input.indexOf("t") -1 ));
            int secondInt = Integer.parseInt(input.substring(input.indexOf("t") + 3));

            ArrayList<String> firstColumn = masterArrayList.get(firstInt-1);
            ArrayList<String> secondColumn = masterArrayList.get(secondInt -1);

//            println("first");
//            println(String.valueOf(firstColumn));
//
//            println("second");
//            println(String.valueOf(secondColumn));
//            println("amount");
//            println(String.valueOf(amount));

            List<String> moving = firstColumn.subList(firstColumn.size() -amount , firstColumn.size());

            // Add items in column (needs to be done backwards)
            for(int counter=moving.size() - 1; counter >= 0; counter--){
                secondColumn.add(moving.get(counter));
            }

            // remove items from column
            int removed = 0;

            while (removed < amount) {
                firstColumn.remove(firstColumn.size() - 1);
                removed++;
            }

        }
    }

    public static void problem1(ArrayList<ArrayList<String>> masterArrayList){
        for (String input: inputs) {
            int amount = Integer.parseInt(input.substring(input.indexOf(" ") + 1,input.indexOf("f") -1 ));
            int firstInt = Integer.parseInt(input.substring(input.indexOf("r") + 4,input.indexOf("t") -1 ));
            int secondInt = Integer.parseInt(input.substring(input.indexOf("t") + 3));

            ArrayList<String> firstColumn = masterArrayList.get(firstInt-1);
            ArrayList<String> secondColumn = masterArrayList.get(secondInt -1);

//            println("first");
//            println(String.valueOf(firstColumn));
//
//            println("second");
//            println(String.valueOf(secondColumn));
//            println("amount");
//            println(String.valueOf(amount));

            List<String> moving = firstColumn.subList(firstColumn.size() -amount , firstColumn.size());

            // Add items in column (needs to be done backwards) problem 1
//            for(int counter=moving.size() - 1; counter >= 0; counter--){
//                secondColumn.add(moving.get(counter));
//            }

            // for problem2 add them in same order
            secondColumn.addAll(moving);

            // remove items from column
            int removed = 0;

            while (removed < amount) {
                firstColumn.remove(firstColumn.size() - 1);
                removed++;
            }

        }
    }


}
