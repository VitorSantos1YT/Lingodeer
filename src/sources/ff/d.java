package ff;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d MTML_APP_EVENT_PREDICTION;
    public static final d MTML_INTEGRITY_DETECT;

    static {
        d dVar = new d("MTML_INTEGRITY_DETECT", 0);
        MTML_INTEGRITY_DETECT = dVar;
        d dVar2 = new d("MTML_APP_EVENT_PREDICTION", 1);
        MTML_APP_EVENT_PREDICTION = dVar2;
        $VALUES = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        int i11 = c.f27235a[ordinal()];
        if (i11 == 1) {
            return "integrity_detect";
        }
        if (i11 == 2) {
            return "app_event_pred";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String b() {
        int i11 = c.f27235a[ordinal()];
        if (i11 == 1) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (i11 == 2) {
            return "MTML_APP_EVENT_PRED";
        }
        throw new NoWhenBranchMatchedException();
    }
}
