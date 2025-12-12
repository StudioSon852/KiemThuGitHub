package com.example.TH05730_12122025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SachServiceTest {
    private SachService service;
    private Sach sach;

    @BeforeEach
    void setup() {
        service = new SachService();
        sach = new Sach("MS01", "Java", "Nguyen Van A", 2020, 100000);
    }

    @Test
    public void TestBienMinNamXuatBan1990() {
        assertTrue(service.SuaNamXuatBan(sach, "MS02", "Java", "Nguyen", 1990, 50000));
    }

    @Test
    public void TestBienMaxNamXuatBan2025() {
        assertTrue(service.SuaNamXuatBan(sach, "MS03", "Java", "Nguyen", 2025, 60000));
    }

    @Test
    public void TestCanBienNamXuatBan1989() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.SuaNamXuatBan(sach, "MS04", "Java", "Nguyen", 1989, 70000);
        });
    }

    @Test
    public void TestCanBienNamXuatBan2026() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.SuaNamXuatBan(sach, "MS05", "Java", "Nguyen", 2026, 80000);
        });
    }

    @Test
    public void TestGiaBang0() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.SuaNamXuatBan(sach, "MS06", "Java", "Nguyen", 2020, 0);
        });
    }

    @Test
    public void TestGiaAm() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.SuaNamXuatBan(sach, "MS07", "Java", "Nguyen", 2020, -1000);
        });
    }

    @Test
    public void TestTenSachRong() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.SuaNamXuatBan(sach, "MS08", "", "Nguyen", 2020, 90000);
        });
    }

    @Test
    public void TestMaSachRong() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.SuaNamXuatBan(sach, "", "Java", "Nguyen", 2020, 90000);
        });
    }

    @Test
    public void TestTacGiaRong() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.SuaNamXuatBan(sach, "MS09", "Java", "", 2020, 90000);
        });
    }

    @Test
    public void TestSachNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.SuaNamXuatBan(null, "MS10", "Java", "Nguyen", 2020, 90000);
        });
    }
}
