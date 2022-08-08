package com.wildcodeschool.myProjectWithSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class HelloWorldController {
    @GetMapping("/*")
    public String hello(){
        return "Welcome to the SHIELD";
    }


    @GetMapping("/avengers/assemble")
    public String champion(){
        return "Avengers.... Assemble";
    }


    @GetMapping("/secret-bases")
    public String director(){
        return "Biarritz " +
                "Bordeaux" +
                "La Loupe" +
                "Lille" +
                "Lyon" +
                "Marseille" +
                "Nantes" +
                "Orléans" +
                "Paris" +
                "Reims" +
                "Strasbourg" +
                "Toulouse" +
                "Tours" +
                "Europe" +
                "Amsterdam" +
                "Barcelone" +
                "Berlin" +
                "Bruxelles" +
                "Bucarest" +
                "Lisbonne" +
                "Londres" +
                "Madrid" +
                "À distance nouveauté" +
                "RemoteRemote" +
                "RemoteRemote";
    }
}
