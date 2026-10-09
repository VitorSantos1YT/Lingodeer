package zu;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.uistate.MasteryUiState;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s2 extends ViewModel {
    public final uz.i1 H;
    public final uz.i1 K;
    public final uz.i1 L;
    public final uz.r0 M;
    public final LinkedHashMap N;
    public final uz.r0 O;
    public final uz.r0 P;
    public final uz.r0 Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.h1 f59555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.a f59556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.l0 f59557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.c f59558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.n0 f59559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vt.u0 f59560f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ur.a f59561t;

    public s2(vt.h1 h1Var, vt.a aVar, vt.l0 l0Var, vt.c cVar, vt.n0 n0Var, vt.u0 u0Var, ur.a aVar2) {
        Object value;
        this.f59555a = h1Var;
        this.f59556b = aVar;
        this.f59557c = l0Var;
        this.f59558d = cVar;
        this.f59559e = n0Var;
        this.f59560f = u0Var;
        this.f59561t = aVar2;
        uz.i1 i1VarC = uz.x0.c(j2.f59458a);
        this.H = i1VarC;
        this.K = i1VarC;
        u0 u0Var2 = u0.f59565a;
        uz.i1 i1VarC2 = uz.x0.c(u0Var2);
        this.L = i1VarC2;
        this.M = new uz.r0(i1VarC2);
        this.N = new LinkedHashMap();
        do {
            value = i1VarC2.getValue();
        } while (!i1VarC2.j(value, ((fr.o0) this.f59559e).f27733a.isStreakEnable ? u0Var2 : w0.f59570a));
        vy.d dVar = null;
        vz.i iVarB = uz.x0.B(uz.x0.B(((vt.d) this.f59558d).f54195e, new m2(1, dVar, this)), new m2(2, dVar, this));
        yz.f fVar = rz.o0.f50940a;
        yz.e eVar = yz.e.f58387a;
        this.O = uz.x0.A(uz.x0.w(iVarB, eVar), ViewModelKt.getViewModelScope(this), uz.a1.a(2), z.f59579a);
        int i11 = 16;
        this.P = uz.x0.A(uz.x0.w(new gp.r(uz.x0.B(((vt.d) this.f59558d).f54195e, new m2(3, dVar, this)), i11), eVar), ViewModelKt.getViewModelScope(this), uz.a1.a(2), MasteryUiState.Loading.INSTANCE);
        this.Q = uz.x0.A(uz.x0.B(((vt.d) this.f59558d).f54195e, new m2(4, dVar, this)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), r.f59543a);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new xg.b(this, dVar, i11), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new n2(0, dVar, this), 3);
    }

    public final void a(n0 n0Var) {
        LinkedHashMap linkedHashMap = this.N;
        rz.g1 g1Var = (rz.g1) linkedHashMap.get(n0Var);
        if (g1Var == null || !g1Var.isActive()) {
            linkedHashMap.put(n0Var, rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new xg.b(17, this, n0Var, null), 3));
        } else {
            n0Var.toString();
        }
    }
}
