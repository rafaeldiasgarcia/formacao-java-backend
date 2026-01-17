package collections.ex04.pratica;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ex02 {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList("a@a.com", "b@b.com", "a@a.com", "c@c.com", "a@a.com");

        HashSet<String> emailsUnicos = new HashSet<>();
        emailsUnicos.addAll(emails);

        System.out.println(emails.size());
        System.out.println(emailsUnicos.size());
    }
}
