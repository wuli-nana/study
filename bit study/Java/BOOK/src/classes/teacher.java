package classes;

import java.util.Scanner;

public class teacher extends User {
    public teacher(String id,String name){
        super(id,name);
    }
    @Override
    public void menu() {
        System.out.println("**    0.quit          ** ");
        System.out.println("**    1.上架          ** ");
        System.out.println("**    2.查询图书      ** ");
        System.out.println("**    3.浏览借阅记录  ** ");

    }

    @Override
    public boolean input() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input){
            case 0:
                break;
            case 1:
                System.out.println("上架");
                putBook();
                break;
            case 2:
                System.out.println("查询图书");
                return true;
            case 3:
                System.out.println("浏览借阅记录");
                return true;
        }
        return false;
    }
    private void putBook(){


    }
}
