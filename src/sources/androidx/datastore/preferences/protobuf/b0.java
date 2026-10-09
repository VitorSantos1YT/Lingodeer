package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 BUILD_MESSAGE_INFO;
    public static final b0 GET_DEFAULT_INSTANCE;
    public static final b0 GET_MEMOIZED_IS_INITIALIZED;
    public static final b0 GET_PARSER;
    public static final b0 NEW_BUILDER;
    public static final b0 NEW_MUTABLE_INSTANCE;
    public static final b0 SET_MEMOIZED_IS_INITIALIZED;

    static {
        b0 b0Var = new b0("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = b0Var;
        b0 b0Var2 = new b0("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = b0Var2;
        b0 b0Var3 = new b0("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = b0Var3;
        b0 b0Var4 = new b0("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = b0Var4;
        b0 b0Var5 = new b0("NEW_BUILDER", 4);
        NEW_BUILDER = b0Var5;
        b0 b0Var6 = new b0("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = b0Var6;
        b0 b0Var7 = new b0("GET_PARSER", 6);
        GET_PARSER = b0Var7;
        $VALUES = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
