package ph;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.env.Env;
import fr.o0;
import java.util.LinkedHashMap;
import java.util.Map;
import rz.e0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.h1;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends ViewModel {
    public final LinkedHashMap H;
    public final r0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fh.e f46840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f46841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.c f46842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1 f46843d = x0.c(ry.s.f50855a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f46844e = x0.c(nz.n.Z(new nz.c(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new th.i()), new st.a(14)), new st.a(15), 0)));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mh.b[] f46845f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qy.q f46846t;

    public a0(fh.e eVar, h1 h1Var, vt.c cVar, n0 n0Var) {
        this.f46840a = eVar;
        this.f46841b = h1Var;
        this.f46842c = cVar;
        Env env = ((o0) n0Var).f27733a;
        this.f46845f = (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(env.keyLanguage)) || ry.l.D(new Integer[]{47, 48, 4}, Integer.valueOf(env.keyLanguage))) ? new mh.b[]{mh.b.BEGINNER_I, mh.b.BEGINNER_II, mh.b.INTERMEDIATE_I} : new mh.b[]{mh.b.BEGINNER_I, mh.b.BEGINNER_II, mh.b.INTERMEDIATE_I, mh.b.INTERMEDIATE_II};
        this.f46846t = com.bumptech.glide.d.v(new lt.e(this, 13));
        this.H = new LinkedHashMap();
        vy.d dVar = null;
        this.K = x0.A(new gp.r(new ns.j(this, dVar, 9)), ViewModelKt.getViewModelScope(this), a1.a(2), oh.b.f44914a);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new z(this, dVar, 0), 3);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new z(this, dVar, 1), 3);
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new z(this, dVar, 2), 3);
    }

    public static final void a(a0 a0Var, long j11, boolean z11) {
        i1 i1Var = a0Var.f46843d;
        Map map = (Map) i1Var.getValue();
        if (kotlin.jvm.internal.m.a((Boolean) map.get(Long.valueOf(j11)), Boolean.valueOf(z11))) {
            return;
        }
        LinkedHashMap linkedHashMapK0 = ry.x.k0(map);
        linkedHashMapK0.put(Long.valueOf(j11), Boolean.valueOf(z11));
        i1Var.l(null, linkedHashMapK0);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.H.clear();
        i1 i1Var = this.f46843d;
        i1Var.getClass();
        i1Var.l(null, ry.s.f50855a);
        i1 i1Var2 = this.f46844e;
        i1Var2.getClass();
        i1Var2.l(null, ry.r.f50854a);
    }
}
