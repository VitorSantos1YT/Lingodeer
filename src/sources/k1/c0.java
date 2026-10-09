package k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 CornerExtraLarge;
    public static final c0 CornerExtraLargeTop;
    public static final c0 CornerExtraSmall;
    public static final c0 CornerExtraSmallTop;
    public static final c0 CornerFull;
    public static final c0 CornerLarge;
    public static final c0 CornerLargeEnd;
    public static final c0 CornerLargeTop;
    public static final c0 CornerMedium;
    public static final c0 CornerNone;
    public static final c0 CornerSmall;

    static {
        c0 c0Var = new c0("CornerExtraLarge", 0);
        CornerExtraLarge = c0Var;
        c0 c0Var2 = new c0("CornerExtraLargeTop", 1);
        CornerExtraLargeTop = c0Var2;
        c0 c0Var3 = new c0("CornerExtraSmall", 2);
        CornerExtraSmall = c0Var3;
        c0 c0Var4 = new c0("CornerExtraSmallTop", 3);
        CornerExtraSmallTop = c0Var4;
        c0 c0Var5 = new c0("CornerFull", 4);
        CornerFull = c0Var5;
        c0 c0Var6 = new c0("CornerLarge", 5);
        CornerLarge = c0Var6;
        c0 c0Var7 = new c0("CornerLargeEnd", 6);
        CornerLargeEnd = c0Var7;
        c0 c0Var8 = new c0("CornerLargeTop", 7);
        CornerLargeTop = c0Var8;
        c0 c0Var9 = new c0("CornerMedium", 8);
        CornerMedium = c0Var9;
        c0 c0Var10 = new c0("CornerNone", 9);
        CornerNone = c0Var10;
        c0 c0Var11 = new c0("CornerSmall", 10);
        CornerSmall = c0Var11;
        $VALUES = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10, c0Var11};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
