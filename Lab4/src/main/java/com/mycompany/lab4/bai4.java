/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai4 {
    public static void main(String[] args) {
       
        bai3 sp1 = new bai3("Banh mi Huynh Hoa", 75000, 15000);

        
        bai3 sp2 = new bai3("Nuoc ngot xa xi Chuong Duong", 15000);

       
        System.out.println("--- Thong tin SP 1 ---");
        sp1.xuat();

        System.out.println("\n--- Thong tin sP 2 ---");
        sp2.xuat();


        sp2.setGiamGia(2000);
        System.out.println("\n--- Sau khi doi => giam gia SP 2 ---");
        sp2.xuat();
    }
}