package androidx.glance.appwidget.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile n f1967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f1968c = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1969a = Collections.EMPTY_MAP;

    public static n a() {
        n nVar;
        t0 t0Var = t0.f1996c;
        n nVar2 = f1967b;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (n.class) {
            try {
                nVar = f1967b;
                if (nVar == null) {
                    Class cls = m.f1965a;
                    n nVar3 = null;
                    if (cls != null) {
                        try {
                            nVar3 = (n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    nVar = nVar3 != null ? nVar3 : f1968c;
                    f1967b = nVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }
}
