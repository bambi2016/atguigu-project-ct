package com.atguigu.ct.web.controller;

public class PathTest {
    public static void main(String[] args) {
        String path = PathTest.class.getClass().getResource("/").getPath();
        System.out.println(path);
        String substring = path.substring(0, path.indexOf("/ct-web"));
        System.out.println(substring);
    }
}
