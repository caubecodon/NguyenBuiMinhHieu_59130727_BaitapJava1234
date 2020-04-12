/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Ngyen Bui Minh Hieu
 */
public abstract class ChuyenXe {
    // phuong thuc
    public int machuyen;
    public String taixe;
    public String soxe;
    public double doanhthu;

    // thuoc tinh = tham so
    public ChuyenXe(int machuyen, String taixe, String soxe, double doanhthu) {
      this.machuyen = machuyen;
      this.taixe = taixe;
      this.soxe = soxe;
      this.doanhthu = doanhthu;
    }

    // in thong tin xe
    public void inThongTinChuyenXe() {
      System.out.println("ma chuyen xe: " + this.machuyen);
      System.out.println("ten tai xe: " + this.taixe);
      System.out.println("so xe: " + this.soxe);
      System.out.printf("doanh thu: %.00f\n", this.doanhthu);
    };
}