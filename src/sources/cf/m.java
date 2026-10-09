package cf;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6931c;

    public /* synthetic */ m(h hVar, Object obj, int i11) {
        this.f6929a = i11;
        this.f6931c = hVar;
        this.f6930b = obj;
    }

    public void a(Object proxy, Method m, Object[] objArr) {
        Class cls;
        Method method;
        n nVar = (n) this.f6931c;
        if (qf.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(proxy, "proxy");
            kotlin.jvm.internal.m.f(m, "m");
            if (kotlin.jvm.internal.m.a(m.getName(), "onSkuDetailsResponse")) {
                Object objY = objArr != null ? ry.l.Y(1, objArr) : null;
                if (objY != null && (objY instanceof List)) {
                    for (Object obj : (List) objY) {
                        try {
                            if (qf.a.b(n.class)) {
                                cls = null;
                            } else {
                                try {
                                    cls = nVar.f6939c;
                                } catch (Throwable th2) {
                                    qf.a.a(n.class, th2);
                                    cls = null;
                                }
                            }
                            if (qf.a.b(n.class)) {
                                method = null;
                            } else {
                                try {
                                    method = nVar.f6943g;
                                } catch (Throwable th3) {
                                    qf.a.a(n.class, th3);
                                    method = null;
                                }
                            }
                            Object objT = x.t(cls, obj, method, new Object[0]);
                            String str = objT instanceof String ? (String) objT : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String skuID = jSONObject.getString("productId");
                                    r rVar = n.f6932l;
                                    ConcurrentHashMap concurrentHashMapH = r.h();
                                    kotlin.jvm.internal.m.e(skuID, "skuID");
                                    concurrentHashMapH.put(skuID, jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    ((Runnable) this.f6930b).run();
                }
            }
        } catch (Throwable th4) {
            qf.a.a(this, th4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method m, Object[] objArr) {
        switch (this.f6929a) {
            case 0:
                if (qf.a.b(this)) {
                    return null;
                }
                try {
                    a(proxy, m, objArr);
                    return b0.f48488a;
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                    return null;
                }
            case 1:
                Object[] objArr2 = (Object[]) this.f6930b;
                o oVar = (o) this.f6931c;
                kotlin.jvm.internal.m.f(proxy, "proxy");
                kotlin.jvm.internal.m.f(m, "m");
                String name = m.getName();
                if (name == null) {
                    return null;
                }
                switch (name.hashCode()) {
                    case -1642587947:
                        if (!name.equals("onPurchaseHistoryResponse") || qf.a.b(o.class)) {
                            return null;
                        }
                        try {
                            oVar.h(objArr2, objArr);
                            return null;
                        } catch (Throwable th3) {
                            qf.a.a(o.class, th3);
                            return null;
                        }
                    case -1599362358:
                        if (!name.equals("onQueryPurchasesResponse") || qf.a.b(o.class)) {
                            return null;
                        }
                        try {
                            oVar.i(objArr2, objArr);
                            return null;
                        } catch (Throwable th4) {
                            qf.a.a(o.class, th4);
                            return null;
                        }
                    case -79406125:
                        if (!name.equals("onBillingSetupFinished") || qf.a.b(o.class)) {
                            return null;
                        }
                        try {
                            oVar.f(objArr2, objArr);
                            return null;
                        } catch (Throwable th5) {
                            qf.a.a(o.class, th5);
                            return null;
                        }
                    case 1227540564:
                        if (!name.equals("onBillingServiceDisconnected") || qf.a.b(o.class)) {
                            return null;
                        }
                        try {
                            if (qf.a.b(oVar)) {
                                return null;
                            }
                            try {
                                o.H.set(false);
                                return null;
                            } catch (Throwable th6) {
                                qf.a.a(oVar, th6);
                                return null;
                            }
                        } catch (Throwable th7) {
                            qf.a.a(o.class, th7);
                            return null;
                        }
                    case 1940131955:
                        if (!name.equals("onProductDetailsResponse") || qf.a.b(o.class)) {
                            return null;
                        }
                        try {
                            oVar.g(objArr2, objArr);
                            return null;
                        } catch (Throwable th8) {
                            qf.a.a(o.class, th8);
                            return null;
                        }
                    default:
                        return null;
                }
            default:
                bb.b bVar = (bb.b) this.f6931c;
                kotlin.jvm.internal.m.f(proxy, "obj");
                kotlin.jvm.internal.m.f(m, "method");
                if (kotlin.jvm.internal.m.a(m.getName(), "accept") && objArr != null && objArr.length == 1) {
                    kotlin.jvm.internal.e eVar = (kotlin.jvm.internal.e) this.f6930b;
                    Object obj = objArr[0];
                    com.bumptech.glide.f.l(eVar, obj);
                    bVar.invoke(obj);
                    return b0.f48488a;
                }
                if (kotlin.jvm.internal.m.a(m.getName(), "equals") && m.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    return Boolean.valueOf(proxy == objArr[0]);
                }
                if (kotlin.jvm.internal.m.a(m.getName(), "hashCode") && m.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(bVar.hashCode());
                }
                if (kotlin.jvm.internal.m.a(m.getName(), "toString") && m.getReturnType().equals(String.class) && objArr == null) {
                    return bVar.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + proxy + ", method: " + m + ", args: " + objArr);
        }
    }

    public m(kotlin.jvm.internal.e eVar, bb.b bVar) {
        this.f6929a = 2;
        this.f6930b = eVar;
        this.f6931c = bVar;
    }
}
