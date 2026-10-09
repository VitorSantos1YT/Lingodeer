package tf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum h0 {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");

    public static final g0 Companion = new g0();
    private final String targetApp;

    h0(String str) {
        this.targetApp = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.targetApp;
    }
}
