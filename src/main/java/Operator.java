//本程序意在学习Java里的运算符。
public class Operator {
    public static void main(String[] args) {
        System.out.println(100/2 + 50*10);  //在Java中，使用通常的运算符“+ - * /”都可以使用。值得注意的是，当参与运算的两个操作数都是整数时，“/”表示整数除法，否则，表示浮点数除法。
        System.out.println(15%2);  //整数的求余操作（取模操作）用“%”表示。
        //需要注意，整数被0除将产生一个异常，而浮点数被0除将会得到一个无穷大或NaN结果。
        //下面是数学函数与常量的学习。
        double x = 4;
        double y = Math.sqrt(x);  //计算一个数的平方根，可以使用sqrt方法。
        System.out.println(y);  //将输出x的平方根。

    }
}
