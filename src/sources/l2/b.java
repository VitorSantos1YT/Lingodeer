package l2;

import a0.b2;
import a0.o0;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.tbruyelle.rxpermissions3.BuildConfig;
import g2.y0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f39534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f39535c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39536d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39537e = g2.x.f28622i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f39538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g2.k f39540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public fz.c f39541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o0 f39542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f39543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f39544l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f39545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f39546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f39547p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f39548q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f39549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f39550s;

    public b() {
        int i11 = h0.f39633a;
        this.f39538f = ry.r.f50854a;
        this.f39539g = true;
        this.f39542j = new o0(this, 20);
        this.f39543k = BuildConfig.VERSION_NAME;
        this.f39546o = 1.0f;
        this.f39547p = 1.0f;
        this.f39550s = true;
    }

    @Override // l2.c0
    public final void a(i2.d dVar) {
        if (this.f39550s) {
            float[] fArrA = this.f39534b;
            if (fArrA == null) {
                fArrA = g2.k0.a();
                this.f39534b = fArrA;
            } else {
                g2.k0.d(fArrA);
            }
            g2.k0.f(fArrA, this.f39548q + this.m, this.f39549r + this.f39545n);
            float f5 = this.f39544l;
            if (fArrA.length >= 16) {
                double d5 = ((double) f5) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d5);
                float fCos = (float) Math.cos(d5);
                float f11 = fArrA[0];
                float f12 = fArrA[4];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = -fSin;
                float f15 = (f12 * fCos) + (f11 * f14);
                float f16 = fArrA[1];
                float f17 = fArrA[5];
                float f18 = (fSin * f17) + (fCos * f16);
                float f19 = (f17 * fCos) + (f16 * f14);
                float f21 = fArrA[2];
                float f22 = fArrA[6];
                float f23 = (fSin * f22) + (fCos * f21);
                float f24 = (f22 * fCos) + (f21 * f14);
                float f25 = fArrA[3];
                float f26 = fArrA[7];
                float f27 = (fSin * f26) + (fCos * f25);
                fArrA[0] = f13;
                fArrA[1] = f18;
                fArrA[2] = f23;
                fArrA[3] = f27;
                fArrA[4] = f15;
                fArrA[5] = f19;
                fArrA[6] = f24;
                fArrA[7] = (fCos * f26) + (f14 * f25);
            }
            float f28 = this.f39546o;
            float f29 = this.f39547p;
            if (fArrA.length >= 16) {
                fArrA[0] = fArrA[0] * f28;
                fArrA[1] = fArrA[1] * f28;
                fArrA[2] = fArrA[2] * f28;
                fArrA[3] = fArrA[3] * f28;
                fArrA[4] = fArrA[4] * f29;
                fArrA[5] = fArrA[5] * f29;
                fArrA[6] = fArrA[6] * f29;
                fArrA[7] = fArrA[7] * f29;
                fArrA[8] = fArrA[8] * 1.0f;
                fArrA[9] = fArrA[9] * 1.0f;
                fArrA[10] = fArrA[10] * 1.0f;
                fArrA[11] = fArrA[11] * 1.0f;
            }
            g2.k0.f(fArrA, -this.m, -this.f39545n);
            this.f39550s = false;
        }
        if (this.f39539g) {
            if (!this.f39538f.isEmpty()) {
                g2.k kVarA = this.f39540h;
                if (kVarA == null) {
                    kVarA = g2.o.a();
                    this.f39540h = kVarA;
                }
                a.e(this.f39538f, kVarA);
            }
            this.f39539g = false;
        }
        xq.c cVarJ0 = dVar.j0();
        long jH = cVarJ0.H();
        cVarJ0.x().e();
        try {
            b2 b2Var = (b2) cVarJ0.f56174b;
            float[] fArr = this.f39534b;
            if (fArr != null) {
                ((xq.c) b2Var.f27b).x().g(fArr);
            }
            g2.k kVar = this.f39540h;
            if (!this.f39538f.isEmpty() && kVar != null) {
                b2Var.c(kVar);
            }
            ArrayList arrayList = this.f39535c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((c0) arrayList.get(i11)).a(dVar);
            }
        } finally {
            com.google.android.material.datepicker.d.C(cVarJ0, jH);
        }
    }

    @Override // l2.c0
    public final fz.c b() {
        return this.f39541i;
    }

    @Override // l2.c0
    public final void d(o0 o0Var) {
        this.f39541i = o0Var;
    }

    public final void e(int i11, c0 c0Var) {
        ArrayList arrayList = this.f39535c;
        if (i11 < arrayList.size()) {
            arrayList.set(i11, c0Var);
        } else {
            arrayList.add(c0Var);
        }
        g(c0Var);
        c0Var.d(this.f39542j);
        c();
    }

    public final void f(long j11) {
        if (this.f39536d && j11 != 16) {
            long j12 = this.f39537e;
            if (j12 == 16) {
                this.f39537e = j11;
                return;
            }
            int i11 = h0.f39633a;
            if (g2.x.i(j12) == g2.x.i(j11) && g2.x.h(j12) == g2.x.h(j11) && g2.x.f(j12) == g2.x.f(j11)) {
                return;
            }
            this.f39536d = false;
            this.f39537e = g2.x.f28622i;
        }
    }

    public final void g(c0 c0Var) {
        if (!(c0Var instanceof h)) {
            if (c0Var instanceof b) {
                b bVar = (b) c0Var;
                if (bVar.f39536d && this.f39536d) {
                    f(bVar.f39537e);
                    return;
                } else {
                    this.f39536d = false;
                    this.f39537e = g2.x.f28622i;
                    return;
                }
            }
            return;
        }
        h hVar = (h) c0Var;
        g2.t tVar = hVar.f39614b;
        if (this.f39536d && tVar != null) {
            if (tVar instanceof y0) {
                f(((y0) tVar).f28628a);
            } else {
                this.f39536d = false;
                this.f39537e = g2.x.f28622i;
            }
        }
        g2.t tVar2 = hVar.f39619g;
        if (this.f39536d && tVar2 != null) {
            if (tVar2 instanceof y0) {
                f(((y0) tVar2).f28628a);
            } else {
                this.f39536d = false;
                this.f39537e = g2.x.f28622i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.f39543k);
        ArrayList arrayList = this.f39535c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c0 c0Var = (c0) arrayList.get(i11);
            sb2.append("\t");
            sb2.append(c0Var.toString());
            sb2.append(SemtNwfPgIhi.gyamGAIf);
        }
        return sb2.toString();
    }
}
