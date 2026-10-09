package x00;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i REPLACE;
    public static final i WRAP;

    static {
        i iVar = new i("WRAP", 0);
        WRAP = iVar;
        i iVar2 = new i("REPLACE", 1);
        REPLACE = iVar2;
        $VALUES = new i[]{iVar, iVar2};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
