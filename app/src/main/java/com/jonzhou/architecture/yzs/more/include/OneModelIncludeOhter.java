package com.jonzhou.architecture.yzs.more.include;

/**
 * @author : John
 * @date : 2018/7/15
 */
public class OneModelIncludeOhter implements  ModelIncludeModeContract.Model {
    private IOhterMode ohterMode;
    private IOhterModeTwo ohterModeTwo;

    public OneModelIncludeOhter(IOhterMode ohterMode, IOhterModeTwo ohterModeTwo) {
        this.ohterMode = ohterMode;
        this.ohterModeTwo = ohterModeTwo;
    }

    @Override
    public String doOtherDataOne() {
        return ohterMode.otherData();
    }

    @Override
    public String doOhterDatTwo() {
        return ohterModeTwo.OtherDataTwo();
    }
}
