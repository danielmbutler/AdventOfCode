import java.util.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Day11Test {


//    Monkey 0:
//    Starting items: 54, 89, 94
//    Operation: new = old * 7
//    Test: divisible by 17
//    If true: throw to monkey 5
//    If false: throw to monkey 3
//
//    Monkey 1:
//    Starting items: 66, 71
//    Operation: new = old + 4
//    Test: divisible by 3
//    If true: throw to monkey 0
//    If false: throw to monkey 3
//
//    Monkey 2:
//    Starting items: 76, 55, 80, 55, 55, 96, 78
//    Operation: new = old + 2
//    Test: divisible by 5
//    If true: throw to monkey 7
//    If false: throw to monkey 4
//
//    Monkey 3:
//    Starting items: 93, 69, 76, 66, 89, 54, 59, 94
//    Operation: new = old + 7
//    Test: divisible by 7
//    If true: throw to monkey 5
//    If false: throw to monkey 2
//
//    Monkey 4:
//    Starting items: 80, 54, 58, 75, 99
//    Operation: new = old * 17
//    Test: divisible by 11
//    If true: throw to monkey 1
//    If false: throw to monkey 6
//
//    Monkey 5:
//    Starting items: 69, 70, 85, 83
//    Operation: new = old + 8
//    Test: divisible by 19
//    If true: throw to monkey 2
//    If false: throw to monkey 7
//
//    Monkey 6:
//    Starting items: 89
//    Operation: new = old + 6
//    Test: divisible by 2
//    If true: throw to monkey 0
//    If false: throw to monkey 1
//
//    Monkey 7:
//    Starting items: 62, 80, 58, 57, 93, 56
//    Operation: new = old * old
//    Test: divisible by 13
//    If true: throw to monkey 6
//    If false: throw to monkey 4

    public static void main(String[] args) {

        ArrayList<Monkey> monkeys = new ArrayList<>();
        monkeys.add(new Monkey(new ArrayList<Long>(Arrays.asList(54L,89L,94L)), 0, 5, 3));
        monkeys.add(new Monkey(new ArrayList<Long>(Arrays.asList(66L,71L)), 1, 0, 3));
        monkeys.add(new Monkey(new ArrayList<Long>(Arrays.asList(76L, 55L, 80L, 55L, 55L, 96L, 78L)), 2, 7, 4));
        monkeys.add(new Monkey(new ArrayList<Long>(Arrays.asList(93L, 69L, 76L, 66L, 89L, 54L, 59L, 94L)), 3, 5, 2));
        monkeys.add(new Monkey(new ArrayList<Long>(Arrays.asList(80L, 54L, 58L, 75L, 99L)), 4, 1, 6));
        monkeys.add(new Monkey(new ArrayList<Long>(Arrays.asList(69L, 70L, 85L, 83L)), 5, 2, 7));
        monkeys.add(new Monkey(new ArrayList<Long>(Collections.singletonList(89L)), 6, 0, 1));
        monkeys.add(new Monkey(new ArrayList<Long>(Arrays.asList(62L, 80L, 58L, 57L, 93L, 56L)), 7, 6, 4));

        // for part 2 work out modular
        int mod = 17*3*5*7*11*19*2*13;

        // for 20 rounds
        for (int k = 0; k < 10000; k++) {
            for (Monkey monkey : monkeys) {
                // loop through items
                for (int i = 0; i < monkey.items.size(); i++) {
                    long item = monkey.items.get(i);

                    // increase monkey count
                    monkey.count++;
                    long newItemWorryLevel = 0;

                    if (monkey.monkeyNumber == 0){
                        newItemWorryLevel = item * 7;
                    } else if (monkey.monkeyNumber == 1) {
                        newItemWorryLevel = item + 4;
                    } else if (monkey.monkeyNumber == 2) {
                        newItemWorryLevel = item + 2;
                    } else if (monkey.monkeyNumber == 3) {
                        newItemWorryLevel = item +7;
                    } else if (monkey.monkeyNumber == 4) {
                        newItemWorryLevel = item * 17;
                    } else if (monkey.monkeyNumber == 5) {
                        newItemWorryLevel = item + 8;
                    } else if (monkey.monkeyNumber == 6) {
                        newItemWorryLevel = item + 6;
                    } else if (monkey.monkeyNumber == 7) {
                        newItemWorryLevel = item * item;
                    }

                    // worry level decreases /3
                    //part 2 use mod
                    newItemWorryLevel %= mod;

                    println(String.valueOf(newItemWorryLevel));

                    boolean test = false;
                    // test
                    if (monkey.monkeyNumber == 0){
                        test = newItemWorryLevel  % 17 == 0;
                    } else if (monkey.monkeyNumber == 1) {
                        test = newItemWorryLevel  % 3 == 0;
                    } else if (monkey.monkeyNumber == 2) {
                        test = newItemWorryLevel  % 5 == 0;
                    } else if (monkey.monkeyNumber == 3) {
                        test = newItemWorryLevel  % 7 == 0;
                    } else if (monkey.monkeyNumber == 4) {
                        test = newItemWorryLevel  % 11 == 0;
                    } else if (monkey.monkeyNumber == 5) {
                        test = newItemWorryLevel  % 19 == 0;
                    } else if (monkey.monkeyNumber == 6) {
                        test = newItemWorryLevel  % 2 == 0;
                    } else if (monkey.monkeyNumber == 7) {
                        test = newItemWorryLevel  % 13 == 0;
                    }

                    // throw to next
                    if (test) {
                        monkeys.get(monkey.trueMonkey).addItem(newItemWorryLevel);
                    } else {
                        monkeys.get(monkey.falseMonkey).addItem(newItemWorryLevel);
                    }
                }
                // remove items
                monkey.items = new ArrayList<>();
            }
        }

        // level of monkey business;
        monkeys.sort(Comparator.comparing(Monkey::getCount));

        for (Monkey monkey : monkeys) {
            // work out higher or
            println("Monkey " + monkey.monkeyNumber + " " + monkey.items + " count " + monkey.count);
        }

        println("Level of business " + (monkeys.get(monkeys.size() -1).count * monkeys.get(monkeys.size()-2).count));

    }

    static class Monkey implements Comparator<Monkey> {
        ArrayList<Long> items;
        int monkeyNumber;
        int trueMonkey;
        int falseMonkey;

        long count;

        public Monkey(ArrayList<Long> startingItems, int monkeyNumber, int trueMonkey, int falseMonkey) {
            this.items = startingItems;
            this.monkeyNumber = monkeyNumber;
            this.trueMonkey = trueMonkey;
            this.falseMonkey = falseMonkey;
        }

        void addItem(Long newItemWorryLevel) {
            items.add(newItemWorryLevel);
        }

        @Override
        public int compare(Monkey o1, Monkey o2) {
            return Long.compare(o1.count, o2.count);
        }

        public long getCount() {
            return count;
        }
    }
}


