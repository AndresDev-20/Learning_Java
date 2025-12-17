package com.dev.palindrome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerifyPalindromeController {

    // Métodos
    @GetMapping("/verify-palindrome/{world}")
    public String isPalindrome(@PathVariable String world){
        StringBuilder sb = new StringBuilder(world);
        sb.reverse();
        if (world.equals(sb.toString())) {
            return "La palabra " + world + " es un Palindrome";
        } else {
            return "La palabra " + world + " No es un Palindrome";
        }
    }
}
