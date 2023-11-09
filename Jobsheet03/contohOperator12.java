public class contohOperator12 {
    public static void main (String[] args){
        int x = 10;
        System.out.println("intital value of x = " + x);
        System.out.println("x++ = " + x++);
        System.out.println("After evaluation, x = " + x);
        x = 10;
        System.out.println("initial value of x = " + x);
        System.out.println("++x = " + ++x);
        System.out.println("After evaluation, x = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("the result of x ^ y is " + z);
        z %= 2;
        System.out.println("The fina result ia " + z);
    }
}
