package procon;

import java.util.Scanner;

/*
 * FileName:  SwitchTest
 * Author:    REZ_VK
 * Date  :   2019-5-11 10:56
 * info :    这个是..switch基本语法

 1.格式
    switch(表达式){
    case 常量1:
        执行语句1;
        //break;
    case 常量2:
        执行语句2;
        //break;
    ...
    default:
        执行语句n;
        //break;
    }
2.说明：
① 根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，则进入相应case结构中，调用其执行语句。
  当调用完执行语句以后，则仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构
  末尾结束为止。

② break,可以使用在switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构

③ switch结构中的表达式，只能是如下的6种数据类型之一：
   byte 、short、char、int、枚举类型(JDK5.0新增)、String类型(JDK7.0新增)

④ case 之后只能声明常量。不能声明范围。

⑤ break关键字是可选的。

⑥ default:相当于if-else结构中的else.
  default结构是可选的，而且位置是灵活的。
 * */
public class SwitchTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str;
        for(;;){
            System.out.print("请输入：");
            str = scanner.next();
            if("弟弟".equals(str)||"弟中弟".equals(str)){
                break;
            }
            System.out.print("输入有误，请重新输入：");
        }
        switch(str){
            case "弟弟":
                System.out.println(str);
                break;
            case "弟中弟":
                System.out.println(str);
                break;
            default:
                System.out.println("呵呵");
                break;
        }
    }

}
