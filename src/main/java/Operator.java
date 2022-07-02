//本程序意在学习Java里的运算符。
import static java.lang.Math.*;  //不必在数学方法名和常量名前添加前缀“Math”，只要在源文件最上面添加此代码。
public class Operator {
    public static void main(String[] args) {
        System.out.println(100/2 + 50*10);  //在Java中，使用通常的运算符“+ - * /”都可以使用。值得注意的是，当参与运算的两个操作数都是整数时，“/”表示整数除法，否则，表示浮点数除法。
        System.out.println(15%2);  //整数的求余操作（取模操作）用“%”表示。
        //需要注意，整数被0除将产生一个异常，而浮点数被0除将会得到一个无穷大或NaN结果。

        //下面是数学函数与常量的学习。
        double x = 4;
        double y = Math.sqrt(x);  //计算一个数的平方根，可以使用sqrt方法。
        double z = Math.pow(x,3);  //计算一个数的幂次，这里z是x的3次幂。pow有两个double类型参数，其返回结果也是double类型。
        double m = pow(x,4);  //静态导入实例。
        System.out.println(y);  //将输出x的平方根。
        System.out.println(Math.PI  + Math.E);  //最后，提供了两个常量来表示Π和e的接近的近似值。
        System.out.println(Math.sin(1));  //Math类也提供了一些常用的三角函数。以弧度制为单位。
    }
}
