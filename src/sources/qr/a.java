package qr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BIG;
    public static final a EXTRA_SMALL;
    public static final a MIDDLE;
    public static final a MIDDLE_SMALL;
    public static final a SMALL;

    static {
        a aVar = new a("EXTRA_SMALL", 0);
        EXTRA_SMALL = aVar;
        a aVar2 = new a("SMALL", 1);
        SMALL = aVar2;
        a aVar3 = new a("MIDDLE", 2);
        MIDDLE = aVar3;
        a aVar4 = new a("MIDDLE_SMALL", 3);
        MIDDLE_SMALL = aVar4;
        a aVar5 = new a("BIG", 4);
        BIG = aVar5;
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
