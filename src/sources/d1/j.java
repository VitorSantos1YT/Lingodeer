package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j COLLAPSED;
    public static final j CROSSED;
    public static final j NOT_CROSSED;

    static {
        j jVar = new j("CROSSED", 0);
        CROSSED = jVar;
        j jVar2 = new j("NOT_CROSSED", 1);
        NOT_CROSSED = jVar2;
        j jVar3 = new j("COLLAPSED", 2);
        COLLAPSED = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
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
