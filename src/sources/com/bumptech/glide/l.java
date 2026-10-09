package com.bumptech.glide;

import ay.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import zd.r;
import zd.s;
import zd.t;
import zd.v;
import zd.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f7640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke.b f7641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.l f7642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ke.f f7643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.h f7644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ed.c f7645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.android.billingclient.api.m f7646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ob.e f7647h = new ob.e(16);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ke.c f7648i = new ke.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ob.m f7649j;

    public l() {
        ob.m mVar = new ob.m(new y4.d(20), new tw.c(26), new k0(27));
        this.f7649j = mVar;
        this.f7640a = new t(mVar);
        this.f7641b = new ke.b();
        this.f7642c = new ob.l(16);
        this.f7643d = new ke.f(0);
        this.f7644e = new com.bumptech.glide.load.data.h();
        this.f7645f = new ed.c(1);
        this.f7646g = new com.android.billingclient.api.m(1);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ob.l lVar = this.f7642c;
        synchronized (lVar) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) lVar.f44822b);
                ((ArrayList) lVar.f44822b).clear();
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    ((ArrayList) lVar.f44822b).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) lVar.f44822b).add(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Class cls, Class cls2, r rVar) {
        t tVar = this.f7640a;
        synchronized (tVar) {
            w wVar = tVar.f59184a;
            synchronized (wVar) {
                try {
                    v vVar = new v(cls, cls2, rVar);
                    ArrayList arrayList = wVar.f59198a;
                    arrayList.add(arrayList.size(), vVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            tVar.f59185b.f6510b.clear();
        }
    }

    public final void b(Class cls, td.d dVar) {
        ke.b bVar = this.f7641b;
        synchronized (bVar) {
            bVar.f38132a.add(new ke.a(cls, dVar));
        }
    }

    public final void c(Class cls, td.m mVar) {
        ke.f fVar = this.f7643d;
        synchronized (fVar) {
            fVar.f38141a.add(new ke.e(cls, mVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, td.l lVar) {
        ob.l lVar2 = this.f7642c;
        synchronized (lVar2) {
            lVar2.z(str).add(new ke.d(cls, cls2, lVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        com.android.billingclient.api.m mVar = this.f7646g;
        synchronized (mVar) {
            arrayList = mVar.f7554a;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List listUnmodifiableList;
        t tVar = this.f7640a;
        tVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (tVar) {
            s sVar = (s) tVar.f59185b.f6510b.get(cls);
            listUnmodifiableList = sVar == null ? null : sVar.f59183a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(tVar.f59184a.a(cls));
                if (((s) tVar.f59185b.f6510b.put(cls, new s(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z11 = true;
        for (int i11 = 0; i11 < size; i11++) {
            zd.q qVar = (zd.q) listUnmodifiableList.get(i11);
            if (qVar.a(obj)) {
                if (z11) {
                    arrayList = new ArrayList(size - i11);
                    z11 = false;
                }
                arrayList.add(qVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new Registry$NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.f g(Object obj) {
        com.bumptech.glide.load.data.f fVarB;
        com.bumptech.glide.load.data.h hVar = this.f7644e;
        synchronized (hVar) {
            try {
                pe.f.b(obj);
                com.bumptech.glide.load.data.e eVar = (com.bumptech.glide.load.data.e) ((HashMap) hVar.f7659b).get(obj.getClass());
                if (eVar == null) {
                    for (com.bumptech.glide.load.data.e eVar2 : ((HashMap) hVar.f7659b).values()) {
                        if (eVar2.a().isAssignableFrom(obj.getClass())) {
                            eVar = eVar2;
                            break;
                        }
                    }
                }
                if (eVar == null) {
                    eVar = com.bumptech.glide.load.data.h.f7657c;
                }
                fVarB = eVar.b(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVarB;
    }

    public final void h(com.bumptech.glide.load.data.e eVar) {
        com.bumptech.glide.load.data.h hVar = this.f7644e;
        synchronized (hVar) {
            ((HashMap) hVar.f7659b).put(eVar.a(), eVar);
        }
    }

    public final void i(Class cls, Class cls2, he.b bVar) {
        ed.c cVar = this.f7645f;
        synchronized (cVar) {
            cVar.f25470a.add(new he.c(cls, cls2, bVar));
        }
    }
}
