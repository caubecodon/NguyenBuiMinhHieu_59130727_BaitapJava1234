/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;
// khai bao package de su dung arraylist
import java.util.ArrayList;

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class QuanLyChuyenXe {
    // phuong thuc
    public ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();

    // them chuyen xe
    public void themChuyenXe(ChuyenXe cx) {
      dsChuyenXe.add(cx);
    }

    // Xuat danh sach chuyen xe
    public ArrayList<ChuyenXe> xuatDsChuyenXe() {
      return dsChuyenXe;
    }

    // Xuat thong tin chuyen xe
    public void inThongTin() {
      dsChuyenXe.forEach(cx -> cx.inThongTinChuyenXe());
    }

    // tinh tong doanh thu xe noi thanh
    public double tongDoanhThuNoiThanh() {
      double doanhthu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        if (cx instanceof ChuyenXeNoiThanh) {
          doanhthu += cx.doanhthu;
        }
      }
      return doanhthu;
    }

    // tinh tong doanh thu xe ngoai thanh
    public double tongDoanhThuNgoaiThanh() {
      double doanhthu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        if (cx instanceof ChuyenXeNgoaiThanh) {
          doanhthu += cx.doanhthu;
        }
      }
      return doanhthu;
    }

    // tinh tong doanh thu
    public double tongDoanhThu() {
      double doanhthu = 0;
      for (ChuyenXe cx : dsChuyenXe) {
        doanhthu += cx.doanhthu;
      }
      return doanhthu;
    }
}