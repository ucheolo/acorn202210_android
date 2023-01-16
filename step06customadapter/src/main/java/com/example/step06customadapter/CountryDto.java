package com.example.step06customadapter;

import java.io.Serializable;

public class CountryDto implements Serializable {
    // 필드
    private int resId;
    private String name;
    private String content;
    // 디폴트 생성자
    public CountryDto() {}

    public CountryDto(int resId, String name, String content) {
        this.resId = resId;
        this.name = name;
        this.content = content;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
