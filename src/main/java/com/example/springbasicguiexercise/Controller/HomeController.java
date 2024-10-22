package com.example.springbasicguiexercise.Controller;

import com.example.springbasicguiexercise.Model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
        @GetMapping("/")
        public String index(){
            return "home/index";
        }

    @PostMapping("/AnimalData")
    public String showAnimal (@ModelAttribute Animal animal, Model model){

        model.addAttribute("claus",animal);

        return "home/AnimalData";
    }
}

