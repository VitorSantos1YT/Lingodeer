package pd;

import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g HIGH;
    public static final g IMMEDIATE;
    public static final g LOW;
    public static final g NORMAL;

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    static {
        g gVar = new g(OCBJEWZHh.IcPuJ, 0);
        LOW = gVar;
        g gVar2 = new g("NORMAL", 1);
        NORMAL = gVar2;
        g gVar3 = new g("HIGH", 2);
        HIGH = gVar3;
        g gVar4 = new g("IMMEDIATE", 3);
        IMMEDIATE = gVar4;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4};
    }
}
