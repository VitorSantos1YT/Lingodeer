package z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 Inherit;
    public static final a0 SecureOff;
    public static final a0 SecureOn;

    static {
        a0 a0Var = new a0("Inherit", 0);
        Inherit = a0Var;
        a0 a0Var2 = new a0("SecureOn", 1);
        SecureOn = a0Var2;
        a0 a0Var3 = new a0("SecureOff", 2);
        SecureOff = a0Var3;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3};
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
