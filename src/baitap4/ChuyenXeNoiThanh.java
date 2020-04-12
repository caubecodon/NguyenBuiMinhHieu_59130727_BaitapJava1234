/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class ChuyenXeNoiThanh extends ChuyenXe{
    // phuong thuc
    public String sotuyen;
    public double soKm;

    // thuoc tinh = tham so
    public ChuyenXeNoiThanh(int machuyen, String taixe, String soxe, double doanhthu, String sotuyen, double soKm) {
      super(machuyen, taixe, soxe, doanhthu);
      this.sotuyen = sotuyen;
      this.soKm = soKm;
    }

    // in thong tin
    @Override
    public void inThongTinChuyenXe() {
      super.inThongTinChuyenXe();
      System.out.println("tuyen: " + this.sotuyen);
      System.out.println("so km di duoc: " + this.soKm);
    }
}