import java.util.Scanner;

public class TestVarInpt {
    public static void main(String[] args) {
        System.out.println("请输入姓名和年龄：");
        Scanner sc = new Scanner(System.in);
        //读取输入信息中的字符
        String name = sc.next();

        int age = sc.nextInt();

        System.out.println("姓名是："+name+" \n年龄是："+age);

    }

}
