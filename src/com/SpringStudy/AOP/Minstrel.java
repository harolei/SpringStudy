package com.SpringStudy.AOP;

import com.SpringStudy.DI.Knight;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-5
 * Time: 上午11:24
 * To change this template use File | Settings | File Templates.
 */
public class Minstrel {
    public void singBefore(){
        System.out.println("Fa la la; Sir knight is so brave!");
    }

    public void singAfter(){
        System.out.println("Tee-hee-he; Sir knight did embark on a quest!");
    }
}
