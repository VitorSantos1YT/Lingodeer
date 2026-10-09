package td;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b DEFAULT;
    public static final b PREFER_ARGB_8888;
    public static final b PREFER_RGB_565;

    static {
        b bVar = new b("PREFER_ARGB_8888", 0);
        PREFER_ARGB_8888 = bVar;
        b bVar2 = new b("PREFER_RGB_565", 1);
        PREFER_RGB_565 = bVar2;
        $VALUES = new b[]{bVar, bVar2};
        DEFAULT = bVar;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
