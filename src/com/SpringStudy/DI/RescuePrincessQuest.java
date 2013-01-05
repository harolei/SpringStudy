package com.SpringStudy.DI;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-4
 * Time: 下午8:08
 * To change this template use File | Settings | File Templates.
 */
public class RescuePrincessQuest implements Quest{
    HolyGrail grail = new HolyGrail("Princess");
    public Object embark() {
        System.out.print("Knight is embarking the rescue princess quest...");
        return grail;
    }
}
