package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public State f16328a = State.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16329b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State DONE;
        public static final State FAILED;
        public static final State NOT_READY;
        public static final State READY;

        static {
            State state = new State("READY", 0);
            READY = state;
            State state2 = new State("NOT_READY", 1);
            NOT_READY = state2;
            State state3 = new State("DONE", 2);
            DONE = state3;
            State state4 = new State("FAILED", 3);
            FAILED = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        State state = this.f16328a;
        State state2 = State.FAILED;
        Preconditions.r(state != state2);
        int iOrdinal = this.f16328a.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f16328a = state2;
            this.f16329b = a();
            if (this.f16328a != State.DONE) {
                this.f16328a = State.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16328a = State.NOT_READY;
        Object obj = this.f16329b;
        this.f16329b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
