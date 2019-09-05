package com.zh.miaosha.common.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {

    /**
     * 固定的salt
     */
    private static final String salt = "1a2b3c4d";

    /**
     * MD5基础方法
     */
    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    /**
     * 对用户输入对面进行MD5加密
     *
     * @param inputPass 输入的密码
     * @return MD5
     */
    public static String inputPassToFormPass(String inputPass) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        System.out.println(str);
        return md5(str);
    }

    /**
     * 把加密后的密码，二次加密
     *
     * @param formPass 密码
     * @param salt     salt
     * @return MD5
     */
    public static String formPassToDBPass(String formPass, String salt) {
        String str = "" + salt.charAt(0) + salt.charAt(2) + formPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    /**
     * 把用户输入的密码，转换成数据库储存的密码（MD5加密2次）
     *
     * @param inputPass 输入的密码
     * @param saltDB    数据库salt
     * @return MD5
     */
    public static String inputPassToDbPass(String inputPass, String saltDB) {
        String formPass = inputPassToFormPass(inputPass);
        String dbPass = formPassToDBPass(formPass, saltDB);
        return dbPass;
    }

    public static void main(String[] args) {
//        System.out.println(inputPassToFormPass("123456"));//d3b1294a61a07da9b49b6e22b2cbd7f9
		System.out.println(formPassToDBPass(inputPassToFormPass("123456"), MD5Util.salt));
//		System.out.println(inputPassToDbPass("123456", "1a2b3c4d"));//b7797cce01b4b131b433b6acf4add449
    }

}
