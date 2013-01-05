package com.SpringStudy.DI;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-4
 * Time: 下午7:59
 * To change this template use File | Settings | File Templates.
 */
public class KnightOfTheRoundTableTest {
    @Test
    public void KnightTest(){
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("knight.xml"));
        Knight knight = (Knight)factory.getBean("knight");
        knight.embarkOnQuest();
    }
}
