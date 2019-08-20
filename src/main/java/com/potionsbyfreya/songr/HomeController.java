package com.potionsbyfreya.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    // in node.js, our controllers had lines like app.get("/", (req, res) => ...)
    @GetMapping("/")
    public String getRoot() {
        System.out.println("somebody got the root");
        // needs to match exactly the filename of a template in resources/templates
        return "greeting";
    }

    // Models: useful for passing data to templates
    @GetMapping("/hello")
    public String getSayHello(@RequestParam(required=false, defaultValue = "World") String name, Model m) {
        // add any pieces of data that you want available in the template
        m.addAttribute("firstName", name);
        return "greeting";    }


    @GetMapping("/capitalize/{word}")
    public String capitalizeWord(@PathVariable String word, Model m) {
        // add any pieces of data that you want available in the template
        m.addAttribute("word", capitalizeWord(word));
        return "capitalize";
    }

    @GetMapping("/reverse")
    public String reverseWordOrder(@RequestParam(required=false, defaultValue = "Testing the reverse method") String words, Model m) {
        m.addAttribute("words", reverseOrderOfWords(words));
        return "reversed";
    }

    public static String capitalizeWord(String word) {
        return word.toUpperCase();
    }

    public static String reverseOrderOfWords(String string) {

        String[] temp = string.split(" ");
        String result = "";

        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                result = temp[i] + result;
            } else {
                result = " " + temp[i] + result;
            }
        }
        return result;
    }
}