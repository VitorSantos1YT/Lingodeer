package cf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum v {
    NONE("none"),
    V1("Android-GPBL-V1"),
    V2_V4("Android-GPBL-V2-V4"),
    V5_V7("Android-GPBL-V5-V7");

    private final String type;

    v(String str) {
        this.type = str;
    }

    public final String a() {
        return this.type;
    }
}
