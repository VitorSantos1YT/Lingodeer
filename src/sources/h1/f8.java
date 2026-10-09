package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f8 {
    private static final /* synthetic */ f8[] $VALUES;
    public static final f8 Expanded;
    public static final f8 Hidden;
    public static final f8 PartiallyExpanded;

    static {
        f8 f8Var = new f8("Hidden", 0);
        Hidden = f8Var;
        f8 f8Var2 = new f8("Expanded", 1);
        Expanded = f8Var2;
        f8 f8Var3 = new f8("PartiallyExpanded", 2);
        PartiallyExpanded = f8Var3;
        $VALUES = new f8[]{f8Var, f8Var2, f8Var3};
    }

    public static f8 valueOf(String str) {
        return (f8) Enum.valueOf(f8.class, str);
    }

    public static f8[] values() {
        return (f8[]) $VALUES.clone();
    }
}
