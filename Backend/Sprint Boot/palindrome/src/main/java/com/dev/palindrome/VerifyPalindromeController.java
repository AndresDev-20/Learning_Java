package com.dev.palindrome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerifyPalindromeController {

    // Métodos
    @GetMapping("/verify-palindrome/{world}")
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
