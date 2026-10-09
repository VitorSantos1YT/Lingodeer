package lw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e DEBUG;
    public static final e ERROR;
    public static final e INFO;
    public static final e WARNING;

    static {
        e eVar = new e("DEBUG", 0);
        DEBUG = eVar;
        e eVar2 = new e("INFO", 1);
        INFO = eVar2;
        e eVar3 = new e("WARNING", 2);
        WARNING = eVar3;
        e eVar4 = new e("ERROR", 3);
        ERROR = eVar4;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
