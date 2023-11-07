package org.example.structural_patterns.facade_design_pattern;

import java.util.Scanner;

public class FacadePatternClient {
    static int choice;
    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("""
                    ======Mobile Shop======
                    1. Iphone
                    2. Samsung
                    3. Xiaomi
                    4. Exit
                    Enter your choice :
                    """);
            choice = scanner.nextInt();
            if (choice==4) {
                break;
            }
            ShopKeeper shk=new ShopKeeper();
            switch (choice) {
                case 1:{
                    shk.iphoneSale();
                }
                case 2:{
                    shk.samsungSale();
                }
                case 3:{
                    shk.xiaomiSale();
                }
            }
            System.out.println();
        }while (true);
    }
}
