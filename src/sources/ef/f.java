package ef;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f CUSTOM_APP_EVENTS;
    public static final f MOBILE_INSTALL_EVENT;

    static {
        f fVar = new f("MOBILE_INSTALL_EVENT", 0);
        MOBILE_INSTALL_EVENT = fVar;
        f fVar2 = new f("CUSTOM_APP_EVENTS", 1);
        CUSTOM_APP_EVENTS = fVar2;
        $VALUES = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
