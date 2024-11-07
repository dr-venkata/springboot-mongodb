import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // Route to display index.html when accessing the root URL
    @GetMapping("/") 
    public String showIndex() {
        return "index"; // This should match the name of your index.html file (without .html)
    }

    // Route to display associates.html when accessing the /associates URL
    @GetMapping("/associates") 
    public String showAssociates() {
        return "associates"; // This should match the name of your associates.html file (without .html)
    }
}

