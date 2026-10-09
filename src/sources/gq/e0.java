package gq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 REGISTERED;
    public static final e0 RUNNING;
    public static final e0 STOPPED;
    public static final e0 TERMINATING;

    static {
        e0 e0Var = new e0("REGISTERED", 0);
        REGISTERED = e0Var;
        e0 e0Var2 = new e0("RUNNING", 1);
        RUNNING = e0Var2;
        e0 e0Var3 = new e0("TERMINATING", 2);
        TERMINATING = e0Var3;
        e0 e0Var4 = new e0("STOPPED", 3);
        STOPPED = e0Var4;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4};
        $VALUES = e0VarArr;
        $ENTRIES = ub.a.U(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
