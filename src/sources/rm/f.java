package rm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f HIRAGANA;
    public static final f KATAKANA;

    static {
        f fVar = new f("HIRAGANA", 0);
        HIRAGANA = fVar;
        f fVar2 = new f("KATAKANA", 1);
        KATAKANA = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = ub.a.U(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
