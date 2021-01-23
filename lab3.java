import java.util.*;
class PurchaseProduct
{
private String name;
 private double unitPrice;
 PurchaseProduct()
 {
 this.name="no product";
 this.unitPrice=0.0;
 }
 public double getPrice()
 {
 return this.unitPrice;
 }
 public String getName()
 {
 return this.name;
 }
 public void setProduct(String name,double unitPrice)
 {
 this.name=name;
 this.unitPrice=unitPrice;
 }
 public String toString()
 {
 return (this.name+ " @ "+ this.unitPrice);
 }
}
class WeighedProduct extends PurchaseProduct
{
 private String name;
 private double unitPrice;
 private double weight;
 WeighedProduct()
 {
 super();
 this.weight = 0.0;
 }
 public double getPrice()
 {
 return super.getPrice()*this.weight;
 }
 public void setWeight(double weight)
 {
 this.weight=weight;
 }
 public String toString()
 {
 return super.toString() + " " + weight+"kg Rs "+getPrice() ;
 }
}
class CountedProduct extends PurchaseProduct
{
 private String name;
 private double unitPrice;
 private int quantity;
 CountedProduct()
 {
 super();
 this.quantity = 0;
 }
 public void setQuantity(int quantity)
 {
 this.quantity=quantity;
 }
 public double getPrice()
 {
 return super.getPrice()*this.quantity;
 }
 public String toString()
 {
 return super.toString() + " "+quantity+" units Rs "+getPrice();
 }
}
public class lab3
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
 System.out.println("Enter Details For Weighted Items");
 System.out.print("Name : ");
 String name=in.next();
 System.out.print("Unit Price : ");
 double unitPrice=in.nextDouble();
 System.out.print("Weight : ");
 double weight=in.nextDouble();
 WeighedProduct Item1=new WeighedProduct();
 Item1.setProduct(name, unitPrice);
 Item1.setWeight(weight);
 System.out.println(" "+Item1.toString());
 System.out.println();
 System.out.println("Enter Details For Counted Items");
 System.out.print("Name : ");
 String name2=in.next();
 System.out.print("Unit Price : ");
 double unitPrice2=in.nextDouble();
 System.out.print("Quantity : ");
 int quantity=in.nextInt();
 CountedProduct Item2=new CountedProduct();
 Item2.setProduct(name2, unitPrice2);
 Item2.setQuantity(quantity);
 System.out.println(" "+Item2.toString());
}
}