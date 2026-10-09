package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k HIGH;
    public static final k IMMEDIATE;
    public static final k LOW;
    public static final k NORMAL;

    static {
        k kVar = new k("IMMEDIATE", 0);
        IMMEDIATE = kVar;
        k kVar2 = new k("HIGH", 1);
        HIGH = kVar2;
        k kVar3 = new k("NORMAL", 2);
        NORMAL = kVar3;
        k kVar4 = new k("LOW", 3);
        LOW = kVar4;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
