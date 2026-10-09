package r3;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import com.yalantis.ucrop.view.CropImageView;
import dt.k2;
import g2.f0;
import g2.t;
import g2.u0;
import g2.v0;
import g2.x;
import g2.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import se.p;
import u3.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.a f48774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f48775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v0 f48777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f48778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f48779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0 f48780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f2.e f48781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i2.e f48782i;

    public final a.a a() {
        a.a aVar = this.f48774a;
        if (aVar != null) {
            return aVar;
        }
        a.a aVar2 = new a.a(this);
        this.f48774a = aVar2;
        return aVar2;
    }

    public final void b(int i11) {
        if (i11 == this.f48776c) {
            return;
        }
        a().M(i11);
        this.f48776c = i11;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public final void c(t tVar, long j11, float f5) {
        if (tVar == null) {
            this.f48780g = null;
            this.f48779f = null;
            this.f48781h = null;
            setShader(null);
            return;
        }
        if (tVar instanceof y0) {
            d(p.U(((y0) tVar).f28628a, f5));
            return;
        }
        if (!(tVar instanceof u0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (m.a(this.f48779f, tVar)) {
            f2.e eVar = this.f48781h;
            if (!(eVar == null ? false : f2.e.a(eVar.f26584a, j11))) {
                if (j11 != 9205357640488583168L) {
                    this.f48779f = tVar;
                    this.f48781h = new f2.e(j11);
                    this.f48780g = l1.t.s(new k2(tVar, j11, 6));
                }
            }
        } else {
            if (j11 != 9205357640488583168L) {
                this.f48779f = tVar;
                this.f48781h = new f2.e(j11);
                this.f48780g = l1.t.s(new k2(tVar, j11, 6));
            }
        }
        a.a aVarA = a();
        g0 g0Var = this.f48780g;
        aVarA.R(g0Var != null ? (Shader) g0Var.getValue() : null);
        this.f48778e = null;
        i.c(this, f5);
    }

    public final void d(long j11) {
        x xVar = this.f48778e;
        if (xVar == null ? false : x.d(xVar.f28624a, j11)) {
            return;
        }
        if (j11 != 16) {
            this.f48778e = new x(j11);
            setColor(f0.E(j11));
            this.f48780g = null;
            this.f48779f = null;
            this.f48781h = null;
            setShader(null);
        }
    }

    public final void e(i2.e eVar) {
        if (eVar == null || m.a(this.f48782i, eVar)) {
            return;
        }
        this.f48782i = eVar;
        if (eVar.equals(i2.g.f34126a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(eVar instanceof i2.h)) {
            throw new NoWhenBranchMatchedException();
        }
        a().V(1);
        i2.h hVar = (i2.h) eVar;
        a().U(hVar.f34127a);
        a.a aVarA = a();
        ((Paint) aVarA.f6c).setStrokeMiter(hVar.f34128b);
        a().T(hVar.f34130d);
        a().S(hVar.f34129c);
        a().Q(hVar.f34131e);
    }

    public final void f(v0 v0Var) {
        if (v0Var == null || m.a(this.f48777d, v0Var)) {
            return;
        }
        this.f48777d = v0Var;
        if (v0Var.equals(v0.f28610d)) {
            clearShadowLayer();
            return;
        }
        v0 v0Var2 = this.f48777d;
        float f5 = v0Var2.f28613c;
        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO) {
            f5 = Float.MIN_VALUE;
        }
        setShadowLayer(f5, Float.intBitsToFloat((int) (v0Var2.f28612b >> 32)), Float.intBitsToFloat((int) (this.f48777d.f28612b & 4294967295L)), f0.E(this.f48777d.f28611a));
    }

    public final void g(l lVar) {
        if (lVar == null || m.a(this.f48775b, lVar)) {
            return;
        }
        this.f48775b = lVar;
        int i11 = lVar.f52754a;
        setUnderlineText((i11 | 1) == i11);
        int i12 = this.f48775b.f52754a;
        setStrikeThruText((i12 | 2) == i12);
    }
}
