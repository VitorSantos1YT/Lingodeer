package uf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum e {
    AUTOMATIC(0, "automatic"),
    DISPLAY_ALWAYS(1, "display_always"),
    NEVER_DISPLAY(2, "never_display");

    public static final d Companion;
    private static final e DEFAULT;
    private final int intValue;
    private final String stringValue;

    static {
        e eVar = AUTOMATIC;
        Companion = new d();
        DEFAULT = eVar;
    }

    e(int i11, String str) {
        this.stringValue = str;
        this.intValue = i11;
    }

    public final int b() {
        return this.intValue;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.stringValue;
    }
}
