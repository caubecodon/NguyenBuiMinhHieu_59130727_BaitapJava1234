/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import baitap1.NhanVien;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class Baitap2Main {
    public static void main(String[] args) {
    // tạo object quan ly nhan vien
    IQuanLy qlNhanVien = new QuanLyNhanVien();
    
    // khai bao them 5 nhan vien nhu de bai
    // nhan vien 1
    NhanVien nv1 = new NhanVien();
    nv1.setTen("Tran van A");
    nv1.setTuoi(20);
    nv1.setDiaChi("Nha Trang - Khanh Hoa");
    nv1.setTienLuong(20000000);
    nv1.setGioLam(200);

    //nhan vien 2
    NhanVien nv2 = new NhanVien();
    nv2.setTen("Tran van B");
    nv2.setTuoi(21);
    nv2.setDiaChi("Nha Trang - Khanh Hoa");
    nv2.setTienLuong(15000000);
    nv2.setGioLam(150);

    //nhan vien 3
    NhanVien nv3 = new NhanVien();
    nv3.setTen("Tran van C");
    nv3.setTuoi(22);
    nv3.setDiaChi("Nha Trang - Khanh Hoa");
    nv3.setTienLuong(18000000);
    nv3.setGioLam(170);

    //nhan vien 4
    NhanVien nv4 = new NhanVien();
    nv4.setTen("Tran van D");
    nv4.setTuoi(23);
    nv4.setDiaChi("Tuy Hoa - Phu Yen");
    nv4.setTienLuong(25000000);
    nv4.setGioLam(300);

    //nhan vien 5
    NhanVien nv5 = new NhanVien();
    nv5.setTen("Tran van E");
    nv5.setTuoi(24);
    nv5.setDiaChi("Nha Trang - Khanh Hoa");
    nv5.setTienLuong(150000000);
    nv5.setGioLam(100);

    //them nhan vien vao list quan ly nhan vien
    qlNhanVien.them(nv1);
    qlNhanVien.them(nv2);
    qlNhanVien.them(nv3);
    qlNhanVien.them(nv4);
    qlNhanVien.them(nv5);

    // in ra danh sach nhan vien
    qlNhanVien.inDS();
  }
}