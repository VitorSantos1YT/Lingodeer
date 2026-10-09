package nf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c Analysis;
    public static final c AnrReport;
    public static final c CrashReport;
    public static final c CrashShield;
    public static final c ThreadCheck;
    public static final c Unknown;

    static {
        c cVar = new c("Unknown", 0);
        Unknown = cVar;
        c cVar2 = new c("Analysis", 1);
        Analysis = cVar2;
        c cVar3 = new c("AnrReport", 2);
        AnrReport = cVar3;
        c cVar4 = new c("CrashReport", 3);
        CrashReport = cVar4;
        c cVar5 = new c("CrashShield", 4);
        CrashShield = cVar5;
        c cVar6 = new c("ThreadCheck", 5);
        ThreadCheck = cVar6;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i11 = b.f43763a[ordinal()];
        if (i11 == 1) {
            return "Analysis";
        }
        if (i11 == 2) {
            return "AnrReport";
        }
        if (i11 == 3) {
            return "CrashReport";
        }
        if (i11 != 4) {
            return i11 != 5 ? "Unknown" : "ThreadCheck";
        }
        return "CrashShield";
    }
}
