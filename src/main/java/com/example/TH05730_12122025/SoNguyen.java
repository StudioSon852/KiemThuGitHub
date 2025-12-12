package com.example.TH05730_12122025;

public class SoNguyen {
    public boolean KiemTra(int a) {
        if (a>100 || a<1) {
            throw new IllegalArgumentException("So nguyen khong duoc be hon 1 va lon hon 100");
        }
        return true;
    }
}