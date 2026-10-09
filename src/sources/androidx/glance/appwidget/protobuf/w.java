package androidx.glance.appwidget.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ w[] $VALUES;
    public static final w BUILD_MESSAGE_INFO;
    public static final w GET_DEFAULT_INSTANCE;
    public static final w GET_MEMOIZED_IS_INITIALIZED;
    public static final w GET_PARSER;
    public static final w NEW_BUILDER;
    public static final w NEW_MUTABLE_INSTANCE;
    public static final w SET_MEMOIZED_IS_INITIALIZED;

    static {
        w wVar = new w("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = wVar;
        w wVar2 = new w("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = wVar2;
        w wVar3 = new w("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = wVar3;
        w wVar4 = new w("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = wVar4;
        w wVar5 = new w("NEW_BUILDER", 4);
        NEW_BUILDER = wVar5;
        w wVar6 = new w("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = wVar6;
        w wVar7 = new w("GET_PARSER", 6);
        GET_PARSER = wVar7;
        $VALUES = new w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
