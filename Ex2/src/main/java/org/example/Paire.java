package org.example;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

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
}