package b2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b SHOW_ORIGINAL;
    public static final b SHOW_TRANSLATED;

    static {
        b bVar = new b("SHOW_ORIGINAL", 0);
        SHOW_ORIGINAL = bVar;
        b bVar2 = new b("SHOW_TRANSLATED", 1);
        SHOW_TRANSLATED = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = ub.a.U(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
