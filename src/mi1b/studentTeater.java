/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mi1b;

/**
 *
 * @author hasan
 */
public class studentTeater {
    public static void main(String[] args) {
       
        student s1 = new student(1005, "desfanni zulya","789-77-870", 3.5);
        
        System.out.println("No bp : "+s1.getNoBp());
        System.out.println("Nama : "+s1.getNama());
        System.out.println("No bpjs : "+s1.getNobpjs());
        System.out.println("ipk : "+s1.getIndeksprestasi());
        
        student2 s2= new student2();
        s2.setNoBp(1091006);
        s2.setNama("Fadhil");
        s2.setNobpjs("890-76-908");
        s2.setIndeksprestasi(3.83);
        System.out.println("------------------------");
        System.out.println("No bp : "+s2.getNoBp());
        System.out.println("Nama : "+s2.getNama());
        System.out.println("No bpjs : "+s2.getNobpjs());
        System.out.println("ipk : "+s2.getIndeksprestasi());
        
        student2 s3= new student2();
        s3.setNoBp(1091006);
        s3.setNama("Fani illahi");
        s3.setNobpjs("908-345-890");
        s3.setIndeksprestasi(3.65);
        System.out.println("------------------------");
        System.out.println("No bp : "+s3.getNoBp());
        System.out.println("Nama : "+s3.getNama());
        System.out.println("No bpjs : "+s3.getNobpjs());
        System.out.println("ipk : "+s3.getIndeksprestasi());
        
        
    } 
}
