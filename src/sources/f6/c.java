package f6;

import vf.eq.EHjhWcesDUIsIw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTIVITY;
    public static final c BROADCAST;
    public static final c CALLBACK;
    public static final c FOREGROUND_SERVICE;
    public static final c SERVICE;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    static {
        c cVar = new c("ACTIVITY", 0);
        ACTIVITY = cVar;
        c cVar2 = new c("BROADCAST", 1);
        BROADCAST = cVar2;
        c cVar3 = new c("SERVICE", 2);
        SERVICE = cVar3;
        c cVar4 = new c("FOREGROUND_SERVICE", 3);
        FOREGROUND_SERVICE = cVar4;
        c cVar5 = new c(EHjhWcesDUIsIw.WTPk, 4);
        CALLBACK = cVar5;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }
}
