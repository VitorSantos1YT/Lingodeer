package mu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i LARGE;
    public static final i MEDIUM;
    public static final i SMALL;

    static {
        i iVar = new i("SMALL", 0);
        SMALL = iVar;
        i iVar2 = new i("MEDIUM", 1);
        MEDIUM = iVar2;
        i iVar3 = new i("LARGE", 2);
        LARGE = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        $VALUES = iVarArr;
        $ENTRIES = ub.a.U(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
