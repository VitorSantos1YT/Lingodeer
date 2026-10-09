package e6;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1 f25075a = new w1();

    public final void a(String str, int i11) {
        Trace.beginAsyncSection(str, i11);
    }

    public final void b(String str, int i11) {
        Trace.endAsyncSection(str, i11);
    }
}
