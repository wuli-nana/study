package classes;

import java.util.Scanner;

public abstract class  User {
    private String id;
    private String name;

    public User (String id,String name ){
        this.id = id;
        this.name = name;
    }

    public static User login(){
        User user;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入学号");
            String id = scanner.nextLine();
            System.out.println("请输入姓名");
            String name = scanner.nextLine();
            System.out.println("请输入角色");
            String role = scanner.next();

            if (role.equals("老师")) {
                user = new teacher(id, name);
                break;
            } else if (role.equals("学生")) {
                user = new student(id, name);
                break;
            }
            System.out.println("输入错误，请重新输入");
        }
            return user;
    }

    public abstract void  menu();
    public abstract boolean input();
}
