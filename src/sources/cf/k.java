package cf;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o20.m0;
import o20.v0;
import o20.w0;
import org.json.JSONObject;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f6925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6927d;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Object[]] */
    public k(v0 v0Var, Class cls) {
        this.f6924a = 1;
        this.f6927d = v0Var;
        this.f6926c = cls;
        this.f6925b = new Object[0];
    }

    public void a(Object proxy, Method method, Object[] objArr) {
        Class cls;
        Method method2;
        Runnable runnable = (Runnable) this.f6926c;
        w wVar = (w) this.f6925b;
        n nVar = (n) this.f6927d;
        if (qf.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(proxy, "proxy");
            kotlin.jvm.internal.m.f(method, "method");
            if (kotlin.jvm.internal.m.a(method.getName(), "onPurchaseHistoryResponse")) {
                Object objY = objArr != null ? ry.l.Y(1, objArr) : null;
                if (objY != null && (objY instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (List) objY) {
                        try {
                            if (qf.a.b(n.class)) {
                                cls = null;
                            } else {
                                try {
                                    cls = nVar.f6940d;
                                } catch (Throwable th2) {
                                    qf.a.a(n.class, th2);
                                    cls = null;
                                }
                            }
                            if (qf.a.b(n.class)) {
                                method2 = null;
                            } else {
                                try {
                                    method2 = nVar.f6944h;
                                } catch (Throwable th3) {
                                    qf.a.a(n.class, th3);
                                    method2 = null;
                                }
                            }
                            Object objT = x.t(cls, obj, method2, new Object[0]);
                            String str = objT instanceof String ? (String) objT : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String skuID = jSONObject.getString("productId");
                                    kotlin.jvm.internal.m.e(skuID, "skuID");
                                    arrayList.add(skuID);
                                    if (wVar == w.INAPP) {
                                        r rVar = n.f6932l;
                                        r.g().put(skuID, jSONObject);
                                    } else {
                                        r rVar2 = n.f6932l;
                                        r.i().put(skuID, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        runnable.run();
                        return;
                    }
                    if (qf.a.b(n.class)) {
                        return;
                    }
                    try {
                        if (!qf.a.b(nVar)) {
                            try {
                                nVar.c(new i(nVar, runnable, wVar, arrayList, 0));
                            } catch (Throwable th4) {
                                qf.a.a(nVar, th4);
                            }
                        }
                    } catch (Throwable th5) {
                        qf.a.a(n.class, th5);
                    }
                }
            }
        } catch (Throwable th6) {
            qf.a.a(this, th6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0076 A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        w0 w0VarA;
        Object obj2;
        switch (this.f6924a) {
            case 0:
                if (qf.a.b(this)) {
                    return null;
                }
                try {
                    a(obj, method, objArr);
                    return b0.f48488a;
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                    return null;
                }
            default:
                Class cls = (Class) this.f6926c;
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = (Object[]) this.f6925b;
                }
                Object[] objArr2 = objArr;
                o20.b bVar = m0.f44534b;
                if (bVar.e(method)) {
                    return bVar.d(cls, obj, method, objArr2);
                }
                v0 v0Var = (v0) this.f6927d;
                while (true) {
                    Object objPutIfAbsent = v0Var.f44610a.get(method);
                    if (objPutIfAbsent instanceof w0) {
                        w0VarA = (w0) objPutIfAbsent;
                    } else if (objPutIfAbsent == null) {
                        Object obj3 = new Object();
                        synchronized (obj3) {
                            try {
                                objPutIfAbsent = v0Var.f44610a.putIfAbsent(method, obj3);
                                if (objPutIfAbsent == null) {
                                    try {
                                        w0VarA = w0.a(v0Var, cls, method);
                                        v0Var.f44610a.put(method, w0VarA);
                                    } catch (Throwable th3) {
                                        v0Var.f44610a.remove(method);
                                        throw th3;
                                    }
                                } else {
                                    synchronized (objPutIfAbsent) {
                                        try {
                                            obj2 = v0Var.f44610a.get(method);
                                            if (obj2 == null) {
                                                w0 w0Var = (w0) obj2;
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                    w0VarA = w0Var;
                                }
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                    } else {
                        synchronized (objPutIfAbsent) {
                            obj2 = v0Var.f44610a.get(method);
                            if (obj2 == null) {
                                w0 w0Var2 = (w0) obj2;
                                w0VarA = w0Var2;
                            }
                        }
                    }
                }
                o20.t tVar = (o20.t) w0VarA;
                return tVar.b(new o20.b0(tVar.f44595a, obj, objArr2, tVar.f44596b, tVar.f44597c), objArr2);
        }
    }

    public k(n nVar, w skuType, Runnable runnable) {
        this.f6924a = 0;
        kotlin.jvm.internal.m.f(skuType, "skuType");
        this.f6927d = nVar;
        this.f6925b = skuType;
        this.f6926c = runnable;
    }
}
