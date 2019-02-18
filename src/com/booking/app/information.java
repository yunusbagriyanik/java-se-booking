package com.booking.app;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class information {
    private static int totalRes=0;
    private static int totalCapacity=25;

    public static int getTotalRes() {
        return totalRes;
    }

    public static int getTotalCapacity() {
        return totalCapacity;
    }

    private ArrayList<String> arraylist1=new ArrayList<String>();
    Set<String> sequentialName=new TreeSet<String>();
    private char seat;
    
    public information(){
        
    }
    
    public information(char seat) {
        this.seat = seat;
    }

    public char getSeat() {
        return seat;
    }

    public void setSeat(char seat) {
        this.seat = seat;
    }
    
    public void addBooking(String name,String dateofbirth,String id,String gender){
        Scanner scanner=new Scanner(System.in);
        System.out.println("***** Enter passenger information *****");
        System.out.print("Name and Surname : ");
        name=scanner.nextLine();
        arraylist1.add(name);
        System.out.print("Date of Birth : ");
        dateofbirth=scanner.nextLine();
        arraylist1.add(dateofbirth);
        System.out.print("Identification Number : ");
        id=scanner.nextLine();
        arraylist1.add(id);
        System.out.print("Gender : ");
        gender=scanner.nextLine();
        arraylist1.add(gender);
        totalRes+=1;
        totalCapacity-=1;
        sequentialName.add(name);
   
    }
    public void updateAlphabeticalOrder(){
         System.out.print("Name to be deleted from alphabetical order : ");
         Scanner scanner=new Scanner(System.in);
         String delete=scanner.nextLine();
         sequentialName.remove(delete);
}
  
    public void viewList(){
      for(int i=0;i<arraylist1.size();i++){
            if((i+1)%4==1){
                System.out.println("==========================");
                }
                System.out.println((i+1)+" . "+arraylist1.get(i));
            }
      
      Iterator i=sequentialName.iterator();
      System.out.println("\n");
      System.out.println("********** Alphabetical Order **********");
      while(i.hasNext()){
          System.out.println("\t"+i.next());
      }
    }
    public void quotaInfo(){
    totalRes-=1;
    totalCapacity+=1;
    }
    public void cancelBooking(int position){
        arraylist1.remove(position);
    }

}
