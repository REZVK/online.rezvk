package scanner;

import java.util.Scanner;

/*
 * FileName:  ScannerTest
 * Author:    REZ_VK
 * Date  :   2019-5-10 22:40
 * info :    这个是..从键盘获取变量
 * */
public class ScannerTest {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scanner.next();
        System.out.println("姓名:"+name);

        System.out.println("请输入你的年龄");
        int age = scanner.nextInt();
        System.out.println("年龄："+age);

        System.out.println("请输入薪资");
        double salary = scanner.nextDouble();
        System.out.println("薪资:"+salary);

        System.out.println("是否同意true/false");
        boolean bool = scanner.nextBoolean();
        System.out.println(bool);

    }
}
