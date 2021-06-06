package Ex10;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

public class Example10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num_items = 3,sub_total = 0;

        String[] items = new String[num_items]; // bad practice in C, in Java?
        int[] num_conv_items = new int[num_items];
        String [] quant_items = new String[num_items];
        int[] quant_conv_items = new int[num_items];

        for(int i=0;i<num_items;i++)
        {
            System.out.print("Enter the price of item " + (i+1) + ": ");
            items[i] = input.next();

            System.out.print("Enter the quantity of item " + (i+1) + ": ");
            quant_items[i] = input.next();
        }

        for(int i=0;i<num_items;i++)
        {
            num_conv_items[i] = Integer.parseInt(items[i]);
            quant_conv_items[i] = Integer.parseInt(quant_items[i]);
            sub_total += num_conv_items[i] * quant_conv_items[i];
        }

        double tax = sub_total * 0.055;
        double total = sub_total + tax;

        System.out.printf("Subtotal is: $" + total + ".00%nTax: $"
                + tax + "%nTotal: $" + (tax+total));
    }
}
