package app.rive.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DrawKey {
    private final long handle;

    private /* synthetic */ DrawKey(long j11) {
        this.handle = j11;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DrawKey m154boximpl(long j11) {
        return new DrawKey(j11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m156equalsimpl(long j11, Object obj) {
        return (obj instanceof DrawKey) && j11 == ((DrawKey) obj).m160unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m157equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m158hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m159toStringimpl(long j11) {
        return "DrawKey(handle=" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m156equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m158hashCodeimpl(this.handle);
    }

    public String toString() {
        return m159toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m160unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m155constructorimpl(long j11) {
        return j11;
    }
}
