package vd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k DATA_CACHE;
    public static final k ENCODE;
    public static final k FINISHED;
    public static final k INITIALIZE;
    public static final k RESOURCE_CACHE;
    public static final k SOURCE;

    static {
        k kVar = new k("INITIALIZE", 0);
        INITIALIZE = kVar;
        k kVar2 = new k("RESOURCE_CACHE", 1);
        RESOURCE_CACHE = kVar2;
        k kVar3 = new k("DATA_CACHE", 2);
        DATA_CACHE = kVar3;
        k kVar4 = new k("SOURCE", 3);
        SOURCE = kVar4;
        k kVar5 = new k("ENCODE", 4);
        ENCODE = kVar5;
        k kVar6 = new k("FINISHED", 5);
        FINISHED = kVar6;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
