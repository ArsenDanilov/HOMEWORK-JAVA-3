import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
public class Task2 {
    

    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        FillList(mylist);
        System.out.println("\n" + "Вывод списка, сформированного из 15 псевдослучайных чисел: " + mylist);
        DeleteEvenElement(mylist);
        System.out.println("\n" + "Вывод массива без элементов с четным значением: " + mylist);

    }

    static void FillList(ArrayList <Integer> mylist){
        
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            mylist.add(random.nextInt(0, 50));

        }
    }

    static void DeleteEvenElement(ArrayList <Integer> mylist){
        Iterator <Integer> mylistIterator = mylist.iterator();

        while (mylistIterator.hasNext()){
            int item = mylistIterator.next();
            if (item % 2 == 0){
                mylistIterator.remove();
            }
        }
    }
    
}
