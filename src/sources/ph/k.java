package ph;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import fr.o0;
import fr.x4;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rz.e0;
import uz.i1;
import uz.q0;
import uz.x0;
import vt.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends ViewModel {
    public final i1 H;
    public final i1 K;
    public final i1 L;
    public final i1 M;
    public final LinkedHashMap N;
    public final q0 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh.e f46879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.c f46880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yy.a f46882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1 f46883f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i1 f46884t;

    public k(String str, fh.e eVar, h1 h1Var, vt.c cVar) {
        this.f46878a = str;
        this.f46879b = eVar;
        this.f46880c = cVar;
        mh.d.Companion.getClass();
        this.f46881d = ry.m.S0(mh.d.b(), new gu.g(4));
        mh.f.Companion.getClass();
        this.f46882e = mh.f.b();
        ry.r rVar = ry.r.f50854a;
        i1 i1VarC = x0.c(rVar);
        this.f46883f = i1VarC;
        this.f46884t = i1VarC;
        i1 i1VarC2 = x0.c(rVar);
        this.H = i1VarC2;
        this.K = i1VarC2;
        this.L = x0.c(ry.s.f50855a);
        this.M = x0.c(nz.n.Z(new nz.c(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new th.i()), new st.a(14)), new st.a(15), 0)));
        this.N = new LinkedHashMap();
        vy.d dVar = null;
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new j(this, dVar, 0), 3);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new j(this, dVar, 1), 3);
        this.O = n9.m.a(x0.B(x0.o(x0.j(((x4) h1Var).f27974g, x0.o(x0.n(i1VarC, 300L)), x0.o(x0.n(i1VarC2, 300L)), new b(this, null))), new dt.x(dVar, this, 13)), ViewModelKt.getViewModelScope(this));
    }

    public static final void a(k kVar, long j11, boolean z11) {
        i1 i1Var = kVar.L;
        Map map = (Map) i1Var.getValue();
        if (kotlin.jvm.internal.m.a((Boolean) map.get(Long.valueOf(j11)), Boolean.valueOf(z11))) {
            return;
        }
        LinkedHashMap linkedHashMapK0 = ry.x.k0(map);
        linkedHashMapK0.put(Long.valueOf(j11), Boolean.valueOf(z11));
        i1Var.l(null, linkedHashMapK0);
    }
}
