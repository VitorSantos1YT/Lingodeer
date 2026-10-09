package l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 DEFERRED;
    public static final r0 IGNORED;
    public static final r0 IMMINENT;
    public static final r0 SCHEDULED;

    static {
        r0 r0Var = new r0("IGNORED", 0);
        IGNORED = r0Var;
        r0 r0Var2 = new r0("SCHEDULED", 1);
        SCHEDULED = r0Var2;
        r0 r0Var3 = new r0("DEFERRED", 2);
        DEFERRED = r0Var3;
        r0 r0Var4 = new r0("IMMINENT", 3);
        IMMINENT = r0Var4;
        r0[] r0VarArr = {r0Var, r0Var2, r0Var3, r0Var4};
        $VALUES = r0VarArr;
        $ENTRIES = ub.a.U(r0VarArr);
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
