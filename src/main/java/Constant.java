//本程序意在学习Java的常量及枚举类型。
public class Constant {
    public static final double A = 2.50;  //在Java中，一个常量可能会在一个类中的多个方法使用，通常将其称之为类常量。这是使用类常量的一个例子。
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;  //关键字final只能被赋值一次。一旦赋值，就不能再更改了。习惯上，Java中的常量名使用全大写。
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
                + paperWidth * CM_PER_INCH + "by" + paperHeight * CM_PER_INCH);
        System.out.println("Print class constant" + A );  //打印类常量。
        //下面是枚举类型的学习。



    }
}
