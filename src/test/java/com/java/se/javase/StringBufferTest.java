package com.java.se.javase;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: java-se
 * @Date: 2019/1/18 16:05
 * @Author: Mr.Deng
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StringBufferTest {

    @Test
    public void testStringBUffer() {
        StringBuffer sf = new StringBuffer("lv");
        sf.append("liao").append("yan");
        log.info("输出追加的字符{}", sf);
        log.info("替换字符串{}", sf.replace(0,5,"llllll"));
        log.info("翻转的字符{}", sf.reverse());
    }
}
