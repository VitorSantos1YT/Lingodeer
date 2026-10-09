package f10;

import android.os.Looper;
import aw.t;
import ay.k0;
import b1.p;
import hh.p0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.android.AndroidComponentsImpl;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile e f26523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f26524r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final HashMap f26525s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f26526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f26527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f26528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f26529d = new b(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f26530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f26531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f26532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f26533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f26534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorService f26535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f26536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f26537l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f26538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f26539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f26540p;

    static {
        f fVar = new f();
        fVar.f26542a = f.f26541b;
        f26524r = fVar;
        f26525s = new HashMap();
    }

    public e() {
        f fVar = f26524r;
        fVar.getClass();
        AndroidComponentsImpl androidComponentsImpl = AndroidComponentsImpl.f45717c;
        this.f26540p = androidComponentsImpl != null ? androidComponentsImpl.f45718a : new k0(9);
        this.f26526a = new HashMap();
        this.f26527b = new HashMap();
        this.f26528c = new ConcurrentHashMap();
        k0 k0Var = androidComponentsImpl != null ? androidComponentsImpl.f45719b : null;
        this.f26530e = k0Var;
        this.f26531f = k0Var != null ? new g(this, Looper.getMainLooper()) : null;
        this.f26532g = new a(this);
        this.f26533h = new t(this);
        this.f26534i = new n();
        this.f26536k = true;
        this.f26537l = true;
        this.m = true;
        this.f26538n = true;
        this.f26539o = true;
        this.f26535j = fVar.f26542a;
    }

    public static void a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                a(arrayList, cls.getInterfaces());
            }
        }
    }

    public static e b() {
        e eVar;
        e eVar2 = f26523q;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (e.class) {
            try {
                eVar = f26523q;
                if (eVar == null) {
                    eVar = new e();
                    f26523q = eVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final void c(j jVar) {
        Object obj = jVar.f26549a;
        o oVar = jVar.f26550b;
        jVar.f26549a = null;
        jVar.f26550b = null;
        jVar.f26551c = null;
        ArrayList arrayList = j.f26548d;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 10000) {
                    arrayList.add(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oVar.f26565c) {
            d(oVar, obj);
        }
    }

    public final void d(o oVar, Object obj) {
        try {
            oVar.f26564b.f26555a.invoke(oVar.f26563a, obj);
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException("Unexpected exception", e8);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            boolean z11 = obj instanceof l;
            boolean z12 = this.f26536k;
            h hVar = this.f26540p;
            if (!z11) {
                if (z12) {
                    hVar.l(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + oVar.f26563a.getClass(), cause);
                }
                if (this.m) {
                    f(new l(cause, obj, oVar.f26563a));
                    return;
                }
                return;
            }
            if (z12) {
                Level level = Level.SEVERE;
                hVar.l(level, "SubscriberExceptionEvent subscriber " + oVar.f26563a.getClass() + " threw an exception", cause);
                l lVar = (l) obj;
                hVar.l(level, "Initial event " + lVar.f26553b + " caused exception in " + lVar.f26554c, lVar.f26552a);
            }
        }
    }

    public final synchronized boolean e(Object obj) {
        return this.f26527b.containsKey(obj);
    }

    public final void f(Object obj) {
        d dVar = (d) this.f26529d.get();
        ArrayList arrayList = dVar.f26519a;
        arrayList.add(obj);
        if (dVar.f26520b) {
            return;
        }
        dVar.f26521c = this.f26530e == null || Looper.getMainLooper() == Looper.myLooper();
        dVar.f26520b = true;
        while (!arrayList.isEmpty()) {
            try {
                g(arrayList.remove(0), dVar);
            } catch (Throwable th2) {
                dVar.f26520b = false;
                dVar.f26521c = false;
                throw th2;
            }
        }
        dVar.f26520b = false;
        dVar.f26521c = false;
    }

    public final void g(Object obj, d dVar) {
        boolean zH;
        List list;
        Class<?> cls = obj.getClass();
        if (this.f26539o) {
            HashMap map = f26525s;
            synchronized (map) {
                try {
                    List list2 = (List) map.get(cls);
                    list = list2;
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                            arrayList.add(superclass);
                            a(arrayList, superclass.getInterfaces());
                        }
                        f26525s.put(cls, arrayList);
                        list = arrayList;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int size = list.size();
            zH = false;
            for (int i11 = 0; i11 < size; i11++) {
                zH |= h(obj, dVar, (Class) list.get(i11));
            }
        } else {
            zH = h(obj, dVar, cls);
        }
        if (zH) {
            return;
        }
        if (this.f26537l) {
            this.f26540p.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f26538n || cls == i.class || cls == l.class) {
            return;
        }
        f(new i(obj));
    }

    public final boolean h(Object obj, d dVar, Class cls) {
        CopyOnWriteArrayList<o> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f26526a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (o oVar : copyOnWriteArrayList) {
            dVar.f26522d = obj;
            i(oVar, obj, dVar.f26521c);
        }
        return true;
    }

    public final void i(o oVar, Object obj, boolean z11) {
        g gVar = this.f26531f;
        int i11 = c.f26518a[oVar.f26564b.f26556b.ordinal()];
        if (i11 == 1) {
            d(oVar, obj);
            return;
        }
        if (i11 == 2) {
            if (z11) {
                d(oVar, obj);
                return;
            } else {
                gVar.a(oVar, obj);
                return;
            }
        }
        if (i11 == 3) {
            if (gVar != null) {
                gVar.a(oVar, obj);
                return;
            } else {
                d(oVar, obj);
                return;
            }
        }
        if (i11 != 4) {
            if (i11 != 5) {
                throw new IllegalStateException("Unknown thread mode: " + oVar.f26564b.f26556b);
            }
            t tVar = this.f26533h;
            tVar.getClass();
            ((p) tVar.f3243b).t(j.a(oVar, obj));
            ((e) tVar.f3244c).f26535j.execute(tVar);
            return;
        }
        if (!z11) {
            d(oVar, obj);
            return;
        }
        a aVar = this.f26532g;
        aVar.getClass();
        j jVarA = j.a(oVar, obj);
        synchronized (aVar) {
            try {
                aVar.f26514a.t(jVarA);
                if (!aVar.f26516c) {
                    aVar.f26516c = true;
                    aVar.f26515b.f26535j.execute(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(Object obj) {
        int i11;
        com.android.billingclient.api.h hVar;
        Method[] methods;
        k kVar;
        boolean zG;
        if (v10.c.z()) {
            try {
                AndroidComponentsImpl androidComponentsImpl = AndroidComponentsImpl.f45717c;
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
            }
        }
        Class<?> cls = obj.getClass();
        this.f26534i.getClass();
        ConcurrentHashMap concurrentHashMap = n.f26561a;
        List list = (List) concurrentHashMap.get(cls);
        List list2 = list;
        if (list == null) {
            synchronized (n.f26562b) {
                int i12 = 0;
                while (true) {
                    if (i12 >= 4) {
                        hVar = new com.android.billingclient.api.h(2);
                        break;
                    }
                    try {
                        com.android.billingclient.api.h[] hVarArr = n.f26562b;
                        hVar = hVarArr[i12];
                        if (hVar != null) {
                            hVarArr[i12] = null;
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            hVar.f7512e = cls;
            hVar.f7508a = false;
            while (true) {
                Class cls2 = (Class) hVar.f7512e;
                if (cls2 == null) {
                    ArrayList arrayList = new ArrayList((ArrayList) hVar.f7513f);
                    ((ArrayList) hVar.f7513f).clear();
                    ((HashMap) hVar.f7509b).clear();
                    ((HashMap) hVar.f7510c).clear();
                    ((StringBuilder) hVar.f7511d).setLength(0);
                    hVar.f7512e = null;
                    hVar.f7508a = false;
                    synchronized (n.f26562b) {
                        for (i11 = 0; i11 < 4; i11++) {
                            try {
                                com.android.billingclient.api.h[] hVarArr2 = n.f26562b;
                                if (hVarArr2[i11] == null) {
                                    hVarArr2[i11] = hVar;
                                    break;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
                    }
                    concurrentHashMap.put(cls, arrayList);
                    list2 = arrayList;
                    break;
                }
                int i13 = 1;
                try {
                    try {
                        methods = cls2.getDeclaredMethods();
                    } catch (Throwable unused2) {
                        methods = ((Class) hVar.f7512e).getMethods();
                        hVar.f7508a = true;
                    }
                    int length = methods.length;
                    int i14 = 0;
                    while (i14 < length) {
                        Method method = methods[i14];
                        int modifiers = method.getModifiers();
                        if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == i13 && (kVar = (k) method.getAnnotation(k.class)) != null) {
                                Class<?> cls3 = parameterTypes[0];
                                HashMap map = (HashMap) hVar.f7509b;
                                Object objPut = map.put(cls3, method);
                                if (objPut == null) {
                                    zG = true;
                                } else {
                                    if (objPut instanceof Method) {
                                        if (!hVar.g((Method) objPut, cls3)) {
                                            throw new IllegalStateException();
                                        }
                                        map.put(cls3, hVar);
                                    }
                                    zG = hVar.g(method, cls3);
                                }
                                if (zG) {
                                    ((ArrayList) hVar.f7513f).add(new m(method, cls3, kVar.threadMode(), kVar.priority(), kVar.sticky()));
                                }
                            }
                        }
                        i14++;
                        i13 = 1;
                    }
                    if (hVar.f7508a) {
                        hVar.f7512e = null;
                    } else {
                        Class superclass = ((Class) hVar.f7512e).getSuperclass();
                        hVar.f7512e = superclass;
                        String name = superclass.getName();
                        if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                            hVar.f7512e = null;
                        }
                    }
                } catch (LinkageError e8) {
                    throw new EventBusException(defpackage.e.m("Could not inspect methods of ".concat(((Class) hVar.f7512e).getName()), ". Please make this class visible to EventBus annotation processor to avoid reflection."), e8);
                }
            }
        }
        synchronized (this) {
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    k(obj, (m) it.next());
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void k(Object obj, m mVar) {
        Object value;
        Class cls = mVar.f26557c;
        o oVar = new o(obj, mVar);
        HashMap map = this.f26526a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            map.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(oVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i11 = 0; i11 <= size; i11++) {
            if (i11 == size || mVar.f26558d > ((o) copyOnWriteArrayList.get(i11)).f26564b.f26558d) {
                copyOnWriteArrayList.add(i11, oVar);
                break;
            }
        }
        HashMap map2 = this.f26527b;
        List arrayList = (List) map2.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (mVar.f26559e) {
            boolean z11 = this.f26539o;
            k0 k0Var = this.f26530e;
            ConcurrentHashMap concurrentHashMap = this.f26528c;
            if (!z11) {
                Object obj2 = concurrentHashMap.get(cls);
                if (obj2 != null) {
                    i(oVar, obj2, k0Var == null || Looper.getMainLooper() == Looper.myLooper());
                    return;
                }
                return;
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                    i(oVar, value, k0Var == null || Looper.getMainLooper() == Looper.myLooper());
                }
            }
        }
    }

    public final synchronized void l(Object obj) {
        try {
            List list = (List) this.f26527b.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) this.f26526a.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            o oVar = (o) list2.get(i11);
                            if (oVar.f26563a == obj) {
                                oVar.f26565c = false;
                                list2.remove(i11);
                                i11--;
                                size--;
                            }
                            i11++;
                        }
                    }
                }
                this.f26527b.remove(obj);
            } else {
                this.f26540p.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String toString() {
        return p0.p(new StringBuilder("EventBus[indexCount=0, eventInheritance="), this.f26539o, "]");
    }
}
