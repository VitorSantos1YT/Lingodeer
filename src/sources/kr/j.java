package kr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j MOST_LIKE;
    public static final j RECENT;

    static {
        j jVar = new j("RECENT", 0);
        RECENT = jVar;
        j jVar2 = new j("MOST_LIKE", 1);
        MOST_LIKE = jVar2;
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
