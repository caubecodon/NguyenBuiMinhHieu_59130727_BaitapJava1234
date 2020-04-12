/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

//them package de su dung
import baitap1.NhanVien;// package de su dung thong tin nhan vien
import java.util.ArrayList; //package de su dung bien mang

/**
 *
 * @author Nguyen Bui Minh Hieu
 */
public class QuanLyNhanVien implements IQuanLy{
    // danh sach nhan vien
  ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

  // ham chinh
  @Override
  public void them(NhanVien nv) {
    dsNhanVien.add(nv);
  };

  @Override
  public void inDS() {
    dsNhanVien.forEach(nv -> System.out.println(nv.getThongTin()));
  };
}