package com.interviewbit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSequencingGreedy {

    public static void main(String args[]){
        int profit[] = {20,15,10,5,1};
        int deadline[] = {2,2,1,3,3};
        Job listJob[] = new Job[profit.length];
        int maximumSlot = 3;

        for(int i=0;i<profit.length;i++){
            Job job = new Job("J"+i,deadline[i],profit[i]);
            listJob[i] = job;
        }

        Arrays.sort(listJob, new Comparator<Job>() {
            @Override
            public int compare(Job o1, Job o2) {
                return o2.profit - o1.profit;
            }
        });

        String jobSequence[] = new String[maximumSlot];
        boolean slotAvailability [] = new boolean[maximumSlot];
        int totalProfit = 0;

        for(int i=0;i<listJob.length;i++){
            for(int j=Math.min(maximumSlot-1,listJob[i].deadline-1);j>=0;j--){
                if(!slotAvailability[j]){
                    slotAvailability[j] = true;
                    jobSequence[j] = listJob[i].name;
                    totalProfit = totalProfit + listJob[i].profit;
                    break;
                }
            }
        }

        printArray(listJob);
        for(String sequence:jobSequence){
            System.out.print(sequence+"   ");
        }
        System.out.println("Total Profit = "+totalProfit);

    }

    static void printArray(Job arr[]) {
        int n = arr.length;
        System.out.println("Index "+"Profit "+" Deadline");
        for (int i = 0; i < n; ++i)
            System.out.print(" "+arr[i].name+"      "+arr[i].profit+"      "+arr[i].deadline+"\n");
        System.out.println();
    }
}

class Job{
    String name;
    int deadline;
    int profit;

    public Job(String name,int deadline,int profit){
        this.name = name;
        this.profit = profit;
        this.deadline = deadline;
    }
}