//Question 1:
//Every valid email consists of a local name and a domain name, separated by the '@' sign.
//Besides lowercase letters, the email may contain one or more '.' or '+'.
//For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is
//the domain name.
//If you add periods '.' between some characters in the local name part of an email
//address, mail sent there will be forwarded to the same address without dots in the local
//name. Note that this rule does not apply to domain names.
//For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same
//email address.
//If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
//This allows certain emails to be filtered. Note that this rule does not apply to domain
//names.
//For example, "m.y+name@email.com" will be forwarded to "my@email.com".
//It is possible to use both of these rules at the same time.
//Given an array of strings emails where we send one email to each emails[i], return the
//number of different addresses that actually receive mails.
//Example 1:
//Input: emails =
//["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","teste
//mail+david@lee.tcode.com"]
//Output: 2
//Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually
//receive mails.
//Example 2:
//Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
//Output: 3


package setsAndMapsAssignment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequentWords {
    public static String commonWord(String para, String[] bannedWords) {
        String[] words = para.toLowerCase().split("[!?',;.\\s]+");

        Set<String> bannedSet = new HashSet<>(Arrays.asList(bannedWords));
        Map<String, Integer> count = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }

        String mostCommon = "";
        int freq = 0;

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > freq) {
                freq = entry.getValue();
                mostCommon = entry.getKey();
            }
        }

        return mostCommon;
    }

    public static void main(String[] args) {
        String paragraph1 = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned1 = { "hit" };
        System.out.println(commonWord(paragraph1, banned1)); 

        String paragraph2 = "a.";
        String[] banned2 = {};
        System.out.println(commonWord(paragraph2, banned2));
    }
}
