package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h8 {
    private static final /* synthetic */ h8[] $VALUES;
    public static final h8 THUMB;
    public static final h8 TRACK;

    static {
        h8 h8Var = new h8("THUMB", 0);
        THUMB = h8Var;
        h8 h8Var2 = new h8("TRACK", 1);
        TRACK = h8Var2;
        $VALUES = new h8[]{h8Var, h8Var2};
    }

    public static h8 valueOf(String str) {
        return (h8) Enum.valueOf(h8.class, str);
    }

    public static h8[] values() {
        return (h8[]) $VALUES.clone();
    }
}
