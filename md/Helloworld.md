# HelloWorld

## 编写第一段程序

```java
// 创建一个类，类名必须和文件名一致，大小写也必须一致
public class HelloWorld {
  // mian方法
  public static void main(String[] args){
    // 打印输出语句
    System.out.println("Hello World,Len");
  }
}
```

## 编译运行

cmd编译运行java语句

```bash
javac HelloWorld.java # 编译java，注意需要后缀
java HelloWorld #不需要后缀，运行的是编译后.class文件
```

> 这里需要注意的是，有些系统需要配置 CLASSPATH 环境变量，需要将运行的文件所在路径配置到 CLASSPATH 环境变量中去