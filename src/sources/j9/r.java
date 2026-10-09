package j9;

import android.content.Context;
import hh.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f36246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f36247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f36248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f36249e;

    public r(Context context, qb.a aVar) {
        this.f36245a = aVar;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.m.e(applicationContext, "context.applicationContext");
        this.f36246b = applicationContext;
        this.f36247c = new Object();
        this.f36248d = new LinkedHashSet();
    }

    public q a() {
        q qVarB = b();
        qVarB.getClass();
        b7.c cVar = qVarB.f36242b;
        Iterator it = ((LinkedHashMap) this.f36247c).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String argumentName = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            kotlin.jvm.internal.m.f(argumentName, "argumentName");
            kotlin.jvm.internal.m.f(null, "argument");
            throw null;
        }
        ArrayList arrayList = (ArrayList) this.f36249e;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            final o navDeepLink = (o) obj;
            kotlin.jvm.internal.m.f(navDeepLink, "navDeepLink");
            cVar.getClass();
            final int i12 = 0;
            ArrayList arrayListC = c.a.C((LinkedHashMap) cVar.f3961d, new fz.c() { // from class: m9.h
                @Override // fz.c
                public final Object invoke(Object obj2) {
                    boolean zContains;
                    String key = (String) obj2;
                    switch (i12) {
                        case 0:
                            m.f(key, "key");
                            zContains = navDeepLink.c().contains(key);
                            break;
                        default:
                            m.f(key, "key");
                            zContains = navDeepLink.c().contains(key);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListC.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + navDeepLink.f36223a + " can't be used to open destination " + ((q) cVar.f3959b) + ".\nFollowing required arguments are missing: " + arrayListC).toString());
            }
            ((ArrayList) cVar.f3960c).add(navDeepLink);
        }
        Iterator it2 = ((LinkedHashMap) this.f36248d).entrySet().iterator();
        if (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            ((Number) entry2.getKey()).intValue();
            if (entry2.getValue() != null) {
                throw new ClassCastException();
            }
            kotlin.jvm.internal.m.f(null, "action");
            throw null;
        }
        String str = (String) this.f36246b;
        if (str != null) {
            cVar.getClass();
            if (oz.q.K0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String uriPattern = "android-app://androidx.navigation/".concat(str);
            kotlin.jvm.internal.m.f(uriPattern, "uriPattern");
            final o oVar = new o(uriPattern);
            final int i13 = 1;
            ArrayList arrayListC2 = c.a.C((LinkedHashMap) cVar.f3961d, new fz.c() { // from class: m9.h
                @Override // fz.c
                public final Object invoke(Object obj2) {
                    boolean zContains;
                    String key = (String) obj2;
                    switch (i13) {
                        case 0:
                            m.f(key, "key");
                            zContains = oVar.c().contains(key);
                            break;
                        default:
                            m.f(key, "key");
                            zContains = oVar.c().contains(key);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListC2.isEmpty()) {
                StringBuilder sbQ = p0.q("Cannot set route \"", str, "\" for destination ");
                sbQ.append((q) cVar.f3959b);
                sbQ.append(". Following required arguments are missing: ");
                sbQ.append(arrayListC2);
                throw new IllegalArgumentException(sbQ.toString().toString());
            }
            cVar.f3963f = com.bumptech.glide.d.v(new ar.a(uriPattern, 9));
            cVar.f3958a = uriPattern.hashCode();
            cVar.f3962e = str;
        }
        return qVarB;
    }

    public q b() {
        return ((c0) this.f36245a).a();
    }

    public abstract Object c();

    public void d(Object obj) {
        synchronized (this.f36247c) {
            Object obj2 = this.f36249e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f36249e = obj;
                ((qb.a) this.f36245a).f47697d.execute(new b2.c(27, ry.m.a1((LinkedHashSet) this.f36248d), this));
            }
        }
    }

    public abstract void e();

    public abstract void f();

    public r(c0 c0Var, String str) {
        this.f36245a = c0Var;
        this.f36246b = str;
        this.f36247c = new LinkedHashMap();
        this.f36249e = new ArrayList();
        this.f36248d = new LinkedHashMap();
    }
}
