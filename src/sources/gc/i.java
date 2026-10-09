package gc;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import hh.p0;
import java.util.Arrays;
import java.util.List;
import okhttp3.Headers;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f29019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a f29020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f29021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hc.d f29022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f29023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jc.e f29024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Headers f29025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f29026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f29027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f29028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f29029l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f29030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f29031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f29032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f29033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f29034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f29035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f29036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Lifecycle f29037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final hc.h f29038v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hc.f f29039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f29040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f29041y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f29042z;

    public i(Context context, Object obj, ic.a aVar, Bitmap.Config config, hc.d dVar, List list, jc.e eVar, Headers headers, p pVar, boolean z11, boolean z12, boolean z13, boolean z14, b bVar, b bVar2, b bVar3, y yVar, y yVar2, y yVar3, y yVar4, Lifecycle lifecycle, hc.h hVar, hc.f fVar, n nVar, d dVar2, c cVar) {
        this.f29018a = context;
        this.f29019b = obj;
        this.f29020c = aVar;
        this.f29021d = config;
        this.f29022e = dVar;
        this.f29023f = list;
        this.f29024g = eVar;
        this.f29025h = headers;
        this.f29026i = pVar;
        this.f29027j = z11;
        this.f29028k = z12;
        this.f29029l = z13;
        this.m = z14;
        this.f29030n = bVar;
        this.f29031o = bVar2;
        this.f29032p = bVar3;
        this.f29033q = yVar;
        this.f29034r = yVar2;
        this.f29035s = yVar3;
        this.f29036t = yVar4;
        this.f29037u = lifecycle;
        this.f29038v = hVar;
        this.f29039w = fVar;
        this.f29040x = nVar;
        this.f29041y = dVar2;
        this.f29042z = cVar;
    }

    public static h a(i iVar) {
        Context context = iVar.f29018a;
        iVar.getClass();
        return new h(iVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f29018a, iVar.f29018a) && this.f29019b.equals(iVar.f29019b) && kotlin.jvm.internal.m.a(this.f29020c, iVar.f29020c) && this.f29021d == iVar.f29021d && this.f29022e == iVar.f29022e && kotlin.jvm.internal.m.a(this.f29023f, iVar.f29023f) && kotlin.jvm.internal.m.a(this.f29024g, iVar.f29024g) && kotlin.jvm.internal.m.a(this.f29025h, iVar.f29025h) && this.f29026i.equals(iVar.f29026i) && this.f29027j == iVar.f29027j && this.f29028k == iVar.f29028k && this.f29029l == iVar.f29029l && this.m == iVar.m && this.f29030n == iVar.f29030n && this.f29031o == iVar.f29031o && this.f29032p == iVar.f29032p && kotlin.jvm.internal.m.a(this.f29033q, iVar.f29033q) && kotlin.jvm.internal.m.a(this.f29034r, iVar.f29034r) && kotlin.jvm.internal.m.a(this.f29035s, iVar.f29035s) && kotlin.jvm.internal.m.a(this.f29036t, iVar.f29036t) && kotlin.jvm.internal.m.a(this.f29037u, iVar.f29037u) && this.f29038v.equals(iVar.f29038v) && this.f29039w == iVar.f29039w && this.f29040x.equals(iVar.f29040x) && this.f29041y.equals(iVar.f29041y) && kotlin.jvm.internal.m.a(this.f29042z, iVar.f29042z);
    }

    public final int hashCode() {
        int iHashCode = (this.f29019b.hashCode() + (this.f29018a.hashCode() * 31)) * 31;
        ic.a aVar = this.f29020c;
        return this.f29042z.hashCode() + ((this.f29041y.hashCode() + ((this.f29040x.f29060a.hashCode() + ((this.f29039w.hashCode() + ((this.f29038v.hashCode() + ((this.f29037u.hashCode() + ((this.f29036t.hashCode() + ((this.f29035s.hashCode() + ((this.f29034r.hashCode() + ((this.f29033q.hashCode() + ((this.f29032p.hashCode() + ((this.f29031o.hashCode() + ((this.f29030n.hashCode() + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e((this.f29026i.f29069a.hashCode() + ((((this.f29024g.hashCode() + p0.b((this.f29022e.hashCode() + ((this.f29021d.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 923521)) * 961)) * 29791, 31, this.f29023f)) * 31) + Arrays.hashCode(this.f29025h.f45042a)) * 31)) * 31, 31, this.f29027j), 31, this.f29028k), 31, this.f29029l), 31, this.m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
