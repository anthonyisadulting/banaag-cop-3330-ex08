package base;

import java.util.Scanner;

public class app {
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    System.out.print("How many people?");
    String input0 = in.nextLine();
    int num0 = Integer.parseInt(input0);

    System.out.print("How many pizzas do you have?");
    String input1 = in.nextLine();
    int num1 = Integer.parseInt(input1);

    System.out.print("How many slices per pizza?");
    String input2 = in.nextLine();
    int num2 = Integer.parseInt(input2);

    int totalslices = num1 * num2;

    int pizperperson = totalslices / num0;

    int leftover = totalslices % num0;


    System.out.print(num0 + " people with " + num1 + " pizzas" + " (" +
                    totalslices + " slices)");

    System.out.print("\nEach person gets " + pizperperson + " pieces of pizza.\n");

    System.out.print("\nThere are " + leftover + " leftover pieces.");








}
}
