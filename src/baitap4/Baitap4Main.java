/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author Tran Bui Minh Hieu
 */
public class Baitap4Main {
    public static void main(String[] args) {
        // qlChuyenXe 
        QuanLyChuyenXe qlChuyenXe = new QuanLyChuyenXe();

        // tao chuyen xe noi thanh
        ChuyenXe xeNoiThanh1 = new ChuyenXeNoiThanh(1, "Tran Van A", "64Z-1234", 20000000, "Nha Trang - Cam Ranh", 40);
        ChuyenXe xeNoiThanh2 = new ChuyenXeNoiThanh(2, "Tran Van B", "65Z-1235", 21000000, "Nha Trang - Phu Yen", 41);
        ChuyenXe xeNoiThanh3 = new ChuyenXeNoiThanh(3, "Tran Van C", "66Z-1236", 22000000, "Nha Trang - Ninh Hoa", 42);

        // them chuyen xe vao qlChuyenXe
        qlChuyenXe.themChuyenXe(xeNoiThanh1);
        qlChuyenXe.themChuyenXe(xeNoiThanh2);
        qlChuyenXe.themChuyenXe(xeNoiThanh3);

        // tao chuyen xe ngoai thanh
        ChuyenXe xeNgoaiThanh1 = new ChuyenXeNgoaiThanh(4, "Tran Van D", "67Z-1237", 30000000, "Phan Rang - Ninh Thuan", 1);
        ChuyenXe xeNgoaiThanh2 = new ChuyenXeNgoaiThanh(5, "Tran Van E", "68Z-1238", 31000000, "Tuy Hoa - Phu Yen", 1);
        ChuyenXe xeNgoaiThanh3 = new ChuyenXeNgoaiThanh(6, "Tran Van F", "69Z-1239", 32000000, "Quy Nhon - Binh Dinh", 1);

        // them chuyen xe vao qlChuyenXe
        qlChuyenXe.themChuyenXe(xeNgoaiThanh1);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh2);
        qlChuyenXe.themChuyenXe(xeNgoaiThanh3);

        // in thong tin cac chuyen xe
        qlChuyenXe.inThongTin();

        // tong doanh thu xe noi thanh
        System.out.printf("\nTong doanh thu xe noi thanh: %.00f\n" , qlChuyenXe.tongDoanhThuNoiThanh());

        // tong doanh thu xe ngoai thanh
        System.out.printf("Tong doanh thu xe ngoai thanh: %.00f\n", qlChuyenXe.tongDoanhThuNgoaiThanh());

        // tong doanh thu
        System.out.printf("Tong doanh thu: %.00f\n", qlChuyenXe.tongDoanhThu());
    }
}