package c6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ p[] $VALUES;
    public static final p Gone;
    public static final p Invisible;
    public static final p Visible;

    static {
        p pVar = new p("Visible", 0);
        Visible = pVar;
        p pVar2 = new p("Invisible", 1);
        Invisible = pVar2;
        p pVar3 = new p("Gone", 2);
        Gone = pVar3;
        $VALUES = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
