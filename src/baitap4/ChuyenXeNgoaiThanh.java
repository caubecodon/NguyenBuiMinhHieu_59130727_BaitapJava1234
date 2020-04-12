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
public class ChuyenXeNgoaiThanh extends ChuyenXe {
    // Phuong thuc
    public String noiden;
    public int songay;
  
    // thuoc tinh = tham so
    public ChuyenXeNgoaiThanh(int machuyen, String taixe, String soxe, double doanhthu, String noiden, int songay) {
      super(machuyen, taixe, soxe, doanhthu);
      this.noiden = noiden;
      this.songay = songay;
    }

    // methods
    // in thong tin chuyen xe
    @Override
    public void inThongTinChuyenXe() {
      super.inThongTinChuyenXe();
      System.out.println("noi den: " + this.noiden);
      System.out.println("so ngay: " + this.songay);
    }
}