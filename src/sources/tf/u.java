package tf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum u {
    SUCCESS("success"),
    CANCEL("cancel"),
    ERROR("error");

    private final String loggingValue;

    u(String str) {
        this.loggingValue = str;
    }

    public final String a() {
        return this.loggingValue;
    }
}
