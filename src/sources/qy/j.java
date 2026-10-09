package qy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j NONE;
    public static final j PUBLICATION;
    public static final j SYNCHRONIZED;

    static {
        j jVar = new j("SYNCHRONIZED", 0);
        SYNCHRONIZED = jVar;
        j jVar2 = new j("PUBLICATION", 1);
        PUBLICATION = jVar2;
        j jVar3 = new j("NONE", 2);
        NONE = jVar3;
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
