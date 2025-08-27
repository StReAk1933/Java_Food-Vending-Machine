import java.util.*;
public class FoodVendingMachine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String receipt = "";
        System.out.println("=======Welcome to Java Food Vending Machine=======\n");
        int totalprice=0;
        char cont='y';
        do{
            int choice,quantity;
            int price=0;
            String strchoice="";
            System.out.println("1. Paneer Butter Masala - ₹200/-\n2. Butter Chicken - ₹250/-\n3. Butter Naan - ₹40/-\n4. Butter Roti - ₹20/-\n5. Fried Rice Veg - ₹180/-\n6. Fried Rice Non-Veg(Chicken) - ₹220/-\n");
            System.out.println("Enter your choice(1-6): ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    strchoice="Paneer Butter Masala";
                    price=200;
                    break;
                case 2:
                    strchoice="Butter Chicken";
                    price=250;
                    break;
                case 3:
                    strchoice="Butter Naan";
                    price=40;
                    break;
                case 4:
                    strchoice="Butter Roti";
                    price=20;
                    break;
                case 5:
                    strchoice="Fried Rice Veg";
                    price=180;
                    break;
                case 6:
                    strchoice="Fried Rice Non-Veg(Chicken)";
                    price=220;
                    break;
                default:
                    System.out.println("Enter Valid Choice Please!");
                    price=0;
                    break;
            }
            if(price>0){
                System.out.println("Enter the Quantity: ");
                quantity=sc.nextInt();
                totalprice+=(price*quantity);
                receipt += strchoice + " x " + quantity + " = ₹" + (price * quantity) + "\n";
            }
            System.out.println("Do you want to order more(y/n): ");
            cont=sc.next().charAt(0);
            if(cont=='n' || cont=='N'){
                break;
            }
        }while(cont=='y' || cont=='Y');
        int payment=0;
        System.out.println("\n======= BILL SUMMARY =======");
        System.out.print(receipt);
        System.out.println("Total Bill: ₹" + totalprice);
        System.out.println("============================");
        do{
            System.out.println("Enter Payment: ");
            payment=sc.nextInt();
            if(payment>totalprice){
                System.out.println("Your Change: "+(payment-totalprice));
            }
            else if(payment<totalprice){
                System.out.println("Enter more "+(totalprice-payment)+" Rupees: ");
            }
            else{
                break;
            }
        }while(payment<totalprice);
        System.out.println("Thanks for Ordering, See you again!!");
        sc.close();
    }
}
