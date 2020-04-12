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
public class NhanVien {
    // attributes
  private String ten;
  private int tuoi;
  private String diachi;
  private double tienluong;
  private int giolam;

  // constructor no params
  public NhanVien() {
    this.ten = "";
    this.tuoi = 0;
    this.diachi = "";
    this.tienluong = 0;
    this.giolam = 0;
  }

  // getter, setter
  public void setTen(String ten) { this.ten = ten; }
  public String getTen() { return this.ten; }
  public void setTuoi(int tuoi) { this.tuoi = tuoi; }
  public int gettuoi() { return this.tuoi; }
  public void setDiaChi(String diachi) { this.diachi = diachi; }
  public String getDiaChi() { return this.diachi; }
  public void setTienLuong(double tienluong) { this.tienluong = tienluong; }
  public double getTienLuong() { return this.tienluong; }
  public void setGioLam(int giolam) { this.giolam = giolam; }
  public int getGioLam() { return this.giolam; }

  // methods
  // get thong tin nhan vien
  public String getThongTin() {
    return "Ten: " + this.ten + ", tuoi: " + this.tuoi + ", dia chi: " + this.diachi
      + ", tien luong : " + this.tienluong + ", tong gio lam: " + this.giolam
      + ", tien thuong: " + this.tinhThuong();
  }

  // tinh luong nhan vien
  public double tinhThuong() {
    if (this.giolam >= 200) {
      return this.tienluong * 0.2;
    }
    if (this.giolam >= 100) {
      return this.tienluong * 0.1;
    }
    return 0;
  }
}