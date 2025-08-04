import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[]args){
        Medicine[] medi=new Medicine[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<medi.length;i++){
            int medicineId=sc.nextInt();
            sc.nextLine();
            String medicineType=sc.nextLine();
            String medicineName=sc.nextLine();
            double price=sc.nextDouble();
            sc.nextLine();
            medi[i]=new Medicine(medicineId,medicineType,medicineName,price);
        }
        String matching=sc.nextLine();
        int count=0;
        for(int i=0;i<medi.length;i++){
            if(medi[i].getmedicineName().equalsIgnoreCase(matching)){count++;}
        }
        System.out.println(count);
        
    }
    
}
class Medicine{
    private int medicineId;
    private String medicineType;
    private String medicineName;
    private double price;
    public void setmedicineId(int medicineId){ 
        this.medicineId=medicineId;
    }
    public int getmedicineId(){
    return medicineId;
    }
    
    public String getmedicineType(){
    return medicineType;
    }
    public void setmedicineType(String medicineType){ 
        this.medicineType=medicineType;
    }
    public String getmedicineName(){
    return medicineName;
    }
    public void setmedicineName(String medicineName){ 
        this.medicineName=medicineName;
    }
    public double getprice(){
    return price;
    }
    public void setmprice(double price){ 
        this.price=price;
    }
    Medicine(int medicineId,String medicineType,String medicineName,double price){
        this.medicineId=medicineId;
        this.medicineType=medicineType;
        this.medicineName=medicineName;
        this.price=price;
    }
    
}
