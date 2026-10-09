package uz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 START;
    public static final z0 STOP;
    public static final z0 STOP_AND_RESET_REPLAY_CACHE;

    static {
        z0 z0Var = new z0("START", 0);
        START = z0Var;
        z0 z0Var2 = new z0("STOP", 1);
        STOP = z0Var2;
        z0 z0Var3 = new z0("STOP_AND_RESET_REPLAY_CACHE", 2);
        STOP_AND_RESET_REPLAY_CACHE = z0Var3;
        z0[] z0VarArr = {z0Var, z0Var2, z0Var3};
        $VALUES = z0VarArr;
        $ENTRIES = ub.a.U(z0VarArr);
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
