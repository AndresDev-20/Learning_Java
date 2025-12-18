package com.dev.palindrome.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controlador para verificar palíndromos
 */
@RestController
public class VerifyPalindromeController {

    /**
     * Endpoint para verificar si una palabra es palíndromo
     * @param w La palabra a verificar
     * @return Un mensaje indicando si la palabra es palíndromo o no.
     */
    // Métodos
    @GetMapping("/verify-palindrome/{w}")
    public String isPalindrome(@PathVariable String w){
        var word = w.replace(" ", "").toLowerCase();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        if (word.equals(sb.toString())) {
            return "La palabra " + word + " es un Palindrome";
        } else {
            return "La palabra " + word + " No es un Palindrome";
        }
    }
}
