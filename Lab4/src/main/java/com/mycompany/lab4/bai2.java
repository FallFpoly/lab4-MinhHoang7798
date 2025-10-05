/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author ICT
 */
public class bai2 {
    public static void main(String[] args) {
        
        bai1 sp1 = new bai1();
        bai1 sp2 = new bai1();

        
        System.out.println("Nhap thong tin SP 1:");
        sp1.nhap();

        System.out.println("\nNhap thong tin SP 2:");
        sp2.nhap();

       
        System.out.println("\n--- Thong tin SP 1 ---");
        sp1.xuat();

        System.out.println("\n--- Thong tin SP 2 ---");
        sp2.xuat();
    }
}