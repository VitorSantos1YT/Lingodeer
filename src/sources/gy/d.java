package gy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d BOUNDARY;
    public static final d END;
    public static final d IMMEDIATE;

    static {
        d dVar = new d("IMMEDIATE", 0);
        IMMEDIATE = dVar;
        d dVar2 = new d("BOUNDARY", 1);
        BOUNDARY = dVar2;
        d dVar3 = new d("END", 2);
        END = dVar3;
        $VALUES = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
