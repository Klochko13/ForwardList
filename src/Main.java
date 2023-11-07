import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int n = kb.nextInt();

        ForwardList list = new ForwardList();
        for (int i = 0; i < n; i++) {
            list.push_front(rand.nextInt(100));
        }
      // list.push_back(123);
        //list.print();
       // list.pop_front();
       // list.pop_back();
        list.print();
//        System.out.println("Ведите значение добовляемого элемента: ");
//        int value = kb.nextInt();
//        System.out.println("Введите индекс добавляемого элемента: ");
//        int index = kb.nextInt();
       // list.insert(value, index);
        System.out.println("Введите индекс удаляемого элемента: ");
        int index_del = kb.nextInt();
        list.erase(index_del);
        list.print();
       // list.reverse();
     //  list.print();
     //   list.clear();


    }
}