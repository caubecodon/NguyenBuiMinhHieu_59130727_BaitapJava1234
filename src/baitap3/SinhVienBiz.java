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

//ke thua tu Poly
public class SinhVienBiz extends SinhVienPoly {
    // phuong thuc
    public double diemMarketing;
    public double diemSales;

    // thuoc tinh = tham so
    public SinhVienBiz(String hoTen, String nganhHoc, double diemMarketing, double diemSales) {
      super(hoTen, nganhHoc);
      this.diemMarketing = diemMarketing;
      this.diemSales = diemSales;
    }

    // dinh nghia phuong thuc truu tuong
    @Override
    public double getDiem() {
      return (2 * this.diemMarketing + this.diemSales) / 3;
    };
}