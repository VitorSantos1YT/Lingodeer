package rt;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.h f49658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.c f49659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uz.i1 f49662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.r0 f49663f;

    public e0(x8 x8Var, vt.h hVar, g6 g6Var, vt.n0 n0Var, vt.c cVar) {
        String str;
        this.f49658a = hVar;
        this.f49659b = cVar;
        String strK = xt.d.k(((fr.o0) n0Var).f27733a.keyLanguage);
        this.f49660c = strK;
        int i11 = c0.f49552a[x8Var.ordinal()];
        int i12 = 4;
        int i13 = 1;
        if (i11 == 1) {
            str = "course_c";
        } else if (i11 == 2) {
            str = "course_w";
        } else if (i11 == 3) {
            str = "course_s";
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "extent_w";
        }
        this.f49661d = str;
        n nVar = n.f50107a;
        uz.i1 i1VarC = uz.x0.c(nVar);
        this.f49662e = i1VarC;
        bh.i0 i0VarE = ((vt.r) hVar).e(strK, str);
        String strA = i6.a(x8Var);
        x6 x6Var = g6Var.f49781a;
        Set setH = qx.b.H(x8Var);
        vy.d dVar = null;
        uz.i iVarO = uz.x0.o(new bh.r(uz.x0.z(new u6(x6Var, setH, dVar, 0), x6Var.f50644b.f55321n), setH, 23));
        yz.f fVar = rz.o0.f50940a;
        r6 r6Var = new r6(uz.x0.w(iVarO, yz.e.f58387a), x8Var, 0);
        vt.e eVar = g6Var.f49782b;
        String str2 = g6Var.f49784d;
        this.f49663f = uz.x0.A(uz.x0.j(i0VarE, uz.x0.o(uz.x0.z(new h(i12, g6Var, x8Var, dVar), uz.x0.j(r6Var, ((fr.r) eVar).b(str2, strA), ((vt.r) g6Var.f49783c).e(str2, strA), new d6(g6Var, strA, null)))), i1VarC, new kr.u(i12, i13, dVar)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new b0(ry.r.f50854a, nVar));
    }
}
