package ue;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l ARRAY;
    public static final l BOOL;
    public static final k Companion;
    public static final l INT;

    static {
        l lVar = new l("ARRAY", 0);
        ARRAY = lVar;
        l lVar2 = new l("BOOL", 1);
        BOOL = lVar2;
        l lVar3 = new l("INT", 2);
        INT = lVar3;
        $VALUES = new l[]{lVar, lVar2, lVar3};
        Companion = new k();
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
