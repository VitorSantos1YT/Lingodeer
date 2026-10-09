package fd;

import pt.ImS.aYZzTH;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j ADD;
    public static final j EXCLUDE_INTERSECTIONS;
    public static final j INTERSECT;
    public static final j MERGE;
    public static final j SUBTRACT;

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    static {
        j jVar = new j("MERGE", 0);
        MERGE = jVar;
        j jVar2 = new j("ADD", 1);
        ADD = jVar2;
        j jVar3 = new j("SUBTRACT", 2);
        SUBTRACT = jVar3;
        j jVar4 = new j("INTERSECT", 3);
        INTERSECT = jVar4;
        j jVar5 = new j(aYZzTH.WlTKPEOEeSiGMT, 4);
        EXCLUDE_INTERSECTIONS = jVar5;
        $VALUES = new j[]{jVar, jVar2, jVar3, jVar4, jVar5};
    }
}
