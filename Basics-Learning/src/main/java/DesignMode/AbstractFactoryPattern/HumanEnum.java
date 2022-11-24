package main.java.DesignMode.AbstractFactoryPattern;

/**
 * @Author: wenzf
 * @Date: 2022/11/23/11:22
 * @Description:
 */
public enum HumanEnum {
    
    YellowMaleHuman("main.java.DesignMode.AbstractFactoryPattern.YellowMaleHuman"),

    YellowFemaleHuman("main.java.DesignMode.AbstractFactoryPattern.YellowFemaleHuman"),

    WhiteFemaleHuman("main.java.DesignMode.AbstractFactoryPattern.WhiteFemaleHuman"),

    WhiteMaleHuman("main.java.DesignMode.AbstractFactoryPattern.WhiteMaleHuman"),

    BlackFemaleHuman("main.java.DesignMode.AbstractFactoryPattern.BlackFemaleHuman"),

    BlackMaleHuman("main.java.DesignMode.AbstractFactoryPattern.BlackMaleHuman");

    private String value = "";

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
