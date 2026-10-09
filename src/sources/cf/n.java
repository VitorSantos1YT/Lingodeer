package cf;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements h {
    public static n m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f6938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f6939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f6940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f6941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f6942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f6943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Method f6944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f6945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f6946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f6947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final r f6932l = new r();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicBoolean f6933n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ConcurrentHashMap f6934o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ConcurrentHashMap f6935p = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ConcurrentHashMap f6936q = new ConcurrentHashMap();

    public n(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Method method, Method method2, Method method3, Method method4, u uVar) {
        this.f6937a = obj;
        this.f6938b = cls;
        this.f6939c = cls2;
        this.f6940d = cls3;
        this.f6941e = cls4;
        this.f6942f = cls5;
        this.f6943g = method;
        this.f6944h = method2;
        this.f6945i = method3;
        this.f6946j = method4;
        this.f6947k = uVar;
    }

    @Override // cf.h
    public final void a(w productType, Runnable runnable) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(productType, "productType");
            c(new androidx.fragment.app.d(this, productType, runnable, 3));
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void c(Runnable runnable) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (f6933n.get()) {
                runnable.run();
            } else {
                d(runnable);
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void d(Runnable runnable) {
        Method methodP;
        Class cls = this.f6938b;
        if (qf.a.b(this)) {
            return;
        }
        try {
            Class clsI = x.i("com.android.billingclient.api.BillingClientStateListener");
            if (clsI == null || (methodP = x.p(cls, "startConnection", clsI)) == null) {
                return;
            }
            Object objNewProxyInstance = Proxy.newProxyInstance(clsI.getClassLoader(), new Class[]{clsI}, new j(runnable));
            Object obj = null;
            if (!qf.a.b(this)) {
                try {
                    obj = this.f6937a;
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
            }
            x.t(cls, obj, methodP, objNewProxyInstance);
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }
}
