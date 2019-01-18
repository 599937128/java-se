package com.java.se.javase;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: java-se
 * @Date: 2019/1/10 10:18
 * @Author: Mr.Deng
 * @Description:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StringTests {
    /**
     * 将指定字符串连接到此字符串的结尾。
     * 相当于创建了新的对象
     */
   @Test
   public void concatString() {
       String name = "lvliao";
       log.info("连接之后的字符串是:{}", name.concat("lvliao"));
   }

    /**
     * 返回指定索引处的字符
     * 字符串的索引是从0开始
     */
    @Test
    public void charAtString() {
        String name = "lvliao";
        log.info("返回指定索引处的字符是:{}", name.charAt(4));
    }

    /**
     *
     */
    @Test
    public void compareToString() {
        String name = "lvliao";
        String name1 = "lvliao123";
        String name2 = "lv";
        int result = name.compareTo(name1);
        int result1 = name.compareTo(name2);
        int result2 = name.compareTo(name);
        /**
         * 忽略大小写
         */
        int result3 = name.compareToIgnoreCase(name2);
        log.info("比较结果是小于:{}", result);
        log.info("比较结果是大于:{}", result1);
        log.info("比较结果是等于:{}", result2);
    }

    @Test
    public void testString() {
        String name = "lvdsjivnisd";
        String name1 = "lvdsjivnisd";
        String name2 = "lvDsjivnisd";
        log.info("是否是指定的字符结尾的{}",name.endsWith("d"));
        log.info("判断字符串是否相等{}",name.equals(name1));
        log.info("判断字符串是否相等,并且忽略大小写{}",name.equalsIgnoreCase(name2));
        log.info("返回指定字符在此字符串中第一次出现处的索引{}",name.indexOf("d"));
        log.info("转换为大写{}",name.toUpperCase());

    }

}
