
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//this will be a lookup evaluating current lists of released tv and recoommending
//them in order of what genres you have selected. ui will be in html page

class AniLookup{


    public static void main(String []args){
        HashSet<String> anilist = new HashSet<String>();

        anilist.add("starter");
        Array newP = collectFromOnline();


    }

    public static Array[] collectFromOnline(){
        System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "web site with list";
        String expectedTitle = "welcome...";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed");
        } else {
            System.out.println("test failed: " + actualTitle);
        }
        driver.close();
        Array[] n = new Array[1];
        return n;

    }
    
    public void manAdd(HashSet<String> hs, String addThis){
        hs.add(addThis);
    }
    


}