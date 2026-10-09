package okhttp3.internal.publicsuffix;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import m00.b;
import m00.d0;
import m00.i0;
import m00.l;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f45557b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f45558c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f45559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f45560e;

    public final l a() {
        l lVar = this.f45559d;
        if (lVar != null) {
            return lVar;
        }
        m.n("bytes");
        throw null;
    }

    public abstract i0 b();

    public final void c() {
        try {
            d0 d0VarC = b.c(b());
            try {
                l lVarZ = d0VarC.z(d0VarC.readInt());
                l lVarZ2 = d0VarC.z(d0VarC.readInt());
                d0VarC.close();
                synchronized (this) {
                    m.c(lVarZ);
                    this.f45559d = lVarZ;
                    m.c(lVarZ2);
                    this.f45560e = lVarZ2;
                }
                this.f45558c.countDown();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    o.m(d0VarC, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.f45558c.countDown();
            throw th4;
        }
    }
}
