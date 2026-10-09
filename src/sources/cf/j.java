package cf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f6923a;

    public j(Runnable runnable) {
        this.f6923a = runnable;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method m, Object[] objArr) {
        AtomicBoolean atomicBoolean;
        Method methodP;
        AtomicBoolean atomicBoolean2;
        if (!qf.a.b(this)) {
            try {
                kotlin.jvm.internal.m.f(proxy, "proxy");
                kotlin.jvm.internal.m.f(m, "m");
                if (kotlin.jvm.internal.m.a(m.getName(), "onBillingSetupFinished")) {
                    Object objY = objArr != null ? ry.l.Y(0, objArr) : null;
                    Class clsI = x.i("com.android.billingclient.api.BillingResult");
                    if (clsI != null && (methodP = x.p(clsI, "getResponseCode", new Class[0])) != null && kotlin.jvm.internal.m.a(x.t(clsI, objY, methodP, new Object[0]), 0)) {
                        r rVar = n.f6932l;
                        if (qf.a.b(n.class)) {
                            atomicBoolean2 = null;
                        } else {
                            try {
                                atomicBoolean2 = n.f6933n;
                            } catch (Throwable th2) {
                                qf.a.a(n.class, th2);
                                atomicBoolean2 = null;
                            }
                        }
                        atomicBoolean2.set(true);
                        this.f6923a.run();
                    }
                } else {
                    String name = m.getName();
                    kotlin.jvm.internal.m.e(name, "m.name");
                    if (oz.x.k0(name, "onBillingServiceDisconnected", false)) {
                        r rVar2 = n.f6932l;
                        if (qf.a.b(n.class)) {
                            atomicBoolean = null;
                        } else {
                            try {
                                atomicBoolean = n.f6933n;
                            } catch (Throwable th3) {
                                qf.a.a(n.class, th3);
                                atomicBoolean = null;
                            }
                        }
                        atomicBoolean.set(false);
                    }
                }
            } catch (Throwable th4) {
                qf.a.a(this, th4);
                return null;
            }
        }
        return null;
    }
}
