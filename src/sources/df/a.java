package df;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23387b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23386a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashSet f23388c = new HashSet();

    public static final void a(Bundle bundle) {
        if (qf.a.b(a.class)) {
            return;
        }
        try {
            if (f23387b && bundle != null) {
                Iterator it = f23388c.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th2) {
            qf.a.a(a.class, th2);
        }
    }
}
