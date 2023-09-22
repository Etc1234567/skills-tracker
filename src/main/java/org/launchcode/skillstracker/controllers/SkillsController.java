package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String landing() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                    "<h2> Here are a few programming languages we are learning. </h2>" +
                        "<ol>" +
                        "<li> Java </li>" +
                        "<li> JavaScript </li>" +
                        "<li> C </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        }

    @RequestMapping(value = "submit", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String submit(@RequestParam String name, String firstFavorite, String secondFavorite, String thirdFavorite) {
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstFavorite + "</li>\n" +
                "<li>" + secondFavorite + "</li>\n" +
                "<li>" + thirdFavorite + "</li>";
    }

    @GetMapping ("/form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<p> Type in your name and select the programming languages in order from favorite to least favorite. </p> \n" +
                        "<form method = 'get' action = '/submit'>" +
                        "<label>Name: <input type = 'text' name = 'name' /> </label>" +

                            "<label> My First Favorite Language: " +
                               "<select name='firstFavorite'>" +
                                "<option value= ''>Select One</option>" +
                                  "<option value='Java'>Java</option>" +
                                  "<option value='JavaScript'>JavaScript</option>" +
                                  "<option value='C'>C</option>" +
                              "</select></label>" +
                              //  "\n" +

                            "<label> My Second Favorite Language: " +
                            "<select name='secondFavorite'>" +
                            "<option value= ''>Select One</option>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='C'>C</option>" +
                            "</select></label>" +
                              //  "\n" +

                            "<label> My Third Favorite: " +
                            "<select name='thirdFavorite'>" +
                            "<option value= ''>Select One</option>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='C'>C</option>" +
                            "</select></label>" +
                           // "\n" +

                        "<input type = 'submit' value = 'Done!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }


}
