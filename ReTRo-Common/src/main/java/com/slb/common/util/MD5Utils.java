package com.slb.common.util;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class MD5Utils {
    public static String md5(String source) {

        if (source == null || source.length() == 0) {
            throw new RuntimeException("The string is not allowed to be empty");
        }
        try {
            String algorithm = "md5";
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            byte[] input = source.getBytes();
            byte[] output = messageDigest.digest(input);
            int signum = 1;
            BigInteger bigInteger = new BigInteger(signum, output);
            int radix = 16;
            String encoded = bigInteger.toString(radix).toUpperCase();
            return encoded;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            log.error("e:{}", e);
            return null;
        }
    }

    public static void main(String[] args) {
        String salt = SaltUtils.getSalt();
        String userPwd = "123456";
        String pwd = MD5Utils.md5(userPwd + salt);
        System.out.println(pwd);
    }
}
