package fd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ w[] $VALUES;
    public static final w INDIVIDUALLY;
    public static final w SIMULTANEOUSLY;

    static {
        w wVar = new w("SIMULTANEOUSLY", 0);
        SIMULTANEOUSLY = wVar;
        w wVar2 = new w("INDIVIDUALLY", 1);
        INDIVIDUALLY = wVar2;
        $VALUES = new w[]{wVar, wVar2};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
