package gf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum e {
    MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
    CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

    private final String eventType;

    e(String str) {
        this.eventType = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.eventType;
    }
}
