package xq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d LEARN;
    public static final d LEARNED;
    public static final d WARNING;

    static {
        d dVar = new d("LEARNED", 0);
        LEARNED = dVar;
        d dVar2 = new d("LEARN", 1);
        LEARN = dVar2;
        d dVar3 = new d("WARNING", 2);
        WARNING = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = ub.a.U(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
