package rt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v4 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ v4[] $VALUES;
    public static final v4 FINISHED;
    public static final v4 IDLE;
    public static final v4 PAUSED;
    public static final v4 PLAYING;
    public static final v4 PREPARING;

    static {
        v4 v4Var = new v4("IDLE", 0);
        IDLE = v4Var;
        v4 v4Var2 = new v4("PREPARING", 1);
        PREPARING = v4Var2;
        v4 v4Var3 = new v4("PLAYING", 2);
        PLAYING = v4Var3;
        v4 v4Var4 = new v4("PAUSED", 3);
        PAUSED = v4Var4;
        v4 v4Var5 = new v4("FINISHED", 4);
        FINISHED = v4Var5;
        v4[] v4VarArr = {v4Var, v4Var2, v4Var3, v4Var4, v4Var5};
        $VALUES = v4VarArr;
        $ENTRIES = ub.a.U(v4VarArr);
    }

    public static v4 valueOf(String str) {
        return (v4) Enum.valueOf(v4.class, str);
    }

    public static v4[] values() {
        return (v4[]) $VALUES.clone();
    }
}
