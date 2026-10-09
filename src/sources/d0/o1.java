package d0;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f22768a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a00.e f22769b = new a00.e();

    public static final void a(o1 o1Var, m1 m1Var) {
        AtomicReference atomicReference = o1Var.f22768a;
        while (true) {
            m1 m1Var2 = (m1) atomicReference.get();
            if (m1Var2 != null && m1Var.f22759a.compareTo(m1Var2.f22759a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(m1Var2, m1Var)) {
                    if (m1Var2 != null) {
                        m1Var2.f22760b.cancel(new MutationInterruptedException());
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == m1Var2);
        }
    }

    public static Object b(o1 o1Var, fz.c cVar, xy.i iVar) {
        l1 l1Var = l1.Default;
        o1Var.getClass();
        return rz.e0.l(new av.e(l1Var, o1Var, cVar, (vy.d) null), iVar);
    }
}
