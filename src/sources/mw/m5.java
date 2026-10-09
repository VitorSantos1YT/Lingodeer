package mw;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m5 f42549d = new m5(new n3(17));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f42550a = new IdentityHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3 f42551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f42552c;

    public m5(n3 n3Var) {
        this.f42551b = n3Var;
    }

    public static Object a(l5 l5Var) {
        Object obj;
        m5 m5Var = f42549d;
        synchronized (m5Var) {
            try {
                k5 k5Var = (k5) m5Var.f42550a.get(l5Var);
                if (k5Var == null) {
                    k5Var = new k5(l5Var.b());
                    m5Var.f42550a.put(l5Var, k5Var);
                }
                ScheduledFuture scheduledFuture = k5Var.f42518c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    k5Var.f42518c = null;
                }
                k5Var.f42517b++;
                obj = k5Var.f42516a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public static void b(l5 l5Var, Object obj) {
        m5 m5Var = f42549d;
        synchronized (m5Var) {
            try {
                k5 k5Var = (k5) m5Var.f42550a.get(l5Var);
                if (k5Var == null) {
                    throw new IllegalArgumentException("No cached instance found for " + l5Var);
                }
                Preconditions.e("Releasing the wrong instance", obj == k5Var.f42516a);
                Preconditions.p("Refcount has already reached zero", k5Var.f42517b > 0);
                int i11 = k5Var.f42517b - 1;
                k5Var.f42517b = i11;
                if (i11 == 0) {
                    Preconditions.p("Destroy task already scheduled", k5Var.f42518c == null);
                    if (m5Var.f42552c == null) {
                        m5Var.f42551b.getClass();
                        m5Var.f42552c = Executors.newSingleThreadScheduledExecutor(k1.e("grpc-shared-destroyer-%d"));
                    }
                    k5Var.f42518c = m5Var.f42552c.schedule(new j2(new a(m5Var, k5Var, l5Var, obj, 3)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
