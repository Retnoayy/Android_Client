package com.retno.android_client;

public class User {
    private int id;
    private String name;
    private String email;
    private String ttl;
    private String alamat;
    private String zodiac;
    private String jk;

    // Konstruktor untuk membuat objek User baru
    public User(int id, String name, String email, String ttl, String alamat, String zodiac, String jk) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.ttl = ttl;
        this.alamat = alamat;
        this.zodiac = zodiac;
        this.jk = jk;
    }

    // Konstruktor untuk membuat objek User tanpa id (misalnya, untuk menambahkan user baru)
    public User(String name, String email, String ttl, String alamat, String zodiac, String jk) {
        this.name = name;
        this.email = email;
        this.ttl = ttl;
        this.alamat = alamat;
        this.zodiac = zodiac;
        this.jk = jk;
    }

    // Getter untuk mendapatkan id user
    public int getId() {
        return id;
    }

    // Setter untuk mengatur id user
    public void setId(int id) {
        this.id = id;
    }

    // Getter untuk mendapatkan nama user
    public String getName() {
        return name;
    }

    // Setter untuk mengatur nama user
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk mendapatkan email user
    public String getEmail() {
        return email;
    }

    // Setter untuk mengatur email user
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter untuk mendapatkan ttl user
    public String getTtl() {
        return ttl;
    }

    // Setter untuk mengatur ttl user
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    // Getter untuk mendapatkan alamat user
    public String getAlamat() {
        return alamat;
    }

    // Setter untuk mengatur alamat user
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter untuk mendapatkan zodiac user
    public String getZodiac() {
        return zodiac;
    }

    // Setter untuk mengatur zodiac user
    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    // Getter untuk mendapatkan jenis kelamin user
    public String getJk() {
        return jk;
    }

    // Setter untuk mengatur jenis kelamin user
    public void setJk(String jk) {
        this.jk = jk;
    }
}
