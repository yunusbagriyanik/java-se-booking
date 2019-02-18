package com.booking.app;
import com.booking.abroad.AbroadApplication;
import com.booking.login.administratorlogin;
import com.booking.login.login;
import java.util.Scanner;
public class Main {
    
    private static Scanner scanner=new Scanner(System.in);
    private static information[][] location=new information[5][5];
    private static information check=new information();
   
    public static void islemler_bastir(){
        
        System.out.println("\t 0- Show Position of Booking");
        System.out.println("\t 1- Add Booking");
        System.out.println("\t 2- Cancel Reservation");
        System.out.println("\t 3- Reservation List");
        System.out.println("\t 4- Permission to go abroad");
        System.out.println("\t q- Exit the Application");
     
    }
    
    public static void showFullandEmpty(){
        for(int i=0; i<5; i++){
            System.out.println("------------------------");
            for(int j=0; j<5; j++){
                System.out.print(" |"+ location[i][j].getSeat()+"| ");
            }
            System.out.println("");
        }
        System.out.println("------------------------");
    }
    
    public static boolean finishLoop() {
        
        for (int i =  0 ; i < 25; i++){
            for (int j = 0 ; j < 25 ; j++) {
                if (location[i][j].getSeat()=='E') {
                    return false;
                    
                }
                
            }
        }
        return true;
        
    }
               
    public static void cancelBooking(){
        System.out.print("Enter the lines to be canceled : ");
        int position=scanner.nextInt();
        check.cancelBooking(position-1);
        int position2=scanner.nextInt();
        check.cancelBooking(position-1);
        int position3=scanner.nextInt();
        check.cancelBooking(position-1);
        int position4=scanner.nextInt();
        check.cancelBooking(position-1);
       
        
    }

    public static void main(String[] args) throws InterruptedException {
       
        
        location[0][0] = new information('E');
        location[0][1] = new information('E');
        location[0][2] = new information('E');
        location[0][3] = new information('E');
        location[0][4] = new information('E');
        location[1][0] = new information('E');
        location[1][1] = new information('E');
        location[1][2] = new information('E');
        location[1][3] = new information('E');
        location[1][4] = new information('E');
        location[2][0] = new information('E');
        location[2][1] = new information('E');
        location[2][2] = new information('E');
        location[2][3] = new information('E');
        location[2][4] = new information('E');
        location[3][0] = new information('E');
        location[3][1] = new information('E');
        location[3][2] = new information('E');
        location[3][3] = new information('E');
        location[3][4] = new information('E');
        location[4][0] = new information('E');
        location[4][1] = new information('E');
        location[4][2] = new information('E');
        location[4][3] = new information('E');
        location[4][4] = new information('E');
        
        System.out.println(" ***** Welcome to the Booking Program ***** ");
        administratorlogin entry=new administratorlogin("Name","1234");
        System.out.println("-----------------------");
        System.out.println("Administrator Login");
        System.out.println("-----------------------");
        login login1=new login();
        int rightofentry=3;
        while(true){
            if(login1.login(entry)){
                System.out.println("Login Successful");
                break;
            }
            else{
                rightofentry-=1;
                System.out.println("Right of Entry : "+rightofentry);
            }
            if(rightofentry==0){
                System.out.println("İnput is Finished..");
                return;
            }
        }
        
        showFullandEmpty();
   
         try{ 
        while(true){
          
         
          islemler_bastir();
          System.out.print("Select a transaction : ");  
          String transaction=scanner.nextLine();
            if(transaction.equals("q")){
                System.out.println("Exiting Program...");
                break;
            }
            else if(transaction.equals("0")){
                 showFullandEmpty();
                
            }
            else if(transaction.equals("1")){
            System.out.println("Press 'a' to return the main menu ");
            System.out.print("Press r to add booking : "); 
        while(true){
            
        String transaction2=scanner.nextLine();
        if(transaction2.equals("a")){
            break;
        }
        else if(transaction2.equals("r")){
            System.out.print("Enter the Matrix Coordinates of the Place You Want to Make a Reservation : ");
         
            int i1=scanner.nextInt();
            int j1=scanner.nextInt();
           
            
     
        location[i1][j1].setSeat('F');
        check.addBooking(null, null, null, null);
        
        System.out.println("Press 'a' to return the main menu ");
        System.out.print("Press r to add booking : "); 
           }
      
         } 
             }
            
            else if(transaction.equals("2")){
                System.out.print("Press 'a' to return the main menu\n"+"Press 'i' to for cancellation : ");
                
                while(true){
                    String iptal=scanner.nextLine();
                    
                if(iptal.equals("i")){
                  cancelBooking();
                  check.updateAlphabeticalOrder();
                  check.quotaInfo();
                  System.out.print("Enter the Matrix Coordinates of the Canceled Location : ");
                  int i2=scanner.nextInt();
                  int j2=scanner.nextInt();
                  location[i2][j2].setSeat('E');
                  System.out.print("Press 'a' to return the main menu\n"+"Press 'i' to for cancellation : ");
             
                }
            
            else if(iptal.equals("a")){
                    break;
                }
           
           
                }
            }
            else if(transaction.equals("3")){
                System.out.println("\n");
                System.out.println("Total "+information.getTotalRes()+" made of reservation");
                System.out.println("Total remaining capacity : "+information.getTotalCapacity());
                System.out.println("\n");
                System.out.println("Reservation List");
                check.viewList();
                System.out.println("\n");
            }
            else if(transaction.equals("4")){
                System.out.print("Press 'a' to return the main menu\n"+"Press '0' to perform the operation : ");
                while(true){
                    
                    String transaction3=scanner.nextLine();
                    if(transaction3.equals("a")){
                        break;
                    }
                    else if(transaction3.equals("0")){
                    String rules="Travel Abroad Rules\n"+"Should be no political ban\n"
                    +"Payment must be made(1000TL) \n"+"Must have a visa to traveller";
                    System.out.println(rules);
                    String message="All Conditions Must be Provided";
                    AbroadApplication appeal=new AbroadApplication();
                    System.out.println("Checking the Deposited Money...");
                    Thread.sleep(3000);
                    if(appeal.abroadPayControl()==false){
                        System.out.println(message);
                        continue;
                    }
                    System.out.println("Checking the Political Ban...");
                    Thread.sleep(3000);
                    if(appeal.politicalBanControl()==false){
                        System.out.println(message);
                        continue;
                    }
                    System.out.println("Checking Visa...");
                    Thread.sleep(3000);
                    if(appeal.visaCheck()==false){
                        System.out.println(message);
                        continue;
                    }
                    System.out.println("Accomplished...Accepted application");
                    break;
                    }
                    else{
                System.out.print("Wrong Transaction\nTry Again : ");
                continue;
            }
                  
                }
            }
            else{
                System.out.println("Wrong Transaction\nTry Again...");
            }
                }
         }catch(Exception e){
            System.out.println(" ***Unexpected Error*** ");
        }
            }
            }
      
            
        
        
    
        

    
    

