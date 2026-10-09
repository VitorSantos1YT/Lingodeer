package cf;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f6990g = new r();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static u f6991h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f6993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f6994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f6995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f6996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f6997f;

    public u(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        this.f6992a = cls;
        this.f6993b = cls2;
        this.f6994c = method;
        this.f6995d = method2;
        this.f6996e = method3;
        this.f6997f = method4;
    }

    public final Object a(w productType, ArrayList arrayList) {
        Object objT;
        Object objT2;
        Class cls = this.f6993b;
        if (!qf.a.b(this)) {
            try {
                kotlin.jvm.internal.m.f(productType, "productType");
                Object objT3 = x.t(this.f6992a, null, this.f6994c, new Object[0]);
                if (objT3 != null && (objT = x.t(cls, objT3, this.f6995d, productType.a())) != null && (objT2 = x.t(cls, objT, this.f6996e, arrayList)) != null) {
                    return x.t(cls, objT2, this.f6997f, new Object[0]);
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
