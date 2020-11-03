public class DataTransfor {
  public static void main(String[] args){
  	// 通常来说，声明赋值long类型需要在最后新增一个L
  	long num1 = 239L;
  	// 整数默认类型为int，这里发生了一次转换，将int类型隐式转换成了long类型
  	// 遵循了数据范围从小到大的规则
  	long num2 = 239;
  	double num3 = 2.34F;// 这里将float类型转换成了double类型
  	float num4 = 30L;// 这里将long类型隐式转换成了float类型
    System.out.println(num1);
    System.out.println(num4);
  }
}