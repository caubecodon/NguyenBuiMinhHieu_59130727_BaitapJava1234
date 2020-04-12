/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
// vi IT và BIZ ke thua tu poly nen tao poly truoc
public abstract class SinhVienPoly {
    // khai bao thuoc tinh
    public String hoTen;
    public String nganhHoc;

    // khai bao cau truc 
    public SinhVienPoly(String hoTen, String nganhHoc) {
      this.hoTen = hoTen;
      this.nganhHoc = nganhHoc;
    }

    // tao lop diem
    // lop diem la phuong thuc truu tuong
    public abstract double getDiem();

    // tinh hoc luc
    public String getHocLuc() {
      if (this.getDiem() < 5) {
        return "Yeu";
      }
      if (this.getDiem() < 6.5) {
        return "Trung binh";
      }
      if (this.getDiem() < 7.5) {
        return "Kha";
      }
      if (this.getDiem() < 9) {
        return "Gioi";
      }
      return "Xuat sac";
    }

     // xuat thong tin 
     public void xuat() {
       System.out.println("Ho ten: " + this.hoTen + ", nganh hoc: " + this.nganhHoc);
     }
}