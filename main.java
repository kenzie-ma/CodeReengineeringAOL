// """
// Copyright (c) 2025 Ahmed R. Sadik, Honda Research Institute Europe GmbH 

// This source code is licensed under the MIT License found in the
// LICENSE file in the root directory of this source tree. This dataset contains smelly code for research and refactoring purposes.
// """


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        double averageTime = measureExecutionTime();
        printMeasurement(averageTime);
    }

    public static double measureExecutionTime() {
        int runs = 10;
        List<Long> executionTimes = new ArrayList<>();

        for (int i = 0; i < runs; i++) {
            long startTime = System.nanoTime();

            Shop shop = new Shop();
            Customer customer = new Customer(shop);
            customer.orderPizza(PizzaType.CHEESE);
            customer.complain("The pizza is too cold.");

            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            executionTimes.add(executionTime);
        }

        double totalExecutionTime = 0;
        for (Long time : executionTimes) {
            totalExecutionTime += time;
        }
        
        double avgTime =  totalExecutionTime / runs / 1_000_000_000.0;
        return avgTime;
    }

    public static void printMeasurement(double measureExecutionTime){
        System.out.println("Average execution time over multiple runs: " + 
                    measureExecutionTime + " seconds");
    }
}
