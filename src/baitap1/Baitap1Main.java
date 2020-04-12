/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class Baitap1Main {
    public static void main(String[] args) {
        // tao nhan vien 1
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Nguyen Minh An");
        nv1.setTuoi(20);
        nv1.setDiaChi("Nha Trang - Khanh Hoa");
        nv1.setTienLuong(15000000);
        nv1.setGioLam(150);
        
        // tao nhan vien 2
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Tran Minh Thong");
        nv2.setTuoi(21);
        nv2.setDiaChi("Nha Trang - Khanh Hoa");
        nv2.setTienLuong(4000000);
        nv2.setGioLam(40);

        // in thong tin nhan vien
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
  } 
}