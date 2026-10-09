package app.rive.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FileHandle {
    private final long handle;

    private /* synthetic */ FileHandle(long j11) {
        this.handle = j11;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FileHandle m161boximpl(long j11) {
        return new FileHandle(j11);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m163equalsimpl(long j11, Object obj) {
        return (obj instanceof FileHandle) && j11 == ((FileHandle) obj).m167unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m164equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m165hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m166toStringimpl(long j11) {
        return "FileHandle(" + j11 + ')';
    }

    public boolean equals(Object obj) {
        return m163equalsimpl(this.handle, obj);
    }

    public final long getHandle() {
        return this.handle;
    }

    public int hashCode() {
        return m165hashCodeimpl(this.handle);
    }

    public String toString() {
        return m166toStringimpl(this.handle);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m167unboximpl() {
        return this.handle;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m162constructorimpl(long j11) {
        return j11;
    }
}
