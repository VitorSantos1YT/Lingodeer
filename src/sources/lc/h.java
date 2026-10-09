package lc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum h {
    POSITIVE(0),
    NEGATIVE(1),
    NEUTRAL(2);

    public static final g Companion = new g();
    private final int index;

    h(int i11) {
        this.index = i11;
    }

    public final int a() {
        return this.index;
    }
}
