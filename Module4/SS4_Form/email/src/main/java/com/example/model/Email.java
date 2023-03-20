package com.example.model;

public class Email {
    private String Languages;
    private int PageSize;
    private boolean Spams;
    private String Singnature;

    public Email() {
    }

    public Email(String languages, int pageSize, boolean spams, String singnature) {
        Languages = languages;
        PageSize = pageSize;
        Spams = spams;
        Singnature = singnature;
    }

    public String getLanguages() {
        return Languages;
    }

    public void setLanguages(String languages) {
        Languages = languages;
    }

    public int getPageSize() {
        return PageSize;
    }

    public void setPageSize(int pageSize) {
        PageSize = pageSize;
    }

    public boolean getSpams() {
        return Spams;
    }

    public void setSpams(boolean spams) {
        Spams = spams;
    }

    public String getSingnature() {
        return Singnature;
    }

    public void setSingnature(String singnature) {
        Singnature = singnature;
    }
}
