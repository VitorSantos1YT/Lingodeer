package vd;

import com.bumptech.glide.Registry$NoSourceEncoderAvailableException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mw.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f53880a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53881b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.i f53882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f53883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f53884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class f53886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g0 f53887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public td.j f53888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f53889j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class f53890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f53891l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public td.g f53892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.k f53893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n f53894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f53895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f53896r;

    public final ArrayList a() {
        boolean z11 = this.m;
        ArrayList arrayList = this.f53881b;
        if (!z11) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i11 = 0; i11 < size; i11++) {
                zd.p pVar = (zd.p) arrayListB.get(i11);
                td.g gVar = pVar.f59180a;
                List list = pVar.f59181b;
                if (!arrayList.contains(gVar)) {
                    arrayList.add(pVar.f59180a);
                }
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (!arrayList.contains(list.get(i12))) {
                        arrayList.add((td.g) list.get(i12));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z11 = this.f53891l;
        ArrayList arrayList = this.f53880a;
        if (!z11) {
            this.f53891l = true;
            arrayList.clear();
            List listF = this.f53882c.a().f(this.f53883d);
            int size = listF.size();
            for (int i11 = 0; i11 < size; i11++) {
                zd.p pVarB = ((zd.q) listF.get(i11)).b(this.f53883d, this.f53884e, this.f53885f, this.f53888i);
                if (pVarB != null) {
                    arrayList.add(pVarB);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z c(Class cls) {
        z zVar;
        Class cls2;
        Class cls3;
        Class cls4;
        z zVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        he.b bVar;
        Class cls5 = cls;
        com.bumptech.glide.l lVarA = this.f53882c.a();
        Class cls6 = this.f53886g;
        Class cls7 = this.f53890k;
        ke.c cVar = lVarA.f7648i;
        pe.k kVar = (pe.k) cVar.f38135b.getAndSet(null);
        if (kVar == null) {
            kVar = new pe.k();
        }
        kVar.f46826a = cls5;
        kVar.f46827b = cls6;
        kVar.f46828c = cls7;
        synchronized (cVar.f38134a) {
            zVar = (z) cVar.f38134a.get(kVar);
        }
        cVar.f38135b.set(kVar);
        lVarA.f7648i.getClass();
        if (ke.c.f38133c.equals(zVar)) {
            return null;
        }
        if (zVar != null) {
            return zVar;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListA = lVarA.f7642c.A(cls5, cls6);
        int size = arrayListA.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            Class<?> cls8 = (Class) arrayListA.get(i11);
            ArrayList arrayListB = lVarA.f7645f.b(cls8, cls7);
            int size2 = arrayListB.size();
            int i13 = 0;
            while (i13 < size2) {
                int i14 = i13 + 1;
                Class cls9 = (Class) arrayListB.get(i13);
                ob.l lVar = lVarA.f7642c;
                synchronized (lVar) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) lVar.f44822b;
                    int size3 = arrayList4.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        Object obj = arrayList4.get(i15);
                        int i16 = i15 + 1;
                        String str = (String) obj;
                        ArrayList arrayList5 = arrayListB;
                        List list = (List) ((HashMap) lVar.f44823c).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ke.d dVar = (ke.d) it.next();
                                Iterator it2 = it;
                                if (dVar.f38136a.isAssignableFrom(cls5) && cls8.isAssignableFrom(dVar.f38137b)) {
                                    arrayList.add(dVar.f38138c);
                                }
                                it = it2;
                            }
                        }
                        arrayListB = arrayList5;
                        i15 = i16;
                    }
                    arrayList2 = arrayListB;
                }
                ed.c cVar2 = lVarA.f7645f;
                synchronized (cVar2) {
                    if (cls9.isAssignableFrom(cls8)) {
                        bVar = he.d.f32192b;
                    } else {
                        ArrayList arrayList6 = cVar2.f25470a;
                        int size4 = arrayList6.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size4) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            Object obj2 = arrayList6.get(i17);
                            i17++;
                            he.c cVar3 = (he.c) obj2;
                            ArrayList arrayList7 = arrayList6;
                            if (cVar3.f32189a.isAssignableFrom(cls8) && cls9.isAssignableFrom(cVar3.f32190b)) {
                                bVar = cVar3.f32191c;
                                break;
                            }
                            cls5 = cls;
                            arrayList6 = arrayList7;
                        }
                    }
                }
                arrayList3.add(new m(cls5, cls8, cls9, arrayList, bVar, lVarA.f7649j));
                cls5 = cls;
                size2 = size2;
                i13 = i14;
                arrayListB = arrayList2;
            }
            cls5 = cls;
            i11 = i12;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            zVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            zVar2 = new z(cls2, cls3, cls4, arrayList3, lVarA.f7649j);
        }
        ke.c cVar4 = lVarA.f7648i;
        synchronized (cVar4.f38134a) {
            cVar4.f38134a.put(new pe.k(cls2, cls3, cls4), zVar2 != null ? zVar2 : ke.c.f38133c);
        }
        return zVar2;
    }

    public final td.d d(Object obj) {
        td.d dVar;
        ke.b bVar = this.f53882c.a().f7641b;
        Class<?> cls = obj.getClass();
        synchronized (bVar) {
            ArrayList arrayList = bVar.f38132a;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    dVar = null;
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                ke.a aVar = (ke.a) obj2;
                if (aVar.f38130a.isAssignableFrom(cls)) {
                    dVar = aVar.f38131b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new Registry$NoSourceEncoderAvailableException("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final td.n e(Class cls) {
        td.n nVar = (td.n) this.f53889j.get(cls);
        if (nVar == null) {
            for (Map.Entry entry : this.f53889j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    nVar = (td.n) entry.getValue();
                    break;
                }
            }
        }
        if (nVar != null) {
            return nVar;
        }
        if (!this.f53889j.isEmpty() || !this.f53895q) {
            return be.c.f4135b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
