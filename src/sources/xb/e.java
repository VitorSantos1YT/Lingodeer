package xb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ yy.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DISK;
    public static final e MEMORY;
    public static final e MEMORY_CACHE;
    public static final e NETWORK;

    static {
        e eVar = new e("MEMORY_CACHE", 0);
        MEMORY_CACHE = eVar;
        e eVar2 = new e("MEMORY", 1);
        MEMORY = eVar2;
        e eVar3 = new e("DISK", 2);
        DISK = eVar3;
        e eVar4 = new e("NETWORK", 3);
        NETWORK = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
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
