package vd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public c(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}
