package ya;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i LOG;
    public static final i QUIET;
    public static final i STRICT;

    static {
        i iVar = new i("STRICT", 0);
        STRICT = iVar;
        i iVar2 = new i("LOG", 1);
        LOG = iVar2;
        i iVar3 = new i("QUIET", 2);
        QUIET = iVar3;
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
