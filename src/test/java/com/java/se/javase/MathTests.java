package com.java.se.javase;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: java-se
 * @Date: 2019/1/18 14:31
 * @Author: Mr.Deng
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MathTests {

    @Test
    public void testMath() {
        log.info("90度的正弦值: {}",Math.sin(Math.PI/2));
        log.info("求绝对值: {}",Math.abs(-3000));
        log.info("ceil取大值{}", Math.ceil(-3.1));
        log.info("floor取小值{}", Math.floor(-3.1));
        log.info("四舍五入floor(x+0.5){}", Math.round(-3.1));
        log.info("返回随机数:{}", Math.random());
    }
}
