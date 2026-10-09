package uw;

import ex.u0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements ww.b {
    public abstract ww.b a(Runnable runnable, TimeUnit timeUnit);

    public void b(u0 u0Var) {
        a(u0Var, TimeUnit.NANOSECONDS);
    }
}
