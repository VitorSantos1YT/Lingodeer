package app.rive.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageHandle {
    private final long handle;

    private /* synthetic */ ImageHandle(long j11) {
        this.handle = j11;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageHandle m175boximpl(long j11) {
        return new ImageHandle(j11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m177equalsimpl(long j11, Object obj) {
        return (obj instanceof ImageHandle) && j11 == ((ImageHandle) obj).m181unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m178equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m179hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m180toStringimpl(long j11) {
        return "ImageHandle(" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m177equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m179hashCodeimpl(this.handle);
    }

    public String toString() {
        return m180toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m181unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m176constructorimpl(long j11) {
        return j11;
    }
}
