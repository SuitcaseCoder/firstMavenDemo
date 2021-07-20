import com.google.gson.Gson;

public class MavenDemoApp {
    public static void main(String[] args) {
        
        Computer computer = new Computer("EVGA", "RapterXPro", true);
        
        // using Gson here:
        // first know that json is just a string
        
        // create a string variable
        String computerJson = new Gson().toJson(computer);
    
        System.out.println(computerJson);
    }
}
