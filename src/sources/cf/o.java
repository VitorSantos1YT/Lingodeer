package cf;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements h {
    public static o I;
    public final Method A;
    public final Method B;
    public final Method C;
    public final Method D;
    public final Method E;
    public final Method F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f6949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f6950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f6951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f6952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f6953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f6954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f6955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f6956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Class f6957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class f6958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Class f6959l;
    public final Class m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Class f6960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Class f6961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Method f6962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Method f6963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Method f6964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Method f6965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Method f6966t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Method f6967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Method f6968v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Method f6969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Method f6970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Method f6971y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Method f6972z;
    public static final l G = new l(1);
    public static final AtomicBoolean H = new AtomicBoolean(false);
    public static final ConcurrentHashMap J = new ConcurrentHashMap();
    public static final ConcurrentHashMap K = new ConcurrentHashMap();
    public static final ConcurrentHashMap L = new ConcurrentHashMap();

    public o(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17) {
        this.f6948a = obj;
        this.f6949b = cls;
        this.f6950c = cls2;
        this.f6951d = cls3;
        this.f6952e = cls4;
        this.f6953f = cls5;
        this.f6954g = cls6;
        this.f6955h = cls7;
        this.f6956i = cls8;
        this.f6957j = cls9;
        this.f6958k = cls10;
        this.f6959l = cls11;
        this.m = cls12;
        this.f6960n = cls13;
        this.f6961o = cls14;
        this.f6962p = method;
        this.f6963q = method2;
        this.f6964r = method3;
        this.f6965s = method4;
        this.f6966t = method5;
        this.f6967u = method6;
        this.f6968v = method7;
        this.f6969w = method8;
        this.f6970x = method9;
        this.f6971y = method10;
        this.f6972z = method11;
        this.A = method12;
        this.B = method13;
        this.C = method14;
        this.D = method15;
        this.E = method16;
        this.F = method17;
    }

    @Override // cf.h
    public final void a(w productType, Runnable runnable) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(productType, "productType");
            c(new androidx.fragment.app.d(this, productType, runnable, 4));
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void c(Runnable runnable) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (H.get()) {
                runnable.run();
                return;
            }
            Class cls = this.m;
            if (qf.a.b(this)) {
                return;
            }
            try {
                Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new m(this, new Object[]{runnable}, 1));
                Class cls2 = this.f6949b;
                Method method = this.E;
                Object obj = null;
                if (!qf.a.b(this)) {
                    try {
                        obj = this.f6948a;
                    } catch (Throwable th2) {
                        qf.a.a(this, th2);
                    }
                }
                x.t(cls2, obj, method, objNewProxyInstance);
            } catch (Throwable th3) {
                qf.a.a(this, th3);
            }
        } catch (Throwable th4) {
            qf.a.a(this, th4);
        }
    }

    public final String d(String str) {
        if (!qf.a.b(this)) {
            try {
                Pattern patternCompile = Pattern.compile("jsonString='(.*?)'");
                kotlin.jvm.internal.m.e(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(str);
                kotlin.jvm.internal.m.e(matcher, "matcher(...)");
                oz.l lVarE = se.k.e(matcher, 0, str);
                if (lVarE != null) {
                    return (String) ry.m.t0(1, lVarE.a());
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final Object e(w wVar, ArrayList arrayList) {
        Class cls = this.f6957j;
        Class cls2 = this.f6959l;
        if (!qf.a.b(this)) {
            try {
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        Object objT = x.t(cls2, x.t(cls2, x.t(cls2, x.t(this.f6953f, null, this.f6972z, new Object[0]), this.B, (String) obj), this.C, wVar.a()), this.A, new Object[0]);
                        if (objT != null) {
                            arrayList2.add(objT);
                        }
                    }
                    return x.t(cls, x.t(cls, x.t(this.f6955h, null, this.f6969w, new Object[0]), this.f6971y, arrayList2), this.f6970x, new Object[0]);
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final void f(Object[] objArr, Object[] objArr2) {
        if (qf.a.b(this) || objArr2 == null) {
            return;
        }
        try {
            if (objArr2.length == 0) {
                return;
            }
            if (kotlin.jvm.internal.m.a(x.t(this.f6954g, objArr2[0], this.F, new Object[0]), 0)) {
                H.set(true);
                if (objArr.length == 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Runnable) {
                    ((Runnable) obj).run();
                }
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void g(Object[] objArr, Object[] objArr2) {
        String strD;
        if (qf.a.b(this)) {
            return;
        }
        try {
            Object objY = ry.l.Y(0, objArr);
            Object objY2 = objArr2 != null ? ry.l.Y(1, objArr2) : null;
            if (objY2 != null && (objY2 instanceof List)) {
                Iterator it = ((List) objY2).iterator();
                while (it.hasNext()) {
                    try {
                        Object objT = x.t(this.f6951d, it.next(), this.D, new Object[0]);
                        String str = objT instanceof String ? (String) objT : null;
                        if (str != null && (strD = d(str)) != null) {
                            JSONObject jSONObject = new JSONObject(strD);
                            if (jSONObject.has("productId")) {
                                String productId = jSONObject.getString("productId");
                                ConcurrentHashMap concurrentHashMap = L;
                                kotlin.jvm.internal.m.e(productId, "productId");
                                concurrentHashMap.put(productId, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (objY == null || !(objY instanceof Runnable)) {
                    return;
                }
                ((Runnable) objY).run();
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void h(Object[] objArr, Object[] objArr2) {
        Throwable th2;
        Object objY;
        if (!qf.a.b(this)) {
            try {
                Object objY2 = ry.l.Y(0, objArr);
                if (objY2 != null && (objY2 instanceof w)) {
                    Object objY3 = ry.l.Y(1, objArr);
                    if (objY3 instanceof Runnable) {
                        if (objArr2 != null) {
                            try {
                                objY = ry.l.Y(1, objArr2);
                            } catch (Throwable th3) {
                                th2 = th3;
                                qf.a.a(this, th2);
                            }
                        } else {
                            objY = null;
                        }
                        if (objY != null && (objY instanceof List)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((List) objY).iterator();
                            while (it.hasNext()) {
                                try {
                                    Object objT = x.t(this.f6952e, it.next(), this.f6967u, new Object[0]);
                                    String str = objT instanceof String ? (String) objT : null;
                                    if (str != null) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.has("productId")) {
                                            String productId = jSONObject.getString("productId");
                                            if (!L.containsKey(productId)) {
                                                kotlin.jvm.internal.m.e(productId, "productId");
                                                arrayList.add(productId);
                                            }
                                            if (objY2 == w.INAPP) {
                                                ConcurrentHashMap concurrentHashMap = J;
                                                kotlin.jvm.internal.m.e(productId, "productId");
                                                concurrentHashMap.put(productId, jSONObject);
                                            } else {
                                                ConcurrentHashMap concurrentHashMap2 = K;
                                                kotlin.jvm.internal.m.e(productId, "productId");
                                                concurrentHashMap2.put(productId, jSONObject);
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                if (arrayList.isEmpty()) {
                                    ((Runnable) objY3).run();
                                } else {
                                    w wVar = (w) objY2;
                                    Runnable runnable = (Runnable) objY3;
                                    if (!qf.a.b(this)) {
                                        try {
                                            try {
                                                c(new i(this, runnable, wVar, arrayList, 1));
                                            } catch (Throwable th4) {
                                                th = th4;
                                                qf.a.a(this, th);
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th2 = th;
                                qf.a.a(this, th2);
                            }
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final void i(Object[] objArr, Object[] objArr2) {
        Throwable th2;
        Object objY;
        if (!qf.a.b(this)) {
            try {
                Object objY2 = ry.l.Y(0, objArr);
                if (objY2 != null && (objY2 instanceof w)) {
                    Object objY3 = ry.l.Y(1, objArr);
                    if (objY3 instanceof Runnable) {
                        if (objArr2 != null) {
                            try {
                                objY = ry.l.Y(1, objArr2);
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } else {
                            objY = null;
                        }
                        if (objY != null && (objY instanceof List)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((List) objY).iterator();
                            while (it.hasNext()) {
                                Object objT = x.t(this.f6950c, it.next(), this.f6962p, new Object[0]);
                                String str = objT instanceof String ? (String) objT : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String productId = jSONObject.getString("productId");
                                        if (!L.containsKey(productId)) {
                                            kotlin.jvm.internal.m.e(productId, "productId");
                                            arrayList.add(productId);
                                        }
                                        if (objY2 == w.INAPP) {
                                            ConcurrentHashMap concurrentHashMap = J;
                                            kotlin.jvm.internal.m.e(productId, "productId");
                                            concurrentHashMap.put(productId, jSONObject);
                                        } else {
                                            ConcurrentHashMap concurrentHashMap2 = K;
                                            kotlin.jvm.internal.m.e(productId, "productId");
                                            concurrentHashMap2.put(productId, jSONObject);
                                        }
                                    }
                                }
                            }
                            try {
                                if (arrayList.isEmpty()) {
                                    ((Runnable) objY3).run();
                                    return;
                                }
                                w wVar = (w) objY2;
                                Runnable runnable = (Runnable) objY3;
                                if (!qf.a.b(this)) {
                                    try {
                                        try {
                                            c(new i(this, runnable, wVar, arrayList, 1));
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            qf.a.a(this, th);
                                            return;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            th2 = th;
                            qf.a.a(this, th2);
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }
}
