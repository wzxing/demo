package com.example.demo.security.req;

import com.example.demo.security.enums.WeekEnum;

public class TestReq {

    private WeekEnum week;

    public TestReq(WeekEnum week) {
        this.week = week;
    }

    public WeekEnum getWeek() {
        return week;
    }

    public void setWeek(WeekEnum week) {
        this.week = week;
    }
}
