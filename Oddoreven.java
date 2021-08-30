package com.training.basics;

import java.util.Scanner;

public class Oddoreven
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println(num + " is a even number...");
        }
        else
        {
            System.out.println(num + " is a Odd number....");
        }

    }
}
