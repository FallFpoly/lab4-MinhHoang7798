/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    private String tenSp;
    private double donGia;
    private double giamGia;

    public bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten SP: ");
        this.tenSp = sc.nextLine();

        System.out.print("Don gia: ");
        this.donGia = sc.nextDouble();

        System.out.print("Giam gia: ");
        this.giamGia = sc.nextDouble();
    }

    private double getThueNhapKhau() {
        return this.donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Ten SP: " + this.tenSp);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("Giam gia: " + this.giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }

    public String getTenSp() {
        return this.tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return this.giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
}
