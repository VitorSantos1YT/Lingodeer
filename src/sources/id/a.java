package id;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1.p f34327a = b1.p.E("k", "x", "y");

    public static ed.c a(jd.e eVar, wc.h hVar) {
        ArrayList arrayList = new ArrayList();
        if (eVar.v() == jd.c.BEGIN_ARRAY) {
            eVar.a();
            while (eVar.f()) {
                jd.e eVar2 = eVar;
                wc.h hVar2 = hVar;
                arrayList.add(new zc.j(hVar2, p.b(eVar2, hVar2, kd.k.c(), f.f34345e, eVar.v() == jd.c.BEGIN_OBJECT, false)));
                eVar = eVar2;
                hVar = hVar2;
            }
            eVar.c();
            q.b(arrayList);
        } else {
            arrayList.add(new ld.a(o.b(eVar, kd.k.c())));
        }
        return new ed.c(arrayList);
    }

    public static ed.f b(jd.e eVar, wc.h hVar) {
        eVar.b();
        ed.c cVarA = null;
        ed.b bVarW = null;
        boolean z11 = false;
        ed.b bVarW2 = null;
        while (eVar.v() != jd.c.END_OBJECT) {
            int iY = eVar.y(f34327a);
            if (iY == 0) {
                cVarA = a(eVar, hVar);
            } else if (iY != 1) {
                if (iY != 2) {
                    eVar.A();
                    eVar.B();
                } else if (eVar.v() == jd.c.STRING) {
                    eVar.B();
                    z11 = true;
                } else {
                    bVarW = qx.p.w(eVar, hVar, true);
                }
            } else if (eVar.v() == jd.c.STRING) {
                eVar.B();
                z11 = true;
            } else {
                bVarW2 = qx.p.w(eVar, hVar, true);
            }
        }
        eVar.d();
        if (z11) {
            hVar.a("Lottie doesn't support expressions.");
        }
        return cVarA != null ? cVarA : new ed.d(bVarW2, bVarW);
    }
}
