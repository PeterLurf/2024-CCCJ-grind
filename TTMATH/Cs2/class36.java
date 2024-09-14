package TTMATH.Cs2;
import java.io.*;
import java.util.*;
public class class36 {
    public static void main(String[] args) throws IOException{
        //An Animal Contest 6 P2 - G-Pop

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        n= n*2;
        int[] arr = new int[n];
        String s = in.readLine();
        String[] tokens = s.split(" ");
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        int[][] idWithWeight = new int[n][2];
        for(int i = 0; i<n; i++) {
            idWithWeight[i][0] = i+1;
            idWithWeight[i][1] = arr[i];
        }

        //sort by weight
        Arrays.sort(idWithWeight, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        //convert idWithWeight to 2d arraylist
        ArrayList<ArrayList<Integer>> idWithWeightList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<n; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(idWithWeight[i][0]);
            temp.add(idWithWeight[i][1]);
            idWithWeightList.add(temp);

    
        }

        //clone the list
        ArrayList<ArrayList<Integer>> idWithWeightListClone = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<idWithWeightList.size(); i++) {
            idWithWeightListClone.add(idWithWeightList.get(i));
        }




        //start from first element and find the element with the smallest difference and print the two elements and remove them from the list and how many sucessful pars
        int pairs = 0;

        while(idWithWeightList.size() > 0) {
            int minDiff = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int i = 1; i<idWithWeightList.size(); i++) {
                int diff = Math.abs(idWithWeightList.get(i).get(1) - idWithWeightList.get(0).get(1));
                if(diff < minDiff) {
                    minDiff = diff;
                    minIndex = i;
                }
                if (diff > 0) {
                    pairs++;
                }
            }
            idWithWeightList.remove(minIndex);
            idWithWeightList.remove(0);

        }
        System.out.println(pairs/2);
        
        // Print the pairs
        while(idWithWeightListClone.size() > 0) {
            int minDiff = Integer.MAX_VALUE;
            int minIndex = 0;
            for(int i = 1; i<idWithWeightListClone.size(); i++) {
                int diff = Math.abs(idWithWeightListClone.get(i).get(1) - idWithWeightListClone.get(0).get(1));
                if(diff < minDiff) {
                    minDiff = diff;
                    minIndex = i;
                }
            }
            System.out.println(idWithWeightListClone.get(0).get(0) + " " + idWithWeightListClone.get(minIndex).get(0));
            idWithWeightListClone.remove(minIndex);
            idWithWeightListClone.remove(0);
        }
    }

}
