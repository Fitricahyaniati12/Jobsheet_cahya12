import java.util.Scanner;
public class PembelianPriceStudent12 {

public static void main(String[] args){
    Scanner input =new Scanner(System.in);
    String bookBrand;
    String pageCount;
    int price, quantity;
    double discount=0.1, totalPrice, purchasePrice, totalDiscount;
    System.out.println("Input User of bookbrand : ");
    bookBrand=input.nextLine();
    System.out.println("Input pagecount :");
    pageCount=input.nextLine();


    System.out.println("Input price : ");
    price=input.nextInt();
    System.out.println("Input quantity : ");
    quantity=input.nextInt();

    totalPrice=price*quantity;
    totalDiscount=totalPrice*discount;
    purchasePrice=totalPrice-totalDiscount;

    System.out.println("Total discount: "+ totalDiscount);
    System.out.println("Final purchase price: "+purchasePrice);
    }
}