package pa;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(String str, int i11) {
        Trace.beginAsyncSection(str, i11);
    }

    public static void b(String str, int i11) {
        Trace.endAsyncSection(str, i11);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
