package kv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 HANDWRITING;
    public static final s0 HIRAGANA;
    public static final s0 KATAKANA;

    static {
        s0 s0Var = new s0("HIRAGANA", 0);
        HIRAGANA = s0Var;
        s0 s0Var2 = new s0("KATAKANA", 1);
        KATAKANA = s0Var2;
        s0 s0Var3 = new s0("HANDWRITING", 2);
        HANDWRITING = s0Var3;
        s0[] s0VarArr = {s0Var, s0Var2, s0Var3};
        $VALUES = s0VarArr;
        $ENTRIES = ub.a.U(s0VarArr);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}
