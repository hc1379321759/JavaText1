package com.hc.Test2_2_2;

/**
 * 建造者
 */
public interface HumanBuilder {
    void headbuilder();
    void bodybuilder();
    void handbuilder();
    void footbuilder();
    Human createHuman();
}
