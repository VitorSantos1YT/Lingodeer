package androidx.work.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.d;
import ob.c;
import ob.e;
import ob.f;
import ob.i;
import ob.l;
import ob.m;
import ob.s;
import ob.u;
import w9.b;
import w9.g;
import w9.t;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile s f2794l;
    public volatile c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile u f2795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile i f2796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile l f2797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile m f2798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile e f2799r;

    @Override // androidx.work.impl.WorkDatabase
    public final e A() {
        e eVar;
        if (this.f2799r != null) {
            return this.f2799r;
        }
        synchronized (this) {
            try {
                if (this.f2799r == null) {
                    this.f2799r = new e(this);
                }
                eVar = this.f2799r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i B() {
        i iVar;
        if (this.f2796o != null) {
            return this.f2796o;
        }
        synchronized (this) {
            try {
                if (this.f2796o == null) {
                    this.f2796o = new i(this);
                }
                iVar = this.f2796o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final l C() {
        l lVar;
        if (this.f2797p != null) {
            return this.f2797p;
        }
        synchronized (this) {
            try {
                if (this.f2797p == null) {
                    this.f2797p = new l(this);
                }
                lVar = this.f2797p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m D() {
        m mVar;
        if (this.f2798q != null) {
            return this.f2798q;
        }
        synchronized (this) {
            try {
                if (this.f2798q == null) {
                    this.f2798q = new m(this);
                }
                mVar = this.f2798q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s E() {
        s sVar;
        if (this.f2794l != null) {
            return this.f2794l;
        }
        synchronized (this) {
            try {
                if (this.f2794l == null) {
                    this.f2794l = new s(this);
                }
                sVar = this.f2794l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final u F() {
        u uVar;
        if (this.f2795n != null) {
            return this.f2795n;
        }
        synchronized (this) {
            try {
                if (this.f2795n == null) {
                    this.f2795n = new u(this);
                }
                uVar = this.f2795n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    @Override // w9.s
    public final g g() {
        return new g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // w9.s
    public final d i(b bVar) {
        t tVar = new t(bVar, new hd.b(this, 14));
        Context context = bVar.f54754a;
        kotlin.jvm.internal.m.f(context, "context");
        return bVar.f54756c.g(new ka.b(context, bVar.f54755b, tVar, false, false));
    }

    @Override // w9.s
    public final List j(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gb.c(13, 14, 10));
        arrayList.add(new gb.c(11));
        arrayList.add(new gb.c(16, 17, 12));
        arrayList.add(new gb.c(17, 18, 13));
        arrayList.add(new gb.c(18, 19, 14));
        arrayList.add(new gb.c(15));
        arrayList.add(new gb.c(20, 21, 16));
        arrayList.add(new gb.c(22, 23, 17));
        return arrayList;
    }

    @Override // w9.s
    public final Set n() {
        return new HashSet();
    }

    @Override // w9.s
    public final Map p() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(s.class, list);
        map.put(c.class, list);
        map.put(u.class, list);
        map.put(i.class, list);
        map.put(l.class, list);
        map.put(m.class, list);
        map.put(e.class, list);
        map.put(f.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c z() {
        c cVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new c(this);
                }
                cVar = this.m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
