package tg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 Ordered;
    public static final d0 Unordered;

    static {
        d0 d0Var = new d0("Ordered", 0);
        Ordered = d0Var;
        d0 d0Var2 = new d0("Unordered", 1);
        Unordered = d0Var2;
        d0[] d0VarArr = {d0Var, d0Var2};
        $VALUES = d0VarArr;
        $ENTRIES = ub.a.U(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
