import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Day2 {

    //ROCK     A    X  1
    //PAPER    B    Y  2
    //SCISSORS C    Z  3

    // LOSS 0
    // DRAW 3
    // WIN 6

    // Second problem
    //X  lose
    //Y  draw
    //Z  win

    static String[] games = new String[]{"B Z", "B Z", "C Z", "C Z", "B X", "C Y", "A Y", "B Z", "A Z", "A Y", "C Z", "C X", "C Z", "C X", "B X", "B Z", "B Z", "A Z", "C Z", "C Z", "C Y", "C Z", "B Z", "B Z", "A X", "A Y", "B Z", "B Z", "C Z", "B Z", "B Z", "C X", "C Z", "A Y", "A X", "A X", "C Z", "C Z", "B X", "C X", "B Z", "A Z", "B X", "B Z", "B Z", "A Z", "B Z", "A Y", "C Z", "C Z", "B X", "C Z", "A Z", "C Z", "C Z", "C Z", "C Z", "A Z", "B Z", "C Z", "A Z", "C Z", "C Z", "C Y", "A Y", "C X", "C Z", "C Z", "C Z", "C Z", "A Y", "C X", "A Y", "A Y", "C X", "B Z", "A Y", "C Y", "C Z", "B Z", "C Z", "B Z", "B Z", "B Z", "C Y", "B Z", "A Y", "C Z", "C Z", "A X", "C X", "C Z", "A X", "C Z", "C Z", "C X", "A Z", "C Z", "C Z", "B Z", "C Y", "A Y", "C Y", "C Y", "A Z", "B Z", "C Z", "C Z", "C Z", "A Z", "C Z", "B X", "C Z", "A Y", "C Z", "C X", "C Y", "C Y", "B Z", "C Z", "C Z", "A X", "C X", "C Z", "C Z", "A Z", "B Z", "B Z", "C X", "C Z", "B Z", "C X", "B Z", "C Z", "B Z", "B Z", "B Z", "B Z", "C Y", "C Z", "B Z", "C Z", "C Z", "C Z", "C Z", "B Z", "C Z", "B Z", "C Z", "B Z", "C Z", "C Y", "C Z", "C Z", "C X", "C Z", "C Z", "C Y", "C Z", "C Y", "C X", "B Z", "B Z", "C Z", "A Z", "C Z", "C Z", "C Z", "B Z", "C Z", "B Z", "C Z", "B Z", "C Z", "C Z", "B X", "B Z", "C Z", "C Z", "A Z", "A Z", "B Z", "C Z", "C Z", "A Z", "B X", "C X", "A Z", "C Z", "C Z", "B Y", "B Z", "B Z", "A Y", "B Z", "C Z", "C Z", "A Y", "B Z", "C Y", "A Z", "C X", "A Z", "A Y", "C X", "C Y", "C Z", "B Z", "C Z", "A Y", "B Z", "B Z", "C Z", "C Z", "C Z", "C Z", "C Z", "B Z", "C Z", "A X", "C Z", "C Z", "A Y", "C Z", "A Y", "C Z", "B Z", "C Z", "A Y", "C Z", "C Y", "C Z", "B Z", "C X", "A Y", "C X", "A Y", "B X", "C Y", "B X", "C Z", "C Y", "C Z", "C Y", "C Y", "B Z", "C Z", "A Y", "C X", "C Z", "C Z", "B Z", "A Z", "C Z", "C Z", "C Y", "C Z", "C Y", "B X", "C Z", "C Z", "C Z", "C X", "A Y", "B Z", "C Z", "C Z", "C Z", "B Z", "A Y", "A Z", "A Y", "B Z", "A Z", "A Y", "B Z", "C Z", "A Y", "A Z", "B Z", "B Z", "B Z", "C Z", "C Z", "C Z", "C Z", "C Z", "C Z", "B Z", "C Z", "C Z", "C Z", "A Z", "A Y", "C X", "C Z", "A Z", "C Z", "A Y", "C Z", "A Y", "C Z", "C Z", "A X", "C Y", "C Z", "A X", "C X", "A X", "B Z", "C Z", "A X", "C Z", "B Z", "A X", "C Z", "A Y", "A Z", "C Y", "A Y", "C Y", "A Z", "B Z", "A Z", "B Z", "C X", "C X", "C Z", "C Z", "B Z", "A Y", "C Z", "A Y", "C Z", "B Z", "B X", "B X", "B X", "A Z", "B Z", "C X", "C Z", "A Y", "C Z", "B X", "A Y", "C X", "B Z", "C Z", "C Z", "C Z", "C Z", "A Z", "B Z", "B Z", "B X", "A Y", "C Z", "C X", "A Y", "C Z", "C Z", "C Z", "A Y", "A X", "B Z", "C Z", "A Z", "C Y", "A Z", "B Z", "A Y", "C Z", "C Z", "B Z", "A Y", "B Z", "A Z", "A Y", "C Z", "A X", "C Z", "C Z", "B Z", "C Z", "C X", "A Y", "A Y", "B Z", "C Z", "B X", "A Y", "C Z", "C Z", "A X", "A Z", "C Z", "C Z", "A Y", "C Z", "C Y", "A Y", "A Y", "B Z", "C Z", "C Z", "C X", "C Z", "A Y", "B Z", "C Z", "C Z", "A Y", "B Z", "C Z", "C Z", "B Z", "A Y", "B Z", "C Z", "C Z", "C Z", "C X", "C Z", "C Z", "C Z", "C Y", "C X", "C Y", "C Z", "B Z", "A Y", "C X", "B Z", "C X", "C X", "C Z", "A Z", "C Z", "B X", "A Y", "C Z", "B Z", "A X", "B X", "C X", "C Z", "C Z", "B Z", "B Z", "C Z", "C Z", "A Y", "B Z", "A Z", "B Z", "A Z", "A X", "C Z", "A Z", "A Z", "B X", "A Z", "B Z", "B Z", "A Y", "C Y", "B Z", "B Z", "B Z", "B Z", "C Z", "B Z", "C Z", "B Z", "C Y", "C Z", "C Z", "C X", "C Z", "C Y", "C Y", "C X", "A Y", "C Y", "B Z", "C Z", "A Y", "A Z", "B X", "C Z", "C Z", "A Y", "A Y", "A Y", "C Z", "A Z", "C Z", "B Y", "A X", "A Y", "C Z", "A X", "B Z", "C Z", "C Z", "B Z", "C Z", "A Z", "C X", "C Z", "B Z", "B Z", "C Z", "B Z", "A Z", "C Z", "C Z", "A Y", "B Z", "A Y", "B Z", "C Z", "B Z", "C Z", "B Z", "B Z", "A Y", "C Y", "B Z", "C Z", "A Z", "B Z", "C Z", "C Z", "A Z", "B Z", "C Z", "A Y", "A Z", "C X", "B Z", "A Y", "A Y", "C Z", "A Z", "B Z", "B Z", "C Z", "C Z", "C Z", "C Z", "A Y", "A X", "C Z", "B Z", "C Z", "C Z", "C Y", "C Z", "A X", "A Z", "C Z", "B X", "A Z", "B X", "B X", "A Y", "A Y", "A Y", "C Z", "C Z", "C Z", "A Z", "C X", "A Y", "C Z", "B Z", "C Z", "A X", "B Z", "A X", "A Z", "C Z", "C Z", "C Z", "B X", "B Z", "C X", "B Z", "C Z", "C Z", "C Z", "A Y", "B Z", "B Z", "C Z", "A X", "B Z", "A Y", "C Z", "A Y", "A Y", "C Z", "C Z", "A Y", "C X", "C Z", "A Y", "C Z", "B Z", "B Z", "C Z", "C Y", "B Z", "B Z", "C Z", "A Y", "C Z", "B Z", "B X", "A Y", "A Z", "C Z", "B Z", "C Z", "C X", "A Y", "A Z", "A Y", "B Z", "A Z", "B Z", "A Y", "A Y", "B Z", "C Z", "C Z", "C Z", "A Y", "A X", "B Z", "A Y", "C Z", "B X", "C Z", "C Z", "A Y", "C Z", "C Z", "C Y", "C Z", "C Y", "B Z", "B Z", "C Z", "C Z", "B Z", "B Z", "B Z", "C Z", "B Z", "B Z", "C Z", "C Z", "C X", "C Z", "C Z", "B Z", "B Z", "C X", "A Y", "C Y", "C X", "B Z", "C X", "B Z", "C Z", "A Z", "C Y", "C Z", "C X", "B X", "A Y", "C Y", "A X", "C Z", "C Z", "C Z", "C Z", "A Y", "C Y", "C Z", "A Y", "C Z", "C Z", "B Z", "B Z", "B Z", "C Z", "C Z", "C Z", "C Z", "C Z", "C Z", "B Z", "C Z", "B Z", "C Z", "B Z", "C Z", "C Z", "B Z", "C Z", "C Z", "C Z", "A Y", "C Z", "C Z", "A X", "C Z", "C Z", "A X", "B Z", "C Z", "A Y", "C X", "C Z", "A Z", "C Y", "A Y", "C Z", "B Z", "C Z", "B Z", "C X", "C Y", "B Z", "C Z", "C Z", "A Y", "C X", "C Z", "C Z", "B X", "C Z", "C Z", "C Z", "C Z", "A Z", "A Y", "C Z", "B Z", "C Z", "B Z", "A Y", "B Z", "C Z", "B Z", "B Y", "C Z", "B Z", "A Y", "C Z", "C Y", "C Z", "A X", "B Z", "C Z", "A Z", "A Z", "B Z", "A X", "B Z", "B Z", "C Y", "C Z", "C Z", "B Y", "B Z", "C Z", "A Y", "B X", "B Z", "C Z", "C Z", "C Z", "B X", "A Y", "A Y", "B Z", "B Z", "C Z", "B Z", "C Z", "C Y", "B Z", "B Z", "B X", "A Y", "A Y", "A Y", "B X", "C Z", "C Z", "B Z", "C Z", "C X", "B Z", "C Z", "C Z", "B Z", "C Z", "C Z", "A Y", "B Z", "A Y", "C Y", "B Z", "B Z", "B Z", "C X", "C Z", "C Z", "C Z", "C X", "C Z", "A X", "B Z", "C Z", "C Z", "A Y", "B Z", "C Z", "A Y", "C Z", "B Z", "C Z", "C Z", "B Z", "B Z", "C Z", "C Z", "C Y", "C Z", "C Y", "C X", "C Z", "C Y", "C Z", "A Y", "B Z", "B Z", "A Y", "B Z", "B X", "B X", "A Z", "C Y", "C Z", "C Z", "B Z", "C Z", "C Z", "C Z", "C Z", "C Y", "C Z", "B Z", "C Z", "C Z", "C Z", "B Z", "B Z", "C Z", "B X", "C Y", "A X", "C Z", "A Z", "C Y", "C Z", "C Z", "B Z", "C Z", "C Z", "C Z", "B Z", "A Y", "A Z", "B X", "C X", "A Y", "A Y", "C Z", "C Z", "C Z", "C Z", "C Z", "C Z", "C Y", "C Z", "C Z", "C Z", "A Y", "A Z", "C Z", "A Y", "C Z", "C Z", "B Z", "B Z", "B X", "A Y", "B Z", "C Y", "C Z", "B Z", "A Z", "A Y", "A X", "C Z", "B Z", "C Z", "B Z", "B Z", "C Z", "C Z", "C Z", "C Z", "A Y", "A Z", "C Z", "C Z", "A Y", "C Y", "C Z", "A X", "B X", "B X", "C Z", "C Z", "B Z", "A Y", "A Y", "A Y", "A X", "C Z", "B Z", "B Z", "B Z", "A Y", "C Y", "B Z", "A Z", "C Z", "B X", "C Z", "C Z", "C X", "C X", "C Z", "A Y", "B Z", "C Z", "A Y", "C Z", "A X", "C Z", "B Z", "B Z", "B Z", "C Z", "B Z", "C Z", "A Z", "C Z", "B Z", "C Z", "A Y", "C Z", "A Z", "C Z", "C Y", "B Z", "A Z", "C Z", "B Y", "A Z", "C Z", "A X", "C Z", "B Z", "A X", "C Z", "B Z", "C Z", "C X", "A Y", "C Z", "B Z", "A X", "C Z", "B Z", "C Z", "A Y", "C Z", "C Z", "C Z", "B Z", "C Y", "C Z", "C X", "A Z", "C Z", "C Z", "B Z", "C Z", "C Z", "C Z", "A Z", "C Z", "A Y", "A X", "C Z", "A Y", "C X", "C Z", "B Z", "C Z", "B Z", "B Z", "A Y", "B Z", "A Y", "A Y", "C X", "B Z", "C Z", "C Z", "C Z", "C Z", "C Z", "A Y", "B Z", "C Z", "A Y", "B Z", "C Z", "C Z", "A Y", "B Z", "C Z", "C Y", "B Z", "C Z", "B Z", "A Z", "C X", "B Z", "C Y", "C Z", "C Z", "C X", "C X", "A X", "C Z", "B Z", "A Z", "C Z", "B Z", "B X", "C Z", "C Z", "C Z", "C Z", "B Z", "B X", "C Z", "C Z", "C Z", "B Z", "C Y", "B Z", "B X", "C Y", "C Z", "C Z", "B Z", "A Z", "C Y", "C X", "C Z", "B Z", "C Z", "C Z", "C Z", "B Z", "B X", "C Z", "C Z", "A Y", "C Z", "C Y", "A Y", "A Z", "B Y", "C Z", "A Y", "C X", "C X", "C X", "C Z", "B Z", "C Z", "C Z", "B Z", "C Z", "A Y", "C Z", "C Z", "B Z", "C X", "C Z", "B Z", "C Z", "A Y", "C Z", "C Z", "C X", "C Z", "B Z", "C Y", "C Z", "A Z", "C Z", "B Z", "A Z", "B Z", "C Z", "A Y", "B Z", "C Z", "C Z", "B Z", "A Z", "C Z", "C X", "C Z", "C Z", "A Y", "A Y", "A Z", "C Z", "A Y", "A X", "C Z", "C Z", "C Z", "C X", "A Z", "C Z", "A Y", "C Z", "C Z", "C Y", "C Z", "C Z", "B Z", "C Z", "C Z", "B Z", "B Z", "C Z", "C Z", "C Z", "B Z", "C Z", "C Z", "C Y", "B Z", "C Y", "B Z", "B X", "C Z", "C Z", "A Y", "B Z", "C Y", "B Z", "B Z", "B Z", "B Z", "C Z", "C Y", "A X", "C Z", "C Z", "C Z", "C Z", "C Z", "B Z", "C Z", "A Y", "C Z", "C Z", "A Y", "A Y", "C Z", "C Z", "B Z", "B Z", "C X", "C Z", "C Z", "A X", "C Z", "C Y", "C Z", "B Z", "C Z", "A Y", "C Z", "C Z", "C Z", "C X", "A Y", "C Z", "C X", "B Z", "C Z", "C Z", "C Y", "C Z", "A Y", "B Z", "B Z", "A X", "C Y", "C Z", "B X", "A X", "C Z", "C Z", "C Z", "C Z", "C Y", "A X", "B Z", "C Z", "C Z", "A Y", "B X", "A Z", "A Y", "B Z", "C Z", "C X", "A X", "C X", "C Y", "C Z", "B X", "A X", "C Z", "C Z", "B X", "A Y", "A Y", "A Y", "C Z", "C Z", "A Y", "C Z", "A Z", "A Y", "C Z", "B X", "C Z", "C Z", "C X", "C Z", "C Z", "A Z", "B Z", "A Z", "C Y", "C Y", "C Y", "C Z", "C X", "C Z", "A Y", "B Z", "C Z", "B Z", "C Z", "A Y", "C X", "C Z", "C Z", "B Z", "C Z", "C Y", "A Y", "B Z", "B Z", "B X", "B Z", "C Z", "A Y", "C Z", "B Z", "A Y", "C Z", "C Z", "B Z", "A Y", "C Z", "C Z", "C Z", "C Z", "A Z", "A Y", "C Z", "C X", "A Z", "A Z", "C Z", "C Z", "C Z", "A Y", "B Z", "B Z", "B Z", "B Z", "C Z", "C X", "C Z", "C Z", "B Z", "B Z", "C Z", "C X", "A Z", "A Y", "C Z", "B Z", "C X", "C X", "A Y", "A Y", "C Z", "B X", "C Z", "C Y", "C X", "A Y", "C Y", "C Z", "C Z", "B Z", "A Z", "C Z", "C Z", "C Z", "C X", "C Z", "B Z", "A Y", "C Z", "B Z", "C Z", "A Y", "A Y", "B X", "B X", "B Z", "C Z", "C Z", "C Z", "C Z", "C X", "C Z", "B Z", "C X", "C X", "A Z", "B Y", "C Z", "C Z", "C X", "B Z", "C Z", "C Z", "A Z", "C Z", "C X", "A Y", "A Z", "C Z", "B Z", "C Z", "B X", "A Y", "C Z", "C Z", "B Z", "C X", "B Z", "B Z", "C Z", "C Z", "C Z", "B Z", "A Z", "C Z", "A X", "C Z", "C Z", "C Z", "C X", "C X", "B Z", "C Y", "C Z", "C Y", "A Z", "A Y", "A X", "B Z", "A Y", "C Z", "C Y", "B Z", "B Z", "B Z", "B Y", "B Z", "A X", "C Z", "A Y", "B Z", "A Y", "C Z", "C Z", "C Z", "A Y", "C Z", "B Z", "C Z", "A Z", "C Y", "C X", "A Y", "A Y", "A Y", "B Z", "C Y", "C Z", "C Z", "C X", "B Z", "A Y", "C Z", "C Z", "B Z", "A Z", "C Z", "B Z", "C X", "C Z", "B Z", "C Z", "C Z", "B Y", "B Z", "C Y", "B Z", "A X", "C Y", "B Z", "C Z", "A Y", "C Z", "A Z", "C Z", "B Z", "A X", "C Y", "C Y", "A Y", "A Z", "B Z", "A Z", "C Z", "C Y", "C X", "C Z", "A Y", "C Z", "A Y", "C Z", "C Z", "C Z", "C Y", "C X", "C X", "B Z", "A Y", "C Z", "A X", "C Z", "A Z", "C X", "A X", "A Z", "A Y", "C Z", "C Z", "C Z", "B Z", "B Z", "C Z", "C Z", "C Z", "A Y", "C Z", "A Z", "C Z", "C Z", "C X", "C X", "C Z", "C Z", "C Z", "C Z", "C Z", "A Y", "B Z", "B Z", "C Z", "B X", "C Y", "C Z", "C Z", "C Z", "A Y", "B X", "C Z", "C X", "B Z", "A Z", "B X", "C Z", "C Z", "B Z", "C X", "B Z", "C Z", "A Y", "C X", "A Y", "A Z", "C Y", "C Z", "C Y", "C Z", "C X", "C Z", "C Z", "C Z", "C Z", "C Z", "C Z", "B Z", "C Z", "B Z", "C X", "C Z", "C X", "B Z", "A Z", "A X", "C Z", "A Y", "C Y", "C Z", "C Z", "C Z", "B Z", "B Z", "A X", "C Z", "B Z", "C Z", "C Z", "A X", "C Z", "B Z", "C X", "C Z", "C Z", "C Z", "C Z", "B X", "C X", "B Z", "C Z", "B Z", "A Y", "C Z", "A Y", "B X", "C Z", "C Z", "C Z", "C Z", "A Y", "C Z", "C Z", "B Z", "C Z", "C Z", "B Z", "A Y", "C X", "C Z", "C Z", "A Y", "C X", "B Z", "B Z", "A Y", "C Z", "B Z", "C Z", "A Y", "B Z", "A Z", "C Z", "B Z", "C Z", "B Z", "C X", "B Z", "C Z", "C Z", "C Z", "A Y", "A Y", "C Z", "B Z", "A Y", "B X", "C Z", "B Z", "C X", "C Z", "B Z", "B Z", "C Y", "C Y", "A Z", "C X", "C Z", "B Z", "A Y", "C Z", "C Z", "B Z", "A Y", "B Z", "A Z", "C Z", "B Z", "B Z", "B Z", "C Z", "C X", "B Z", "C Z", "B Z", "C Z", "C Z", "A Y", "A Y", "C Z", "C X", "A Y", "B Z", "C Z", "A Z", "C Z", "B Z", "A Y", "C Z", "C X", "C Z", "C Z", "C Z", "C Z", "A Y", "C Z", "C X", "B Z", "B X", "C Z", "A Y", "C Y", "C Z", "C Z", "C X", "C Z", "C X", "C X", "C Z", "B Z", "B X", "A Z", "A Z", "C Z", "C Y", "A Y", "C Z", "A Y", "C Z", "C Z", "C Z", "B Z", "B Z", "C Z", "B Z", "C Z", "C Z", "C Y", "B Z", "B Z", "C Z", "C Z", "B Z", "C X", "A Z", "C Z", "C Z", "A Y", "A Y", "A Y", "C Z", "C Z", "B Z", "A Z", "A X", "A Y", "C X", "C Z", "B Z", "C X", "C X", "B Z", "B Z", "B X", "C Z", "C Y", "B Y", "C Z", "C Z", "C Z", "B Y", "A Y", "A Y", "C Z", "C Z", "C Z", "C Z", "C Z", "C Z", "C Z", "C Z", "B X", "A Z", "A X", "C Z", "A Y", "A Z", "C X", "C Z", "C Y", "C Z", "C Z", "C Z", "B Z", "B Z", "A Y", "A Z", "C X", "B X", "B X", "C Z", "C Y", "C Z", "C Z", "C Y", "C Z", "C Z", "A Z", "B Z", "C Z", "A Y", "C Z", "C Z", "C Z", "A Y", "C Z", "B Y", "B X", "C Z", "A Y", "B X", "C Y", "A Y", "C Z", "C Z", "C Y", "A Z", "B Z", "C Z", "C Z", "B Z", "C Y", "C X", "C Y", "C Y", "B Z", "C Z", "B Z", "C Z", "A Y", "A Y", "A Y", "B Z", "C Z", "A Z", "C Z", "C Y", "B Z", "B Z", "C Y", "C Z", "C Z", "A Y", "C Z", "C Z", "B Z", "C Z", "C X", "A X", "A Y", "A Y", "B Z", "C Z", "B X", "A Y", "B Z", "C Z", "C Z", "B Z", "A Y", "C Z", "C Z", "B X", "A Y", "C Z", "B X", "A Y", "C Z", "C X", "A Z", "B Z", "B Z", "C Z", "C X", "A Y", "C Z", "C Z", "A Y", "B Z", "C Z", "A Y", "C Z", "A Y", "C Z", "B Z", "C Z", "A X", "B Z", "C Z", "C Z", "C X", "B Y", "A Y", "A X", "C X", "B Z", "C Z", "C X", "B Z", "C Z", "C Z", "C Z", "C Z", "A Z", "C Z", "A Y", "B X", "C Z", "C Z", "B Z", "B Z", "C X", "B Z", "B X", "C Z", "C Z", "C Z", "A Y", "C Z", "C Z", "C Z", "C Z", "A Y", "A Z", "B Z", "C Y", "A Z", "C Z", "C Z", "C Z", "B X", "B Z", "C Z", "B Z", "C Z", "C X", "C Z", "A X", "C Z", "C Z", "C Z", "C Z", "C Z", "A Y", "A Y", "B Z", "B Z", "B Z", "B Z", "C Z", "C Z", "C Z", "C Z", "A Z", "A Y", "C Z", "A Z", "A Y", "C Z", "C Z", "C Y", "A Y", "B Z", "C X", "B Z", "A Y", "C Z", "A Y", "C Z", "B Z", "B Z", "B Z", "C Z", "C Z", "A Z", "A Y", "C X", "A Y", "C Z", "A Y", "C Z", "C Z", "A Y", "B Z", "C Z", "C Y", "C Z", "B Z", "B Z", "B Z", "C Y", "C Z", "B Z", "C X", "B Z", "A Y", "B Z", "C Z", "A Y", "C Z", "C Y", "C Z", "C Z", "C Z", "C Z", "B X", "B Z", "C Z", "C Z", "A Y", "C Y", "C Z", "C Z", "C Z", "C Z", "C Z", "C X", "B Z", "C X", "A Y", "B X", "A Y", "C Z", "B Z", "A Y", "B Z", "C Z", "A Y", "C Z", "C Z", "C X", "C X", "C Z", "B Z", "C X", "C Z", "A X", "A Z", "C Z", "C Y", "A Y", "A X", "B Z", "C Z", "C Z", "B Z", "A Y", "C Z", "A X", "B Z", "B Z", "A X", "C Y", "C Z", "A Y", "B Z", "C Z", "C Z", "C Z", "B Z", "C Z", "B Z", "C Z", "B X", "B Z", "C Z", "A X", "C Z", "A X", "C Z", "A Y", "C Z", "A Z", "C Z", "C Z", "C Z", "B X", "A Y", "A Y", "A X", "B Z", "B Z", "C Y", "C Z", "B Z", "A X", "C Z", "A Y", "C Z", "C Z", "B Z", "C Z", "C X", "B X", "B Z", "B X", "C Z", "C Z", "B Z", "A Z", "C Z", "C Y", "C Y", "C Z", "C Z", "C Z", "C Z", "C Z", "C Z", "A X", "A Z", "C Z", "B Z", "B Z", "B Z", "C X", "A Z", "C Z", "C Z", "B Z", "B Z", "C Z", "B X", "C Z", "B Z", "C Z", "C Z", "C Z", "C Z", "A X", "A Z", "A Y", "C Z", "A Z", "A Y", "C Z", "A Z", "C Z", "A Y", "C Z", "B Z", "C Z", "A Y", "C Y", "A Y", "B Z", "A Y", "B Z", "C Z", "B X", "C X", "C Z", "B Z", "A Z", "C Z", "B X", "C Y", "C Z", "C Y", "A X", "C X", "C X", "B Z", "A Y", "C Z", "A Z", "B Z", "C Z", "C X", "C Z", "C Z", "C Z", "C Z", "C Z", "B Z", "B Z", "C Z", "C Z", "C Z", "C Z", "C X", "A Z", "C Z", "A Y", "A Y", "C Z", "C Z", "C Y", "C Z", "A Y", "C Z", "B Z", "B X", "A Z", "A Y", "A Y", "C Z", "A Y", "C Z", "A X", "A Y", "B X", "C Z", "C Z", "A Z", "C Z", "A Y", "B Z", "A Y", "C Z", "C Z", "B Z", "C X", "C Z", "C Z", "C Z", "C Y", "C Z", "B X", "C Z", "C Z", "B X", "A Z", "C Z", "C X", "C X", "B Z", "C Z", "C Z", "B Z", "C Z", "C Z", "B Z", "B Z", "B Z", "B Z", "B Z", "A Z", "C X", "C Y", "C Z", "A Y", "C Z", "B Z", "A Y", "C Z", "C Z", "B Z", "B Z", "C Z", "A Z", "A X", "A Y", "C Z", "A Z", "C Z", "C X", "B Z", "C Z", "A X", "B Z", "B X", "C Z", "C Z", "C Z", "B X", "C Z", "B Z", "B Z", "A Y", "A Y", "A Z", "C Z", "C Z", "C Z", "B Z", "C Z", "B Z", "C Z", "A Z", "C Z", "C X", "C Z", "C Z", "C Z", "B Z", "A Y", "C Y", "C Z", "C Z", "C Z", "C Z", "B Z", "C Y", "C Z", "A Z", "C Y", "C Z", "B X", "A Y", "A Y", "A X", "B Z", "B Z", "C Z", "A Y", "B X", "A Y", "C X", "C Z", "A Y", "C X", "C Z", "C Z", "A Z", "C X", "C Z", "C X", "C Z", "A Y", "C Z", "C Z", "B Z", "C Z", "C Y", "A Z", "C X", "C Y", "C Z", "C Z", "C Y", "B Z", "B Z", "C X", "C Z", "C Z", "C Z", "C Z", "B Z", "C Z", "C Z", "C Z", "B Y", "C Y", "C Z", "B Z", "C Z", "C Z", "C Y", "B Z", "A Y", "A Z", "C Y", "C Y", "C Z", "C X", "C Z", "A Z", "C Z", "C Z", "A Y", "A Z", "C Z", "A Z", "C Z", "B Z", "B X", "B Z", "B Z", "A Z", "C Z", "A Y", "C Z", "C Y", "C Z", "A Z", "B Z", "B Z", "B Z", "C Z", "B Z", "A Z", "A Y", "C Z", "C Z", "C Z", "C Z", "C Z", "A Z", "C Z", "A Z", "A X", "B Z", "A Y", "C X", "A Z", "B X", "B Y", "A Y", "B Z", "A Z", "B Z", "B Z", "C Z", "A Z", "B Z", "B Z", "A Y", "C Y", "C Y", "A X", "C Z", "C Z", "C Z", "C X", "C Z", "C Z", "C Z", "C Z", "B Z", "A Y", "C Z", "C Z", "C Z", "A Z", "C X", "C Z", "B Z", "C Y", "B X", "B Y", "C Z", "C Z", "A X", "C Y", "C X", "B Z", "B Z", "C Z", "B Z", "C Y", "C Y", "C Y", "C X", "C Z", "C Z", "C Z", "C X", "A Y", "C Z", "C Z", "B Z", "A Z", "C Z", "A Y", "B X", "C Z", "C X", "C Z", "A Z", "B Z", "A Y", "C Z", "C Z", "C Z", "A Z", "C Z", "C Z", "C X", "C Z", "C Z", "B Z", "C Z", "B Z", "C X", "C Z", "A Y", "A Y", "C Z", "C Z", "B Z", "C Z", "C Z", "C X", "C Z", "A Y", "C Z", "C Z", "C Z", "B Z", "C Z", "A Y"};

    public static void main(String[] args) {
      //firstProblem();
      secondProblem();
    }

    public static char draw(char oppenentChoice){
        if (oppenentChoice == 'C'){
            return 'Z';
        }

        if (oppenentChoice == 'B'){
            return 'Y';
        }

        if (oppenentChoice == 'A'){
            return 'X';
        }
        return 'l';

    }

    public static char loss(char oppenentChoice){
        if (oppenentChoice == 'C'){
            return 'Y';
        }

        if (oppenentChoice == 'B'){
            return 'X';
        }

        if (oppenentChoice == 'A'){
            return 'Z';
        }
        return 'l';

    }

    public static char win(char oppenentChoice){
        if (oppenentChoice == 'C'){
            return 'X';
        }

        if (oppenentChoice == 'B'){
            return 'Z';
        }

        if (oppenentChoice == 'A'){
            return 'Y';
        }
        return 'l';

    }

    public static void secondProblem(){
        int score = 0;
        int count = 0;
        for (String game:games) {
            count++;
            char opponentChoice = game.charAt(0);
            char myChoice = game.charAt(2);

            if (myChoice == 'Z'){
                // win
                myChoice = win(opponentChoice);
            } else if (myChoice == 'Y') {
                // draw
                myChoice = draw(opponentChoice);
            } else if (myChoice == 'X') {
                // lost
                myChoice = loss(opponentChoice);
            }

            if (myChoice == 'Z'){
                // workout score for result
                if (opponentChoice == 'B'){
                    score += 6;
                } else if (opponentChoice == 'C'){
                    score += 3;
                }
                // score for selecting
                score += 3;
            } else if (myChoice == 'Y') {
                if (opponentChoice == 'A'){
                    score += 6;
                } else if (opponentChoice == 'B'){
                    score += 3;
                }
                score += 2;
            } else if (myChoice == 'X') {
                if (opponentChoice == 'C'){
                    score += 6;
                } else if (opponentChoice == 'A'){
                    score += 3;
                }
                score += 1;
            }
        }

        println(String.valueOf(score));
        println(String.valueOf(count));
    }

    public static void firstProblem(){
        int score = 0;
        int count = 0;
        for (String game:games) {
            count++;
            char opponentChoice = game.charAt(0);
            char myChoice = game.charAt(2);

            if (myChoice == 'Z'){
                // workout score for result
                if (opponentChoice == 'B'){
                    score += 6;
                } else if (opponentChoice == 'C'){
                    score += 3;
                }
                // score for selecting
                score += 3;
            } else if (myChoice == 'Y') {
                if (opponentChoice == 'A'){
                    score += 6;
                } else if (opponentChoice == 'B'){
                    score += 3;
                }
                score += 2;
            } else if (myChoice == 'X') {
                if (opponentChoice == 'C'){
                    score += 6;
                } else if (opponentChoice == 'A'){
                    score += 3;
                }
                score += 1;
            }
        }

        println(String.valueOf(score));
        println(String.valueOf(count));
    }

}
