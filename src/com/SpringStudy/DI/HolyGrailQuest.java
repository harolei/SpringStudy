package com.SpringStudy.DI;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-4
 * Time: 下午7:29
 * To change this template use File | Settings | File Templates.
 */
public class HolyGrailQuest implements Quest {
    public Object embark() {
        HolyGrail grail = new HolyGrail("HolyGrail");
        System.out.print("Knight is embarking the holy grail quest..");
        return grail;
    }
}
