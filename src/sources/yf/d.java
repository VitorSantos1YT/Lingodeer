package yf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d AUTOMATIC;
    public static final d FEED;
    public static final d NATIVE;
    public static final d WEB;

    static {
        d dVar = new d("AUTOMATIC", 0);
        AUTOMATIC = dVar;
        d dVar2 = new d("NATIVE", 1);
        NATIVE = dVar2;
        d dVar3 = new d("WEB", 2);
        WEB = dVar3;
        d dVar4 = new d("FEED", 3);
        FEED = dVar4;
        $VALUES = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
