// Here I have created a adapter to show bill in dollar and rupees
// Image is attached with it please refer that to see the implemented logic
interface ReceiptAdapter{
    int getReceiptInDollar();
}
class billInDollar implements ReceiptAdapter{
    paymentReceipt bill;
    public billInDollar(paymentReceipt bill){
        this.bill = bill;
    }
    @Override
    public int getReceiptInDollar(){
        int billInRupee = bill.getReceiptInRupees();
        return billInRupee/84;
    }

}
interface paymentReceipt{
    int getReceiptInRupees();
}
class billInRupees implements  paymentReceipt{
    @Override
    public int getReceiptInRupees(){
        return 999;
    }
}
public class StructuralAdaptor {
    public static void main(String[] args){
        paymentReceipt bill1 = new billInRupees();
        System.out.println("bill is : " + bill1.getReceiptInRupees()+ " rs");

        ReceiptAdapter bill2 = new billInDollar(bill1);
        System.out.println("bill is : " + bill2.getReceiptInDollar()+ " $");
    }
}
