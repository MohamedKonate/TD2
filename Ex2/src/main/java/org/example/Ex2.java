package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex2 {
    // Question 1
    java.util.function.Predicate<Paire<Integer, Double>> ttp = p -> p.fst < 100;
    java.util.function.Predicate<Paire<Integer, Double>> ttg = p -> p.fst > 200;
    java.util.function.Predicate<Paire<Integer, Double>> tailleNotOk = p -> ttp.test(p) || ttg.test(p);
    java.util.function.Predicate<Paire<Integer, Double>> tailleOk = java.util.function.Predicate.not(tailleNotOk);
    java.util.function.Predicate<Paire<Integer, Double>> ptl = p -> p.snd > 150.0;
    java.util.function.Predicate<Paire<Integer, Double>> poidOk = java.util.function.Predicate.not(ptl);
    java.util.function.Predicate<Paire<Integer, Double>> accesOk = p -> tailleOk.test(p) && poidOk.test(p);

    // Question 2

    public <T> List<T> filtragePredicatif(List<java.util.function.Predicate<T>> Conditions , List<T> elements){

        List<T> result = new ArrayList<>();

        java.util.function.Predicate<T> predicat = x -> true;

        for(Predicate<T> p : Conditions){
            predicat = predicat.and(p);
        }
        for(T e : elements) {
            if (predicat.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}
