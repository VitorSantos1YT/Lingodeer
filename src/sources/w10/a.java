package w10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DEBUG;
    public static final a ERROR;
    public static final a INFO;
    public static final a NONE;
    public static final a WARNING;

    static {
        a aVar = new a("DEBUG", 0);
        DEBUG = aVar;
        a aVar2 = new a("INFO", 1);
        INFO = aVar2;
        a aVar3 = new a("WARNING", 2);
        WARNING = aVar3;
        a aVar4 = new a("ERROR", 3);
        ERROR = aVar4;
        a aVar5 = new a("NONE", 4);
        NONE = aVar5;
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
