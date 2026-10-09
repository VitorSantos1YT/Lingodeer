package o0;

import com.yalantis.ucrop.view.CropImageView;
import f0.h1;
import java.util.List;
import java.util.Map;
import rz.b0;
import w2.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f44404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f44405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f44406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f44407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f44408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f44409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f44410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f44411l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g0.l f44412n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r0 f44413o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f44414p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f44415q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f44416r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b0 f44417s;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n(int i11, int i12, int i13, h1 h1Var, int i14, int i15, int i16, g0.l lVar, r0 r0Var, b0 b0Var) {
        ry.r rVar = ry.r.f50854a;
        this(rVar, i11, i12, i13, h1Var, i14, i15, i16, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, false, lVar, r0Var, false, rVar, rVar, b0Var);
    }

    @Override // w2.r0
    public final Map a() {
        return this.f44413o.a();
    }

    @Override // w2.r0
    public final void b() {
        this.f44413o.b();
    }

    @Override // w2.r0
    public final fz.c c() {
        return this.f44413o.c();
    }

    public final n d(int i11) {
        int i12;
        int i13 = this.f44401b + this.f44402c;
        if (this.f44414p) {
            return null;
        }
        List list = this.f44400a;
        if (list.isEmpty() || this.f44408i == null || (i12 = this.f44411l - i11) < 0 || i12 >= i13) {
            return null;
        }
        float f5 = this.f44410k - (i13 != 0 ? i11 / i13 : CropImageView.DEFAULT_ASPECT_RATIO);
        if (this.f44409j == null || f5 >= 0.5f || f5 <= -0.5f) {
            return null;
        }
        e eVar = (e) ry.m.q0(list);
        e eVar2 = (e) ry.m.z0(list);
        int i14 = this.f44406g;
        int i15 = this.f44405f;
        if (i11 < 0) {
            if (Math.min((eVar.f44371j + i13) - i15, (eVar2.f44371j + i13) - i14) <= (-i11)) {
                return null;
            }
        } else if (Math.min(i15 - eVar.f44371j, i14 - eVar2.f44371j) <= i11) {
            return null;
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            ((e) list.get(i16)).a(i11);
        }
        List list2 = this.f44415q;
        int size2 = list2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            ((e) list2.get(i17)).a(i11);
        }
        List list3 = this.f44416r;
        int size3 = list3.size();
        for (int i18 = 0; i18 < size3; i18++) {
            ((e) list3.get(i18)).a(i11);
        }
        return new n(this.f44400a, this.f44401b, this.f44402c, this.f44403d, this.f44404e, this.f44405f, this.f44406g, this.f44407h, this.f44408i, this.f44409j, f5, i12, this.m || i11 > 0, this.f44412n, this.f44413o, this.f44414p, this.f44415q, this.f44416r, this.f44417s);
    }

    public final long e() {
        r0 r0Var = this.f44413o;
        return (((long) r0Var.h()) << 32) | (((long) r0Var.f()) & 4294967295L);
    }

    @Override // w2.r0
    public final int f() {
        return this.f44413o.f();
    }

    @Override // w2.r0
    public final int h() {
        return this.f44413o.h();
    }

    public n(List list, int i11, int i12, int i13, h1 h1Var, int i14, int i15, int i16, e eVar, e eVar2, float f5, int i17, boolean z11, g0.l lVar, r0 r0Var, boolean z12, List list2, List list3, b0 b0Var) {
        this.f44400a = list;
        this.f44401b = i11;
        this.f44402c = i12;
        this.f44403d = i13;
        this.f44404e = h1Var;
        this.f44405f = i14;
        this.f44406g = i15;
        this.f44407h = i16;
        this.f44408i = eVar;
        this.f44409j = eVar2;
        this.f44410k = f5;
        this.f44411l = i17;
        this.m = z11;
        this.f44412n = lVar;
        this.f44413o = r0Var;
        this.f44414p = z12;
        this.f44415q = list2;
        this.f44416r = list3;
        this.f44417s = b0Var;
    }
}
