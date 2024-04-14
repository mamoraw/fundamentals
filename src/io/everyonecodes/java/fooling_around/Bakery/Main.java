package io.everyonecodes.java.fooling_around.Bakery;

import java.util.*;

public class Main {
    public static List<Integer> findUnpaidDays(String transactions) {
        Map<Integer, Integer> dailySales = new HashMap<>();
        Map<Integer, Integer> payments = new HashMap<>();
        Set<Integer> unpaidDays = new TreeSet<>();
        String[] split = transactions.split(" ");

        for (int i = 0; i < split.length; i += 3) {
            int day = Integer.parseInt(split[i + 1]);
            int amount = Integer.parseInt(split[ i +2]);

            if (split[i].equals("F")) {
                dailySales.put(day, dailySales.getOrDefault(day, 0) + amount);
            } else if (split[i].equals("B")) {
                payments.put(day, payments.getOrDefault(day, 0) + amount);
            }
        }

        for (int day : dailySales.keySet()) {
            int sales = dailySales.get(day);
            int payment = payments.getOrDefault(day, 0);

            if (sales > payment) {
                unpaidDays.add(day);
            }
        }

        return new ArrayList<>(unpaidDays);
    }

    public static void main(String[] args) {
        String transactions = "F 1 123395 F 2 488034 F 3 78861 F 4 200882 F 5 102517 F 6 49658 F 7 201804 F 8 247860 F 9 356333 F 10 163982 F 11 351283 F 12 305592 F 13 443860 F 14 111094 F 15 216152 F 17 220897 F 16 184823 F 19 438974 F 18 464208 B 1 61697 B 2 9577 B 2 244017 B 3 30849 B 3 39430 B 4 244017 B 4 19716 B 4 100441 B 5 19715 B 5 51258 B 6 100441 B 6 25630 B 6 24829 B 7 25629 B 7 100902 B 8 24829 B 8 123930 B 9 100902 B 9 61965 B 9 178166 B 10 61965 B 10 89084 B 10 81991 B 11 89083 B 11 175641 B 12 81991 B 12 152796 B 13 175642 B 13 76398 B 13 221930 B 14 76398 B 14 110965 B 14 55547 B 15 110965 B 15 27774 B 15 108076 B 17 73709 B 17 46206 B 17 110448 B 16 27773 B 16 92411 B 19 110449 B 19 116052 B 19 219487 B 18 46206 B 18 232104 B 21 219487 B 20 116052";

        List<Integer> unpaidDays = findUnpaidDays(transactions);

        unpaidDays.forEach(a -> System.out.print(a + " "));
    }
}

