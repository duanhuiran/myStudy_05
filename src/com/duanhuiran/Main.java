package com.duanhuiran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int x = 1;
        float y = 1.1f;
        System.out.println(x == y);
        System.out.println(x <= y);
        System.out.println(x != y);

        int temperature = 25;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecords = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecords;

        System.out.println(isEligible);

// if 语句怎么写？区别于python！
// if执行顺级而下，可以不用写 && temp <=30
// 单个执行的语句可以不用加大括号{}
// 判断条件要用()圆括号包起来

        int temp = 21;
        if (temp > 30) {
            System.out.println("The weather is hot.");
            System.out.println("Drink some water.");
        }
        else if (temp > 20 && temp <= 30)
            System.out.println("The weather is warm.");

        else
            System.out.println("The weather is cold.");


//如何简化if语句？简化代码？
        int income = 120_000;
        boolean isHighIncome = (income > 100_000);
        System.out.println(isHighIncome);

//如何写得更职业？还可以设定默认值，减少if语句
        String className = "Economy";
        if (income > 100_000)
            className = "First";
        System.out.println(className);

//进一步优化——如何把if语句全部去除？
//      变量 = 判断条件 ？ 如果true，返回什么值 : 如果false，返回什么值。
        String className2 = income > 100_000 ? "First" : "Economy";
        System.out.println(className2);

//Switch Statements
//一定要在case后加break，跳出switch，不然会一直执行后面的代码！！！default不用加。
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You're an admin.");
                break;
            case "moderator":
                System.out.println("You're a moderator.");
                break;
            default:
                System.out.println("You're a guest.");
        }

//Practice: Fizz & Buzz

        System.out.print("Input an integer number:");
        Scanner inputNumber = new Scanner(System.in);
        int num = inputNumber.nextInt();
        boolean isFizz = ((num % 5 == 0) && (num % 3!= 0));
        boolean isBuzz = ((num % 3 == 0) && (num % 5!= 0));
        boolean isFizzBuzz = ((num % 3 == 0) && (num % 5== 0));

        if (isFizzBuzz)
            System.out.println("The number is FizzBuzz");
        else if (isFizz)
            System.out.println("The number is Fizz");
        else if (isBuzz)
            System.out.println("The number is Buzz");
        else
            System.out.println(num);







    }


}
