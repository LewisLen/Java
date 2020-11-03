# 开启java学习之路

## JAVASE

## 计算机存储单元

- 位（bit）：一个数字0或者一个数字1，代表一位
- 字节（Byte）：每逢8位是一个字节，这是数据存储的最小单位

> 1Byte=8bit
> 1KB=1024Byte
> 1MB=1024KB
> 1GB=1024MB
> 1TB=1024GB
> 1PB=1024TB
> 1EB=1024PB
> 1ZB=1024EB

## 命令行工具-常用命令

```bash
dir # 查看当前目录下文件
cd \ # 回到当前根目录
cls # 清除当前屏幕
cd demo\test # 进入文件目录
```
## JVM\JRE\JDK

- JVM：虚拟机
- JRE（Java Runtime Evvironment）： 是Java程序的运行时环境，包含JVM和运行时所需要的核心类库
- JDK（Java Development Kit）： 是Java程序开发工具包，包含JRE和开发人员使用的工具

> 运行一个已有的Java程序，只需要安装JRE即可。开发一个全新Java程序，必须安装JDK

## 下载安装jdk

在[oracle](https://www.oracle.com/java/technologies/javase-downloads.html)官网下载SE即可，长期支持的版本有8和11，这边下载安装的是Java SE 11 (LTS)。

安装过程中需要注意的是：

1. 安装路径最好不要有空格，可以直接新建一个文件夹，比如javaJDK
2. 安装完之后需要配置环境变量
3. 新建一个环境变量`JAVA_HOME`，放置安装路径，如D:\javaJDK\jdk11
4. 在path路边加入java路径，%JAVA_HOME%\bin
5. 在cmd命令行工具中输入`java -version`查看版本信息
6. 至此，JDK已安装完成

## 标识符

类名、方法名和变量名即为标识符

- 大小写敏感
- 标识符不能以数字开头，不能是关键字
- 标识符应该已字母、$或者下划线（_）开始
- 类名：大驼峰命名方式，如`HelloWorld`，和所在文件的名称一致
- 变量：首字母小写，小驼峰命名方式，如 `getData`。方法名也一样

## 修饰符

- 访问控制修饰符：default、public、protected、private
- 非访问控制修饰符：final、abstract、static、synchronized

## 常量和变量

常量：运行期间，固定不变的常量

- 字符串常量，用双引号 "abc"
- 整数常量，即没有小数点。如100、-100
- 浮点数常量，即有小数点。如 2.5
- 字符常量，用**单引号**，有且只有一个字符的常量，可以为空格。如'a'、'中'、'9'、' '
- 布尔常量。true和false
- null

## 数据类型

### 基本数据类型

- 整数型 byte short int long
- 浮点型 float double
- 字符型 char
- 布尔型 boolean

|  数据类型  | 关键字  | 内存占用  | 取值范围 |
|  ----     |  ----  |   ----  |  ----   |
| 字节型        | byte      |   1个字节    |   -128～127                |
| 短整型        | short     |   2个字节    |   -32768～32767            |
| 整  型        | int       |   4个字节    |   -2^31~2^31-1             |
| 长整型        | long      |   8个字节    |   -2^63~2^63-1             |
| 单精度浮点型   | float     |   4个字节    |   1.4013E-45~3.4028E+38    |
| 双精度浮点型   | double    |   8个字节    |   4.9E-324~1.7977E+308     |
| 字符型        | char      |   2个字节    |   0～65535                 |
| 布尔类型      | boolean   |   1个字节    |   true、false              |
 
> 整数类名默认为 int，浮点型默认为 double
> 如果一定要使用float类型，则需要加上一个后缀F(或者f，推荐F)
> 如果一定要使用long类型，则需要加上一个后缀L(或者l，推荐L)

### 引用数据类型

- 字符串
- 数组
- 类

## 变量

创建变量：数据类型+变量名称
赋值：变量名称 = 数据值

数据类型 + 变量名称 = 数据值，声明变量并赋值

> 声明变量类型的时候不能超过变量类型的范围
> 对于float和long类型的变量，不能丢掉F和L
> 没有进行赋值的并变量，不能直接使用。必须先创建变量，和进行赋值之后才能够使用
> 【重要】变量的使用需要在作用域内

### 数据类型转换

隐式类型转换

- 自动完成，不需要手动处理
- 遵循数据范围从小到大的转换规则

```java
double num3 = 2.34F;// 这里将float类型转换成了double类型
float num4 = 30L;// 这里将long类型隐式转换成了float类型
```

### 强制类型转换

格式：范围小的类型+变量 = （范围小的类型） 原本范围大的数据

```java
int num = (int) 100L;
int num2 = (int) 60000000000000000L;
char tempChar = 'A';
System.out.println(tempChar);
```

- 强制类型一般不推荐使用，可能造成精度损失、数据溢出问题
- 字符型`char`也可以进行数学运算，会将`char`转换成int类型，然后再计算