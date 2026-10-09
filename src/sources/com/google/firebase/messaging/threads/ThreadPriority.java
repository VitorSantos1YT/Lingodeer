package com.google.firebase.messaging.threads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadPriority {
    private static final /* synthetic */ ThreadPriority[] $VALUES;
    public static final ThreadPriority HIGH_SPEED;
    public static final ThreadPriority LOW_POWER;

    static {
        ThreadPriority threadPriority = new ThreadPriority("LOW_POWER", 0);
        LOW_POWER = threadPriority;
        ThreadPriority threadPriority2 = new ThreadPriority("HIGH_SPEED", 1);
        HIGH_SPEED = threadPriority2;
        $VALUES = new ThreadPriority[]{threadPriority, threadPriority2};
    }

    public static ThreadPriority valueOf(String str) {
        return (ThreadPriority) Enum.valueOf(ThreadPriority.class, str);
    }

    public static ThreadPriority[] values() {
        return (ThreadPriority[]) $VALUES.clone();
    }
}
