package com.example.TH05730_12122025;

public class SachService {
    public boolean SuaNamXuatBan(Sach xb, String maSach, String tenSach, String tacGia, int namXuatBan, float gia) {
        if (xb == null) {
            throw new IllegalArgumentException("Nha xuat ban khong ton tai");
        }
        if (maSach == null || maSach.trim().isEmpty()) {
            throw new IllegalArgumentException("Ma Sach khong duoc de trong");
        }
        if (tenSach == null || tenSach.trim().isEmpty()) {
            throw new IllegalArgumentException("Ten Sach khong duoc de trong");
        }
        if (tacGia == null || tacGia.trim().isEmpty()) {
            throw new IllegalArgumentException("Tac gia khong duoc de trong");
        }
        if (namXuatBan < 1990 || namXuatBan > 2025) {
            throw new IllegalArgumentException("Nam Xuat Ban phai tu 1990 den 2025");
        }
        if (gia <= 0) {
            throw new IllegalArgumentException("Gia phai lon hon 0");
        }

        // Gán giá trị cho đối tượng Sach
        xb.setMaSach(maSach);
        xb.setTenSach(tenSach);
        xb.setTacGia(tacGia);
        xb.setNamXuatBan(namXuatBan);
        xb.setGia(gia);

        return true;
    }
}
