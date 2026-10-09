package wc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    private static final /* synthetic */ u[] $VALUES;
    public static final u NONE;
    public static final u PLAY;
    public static final u RESUME;

    static {
        u uVar = new u("NONE", 0);
        NONE = uVar;
        u uVar2 = new u("PLAY", 1);
        PLAY = uVar2;
        u uVar3 = new u("RESUME", 2);
        RESUME = uVar3;
        $VALUES = new u[]{uVar, uVar2, uVar3};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
