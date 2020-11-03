// 创建一个类，类名必须和文件名一致，大小写也必须一致
public class HelloWorld {
  // mian方法
  public static void main(String[] args){
    // 打印输出语句
    int num = 100; // 声明变量并赋值
    System.out.println("Hello World,Len");
    System.out.println(num);
    {
      // 作用域
      long num2 = 1110000L;
      System.out.println(num2);
    }
    // 可以在作用域外再声明一个同样的变量
    float num2 = 111.45F;
    System.out.println(num2);
  }
}