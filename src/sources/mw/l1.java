package mw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 {
    private static final /* synthetic */ l1[] $VALUES;
    public static final l1 HEADER;
    public static final l1 HEADER_COMMENT;
    public static final l1 HEADER_CRC;
    public static final l1 HEADER_EXTRA;
    public static final l1 HEADER_EXTRA_LEN;
    public static final l1 HEADER_NAME;
    public static final l1 INFLATER_NEEDS_INPUT;
    public static final l1 INFLATING;
    public static final l1 INITIALIZE_INFLATER;
    public static final l1 TRAILER;

    static {
        l1 l1Var = new l1("HEADER", 0);
        HEADER = l1Var;
        l1 l1Var2 = new l1("HEADER_EXTRA_LEN", 1);
        HEADER_EXTRA_LEN = l1Var2;
        l1 l1Var3 = new l1("HEADER_EXTRA", 2);
        HEADER_EXTRA = l1Var3;
        l1 l1Var4 = new l1("HEADER_NAME", 3);
        HEADER_NAME = l1Var4;
        l1 l1Var5 = new l1("HEADER_COMMENT", 4);
        HEADER_COMMENT = l1Var5;
        l1 l1Var6 = new l1("HEADER_CRC", 5);
        HEADER_CRC = l1Var6;
        l1 l1Var7 = new l1("INITIALIZE_INFLATER", 6);
        INITIALIZE_INFLATER = l1Var7;
        l1 l1Var8 = new l1("INFLATING", 7);
        INFLATING = l1Var8;
        l1 l1Var9 = new l1("INFLATER_NEEDS_INPUT", 8);
        INFLATER_NEEDS_INPUT = l1Var9;
        l1 l1Var10 = new l1("TRAILER", 9);
        TRAILER = l1Var10;
        $VALUES = new l1[]{l1Var, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6, l1Var7, l1Var8, l1Var9, l1Var10};
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }
}
