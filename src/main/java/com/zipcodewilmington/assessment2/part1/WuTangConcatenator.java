package com.zipcodewilmington.assessment2.part1;

import java.nio.file.LinkPermission;

public class WuTangConcatenator {

    Integer input = 0;

    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        if (input % 3 == 0) {
            return true;
        } else return false;
    }

    public Boolean isTang() {

        if (input % 5 == 0) {
            return true;
        } else return false;
    }

    public Boolean isWuTang() {

        if (input % 3 == 0 && input % 5 == 0) {
            return true;
        } else return false;
    }
}

