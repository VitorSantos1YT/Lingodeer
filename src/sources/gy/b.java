package gy;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements tx.f, tx.d {
    private static final /* synthetic */ b[] $VALUES;
    public static final b INSTANCE;

    static {
        b bVar = new b("INSTANCE", 0);
        INSTANCE = bVar;
        $VALUES = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // tx.d
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // tx.f
    public final Object get() {
        return new ArrayList();
    }
}
