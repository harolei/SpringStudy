package com.SpringStudy.DI;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-4
 * Time: 下午7:27
 * To change this template use File | Settings | File Templates.
 */
public class KnightOfTheRoundTable implements Knight{
    private String name;
    private Quest quest;

    public KnightOfTheRoundTable(String name){
        this.name = name;
    }

    public Object embarkOnQuest(){
        return quest.embark();
    }
    public void setQuest(Quest quest){
        this.quest = quest;
    }

    public String getName() {
        return name;
    }
}
