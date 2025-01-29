import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //for user input
        System.out.print("Enter the total units consumed: ");
        int units=scanner.nextInt();
        int totalBill=0; //initially

        // if(units<=100){
        //     totalBill=units*5;
        // }
        // else if(units>100 && units<=200){
        //     totalBill=units*7;
        // }
        // else if(units>200 && units<=300){
        //     totalBill=units*10;
        // }
        // else{
        //     totalBill=units*15;
        // }

        if(units<=100){
            totalBill=units*5; // 1 to 100 units
        } 
        else if(units<=200){
            totalBill=(100 * 5)+((units-100)*7); // 101 to 200 units
        } 
        else if(units<=300){
            totalBill=(100*5)+(100*7)+((units-200)*10); // 201 to 300 units
        } 
        else{
            totalBill=(100*5)+(100*7)+(100*10)+((units-300)*15); // above 300 units
        }

        System.out.println("The total electricity bill is Rs " + totalBill);
        scanner.close();
    }
}