package l2;

import android.graphics.Path;
import com.yalantis.ucrop.view.CropImageView;
import g2.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2.t f39614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39615c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f39616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f39617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f39618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g2.t f39619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39621i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f39622j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f39623k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f39624l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i2.h f39628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g2.k f39629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g2.k f39630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g2.k f39631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f39632u;

    public h() {
        int i11 = h0.f39633a;
        this.f39616d = ry.r.f50854a;
        this.f39617e = 1.0f;
        this.f39620h = 0;
        this.f39621i = 0;
        this.f39622j = 4.0f;
        this.f39624l = 1.0f;
        this.f39625n = true;
        this.f39626o = true;
        g2.k kVarA = g2.o.a();
        this.f39629r = kVarA;
        this.f39630s = kVarA;
        this.f39632u = com.bumptech.glide.d.u(qy.j.NONE, g.f39604b);
    }

    @Override // l2.c0
    public final void a(i2.d dVar) {
        i2.h hVar;
        if (this.f39625n) {
            a.e(this.f39616d, this.f39629r);
            e();
        } else if (this.f39627p) {
            e();
        }
        this.f39625n = false;
        this.f39627p = false;
        g2.t tVar = this.f39614b;
        if (tVar != null) {
            i2.d.g(dVar, this.f39630s, tVar, this.f39615c, null, 56);
        }
        g2.t tVar2 = this.f39619g;
        if (tVar2 != null) {
            i2.h hVar2 = this.f39628q;
            if (this.f39626o || hVar2 == null) {
                i2.h hVar3 = new i2.h(this.f39618f, this.f39622j, this.f39620h, this.f39621i, null, 16);
                this.f39628q = hVar3;
                this.f39626o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            i2.d.g(dVar, this.f39630s, tVar2, this.f39617e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, qy.h] */
    public final void e() {
        float f5 = this.f39623k;
        g2.k kVar = this.f39629r;
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO && this.f39624l == 1.0f) {
            this.f39630s = kVar;
            return;
        }
        if (kotlin.jvm.internal.m.a(this.f39630s, kVar)) {
            this.f39630s = g2.o.a();
        } else {
            int i11 = this.f39630s.f28575a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.f39630s.f28575a.rewind();
            this.f39630s.k(i11);
        }
        ?? r9 = this.f39632u;
        ((g2.m) r9.getValue()).c(kVar);
        float length = ((g2.m) r9.getValue()).f28582a.getLength();
        float f11 = this.f39623k;
        float f12 = this.m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f39624l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((g2.m) r9.getValue()).b(f13, f14, this.f39630s);
            return;
        }
        g2.k kVarA = this.f39631t;
        if (kVarA == null) {
            kVarA = g2.o.a();
            this.f39631t = kVarA;
        }
        kVarA.j();
        ((g2.m) r9.getValue()).b(f13, length, kVarA);
        p0.b(this.f39630s, kVarA);
        kVarA.j();
        ((g2.m) r9.getValue()).b(CropImageView.DEFAULT_ASPECT_RATIO, f14, kVarA);
        p0.b(this.f39630s, kVarA);
    }

    public final String toString() {
        return this.f39629r.toString();
    }
}
