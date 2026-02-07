package org.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    public static void startGrocery() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen çıkmak için 0, ürün eklemek için 1, ürün çıkarmak için 2 ye basınz.");
        int choice = input.nextInt();

        switch (choice) {
            case 0:
                break;
            case 1:
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String urunler=input.nextLine();
                addItems(urunler);

            case 2:
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                String urunler1 = input.nextLine();
                removeItems(urunler1);



        }




    }
    public static void addItems(String input){
        groceryList.add(input);


    }

    public static void removeItems(String input){
        groceryList.remove(input);
    }

    public static boolean checkItemIsInList(String product){
            return groceryList.contains(product);
    }

    public static void printSorted(){
        for(String item : groceryList){
            System.out.println(item);
        }
    }

}
