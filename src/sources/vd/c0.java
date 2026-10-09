package vd;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements g, com.bumptech.glide.load.data.c {
    public volatile zd.p H;
    public File K;
    public d0 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f53848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f53849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53851d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public td.g f53852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f53853f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f53854t;

    public c0(h hVar, l lVar) {
        this.f53849b = hVar;
        this.f53848a = lVar;
    }

    @Override // vd.g
    public final boolean a() {
        List list;
        boolean z11;
        List list2;
        boolean z12;
        ArrayList arrayListC;
        ArrayList arrayListA = this.f53849b.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        h hVar = this.f53849b;
        com.bumptech.glide.l lVarA = hVar.f53882c.a();
        Class<?> cls = hVar.f53883d.getClass();
        Class cls2 = hVar.f53886g;
        Class cls3 = hVar.f53890k;
        ob.e eVar = lVarA.f7647h;
        pe.k kVar = (pe.k) ((AtomicReference) eVar.f44804b).getAndSet(null);
        if (kVar == null) {
            kVar = new pe.k(cls, cls2, cls3);
        } else {
            kVar.f46826a = cls;
            kVar.f46827b = cls2;
            kVar.f46828c = cls3;
        }
        synchronized (((y.e) eVar.f44805c)) {
            list = (List) ((y.e) eVar.f44805c).get(kVar);
        }
        ((AtomicReference) eVar.f44804b).set(kVar);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            zd.t tVar = lVarA.f7640a;
            synchronized (tVar) {
                arrayListC = tVar.f59184a.c(cls);
            }
            int size = arrayListC.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListC.get(i11);
                i11++;
                ArrayList arrayListA2 = lVarA.f7642c.A((Class) obj, cls2);
                int size2 = arrayListA2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayListA2.get(i12);
                    i12++;
                    Class cls4 = (Class) obj2;
                    if (!lVarA.f7645f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z11 = false;
            ob.e eVar2 = lVarA.f7647h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((y.e) eVar2.f44805c)) {
                ((y.e) eVar2.f44805c).put(new pe.k(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z11 = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.f53849b.f53890k)) {
                return z11;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f53849b.f53883d.getClass() + " to " + this.f53849b.f53890k);
        }
        while (true) {
            List list3 = this.f53853f;
            if (list3 != null && this.f53854t < list3.size()) {
                this.H = null;
                boolean z13 = z11;
                while (!z13 && this.f53854t < this.f53853f.size()) {
                    List list4 = this.f53853f;
                    int i13 = this.f53854t;
                    this.f53854t = i13 + 1;
                    zd.q qVar = (zd.q) list4.get(i13);
                    File file = this.K;
                    h hVar2 = this.f53849b;
                    this.H = qVar.b(file, hVar2.f53884e, hVar2.f53885f, hVar2.f53888i);
                    if (this.H != null && this.f53849b.c(this.H.f59182c.a()) != null) {
                        this.H.f59182c.e(this.f53849b.f53893o, this);
                        z13 = true;
                    }
                }
                return z13;
            }
            int i14 = this.f53851d + 1;
            this.f53851d = i14;
            if (i14 >= list2.size()) {
                int i15 = this.f53850c + 1;
                this.f53850c = i15;
                if (i15 >= arrayListA.size()) {
                    return z11;
                }
                this.f53851d = z11 ? 1 : 0;
            }
            td.g gVar = (td.g) arrayListA.get(this.f53850c);
            Class cls5 = (Class) list2.get(this.f53851d);
            td.n nVarE = this.f53849b.e(cls5);
            h hVar3 = this.f53849b;
            this.L = new d0(hVar3.f53882c.f7629a, gVar, hVar3.f53892n, hVar3.f53884e, hVar3.f53885f, nVarE, cls5, hVar3.f53888i);
            File fileJ = hVar3.f53887h.a().j(this.L);
            this.K = fileJ;
            if (fileJ != null) {
                this.f53852e = gVar;
                this.f53853f = this.f53849b.f53882c.a().f(fileJ);
                z12 = false;
                this.f53854t = 0;
            } else {
                z12 = false;
            }
            z11 = z12;
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void c(Exception exc) {
        this.f53848a.c(this.L, exc, this.H.f59182c, td.a.RESOURCE_DISK_CACHE);
    }

    @Override // vd.g
    public final void cancel() {
        zd.p pVar = this.H;
        if (pVar != null) {
            pVar.f59182c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void f(Object obj) {
        this.f53848a.b(this.f53852e, obj, this.H.f59182c, td.a.RESOURCE_DISK_CACHE, this.L);
    }
}
