package com.google.common.graph;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class GraphConstants {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Presence {
        private static final /* synthetic */ Presence[] $VALUES;
        public static final Presence EDGE_EXISTS;

        static {
            Presence presence = new Presence("EDGE_EXISTS", 0);
            EDGE_EXISTS = presence;
            $VALUES = new Presence[]{presence};
        }

        public static Presence valueOf(String str) {
            return (Presence) Enum.valueOf(Presence.class, str);
        }

        public static Presence[] values() {
            return (Presence[]) $VALUES.clone();
        }
    }

    private GraphConstants() {
    }
}
