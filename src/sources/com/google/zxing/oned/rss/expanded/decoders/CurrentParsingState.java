package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class CurrentParsingState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State ALPHA;
        public static final State ISO_IEC_646;
        public static final State NUMERIC;

        static {
            State state = new State("NUMERIC", 0);
            NUMERIC = state;
            State state2 = new State("ALPHA", 1);
            ALPHA = state2;
            State state3 = new State("ISO_IEC_646", 2);
            ISO_IEC_646 = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }
}
