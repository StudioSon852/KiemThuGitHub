package com.example.TH05730_12122025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoNguyenTest {
    private SoNguyen kiemTra;
    @BeforeEach
    void setup() {kiemTra = new SoNguyen();}

    @Test
    public void TestBienMin() {assertTrue(kiemTra.KiemTra(1)); }

    @Test
    public void TestBienMax() {assertTrue(kiemTra.KiemTra(100)); }

    @Test
    public void TestcanBienMin2() {assertTrue(kiemTra.KiemTra(2)); }

    @Test
    public void TestcanBienMax99() {assertTrue(kiemTra.KiemTra(99)); }

    @Test
    public void TestcanBienMin0(){assertThrows(IllegalArgumentException.class, () -> kiemTra.KiemTra(0));; }

    @Test
    public void TestcanBienMax101() {assertThrows(IllegalArgumentException.class, () -> kiemTra.KiemTra(101)); }



}