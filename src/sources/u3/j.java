package u3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j Ltr;
    public static final j Rtl;

    static {
        j jVar = new j("Ltr", 0);
        Ltr = jVar;
        j jVar2 = new j("Rtl", 1);
        Rtl = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = ub.a.U(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
