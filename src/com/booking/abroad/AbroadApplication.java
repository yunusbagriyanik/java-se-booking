package com.booking.abroad;
import com.booking.abroad.AbroadRules;
import java.util.Scanner;
public class AbroadApplication implements AbroadRules {
    private int payment;
    private boolean politicalBan;
    private boolean visa;
    
    public AbroadApplication(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Deposit : ");
        this.payment=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Does the applicant have any political ban?(yes or no) : ");
        String answer=scanner.nextLine();
        if(answer.equals("yes")){
            this.politicalBan=true;
        }
        else{
            this.politicalBan=false;
        }
        System.out.print("Does the applicant have a visa?(yes or no) : ");
        String answer2=scanner.nextLine();
        if(answer2.equals("yes")){
            this.visa=true;
        }
        else{
            this.visa=false;
        }
        
    }

    @Override
    public boolean abroadPayControl() {
        if(this.payment<1000){
            System.out.println("Required Amount Unpaid");
            return false;
        }
        else{
            System.out.println("Payment Successful");
            return true;
        }
    }

    @Override
    public boolean politicalBanControl() {
        if(this.politicalBan==true){
            System.out.println("Political ban was found, cannot go abroad");
            return false;
        }
        else{
            System.out.println("No political ban..");
            return true;
        }
    }

    @Override
    public boolean visaCheck() {
        if(this.visa==true){
            System.out.println("Visa procedures are ok...");
            return true;
        }
        else{
            System.out.println("Visa not found...");
            return false;
        }
    }
    
    
    
}
