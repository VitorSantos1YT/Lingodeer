package px;

import gy.f;
import qx.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f47199a;

    static {
        try {
            e eVar = a.f47198a;
            if (eVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f47199a = eVar;
        } catch (Throwable th2) {
            throw f.b(th2);
        }
    }

    public static o a() {
        o oVar = f47199a;
        if (oVar != null) {
            return oVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
