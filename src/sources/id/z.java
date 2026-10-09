package id;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f34386a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1.p f34387b = b1.p.E("c", "v", "i", "o");

    @Override // id.f0
    public final Object a(jd.d dVar, float f5) {
        if (dVar.v() == jd.c.BEGIN_ARRAY) {
            dVar.a();
        }
        dVar.b();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zH = false;
        while (dVar.f()) {
            int iY = dVar.y(f34387b);
            if (iY == 0) {
                zH = dVar.h();
            } else if (iY == 1) {
                arrayListC = o.c(dVar, f5);
            } else if (iY == 2) {
                arrayListC2 = o.c(dVar, f5);
            } else if (iY != 3) {
                dVar.A();
                dVar.B();
            } else {
                arrayListC3 = o.c(dVar, f5);
            }
        }
        dVar.d();
        if (dVar.v() == jd.c.END_ARRAY) {
            dVar.c();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new fd.p(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 1; i11 < size; i11++) {
            PointF pointF2 = (PointF) arrayListC.get(i11);
            int i12 = i11 - 1;
            arrayList.add(new dd.a(kd.h.a((PointF) arrayListC.get(i12), (PointF) arrayListC3.get(i12)), kd.h.a(pointF2, (PointF) arrayListC2.get(i11)), pointF2));
        }
        if (zH) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i13 = size - 1;
            arrayList.add(new dd.a(kd.h.a((PointF) arrayListC.get(i13), (PointF) arrayListC3.get(i13)), kd.h.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new fd.p(pointF, zH, arrayList);
    }
}
