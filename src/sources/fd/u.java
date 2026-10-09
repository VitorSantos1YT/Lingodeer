package fd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u BEVEL;
    public static final u MITER;
    public static final u ROUND;

    static {
        u uVar = new u("MITER", 0);
        MITER = uVar;
        u uVar2 = new u("ROUND", 1);
        ROUND = uVar2;
        u uVar3 = new u("BEVEL", 2);
        BEVEL = uVar3;
        $VALUES = new u[]{uVar, uVar2, uVar3};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
