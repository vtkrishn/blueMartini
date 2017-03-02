package com.resumely.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestResumeSuite {
    public TestResumeSuite() {
        super();
    }
    
    public static Test suite() {
                    TestSuite suite = new TestSuite("Test for Resume Maker");
                    //$JUnit-BEGIN$
                    suite.addTestSuite(TestResumeClient.class);
                    suite.addTestSuite(TestResumeException.class);
                    suite.addTestSuite(TestResumeLogger.class);
                    suite.addTestSuite(TestResume.class);
                    suite.addTestSuite(TestResumeUtil.class);
                    suite.addTestSuite(TestResumeConstants.class);
                    //$JUnit-END$
                    return suite;
            }
}
