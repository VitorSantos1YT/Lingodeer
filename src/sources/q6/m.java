package q6;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import ns.o;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f47506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sy.c f47507d;

    /* JADX WARN: Multi-variable type inference failed */
    public m(AbstractList features, float f5, float f11) {
        ArrayList arrayListM;
        ArrayList arrayListM2;
        char c11;
        c cVar;
        List list;
        kotlin.jvm.internal.m.f(features, "features");
        this.f47504a = features;
        this.f47505b = f5;
        this.f47506c = f11;
        sy.c cVarO = o.o();
        char c12 = 3;
        c cVar2 = null;
        if (features.size() <= 0 || ((g) features.get(0)).f47484a.size() != 3) {
            arrayListM = null;
            arrayListM2 = null;
        } else {
            qy.l lVarD = ((c) ((g) features.get(0)).f47484a.get(1)).d(0.5f);
            c cVar3 = (c) lVarD.f48495a;
            c cVar4 = (c) lVarD.f48496b;
            arrayListM2 = o.M(((g) features.get(0)).f47484a.get(0), cVar3);
            arrayListM = o.M(cVar4, ((g) features.get(0)).f47484a.get(2));
        }
        int size = features.size();
        if (size >= 0) {
            int i11 = 0;
            c cVar5 = null;
            while (true) {
                if (i11 == 0 && arrayListM != null) {
                    list = arrayListM;
                } else if (i11 != this.f47504a.size()) {
                    list = ((g) this.f47504a.get(i11)).f47484a;
                } else {
                    if (arrayListM2 == null) {
                        c11 = c12;
                        break;
                    }
                    list = arrayListM2;
                }
                int size2 = list.size();
                int i12 = 0;
                while (i12 < size2) {
                    c cVar6 = (c) list.get(i12);
                    char c13 = c12;
                    float[] fArr = cVar6.f47478a;
                    boolean z11 = false;
                    if (Math.abs(fArr[0] - cVar6.a()) < 1.0E-4f && Math.abs(fArr[1] - cVar6.b()) < 1.0E-4f) {
                        z11 = true;
                    }
                    if (!z11) {
                        if (cVar5 != null) {
                            cVarO.add(cVar5);
                        }
                        if (cVar2 == null) {
                            cVar2 = cVar6;
                            cVar5 = cVar2;
                        } else {
                            cVar5 = cVar6;
                        }
                    } else if (cVar5 != null) {
                        float[] fArr2 = cVar5.f47478a;
                        fArr2[6] = cVar6.a();
                        fArr2[7] = cVar6.b();
                    }
                    i12++;
                    c12 = c13;
                }
                c11 = c12;
                if (i11 == size) {
                    break;
                }
                i11++;
                c12 = c11;
            }
            cVar = cVar2;
            cVar2 = cVar5;
        } else {
            c11 = 3;
            cVar = null;
        }
        if (cVar2 != null && cVar != null) {
            float[] fArr3 = cVar2.f47478a;
            float f12 = fArr3[0];
            float f13 = fArr3[1];
            float f14 = fArr3[2];
            float f15 = fArr3[c11];
            float f16 = fArr3[4];
            float f17 = fArr3[5];
            float[] fArr4 = cVar.f47478a;
            cVarO.add(ew.a.b(f12, f13, f14, f15, f16, f17, fArr4[0], fArr4[1]));
        }
        sy.c cVarE = o.e(cVarO);
        this.f47507d = cVarE;
        Object obj = cVarE.get(cVarE.b() - 1);
        int iB = cVarE.b();
        int i13 = 0;
        while (i13 < iB) {
            c cVar7 = (c) this.f47507d.get(i13);
            c cVar8 = (c) obj;
            if (Math.abs(cVar7.f47478a[0] - cVar8.a()) > 1.0E-4f || Math.abs(cVar7.f47478a[1] - cVar8.b()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i13++;
            obj = cVar7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f47504a, ((m) obj).f47504a);
    }

    public final int hashCode() {
        return this.f47504a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb2.append(ry.m.y0(this.f47507d, null, null, null, null, 63));
        sb2.append(" || Features = ");
        sb2.append(ry.m.y0(this.f47504a, null, null, null, null, 63));
        sb2.append(" || Center = (");
        sb2.append(this.f47505b);
        sb2.append(", ");
        return p.h(this.f47506c, ")]", sb2);
    }
}
