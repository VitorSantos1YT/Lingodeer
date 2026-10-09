package bt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f8 {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ f8[] $VALUES;
    public static final f8 PIC;
    public static final f8 PIC_TRANSLATION;
    public static final f8 PIC_WORD;

    static {
        f8 f8Var = new f8("PIC", 0);
        PIC = f8Var;
        f8 f8Var2 = new f8("PIC_WORD", 1);
        PIC_WORD = f8Var2;
        f8 f8Var3 = new f8("PIC_TRANSLATION", 2);
        PIC_TRANSLATION = f8Var3;
        f8[] f8VarArr = {f8Var, f8Var2, f8Var3};
        $VALUES = f8VarArr;
        $ENTRIES = ub.a.U(f8VarArr);
    }

    public static f8 valueOf(String str) {
        return (f8) Enum.valueOf(f8.class, str);
    }

    public static f8[] values() {
        return (f8[]) $VALUES.clone();
    }
}
