package fb;

import androidx.drawerlayout.widget.ktFt.FpIL;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 BLOCKED;
    public static final e0 CANCELLED;
    public static final e0 ENQUEUED;
    public static final e0 FAILED;
    public static final e0 RUNNING;
    public static final e0 SUCCEEDED;

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }

    static {
        e0 e0Var = new e0(FpIL.ciImCtEJOr, 0);
        ENQUEUED = e0Var;
        e0 e0Var2 = new e0("RUNNING", 1);
        RUNNING = e0Var2;
        e0 e0Var3 = new e0("SUCCEEDED", 2);
        SUCCEEDED = e0Var3;
        e0 e0Var4 = new e0("FAILED", 3);
        FAILED = e0Var4;
        e0 e0Var5 = new e0("BLOCKED", 4);
        BLOCKED = e0Var5;
        e0 e0Var6 = new e0("CANCELLED", 5);
        CANCELLED = e0Var6;
        $VALUES = new e0[]{e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6};
    }
}
