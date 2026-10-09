package h1;

import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements w2.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f30014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0.f f30015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0.h f30016c;

    public b0(v vVar, j0.f fVar, j0.h hVar) {
        this.f30014a = vVar;
        this.f30015b = fVar;
        this.f30016c = hVar;
    }

    @Override // w2.q0
    public final w2.r0 e(w2.s0 s0Var, List list, long j11) {
        int iH;
        cc ccVar;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            w2.p0 p0Var = (w2.p0) list.get(i11);
            if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var), "navigationIcon")) {
                w2.g1 g1VarB = p0Var.B(v3.a.a(0, 0, 0, 0, 14, j11));
                int size2 = list.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    w2.p0 p0Var2 = (w2.p0) list.get(i12);
                    if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var2), "actionIcons")) {
                        w2.g1 g1VarB2 = p0Var2.B(v3.a.a(0, 0, 0, 0, 14, j11));
                        if (v3.a.h(j11) == Integer.MAX_VALUE) {
                            iH = v3.a.h(j11);
                        } else {
                            iH = (v3.a.h(j11) - g1VarB.f54501a) - g1VarB2.f54501a;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i13 = iH;
                        int size3 = list.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            w2.p0 p0Var3 = (w2.p0) list.get(i14);
                            if (kotlin.jvm.internal.m.a(w2.a0.i(p0Var3), "title")) {
                                w2.g1 g1VarB3 = p0Var3.B(v3.a.a(0, i13, 0, 0, 12, j11));
                                w2.n nVar = w2.c.f54476b;
                                int iX = g1VarB3.X(nVar) != Integer.MIN_VALUE ? g1VarB3.X(nVar) : 0;
                                a9.i iVar = this.f30014a.f31172a;
                                float fL = (iVar == null || (ccVar = (cc) iVar.f517a) == null) ? CropImageView.DEFAULT_ASPECT_RATIO : ccVar.f30112c.l();
                                int iG = v3.a.g(j11) == Integer.MAX_VALUE ? v3.a.g(j11) : v3.a.g(j11) + (Float.isNaN(fL) ? 0 : hz.b.Q(fL));
                                return s0Var.q0(v3.a.h(j11), iG, ry.s.f50855a, new a0(g1VarB, iG, g1VarB3, this.f30015b, j11, g1VarB2, s0Var, this.f30016c, iX));
                            }
                            i14++;
                            i13 = i13;
                            g1VarB2 = g1VarB2;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
