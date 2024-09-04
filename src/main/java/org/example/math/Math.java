package org.example.math;

import java.util.HashMap;
import java.util.Map;

public class Math {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println("НОК: " + a + " и " + b + " равно: " + findBTM(a, b));
    }

    public static int findBTM(int a, int b) {
        //хранит простые множители
        Map<Integer, Integer> factorsA = getFactors(a);
        Map<Integer, Integer> factorsB = getFactors(b);

        //множители для НОК и их степени
        Map<Integer, Integer> btmFactors = new HashMap<>();

        //множители
        for (Integer prime : factorsA.keySet()) {
            int value = java.lang.Math.max(factorsA.get(prime), factorsB.getOrDefault(prime, 0));
            btmFactors.put(prime, value);
        }
        //множители
        for (Integer prime : factorsB.keySet()) {
            if (!btmFactors.containsKey(prime)) {
                btmFactors.put(prime, factorsB.get(prime));
            }
        }
        int btm = 1;
        for (Map.Entry<Integer, Integer> entry : btmFactors.entrySet()) {
            btm *= java.lang.Math.pow(entry.getKey(), entry.getValue());
        }

        return btm;
    }

    //простые множители числа и их степени
    private static Map<Integer, Integer> getFactors(int number) {
        Map<Integer, Integer> factors = new HashMap<>();
        int minMultiplate = 2;
        while (number >= minMultiplate) {
            if (number % minMultiplate == 0) {
                factors.put(minMultiplate, factors.getOrDefault(minMultiplate, 0) + 1);
                number /= minMultiplate;
            } else {
                minMultiplate++;
            }
        }
        return factors;
    }
}
