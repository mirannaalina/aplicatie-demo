package com.mirannaalina.aplicatie.aplicatiedemo;



import com.mirannaalina.aplicatie.aplicatiedemo.model.Utilizator;
import com.mirannaalina.aplicatie.aplicatiedemo.repository.UtilizatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;
import java.util.Map;


@Controller //asta inseamna ca clasa asta e un Controller

//controllerul primeste (request)cereri de la client folosind un depozit (REPOSITORY) pt a actualiza date, a da si a returna rezultate


public class MainController {

    @Autowired //inseamna ca cheama userRepository

    private UtilizatorRepository utilizatorRepository;

    @PostMapping(value = "/utilizatori")//metoda get arata datele in formular
    public @ResponseBody String addNewUser (@RequestParam String name , @RequestParam String zodiac , @RequestParam String day , @RequestParam String good ,
                                            @RequestParam String message){
        Utilizator u = new Utilizator();
        u.setName(name);
        u.setZodiac(zodiac);
        u.setDay(day);
        u.setGood(good);
        u.setMessage(message);
        utilizatorRepository.save(u);
        return "Saved";
    }

    @RequestMapping(value = "/addUtilizatori", method = RequestMethod.POST) //post creaza operatia prin butonu submit
    public ModelAndView submit(@RequestParam("name") String name,
                                @RequestParam("zodiac") String zodiac,
                                @RequestParam("love") String love,
                                @RequestParam("day") String day,
                                @RequestParam("good") String good,
                                @RequestParam("message") String message ) {
        System.out.println(name);
        //iau datele intr-un controller

    return new ModelAndView("success"+"because you chose :"+name +zodiac +love +day+good +message+"\n Your future is tra la la");

    }


      @RequestMapping("/index.html")
      public String index (){
        return "index";
      }



       @RequestMapping("index.html/formular.html")
            public String bothformular(){
            ///when you press --formular--
           //return formular

        return"formular";
            }

    @RequestMapping("/formular.html")
      public String formular(){
                return "formular";
    }
//<a href

    //submit la un controller , controlleru le salveaza in baza de date
    //dupa redirect din submit pe alta pagina


        }


