package androidx.glance.appwidget.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 ASCENDING;
    public static final j1 DESCENDING;

    static {
        j1 j1Var = new j1("ASCENDING", 0);
        ASCENDING = j1Var;
        j1 j1Var2 = new j1("DESCENDING", 1);
        DESCENDING = j1Var2;
        $VALUES = new j1[]{j1Var, j1Var2};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
