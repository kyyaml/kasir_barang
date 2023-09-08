/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kasir;

/**
 *
 * @author user
 */
public class Barang {
    
    //membuat Variabel
    private int jum,hrg,tot,byr,kmbl,dsc;
    private String nm,pkt;
    
       
    public void setPaket(String pkt){
        this.pkt=pkt;
    } 
    public void setDiskon(int dsc ){
        this.dsc = dsc;
    }
    
    public void setNama(String nm){
        this.nm = nm;
    }
    
    public void setJumlah(int jum){
        this.jum = jum;
    }
    
    public void setBayar(int byr){
        this.byr = byr;
    }
    
    int  getJumlah (){
        return jum;
    }
    
    int getDiskon(){
        return dsc;
    }
    
    String getNama(){
        return nm;
    }
    
    int getBayar(){
        return byr;
    }
    
    int getPaket(){
        switch (pkt) {
            case "Lontong Tahu":
                 hrg = 5000;
            break;
            case "Ketoprak":
            hrg = 7000;
            break; 
            case "Gado Gado":
                hrg=10000;
                break;
            default:
                hrg = 0;
        }
        return hrg;
    }
    
    int getTotal(){
    tot = hrg*jum-((hrg*jum)*dsc/100);
    return tot;
    } 
    
    int getKembali(){
        kmbl= byr-tot;
        return kmbl;
    }
    
    
}
