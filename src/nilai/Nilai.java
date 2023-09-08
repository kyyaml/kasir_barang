/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nilai;

/**
 *
 * @author user
 */
public class Nilai {
    
    //membuat variabel
    int n1,n2;
    double nt;
    String ket;
    
    public void setNilai(int nh, int nu){
        this.n1=nh;
        this.n2=nu;
    }
    
    double getNilai(){
        nt = Math.round(((0.6*n1)+(0.4*n2))*100.0)/100.0;
        return nt;
    } 
    
    String getPredikat(){
        
       if (nt>=90){
           ket = "Sangat Baik";
       }else if (nt>=80 && nt<90){
           ket = "Baik";
       }else if (nt>=70 && nt<80){
           ket = "Cukup";
       }
       else{
           ket= "Kurang";
       }
       
        return ket;
    }
  
}
