package gq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 BLOCKED;
    public static final c0 FAILED;
    public static final c0 SUCCESS;
    public static final c0 SUPERSEDED;

    static {
        c0 c0Var = new c0("SUCCESS", 0);
        SUCCESS = c0Var;
        c0 c0Var2 = new c0("FAILED", 1);
        FAILED = c0Var2;
        c0 c0Var3 = new c0("SUPERSEDED", 2);
        SUPERSEDED = c0Var3;
        c0 c0Var4 = new c0("BLOCKED", 3);
        BLOCKED = c0Var4;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4};
        $VALUES = c0VarArr;
        $ENTRIES = ub.a.U(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
