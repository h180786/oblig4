

 package no.hvl.dat108.Oblig4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/deltagerliste")
public class DeltagerListeController {

    @GetMapping
    public String hentDeltagerliste(){
        return "deltagerlisteView";
    }
}