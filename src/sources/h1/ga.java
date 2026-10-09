package h1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ga {
    private static final /* synthetic */ ga[] $VALUES;
    public static final ga Divider;
    public static final ga Indicator;
    public static final ga Tabs;

    static {
        ga gaVar = new ga("Tabs", 0);
        Tabs = gaVar;
        ga gaVar2 = new ga("Divider", 1);
        Divider = gaVar2;
        ga gaVar3 = new ga("Indicator", 2);
        Indicator = gaVar3;
        $VALUES = new ga[]{gaVar, gaVar2, gaVar3};
    }

    public static ga valueOf(String str) {
        return (ga) Enum.valueOf(ga.class, str);
    }

    public static ga[] values() {
        return (ga[]) $VALUES.clone();
    }
}
