package ArrayDemo1;

import java.io.File;

import org.testng.annotations.BeforeClass;
import org.apache.commons.io.FileUtils;
import org.testng.TestNG;

import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
public class Issue1020TestRunner {
	
	
	    @BeforeClass
	    public void setup() throws IOException {
	        File outputDir = getOutputFolder();
	        //File outputDir = getOutputFolder(new TestNG().getOutputDirectory());
	        FileUtils.cleanDirectory(outputDir);
	        if (outputDir.listFiles().length != 0) {
	            throw new IllegalStateException("Directory cleanup failed");
	        }
	    }

	    @Test
	    public void testMethod() {
	        XmlSuite xmlSuite = new XmlSuite();
	        
	        //xmlSuite.setName("1020_suite");
	        XmlTest xmlTest = new XmlTest(xmlSuite);
	        xmlTest.setXmlClasses(Collections.singletonList(new XmlClass(Issue1020TestclassSample.class)));
	        TestNG testng = new TestNG();
	        File outputdir = getOutputFolder();
	        //File outputdir = new File(getOutputFolder(testng.getOutputDirectory()), "1020_output");
	        //outputdir.mkdirs();
	        testng.setXmlSuites(Collections.singletonList(xmlSuite));
	        testng.setOutputDirectory(outputdir.getAbsolutePath());
	        testng.setUseDefaultListeners(true);
	        testng.run();
	    }

	    private static File getOutputFolder() {
	        String path = System.getProperty("user.dir") + "\\test-output\\testng-results.xml";
	        //System.getProperty("user.dir") + File.separator + outdir + File.separator;
	        System.out.println(System.getProperty("user.dir"));
	        System.out.println(path);
	        return new File(path);
	    }

}
