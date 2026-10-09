package mz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l INTERNAL;
    public static final l PRIVATE;
    public static final l PROTECTED;
    public static final l PUBLIC;

    static {
        l lVar = new l("PUBLIC", 0);
        PUBLIC = lVar;
        l lVar2 = new l("PROTECTED", 1);
        PROTECTED = lVar2;
        l lVar3 = new l("INTERNAL", 2);
        INTERNAL = lVar3;
        l lVar4 = new l("PRIVATE", 3);
        PRIVATE = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = ub.a.U(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
