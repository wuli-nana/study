package classes;

import java.util.Scanner;

public class student extends User {
    public student(String id ,String name){
        super(id,name);
    }
    @Override
    public void menu() {
        System.out.println("**    0.quit    ** ");
        System.out.println("**    1.查询图书    ** ");
        System.out.println("**    2.借阅图书    ** ");
        System.out.println("**    3.浏览借阅记录    ** ");

    }

    @Override
    public boolean input() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input){
            case 0:
                break;
            case 1:
                System.out.println("查询图书");
                return true;
            case 2:
                System.out.println("借阅图书");
                return true;
            case 3:
                System.out.println("浏览图书");
                return true;
        }
        return false;
    }
}
