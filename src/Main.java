import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main myMain = new Main();
        int myRandomNum = myMain.RandomNumberFinder(100 , 101);
        System.out.println(myRandomNum);

        Name myName = new Name("kiarash" , " shojaei");

        myName.PrintFullName();

        // array lists

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);

        myArrayList.remove(0);
        boolean doesContainTwenty = myArrayList.contains(20);
        if (doesContainTwenty){
            System.out.println("the array list contains 20");
        }
        else{
            System.out.println("the array list does not contain 20");
        }
        System.out.println(myArrayList.get(0));

        // 2D array lists

        ArrayList<ArrayList<Integer>> my2DArrayList = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> my2DArrayList0 = new ArrayList<Integer>();
        ArrayList<Integer> my2DArrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> my2DArrayList2 = new ArrayList<Integer>();

        my2DArrayList0.add(1);
        my2DArrayList0.add(2);
        my2DArrayList0.add(3);

        my2DArrayList1.add(4);
        my2DArrayList1.add(5);
        my2DArrayList1.add(6);

        my2DArrayList2.add(7);
        my2DArrayList2.add(8);
        my2DArrayList2.add(9);

        my2DArrayList.add(my2DArrayList0);
        my2DArrayList.add(my2DArrayList1);
        my2DArrayList.add(my2DArrayList2);

        System.out.println(my2DArrayList.get(1).get(2));

        //Kshyst array list

        KshystArrayList kshystArrayList = new KshystArrayList();
        kshystArrayList.add(10);
        kshystArrayList.add(11);
        kshystArrayList.add(12);

        System.out.println(kshystArrayList.length);
        System.out.println(kshystArrayList.array[1]);
        kshystArrayList.pop();
        kshystArrayList.pop();
        System.out.println(kshystArrayList.array[1]);

        System.out.println("-----------------");

        kshystArrayList.clear();
        kshystArrayList.add(10);
        kshystArrayList.add(11);
        kshystArrayList.add(12);
        kshystArrayList.add(13);

        kshystArrayList.addAt(1 , 20);
        System.out.println(kshystArrayList.array[1]);
        System.out.println(kshystArrayList.array[2]);

        System.out.println("-----------------");

        //kshyst

    }

    private int RandomNumberFinder(int a , int b) {
        System.out.println("you are currently using the int mode of this method");

        int x = (int)(Math.random() * (b - a + 1)) + a;

        return x;
    }
    private double RandomNumberFinder(double a , double b) {
        System.out.println("you are currently using the double mode of this method");

        double x = (double) (Math.random() * (b - a + 1)) + a;

        return x;
    }
}