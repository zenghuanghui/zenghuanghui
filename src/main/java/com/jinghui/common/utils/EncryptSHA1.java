package com.jinghui.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * Created by zenghuanghui on 2016/11/19.
 * 密码加密公用工具类
 */
public class EncryptSHA1 {

    public String Encrypt(String strSrc, String encName)
    {
        // parameter strSrc is a string will be encrypted,
        // parameter encName is the algorithm name will be used.
        // encName dafault to "MD5"
        MessageDigest md = null;
        String strDes = null;
        byte[] bt = strSrc.getBytes();
        try
        {
            if (encName == null || encName.equals(""))
            {
                encName = "MD5";
            }
            md = MessageDigest.getInstance(encName);
            md.update(bt);
            strDes = bytes2Hex(md.digest());
            // to HexString
        }
        catch (NoSuchAlgorithmException e)
        {
            System.out.println("Invalid algorithm.");
            return null;
        }
        return strDes;
    }

    public String bytes2Hex(byte[] bts)
    {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++)
        {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1)
            {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }

    /** 产生随机字符串 */
    public static final String randomString(int length)
    {
        char[] numbersAndLetters = null;
        if (length < 1)
        {
            return null;
        }
        Random randGen = new Random();
        numbersAndLetters = ("0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
        char[] randBuffer = new char[length];
        for (int i = 0; i < randBuffer.length; i++)
        {
            randBuffer[i] = numbersAndLetters[randGen.nextInt(71)];
        }
        return new String(randBuffer);
    }

    /** 产生随机字符串 */
    public static final String randomString()
    {
        return randomString(10);
    }

    // 调用此方法randomString(int),int是字符串的长度，即可产生指定长度的随机字符串。
    public static void main(String[] args)
    {
        EncryptSHA1 te = new EncryptSHA1();
        String salt = "e08b0404adc28b5732e009ca2996f142";// si门户前缀
        String pwd = "1@aA0000";// si某一账户密码明文
        String aul = "ca059f3ab117faf345976f42b0c7a44b42fea2e5";// si门户 前缀+明文 加密后的密文
        // ======密码校验方法======================
        System.out.println("Use auth:" + te.Encrypt(salt + pwd, "SHA-1").equals(aul));
        // edn现有加密方法
        String upwd = "1";// 明文
        String mdbStr = "c4ca4238a0b923820dcc509a6f75849b";// 加密后的密文
        // ====edn现有密码校验方法========================
        System.out.println("md51 str:" + te.Encrypt(upwd, "MD5").equals(mdbStr));
        // ===改造edn加密码方法=============================
        String saltTemp = te.Encrypt(randomString(), "SHA-1");// 通过对随机数加密生成密码前缀
        te.Encrypt(saltTemp + pwd, "SHA-1");// 前缀+密码明文加密生成最终密码
        System.out.println("md51 str:" + te.Encrypt("1", "MD5"));
        // ===取随机字符串方法===============================
        System.out.println(randomString());// 不带参数生成随机的10位长度的字符串
        System.out.println(randomString(5));// 带参数生成参数长度的字符串
    }

}
