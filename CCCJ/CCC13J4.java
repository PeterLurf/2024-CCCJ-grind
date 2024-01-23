import java.util.*;

public class CCC13J4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        //create arraylist 
        ArrayList<Integer> chores = new ArrayList<Integer>();
        int numChores = in.nextInt();
        for (int i = 0;i < numChores; i++) {
            chores.add(in.nextInt());
        }
        Collections.sort(chores);
        int total = 0;
        for (int i = 0; i < numChores; i++) {
            total += chores.get(i);
            if (total > time) {
                System.out.println(i);
                break;
            }
        } 
        in.close();
        
    }
}
