package lf;

import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum f1 {
    None(0),
    Enabled(1),
    RequireConfirm(2);

    private static final EnumSet<f1> ALL;
    public static final e1 Companion = new e1();
    private final long value;

    static {
        EnumSet<f1> enumSetAllOf = EnumSet.allOf(f1.class);
        kotlin.jvm.internal.m.e(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        ALL = enumSetAllOf;
    }

    f1(long j11) {
        this.value = j11;
    }

    public final long b() {
        return this.value;
    }
}
