package techproed.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
Runner class; testNG deki .xml file larda belirttiğimiz class'ları,packageları veya methodları nasıl
çalıştırıyorsak, Cucumber frameworkundede Runner class'ındaki tags parametresi ile belirttiğimiz
senaryoyu çalıştırabiliriz
 */


//Cucumber ile JUnit'in antegre olmasini saglayan test calistirici notasyonudur.
@RunWith(Cucumber.class)

//Seneryolarin nerede ve nasil calisacagi# hangi raporu kullanacagiyla alakali secenekleri ayarlariz.

@CucumberOptions(plugin = {"pretty","html:src/test/resources/features/htmlReport/cucumberHooks.html",
                                    "json:src/test/resources/features/htmlReport/cucumber.json",
                                    "junit:src/test/resources/features/htmlReport/cucumber.xml"},

        features = "src/test/resources/features/day30_ilkFteature",    //Burasi day30_ilkFeaturenin yolu,
        glue = {"techproed/stepDefinitions"},  //Bu parametre ile  stepDefinitionun dosyasinin yolu
        tags = "@hooks",//çalıştırmak istediğin grubu yaz
        dryRun = false,//dryRun=false Test adımlarını kontrol eder ve browser'ı çalıştırır
        //dryRun=True Test adımlarını sadece kontrol eder
        //default olarak false'tur
        monochrome = true//pretty ifadesinden sonra monochrome = true kullanırsak senerio adımlarını tekrenk olark siyah gösterir
        //monochrome = false kullanırsak renkli gösterir
        //default false
)


/*features ===> features'ların olduğu package'in yolunu ver(ContentRoot)
        glue ====> stepDefinition'ların olduğu package'in yolunu ver(Source Root)
        tags ====> çalıştırmak istediğin grubu yaz
*/
public class Runner {
}
