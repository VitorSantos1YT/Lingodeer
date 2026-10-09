package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile q f1534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f1535c = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1536a = Collections.EMPTY_MAP;

    public static q a() {
        q qVar;
        a1 a1Var = a1.f1445c;
        q qVar2 = f1534b;
        if (qVar2 != null) {
            return qVar2;
        }
        synchronized (q.class) {
            try {
                qVar = f1534b;
                if (qVar == null) {
                    Class cls = p.f1532a;
                    q qVar3 = null;
                    if (cls != null) {
                        try {
                            qVar3 = (q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qVar = qVar3 != null ? qVar3 : f1535c;
                    f1534b = qVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
