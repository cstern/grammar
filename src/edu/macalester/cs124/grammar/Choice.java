package edu.macalester.cs124.grammar;

import java.util.HashSet;
import java.util.Set;

import acm.util.RandomGenerator;


/**
 * A multiple choice substitution. When generating content, objects of this class select one of
 * their choices.
 */
public class Choice implements Substitution {
    private Set<Substitution> set = new HashSet<Substitution>();
    /**
     * Adds the given substitutions to the existing list of choices.
     */
    public void addChoice(Substitution substitution) {
        set.add(substitution); // TODO
    }
    
    /**
     * Randomly selects one of the choices, and calls its generate() method.
     * Raises an exception if addChoice() has never been called and there are no choices.
     */
    @Override
    public void generate(GeneratorContext context) {
        RandomGenerator rand = new RandomGenerator();
        rand = rand.nextInt()// TODO
    }
}
