package rw;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c ASYNC;
    public static final c BLOCKING;
    public static final c FUTURE;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    static {
        c cVar = new c(SemtNwfPgIhi.zGOsURorgvFr, 0);
        BLOCKING = cVar;
        c cVar2 = new c("FUTURE", 1);
        FUTURE = cVar2;
        c cVar3 = new c("ASYNC", 2);
        ASYNC = cVar3;
        $VALUES = new c[]{cVar, cVar2, cVar3};
    }
}
