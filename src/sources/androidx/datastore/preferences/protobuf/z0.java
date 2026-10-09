package androidx.datastore.preferences.protobuf;

import bw.ORXQ.ADSb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 EDITIONS;
    public static final z0 PROTO2;
    public static final z0 PROTO3;

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }

    static {
        z0 z0Var = new z0("PROTO2", 0);
        PROTO2 = z0Var;
        z0 z0Var2 = new z0("PROTO3", 1);
        PROTO3 = z0Var2;
        z0 z0Var3 = new z0(ADSb.SBXIxuDjjlsKdR, 2);
        EDITIONS = z0Var3;
        $VALUES = new z0[]{z0Var, z0Var2, z0Var3};
    }
}
