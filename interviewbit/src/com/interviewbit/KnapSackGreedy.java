package com.interviewbit;

import java.util.Arrays;
import java.util.Comparator;

public class KnapSackGreedy {

    public static void main(String args[]) {
        //int profit[] = {10, 5, 8, 12, 4};
        //int weight[] = {5, 1, 2, 3, 4};
        int profit[] = {10,5,15, 7, 6,18,3};
        int weight[] = {2, 3, 5, 7, 1, 4,1};
        double capacity = 15;
        double totalValue = 0;

        ItemValue totalItems[] = new ItemValue[profit.length];

        for (int i = 0; i < profit.length; i++) {
            ItemValue itemValue = new ItemValue(profit[i], weight[i], i);
            totalItems[i] = itemValue;
        }

        Arrays.sort(totalItems, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue o1, ItemValue o2) {
                return o1.ratio.compareTo(o2.ratio);
            }
        });

        printArray(totalItems);

        for (int j = totalItems.length - 1;j>=0;j--) {
            ItemValue i = totalItems[j];
            if (i.weight <= capacity) {
                totalValue = totalValue + i.profit;
                capacity = capacity - i.weight;
            } else{
                double fraction = capacity / i.weight;
                totalValue = totalValue + i.profit * fraction;
                capacity = capacity - i.weight * fraction;
                break;
            }
        }

        System.out.println("Total Profit = "+totalValue);
    }

    static void printArray(ItemValue arr[]) {
        int n = arr.length;
        System.out.println("Index "+"Profit "+" Weight"+" P/W Ratio");
        for (int i = 0; i < n; ++i)
            System.out.print(" "+arr[i].index+"      "+arr[i].profit+"      "+arr[i].weight+"         "+arr[i].ratio+"\n");
        System.out.println();
    }

}

class ItemValue {

    double profit;
    double weight;
    Double ratio;
    int index;

    public ItemValue(double profit, double weight, int index) {
        this.profit = profit;
        this.weight = weight;
        this.index = index;
        ratio = profit / weight;

    }

}
