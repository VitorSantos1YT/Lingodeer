package kv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 Primary;
    public static final a0 Secondary;

    static {
        a0 a0Var = new a0("Primary", 0);
        Primary = a0Var;
        a0 a0Var2 = new a0("Secondary", 1);
        Secondary = a0Var2;
        a0[] a0VarArr = {a0Var, a0Var2};
        $VALUES = a0VarArr;
        $ENTRIES = ub.a.U(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
