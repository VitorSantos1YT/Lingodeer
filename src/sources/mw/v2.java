package mw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v2 {
    private static final /* synthetic */ v2[] $VALUES;
    public static final v2 ERROR;
    public static final v2 NO_RESOLUTION;
    public static final v2 SUCCESS;

    static {
        v2 v2Var = new v2("NO_RESOLUTION", 0);
        NO_RESOLUTION = v2Var;
        v2 v2Var2 = new v2("SUCCESS", 1);
        SUCCESS = v2Var2;
        v2 v2Var3 = new v2("ERROR", 2);
        ERROR = v2Var3;
        $VALUES = new v2[]{v2Var, v2Var2, v2Var3};
    }

    public static v2 valueOf(String str) {
        return (v2) Enum.valueOf(v2.class, str);
    }

    public static v2[] values() {
        return (v2[]) $VALUES.clone();
    }
}
