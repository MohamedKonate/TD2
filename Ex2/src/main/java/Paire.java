import java.util.function.Predicate;

public class Paire<T,U> {
    public T fst;
    public U snd;

    public Paire(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s)", fst.toString(), snd.toString());
    }

    // Question 1
    Predicate<Paire<Integer, Double>> ttp = p -> p.fst < 100;
    Predicate<Paire<Integer, Double>> ttg = p -> p.fst > 200;
    Predicate<Paire<Integer, Double>> tailleNotOk = p -> ttp.test(p) || ttg.test(p);
    Predicate<Paire<Integer, Double>> tailleOk = Predicate.not(tailleNotOk);
    Predicate<Paire<Integer, Double>> ptl = p -> p.snd > 150.0;
    Predicate<Paire<Integer, Double>> poidOk = Predicate.not(ptl);
    Predicate<Paire<Integer, Double>> accesOk = p -> tailleOk.test(p) && poidOk.test(p);
}



