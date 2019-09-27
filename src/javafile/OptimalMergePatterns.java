package javafile;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class OptimalMergePatterns {
    // Function to find minimum computation
    static int maxComputation(int size, int files[]) {

        // create a min heap
        PriorityQueue<Integer> pq
                = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < size; i++) {

            // add sizes to priorityQueue
            pq.add(files[i]);
        }

        // variable to count total computations
        int count = 0;

        while (pq.size() > 1) {

            // pop two smallest size element
            // from the min heap
            int temp = pq.poll() + pq.poll();

            // add the current computations
            // with the previous one's
            count += temp;

            // add new combined file size
            // to priority queue or min heap
            pq.add(temp);
        }

        return count;
    }

    public static void main(String[] args) {

        // no of files
//        int size = 3;

        // 6 files with their sizes

        Scanner dd = new Scanner(System.in);

        int size = dd.nextInt();
        int files[] = new int[size];

        for (int i = 0; i < size; i++) {
            files[i] = dd.nextInt();
        }

            // total no of computations
            // do be done final answer
            System.out.println(maxComputation(size, files));
    }
}

