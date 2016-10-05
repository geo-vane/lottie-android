package com.airbnb.lotte.samples;


import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;

public class LotteTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public LotteTest() {
        super(MainActivity.class);
    }

    @Test
    public void testHosts() {
        TestRobot.testStaticFile(getActivity(), "Hosts Still.json");
        TestRobot.testStaticFile(getActivity(), "BusinessTravel01_Still.json");
        TestRobot.testStaticFile(getActivity(), "BusinessTravel02_Still.json");
        TestRobot.testStaticFile(getActivity(), "BusinessTravel03_Still.json");
        TestRobot.testAnimatedFile(getActivity(), "LightBulb.json");
        TestRobot.testAnimatedFile(getActivity(), "Diamond 2.json");
        TestRobot.testAnimatedFile(getActivity(), "CheckSwitch.json");
        TestRobot.testAnimatedFile(getActivity(), "Alarm.json");
    }
}