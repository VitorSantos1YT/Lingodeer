package ex;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements yw.b {
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 INSTANCE;

    static {
        s0 s0Var = new s0("INSTANCE", 0);
        INSTANCE = s0Var;
        $VALUES = new s0[]{s0Var};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }

    @Override // yw.b
    public final void accept(Object obj) {
        ((n20.c) obj).request(Long.MAX_VALUE);
    }
}
