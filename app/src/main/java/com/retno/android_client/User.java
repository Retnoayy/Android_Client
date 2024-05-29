package com.retno.android_client;

public class User {
    private int id;
    private String name;
    private String email;
    private String ttl;
    private String alamat;
    private String zodiac;
    private String jk;

    public User(String name, String email, String ttl, String alamat, String zodiac, String jk) {
        this.name = name;
        this.email = email;
        this.ttl = ttl;
        this.alamat = alamat;
        this.zodiac = zodiac;
        this.jk = jk; }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getTtl() { return ttl; }
    public String getAlamat() { return alamat; }
    public String getZodiac() { return zodiac; }
    public String getjk() { return jk; }
}