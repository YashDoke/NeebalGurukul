package setsAndMapsAssignment;
import java.util.HashSet;
import java.util.Set;

public class SetCalculator {
    public static Set<Integer> performOperation(Set<Integer> set1, Set<Integer> set2, String operator) {
        Set<Integer> result = new HashSet<>();

        switch (operator) {
            case "&":
            case "intersection":
                result.addAll(set1);
                result.retainAll(set2);
                break;
            case "|":
            case "union":
                result.addAll(set1);
                result.addAll(set2);
                break;
            case "^":
            case "symmetric_difference":
                Set<Integer> temp1 = new HashSet<>(set1);
                Set<Integer> temp2 = new HashSet<>(set2);
                temp1.removeAll(set2);
                temp2.removeAll(set1);
                result.addAll(temp1);
                result.addAll(temp2);
                break;
            case "<":
            case "is_subset":
                result.addAll(set1);
                result.removeAll(set2);
                break;
            case ">":
            case "is_superset":
                result.addAll(set2);
                result.removeAll(set1);
                break;
            case "==":
            case "equals":
                result.addAll(set1);
                result.retainAll(set2);
                return result.size() == set1.size() && result.size() == set2.size() ? Set.of(1) : Set.of(0);
            case "!=":
            case "not_equals":
                result.addAll(set1);
                result.retainAll(set2);
                return result.size() == set1.size() && result.size() == set2.size() ? Set.of(0) : Set.of(1);
            default:
                System.out.println("Invalid operator");
        }

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        String operator = "&"; 

        Set<Integer> result = performOperation(set1, set2, operator);

        System.out.println("Result of " + operator + " operation: " + result);
    }
}
