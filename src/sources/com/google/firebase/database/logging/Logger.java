package com.google.firebase.database.logging;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Level {
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level DEBUG;
        public static final Level ERROR;
        public static final Level INFO;
        public static final Level NONE;
        public static final Level WARN;

        static {
            Level level = new Level("DEBUG", 0);
            DEBUG = level;
            Level level2 = new Level("INFO", 1);
            INFO = level2;
            Level level3 = new Level("WARN", 2);
            WARN = level3;
            Level level4 = new Level("ERROR", 3);
            ERROR = level4;
            Level level5 = new Level("NONE", 4);
            NONE = level5;
            $VALUES = new Level[]{level, level2, level3, level4, level5};
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    void a(Level level, String str, String str2, long j11);

    Level b();
}
