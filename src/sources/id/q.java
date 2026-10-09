package id;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1.p f34372a = b1.p.E("k");

    public static ArrayList a(jd.d dVar, wc.h hVar, float f5, f0 f0Var, boolean z11) {
        jd.d dVar2;
        wc.h hVar2;
        float f11;
        f0 f0Var2;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        if (dVar.v() == jd.c.STRING) {
            hVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        dVar.b();
        while (dVar.f()) {
            if (dVar.y(f34372a) != 0) {
                dVar.B();
            } else if (dVar.v() == jd.c.BEGIN_ARRAY) {
                dVar.a();
                if (dVar.v() == jd.c.NUMBER) {
                    jd.d dVar3 = dVar;
                    wc.h hVar3 = hVar;
                    float f12 = f5;
                    f0 f0Var3 = f0Var;
                    boolean z13 = z11;
                    ld.a aVarB = p.b(dVar3, hVar3, f12, f0Var3, false, z13);
                    dVar2 = dVar3;
                    hVar2 = hVar3;
                    f11 = f12;
                    f0Var2 = f0Var3;
                    z12 = z13;
                    arrayList.add(aVarB);
                } else {
                    dVar2 = dVar;
                    hVar2 = hVar;
                    f11 = f5;
                    f0Var2 = f0Var;
                    z12 = z11;
                    while (dVar2.f()) {
                        arrayList.add(p.b(dVar2, hVar2, f11, f0Var2, true, z12));
                    }
                }
                dVar2.c();
                dVar = dVar2;
                hVar = hVar2;
                f5 = f11;
                f0Var = f0Var2;
                z11 = z12;
            } else {
                jd.d dVar4 = dVar;
                arrayList.add(p.b(dVar4, hVar, f5, f0Var, false, z11));
                dVar = dVar4;
            }
        }
        dVar.d();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i11;
        Object obj;
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            ld.a aVar = (ld.a) arrayList.get(i12);
            i12++;
            ld.a aVar2 = (ld.a) arrayList.get(i12);
            aVar.f39895h = Float.valueOf(aVar2.f39894g);
            if (aVar.f39890c == null && (obj = aVar2.f39889b) != null) {
                aVar.f39890c = obj;
                if (aVar instanceof zc.j) {
                    ((zc.j) aVar).d();
                }
            }
        }
        ld.a aVar3 = (ld.a) arrayList.get(i11);
        if ((aVar3.f39889b == null || aVar3.f39890c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
