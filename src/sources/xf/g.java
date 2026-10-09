package xf;

import androidx.lifecycle.livedata.HeRS.DytezVyM;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g PHOTO;
    public static final g VIDEO;

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    static {
        g gVar = new g(DytezVyM.zolzu, 0);
        PHOTO = gVar;
        g gVar2 = new g("VIDEO", 1);
        VIDEO = gVar2;
        $VALUES = new g[]{gVar, gVar2};
    }
}
