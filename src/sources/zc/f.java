package zc;

import android.graphics.Color;
import android.graphics.Matrix;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd.c f59102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd.c f59103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f59104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f59105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f59106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f59107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f59108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Matrix f59109h;

    public f(gd.c cVar, gd.c cVar2, a9.i iVar) {
        this.f59103b = cVar;
        this.f59102a = cVar2;
        d dVarI = ((ed.a) iVar.f517a).I();
        this.f59104c = (e) dVarI;
        dVarI.a(this);
        cVar2.g(dVarI);
        g gVarI = ((ed.b) iVar.f518b).I();
        this.f59105d = gVarI;
        gVarI.a(this);
        cVar2.g(gVarI);
        g gVarI2 = ((ed.b) iVar.f519c).I();
        this.f59106e = gVarI2;
        gVarI2.a(this);
        cVar2.g(gVarI2);
        g gVarI3 = ((ed.b) iVar.f520d).I();
        this.f59107f = gVarI3;
        gVarI3.a(this);
        cVar2.g(gVarI3);
        g gVarI4 = ((ed.b) iVar.f521e).I();
        this.f59108g = gVarI4;
        gVarI4.a(this);
        cVar2.g(gVarI4);
    }

    public final kd.b a(Matrix matrix, int i11) {
        float fM = this.f59106e.m() * 0.017453292f;
        float fFloatValue = ((Float) this.f59107f.f()).floatValue();
        double d5 = fM;
        float fSin = ((float) Math.sin(d5)) * fFloatValue;
        float fCos = ((float) Math.cos(d5 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f59108g.f()).floatValue();
        int iIntValue = ((Integer) this.f59104c.f()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f59105d.f()).floatValue() * i11) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        kd.b bVar = new kd.b();
        bVar.f38082a = fFloatValue2 * 0.33f;
        bVar.f38083b = fSin;
        bVar.f38084c = fCos;
        bVar.f38085d = iArgb;
        bVar.f38086e = null;
        bVar.c(matrix);
        if (this.f59109h == null) {
            this.f59109h = new Matrix();
        }
        this.f59102a.f29094w.e().invert(this.f59109h);
        bVar.c(this.f59109h);
        return bVar;
    }

    @Override // zc.a
    public final void b() {
        this.f59103b.b();
    }

    public final void c(u uVar) {
        g gVar = this.f59105d;
        if (uVar == null) {
            gVar.k(null);
        } else {
            gVar.k(new ad.u(uVar, 1));
        }
    }
}
