package zx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements tx.c {
    private static final /* synthetic */ e[] $VALUES;
    public static final e INSTANCE;

    static {
        e eVar = new e("INSTANCE", 0);
        INSTANCE = eVar;
        $VALUES = new e[]{eVar};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @Override // tx.c
    public final void accept(Object obj) {
        ((n20.c) obj).request(Long.MAX_VALUE);
    }
}
