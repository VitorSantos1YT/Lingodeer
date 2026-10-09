package j0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f35408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f35409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f35410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f35411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f35412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f35414g;

    public s0(f fVar, h hVar, float f5, z zVar, float f11, int i11, q0 q0Var) {
        this.f35408a = fVar;
        this.f35409b = hVar;
        this.f35410c = f5;
        this.f35411d = zVar;
        this.f35412e = f11;
        this.f35413f = i11;
        this.f35414g = q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(List list, int i11, int i12, int i13, int i14, q0 q0Var) {
        long jA;
        int i15 = 0;
        if (list.isEmpty()) {
            jA = y.k.a(0, 0);
        } else {
            int i16 = Integer.MAX_VALUE;
            j0 j0Var = new j0(i14, q0Var, v3.b.a(0, i11, 0, Integer.MAX_VALUE), i12, i13);
            w2.p0 p0Var = (w2.p0) ry.m.t0(0, list);
            int iW = p0Var != null ? p0Var.W(i11) : 0;
            int iP = p0Var != null ? p0Var.p(iW) : 0;
            int i17 = 0;
            if (j0Var.b(list.size() > 1, 0, y.k.a(i11, Integer.MAX_VALUE), p0Var == null ? null : new y.k(y.k.a(iP, iW)), 0, 0, 0, false, false).f35312b) {
                y.k kVarA = q0Var.a(0, 0, p0Var != null);
                jA = y.k.a(kVarA != null ? (int) (kVarA.f56725a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i18 = i11;
                int i19 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i19 < size) {
                    int i25 = i18 - iP;
                    int i26 = i19 + 1;
                    int iMax = Math.max(i24, iW);
                    w2.p0 p0Var2 = (w2.p0) ry.m.t0(i26, list);
                    int iW2 = p0Var2 != null ? p0Var2.W(i11) : i15;
                    int iP2 = p0Var2 != null ? p0Var2.p(iW2) + i12 : i15;
                    int i27 = i26 - i22;
                    boolean z11 = i19 + 2 < list.size() ? 1 : i15;
                    int i28 = i23;
                    int i29 = iW2;
                    int i30 = iP2;
                    i0 i0VarB = j0Var.b(z11, i27, y.k.a(i25, i16), p0Var2 == null ? null : new y.k(y.k.a(iP2, iW2)), i28, i17, iMax, false, false);
                    if (i0VarB.f35311a) {
                        int i31 = iMax + i13 + i17;
                        h0 h0VarA = j0Var.a(i0VarB, p0Var2 != null, i28, i31, i25, i27);
                        int i32 = i30 - i12;
                        i23 = i28 + 1;
                        if (i0VarB.f35312b) {
                            if (h0VarA != null) {
                                long j11 = h0VarA.f35298b;
                                if (!h0VarA.f35297a) {
                                    i31 += ((int) (j11 & 4294967295L)) + i13;
                                }
                            }
                            i17 = i31;
                            i21 = i26;
                            break;
                        }
                        i22 = i26;
                        i17 = i31;
                        iP = i32;
                        i24 = 0;
                        i18 = i11;
                    } else {
                        iP = i30;
                        i18 = i25;
                        i23 = i28;
                        i24 = iMax;
                    }
                    i19 = i26;
                    i21 = i19;
                    iW = i29;
                    i16 = Integer.MAX_VALUE;
                    i15 = 0;
                }
                jA = y.k.a(i17 - i13, i21);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // j0.x1
    public final int b(w2.g1 g1Var) {
        return g1Var.a0();
    }

    @Override // j0.x1
    public final long c(int i11, int i12, int i13, boolean z11) {
        a2 a2Var = z1.f35448a;
        return !z11 ? v3.b.a(i11, i12, 0, i13) : com.bumptech.glide.f.q(i11, i12, 0, i13);
    }

    @Override // j0.x1
    public final int d(w2.g1 g1Var) {
        return g1Var.g0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f35408a.equals(s0Var.f35408a) && this.f35409b.equals(s0Var.f35409b) && v3.f.b(this.f35410c, s0Var.f35410c) && this.f35411d.equals(s0Var.f35411d) && v3.f.b(this.f35412e, s0Var.f35412e) && this.f35413f == s0Var.f35413f && kotlin.jvm.internal.m.a(this.f35414g, s0Var.f35414g);
    }

    @Override // j0.x1
    public final w2.r0 g(final w2.g1[] g1VarArr, w2.s0 s0Var, final int[] iArr, int i11, final int i12, final int[] iArr2, final int i13, final int i14, final int i15) {
        final v3.m mVar = v3.m.Ltr;
        return s0Var.q0(i11, i12, ry.s.f50855a, new fz.c() { // from class: j0.r0
            @Override // fz.c
            public final Object invoke(Object obj) {
                c cVar;
                w2.f1 f1Var = (w2.f1) obj;
                int[] iArr3 = iArr2;
                int i16 = iArr3 != null ? iArr3[i13] : 0;
                int i17 = i14;
                for (int i18 = i17; i18 < i15; i18++) {
                    w2.g1 g1Var = g1VarArr[i18];
                    kotlin.jvm.internal.m.c(g1Var);
                    Object objG = g1Var.G();
                    y1 y1Var = objG instanceof y1 ? (y1) objG : null;
                    if (y1Var == null || (cVar = y1Var.f35443c) == null) {
                        cVar = this.f35411d;
                    }
                    f1Var.f(g1Var, iArr[i18 - i17], cVar.i(i12 - g1Var.a0(), mVar) + i16, CropImageView.DEFAULT_ASPECT_RATIO);
                }
                return qy.b0.f48488a;
            }
        });
    }

    public final int hashCode() {
        return this.f35414g.hashCode() + defpackage.e.b(Integer.MAX_VALUE, defpackage.e.b(this.f35413f, defpackage.e.a((this.f35411d.hashCode() + defpackage.e.a((this.f35409b.hashCode() + ((this.f35408a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.f35410c, 31)) * 31, this.f35412e, 31), 31), 31);
    }

    @Override // j0.x1
    public final void j(int i11, int[] iArr, int[] iArr2, w2.s0 s0Var) {
        this.f35408a.b(s0Var, i11, iArr, s0Var.getLayoutDirection(), iArr2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb2.append(this.f35408a);
        sb2.append(", verticalArrangement=");
        sb2.append(this.f35409b);
        sb2.append(", mainAxisSpacing=");
        com.google.android.material.datepicker.d.s(this.f35410c, ", crossAxisAlignment=", sb2);
        sb2.append(this.f35411d);
        sb2.append(", crossAxisArrangementSpacing=");
        com.google.android.material.datepicker.d.s(this.f35412e, ", maxItemsInMainAxis=", sb2);
        sb2.append(this.f35413f);
        sb2.append(", maxLines=2147483647, overflow=");
        sb2.append(this.f35414g);
        sb2.append(')');
        return sb2.toString();
    }
}
