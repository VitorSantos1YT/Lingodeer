package dt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z4 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ z4[] $VALUES;
    public static final z4 Idle;
    public static final z4 NormalPlaying;
    public static final z4 SlowPlaying;

    static {
        z4 z4Var = new z4("NormalPlaying", 0);
        NormalPlaying = z4Var;
        z4 z4Var2 = new z4("SlowPlaying", 1);
        SlowPlaying = z4Var2;
        z4 z4Var3 = new z4("Idle", 2);
        Idle = z4Var3;
        z4[] z4VarArr = {z4Var, z4Var2, z4Var3};
        $VALUES = z4VarArr;
        $ENTRIES = ub.a.U(z4VarArr);
    }

    public static z4 valueOf(String str) {
        return (z4) Enum.valueOf(z4.class, str);
    }

    public static z4[] values() {
        return (z4[]) $VALUES.clone();
    }
}
