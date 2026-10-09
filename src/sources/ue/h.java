package ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum h {
    OPTIONS("data_processing_options"),
    COUNTRY("data_processing_options_country"),
    STATE("data_processing_options_state");

    public static final g Companion = new g();
    private final String rawValue;

    h(String str) {
        this.rawValue = str;
    }

    public final String a() {
        return this.rawValue;
    }
}
