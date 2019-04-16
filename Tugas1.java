/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Windows
 */
public class Tugas1 {
    //Membuat fungsi diskriminan
    public static double Diskriminan(double a,double b, double c){
    double D = Math.pow(b,2) - 4*a*c;
    return D;
    }
    
    //Program utama
    public static void main(String[] args){
        //Membuat fungsi input variabel
        Scanner input = new Scanner(System.in);
        System.out.println("Input :");          
        
        //Deklarasi variabel
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double diskriminan, Akar1, Akar2, Absis, Ordinat;
        String variabel = "x";
        String cekung[] = {"Atas", "Bawah"};
   
        //Mencari diskriminan
        diskriminan = Diskriminan(a,b,c);
   
        //Mengecek apakah fungsi kuadrat atau tidak
        if(a==0){
            System.out.println("Nilai a tidak boleh 0");
     
        //Jika akar-akar berupa imajiner
        }else if(diskriminan<0){ 
            //Perhitungan akar-akar
            diskriminan *= -1;
            double akarR = -b/(2*a); //Bilangan real
            double akarI = Math.sqrt(diskriminan)/(2*a); //Bilangan imajiner            
     
            //Menghitung titik stasioner
            Absis = -b/(2*a);
            Ordinat = -(-diskriminan)/(4*a);
     
            //Membuat maksimal 3 digit angka dibelakang koma
            double akari;
            double akarr;
            if(akarR<0){  
                akarr = Math.ceil(akarR*1000)/1000;
            }else{
                akarr = Math.floor(akarR*1000)/1000;
            }
            if(akarI<0){  
                akari = Math.ceil(akarI*1000)/1000;
            }else{
                akari = Math.floor(akarI*1000)/1000;
            }
            
            double absis;
            double ordinat;
            if(Absis<0){  
                absis = Math.ceil(Absis*1000)/1000;
            }else{
                absis = Math.floor(Absis*1000)/1000;
            }
            if(Ordinat<0){  
                ordinat = Math.ceil(Ordinat*1000)/1000;
            }else{
                ordinat = Math.floor(Ordinat*1000)/1000;
            }
            
     
            //Mencetak output
            System.out.println("Output :");
            if(b>=0 && c>=0){                  
                System.out.println("Polinomial " + a + variabel + "^2" + " + " + b + variabel + " + " + c + " memiliki");
            }else if(b<0){
                System.out.println("Polinomial " + a + variabel +"^2" + " - " + (-b) + variabel+" + "+c+" memiliki");
            }else if(c<0){              
                System.out.println("Polinomial " + a + variabel + "^2" + " + " + b + variabel + " - " + (-c) + " memiliki");
            }else{
                System.out.println("Polinomial " + a + variabel + "^2" + " - " + (-b) + variabel + " - " + (-c) + " memiliki");
            }         
     
            //Outputan diskriminan
            System.out.println("1. Diskriminan\t\t\t" + ": " + (-diskriminan));
     
            //Outputan akar-akar
            if(akarr==0){       
                if(akari<0){
                    akari *= -1;
                }
                System.out.println("2. Akar-akar dari polinomial\t" + ": " + akari+ "i" + " dan " + (-akari) + "i");
            }else{
                if(akari>0){         
                    System.out.println("2. Akar-akar dari polinomial\t" + ": " + akarr + " + " + akari + "i" + " dan " + akarr + " - " + akari + "i");
                }else{
                    System.out.println("2. Akar-akar dari polinomial\t" + ": " + akarr + " + " + (-akari) + "i" + " dan " + akarr + " - " + (-akari) +"i");
                }
            }
     
            //Outputan titik stasioner
            if(b==0){
                //Mengecek agar absis tidak -0
                if(a>0){
                    absis *= -1;
                }
                System.out.println("3. Titik stasioner\t\t" + ": " + "(" + absis + "," + ordinat + ")");  
            }else{
                System.out.println("3. Titik stasioner\t\t" + ": " + "(" + absis + "," + ordinat + ")");  
            }
             
            //Outputan kecekungan kurva
            if(a>0){                    
                System.out.println("4. Kecekungan kurva\t\t" + ": " + cekung[0]);     
            }else{              
                System.out.println("4. Kecekungan kurva\t\t" + ": " + cekung[1]);
            }     
     
            //Outputan nilai minimum/maksimum lokal
            if(a>0){       
                System.out.println("5. Nilai minimum lokal\t\t" + ": " + ordinat);
            }else{       
                System.out.println("5. Nilai maksimum lokal\t\t" + ": " + ordinat);
            }
     
        //Jika akar-akar tidak berbentuk imajiner
        }else{
            //Perhitungan akar-akar
            Akar1 = (-b + Math.sqrt(diskriminan))/(2*a);
            Akar2 = (-b - Math.sqrt(diskriminan))/(2*a);
     
            //Menghitung titik stasioner
            Absis = -b/(2*a);
            Ordinat = -diskriminan/(4*a);
     
            //Membuat maksimal 3 digit angka dibelakang koma
            double akar1;
            double akar2;
            if(Akar1<0){  
                akar1 = Math.ceil(Akar1*1000)/1000;
            }else{
                akar1 = Math.floor(Akar1*1000)/1000;
            }
            if(Akar2<0){  
                akar2 = Math.ceil(Akar2*1000)/1000;
            }else{
                akar2 = Math.floor(Akar2*1000)/1000;
            }

            double absis;
            double ordinat;
            if(Absis<0){  
                absis = Math.ceil(Absis*1000)/1000;
            }else{
                absis = Math.floor(Absis*1000)/1000;
            }
            if(Ordinat<0){  
                ordinat = Math.ceil(Ordinat*1000)/1000;
            }else{
                ordinat = Math.floor(Ordinat*1000)/1000;
            }
            
            //Mencetak output            
            System.out.println("Output :");
            if(b>=0 && c>=0){                  
                System.out.println("Polinomial " + a + variabel + "^2" + " + " + b + variabel + " + " + c + " memiliki");
            }else if(b<0){                   
                System.out.println("Polinomial " + a + variabel + "^2" + " - " + (-b) + variabel+" + " + c + " memiliki");
            }else if(c<0){              
                System.out.println("Polinomial " + a + variabel + "^2" + " + " + b + variabel + " - " + (-c) + " memiliki");
            }else{
                System.out.println("Polinomial " + a + variabel + "^2" + " - " + (-b) + variabel + " - " + (-c) + " memiliki");
            }
     
            //Outputan diskriminan
            System.out.println("1. Diskriminan\t\t\t"+": " + diskriminan);
     
            //Outputan akar-akar            
            if(akar1==akar2){
                //Mengecek agar akar-akar tidak -0
                if(akar1==-0){
                    akar1*=-1;
                }
            System.out.println("2. Akar-akar dari polinomial\t" + ": " + akar1);
            }else{
                //Mengecek agar akar-akar tidak -0
                if(akar1==-0){
                    akar1 *= -1;
                }
                if(akar2==-0){
                    akar2 *= -1;
                }
                System.out.println("2. Akar-akar dari polinomial\t" + ": " + akar1 + " dan " + akar2);
            }
     
            //Outputan titik stasioner
            if(b==0){
                //Mengecek agar absis tidak -0
                if(a>0){
                    absis *= -1;
                }
                if(diskriminan==0){
                    //Mengecek agar ordinat tidak -0
                    if(a>0){
                        ordinat *= -1;
                    }
                }
                System.out.println("3. Titik stasioner\t\t" + ": " + "(" + absis + "," + ordinat + ")");  
            }else{
                if(diskriminan==0){
                    //Mengecek agar ordinat tidak -0
                    if(a>0){
                        ordinat *= -1;
                    }
                }
                System.out.println("3. Titik stasioner\t\t" + ": " + "(" + absis + "," + ordinat + ")");  
            }
     
            //Outputan kecekungan kurva
            if(a>0){                    
                System.out.println("4. Kecekungan kurva\t\t" + ": " + cekung[0]);     
            }else{              
                System.out.println("4. Kecekungan kurva\t\t" + ": " + cekung[1]);
            }     
     
            //Outputan nilai minimum/maksimum lokal
            if(a>0){       
                System.out.println("5. Nilai minimum lokal\t\t" + ": " + ordinat);
            }else{       
                System.out.println("5. Nilai maksimum lokal\t\t" + ": " + ordinat);
            }
        }
    }
}