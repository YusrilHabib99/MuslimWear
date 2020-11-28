package com.habib.katalogfashion.model;

public class Fashion {
    private String jenis;
    private String merek;
    private String harga;
    private String detail;
    private int drawableRes;

    public Fashion(String jenis, String merek, String harga, String detail, int drawableRes) {
        this.jenis = jenis;
        this.merek = merek;
        this.harga = harga;
        this.detail = detail;
        this.drawableRes = drawableRes;
    }

    public String getJenis() {
        return jenis;
    }
    public void setJenis (String jenis) {
        this.jenis = jenis;
    }

    public String  getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public  String getHarga() {
        return harga;
    }
    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getDrawableRes() {
        return drawableRes;
    }
    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}
