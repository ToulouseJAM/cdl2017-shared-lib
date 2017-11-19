package fr.cdl.pipeline

import com.lesfurets.jenkins.unit.BasePipelineTest;
import org.junit.Before;
import org.junit.Test;

class TestMySharedLibs extends BasePipelineTest {

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testCustomBuild() {
        def script = loadScript("vars/customBuild.groovy");
        script.call("task")
        assertJobStatusSuccess()
    }

    @Test
    public void testCustomBuildFail() {
        def script = loadScript("vars/customBuild.groovy");
        script.call()
        assertJobStatusFailure()
    }
}



