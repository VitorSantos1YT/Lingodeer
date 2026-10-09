package re;

import lt.AJC.PQgum;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 APP_EVENTS;
    public static final d0 CACHE;
    public static final d0 DEVELOPER_ERRORS;
    public static final d0 GRAPH_API_DEBUG_INFO;
    public static final d0 GRAPH_API_DEBUG_WARNING;
    public static final d0 INCLUDE_ACCESS_TOKENS;
    public static final d0 INCLUDE_RAW_RESPONSES;
    public static final d0 REQUESTS;

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }

    static {
        d0 d0Var = new d0("REQUESTS", 0);
        REQUESTS = d0Var;
        d0 d0Var2 = new d0(PQgum.zufEtotQPetMbZa, 1);
        INCLUDE_ACCESS_TOKENS = d0Var2;
        d0 d0Var3 = new d0("INCLUDE_RAW_RESPONSES", 2);
        INCLUDE_RAW_RESPONSES = d0Var3;
        d0 d0Var4 = new d0("CACHE", 3);
        CACHE = d0Var4;
        d0 d0Var5 = new d0("APP_EVENTS", 4);
        APP_EVENTS = d0Var5;
        d0 d0Var6 = new d0("DEVELOPER_ERRORS", 5);
        DEVELOPER_ERRORS = d0Var6;
        d0 d0Var7 = new d0("GRAPH_API_DEBUG_WARNING", 6);
        GRAPH_API_DEBUG_WARNING = d0Var7;
        d0 d0Var8 = new d0("GRAPH_API_DEBUG_INFO", 7);
        GRAPH_API_DEBUG_INFO = d0Var8;
        $VALUES = new d0[]{d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8};
    }
}
