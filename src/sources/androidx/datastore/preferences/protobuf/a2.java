package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {
    private static final /* synthetic */ a2[] $VALUES;
    public static final a2 ASCENDING;
    public static final a2 DESCENDING;

    static {
        a2 a2Var = new a2("ASCENDING", 0);
        ASCENDING = a2Var;
        a2 a2Var2 = new a2("DESCENDING", 1);
        DESCENDING = a2Var2;
        $VALUES = new a2[]{a2Var, a2Var2};
    }

    public static a2 valueOf(String str) {
        return (a2) Enum.valueOf(a2.class, str);
    }

    public static a2[] values() {
        return (a2[]) $VALUES.clone();
    }
}
