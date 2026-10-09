package gf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g OPERATION_SUCCESS;
    public static final g SERVICE_ERROR;
    public static final g SERVICE_NOT_AVAILABLE;

    static {
        g gVar = new g("OPERATION_SUCCESS", 0);
        OPERATION_SUCCESS = gVar;
        g gVar2 = new g("SERVICE_NOT_AVAILABLE", 1);
        SERVICE_NOT_AVAILABLE = gVar2;
        g gVar3 = new g("SERVICE_ERROR", 2);
        SERVICE_ERROR = gVar3;
        $VALUES = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
