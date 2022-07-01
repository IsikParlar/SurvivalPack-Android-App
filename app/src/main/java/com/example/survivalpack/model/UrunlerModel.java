package com.example.survivalpack.model;

public class UrunlerModel {
    private Double skt;
    private Double agirlik;
    private String resimURL, aciklama, urunAdi, kategori;

    public UrunlerModel() {
    }

    public UrunlerModel(Double skt, Double agirlik, String resimURL, String aciklama, String urunAdi, String kategori) {
        this.skt = skt;
        this.agirlik = agirlik;
        this.resimURL = resimURL;
        this.aciklama = aciklama;
        this.urunAdi = urunAdi;
        this.kategori = kategori;
    }

    public Double getSkt() {
        return skt;
    }

    public void setSkt(Double skt) {
        this.skt = skt;
    }

    public Double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(Double agirlik) {
        this.agirlik = agirlik;
    }

    public String getResimURL() {
        return resimURL;
    }

    public void setResimURL(String resimURL) {
        this.resimURL = resimURL;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
