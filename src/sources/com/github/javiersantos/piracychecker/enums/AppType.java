package com.github.javiersantos.piracychecker.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class AppType {
    private static final /* synthetic */ AppType[] $VALUES;
    public static final AppType OTHER;
    public static final AppType PIRATE;
    public static final AppType STORE;

    static {
        AppType appType = new AppType("PIRATE", 0);
        PIRATE = appType;
        AppType appType2 = new AppType("STORE", 1);
        STORE = appType2;
        AppType appType3 = new AppType("OTHER", 2);
        OTHER = appType3;
        $VALUES = new AppType[]{appType, appType2, appType3};
    }

    public static AppType valueOf(String str) {
        return (AppType) Enum.valueOf(AppType.class, str);
    }

    public static AppType[] values() {
        return (AppType[]) $VALUES.clone();
    }
}
