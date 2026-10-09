package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i11);

    public final native int nativeGetCounterValue(long j11);

    public final native int nativeIncrementAndGetCounterValue(long j11);

    public final native int nativeTruncateFile(int i11);
}
