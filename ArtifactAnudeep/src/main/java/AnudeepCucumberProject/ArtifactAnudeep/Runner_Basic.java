package AnudeepCucumberProject.ArtifactAnudeep;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Cucmber//b.feature",dryRun=true,glue="/ArtifactAnudeep/src/main/java/AnudeepCucumberProject/ArtifactAnudeep/AccountsPage_StepDefination.java")
public class Runner_Basic {

}

//dryrun,glue,tags,