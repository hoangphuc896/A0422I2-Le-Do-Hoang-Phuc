package com.example.model;

public class Dictionary {
    private String search;
    private String result;

    public Dictionary(String search, String result) {
        this.search = search;
        this.result = result;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
