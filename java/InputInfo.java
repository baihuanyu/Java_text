import java.util.Scanner;

public class InputInfo {
    public static void main(String[] args) {
        System.out.println("*************欢迎进入商品管理系统***********");
        System.out.println("1.用户登陆 2。 用户注册 3。查询商品");
        System.out.println("4。添加商品 5。订单查询 6。购物查询");
        System.out.println("7.退出系统");
        System.out.println("请选择：");
        //创建一个scanner的类
        Scanner sc = new Scanner(System.in);

        //读取内容
        String str = sc.next();
        System.out.println("用户输入的是："+str);
    }
}

/*scanner类中：
    next（）和nextline（）的区别 next前面空格不算字符

*/