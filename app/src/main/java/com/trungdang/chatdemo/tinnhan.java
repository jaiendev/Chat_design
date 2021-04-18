package com.trungdang.chatdemo;

public class tinnhan  {
    private int Hinh;
    private String ten,tinnhan,thoigian,thongbao;

    public tinnhan(int hinh, String ten, String tinnhan, String thoigian, String thongbao) {
        Hinh = hinh;
        this.ten = ten;
        this.tinnhan = tinnhan;
        this.thoigian = thoigian;
        this.thongbao = thongbao;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTinnhan() {
        return tinnhan;
    }

    public void setTinnhan(String tinnhan) {
        this.tinnhan = tinnhan;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getThongbao() {
        return thongbao;
    }

    public void setThongbao(String thongbao) {
        this.thongbao = thongbao;
    }
}

