package qx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a BUFFER;
    public static final a DROP;
    public static final a ERROR;
    public static final a LATEST;
    public static final a MISSING;

    static {
        a aVar = new a("MISSING", 0);
        MISSING = aVar;
        a aVar2 = new a("ERROR", 1);
        ERROR = aVar2;
        a aVar3 = new a("BUFFER", 2);
        BUFFER = aVar3;
        a aVar4 = new a("DROP", 3);
        DROP = aVar4;
        a aVar5 = new a("LATEST", 4);
        LATEST = aVar5;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
