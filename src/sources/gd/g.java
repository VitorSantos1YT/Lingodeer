package gd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g IMAGE;
    public static final g NULL;
    public static final g PRE_COMP;
    public static final g SHAPE;
    public static final g SOLID;
    public static final g TEXT;
    public static final g UNKNOWN;

    static {
        g gVar = new g("PRE_COMP", 0);
        PRE_COMP = gVar;
        g gVar2 = new g("SOLID", 1);
        SOLID = gVar2;
        g gVar3 = new g("IMAGE", 2);
        IMAGE = gVar3;
        g gVar4 = new g("NULL", 3);
        NULL = gVar4;
        g gVar5 = new g("SHAPE", 4);
        SHAPE = gVar5;
        g gVar6 = new g("TEXT", 5);
        TEXT = gVar6;
        g gVar7 = new g("UNKNOWN", 6);
        UNKNOWN = gVar7;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
