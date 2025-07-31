import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        int count=0;
        String[] s2=s.split(" ");
       
        for(int i=0;i<s2.length;i++){
           if (s2[i].isEmpty()) continue; 
            char a=s2[i].charAt(0);
            if(a =='A' || a=='E' ||a=='I'||a=='O' || a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                count++;
            }
        }
        System.out.print(count);
    }
}
