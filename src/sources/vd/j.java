package vd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j DECODE_DATA;
    public static final j INITIALIZE;
    public static final j SWITCH_TO_SOURCE_SERVICE;

    static {
        j jVar = new j("INITIALIZE", 0);
        INITIALIZE = jVar;
        j jVar2 = new j("SWITCH_TO_SOURCE_SERVICE", 1);
        SWITCH_TO_SOURCE_SERVICE = jVar2;
        j jVar3 = new j("DECODE_DATA", 2);
        DECODE_DATA = jVar3;
        $VALUES = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
