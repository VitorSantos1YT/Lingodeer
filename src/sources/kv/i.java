package kv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i Danger;
    public static final i Default;
    public static final i Link;
    public static final i Primary;

    static {
        i iVar = new i("Default", 0);
        Default = iVar;
        i iVar2 = new i("Primary", 1);
        Primary = iVar2;
        i iVar3 = new i("Danger", 2);
        Danger = iVar3;
        i iVar4 = new i("Link", 3);
        Link = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
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
