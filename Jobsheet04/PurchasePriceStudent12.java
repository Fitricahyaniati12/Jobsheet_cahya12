import java.util.Scanner;

public class PembelianPriceStudent12 {

public static void main(String[] args){
    Scanner input =new Scanner(System.in);

    String bookBrand;
    int pageCount;
    int price, quantity;
    double discount, totalPrice, purchasePrice, totalDiscount;

    System.out.println("Input name bookbrand : ");
    bookBrand= sc.nextLine();
    System.out.println("Input pagecount :");
    pageCount= sc.nextLine();
    System.out.println("Input price : ");
    price= sc.nextInt();
    System.out.println("Input quantity : ");
    quantity= sc.nextInt();
    System.out.println("input disconut: ");
    discount = sc.nextInt();

    totalPrice = price * quantity;
    totalDiscount = totalPrice * (discount / 100);

    purchasePrice = totalPrice - totalDiscount;

    System.out.println("name bookbrand: "+ bookBrand);
    System.out.println("name pagecount: "+ pageCount);
    System.out.println("total discount: "+ totalDiscount);
    System.out.println("final purchase price: "+ purchasePrice);
    }
}