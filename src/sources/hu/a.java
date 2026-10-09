package hu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EMPTY;
    public static final a NOT_STREAKED;
    public static final a STREAKED;
    public static final a STREAKED_FREEZE;
    public static final a STREAKED_SHIELD;

    static {
        a aVar = new a("STREAKED", 0);
        STREAKED = aVar;
        a aVar2 = new a("STREAKED_SHIELD", 1);
        STREAKED_SHIELD = aVar2;
        a aVar3 = new a("STREAKED_FREEZE", 2);
        STREAKED_FREEZE = aVar3;
        a aVar4 = new a("NOT_STREAKED", 3);
        NOT_STREAKED = aVar4;
        a aVar5 = new a("EMPTY", 4);
        EMPTY = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = ub.a.U(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
