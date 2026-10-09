package androidx.media3.exoplayer.dash;

import com.android.billingclient.api.k0;
import d7.e;
import f10.i;
import i7.g;
import ij.d;
import java.util.List;
import p20.c;
import p7.a;
import p7.a0;
import re.g0;
import re.v;
import y6.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f2132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f2134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2136g;

    public DashMediaSource$Factory(e eVar) {
        d dVar = new d(eVar);
        this.f2130a = dVar;
        this.f2131b = eVar;
        this.f2132c = new i();
        this.f2134e = new v(2);
        this.f2135f = 30000L;
        this.f2136g = 5000000L;
        this.f2133d = new c(24);
        ((k0) dVar.f34423d).f7546a = true;
    }

    @Override // p7.a0
    public final void a(g0 g0Var) {
        k0 k0Var = (k0) this.f2130a.f34423d;
        k0Var.getClass();
        k0Var.f7547b = g0Var;
    }

    @Override // p7.a0
    public final void b() {
        ((k0) this.f2130a.f34423d).getClass();
    }

    @Override // p7.a0
    public final a c(x xVar) {
        xVar.f57373b.getClass();
        j7.e eVar = new j7.e();
        List list = xVar.f57373b.f57360c;
        return new g(xVar, this.f2131b, !list.isEmpty() ? new ob.e(24, eVar, list) : eVar, this.f2130a, this.f2133d, this.f2132c.b(xVar), this.f2134e, this.f2135f, this.f2136g);
    }

    @Override // p7.a0
    public final void d(boolean z11) {
        ((k0) this.f2130a.f34423d).f7546a = z11;
    }
}
