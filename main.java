package bai1;

import java.util.Scanner;

/**
 *
 * @author trang
 */
public class main {
    public static void main(String[] args) {
        Order order = new Order();
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1. Nhap hoa don");
            System.out.println("2. In hoa don");
            System.out.println("Vui long chon: ");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    order.Nhap ();
                    break;
                case 2:
                    order.in();
                    break;
                default:
            }
        }while(menu!=0);
    }
}