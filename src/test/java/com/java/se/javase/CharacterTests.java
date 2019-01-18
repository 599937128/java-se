package com.java.se.javase;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: java-se
 * @Date: 2019/1/18 14:48
 * @Author: Mr.Deng
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CharacterTests {

    @Test
    public void TestCharacter() {
        char [] charArray = {'a','b','c','d'};
        Character character = new Character('a');
        log.info("是否是一个字母{}",character.isLetter(character));
        log.info("是否是一个数字字符{}",character.isDigit(character));
        log.info("是否是一个空白字符{}",character.isWhitespace(character));
        log.info("是否是一个大写的字符{}",character.isUpperCase(character));
    }
}
