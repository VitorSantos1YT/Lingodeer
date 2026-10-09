package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 ALLOW;
    public static final a1 PREVENT;
    public static final a1 PREVENT_WHEN_EMPTY;

    static {
        a1 a1Var = new a1("ALLOW", 0);
        ALLOW = a1Var;
        a1 a1Var2 = new a1("PREVENT_WHEN_EMPTY", 1);
        PREVENT_WHEN_EMPTY = a1Var2;
        a1 a1Var3 = new a1("PREVENT", 2);
        PREVENT = a1Var3;
        $VALUES = new a1[]{a1Var, a1Var2, a1Var3};
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }
}
