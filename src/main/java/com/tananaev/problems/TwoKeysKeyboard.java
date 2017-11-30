package com.tananaev.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TwoKeysKeyboard {

    public static class State {
        int length;
        int buffer;

        public State(int l, int b) {
            length = l;
            buffer = b;
        }

        @Override
        public boolean equals(Object obj) {
            State o = (State) obj;
            return (o.length == length) && (o.buffer == buffer);
        }

        @Override
        public int hashCode() {
            return Objects.hash(length, buffer);
        }
    }

    public int minSteps(Map<State, Integer> cache, State state, int n, int steps) {
        Integer cachedSteps = cache.get(state);
        if (cachedSteps != null && cachedSteps <= steps) {
            return Integer.MAX_VALUE;
        } else {
            cache.put(state, steps);
        }

        if (state.length == n) {
            return steps;
        } else if (state.length > n) {
            return Integer.MAX_VALUE;
        } else {
            return Math.min(
                    minSteps(cache, new State(state.length + state.buffer, state.buffer), n, steps + 1),
                    minSteps(cache, new State(state.length, state.length), n, steps + 1));
        }
    }

    public int minSteps(int n) {
        if (n == 1) return 0;
        return minSteps(new HashMap<>(), new State(1, 1), n, 1);
    }

}
