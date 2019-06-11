package com.me.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
    public static String getMd5(String value) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = md5.digest(value.getBytes());
        String s = new BigInteger(1, digest).toString(16);
        for (int i = 0; i < 32 - s.length(); i++) {
            s = "0" + s;
        }
        return s;
    }

    public static void main(String[] args){
        String md5 = Md5.getMd5("admin");
        md5 = Md5.getMd5(md5.substring(0,16));
        System.out.println(md5);
    }
}
