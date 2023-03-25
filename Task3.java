import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        FillList(mylist);
        
        int minValue = Collections.min(mylist);
        int maxValue = Collections.max(mylist);
        System.out.print(mylist);
        Collections.sort(mylist);
        System.out.println("\n" + mylist);



        int sum = 0;
        for (Integer i : mylist) {
            sum+= i;
        }
        
        int average = sum / mylist.size();

        int closest = mylist.get(0);
        int diff = Math.abs(closest - average);
        System.out.println(diff);
        for (int i : mylist) {
            int newDiff = Math.abs(i - average);
            // System.out.println(newDiff);
            if (newDiff < diff){
                closest = i;
                diff = newDiff;
            }
        
        }
        System.out.println();
        System.out.println("\n" + "Минимальное значение в списке: " + minValue);
        System.out.println("\n" + "Максимальное значение в списке: " + maxValue);
        System.out.println("Среднее значение в списке: " + closest);
        
    }

    static void FillList(ArrayList <Integer> mylist){
        
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            mylist.add(random.nextInt(0, 50));

        }
    }
}
