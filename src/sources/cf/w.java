package cf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum w {
    INAPP("inapp"),
    SUBS("subs");

    private final String type;

    w(String str) {
        this.type = str;
    }

    public final String a() {
        return this.type;
    }
}
