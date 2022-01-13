package com.revature.jan13.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1 {
    public static void main(String[] args) {
        //different ways to get the print
//        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println("The received integer "+integer);
//            }
//        };

//        Consumer intConsumer = (a)-> System.out.println("The received integer: "+a);
        Consumer<Integer> intConsumer = System.out::println;
        intConsumer.accept(10);

        //for each loop example
        int[] values = new int[]{1,2,3,4};
        for (int value : values){
            System.out.println(value);
        }

//        List<Integer> intList = new ArrayList<>();
//        intList.add(7);

        //forEach method
        List<Integer> intList = Arrays.asList(7,6,5,4,3);
        intList.forEach(intConsumer);


        List<String> stringList = Arrays.asList("Apple", "Mango", "Banana", "Berry", "Android", "Microsoft");
        stringList.sort((str1, str2)->str1.compareTo(str2));
        stringList.forEach(System.out::println);

        int result = intList.stream()
                .filter((num) -> num%2 ==0)
                .reduce(0, (a, b)->a+b);
        System.out.println("Result: "+result);
    }
}
