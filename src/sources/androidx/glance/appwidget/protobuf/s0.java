package androidx.glance.appwidget.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 EDITIONS;
    public static final s0 PROTO2;
    public static final s0 PROTO3;

    static {
        s0 s0Var = new s0("PROTO2", 0);
        PROTO2 = s0Var;
        s0 s0Var2 = new s0("PROTO3", 1);
        PROTO3 = s0Var2;
        s0 s0Var3 = new s0("EDITIONS", 2);
        EDITIONS = s0Var3;
        $VALUES = new s0[]{s0Var, s0Var2, s0Var3};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}
