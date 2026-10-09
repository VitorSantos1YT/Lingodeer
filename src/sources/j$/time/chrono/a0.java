package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements j {
    public static final a0 BEFORE_ROC;
    public static final a0 ROC;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a0[] f34951a;

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f34951a.clone();
    }

    static {
        a0 a0Var = new a0("BEFORE_ROC", 0);
        BEFORE_ROC = a0Var;
        a0 a0Var2 = new a0("ROC", 1);
        ROC = a0Var2;
        f34951a = new a0[]{a0Var, a0Var2};
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}
