/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik02;

/**
 *
 * @author User
 */
public class ProjectKeramik02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KeramikNonVoid c1 = new KeramikNonVoid(30,30,10,1000000,54000);
       System.out.println("\n"+"Luas Total Keramik A dalam 1 box adalah " +c1.luasKeramik()+ " cm^2");
       System.out.println("Banyak Box yang dibutuhkan jika menggunakan keramik A adalah " +c1.banyakBox()+ " box");
       System.out.println("Total Harga jika memilih keramik A = Rp " + c1.hargaKeramik());
       
       KeramikNonVoid c2 = new KeramikNonVoid(40,40,50,1000000,65000);
       System.out.println("\n"+"Luas Total Keramik B dalam 1 box adalah " +c2.luasKeramik()+ " cm^2");
       System.out.println("Banyak Box yang dibutuhkan jika menggunakan keramik B adalah " +c2.banyakBox()+ " box");
       System.out.println("Total Harga jika memilih keramik B = Rp " + c2.hargaKeramik());
       
       KeramikNonVoid c3 = new KeramikNonVoid(30,40,80,1000000,60000);
       System.out.println("\n"+"Luas Total Keramik C dalam 1 box adalah " +c3.luasKeramik()+ " cm^2");
       System.out.println("Banyak Box yang dibutuhkan jika menggunakan keramik C adalah " +c3.banyakBox()+ " box");
       System.out.println("Total Harga jika memilih keramik C = Rp " + c3.hargaKeramik());
    }    
}
