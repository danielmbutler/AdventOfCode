

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Day10 {
        static String[] input = new String[] {"addx 1", "noop", "addx 2", "addx 5", "addx 3", "noop", "addx -1", "addx 5", "noop", "noop", "addx 5", "noop", "addx 3", "noop", "addx 6", "addx -4", "noop", "noop", "addx 5", "noop", "addx -32", "addx 35", "addx 5", "addx -31", "addx 7", "addx -13", "addx 2", "addx 2", "addx 5", "addx 6", "addx -5", "addx 2", "addx 5", "addx 2", "addx 2", "addx -17", "addx 18", "addx 5", "addx 2", "addx -30", "addx 31", "addx 2", "addx 2", "addx -32", "addx -1", "addx 10", "addx -8", "noop", "noop", "addx 6", "addx 16", "noop", "addx -11", "addx 3", "addx -2", "addx 3", "noop", "addx 6", "noop", "addx -2", "noop", "addx 7", "addx 3", "addx -2", "addx 4", "addx -20", "noop", "addx -14", "addx -2", "addx 6", "addx 2", "addx 3", "noop", "addx 2", "addx -1", "addx 4", "noop", "addx 5", "noop", "addx 2", "addx 3", "addx -2", "addx 3", "noop", "addx 4", "noop", "addx 5", "noop", "addx 2", "addx -24", "addx -15", "addx 17", "addx -10", "addx 2", "addx -5", "addx 6", "noop", "addx 3", "addx 2", "addx 2", "noop", "addx 3", "addx 2", "addx 5", "addx -2", "addx 3", "addx 2", "addx 2", "addx 5", "addx 2", "addx -18", "addx -19", "noop", "addx 1", "addx 2", "addx 5", "addx 3", "noop", "noop", "noop", "noop", "addx 2", "addx 5", "addx 2", "addx 3", "noop", "addx -8", "addx 11", "noop", "noop", "addx 2", "addx 5", "addx 2", "addx 3", "noop", "addx -34", "noop"};
        static ArrayList<MutablePair<Integer, Integer>> instructions = new ArrayList<>(); // rounds remaining , action to x

        static  StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        int x = 1;

        refreshInstructions();

        int turns = 0;
        //20th, 60th, 100th, 140th, 180th cycles
        int cycle20 = 0;
        int cycle60 = 0;
        int cycle100 = 0;
        int cycle140 = 0;
        int cycle180 = 0;
        int cycle220 = 0;

        int drawingPosition = 1;
//
//        for (int j = 0; j < 240; j++) {
//            if (j == 18){
//                // cycle 20;
//                cycle20 = 20 * x;
//                //println(String.valueOf(cycle20));
//            }
//            if (j == 58){
//                // cycle 60;
//                cycle60 = 60 * x;
//                //println(String.valueOf(cycle60));
//            }
//            if (j == 98){
//                // cycle 100;
//                cycle100 = 100 * x;
//                //println(String.valueOf(cycle100));
//            }
//            if (j == 138){
//                // cycle 140;
//                cycle140 = 140 * x;
//                //println(String.valueOf(cycle140));
//            }
//            if (j == 178){
//                // cycle 180;
//                cycle180 = 180 * x;
//                //println(String.valueOf(cycle180));
//            }
//            if (j == 218){
//                // cycle 220;
//                cycle220 = 220 * x;
//               // println(String.valueOf(x));
//                //println(String.valueOf(cycle220));
//            }
//        }

        // Part 2
        int column = 0;
        int loops;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < instructions.size(); i++) {
            // if noop 0 else 2
            loops = instructions.get(i).key;

            // loop through loops
            for (int i1 = 0; i1 < loops; i1++) {
                // get sprite positions
                ArrayList<Integer> positions = new ArrayList<>();
                positions.add(x); //position of sprite is 3 characters xxx
                positions.add(x -1);
                positions.add(x +1);

                // add output if current column is in the position of sprite
                if (positions.contains(column)){
                    output.append("#");
                } else {
                    output.append(" ");
                }
                // start new line if at end.
                if (column == 39) {
                   println(output.toString());
                   output = new StringBuilder();
                   column = 0;
                } else {
                    // increment line
                    column++;
                }

            }

            // increment x;
            if (loops == 2){
                x += instructions.get(i).value;
            } else {
                x += 0;
            }
        }

    // println(String.valueOf(cycle20 + cycle60 + cycle100 + cycle140 + cycle180 + cycle220));


    }


    static void refreshInstructions(){
        // get instructions
        for (int i = 0; i < input.length; i++) {
            if (Objects.equals(input[i], "noop")){
                instructions.add(new MutablePair<>(1, 0));
            } else {
                int action  = Integer.parseInt(input[i].substring(5));
                instructions.add(new MutablePair<>(2, action));
            }
        }
    }

    static void printOutput(int[] positions, int cycle){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 39 ; i++) {
            String character = ".";
            for (int position : positions) {
                if (position == i && i == cycle){
                    character = "#";
                }
            }

            output.append(character);

        }
        println(output.toString());
    }

    static int getNext(ArrayList<MutablePair<Integer, Integer>> renewedActions){

        for (MutablePair<Integer, Integer> renewedAction : renewedActions) {
            if (renewedAction.getKey() != -1) {
                int value = renewedAction.value;
                renewedAction.key = -1;
                return value;
            }
        }
        refreshInstructions();
        return getNext(renewedActions);
    }

    static int getNextKey(ArrayList<MutablePair<Integer, Integer>> renewedActions){

        for (MutablePair<Integer, Integer> renewedAction : renewedActions) {
            if (renewedAction.getKey() != -1) {
                return renewedAction.key;
            }
        }
        refreshInstructions();
        return getNextKey(renewedActions);
    }

}

class MutablePair <T, R>{
    int key;
    int value;

    public MutablePair(int pairKey, int pairValue){
        key = pairKey;
        value = pairValue;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
