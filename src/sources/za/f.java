package za;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.z;
import qy.q;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f f59067a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f59068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f59069c;

    static {
        z.a(g.class).g();
        f59068b = com.bumptech.glide.d.v(new ys.d(10));
        f59069c = a.f59050a;
    }

    public static b a(Context context) {
        ab.a aVar = (ab.a) f59068b.getValue();
        if (aVar == null) {
            cb.m mVar = cb.m.f6821c;
            if (cb.m.f6821c == null) {
                ReentrantLock reentrantLock = cb.m.f6822d;
                reentrantLock.lock();
                try {
                    if (cb.m.f6821c == null) {
                        cb.k kVar = null;
                        try {
                            ya.j jVarB = cb.i.b();
                            if (jVarB != null) {
                                ya.j other = ya.j.f57558f;
                                kotlin.jvm.internal.m.f(other, "other");
                                Object value = jVarB.f57563e.getValue();
                                kotlin.jvm.internal.m.e(value, "getValue(...)");
                                Object value2 = other.f57563e.getValue();
                                kotlin.jvm.internal.m.e(value2, "getValue(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    cb.k kVar2 = new cb.k(context);
                                    if (kVar2.e()) {
                                        kVar = kVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        cb.m.f6821c = new cb.m(kVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            aVar = cb.m.f6821c;
            kotlin.jvm.internal.m.c(aVar);
        }
        n nVar = new n();
        g0 g0Var = new g0(13);
        ya.e.a();
        b bVar = new b(nVar, aVar, g0Var);
        f59069c.getClass();
        return bVar;
    }
}
