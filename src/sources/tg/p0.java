package tg;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w2.f1;
import w2.g1;
import w2.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p0 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52336a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f52337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy.e f52340e;

    public /* synthetic */ p0(int i11, List list, float f5, fz.c cVar) {
        this.f52338c = i11;
        this.f52339d = list;
        this.f52337b = f5;
        this.f52340e = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        switch (this.f52336a) {
            case 0:
                List list = (List) this.f52339d;
                final fz.c cVar = (fz.c) this.f52340e;
                final q1 SubcomposeLayout = (q1) obj;
                v3.a aVar = (v3.a) obj2;
                kotlin.jvm.internal.m.f(SubcomposeLayout, "$this$SubcomposeLayout");
                Boolean bool = Boolean.FALSE;
                int i11 = this.f52338c;
                ArrayList arrayListG1 = ry.m.g1(SubcomposeLayout.C(bool, new t1.d(new l0.i(list, i11, 3), true, -223867091)), i11, i11);
                if (arrayListG1.size() != list.size()) {
                    throw new IllegalStateException("Check failed.");
                }
                long j11 = aVar.f53483a;
                if (!v3.a.d(j11)) {
                    throw new IllegalStateException("Table must have bounded width");
                }
                final float f5 = this.f52337b;
                final float fH = (v3.a.h(j11) - ((i11 + 1) * f5)) / i11;
                float size = (arrayListG1.size() + 1) * f5;
                long jE = v3.b.e(v3.b.b(hz.b.Q(fH), 0, 13), j11);
                final ArrayList arrayList = new ArrayList(ry.n.W(arrayListG1, 10));
                int size2 = arrayListG1.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj4 = arrayListG1.get(i12);
                    i12++;
                    List list2 = (List) obj4;
                    long j12 = j11;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((w2.p0) it.next()).B(jE));
                    }
                    arrayList.add(arrayList2);
                    j11 = j12;
                }
                long j13 = j11;
                final ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList, 10));
                int size3 = arrayList.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj5 = arrayList.get(i13);
                    i13++;
                    Iterator it2 = ((List) obj5).iterator();
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (it2.hasNext()) {
                            int i14 = ((g1) next).f54502b;
                            do {
                                Object next2 = it2.next();
                                int i15 = ((g1) next2).f54502b;
                                if (i14 < i15) {
                                    next = next2;
                                    i14 = i15;
                                }
                            } while (it2.hasNext());
                        }
                        obj3 = next;
                    } else {
                        obj3 = null;
                    }
                    kotlin.jvm.internal.m.c(obj3);
                    arrayList3.add(Integer.valueOf(((g1) obj3).f54502b));
                }
                final int iH = v3.a.h(j13);
                int size4 = arrayList3.size();
                int iIntValue = 0;
                int i16 = 0;
                while (i16 < size4) {
                    Object obj6 = arrayList3.get(i16);
                    i16++;
                    iIntValue += ((Number) obj6).intValue();
                }
                final int iQ = hz.b.Q(iIntValue + size);
                return SubcomposeLayout.q0(iH, iQ, ry.s.f50855a, new fz.c() { // from class: tg.q0
                    @Override // fz.c
                    public final Object invoke(Object obj7) {
                        f1 layout = (f1) obj7;
                        kotlin.jvm.internal.m.f(layout, "$this$layout");
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = arrayList;
                        int size5 = arrayList6.size();
                        float f11 = f5;
                        float fFloatValue = f11;
                        int i17 = 0;
                        int i18 = 0;
                        while (i18 < size5) {
                            Object obj8 = arrayList6.get(i18);
                            i18++;
                            int i19 = i17 + 1;
                            if (i17 < 0) {
                                ns.o.V();
                                throw null;
                            }
                            float f12 = f11 / 2.0f;
                            arrayList4.add(Float.valueOf(fFloatValue - f12));
                            float f13 = f11;
                            for (g1 g1Var : (List) obj8) {
                                if (i17 == 0) {
                                    arrayList5.add(Float.valueOf(f13 - f12));
                                }
                                layout.f(g1Var, hz.b.Q(f13), hz.b.Q(fFloatValue), CropImageView.DEFAULT_ASPECT_RATIO);
                                f13 += fH + f11;
                                arrayList6 = arrayList6;
                                size5 = size5;
                            }
                            ArrayList arrayList7 = arrayList6;
                            int i21 = size5;
                            if (i17 == 0) {
                                arrayList5.add(Float.valueOf(f13 - f12));
                            }
                            fFloatValue += ((Number) arrayList3.get(i17)).floatValue() + f11;
                            i17 = i19;
                            arrayList6 = arrayList7;
                            size5 = i21;
                        }
                        arrayList4.add(Float.valueOf(fFloatValue - (f11 / 2.0f)));
                        w2.p0 p0Var = (w2.p0) ry.m.P0(SubcomposeLayout.C(Boolean.TRUE, new t1.d(new es.c(7, cVar, new w0(arrayList4, arrayList5)), true, -1387549559)));
                        int i22 = iH;
                        boolean z11 = i22 >= 0;
                        int i23 = iQ;
                        if (!(z11 & (i23 >= 0))) {
                            v3.i.a("width and height must be >= 0");
                        }
                        f1.k(layout, p0Var.B(v3.b.h(i22, i22, i23, i23)), 0, 0);
                        return qy.b0.f48488a;
                    }
                });
            default:
                ((Integer) obj2).intValue();
                us.b.g((Map) this.f52339d, this.f52337b, (fz.e) this.f52340e, (l1.n) obj, l1.t.M(this.f52338c | 1));
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ p0(Map map, float f5, fz.e eVar, int i11) {
        this.f52339d = map;
        this.f52337b = f5;
        this.f52340e = eVar;
        this.f52338c = i11;
    }
}
