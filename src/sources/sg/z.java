package sg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z CENTER;
    public static final z LEFT;
    public static final z RIGHT;

    static {
        z zVar = new z("LEFT", 0);
        LEFT = zVar;
        z zVar2 = new z("CENTER", 1);
        CENTER = zVar2;
        z zVar3 = new z("RIGHT", 2);
        RIGHT = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        $VALUES = zVarArr;
        $ENTRIES = ub.a.U(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
