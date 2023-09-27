package setsAndMapsAssignment;

import java.util.HashSet;
import java.util.Set;
public class UniqueEmails {
    public static int numberOfUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (String email : emails) {
            StringBuilder normalizedEmail = new StringBuilder();
            boolean ignore = false;
            
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                
                if (c == '.') {
                    continue;
                } else if (c == '+') {
                    while (email.charAt(i) != '@') {
                        i++;
                    }
                    i--; 
                    ignore = true;
                } else if (c == '@') {
                    normalizedEmail.append(email.substring(i));
                    break;
                } else if (!ignore) {
                    normalizedEmail.append(c);
                }
            }
            
            String normalized = normalizedEmail.toString();
            uniqueEmails.add(normalized);
        }
        
        return uniqueEmails.size();
    }
    
    public static void main(String[] args) {
        String[] emails1 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "teste.mail+david@lee.tcode.com"};
        System.out.println(numberOfUniqueEmails(emails1));
        
        String[] emails2 = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        System.out.println(numberOfUniqueEmails(emails2));
    }
}
