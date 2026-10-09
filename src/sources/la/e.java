package la;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ON_CONFIGURE;
    public static final e ON_CREATE;
    public static final e ON_DOWNGRADE;
    public static final e ON_OPEN;
    public static final e ON_UPGRADE;

    static {
        e eVar = new e("ON_CONFIGURE", 0);
        ON_CONFIGURE = eVar;
        e eVar2 = new e("ON_CREATE", 1);
        ON_CREATE = eVar2;
        e eVar3 = new e("ON_UPGRADE", 2);
        ON_UPGRADE = eVar3;
        e eVar4 = new e("ON_DOWNGRADE", 3);
        ON_DOWNGRADE = eVar4;
        e eVar5 = new e("ON_OPEN", 4);
        ON_OPEN = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = ub.a.U(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
