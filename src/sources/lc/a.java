package lc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a MATCH_PARENT;
    public static final a WRAP_CONTENT;

    static {
        a aVar = new a("MATCH_PARENT", 0);
        MATCH_PARENT = aVar;
        a aVar2 = new a("WRAP_CONTENT", 1);
        WRAP_CONTENT = aVar2;
        $VALUES = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
