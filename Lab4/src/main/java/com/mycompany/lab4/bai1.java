/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public String tenSp;
    public double donGia;
    public double giamGia;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        this.tenSp = scanner.nextLine();

        System.out.print("Don gia: ");
        this.donGia = scanner.nextDouble();

        System.out.print("Giam gia: ");
        this.giamGia = scanner.nextDouble();
    }

    // thuế nhập khẩu 10%
    public double getThueNhapKhau() {
        return this.donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Ten san pham: " + this.tenSp);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("Giam gia: " + this.giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}
