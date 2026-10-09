package d4;

import android.view.View;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import mf.sOm.txBUGYhC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class g {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public final d J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d[] R;
    public final ArrayList S;
    public final boolean[] T;
    public f[] U;
    public g V;
    public int W;
    public int X;
    public float Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f23117a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e4.c f23118b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f23119b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e4.c f23120c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f23121c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f23123d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f23125e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f23127f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f23129g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public View f23131h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f23133i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f23134j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f23135j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23136k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f23137k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23138l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f23139l0;
    public boolean m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f23140m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23141n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final float[] f23142n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23143o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final g[] f23144o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23145p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final g[] f23146p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f23147q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public g f23148q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23149r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public g f23150r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23151s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f23152s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f23153t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f23154t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f23155u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23156v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f23157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23158x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23159y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f23160z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23116a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e4.m f23122d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e4.p f23124e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f23126f = {true, true};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23128g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23130h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23132i = -1;

    public g() {
        new HashMap();
        this.f23136k = false;
        this.f23138l = false;
        this.m = false;
        this.f23141n = false;
        this.f23143o = -1;
        this.f23145p = -1;
        this.f23147q = 0;
        this.f23149r = 0;
        this.f23151s = 0;
        this.f23153t = new int[2];
        this.f23155u = 0;
        this.f23156v = 0;
        this.f23157w = 1.0f;
        this.f23158x = 0;
        this.f23159y = 0;
        this.f23160z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = Float.NaN;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        d dVar = new d(this, c.LEFT);
        this.J = dVar;
        d dVar2 = new d(this, c.TOP);
        this.K = dVar2;
        d dVar3 = new d(this, c.RIGHT);
        this.L = dVar3;
        d dVar4 = new d(this, c.BOTTOM);
        this.M = dVar4;
        d dVar5 = new d(this, c.BASELINE);
        this.N = dVar5;
        d dVar6 = new d(this, c.CENTER_X);
        this.O = dVar6;
        d dVar7 = new d(this, c.CENTER_Y);
        this.P = dVar7;
        d dVar8 = new d(this, c.CENTER);
        this.Q = dVar8;
        this.R = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.T = new boolean[2];
        f fVar = f.FIXED;
        this.U = new f[]{fVar, fVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = CropImageView.DEFAULT_ASPECT_RATIO;
        this.Z = -1;
        this.f23117a0 = 0;
        this.f23119b0 = 0;
        this.f23121c0 = 0;
        this.f23127f0 = 0.5f;
        this.f23129g0 = 0.5f;
        this.f23133i0 = 0;
        this.f23135j0 = false;
        this.f23137k0 = null;
        this.f23139l0 = 0;
        this.f23140m0 = 0;
        this.f23142n0 = new float[]{-1.0f, -1.0f};
        this.f23144o0 = new g[]{null, null};
        this.f23146p0 = new g[]{null, null};
        this.f23148q0 = null;
        this.f23150r0 = null;
        this.f23152s0 = -1;
        this.f23154t0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public static void H(int i11, int i12, String str, StringBuilder sb2) {
        if (i11 == i12) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i11);
        sb2.append(",\n");
    }

    public static void I(StringBuilder sb2, String str, float f5, float f11) {
        if (f5 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f5);
        sb2.append(",\n");
    }

    public static void p(StringBuilder sb2, String str, int i11, int i12, int i13, int i14, int i15, float f5, f fVar) {
        sb2.append(str);
        sb2.append(" :  {\n");
        String string = fVar.toString();
        if (!f.FIXED.toString().equals(string)) {
            com.google.android.material.datepicker.d.w(sb2, "      behavior", " :   ", string, ",\n");
        }
        H(i11, 0, "      size", sb2);
        H(i12, 0, "      min", sb2);
        H(i13, Integer.MAX_VALUE, "      max", sb2);
        H(i14, 0, "      matchMin", sb2);
        H(i15, 0, "      matchDef", sb2);
        I(sb2, "      matchPercent", f5, 1.0f);
        sb2.append("    },\n");
    }

    public static void q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f23111f == null) {
            return;
        }
        defpackage.e.C(sb2, "    ", str, " : [ '");
        sb2.append(dVar.f23111f);
        sb2.append("'");
        if (dVar.f23113h != Integer.MIN_VALUE || dVar.f23112g != 0) {
            sb2.append(",");
            sb2.append(dVar.f23112g);
            if (dVar.f23113h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f23113h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public final boolean A() {
        return this.f23128g && this.f23133i0 != 8;
    }

    public boolean B() {
        if (this.f23136k) {
            return true;
        }
        return this.J.f23108c && this.L.f23108c;
    }

    public boolean C() {
        if (this.f23138l) {
            return true;
        }
        return this.K.f23108c && this.M.f23108c;
    }

    public void D() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.V = null;
        this.D = Float.NaN;
        this.W = 0;
        this.X = 0;
        this.Y = CropImageView.DEFAULT_ASPECT_RATIO;
        this.Z = -1;
        this.f23117a0 = 0;
        this.f23119b0 = 0;
        this.f23121c0 = 0;
        this.f23123d0 = 0;
        this.f23125e0 = 0;
        this.f23127f0 = 0.5f;
        this.f23129g0 = 0.5f;
        f[] fVarArr = this.U;
        f fVar = f.FIXED;
        fVarArr[0] = fVar;
        fVarArr[1] = fVar;
        this.f23131h0 = null;
        this.f23133i0 = 0;
        this.f23139l0 = 0;
        this.f23140m0 = 0;
        float[] fArr = this.f23142n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f23143o = -1;
        this.f23145p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f23149r = 0;
        this.f23151s = 0;
        this.f23157w = 1.0f;
        this.f23160z = 1.0f;
        this.f23156v = Integer.MAX_VALUE;
        this.f23159y = Integer.MAX_VALUE;
        this.f23155u = 0;
        this.f23158x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f23126f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f23128g = true;
        int[] iArr2 = this.f23153t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f23130h = -1;
        this.f23132i = -1;
    }

    public final void E() {
        g gVar = this.V;
        if (gVar != null && (gVar instanceof h)) {
            ((h) gVar).getClass();
        }
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((d) arrayList.get(i11)).j();
        }
    }

    public final void F() {
        this.f23136k = false;
        this.f23138l = false;
        this.m = false;
        this.f23141n = false;
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            dVar.f23108c = false;
            dVar.f23107b = 0;
        }
    }

    public void G(xq.c cVar) {
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.Q.k();
        this.O.k();
        this.P.k();
    }

    public final void J(int i11) {
        this.f23121c0 = i11;
        this.E = i11 > 0;
    }

    public final void K(int i11, int i12) {
        if (this.f23136k) {
            return;
        }
        this.J.l(i11);
        this.L.l(i12);
        this.f23117a0 = i11;
        this.W = i12 - i11;
        this.f23136k = true;
    }

    public final void L(int i11, int i12) {
        if (this.f23138l) {
            return;
        }
        this.K.l(i11);
        this.M.l(i12);
        this.f23119b0 = i11;
        this.X = i12 - i11;
        if (this.E) {
            this.N.l(i11 + this.f23121c0);
        }
        this.f23138l = true;
    }

    public final void M(int i11) {
        this.X = i11;
        int i12 = this.f23125e0;
        if (i11 < i12) {
            this.X = i12;
        }
    }

    public final void N(f fVar) {
        this.U[0] = fVar;
    }

    public final void O(f fVar) {
        this.U[1] = fVar;
    }

    public final void P(int i11) {
        this.W = i11;
        int i12 = this.f23123d0;
        if (i11 < i12) {
            this.W = i12;
        }
    }

    public void Q(boolean z11, boolean z12) {
        int i11;
        int i12;
        e4.m mVar = this.f23122d;
        boolean z13 = z11 & mVar.f24832g;
        e4.p pVar = this.f23124e;
        boolean z14 = z12 & pVar.f24832g;
        int i13 = mVar.f24833h.f24805g;
        int i14 = pVar.f24833h.f24805g;
        int i15 = mVar.f24834i.f24805g;
        int i16 = pVar.f24834i.f24805g;
        int i17 = i16 - i14;
        if (i15 - i13 < 0 || i17 < 0 || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE || i16 == Integer.MIN_VALUE || i16 == Integer.MAX_VALUE) {
            i15 = 0;
            i16 = 0;
            i13 = 0;
            i14 = 0;
        }
        int i18 = i15 - i13;
        int i19 = i16 - i14;
        if (z13) {
            this.f23117a0 = i13;
        }
        if (z14) {
            this.f23119b0 = i14;
        }
        if (this.f23133i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z13) {
            if (this.U[0] == f.FIXED && i18 < (i12 = this.W)) {
                i18 = i12;
            }
            this.W = i18;
            int i21 = this.f23123d0;
            if (i18 < i21) {
                this.W = i21;
            }
        }
        if (z14) {
            if (this.U[1] == f.FIXED && i19 < (i11 = this.X)) {
                i19 = i11;
            }
            this.X = i19;
            int i22 = this.f23125e0;
            if (i19 < i22) {
                this.X = i22;
            }
        }
    }

    public void R(b4.c cVar, boolean z11) {
        int i11;
        int i12;
        e4.p pVar;
        e4.m mVar;
        cVar.getClass();
        int iN = b4.c.n(this.J);
        int iN2 = b4.c.n(this.K);
        int iN3 = b4.c.n(this.L);
        int iN4 = b4.c.n(this.M);
        if (z11 && (mVar = this.f23122d) != null) {
            e4.g gVar = mVar.f24833h;
            if (gVar.f24808j) {
                e4.g gVar2 = mVar.f24834i;
                if (gVar2.f24808j) {
                    iN = gVar.f24805g;
                    iN3 = gVar2.f24805g;
                }
            }
        }
        if (z11 && (pVar = this.f23124e) != null) {
            e4.g gVar3 = pVar.f24833h;
            if (gVar3.f24808j) {
                e4.g gVar4 = pVar.f24834i;
                if (gVar4.f24808j) {
                    iN2 = gVar3.f24805g;
                    iN4 = gVar4.f24805g;
                }
            }
        }
        int i13 = iN4 - iN2;
        if (iN3 - iN < 0 || i13 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i14 = iN3 - iN;
        int i15 = iN4 - iN2;
        this.f23117a0 = iN;
        this.f23119b0 = iN2;
        if (this.f23133i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        f[] fVarArr = this.U;
        f fVar = fVarArr[0];
        f fVar2 = f.FIXED;
        if (fVar == fVar2 && i14 < (i12 = this.W)) {
            i14 = i12;
        }
        if (fVarArr[1] == fVar2 && i15 < (i11 = this.X)) {
            i15 = i11;
        }
        this.W = i14;
        this.X = i15;
        int i16 = this.f23125e0;
        if (i15 < i16) {
            this.X = i16;
        }
        int i17 = this.f23123d0;
        if (i14 < i17) {
            this.W = i17;
        }
        int i18 = this.f23156v;
        if (i18 > 0 && fVar == f.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i18);
        }
        int i19 = this.f23159y;
        if (i19 > 0 && this.U[1] == f.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i19);
        }
        int i21 = this.W;
        if (i14 != i21) {
            this.f23130h = i21;
        }
        int i22 = this.X;
        if (i15 != i22) {
            this.f23132i = i22;
        }
    }

    public final void a(h hVar, b4.c cVar, HashSet hashSet, int i11, boolean z11) {
        if (z11) {
            if (!hashSet.contains(this)) {
                return;
            }
            n.b(hVar, cVar, this);
            hashSet.remove(this);
            b(cVar, hVar.X(64));
        }
        if (i11 == 0) {
            HashSet hashSet2 = this.J.f23106a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f23109d.a(hVar, cVar, hashSet, i11, true);
                }
            }
            HashSet hashSet3 = this.L.f23106a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f23109d.a(hVar, cVar, hashSet, i11, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.f23106a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f23109d.a(hVar, cVar, hashSet, i11, true);
            }
        }
        HashSet hashSet5 = this.M.f23106a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f23109d.a(hVar, cVar, hashSet, i11, true);
            }
        }
        HashSet hashSet6 = this.N.f23106a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f23109d.a(hVar, cVar, hashSet, i11, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x020b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0213  */
    /* JADX WARN: Code duplicated, block: B:131:0x021c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0222  */
    /* JADX WARN: Code duplicated, block: B:134:0x022d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0239  */
    /* JADX WARN: Code duplicated, block: B:138:0x0242  */
    /* JADX WARN: Code duplicated, block: B:148:0x0268  */
    /* JADX WARN: Code duplicated, block: B:160:0x0292  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:167:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:171:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:176:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:190:0x0305  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:255:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:262:0x03d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:263:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:275:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:279:0x0417  */
    /* JADX WARN: Code duplicated, block: B:281:0x041c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:283:0x0420  */
    /* JADX WARN: Code duplicated, block: B:286:0x0424  */
    /* JADX WARN: Code duplicated, block: B:290:0x042e  */
    /* JADX WARN: Code duplicated, block: B:293:0x043a  */
    /* JADX WARN: Code duplicated, block: B:296:0x0441  */
    /* JADX WARN: Code duplicated, block: B:298:0x0445  */
    /* JADX WARN: Code duplicated, block: B:301:0x045f  */
    /* JADX WARN: Code duplicated, block: B:320:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:336:0x054e  */
    /* JADX WARN: Code duplicated, block: B:352:0x059f  */
    /* JADX WARN: Code duplicated, block: B:355:0x05af  */
    /* JADX WARN: Code duplicated, block: B:357:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:394:0x0677  */
    /* JADX WARN: Code duplicated, block: B:396:0x067d  */
    /* JADX WARN: Code duplicated, block: B:398:0x0684  */
    /* JADX WARN: Code duplicated, block: B:399:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:402:0x06db  */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104  */
    /* JADX WARN: Code duplicated, block: B:70:0x0116  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x0130  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:85:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r59v0, types: [d4.g] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    public void b(b4.c cVar, boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        HashSet hashSet;
        g gVar;
        h hVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        g gVar2;
        h hVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr;
        d dVar;
        boolean[] zArr2;
        ?? r12;
        boolean z13;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        f fVar;
        f fVar2;
        boolean z14;
        f fVar3;
        boolean z15;
        float f5;
        int i24;
        int i25;
        b4.h hVar3;
        b4.h hVar4;
        int i26;
        int i27;
        int i28;
        boolean z16;
        int i29;
        boolean z17;
        f fVar4;
        f fVar5;
        boolean z18;
        d dVar2;
        d dVar3;
        b4.h hVar5;
        b4.h hVar6;
        f fVar6;
        ?? r19;
        ?? r9;
        ?? r11;
        int i30;
        b4.h hVar7;
        b4.h hVar8;
        b4.h hVar9;
        int i31;
        int i32;
        int i33;
        int i34;
        b4.h hVar10;
        ?? r27;
        e4.p pVar;
        e4.m mVar;
        int i35;
        int i36;
        int i37;
        ?? Y;
        boolean z19;
        e4.m mVar2;
        e4.p pVar2;
        boolean z20;
        b4.c cVar2 = cVar;
        d dVar4 = this.J;
        b4.h hVarK = cVar2.k(dVar4);
        d dVar5 = this.L;
        b4.h hVarK2 = cVar2.k(dVar5);
        d dVar6 = this.K;
        b4.h hVarK3 = cVar2.k(dVar6);
        d dVar7 = this.M;
        b4.h hVarK4 = cVar2.k(dVar7);
        d dVar8 = this.N;
        b4.h hVarK5 = cVar2.k(dVar8);
        g gVar3 = this.V;
        if (gVar3 != null) {
            f[] fVarArr = gVar3.U;
            i12 = 0;
            f fVar7 = fVarArr[0];
            f fVar8 = f.WRAP_CONTENT;
            i13 = fVar7 == fVar8 ? 1 : 0;
            i14 = fVarArr[1] == fVar8 ? 1 : 0;
            int i38 = this.f23147q;
            if (i38 != 1) {
                i11 = 1;
                if (i38 == 2) {
                    i13 = 0;
                } else if (i38 == 3) {
                }
            } else {
                i11 = 1;
                i14 = 0;
            }
            i15 = this.f23133i0;
            boolean[] zArr3 = this.T;
            i16 = i14;
            if (i15 != 8 && !this.f23135j0) {
                ArrayList arrayList = this.S;
                int size = arrayList.size();
                i17 = i13;
                int i39 = i12;
                while (true) {
                    if (i39 >= size) {
                        if (zArr3[i12] || zArr3[i11]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i40 = size;
                    HashSet hashSet2 = ((d) arrayList.get(i39)).f23106a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i39++;
                    size = i40;
                }
            } else {
                i17 = i13;
            }
            z12 = this.f23136k;
            if (z12 || this.f23138l) {
                if (z12) {
                    cVar2.d(hVarK, this.f23117a0);
                    cVar2.d(hVarK2, this.f23117a0 + this.W);
                    if (i17 != 0 && (gVar2 = this.V) != null) {
                        hVar2 = (h) gVar2;
                        weakReference3 = hVar2.L0;
                        if (weakReference3 != null || weakReference3.get() == null || dVar4.d() > ((d) hVar2.L0.get()).d()) {
                            hVar2.L0 = new WeakReference(dVar4);
                        }
                        weakReference4 = hVar2.N0;
                        if (weakReference4 != null || weakReference4.get() == null || dVar5.d() > ((d) hVar2.N0.get()).d()) {
                            hVar2.N0 = new WeakReference(dVar5);
                        }
                    }
                }
                if (this.f23138l) {
                    cVar2.d(hVarK3, this.f23119b0);
                    cVar2.d(hVarK4, this.f23119b0 + this.X);
                    hashSet = dVar8.f23106a;
                    if (hashSet != null && hashSet.size() > 0) {
                        cVar2.d(hVarK5, this.f23119b0 + this.f23121c0);
                    }
                    if (i16 != 0 && (gVar = this.V) != null) {
                        hVar = (h) gVar;
                        weakReference = hVar.K0;
                        if (weakReference != null || weakReference.get() == null || dVar6.d() > ((d) hVar.K0.get()).d()) {
                            hVar.K0 = new WeakReference(dVar6);
                        }
                        weakReference2 = hVar.M0;
                        if (weakReference2 != null || weakReference2.get() == null || dVar7.d() > ((d) hVar.M0.get()).d()) {
                            hVar.M0 = new WeakReference(dVar7);
                        }
                    }
                }
                if (this.f23136k && this.f23138l) {
                    ?? r13 = i12;
                    this.f23136k = r13;
                    this.f23138l = r13;
                    return;
                }
            }
            zArr = this.f23126f;
            if (z11 || (mVar2 = this.f23122d) == null || (pVar2 = this.f23124e) == null) {
                dVar = dVar8;
                zArr2 = zArr;
            } else {
                dVar = dVar8;
                e4.g gVar4 = mVar2.f24833h;
                zArr2 = zArr;
                if (gVar4.f24808j && mVar2.f24834i.f24808j && pVar2.f24833h.f24808j && pVar2.f24834i.f24808j) {
                    cVar2.d(hVarK, gVar4.f24805g);
                    cVar2.d(hVarK2, this.f23122d.f24834i.f24805g);
                    cVar2.d(hVarK3, this.f23124e.f24833h.f24805g);
                    cVar2.d(hVarK4, this.f23124e.f24834i.f24805g);
                    cVar2.d(hVarK5, this.f23124e.f24817k.f24805g);
                    if (this.V == null) {
                        z20 = false;
                    } else {
                        if (i17 != 0 && zArr2[0] && !y()) {
                            cVar2.f(cVar2.k(this.V.L), hVarK2, 0, 8);
                        }
                        if (i16 == 0 || !zArr2[i11] || z()) {
                            z20 = false;
                        } else {
                            z20 = false;
                            cVar2.f(cVar2.k(this.V.M), hVarK4, 0, 8);
                        }
                    }
                    this.f23136k = z20;
                    this.f23138l = z20;
                    return;
                }
            }
            if (this.V != null) {
                if (x(0)) {
                    ((h) this.V).S(this, 0);
                    int i41 = i11;
                    i37 = i41 == true ? 1 : 0;
                    Y = i41;
                } else {
                    i37 = i11;
                    Y = y();
                }
                if (x(i37)) {
                    ((h) this.V).S(this, i37);
                    z19 = true;
                } else {
                    z19 = z();
                }
                if (Y != 0 && i17 != 0 && this.f23133i0 != 8 && dVar4.f23111f == null && dVar5.f23111f == null) {
                    cVar2.f(cVar2.k(this.V.L), hVarK2, 0, 1);
                }
                if (!z19 && i16 != 0 && this.f23133i0 != 8 && dVar6.f23111f == null && dVar7.f23111f == null && dVar == null) {
                    cVar2.f(cVar2.k(this.V.M), hVarK4, 0, 1);
                }
                z13 = z19;
                r12 = Y;
            } else {
                dVar4 = dVar4;
                r12 = 0;
                z13 = false;
            }
            i18 = this.W;
            i19 = this.f23123d0;
            if (i18 >= i19) {
                i19 = i18;
            }
            i21 = this.X;
            i22 = this.f23125e0;
            if (i21 < i22) {
                i23 = i22;
            } else {
                i23 = i21;
            }
            f[] fVarArr2 = this.U;
            fVar = fVarArr2[0];
            fVar2 = f.MATCH_CONSTRAINT;
            if (fVar != fVar2) {
                z14 = true;
            } else {
                z14 = false;
            }
            fVar3 = fVarArr2[1];
            if (fVar3 != fVar2) {
                z15 = true;
            } else {
                z15 = false;
            }
            int i42 = this.Z;
            this.A = i42;
            f5 = this.Y;
            this.B = f5;
            i24 = this.f23149r;
            i25 = this.f23151s;
            if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
                hVar3 = hVarK4;
                if (this.f23133i0 != 8) {
                    if (fVar == fVar2 || i24 != 0) {
                        i27 = i24;
                    } else {
                        i27 = 3;
                    }
                    if (fVar3 == fVar2 || i25 != 0) {
                        i36 = i25;
                    } else {
                        i36 = 3;
                    }
                    if (fVar != fVar2 && fVar3 == fVar2) {
                        hVar4 = hVarK5;
                        if (i27 == 3 && i36 == 3) {
                            if (i42 == -1) {
                                if (z14 && !z15) {
                                    this.A = 0;
                                } else if (!z14 && z15) {
                                    this.A = 1;
                                    if (i42 == -1) {
                                        this.B = 1.0f / f5;
                                    }
                                }
                            }
                            if (this.A == 0 && (!dVar6.h() || !dVar7.h())) {
                                this.A = 1;
                            } else if (this.A == 1 && (!dVar4.h() || !dVar5.h())) {
                                this.A = 0;
                            }
                            if (this.A == -1 && (!dVar6.h() || !dVar7.h() || !dVar4.h() || !dVar5.h())) {
                                if (dVar6.h() && dVar7.h()) {
                                    this.A = 0;
                                } else if (dVar4.h() && dVar5.h()) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                            if (this.A == -1) {
                                int i43 = this.f23155u;
                                if (i43 > 0 && this.f23158x == 0) {
                                    this.A = 0;
                                } else if (i43 == 0 && this.f23158x > 0) {
                                    this.B = 1.0f / this.B;
                                    this.A = 1;
                                }
                            }
                        }
                        dVar = dVar;
                        i26 = i23;
                        z16 = true;
                        i28 = i36;
                        int[] iArr = this.f23153t;
                        iArr[0] = i27;
                        iArr[1] = i28;
                        if (z16) {
                            int i44 = this.A;
                            i29 = -1;
                            boolean z21 = i44 != 0 || i44 == -1;
                            if (z16 || !((i35 = this.A) == 1 || i35 == i29)) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            fVar4 = this.U[0];
                            fVar5 = f.WRAP_CONTENT;
                            if (fVar4 == fVar5 || !(this instanceof h)) {
                                z18 = false;
                            } else {
                                z18 = true;
                            }
                            if (z18) {
                                i19 = 0;
                            }
                            dVar2 = this.Q;
                            boolean z22 = !dVar2.h();
                            boolean z23 = zArr3[0];
                            boolean z24 = zArr3[1];
                            if (this.f23143o != 2 || this.f23136k) {
                                dVar3 = dVar;
                                hVar5 = hVarK;
                                hVar6 = hVarK2;
                                fVar6 = fVar5;
                                r19 = r12;
                                r9 = i17;
                                r11 = i16;
                                i30 = i27;
                            } else {
                                if (z11 && (mVar = this.f23122d) != null) {
                                    e4.g gVar5 = mVar.f24833h;
                                    if (gVar5.f24808j && mVar.f24834i.f24808j) {
                                        if (z11) {
                                            cVar2.d(hVarK, gVar5.f24805g);
                                            cVar2.d(hVarK2, this.f23122d.f24834i.f24805g);
                                            if (this.V != null && i17 != 0 && zArr2[0] && !y()) {
                                                cVar2.f(cVar2.k(this.V.L), hVarK2, 0, 8);
                                            }
                                        }
                                        dVar3 = dVar;
                                        hVar5 = hVarK;
                                        hVar6 = hVarK2;
                                        fVar6 = fVar5;
                                        r19 = r12;
                                        r9 = i17;
                                        r11 = i16;
                                        i30 = i27;
                                    }
                                }
                                g gVar6 = this.V;
                                b4.h hVarK6 = gVar6 != null ? cVar2.k(gVar6.L) : null;
                                g gVar7 = this.V;
                                b4.h hVarK7 = gVar7 != null ? cVar2.k(gVar7.J) : null;
                                boolean z25 = zArr2[0];
                                f[] fVarArr3 = this.U;
                                ?? r14 = i17;
                                i30 = i27;
                                f fVar9 = fVarArr3[0];
                                ?? r110 = r12;
                                int i45 = this.f23117a0;
                                int i46 = this.f23123d0;
                                int i47 = this.C[0];
                                float f11 = this.f23127f0;
                                boolean z26 = fVarArr3[1] == fVar2;
                                hVar6 = hVarK2;
                                hVar5 = hVarK;
                                ?? r15 = i16;
                                dVar3 = dVar;
                                fVar6 = fVar5;
                                cVar2 = cVar;
                                d(cVar2, true, r14, r15, z25, hVarK7, hVarK6, fVar9, z18, this.J, this.L, i45, i19, i46, i47, f11, z21, z26, r110, z13, z23, i30, i28, this.f23155u, this.f23156v, this.f23157w, z22);
                                r9 = r14;
                                r11 = r15;
                                r19 = r110;
                            }
                            if (z11 || (pVar = this.f23124e) == null) {
                                hVar7 = r32;
                                hVar8 = hVar3;
                                hVar9 = hVar4;
                                i31 = 0;
                                i32 = 8;
                                i33 = 1;
                                i34 = 1;
                            } else {
                                e4.g gVar8 = pVar.f24833h;
                                if (gVar8.f24808j && pVar.f24834i.f24808j) {
                                    int i48 = gVar8.f24805g;
                                    hVar7 = hVarK3;
                                    cVar2.d(hVar7, i48);
                                    hVar8 = hVar3;
                                    cVar2.d(hVar8, this.f23124e.f24834i.f24805g);
                                    hVar9 = hVar4;
                                    cVar2.d(hVar9, this.f23124e.f24817k.f24805g);
                                    g gVar9 = this.V;
                                    if (gVar9 == null || z13 || r11 == 0) {
                                        i31 = 0;
                                        i32 = 8;
                                        i33 = 1;
                                    } else {
                                        i33 = 1;
                                        if (zArr2[1]) {
                                            i31 = 0;
                                            i32 = 8;
                                            cVar2.f(cVar2.k(gVar9.M), hVar8, 0, 8);
                                        } else {
                                            i31 = 0;
                                            i32 = 8;
                                        }
                                    }
                                    i34 = i31;
                                } else {
                                    hVar7 = r32;
                                    hVar8 = hVar3;
                                    hVar9 = hVar4;
                                    i31 = 0;
                                    i32 = 8;
                                    i33 = 1;
                                    i34 = 1;
                                }
                            }
                            if (this.f23145p == 2) {
                                i34 = i31;
                            }
                            if (i34 != 0 || this.f23138l) {
                                hVar10 = hVar7;
                            } else {
                                int i49 = (this.U[i33] == fVar6 && (this instanceof h)) ? i33 : i31;
                                int i50 = i49 != 0 ? i31 : i26;
                                g gVar10 = this.V;
                                b4.h hVarK8 = gVar10 != null ? cVar2.k(gVar10.M) : null;
                                g gVar11 = this.V;
                                b4.h hVarK9 = gVar11 != null ? cVar2.k(gVar11.K) : null;
                                int i51 = this.f23121c0;
                                if (i51 > 0 || this.f23133i0 == i32) {
                                    r27 = z22;
                                    d dVar9 = dVar3;
                                    if (dVar9.f23111f != null) {
                                        cVar2.e(hVar9, hVar7, i51, i32);
                                        cVar2.e(hVar9, cVar2.k(dVar9.f23111f), dVar9.e(), i32);
                                        if (r11 != 0) {
                                            cVar2.f(hVarK8, cVar2.k(dVar7), i31, 5);
                                        }
                                        r27 = i31;
                                    } else if (this.f23133i0 == i32) {
                                        cVar2.e(hVar9, hVar7, dVar9.e(), i32);
                                        r27 = z22;
                                    } else {
                                        cVar2.e(hVar9, hVar7, i51, i32);
                                        r27 = z22;
                                    }
                                }
                                r27 = z22;
                                boolean z27 = zArr2[i33];
                                f[] fVarArr4 = this.U;
                                int i52 = i31;
                                int i53 = i33;
                                hVar10 = hVar7;
                                cVar2 = cVar;
                                d(cVar2, false, r11, r9, z27, hVarK9, hVarK8, fVarArr4[i33], i49, this.K, this.M, this.f23119b0, i50, this.f23125e0, this.C[i53], this.f23129g0, z17, fVarArr4[i52] == fVar2 ? i53 : i52, z13, r19, z24, i28, i30, this.f23158x, this.f23159y, this.f23160z, r27);
                            }
                            if (z16) {
                                if (this.A == 1) {
                                    float f12 = this.B;
                                    b4.b bVarL = cVar2.l();
                                    bVarL.f3890d.g(hVar8, -1.0f);
                                    bVarL.f3890d.g(hVar10, 1.0f);
                                    bVarL.f3890d.g(hVar6, f12);
                                    bVarL.f3890d.g(hVar5, -f12);
                                    cVar2.c(bVarL);
                                } else {
                                    float f13 = this.B;
                                    b4.b bVarL2 = cVar2.l();
                                    bVarL2.f3890d.g(hVar6, -1.0f);
                                    bVarL2.f3890d.g(hVar5, 1.0f);
                                    bVarL2.f3890d.g(hVar8, f13);
                                    bVarL2.f3890d.g(hVar10, -f13);
                                    cVar2.c(bVarL2);
                                }
                            }
                            if (dVar2.h()) {
                                g gVar12 = dVar2.f23111f.f23109d;
                                float radians = (float) Math.toRadians(this.D + 90.0f);
                                int iE = dVar2.e();
                                c cVar3 = c.LEFT;
                                b4.h hVarK10 = cVar2.k(j(cVar3));
                                c cVar4 = c.TOP;
                                b4.h hVarK11 = cVar2.k(j(cVar4));
                                c cVar5 = c.RIGHT;
                                b4.h hVarK12 = cVar2.k(j(cVar5));
                                c cVar6 = c.BOTTOM;
                                b4.h hVarK13 = cVar2.k(j(cVar6));
                                b4.h hVarK14 = cVar2.k(gVar12.j(cVar3));
                                b4.h hVarK15 = cVar2.k(gVar12.j(cVar4));
                                b4.h hVarK16 = cVar2.k(gVar12.j(cVar5));
                                b4.h hVarK17 = cVar2.k(gVar12.j(cVar6));
                                b4.b bVarL3 = cVar2.l();
                                double d5 = radians;
                                double dSin = Math.sin(d5);
                                double d11 = iE;
                                bVarL3.f3890d.g(hVarK15, 0.5f);
                                bVarL3.f3890d.g(hVarK17, 0.5f);
                                bVarL3.f3890d.g(hVarK11, -0.5f);
                                bVarL3.f3890d.g(hVarK13, -0.5f);
                                bVarL3.f3888b = -((float) (dSin * d11));
                                cVar2.c(bVarL3);
                                b4.b bVarL4 = cVar2.l();
                                float fCos = (float) (Math.cos(d5) * d11);
                                bVarL4.f3890d.g(hVarK14, 0.5f);
                                bVarL4.f3890d.g(hVarK16, 0.5f);
                                bVarL4.f3890d.g(hVarK10, -0.5f);
                                bVarL4.f3890d.g(hVarK12, -0.5f);
                                bVarL4.f3888b = -fCos;
                                cVar2.c(bVarL4);
                            }
                            this.f23136k = false;
                            this.f23138l = false;
                        }
                        i29 = -1;
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        fVar4 = this.U[0];
                        fVar5 = f.WRAP_CONTENT;
                        if (fVar4 == fVar5) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            i19 = 0;
                        }
                        dVar2 = this.Q;
                        boolean z28 = !dVar2.h();
                        boolean z29 = zArr3[0];
                        boolean z210 = zArr3[1];
                        if (this.f23143o != 2) {
                            dVar3 = dVar;
                            hVar5 = hVarK;
                            hVar6 = hVarK2;
                            fVar6 = fVar5;
                            r19 = r12;
                            r9 = i17;
                            r11 = i16;
                            i30 = i27;
                        } else {
                            dVar3 = dVar;
                            hVar5 = hVarK;
                            hVar6 = hVarK2;
                            fVar6 = fVar5;
                            r19 = r12;
                            r9 = i17;
                            r11 = i16;
                            i30 = i27;
                        }
                        if (z11) {
                            hVar7 = r32;
                            hVar8 = hVar3;
                            hVar9 = hVar4;
                            i31 = 0;
                            i32 = 8;
                            i33 = 1;
                            i34 = 1;
                        } else {
                            hVar7 = r32;
                            hVar8 = hVar3;
                            hVar9 = hVar4;
                            i31 = 0;
                            i32 = 8;
                            i33 = 1;
                            i34 = 1;
                        }
                        if (this.f23145p == 2) {
                            i34 = i31;
                        }
                        if (i34 != 0) {
                            hVar10 = hVar7;
                        } else {
                            hVar10 = hVar7;
                        }
                        if (z16) {
                            if (this.A == 1) {
                                float f14 = this.B;
                                b4.b bVarL5 = cVar2.l();
                                bVarL5.f3890d.g(hVar8, -1.0f);
                                bVarL5.f3890d.g(hVar10, 1.0f);
                                bVarL5.f3890d.g(hVar6, f14);
                                bVarL5.f3890d.g(hVar5, -f14);
                                cVar2.c(bVarL5);
                            } else {
                                float f15 = this.B;
                                b4.b bVarL6 = cVar2.l();
                                bVarL6.f3890d.g(hVar6, -1.0f);
                                bVarL6.f3890d.g(hVar5, 1.0f);
                                bVarL6.f3890d.g(hVar8, f15);
                                bVarL6.f3890d.g(hVar10, -f15);
                                cVar2.c(bVarL6);
                            }
                        }
                        if (dVar2.h()) {
                            g gVar13 = dVar2.f23111f.f23109d;
                            float radians2 = (float) Math.toRadians(this.D + 90.0f);
                            int iE2 = dVar2.e();
                            c cVar7 = c.LEFT;
                            b4.h hVarK18 = cVar2.k(j(cVar7));
                            c cVar8 = c.TOP;
                            b4.h hVarK19 = cVar2.k(j(cVar8));
                            c cVar9 = c.RIGHT;
                            b4.h hVarK110 = cVar2.k(j(cVar9));
                            c cVar10 = c.BOTTOM;
                            b4.h hVarK111 = cVar2.k(j(cVar10));
                            b4.h hVarK112 = cVar2.k(gVar13.j(cVar7));
                            b4.h hVarK113 = cVar2.k(gVar13.j(cVar8));
                            b4.h hVarK114 = cVar2.k(gVar13.j(cVar9));
                            b4.h hVarK115 = cVar2.k(gVar13.j(cVar10));
                            b4.b bVarL7 = cVar2.l();
                            double d12 = radians2;
                            double dSin2 = Math.sin(d12);
                            double d13 = iE2;
                            bVarL7.f3890d.g(hVarK113, 0.5f);
                            bVarL7.f3890d.g(hVarK115, 0.5f);
                            bVarL7.f3890d.g(hVarK19, -0.5f);
                            bVarL7.f3890d.g(hVarK111, -0.5f);
                            bVarL7.f3888b = -((float) (dSin2 * d13));
                            cVar2.c(bVarL7);
                            b4.b bVarL8 = cVar2.l();
                            float fCos2 = (float) (Math.cos(d12) * d13);
                            bVarL8.f3890d.g(hVarK112, 0.5f);
                            bVarL8.f3890d.g(hVarK114, 0.5f);
                            bVarL8.f3890d.g(hVarK18, -0.5f);
                            bVarL8.f3890d.g(hVarK110, -0.5f);
                            bVarL8.f3888b = -fCos2;
                            cVar2.c(bVarL8);
                        }
                        this.f23136k = false;
                        this.f23138l = false;
                    }
                    hVar4 = hVarK5;
                    if (fVar != fVar2 && i27 == 3) {
                        this.A = 0;
                        i19 = (int) (i21 * f5);
                        dVar = dVar;
                        i26 = i23;
                        if (fVar3 != fVar2) {
                            i27 = 4;
                            z16 = false;
                        }
                        i28 = i36;
                        int[] iArr2 = this.f23153t;
                        iArr2[0] = i27;
                        iArr2[1] = i28;
                        if (z16) {
                            int i410 = this.A;
                            i29 = -1;
                            if (i410 != 0) {
                            }
                            if (z16) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            fVar4 = this.U[0];
                            fVar5 = f.WRAP_CONTENT;
                            if (fVar4 == fVar5) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                i19 = 0;
                            }
                            dVar2 = this.Q;
                            boolean z211 = !dVar2.h();
                            boolean z212 = zArr3[0];
                            boolean z213 = zArr3[1];
                            if (this.f23143o != 2) {
                                dVar3 = dVar;
                                hVar5 = hVarK;
                                hVar6 = hVarK2;
                                fVar6 = fVar5;
                                r19 = r12;
                                r9 = i17;
                                r11 = i16;
                                i30 = i27;
                            } else {
                                dVar3 = dVar;
                                hVar5 = hVarK;
                                hVar6 = hVarK2;
                                fVar6 = fVar5;
                                r19 = r12;
                                r9 = i17;
                                r11 = i16;
                                i30 = i27;
                            }
                            if (z11) {
                                hVar7 = r32;
                                hVar8 = hVar3;
                                hVar9 = hVar4;
                                i31 = 0;
                                i32 = 8;
                                i33 = 1;
                                i34 = 1;
                            } else {
                                hVar7 = r32;
                                hVar8 = hVar3;
                                hVar9 = hVar4;
                                i31 = 0;
                                i32 = 8;
                                i33 = 1;
                                i34 = 1;
                            }
                            if (this.f23145p == 2) {
                                i34 = i31;
                            }
                            if (i34 != 0) {
                                hVar10 = hVar7;
                            } else {
                                hVar10 = hVar7;
                            }
                            if (z16) {
                                if (this.A == 1) {
                                    float f16 = this.B;
                                    b4.b bVarL9 = cVar2.l();
                                    bVarL9.f3890d.g(hVar8, -1.0f);
                                    bVarL9.f3890d.g(hVar10, 1.0f);
                                    bVarL9.f3890d.g(hVar6, f16);
                                    bVarL9.f3890d.g(hVar5, -f16);
                                    cVar2.c(bVarL9);
                                } else {
                                    float f17 = this.B;
                                    b4.b bVarL10 = cVar2.l();
                                    bVarL10.f3890d.g(hVar6, -1.0f);
                                    bVarL10.f3890d.g(hVar5, 1.0f);
                                    bVarL10.f3890d.g(hVar8, f17);
                                    bVarL10.f3890d.g(hVar10, -f17);
                                    cVar2.c(bVarL10);
                                }
                            }
                            if (dVar2.h()) {
                                g gVar14 = dVar2.f23111f.f23109d;
                                float radians3 = (float) Math.toRadians(this.D + 90.0f);
                                int iE3 = dVar2.e();
                                c cVar11 = c.LEFT;
                                b4.h hVarK116 = cVar2.k(j(cVar11));
                                c cVar12 = c.TOP;
                                b4.h hVarK117 = cVar2.k(j(cVar12));
                                c cVar13 = c.RIGHT;
                                b4.h hVarK118 = cVar2.k(j(cVar13));
                                c cVar14 = c.BOTTOM;
                                b4.h hVarK119 = cVar2.k(j(cVar14));
                                b4.h hVarK1110 = cVar2.k(gVar14.j(cVar11));
                                b4.h hVarK1111 = cVar2.k(gVar14.j(cVar12));
                                b4.h hVarK1112 = cVar2.k(gVar14.j(cVar13));
                                b4.h hVarK1113 = cVar2.k(gVar14.j(cVar14));
                                b4.b bVarL11 = cVar2.l();
                                double d14 = radians3;
                                double dSin3 = Math.sin(d14);
                                double d15 = iE3;
                                bVarL11.f3890d.g(hVarK1111, 0.5f);
                                bVarL11.f3890d.g(hVarK1113, 0.5f);
                                bVarL11.f3890d.g(hVarK117, -0.5f);
                                bVarL11.f3890d.g(hVarK119, -0.5f);
                                bVarL11.f3888b = -((float) (dSin3 * d15));
                                cVar2.c(bVarL11);
                                b4.b bVarL12 = cVar2.l();
                                float fCos3 = (float) (Math.cos(d14) * d15);
                                bVarL12.f3890d.g(hVarK1110, 0.5f);
                                bVarL12.f3890d.g(hVarK1112, 0.5f);
                                bVarL12.f3890d.g(hVarK116, -0.5f);
                                bVarL12.f3890d.g(hVarK118, -0.5f);
                                bVarL12.f3888b = -fCos3;
                                cVar2.c(bVarL12);
                            }
                            this.f23136k = false;
                            this.f23138l = false;
                        }
                        i29 = -1;
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        fVar4 = this.U[0];
                        fVar5 = f.WRAP_CONTENT;
                        if (fVar4 == fVar5) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            i19 = 0;
                        }
                        dVar2 = this.Q;
                        boolean z214 = !dVar2.h();
                        boolean z215 = zArr3[0];
                        boolean z216 = zArr3[1];
                        if (this.f23143o != 2) {
                            dVar3 = dVar;
                            hVar5 = hVarK;
                            hVar6 = hVarK2;
                            fVar6 = fVar5;
                            r19 = r12;
                            r9 = i17;
                            r11 = i16;
                            i30 = i27;
                        } else {
                            dVar3 = dVar;
                            hVar5 = hVarK;
                            hVar6 = hVarK2;
                            fVar6 = fVar5;
                            r19 = r12;
                            r9 = i17;
                            r11 = i16;
                            i30 = i27;
                        }
                        if (z11) {
                            hVar7 = r32;
                            hVar8 = hVar3;
                            hVar9 = hVar4;
                            i31 = 0;
                            i32 = 8;
                            i33 = 1;
                            i34 = 1;
                        } else {
                            hVar7 = r32;
                            hVar8 = hVar3;
                            hVar9 = hVar4;
                            i31 = 0;
                            i32 = 8;
                            i33 = 1;
                            i34 = 1;
                        }
                        if (this.f23145p == 2) {
                            i34 = i31;
                        }
                        if (i34 != 0) {
                            hVar10 = hVar7;
                        } else {
                            hVar10 = hVar7;
                        }
                        if (z16) {
                            if (this.A == 1) {
                                float f18 = this.B;
                                b4.b bVarL13 = cVar2.l();
                                bVarL13.f3890d.g(hVar8, -1.0f);
                                bVarL13.f3890d.g(hVar10, 1.0f);
                                bVarL13.f3890d.g(hVar6, f18);
                                bVarL13.f3890d.g(hVar5, -f18);
                                cVar2.c(bVarL13);
                            } else {
                                float f19 = this.B;
                                b4.b bVarL14 = cVar2.l();
                                bVarL14.f3890d.g(hVar6, -1.0f);
                                bVarL14.f3890d.g(hVar5, 1.0f);
                                bVarL14.f3890d.g(hVar8, f19);
                                bVarL14.f3890d.g(hVar10, -f19);
                                cVar2.c(bVarL14);
                            }
                        }
                        if (dVar2.h()) {
                            g gVar15 = dVar2.f23111f.f23109d;
                            float radians4 = (float) Math.toRadians(this.D + 90.0f);
                            int iE4 = dVar2.e();
                            c cVar15 = c.LEFT;
                            b4.h hVarK1114 = cVar2.k(j(cVar15));
                            c cVar16 = c.TOP;
                            b4.h hVarK1115 = cVar2.k(j(cVar16));
                            c cVar17 = c.RIGHT;
                            b4.h hVarK1116 = cVar2.k(j(cVar17));
                            c cVar18 = c.BOTTOM;
                            b4.h hVarK1117 = cVar2.k(j(cVar18));
                            b4.h hVarK1118 = cVar2.k(gVar15.j(cVar15));
                            b4.h hVarK1119 = cVar2.k(gVar15.j(cVar16));
                            b4.h hVarK11110 = cVar2.k(gVar15.j(cVar17));
                            b4.h hVarK11111 = cVar2.k(gVar15.j(cVar18));
                            b4.b bVarL15 = cVar2.l();
                            double d16 = radians4;
                            double dSin4 = Math.sin(d16);
                            double d17 = iE4;
                            bVarL15.f3890d.g(hVarK1119, 0.5f);
                            bVarL15.f3890d.g(hVarK11111, 0.5f);
                            bVarL15.f3890d.g(hVarK1115, -0.5f);
                            bVarL15.f3890d.g(hVarK1117, -0.5f);
                            bVarL15.f3888b = -((float) (dSin4 * d17));
                            cVar2.c(bVarL15);
                            b4.b bVarL16 = cVar2.l();
                            float fCos4 = (float) (Math.cos(d16) * d17);
                            bVarL16.f3890d.g(hVarK1118, 0.5f);
                            bVarL16.f3890d.g(hVarK11110, 0.5f);
                            bVarL16.f3890d.g(hVarK1114, -0.5f);
                            bVarL16.f3890d.g(hVarK1116, -0.5f);
                            bVarL16.f3888b = -fCos4;
                            cVar2.c(bVarL16);
                        }
                        this.f23136k = false;
                        this.f23138l = false;
                    }
                    if (fVar3 == fVar2 || i36 != 3) {
                        dVar = dVar;
                        i26 = i23;
                    } else {
                        this.A = 1;
                        if (i42 == -1) {
                            this.B = 1.0f / f5;
                        }
                        i26 = (int) (this.B * i18);
                        if (fVar != fVar2) {
                            i28 = 4;
                        } else {
                            dVar = dVar;
                        }
                    }
                    z16 = true;
                    i28 = i36;
                    int[] iArr3 = this.f23153t;
                    iArr3[0] = i27;
                    iArr3[1] = i28;
                    if (z16) {
                        int i411 = this.A;
                        i29 = -1;
                        if (i411 != 0) {
                        }
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        fVar4 = this.U[0];
                        fVar5 = f.WRAP_CONTENT;
                        if (fVar4 == fVar5) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            i19 = 0;
                        }
                        dVar2 = this.Q;
                        boolean z217 = !dVar2.h();
                        boolean z218 = zArr3[0];
                        boolean z219 = zArr3[1];
                        if (this.f23143o != 2) {
                            dVar3 = dVar;
                            hVar5 = hVarK;
                            hVar6 = hVarK2;
                            fVar6 = fVar5;
                            r19 = r12;
                            r9 = i17;
                            r11 = i16;
                            i30 = i27;
                        } else {
                            dVar3 = dVar;
                            hVar5 = hVarK;
                            hVar6 = hVarK2;
                            fVar6 = fVar5;
                            r19 = r12;
                            r9 = i17;
                            r11 = i16;
                            i30 = i27;
                        }
                        if (z11) {
                            hVar7 = r32;
                            hVar8 = hVar3;
                            hVar9 = hVar4;
                            i31 = 0;
                            i32 = 8;
                            i33 = 1;
                            i34 = 1;
                        } else {
                            hVar7 = r32;
                            hVar8 = hVar3;
                            hVar9 = hVar4;
                            i31 = 0;
                            i32 = 8;
                            i33 = 1;
                            i34 = 1;
                        }
                        if (this.f23145p == 2) {
                            i34 = i31;
                        }
                        if (i34 != 0) {
                            hVar10 = hVar7;
                        } else {
                            hVar10 = hVar7;
                        }
                        if (z16) {
                            if (this.A == 1) {
                                float f110 = this.B;
                                b4.b bVarL17 = cVar2.l();
                                bVarL17.f3890d.g(hVar8, -1.0f);
                                bVarL17.f3890d.g(hVar10, 1.0f);
                                bVarL17.f3890d.g(hVar6, f110);
                                bVarL17.f3890d.g(hVar5, -f110);
                                cVar2.c(bVarL17);
                            } else {
                                float f111 = this.B;
                                b4.b bVarL18 = cVar2.l();
                                bVarL18.f3890d.g(hVar6, -1.0f);
                                bVarL18.f3890d.g(hVar5, 1.0f);
                                bVarL18.f3890d.g(hVar8, f111);
                                bVarL18.f3890d.g(hVar10, -f111);
                                cVar2.c(bVarL18);
                            }
                        }
                        if (dVar2.h()) {
                            g gVar16 = dVar2.f23111f.f23109d;
                            float radians5 = (float) Math.toRadians(this.D + 90.0f);
                            int iE5 = dVar2.e();
                            c cVar19 = c.LEFT;
                            b4.h hVarK11112 = cVar2.k(j(cVar19));
                            c cVar110 = c.TOP;
                            b4.h hVarK11113 = cVar2.k(j(cVar110));
                            c cVar111 = c.RIGHT;
                            b4.h hVarK11114 = cVar2.k(j(cVar111));
                            c cVar112 = c.BOTTOM;
                            b4.h hVarK11115 = cVar2.k(j(cVar112));
                            b4.h hVarK11116 = cVar2.k(gVar16.j(cVar19));
                            b4.h hVarK11117 = cVar2.k(gVar16.j(cVar110));
                            b4.h hVarK11118 = cVar2.k(gVar16.j(cVar111));
                            b4.h hVarK11119 = cVar2.k(gVar16.j(cVar112));
                            b4.b bVarL19 = cVar2.l();
                            double d18 = radians5;
                            double dSin5 = Math.sin(d18);
                            double d19 = iE5;
                            bVarL19.f3890d.g(hVarK11117, 0.5f);
                            bVarL19.f3890d.g(hVarK11119, 0.5f);
                            bVarL19.f3890d.g(hVarK11113, -0.5f);
                            bVarL19.f3890d.g(hVarK11115, -0.5f);
                            bVarL19.f3888b = -((float) (dSin5 * d19));
                            cVar2.c(bVarL19);
                            b4.b bVarL110 = cVar2.l();
                            float fCos5 = (float) (Math.cos(d18) * d19);
                            bVarL110.f3890d.g(hVarK11116, 0.5f);
                            bVarL110.f3890d.g(hVarK11118, 0.5f);
                            bVarL110.f3890d.g(hVarK11112, -0.5f);
                            bVarL110.f3890d.g(hVarK11114, -0.5f);
                            bVarL110.f3888b = -fCos5;
                            cVar2.c(bVarL110);
                        }
                        this.f23136k = false;
                        this.f23138l = false;
                    }
                    i29 = -1;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    fVar4 = this.U[0];
                    fVar5 = f.WRAP_CONTENT;
                    if (fVar4 == fVar5) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i19 = 0;
                    }
                    dVar2 = this.Q;
                    boolean z2110 = !dVar2.h();
                    boolean z2111 = zArr3[0];
                    boolean z2112 = zArr3[1];
                    if (this.f23143o != 2) {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    } else {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    }
                    if (z11) {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    } else {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    }
                    if (this.f23145p == 2) {
                        i34 = i31;
                    }
                    if (i34 != 0) {
                        hVar10 = hVar7;
                    } else {
                        hVar10 = hVar7;
                    }
                    if (z16) {
                        if (this.A == 1) {
                            float f112 = this.B;
                            b4.b bVarL111 = cVar2.l();
                            bVarL111.f3890d.g(hVar8, -1.0f);
                            bVarL111.f3890d.g(hVar10, 1.0f);
                            bVarL111.f3890d.g(hVar6, f112);
                            bVarL111.f3890d.g(hVar5, -f112);
                            cVar2.c(bVarL111);
                        } else {
                            float f113 = this.B;
                            b4.b bVarL112 = cVar2.l();
                            bVarL112.f3890d.g(hVar6, -1.0f);
                            bVarL112.f3890d.g(hVar5, 1.0f);
                            bVarL112.f3890d.g(hVar8, f113);
                            bVarL112.f3890d.g(hVar10, -f113);
                            cVar2.c(bVarL112);
                        }
                    }
                    if (dVar2.h()) {
                        g gVar17 = dVar2.f23111f.f23109d;
                        float radians6 = (float) Math.toRadians(this.D + 90.0f);
                        int iE6 = dVar2.e();
                        c cVar113 = c.LEFT;
                        b4.h hVarK111110 = cVar2.k(j(cVar113));
                        c cVar114 = c.TOP;
                        b4.h hVarK111111 = cVar2.k(j(cVar114));
                        c cVar115 = c.RIGHT;
                        b4.h hVarK111112 = cVar2.k(j(cVar115));
                        c cVar116 = c.BOTTOM;
                        b4.h hVarK111113 = cVar2.k(j(cVar116));
                        b4.h hVarK111114 = cVar2.k(gVar17.j(cVar113));
                        b4.h hVarK111115 = cVar2.k(gVar17.j(cVar114));
                        b4.h hVarK111116 = cVar2.k(gVar17.j(cVar115));
                        b4.h hVarK111117 = cVar2.k(gVar17.j(cVar116));
                        b4.b bVarL113 = cVar2.l();
                        double d110 = radians6;
                        double dSin6 = Math.sin(d110);
                        double d111 = iE6;
                        bVarL113.f3890d.g(hVarK111115, 0.5f);
                        bVarL113.f3890d.g(hVarK111117, 0.5f);
                        bVarL113.f3890d.g(hVarK111111, -0.5f);
                        bVarL113.f3890d.g(hVarK111113, -0.5f);
                        bVarL113.f3888b = -((float) (dSin6 * d111));
                        cVar2.c(bVarL113);
                        b4.b bVarL114 = cVar2.l();
                        float fCos6 = (float) (Math.cos(d110) * d111);
                        bVarL114.f3890d.g(hVarK111114, 0.5f);
                        bVarL114.f3890d.g(hVarK111116, 0.5f);
                        bVarL114.f3890d.g(hVarK111110, -0.5f);
                        bVarL114.f3890d.g(hVarK111112, -0.5f);
                        bVarL114.f3888b = -fCos6;
                        cVar2.c(bVarL114);
                    }
                    this.f23136k = false;
                    this.f23138l = false;
                }
                z16 = false;
                int[] iArr4 = this.f23153t;
                iArr4[0] = i27;
                iArr4[1] = i28;
                if (z16) {
                    int i412 = this.A;
                    i29 = -1;
                    if (i412 != 0) {
                    }
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    fVar4 = this.U[0];
                    fVar5 = f.WRAP_CONTENT;
                    if (fVar4 == fVar5) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i19 = 0;
                    }
                    dVar2 = this.Q;
                    boolean z2113 = !dVar2.h();
                    boolean z2114 = zArr3[0];
                    boolean z2115 = zArr3[1];
                    if (this.f23143o != 2) {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    } else {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    }
                    if (z11) {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    } else {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    }
                    if (this.f23145p == 2) {
                        i34 = i31;
                    }
                    if (i34 != 0) {
                        hVar10 = hVar7;
                    } else {
                        hVar10 = hVar7;
                    }
                    if (z16) {
                        if (this.A == 1) {
                            float f114 = this.B;
                            b4.b bVarL115 = cVar2.l();
                            bVarL115.f3890d.g(hVar8, -1.0f);
                            bVarL115.f3890d.g(hVar10, 1.0f);
                            bVarL115.f3890d.g(hVar6, f114);
                            bVarL115.f3890d.g(hVar5, -f114);
                            cVar2.c(bVarL115);
                        } else {
                            float f115 = this.B;
                            b4.b bVarL116 = cVar2.l();
                            bVarL116.f3890d.g(hVar6, -1.0f);
                            bVarL116.f3890d.g(hVar5, 1.0f);
                            bVarL116.f3890d.g(hVar8, f115);
                            bVarL116.f3890d.g(hVar10, -f115);
                            cVar2.c(bVarL116);
                        }
                    }
                    if (dVar2.h()) {
                        g gVar18 = dVar2.f23111f.f23109d;
                        float radians7 = (float) Math.toRadians(this.D + 90.0f);
                        int iE7 = dVar2.e();
                        c cVar117 = c.LEFT;
                        b4.h hVarK111118 = cVar2.k(j(cVar117));
                        c cVar118 = c.TOP;
                        b4.h hVarK111119 = cVar2.k(j(cVar118));
                        c cVar119 = c.RIGHT;
                        b4.h hVarK1111110 = cVar2.k(j(cVar119));
                        c cVar1110 = c.BOTTOM;
                        b4.h hVarK1111111 = cVar2.k(j(cVar1110));
                        b4.h hVarK1111112 = cVar2.k(gVar18.j(cVar117));
                        b4.h hVarK1111113 = cVar2.k(gVar18.j(cVar118));
                        b4.h hVarK1111114 = cVar2.k(gVar18.j(cVar119));
                        b4.h hVarK1111115 = cVar2.k(gVar18.j(cVar1110));
                        b4.b bVarL117 = cVar2.l();
                        double d112 = radians7;
                        double dSin7 = Math.sin(d112);
                        double d113 = iE7;
                        bVarL117.f3890d.g(hVarK1111113, 0.5f);
                        bVarL117.f3890d.g(hVarK1111115, 0.5f);
                        bVarL117.f3890d.g(hVarK111119, -0.5f);
                        bVarL117.f3890d.g(hVarK1111111, -0.5f);
                        bVarL117.f3888b = -((float) (dSin7 * d113));
                        cVar2.c(bVarL117);
                        b4.b bVarL118 = cVar2.l();
                        float fCos7 = (float) (Math.cos(d112) * d113);
                        bVarL118.f3890d.g(hVarK1111112, 0.5f);
                        bVarL118.f3890d.g(hVarK1111114, 0.5f);
                        bVarL118.f3890d.g(hVarK111118, -0.5f);
                        bVarL118.f3890d.g(hVarK1111110, -0.5f);
                        bVarL118.f3888b = -fCos7;
                        cVar2.c(bVarL118);
                    }
                    this.f23136k = false;
                    this.f23138l = false;
                }
                i29 = -1;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                fVar4 = this.U[0];
                fVar5 = f.WRAP_CONTENT;
                if (fVar4 == fVar5) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i19 = 0;
                }
                dVar2 = this.Q;
                boolean z2116 = !dVar2.h();
                boolean z2117 = zArr3[0];
                boolean z2118 = zArr3[1];
                if (this.f23143o != 2) {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                } else {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                }
                if (z11) {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                } else {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                }
                if (this.f23145p == 2) {
                    i34 = i31;
                }
                if (i34 != 0) {
                    hVar10 = hVar7;
                } else {
                    hVar10 = hVar7;
                }
                if (z16) {
                    if (this.A == 1) {
                        float f116 = this.B;
                        b4.b bVarL119 = cVar2.l();
                        bVarL119.f3890d.g(hVar8, -1.0f);
                        bVarL119.f3890d.g(hVar10, 1.0f);
                        bVarL119.f3890d.g(hVar6, f116);
                        bVarL119.f3890d.g(hVar5, -f116);
                        cVar2.c(bVarL119);
                    } else {
                        float f117 = this.B;
                        b4.b bVarL1110 = cVar2.l();
                        bVarL1110.f3890d.g(hVar6, -1.0f);
                        bVarL1110.f3890d.g(hVar5, 1.0f);
                        bVarL1110.f3890d.g(hVar8, f117);
                        bVarL1110.f3890d.g(hVar10, -f117);
                        cVar2.c(bVarL1110);
                    }
                }
                if (dVar2.h()) {
                    g gVar19 = dVar2.f23111f.f23109d;
                    float radians8 = (float) Math.toRadians(this.D + 90.0f);
                    int iE8 = dVar2.e();
                    c cVar1111 = c.LEFT;
                    b4.h hVarK1111116 = cVar2.k(j(cVar1111));
                    c cVar1112 = c.TOP;
                    b4.h hVarK1111117 = cVar2.k(j(cVar1112));
                    c cVar1113 = c.RIGHT;
                    b4.h hVarK1111118 = cVar2.k(j(cVar1113));
                    c cVar1114 = c.BOTTOM;
                    b4.h hVarK1111119 = cVar2.k(j(cVar1114));
                    b4.h hVarK11111110 = cVar2.k(gVar19.j(cVar1111));
                    b4.h hVarK11111111 = cVar2.k(gVar19.j(cVar1112));
                    b4.h hVarK11111112 = cVar2.k(gVar19.j(cVar1113));
                    b4.h hVarK11111113 = cVar2.k(gVar19.j(cVar1114));
                    b4.b bVarL1111 = cVar2.l();
                    double d114 = radians8;
                    double dSin8 = Math.sin(d114);
                    double d115 = iE8;
                    bVarL1111.f3890d.g(hVarK11111111, 0.5f);
                    bVarL1111.f3890d.g(hVarK11111113, 0.5f);
                    bVarL1111.f3890d.g(hVarK1111117, -0.5f);
                    bVarL1111.f3890d.g(hVarK1111119, -0.5f);
                    bVarL1111.f3888b = -((float) (dSin8 * d115));
                    cVar2.c(bVarL1111);
                    b4.b bVarL1112 = cVar2.l();
                    float fCos8 = (float) (Math.cos(d114) * d115);
                    bVarL1112.f3890d.g(hVarK11111110, 0.5f);
                    bVarL1112.f3890d.g(hVarK11111112, 0.5f);
                    bVarL1112.f3890d.g(hVarK1111116, -0.5f);
                    bVarL1112.f3890d.g(hVarK1111118, -0.5f);
                    bVarL1112.f3888b = -fCos8;
                    cVar2.c(bVarL1112);
                }
                this.f23136k = false;
                this.f23138l = false;
            }
            hVar3 = hVarK4;
            hVar4 = hVarK5;
            i26 = i23;
            i27 = i24;
            i28 = i25;
            z16 = false;
            int[] iArr5 = this.f23153t;
            iArr5[0] = i27;
            iArr5[1] = i28;
            if (z16) {
                int i413 = this.A;
                i29 = -1;
                if (i413 != 0) {
                }
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                fVar4 = this.U[0];
                fVar5 = f.WRAP_CONTENT;
                if (fVar4 == fVar5) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i19 = 0;
                }
                dVar2 = this.Q;
                boolean z2119 = !dVar2.h();
                boolean z21110 = zArr3[0];
                boolean z21111 = zArr3[1];
                if (this.f23143o != 2) {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                } else {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                }
                if (z11) {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                } else {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                }
                if (this.f23145p == 2) {
                    i34 = i31;
                }
                if (i34 != 0) {
                    hVar10 = hVar7;
                } else {
                    hVar10 = hVar7;
                }
                if (z16) {
                    if (this.A == 1) {
                        float f118 = this.B;
                        b4.b bVarL1113 = cVar2.l();
                        bVarL1113.f3890d.g(hVar8, -1.0f);
                        bVarL1113.f3890d.g(hVar10, 1.0f);
                        bVarL1113.f3890d.g(hVar6, f118);
                        bVarL1113.f3890d.g(hVar5, -f118);
                        cVar2.c(bVarL1113);
                    } else {
                        float f119 = this.B;
                        b4.b bVarL1114 = cVar2.l();
                        bVarL1114.f3890d.g(hVar6, -1.0f);
                        bVarL1114.f3890d.g(hVar5, 1.0f);
                        bVarL1114.f3890d.g(hVar8, f119);
                        bVarL1114.f3890d.g(hVar10, -f119);
                        cVar2.c(bVarL1114);
                    }
                }
                if (dVar2.h()) {
                    g gVar110 = dVar2.f23111f.f23109d;
                    float radians9 = (float) Math.toRadians(this.D + 90.0f);
                    int iE9 = dVar2.e();
                    c cVar1115 = c.LEFT;
                    b4.h hVarK11111114 = cVar2.k(j(cVar1115));
                    c cVar1116 = c.TOP;
                    b4.h hVarK11111115 = cVar2.k(j(cVar1116));
                    c cVar1117 = c.RIGHT;
                    b4.h hVarK11111116 = cVar2.k(j(cVar1117));
                    c cVar1118 = c.BOTTOM;
                    b4.h hVarK11111117 = cVar2.k(j(cVar1118));
                    b4.h hVarK11111118 = cVar2.k(gVar110.j(cVar1115));
                    b4.h hVarK11111119 = cVar2.k(gVar110.j(cVar1116));
                    b4.h hVarK111111110 = cVar2.k(gVar110.j(cVar1117));
                    b4.h hVarK111111111 = cVar2.k(gVar110.j(cVar1118));
                    b4.b bVarL1115 = cVar2.l();
                    double d116 = radians9;
                    double dSin9 = Math.sin(d116);
                    double d117 = iE9;
                    bVarL1115.f3890d.g(hVarK11111119, 0.5f);
                    bVarL1115.f3890d.g(hVarK111111111, 0.5f);
                    bVarL1115.f3890d.g(hVarK11111115, -0.5f);
                    bVarL1115.f3890d.g(hVarK11111117, -0.5f);
                    bVarL1115.f3888b = -((float) (dSin9 * d117));
                    cVar2.c(bVarL1115);
                    b4.b bVarL1116 = cVar2.l();
                    float fCos9 = (float) (Math.cos(d116) * d117);
                    bVarL1116.f3890d.g(hVarK11111118, 0.5f);
                    bVarL1116.f3890d.g(hVarK111111110, 0.5f);
                    bVarL1116.f3890d.g(hVarK11111114, -0.5f);
                    bVarL1116.f3890d.g(hVarK11111116, -0.5f);
                    bVarL1116.f3888b = -fCos9;
                    cVar2.c(bVarL1116);
                }
                this.f23136k = false;
                this.f23138l = false;
            }
            i29 = -1;
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            fVar4 = this.U[0];
            fVar5 = f.WRAP_CONTENT;
            if (fVar4 == fVar5) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z18) {
                i19 = 0;
            }
            dVar2 = this.Q;
            boolean z21112 = !dVar2.h();
            boolean z21113 = zArr3[0];
            boolean z21114 = zArr3[1];
            if (this.f23143o != 2) {
                dVar3 = dVar;
                hVar5 = hVarK;
                hVar6 = hVarK2;
                fVar6 = fVar5;
                r19 = r12;
                r9 = i17;
                r11 = i16;
                i30 = i27;
            } else {
                dVar3 = dVar;
                hVar5 = hVarK;
                hVar6 = hVarK2;
                fVar6 = fVar5;
                r19 = r12;
                r9 = i17;
                r11 = i16;
                i30 = i27;
            }
            if (z11) {
                hVar7 = r32;
                hVar8 = hVar3;
                hVar9 = hVar4;
                i31 = 0;
                i32 = 8;
                i33 = 1;
                i34 = 1;
            } else {
                hVar7 = r32;
                hVar8 = hVar3;
                hVar9 = hVar4;
                i31 = 0;
                i32 = 8;
                i33 = 1;
                i34 = 1;
            }
            if (this.f23145p == 2) {
                i34 = i31;
            }
            if (i34 != 0) {
                hVar10 = hVar7;
            } else {
                hVar10 = hVar7;
            }
            if (z16) {
                if (this.A == 1) {
                    float f1110 = this.B;
                    b4.b bVarL1117 = cVar2.l();
                    bVarL1117.f3890d.g(hVar8, -1.0f);
                    bVarL1117.f3890d.g(hVar10, 1.0f);
                    bVarL1117.f3890d.g(hVar6, f1110);
                    bVarL1117.f3890d.g(hVar5, -f1110);
                    cVar2.c(bVarL1117);
                } else {
                    float f1111 = this.B;
                    b4.b bVarL1118 = cVar2.l();
                    bVarL1118.f3890d.g(hVar6, -1.0f);
                    bVarL1118.f3890d.g(hVar5, 1.0f);
                    bVarL1118.f3890d.g(hVar8, f1111);
                    bVarL1118.f3890d.g(hVar10, -f1111);
                    cVar2.c(bVarL1118);
                }
            }
            if (dVar2.h()) {
                g gVar111 = dVar2.f23111f.f23109d;
                float radians10 = (float) Math.toRadians(this.D + 90.0f);
                int iE10 = dVar2.e();
                c cVar1119 = c.LEFT;
                b4.h hVarK111111112 = cVar2.k(j(cVar1119));
                c cVar11110 = c.TOP;
                b4.h hVarK111111113 = cVar2.k(j(cVar11110));
                c cVar11111 = c.RIGHT;
                b4.h hVarK111111114 = cVar2.k(j(cVar11111));
                c cVar11112 = c.BOTTOM;
                b4.h hVarK111111115 = cVar2.k(j(cVar11112));
                b4.h hVarK111111116 = cVar2.k(gVar111.j(cVar1119));
                b4.h hVarK111111117 = cVar2.k(gVar111.j(cVar11110));
                b4.h hVarK111111118 = cVar2.k(gVar111.j(cVar11111));
                b4.h hVarK111111119 = cVar2.k(gVar111.j(cVar11112));
                b4.b bVarL1119 = cVar2.l();
                double d118 = radians10;
                double dSin10 = Math.sin(d118);
                double d119 = iE10;
                bVarL1119.f3890d.g(hVarK111111117, 0.5f);
                bVarL1119.f3890d.g(hVarK111111119, 0.5f);
                bVarL1119.f3890d.g(hVarK111111113, -0.5f);
                bVarL1119.f3890d.g(hVarK111111115, -0.5f);
                bVarL1119.f3888b = -((float) (dSin10 * d119));
                cVar2.c(bVarL1119);
                b4.b bVarL11110 = cVar2.l();
                float fCos10 = (float) (Math.cos(d118) * d119);
                bVarL11110.f3890d.g(hVarK111111116, 0.5f);
                bVarL11110.f3890d.g(hVarK111111118, 0.5f);
                bVarL11110.f3890d.g(hVarK111111112, -0.5f);
                bVarL11110.f3890d.g(hVarK111111114, -0.5f);
                bVarL11110.f3888b = -fCos10;
                cVar2.c(bVarL11110);
            }
            this.f23136k = false;
            this.f23138l = false;
        }
        i11 = 1;
        i12 = 0;
        i14 = i12;
        i13 = i14;
        i15 = this.f23133i0;
        boolean[] zArr4 = this.T;
        i16 = i14;
        if (i15 != 8) {
            i17 = i13;
        } else {
            i17 = i13;
        }
        z12 = this.f23136k;
        if (z12) {
            if (z12) {
                cVar2.d(hVarK, this.f23117a0);
                cVar2.d(hVarK2, this.f23117a0 + this.W);
                if (i17 != 0) {
                    hVar2 = (h) gVar2;
                    weakReference3 = hVar2.L0;
                    if (weakReference3 != null) {
                        hVar2.L0 = new WeakReference(dVar4);
                    } else {
                        hVar2.L0 = new WeakReference(dVar4);
                    }
                    weakReference4 = hVar2.N0;
                    if (weakReference4 != null) {
                        hVar2.N0 = new WeakReference(dVar5);
                    } else {
                        hVar2.N0 = new WeakReference(dVar5);
                    }
                }
            }
            if (this.f23138l) {
                cVar2.d(hVarK3, this.f23119b0);
                cVar2.d(hVarK4, this.f23119b0 + this.X);
                hashSet = dVar8.f23106a;
                if (hashSet != null) {
                    cVar2.d(hVarK5, this.f23119b0 + this.f23121c0);
                }
                if (i16 != 0) {
                    hVar = (h) gVar;
                    weakReference = hVar.K0;
                    if (weakReference != null) {
                        hVar.K0 = new WeakReference(dVar6);
                    } else {
                        hVar.K0 = new WeakReference(dVar6);
                    }
                    weakReference2 = hVar.M0;
                    if (weakReference2 != null) {
                        hVar.M0 = new WeakReference(dVar7);
                    } else {
                        hVar.M0 = new WeakReference(dVar7);
                    }
                }
            }
            if (this.f23136k) {
                ?? r16 = i12;
                this.f23136k = r16;
                this.f23138l = r16;
                return;
            }
        } else {
            if (z12) {
                cVar2.d(hVarK, this.f23117a0);
                cVar2.d(hVarK2, this.f23117a0 + this.W);
                if (i17 != 0) {
                    hVar2 = (h) gVar2;
                    weakReference3 = hVar2.L0;
                    if (weakReference3 != null) {
                        hVar2.L0 = new WeakReference(dVar4);
                    } else {
                        hVar2.L0 = new WeakReference(dVar4);
                    }
                    weakReference4 = hVar2.N0;
                    if (weakReference4 != null) {
                        hVar2.N0 = new WeakReference(dVar5);
                    } else {
                        hVar2.N0 = new WeakReference(dVar5);
                    }
                }
            }
            if (this.f23138l) {
                cVar2.d(hVarK3, this.f23119b0);
                cVar2.d(hVarK4, this.f23119b0 + this.X);
                hashSet = dVar8.f23106a;
                if (hashSet != null) {
                    cVar2.d(hVarK5, this.f23119b0 + this.f23121c0);
                }
                if (i16 != 0) {
                    hVar = (h) gVar;
                    weakReference = hVar.K0;
                    if (weakReference != null) {
                        hVar.K0 = new WeakReference(dVar6);
                    } else {
                        hVar.K0 = new WeakReference(dVar6);
                    }
                    weakReference2 = hVar.M0;
                    if (weakReference2 != null) {
                        hVar.M0 = new WeakReference(dVar7);
                    } else {
                        hVar.M0 = new WeakReference(dVar7);
                    }
                }
            }
            if (this.f23136k) {
                ?? r17 = i12;
                this.f23136k = r17;
                this.f23138l = r17;
                return;
            }
        }
        zArr = this.f23126f;
        if (z11) {
            dVar = dVar8;
            zArr2 = zArr;
        } else {
            dVar = dVar8;
            zArr2 = zArr;
        }
        if (this.V != null) {
            if (x(0)) {
                ((h) this.V).S(this, 0);
                int i414 = i11;
                i37 = i414 == true ? 1 : 0;
                Y = i414;
            } else {
                i37 = i11;
                Y = y();
            }
            if (x(i37)) {
                ((h) this.V).S(this, i37);
                z19 = true;
            } else {
                z19 = z();
            }
            if (Y != 0) {
            }
            if (!z19) {
                cVar2.f(cVar2.k(this.V.M), hVarK4, 0, 1);
            }
            z13 = z19;
            r12 = Y;
        } else {
            dVar4 = dVar4;
            r12 = 0;
            z13 = false;
        }
        i18 = this.W;
        i19 = this.f23123d0;
        if (i18 >= i19) {
            i19 = i18;
        }
        i21 = this.X;
        i22 = this.f23125e0;
        if (i21 < i22) {
            i23 = i22;
        } else {
            i23 = i21;
        }
        f[] fVarArr5 = this.U;
        fVar = fVarArr5[0];
        fVar2 = f.MATCH_CONSTRAINT;
        if (fVar != fVar2) {
            z14 = true;
        } else {
            z14 = false;
        }
        fVar3 = fVarArr5[1];
        if (fVar3 != fVar2) {
            z15 = true;
        } else {
            z15 = false;
        }
        int i415 = this.Z;
        this.A = i415;
        f5 = this.Y;
        this.B = f5;
        i24 = this.f23149r;
        i25 = this.f23151s;
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO) {
            hVar3 = hVarK4;
            if (this.f23133i0 != 8) {
                if (fVar == fVar2) {
                    i27 = i24;
                } else {
                    i27 = i24;
                }
                if (fVar3 == fVar2) {
                    i36 = i25;
                } else {
                    i36 = i25;
                }
                if (fVar != fVar2) {
                    hVar4 = hVarK5;
                    if (fVar != fVar2) {
                        if (fVar3 == fVar2) {
                        }
                        z16 = true;
                    } else {
                        if (fVar3 == fVar2) {
                        }
                        z16 = true;
                    }
                    i28 = i36;
                    int[] iArr6 = this.f23153t;
                    iArr6[0] = i27;
                    iArr6[1] = i28;
                    if (z16) {
                        int i416 = this.A;
                        i29 = -1;
                        if (i416 != 0) {
                        }
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        fVar4 = this.U[0];
                        fVar5 = f.WRAP_CONTENT;
                        if (fVar4 == fVar5) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            i19 = 0;
                        }
                        dVar2 = this.Q;
                        boolean z21115 = !dVar2.h();
                        boolean z21116 = zArr4[0];
                        boolean z21117 = zArr4[1];
                        if (this.f23143o != 2) {
                            dVar3 = dVar;
                            hVar5 = hVarK;
                            hVar6 = hVarK2;
                            fVar6 = fVar5;
                            r19 = r12;
                            r9 = i17;
                            r11 = i16;
                            i30 = i27;
                        } else {
                            dVar3 = dVar;
                            hVar5 = hVarK;
                            hVar6 = hVarK2;
                            fVar6 = fVar5;
                            r19 = r12;
                            r9 = i17;
                            r11 = i16;
                            i30 = i27;
                        }
                        if (z11) {
                            hVar7 = r32;
                            hVar8 = hVar3;
                            hVar9 = hVar4;
                            i31 = 0;
                            i32 = 8;
                            i33 = 1;
                            i34 = 1;
                        } else {
                            hVar7 = r32;
                            hVar8 = hVar3;
                            hVar9 = hVar4;
                            i31 = 0;
                            i32 = 8;
                            i33 = 1;
                            i34 = 1;
                        }
                        if (this.f23145p == 2) {
                            i34 = i31;
                        }
                        if (i34 != 0) {
                            hVar10 = hVar7;
                        } else {
                            hVar10 = hVar7;
                        }
                        if (z16) {
                            if (this.A == 1) {
                                float f1112 = this.B;
                                b4.b bVarL11111 = cVar2.l();
                                bVarL11111.f3890d.g(hVar8, -1.0f);
                                bVarL11111.f3890d.g(hVar10, 1.0f);
                                bVarL11111.f3890d.g(hVar6, f1112);
                                bVarL11111.f3890d.g(hVar5, -f1112);
                                cVar2.c(bVarL11111);
                            } else {
                                float f1113 = this.B;
                                b4.b bVarL11112 = cVar2.l();
                                bVarL11112.f3890d.g(hVar6, -1.0f);
                                bVarL11112.f3890d.g(hVar5, 1.0f);
                                bVarL11112.f3890d.g(hVar8, f1113);
                                bVarL11112.f3890d.g(hVar10, -f1113);
                                cVar2.c(bVarL11112);
                            }
                        }
                        if (dVar2.h()) {
                            g gVar112 = dVar2.f23111f.f23109d;
                            float radians11 = (float) Math.toRadians(this.D + 90.0f);
                            int iE11 = dVar2.e();
                            c cVar11113 = c.LEFT;
                            b4.h hVarK1111111110 = cVar2.k(j(cVar11113));
                            c cVar11114 = c.TOP;
                            b4.h hVarK1111111111 = cVar2.k(j(cVar11114));
                            c cVar11115 = c.RIGHT;
                            b4.h hVarK1111111112 = cVar2.k(j(cVar11115));
                            c cVar11116 = c.BOTTOM;
                            b4.h hVarK1111111113 = cVar2.k(j(cVar11116));
                            b4.h hVarK1111111114 = cVar2.k(gVar112.j(cVar11113));
                            b4.h hVarK1111111115 = cVar2.k(gVar112.j(cVar11114));
                            b4.h hVarK1111111116 = cVar2.k(gVar112.j(cVar11115));
                            b4.h hVarK1111111117 = cVar2.k(gVar112.j(cVar11116));
                            b4.b bVarL11113 = cVar2.l();
                            double d1110 = radians11;
                            double dSin11 = Math.sin(d1110);
                            double d1111 = iE11;
                            bVarL11113.f3890d.g(hVarK1111111115, 0.5f);
                            bVarL11113.f3890d.g(hVarK1111111117, 0.5f);
                            bVarL11113.f3890d.g(hVarK1111111111, -0.5f);
                            bVarL11113.f3890d.g(hVarK1111111113, -0.5f);
                            bVarL11113.f3888b = -((float) (dSin11 * d1111));
                            cVar2.c(bVarL11113);
                            b4.b bVarL11114 = cVar2.l();
                            float fCos11 = (float) (Math.cos(d1110) * d1111);
                            bVarL11114.f3890d.g(hVarK1111111114, 0.5f);
                            bVarL11114.f3890d.g(hVarK1111111116, 0.5f);
                            bVarL11114.f3890d.g(hVarK1111111110, -0.5f);
                            bVarL11114.f3890d.g(hVarK1111111112, -0.5f);
                            bVarL11114.f3888b = -fCos11;
                            cVar2.c(bVarL11114);
                        }
                        this.f23136k = false;
                        this.f23138l = false;
                    }
                    i29 = -1;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    fVar4 = this.U[0];
                    fVar5 = f.WRAP_CONTENT;
                    if (fVar4 == fVar5) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i19 = 0;
                    }
                    dVar2 = this.Q;
                    boolean z21118 = !dVar2.h();
                    boolean z21119 = zArr4[0];
                    boolean z211110 = zArr4[1];
                    if (this.f23143o != 2) {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    } else {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    }
                    if (z11) {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    } else {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    }
                    if (this.f23145p == 2) {
                        i34 = i31;
                    }
                    if (i34 != 0) {
                        hVar10 = hVar7;
                    } else {
                        hVar10 = hVar7;
                    }
                    if (z16) {
                        if (this.A == 1) {
                            float f1114 = this.B;
                            b4.b bVarL11115 = cVar2.l();
                            bVarL11115.f3890d.g(hVar8, -1.0f);
                            bVarL11115.f3890d.g(hVar10, 1.0f);
                            bVarL11115.f3890d.g(hVar6, f1114);
                            bVarL11115.f3890d.g(hVar5, -f1114);
                            cVar2.c(bVarL11115);
                        } else {
                            float f1115 = this.B;
                            b4.b bVarL11116 = cVar2.l();
                            bVarL11116.f3890d.g(hVar6, -1.0f);
                            bVarL11116.f3890d.g(hVar5, 1.0f);
                            bVarL11116.f3890d.g(hVar8, f1115);
                            bVarL11116.f3890d.g(hVar10, -f1115);
                            cVar2.c(bVarL11116);
                        }
                    }
                    if (dVar2.h()) {
                        g gVar113 = dVar2.f23111f.f23109d;
                        float radians12 = (float) Math.toRadians(this.D + 90.0f);
                        int iE12 = dVar2.e();
                        c cVar11117 = c.LEFT;
                        b4.h hVarK1111111118 = cVar2.k(j(cVar11117));
                        c cVar11118 = c.TOP;
                        b4.h hVarK1111111119 = cVar2.k(j(cVar11118));
                        c cVar11119 = c.RIGHT;
                        b4.h hVarK11111111110 = cVar2.k(j(cVar11119));
                        c cVar111110 = c.BOTTOM;
                        b4.h hVarK11111111111 = cVar2.k(j(cVar111110));
                        b4.h hVarK11111111112 = cVar2.k(gVar113.j(cVar11117));
                        b4.h hVarK11111111113 = cVar2.k(gVar113.j(cVar11118));
                        b4.h hVarK11111111114 = cVar2.k(gVar113.j(cVar11119));
                        b4.h hVarK11111111115 = cVar2.k(gVar113.j(cVar111110));
                        b4.b bVarL11117 = cVar2.l();
                        double d1112 = radians12;
                        double dSin12 = Math.sin(d1112);
                        double d1113 = iE12;
                        bVarL11117.f3890d.g(hVarK11111111113, 0.5f);
                        bVarL11117.f3890d.g(hVarK11111111115, 0.5f);
                        bVarL11117.f3890d.g(hVarK1111111119, -0.5f);
                        bVarL11117.f3890d.g(hVarK11111111111, -0.5f);
                        bVarL11117.f3888b = -((float) (dSin12 * d1113));
                        cVar2.c(bVarL11117);
                        b4.b bVarL11118 = cVar2.l();
                        float fCos12 = (float) (Math.cos(d1112) * d1113);
                        bVarL11118.f3890d.g(hVarK11111111112, 0.5f);
                        bVarL11118.f3890d.g(hVarK11111111114, 0.5f);
                        bVarL11118.f3890d.g(hVarK1111111118, -0.5f);
                        bVarL11118.f3890d.g(hVarK11111111110, -0.5f);
                        bVarL11118.f3888b = -fCos12;
                        cVar2.c(bVarL11118);
                    }
                    this.f23136k = false;
                    this.f23138l = false;
                }
                hVar4 = hVarK5;
                if (fVar != fVar2) {
                    if (fVar3 == fVar2) {
                    }
                    z16 = true;
                } else {
                    if (fVar3 == fVar2) {
                    }
                    z16 = true;
                }
                i28 = i36;
                int[] iArr7 = this.f23153t;
                iArr7[0] = i27;
                iArr7[1] = i28;
                if (z16) {
                    int i417 = this.A;
                    i29 = -1;
                    if (i417 != 0) {
                    }
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    fVar4 = this.U[0];
                    fVar5 = f.WRAP_CONTENT;
                    if (fVar4 == fVar5) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i19 = 0;
                    }
                    dVar2 = this.Q;
                    boolean z211111 = !dVar2.h();
                    boolean z211112 = zArr4[0];
                    boolean z211113 = zArr4[1];
                    if (this.f23143o != 2) {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    } else {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    }
                    if (z11) {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    } else {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    }
                    if (this.f23145p == 2) {
                        i34 = i31;
                    }
                    if (i34 != 0) {
                        hVar10 = hVar7;
                    } else {
                        hVar10 = hVar7;
                    }
                    if (z16) {
                        if (this.A == 1) {
                            float f1116 = this.B;
                            b4.b bVarL11119 = cVar2.l();
                            bVarL11119.f3890d.g(hVar8, -1.0f);
                            bVarL11119.f3890d.g(hVar10, 1.0f);
                            bVarL11119.f3890d.g(hVar6, f1116);
                            bVarL11119.f3890d.g(hVar5, -f1116);
                            cVar2.c(bVarL11119);
                        } else {
                            float f1117 = this.B;
                            b4.b bVarL111110 = cVar2.l();
                            bVarL111110.f3890d.g(hVar6, -1.0f);
                            bVarL111110.f3890d.g(hVar5, 1.0f);
                            bVarL111110.f3890d.g(hVar8, f1117);
                            bVarL111110.f3890d.g(hVar10, -f1117);
                            cVar2.c(bVarL111110);
                        }
                    }
                    if (dVar2.h()) {
                        g gVar114 = dVar2.f23111f.f23109d;
                        float radians13 = (float) Math.toRadians(this.D + 90.0f);
                        int iE13 = dVar2.e();
                        c cVar111111 = c.LEFT;
                        b4.h hVarK11111111116 = cVar2.k(j(cVar111111));
                        c cVar111112 = c.TOP;
                        b4.h hVarK11111111117 = cVar2.k(j(cVar111112));
                        c cVar111113 = c.RIGHT;
                        b4.h hVarK11111111118 = cVar2.k(j(cVar111113));
                        c cVar111114 = c.BOTTOM;
                        b4.h hVarK11111111119 = cVar2.k(j(cVar111114));
                        b4.h hVarK111111111110 = cVar2.k(gVar114.j(cVar111111));
                        b4.h hVarK111111111111 = cVar2.k(gVar114.j(cVar111112));
                        b4.h hVarK111111111112 = cVar2.k(gVar114.j(cVar111113));
                        b4.h hVarK111111111113 = cVar2.k(gVar114.j(cVar111114));
                        b4.b bVarL111111 = cVar2.l();
                        double d1114 = radians13;
                        double dSin13 = Math.sin(d1114);
                        double d1115 = iE13;
                        bVarL111111.f3890d.g(hVarK111111111111, 0.5f);
                        bVarL111111.f3890d.g(hVarK111111111113, 0.5f);
                        bVarL111111.f3890d.g(hVarK11111111117, -0.5f);
                        bVarL111111.f3890d.g(hVarK11111111119, -0.5f);
                        bVarL111111.f3888b = -((float) (dSin13 * d1115));
                        cVar2.c(bVarL111111);
                        b4.b bVarL111112 = cVar2.l();
                        float fCos13 = (float) (Math.cos(d1114) * d1115);
                        bVarL111112.f3890d.g(hVarK111111111110, 0.5f);
                        bVarL111112.f3890d.g(hVarK111111111112, 0.5f);
                        bVarL111112.f3890d.g(hVarK11111111116, -0.5f);
                        bVarL111112.f3890d.g(hVarK11111111118, -0.5f);
                        bVarL111112.f3888b = -fCos13;
                        cVar2.c(bVarL111112);
                    }
                    this.f23136k = false;
                    this.f23138l = false;
                }
                i29 = -1;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                fVar4 = this.U[0];
                fVar5 = f.WRAP_CONTENT;
                if (fVar4 == fVar5) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i19 = 0;
                }
                dVar2 = this.Q;
                boolean z211114 = !dVar2.h();
                boolean z211115 = zArr4[0];
                boolean z211116 = zArr4[1];
                if (this.f23143o != 2) {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                } else {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                }
                if (z11) {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                } else {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                }
                if (this.f23145p == 2) {
                    i34 = i31;
                }
                if (i34 != 0) {
                    hVar10 = hVar7;
                } else {
                    hVar10 = hVar7;
                }
                if (z16) {
                    if (this.A == 1) {
                        float f1118 = this.B;
                        b4.b bVarL111113 = cVar2.l();
                        bVarL111113.f3890d.g(hVar8, -1.0f);
                        bVarL111113.f3890d.g(hVar10, 1.0f);
                        bVarL111113.f3890d.g(hVar6, f1118);
                        bVarL111113.f3890d.g(hVar5, -f1118);
                        cVar2.c(bVarL111113);
                    } else {
                        float f1119 = this.B;
                        b4.b bVarL111114 = cVar2.l();
                        bVarL111114.f3890d.g(hVar6, -1.0f);
                        bVarL111114.f3890d.g(hVar5, 1.0f);
                        bVarL111114.f3890d.g(hVar8, f1119);
                        bVarL111114.f3890d.g(hVar10, -f1119);
                        cVar2.c(bVarL111114);
                    }
                }
                if (dVar2.h()) {
                    g gVar115 = dVar2.f23111f.f23109d;
                    float radians14 = (float) Math.toRadians(this.D + 90.0f);
                    int iE14 = dVar2.e();
                    c cVar111115 = c.LEFT;
                    b4.h hVarK111111111114 = cVar2.k(j(cVar111115));
                    c cVar111116 = c.TOP;
                    b4.h hVarK111111111115 = cVar2.k(j(cVar111116));
                    c cVar111117 = c.RIGHT;
                    b4.h hVarK111111111116 = cVar2.k(j(cVar111117));
                    c cVar111118 = c.BOTTOM;
                    b4.h hVarK111111111117 = cVar2.k(j(cVar111118));
                    b4.h hVarK111111111118 = cVar2.k(gVar115.j(cVar111115));
                    b4.h hVarK111111111119 = cVar2.k(gVar115.j(cVar111116));
                    b4.h hVarK1111111111110 = cVar2.k(gVar115.j(cVar111117));
                    b4.h hVarK1111111111111 = cVar2.k(gVar115.j(cVar111118));
                    b4.b bVarL111115 = cVar2.l();
                    double d1116 = radians14;
                    double dSin14 = Math.sin(d1116);
                    double d1117 = iE14;
                    bVarL111115.f3890d.g(hVarK111111111119, 0.5f);
                    bVarL111115.f3890d.g(hVarK1111111111111, 0.5f);
                    bVarL111115.f3890d.g(hVarK111111111115, -0.5f);
                    bVarL111115.f3890d.g(hVarK111111111117, -0.5f);
                    bVarL111115.f3888b = -((float) (dSin14 * d1117));
                    cVar2.c(bVarL111115);
                    b4.b bVarL111116 = cVar2.l();
                    float fCos14 = (float) (Math.cos(d1116) * d1117);
                    bVarL111116.f3890d.g(hVarK111111111118, 0.5f);
                    bVarL111116.f3890d.g(hVarK1111111111110, 0.5f);
                    bVarL111116.f3890d.g(hVarK111111111114, -0.5f);
                    bVarL111116.f3890d.g(hVarK111111111116, -0.5f);
                    bVarL111116.f3888b = -fCos14;
                    cVar2.c(bVarL111116);
                }
                this.f23136k = false;
                this.f23138l = false;
                dVar = dVar;
                i26 = i23;
                z16 = true;
                i28 = i36;
                int[] iArr8 = this.f23153t;
                iArr8[0] = i27;
                iArr8[1] = i28;
                if (z16) {
                    int i418 = this.A;
                    i29 = -1;
                    if (i418 != 0) {
                    }
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    fVar4 = this.U[0];
                    fVar5 = f.WRAP_CONTENT;
                    if (fVar4 == fVar5) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i19 = 0;
                    }
                    dVar2 = this.Q;
                    boolean z211117 = !dVar2.h();
                    boolean z211118 = zArr4[0];
                    boolean z211119 = zArr4[1];
                    if (this.f23143o != 2) {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    } else {
                        dVar3 = dVar;
                        hVar5 = hVarK;
                        hVar6 = hVarK2;
                        fVar6 = fVar5;
                        r19 = r12;
                        r9 = i17;
                        r11 = i16;
                        i30 = i27;
                    }
                    if (z11) {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    } else {
                        hVar7 = r32;
                        hVar8 = hVar3;
                        hVar9 = hVar4;
                        i31 = 0;
                        i32 = 8;
                        i33 = 1;
                        i34 = 1;
                    }
                    if (this.f23145p == 2) {
                        i34 = i31;
                    }
                    if (i34 != 0) {
                        hVar10 = hVar7;
                    } else {
                        hVar10 = hVar7;
                    }
                    if (z16) {
                        if (this.A == 1) {
                            float f11110 = this.B;
                            b4.b bVarL111117 = cVar2.l();
                            bVarL111117.f3890d.g(hVar8, -1.0f);
                            bVarL111117.f3890d.g(hVar10, 1.0f);
                            bVarL111117.f3890d.g(hVar6, f11110);
                            bVarL111117.f3890d.g(hVar5, -f11110);
                            cVar2.c(bVarL111117);
                        } else {
                            float f11111 = this.B;
                            b4.b bVarL111118 = cVar2.l();
                            bVarL111118.f3890d.g(hVar6, -1.0f);
                            bVarL111118.f3890d.g(hVar5, 1.0f);
                            bVarL111118.f3890d.g(hVar8, f11111);
                            bVarL111118.f3890d.g(hVar10, -f11111);
                            cVar2.c(bVarL111118);
                        }
                    }
                    if (dVar2.h()) {
                        g gVar116 = dVar2.f23111f.f23109d;
                        float radians15 = (float) Math.toRadians(this.D + 90.0f);
                        int iE15 = dVar2.e();
                        c cVar111119 = c.LEFT;
                        b4.h hVarK1111111111112 = cVar2.k(j(cVar111119));
                        c cVar1111110 = c.TOP;
                        b4.h hVarK1111111111113 = cVar2.k(j(cVar1111110));
                        c cVar1111111 = c.RIGHT;
                        b4.h hVarK1111111111114 = cVar2.k(j(cVar1111111));
                        c cVar1111112 = c.BOTTOM;
                        b4.h hVarK1111111111115 = cVar2.k(j(cVar1111112));
                        b4.h hVarK1111111111116 = cVar2.k(gVar116.j(cVar111119));
                        b4.h hVarK1111111111117 = cVar2.k(gVar116.j(cVar1111110));
                        b4.h hVarK1111111111118 = cVar2.k(gVar116.j(cVar1111111));
                        b4.h hVarK1111111111119 = cVar2.k(gVar116.j(cVar1111112));
                        b4.b bVarL111119 = cVar2.l();
                        double d1118 = radians15;
                        double dSin15 = Math.sin(d1118);
                        double d1119 = iE15;
                        bVarL111119.f3890d.g(hVarK1111111111117, 0.5f);
                        bVarL111119.f3890d.g(hVarK1111111111119, 0.5f);
                        bVarL111119.f3890d.g(hVarK1111111111113, -0.5f);
                        bVarL111119.f3890d.g(hVarK1111111111115, -0.5f);
                        bVarL111119.f3888b = -((float) (dSin15 * d1119));
                        cVar2.c(bVarL111119);
                        b4.b bVarL1111110 = cVar2.l();
                        float fCos15 = (float) (Math.cos(d1118) * d1119);
                        bVarL1111110.f3890d.g(hVarK1111111111116, 0.5f);
                        bVarL1111110.f3890d.g(hVarK1111111111118, 0.5f);
                        bVarL1111110.f3890d.g(hVarK1111111111112, -0.5f);
                        bVarL1111110.f3890d.g(hVarK1111111111114, -0.5f);
                        bVarL1111110.f3888b = -fCos15;
                        cVar2.c(bVarL1111110);
                    }
                    this.f23136k = false;
                    this.f23138l = false;
                }
                i29 = -1;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                fVar4 = this.U[0];
                fVar5 = f.WRAP_CONTENT;
                if (fVar4 == fVar5) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i19 = 0;
                }
                dVar2 = this.Q;
                boolean z2111110 = !dVar2.h();
                boolean z2111111 = zArr4[0];
                boolean z2111112 = zArr4[1];
                if (this.f23143o != 2) {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                } else {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                }
                if (z11) {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                } else {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                }
                if (this.f23145p == 2) {
                    i34 = i31;
                }
                if (i34 != 0) {
                    hVar10 = hVar7;
                } else {
                    hVar10 = hVar7;
                }
                if (z16) {
                    if (this.A == 1) {
                        float f11112 = this.B;
                        b4.b bVarL1111111 = cVar2.l();
                        bVarL1111111.f3890d.g(hVar8, -1.0f);
                        bVarL1111111.f3890d.g(hVar10, 1.0f);
                        bVarL1111111.f3890d.g(hVar6, f11112);
                        bVarL1111111.f3890d.g(hVar5, -f11112);
                        cVar2.c(bVarL1111111);
                    } else {
                        float f11113 = this.B;
                        b4.b bVarL1111112 = cVar2.l();
                        bVarL1111112.f3890d.g(hVar6, -1.0f);
                        bVarL1111112.f3890d.g(hVar5, 1.0f);
                        bVarL1111112.f3890d.g(hVar8, f11113);
                        bVarL1111112.f3890d.g(hVar10, -f11113);
                        cVar2.c(bVarL1111112);
                    }
                }
                if (dVar2.h()) {
                    g gVar117 = dVar2.f23111f.f23109d;
                    float radians16 = (float) Math.toRadians(this.D + 90.0f);
                    int iE16 = dVar2.e();
                    c cVar1111113 = c.LEFT;
                    b4.h hVarK11111111111110 = cVar2.k(j(cVar1111113));
                    c cVar1111114 = c.TOP;
                    b4.h hVarK11111111111111 = cVar2.k(j(cVar1111114));
                    c cVar1111115 = c.RIGHT;
                    b4.h hVarK11111111111112 = cVar2.k(j(cVar1111115));
                    c cVar1111116 = c.BOTTOM;
                    b4.h hVarK11111111111113 = cVar2.k(j(cVar1111116));
                    b4.h hVarK11111111111114 = cVar2.k(gVar117.j(cVar1111113));
                    b4.h hVarK11111111111115 = cVar2.k(gVar117.j(cVar1111114));
                    b4.h hVarK11111111111116 = cVar2.k(gVar117.j(cVar1111115));
                    b4.h hVarK11111111111117 = cVar2.k(gVar117.j(cVar1111116));
                    b4.b bVarL1111113 = cVar2.l();
                    double d11110 = radians16;
                    double dSin16 = Math.sin(d11110);
                    double d11111 = iE16;
                    bVarL1111113.f3890d.g(hVarK11111111111115, 0.5f);
                    bVarL1111113.f3890d.g(hVarK11111111111117, 0.5f);
                    bVarL1111113.f3890d.g(hVarK11111111111111, -0.5f);
                    bVarL1111113.f3890d.g(hVarK11111111111113, -0.5f);
                    bVarL1111113.f3888b = -((float) (dSin16 * d11111));
                    cVar2.c(bVarL1111113);
                    b4.b bVarL1111114 = cVar2.l();
                    float fCos16 = (float) (Math.cos(d11110) * d11111);
                    bVarL1111114.f3890d.g(hVarK11111111111114, 0.5f);
                    bVarL1111114.f3890d.g(hVarK11111111111116, 0.5f);
                    bVarL1111114.f3890d.g(hVarK11111111111110, -0.5f);
                    bVarL1111114.f3890d.g(hVarK11111111111112, -0.5f);
                    bVarL1111114.f3888b = -fCos16;
                    cVar2.c(bVarL1111114);
                }
                this.f23136k = false;
                this.f23138l = false;
            }
            z16 = false;
            int[] iArr9 = this.f23153t;
            iArr9[0] = i27;
            iArr9[1] = i28;
            if (z16) {
                int i419 = this.A;
                i29 = -1;
                if (i419 != 0) {
                }
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                fVar4 = this.U[0];
                fVar5 = f.WRAP_CONTENT;
                if (fVar4 == fVar5) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i19 = 0;
                }
                dVar2 = this.Q;
                boolean z2111113 = !dVar2.h();
                boolean z2111114 = zArr4[0];
                boolean z2111115 = zArr4[1];
                if (this.f23143o != 2) {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                } else {
                    dVar3 = dVar;
                    hVar5 = hVarK;
                    hVar6 = hVarK2;
                    fVar6 = fVar5;
                    r19 = r12;
                    r9 = i17;
                    r11 = i16;
                    i30 = i27;
                }
                if (z11) {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                } else {
                    hVar7 = r32;
                    hVar8 = hVar3;
                    hVar9 = hVar4;
                    i31 = 0;
                    i32 = 8;
                    i33 = 1;
                    i34 = 1;
                }
                if (this.f23145p == 2) {
                    i34 = i31;
                }
                if (i34 != 0) {
                    hVar10 = hVar7;
                } else {
                    hVar10 = hVar7;
                }
                if (z16) {
                    if (this.A == 1) {
                        float f11114 = this.B;
                        b4.b bVarL1111115 = cVar2.l();
                        bVarL1111115.f3890d.g(hVar8, -1.0f);
                        bVarL1111115.f3890d.g(hVar10, 1.0f);
                        bVarL1111115.f3890d.g(hVar6, f11114);
                        bVarL1111115.f3890d.g(hVar5, -f11114);
                        cVar2.c(bVarL1111115);
                    } else {
                        float f11115 = this.B;
                        b4.b bVarL1111116 = cVar2.l();
                        bVarL1111116.f3890d.g(hVar6, -1.0f);
                        bVarL1111116.f3890d.g(hVar5, 1.0f);
                        bVarL1111116.f3890d.g(hVar8, f11115);
                        bVarL1111116.f3890d.g(hVar10, -f11115);
                        cVar2.c(bVarL1111116);
                    }
                }
                if (dVar2.h()) {
                    g gVar118 = dVar2.f23111f.f23109d;
                    float radians17 = (float) Math.toRadians(this.D + 90.0f);
                    int iE17 = dVar2.e();
                    c cVar1111117 = c.LEFT;
                    b4.h hVarK11111111111118 = cVar2.k(j(cVar1111117));
                    c cVar1111118 = c.TOP;
                    b4.h hVarK11111111111119 = cVar2.k(j(cVar1111118));
                    c cVar1111119 = c.RIGHT;
                    b4.h hVarK111111111111110 = cVar2.k(j(cVar1111119));
                    c cVar11111110 = c.BOTTOM;
                    b4.h hVarK111111111111111 = cVar2.k(j(cVar11111110));
                    b4.h hVarK111111111111112 = cVar2.k(gVar118.j(cVar1111117));
                    b4.h hVarK111111111111113 = cVar2.k(gVar118.j(cVar1111118));
                    b4.h hVarK111111111111114 = cVar2.k(gVar118.j(cVar1111119));
                    b4.h hVarK111111111111115 = cVar2.k(gVar118.j(cVar11111110));
                    b4.b bVarL1111117 = cVar2.l();
                    double d11112 = radians17;
                    double dSin17 = Math.sin(d11112);
                    double d11113 = iE17;
                    bVarL1111117.f3890d.g(hVarK111111111111113, 0.5f);
                    bVarL1111117.f3890d.g(hVarK111111111111115, 0.5f);
                    bVarL1111117.f3890d.g(hVarK11111111111119, -0.5f);
                    bVarL1111117.f3890d.g(hVarK111111111111111, -0.5f);
                    bVarL1111117.f3888b = -((float) (dSin17 * d11113));
                    cVar2.c(bVarL1111117);
                    b4.b bVarL1111118 = cVar2.l();
                    float fCos17 = (float) (Math.cos(d11112) * d11113);
                    bVarL1111118.f3890d.g(hVarK111111111111112, 0.5f);
                    bVarL1111118.f3890d.g(hVarK111111111111114, 0.5f);
                    bVarL1111118.f3890d.g(hVarK11111111111118, -0.5f);
                    bVarL1111118.f3890d.g(hVarK111111111111110, -0.5f);
                    bVarL1111118.f3888b = -fCos17;
                    cVar2.c(bVarL1111118);
                }
                this.f23136k = false;
                this.f23138l = false;
            }
            i29 = -1;
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            fVar4 = this.U[0];
            fVar5 = f.WRAP_CONTENT;
            if (fVar4 == fVar5) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z18) {
                i19 = 0;
            }
            dVar2 = this.Q;
            boolean z2111116 = !dVar2.h();
            boolean z2111117 = zArr4[0];
            boolean z2111118 = zArr4[1];
            if (this.f23143o != 2) {
                dVar3 = dVar;
                hVar5 = hVarK;
                hVar6 = hVarK2;
                fVar6 = fVar5;
                r19 = r12;
                r9 = i17;
                r11 = i16;
                i30 = i27;
            } else {
                dVar3 = dVar;
                hVar5 = hVarK;
                hVar6 = hVarK2;
                fVar6 = fVar5;
                r19 = r12;
                r9 = i17;
                r11 = i16;
                i30 = i27;
            }
            if (z11) {
                hVar7 = r32;
                hVar8 = hVar3;
                hVar9 = hVar4;
                i31 = 0;
                i32 = 8;
                i33 = 1;
                i34 = 1;
            } else {
                hVar7 = r32;
                hVar8 = hVar3;
                hVar9 = hVar4;
                i31 = 0;
                i32 = 8;
                i33 = 1;
                i34 = 1;
            }
            if (this.f23145p == 2) {
                i34 = i31;
            }
            if (i34 != 0) {
                hVar10 = hVar7;
            } else {
                hVar10 = hVar7;
            }
            if (z16) {
                if (this.A == 1) {
                    float f11116 = this.B;
                    b4.b bVarL1111119 = cVar2.l();
                    bVarL1111119.f3890d.g(hVar8, -1.0f);
                    bVarL1111119.f3890d.g(hVar10, 1.0f);
                    bVarL1111119.f3890d.g(hVar6, f11116);
                    bVarL1111119.f3890d.g(hVar5, -f11116);
                    cVar2.c(bVarL1111119);
                } else {
                    float f11117 = this.B;
                    b4.b bVarL11111110 = cVar2.l();
                    bVarL11111110.f3890d.g(hVar6, -1.0f);
                    bVarL11111110.f3890d.g(hVar5, 1.0f);
                    bVarL11111110.f3890d.g(hVar8, f11117);
                    bVarL11111110.f3890d.g(hVar10, -f11117);
                    cVar2.c(bVarL11111110);
                }
            }
            if (dVar2.h()) {
                g gVar119 = dVar2.f23111f.f23109d;
                float radians18 = (float) Math.toRadians(this.D + 90.0f);
                int iE18 = dVar2.e();
                c cVar11111111 = c.LEFT;
                b4.h hVarK111111111111116 = cVar2.k(j(cVar11111111));
                c cVar11111112 = c.TOP;
                b4.h hVarK111111111111117 = cVar2.k(j(cVar11111112));
                c cVar11111113 = c.RIGHT;
                b4.h hVarK111111111111118 = cVar2.k(j(cVar11111113));
                c cVar11111114 = c.BOTTOM;
                b4.h hVarK111111111111119 = cVar2.k(j(cVar11111114));
                b4.h hVarK1111111111111110 = cVar2.k(gVar119.j(cVar11111111));
                b4.h hVarK1111111111111111 = cVar2.k(gVar119.j(cVar11111112));
                b4.h hVarK1111111111111112 = cVar2.k(gVar119.j(cVar11111113));
                b4.h hVarK1111111111111113 = cVar2.k(gVar119.j(cVar11111114));
                b4.b bVarL11111111 = cVar2.l();
                double d11114 = radians18;
                double dSin18 = Math.sin(d11114);
                double d11115 = iE18;
                bVarL11111111.f3890d.g(hVarK1111111111111111, 0.5f);
                bVarL11111111.f3890d.g(hVarK1111111111111113, 0.5f);
                bVarL11111111.f3890d.g(hVarK111111111111117, -0.5f);
                bVarL11111111.f3890d.g(hVarK111111111111119, -0.5f);
                bVarL11111111.f3888b = -((float) (dSin18 * d11115));
                cVar2.c(bVarL11111111);
                b4.b bVarL11111112 = cVar2.l();
                float fCos18 = (float) (Math.cos(d11114) * d11115);
                bVarL11111112.f3890d.g(hVarK1111111111111110, 0.5f);
                bVarL11111112.f3890d.g(hVarK1111111111111112, 0.5f);
                bVarL11111112.f3890d.g(hVarK111111111111116, -0.5f);
                bVarL11111112.f3890d.g(hVarK111111111111118, -0.5f);
                bVarL11111112.f3888b = -fCos18;
                cVar2.c(bVarL11111112);
            }
            this.f23136k = false;
            this.f23138l = false;
        }
        hVar3 = hVarK4;
        hVar4 = hVarK5;
        i26 = i23;
        i27 = i24;
        i28 = i25;
        z16 = false;
        int[] iArr10 = this.f23153t;
        iArr10[0] = i27;
        iArr10[1] = i28;
        if (z16) {
            int i4110 = this.A;
            i29 = -1;
            if (i4110 != 0) {
            }
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            fVar4 = this.U[0];
            fVar5 = f.WRAP_CONTENT;
            if (fVar4 == fVar5) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z18) {
                i19 = 0;
            }
            dVar2 = this.Q;
            boolean z2111119 = !dVar2.h();
            boolean z21111110 = zArr4[0];
            boolean z21111111 = zArr4[1];
            if (this.f23143o != 2) {
                dVar3 = dVar;
                hVar5 = hVarK;
                hVar6 = hVarK2;
                fVar6 = fVar5;
                r19 = r12;
                r9 = i17;
                r11 = i16;
                i30 = i27;
            } else {
                dVar3 = dVar;
                hVar5 = hVarK;
                hVar6 = hVarK2;
                fVar6 = fVar5;
                r19 = r12;
                r9 = i17;
                r11 = i16;
                i30 = i27;
            }
            if (z11) {
                hVar7 = r32;
                hVar8 = hVar3;
                hVar9 = hVar4;
                i31 = 0;
                i32 = 8;
                i33 = 1;
                i34 = 1;
            } else {
                hVar7 = r32;
                hVar8 = hVar3;
                hVar9 = hVar4;
                i31 = 0;
                i32 = 8;
                i33 = 1;
                i34 = 1;
            }
            if (this.f23145p == 2) {
                i34 = i31;
            }
            if (i34 != 0) {
                hVar10 = hVar7;
            } else {
                hVar10 = hVar7;
            }
            if (z16) {
                if (this.A == 1) {
                    float f11118 = this.B;
                    b4.b bVarL11111113 = cVar2.l();
                    bVarL11111113.f3890d.g(hVar8, -1.0f);
                    bVarL11111113.f3890d.g(hVar10, 1.0f);
                    bVarL11111113.f3890d.g(hVar6, f11118);
                    bVarL11111113.f3890d.g(hVar5, -f11118);
                    cVar2.c(bVarL11111113);
                } else {
                    float f11119 = this.B;
                    b4.b bVarL11111114 = cVar2.l();
                    bVarL11111114.f3890d.g(hVar6, -1.0f);
                    bVarL11111114.f3890d.g(hVar5, 1.0f);
                    bVarL11111114.f3890d.g(hVar8, f11119);
                    bVarL11111114.f3890d.g(hVar10, -f11119);
                    cVar2.c(bVarL11111114);
                }
            }
            if (dVar2.h()) {
                g gVar1110 = dVar2.f23111f.f23109d;
                float radians19 = (float) Math.toRadians(this.D + 90.0f);
                int iE19 = dVar2.e();
                c cVar11111115 = c.LEFT;
                b4.h hVarK1111111111111114 = cVar2.k(j(cVar11111115));
                c cVar11111116 = c.TOP;
                b4.h hVarK1111111111111115 = cVar2.k(j(cVar11111116));
                c cVar11111117 = c.RIGHT;
                b4.h hVarK1111111111111116 = cVar2.k(j(cVar11111117));
                c cVar11111118 = c.BOTTOM;
                b4.h hVarK1111111111111117 = cVar2.k(j(cVar11111118));
                b4.h hVarK1111111111111118 = cVar2.k(gVar1110.j(cVar11111115));
                b4.h hVarK1111111111111119 = cVar2.k(gVar1110.j(cVar11111116));
                b4.h hVarK11111111111111110 = cVar2.k(gVar1110.j(cVar11111117));
                b4.h hVarK11111111111111111 = cVar2.k(gVar1110.j(cVar11111118));
                b4.b bVarL11111115 = cVar2.l();
                double d11116 = radians19;
                double dSin19 = Math.sin(d11116);
                double d11117 = iE19;
                bVarL11111115.f3890d.g(hVarK1111111111111119, 0.5f);
                bVarL11111115.f3890d.g(hVarK11111111111111111, 0.5f);
                bVarL11111115.f3890d.g(hVarK1111111111111115, -0.5f);
                bVarL11111115.f3890d.g(hVarK1111111111111117, -0.5f);
                bVarL11111115.f3888b = -((float) (dSin19 * d11117));
                cVar2.c(bVarL11111115);
                b4.b bVarL11111116 = cVar2.l();
                float fCos19 = (float) (Math.cos(d11116) * d11117);
                bVarL11111116.f3890d.g(hVarK1111111111111118, 0.5f);
                bVarL11111116.f3890d.g(hVarK11111111111111110, 0.5f);
                bVarL11111116.f3890d.g(hVarK1111111111111114, -0.5f);
                bVarL11111116.f3890d.g(hVarK1111111111111116, -0.5f);
                bVarL11111116.f3888b = -fCos19;
                cVar2.c(bVarL11111116);
            }
            this.f23136k = false;
            this.f23138l = false;
        }
        i29 = -1;
        if (z16) {
            z17 = false;
        } else {
            z17 = false;
        }
        fVar4 = this.U[0];
        fVar5 = f.WRAP_CONTENT;
        if (fVar4 == fVar5) {
            z18 = false;
        } else {
            z18 = false;
        }
        if (z18) {
            i19 = 0;
        }
        dVar2 = this.Q;
        boolean z21111112 = !dVar2.h();
        boolean z21111113 = zArr4[0];
        boolean z21111114 = zArr4[1];
        if (this.f23143o != 2) {
            dVar3 = dVar;
            hVar5 = hVarK;
            hVar6 = hVarK2;
            fVar6 = fVar5;
            r19 = r12;
            r9 = i17;
            r11 = i16;
            i30 = i27;
        } else {
            dVar3 = dVar;
            hVar5 = hVarK;
            hVar6 = hVarK2;
            fVar6 = fVar5;
            r19 = r12;
            r9 = i17;
            r11 = i16;
            i30 = i27;
        }
        if (z11) {
            hVar7 = r32;
            hVar8 = hVar3;
            hVar9 = hVar4;
            i31 = 0;
            i32 = 8;
            i33 = 1;
            i34 = 1;
        } else {
            hVar7 = r32;
            hVar8 = hVar3;
            hVar9 = hVar4;
            i31 = 0;
            i32 = 8;
            i33 = 1;
            i34 = 1;
        }
        if (this.f23145p == 2) {
            i34 = i31;
        }
        if (i34 != 0) {
            hVar10 = hVar7;
        } else {
            hVar10 = hVar7;
        }
        if (z16) {
            if (this.A == 1) {
                float f111110 = this.B;
                b4.b bVarL11111117 = cVar2.l();
                bVarL11111117.f3890d.g(hVar8, -1.0f);
                bVarL11111117.f3890d.g(hVar10, 1.0f);
                bVarL11111117.f3890d.g(hVar6, f111110);
                bVarL11111117.f3890d.g(hVar5, -f111110);
                cVar2.c(bVarL11111117);
            } else {
                float f111111 = this.B;
                b4.b bVarL11111118 = cVar2.l();
                bVarL11111118.f3890d.g(hVar6, -1.0f);
                bVarL11111118.f3890d.g(hVar5, 1.0f);
                bVarL11111118.f3890d.g(hVar8, f111111);
                bVarL11111118.f3890d.g(hVar10, -f111111);
                cVar2.c(bVarL11111118);
            }
        }
        if (dVar2.h()) {
            g gVar1111 = dVar2.f23111f.f23109d;
            float radians110 = (float) Math.toRadians(this.D + 90.0f);
            int iE110 = dVar2.e();
            c cVar11111119 = c.LEFT;
            b4.h hVarK11111111111111112 = cVar2.k(j(cVar11111119));
            c cVar111111110 = c.TOP;
            b4.h hVarK11111111111111113 = cVar2.k(j(cVar111111110));
            c cVar111111111 = c.RIGHT;
            b4.h hVarK11111111111111114 = cVar2.k(j(cVar111111111));
            c cVar111111112 = c.BOTTOM;
            b4.h hVarK11111111111111115 = cVar2.k(j(cVar111111112));
            b4.h hVarK11111111111111116 = cVar2.k(gVar1111.j(cVar11111119));
            b4.h hVarK11111111111111117 = cVar2.k(gVar1111.j(cVar111111110));
            b4.h hVarK11111111111111118 = cVar2.k(gVar1111.j(cVar111111111));
            b4.h hVarK11111111111111119 = cVar2.k(gVar1111.j(cVar111111112));
            b4.b bVarL11111119 = cVar2.l();
            double d11118 = radians110;
            double dSin110 = Math.sin(d11118);
            double d11119 = iE110;
            bVarL11111119.f3890d.g(hVarK11111111111111117, 0.5f);
            bVarL11111119.f3890d.g(hVarK11111111111111119, 0.5f);
            bVarL11111119.f3890d.g(hVarK11111111111111113, -0.5f);
            bVarL11111119.f3890d.g(hVarK11111111111111115, -0.5f);
            bVarL11111119.f3888b = -((float) (dSin110 * d11119));
            cVar2.c(bVarL11111119);
            b4.b bVarL111111110 = cVar2.l();
            float fCos110 = (float) (Math.cos(d11118) * d11119);
            bVarL111111110.f3890d.g(hVarK11111111111111116, 0.5f);
            bVarL111111110.f3890d.g(hVarK11111111111111118, 0.5f);
            bVarL111111110.f3890d.g(hVarK11111111111111112, -0.5f);
            bVarL111111110.f3890d.g(hVarK11111111111111114, -0.5f);
            bVarL111111110.f3888b = -fCos110;
            cVar2.c(bVarL111111110);
        }
        this.f23136k = false;
        this.f23138l = false;
    }

    public boolean c() {
        return this.f23133i0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:221:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:230:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:232:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:241:0x041c  */
    /* JADX WARN: Code duplicated, block: B:258:0x044f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0455  */
    /* JADX WARN: Code duplicated, block: B:271:0x046a  */
    /* JADX WARN: Code duplicated, block: B:276:0x0474  */
    /* JADX WARN: Code duplicated, block: B:278:0x0478  */
    /* JADX WARN: Code duplicated, block: B:279:0x047a  */
    /* JADX WARN: Code duplicated, block: B:282:0x0482  */
    /* JADX WARN: Code duplicated, block: B:288:0x0490 A[PHI: r3
      0x0490: PHI (r3v17 int) = (r3v16 int), (r3v21 int), (r3v21 int), (r3v21 int) binds: [B:281:0x0480, B:283:0x0486, B:284:0x0488, B:286:0x048c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:292:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:293:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:295:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:304:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:338:0x0520  */
    public final void d(b4.c cVar, boolean z11, boolean z12, boolean z13, boolean z14, b4.h hVar, b4.h hVar2, f fVar, boolean z15, d dVar, d dVar2, int i11, int i12, int i13, int i14, float f5, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, int i15, int i16, int i17, int i18, float f11, boolean z21) {
        int iMin;
        int i19;
        int i21;
        boolean z22;
        b4.h hVarK;
        b4.h hVarK2;
        d dVar3;
        b4.h hVar3;
        int i22;
        int i23;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        g gVar;
        boolean z27;
        int iMin2;
        boolean z28;
        int i24;
        int iE;
        int i25;
        int i26;
        HashSet hashSet;
        boolean z29;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z30;
        boolean z31;
        int i33;
        cVar = cVar;
        int i34 = i17;
        int i35 = i18;
        b4.h hVarK3 = cVar.k(dVar);
        b4.h hVarK4 = cVar.k(dVar2);
        b4.h hVarK5 = cVar.k(dVar.f23111f);
        b4.h hVarK6 = cVar.k(dVar2.f23111f);
        boolean zH = dVar.h();
        boolean zH2 = dVar2.h();
        boolean zH3 = this.Q.h();
        int i36 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i36++;
        }
        int i37 = i36;
        int i38 = z16 ? 3 : i15;
        int iOrdinal = fVar.ordinal();
        boolean z32 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i38 == 4) ? false : true;
        int i39 = this.f23130h;
        if (i39 != -1 && z11) {
            this.f23130h = -1;
            i12 = i39;
            z32 = false;
        }
        int i40 = this.f23132i;
        if (i40 == -1 || z11) {
            i40 = i12;
        } else {
            this.f23132i = -1;
            z32 = false;
        }
        int i41 = i40;
        if (this.f23133i0 == 8) {
            z32 = false;
            iMin = 0;
        } else {
            iMin = i41;
        }
        if (z21) {
            if (!zH && !zH2 && !zH3) {
                cVar.d(hVarK3, i11);
            } else if (zH && !zH2) {
                i19 = 8;
                cVar.e(hVarK3, hVarK5, dVar.e(), 8);
            }
            i19 = 8;
        } else {
            i19 = 8;
        }
        if (z32 != 0) {
            if (i37 == 2 || z16 || !(i38 == 1 || i38 == 0)) {
                if (i34 == -2) {
                    i34 = iMin;
                }
                if (i35 == -2) {
                    i35 = iMin;
                }
                if (iMin > 0 && i38 != 1) {
                    iMin = 0;
                }
                if (i34 > 0) {
                    cVar.f(hVarK4, hVarK3, i34, 8);
                    iMin = Math.max(iMin, i34);
                }
                if (i35 > 0) {
                    if (!z12 || i38 != 1) {
                        cVar.g(hVarK4, hVarK3, i35, 8);
                    }
                    iMin = Math.min(iMin, i35);
                }
                if (i38 == 1) {
                    if (z12) {
                        cVar.e(hVarK4, hVarK3, iMin, 8);
                    } else if (z18) {
                        cVar.e(hVarK4, hVarK3, iMin, 5);
                        cVar.g(hVarK4, hVarK3, iMin, 8);
                    } else {
                        cVar.e(hVarK4, hVarK3, iMin, 5);
                        cVar.g(hVarK4, hVarK3, iMin, 8);
                    }
                } else if (i38 == 2) {
                    c cVar2 = dVar.f23110e;
                    c cVar3 = c.TOP;
                    if (cVar2 == cVar3 || cVar2 == c.BOTTOM) {
                        hVarK = cVar.k(this.V.j(cVar3));
                        hVarK2 = cVar.k(this.V.j(c.BOTTOM));
                    } else {
                        hVarK = cVar.k(this.V.j(c.LEFT));
                        hVarK2 = cVar.k(this.V.j(c.RIGHT));
                    }
                    b4.b bVarL = cVar.l();
                    int i42 = i34;
                    bVarL.f3890d.g(hVarK4, -1.0f);
                    bVarL.f3890d.g(hVarK3, 1.0f);
                    bVarL.f3890d.g(hVarK2, f11);
                    bVarL.f3890d.g(hVarK, -f11);
                    cVar.c(bVarL);
                    if (z12) {
                        z32 = false;
                    }
                    z22 = z14;
                    i21 = i42;
                } else {
                    i21 = i34;
                    z22 = true;
                }
            } else {
                int iMax = Math.max(i34, iMin);
                if (i35 > 0) {
                    iMax = Math.min(i35, iMax);
                }
                cVar.e(hVarK4, hVarK3, iMax, 8);
                z22 = z14;
                i21 = i34;
                z32 = false;
            }
            if (z21 || z18) {
                boolean z33 = z22;
                if (i37 >= 2 && z12 && z33) {
                    cVar.f(hVarK3, hVar, 0, 8);
                    d dVar4 = this.N;
                    boolean z34 = z11 || dVar4.f23111f == null;
                    if (!z11 && (dVar3 = dVar4.f23111f) != null) {
                        g gVar2 = dVar3.f23109d;
                        if (gVar2.Y != CropImageView.DEFAULT_ASPECT_RATIO) {
                            f[] fVarArr = gVar2.U;
                            f fVar2 = fVarArr[0];
                            f fVar3 = f.MATCH_CONSTRAINT;
                            if (fVar2 == fVar3 && fVarArr[1] == fVar3) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                        } else {
                            z34 = false;
                        }
                    }
                    if (z34) {
                        cVar.f(hVar2, hVarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    dVar2 = dVar2;
                    hVarK4 = hVarK4;
                    z22 = z22;
                    hVar3 = hVarK6;
                    z27 = z12;
                    i33 = (z12 && (dVar.f23111f.f23109d instanceof a)) ? 8 : 5;
                } else if (zH || !zH2) {
                    hVar3 = hVarK6;
                    if (zH && zH2) {
                        g gVar3 = dVar.f23111f.f23109d;
                        g gVar4 = dVar2.f23111f.f23109d;
                        z22 = z22;
                        g gVar5 = this.V;
                        int i43 = 6;
                        if (z32) {
                            if (i38 == 0) {
                                if (i35 != 0 || i21 != 0) {
                                    i31 = 5;
                                    i32 = 5;
                                    z30 = true;
                                    z31 = false;
                                    z24 = true;
                                } else if (hVarK5.f3920f && hVar3.f3920f) {
                                    cVar.e(hVarK3, hVarK5, dVar.e(), 8);
                                    cVar.e(hVarK4, hVar3, -dVar2.e(), 8);
                                    return;
                                } else {
                                    i31 = 8;
                                    i32 = 8;
                                    z30 = false;
                                    z31 = true;
                                    z24 = false;
                                }
                                if ((gVar3 instanceof a) || (gVar4 instanceof a)) {
                                    i22 = i31;
                                    hVarK5 = hVarK5;
                                    cVar = cVar;
                                    i38 = i38;
                                    hVarK3 = hVarK3;
                                    hVarK4 = hVarK4;
                                    i43 = 6;
                                    z25 = z31;
                                    hVar2 = hVar2;
                                    z23 = z30;
                                    i23 = 4;
                                } else {
                                    i22 = i31;
                                    hVarK5 = hVarK5;
                                    cVar = cVar;
                                    hVarK3 = hVarK3;
                                    hVarK4 = hVarK4;
                                    i43 = 6;
                                    z25 = z31;
                                    z23 = z30;
                                    i23 = i32;
                                    i38 = i38;
                                    hVar2 = hVar2;
                                }
                            } else {
                                if (i38 == 2) {
                                    if ((gVar3 instanceof a) || (gVar4 instanceof a)) {
                                        i22 = 5;
                                    } else {
                                        cVar = cVar;
                                        i38 = i38;
                                        hVarK3 = hVarK3;
                                        hVarK4 = hVarK4;
                                        hVarK5 = hVarK5;
                                        i43 = 6;
                                        i22 = 5;
                                        i23 = 5;
                                    }
                                    z23 = true;
                                    z24 = true;
                                    z25 = false;
                                    hVar2 = hVar2;
                                } else if (i38 == 1) {
                                    i22 = 8;
                                } else if (i38 == 3) {
                                    i38 = i38;
                                    if (this.A == -1) {
                                        if (z19) {
                                            cVar = cVar;
                                            hVar2 = hVar2;
                                            hVarK3 = hVarK3;
                                            hVarK4 = hVarK4;
                                            hVarK5 = hVarK5;
                                            i43 = z12 ? 5 : 4;
                                        } else {
                                            cVar = cVar;
                                            hVar2 = hVar2;
                                            hVarK3 = hVarK3;
                                            hVarK4 = hVarK4;
                                            hVarK5 = hVarK5;
                                            i43 = 8;
                                        }
                                        i22 = 8;
                                    } else {
                                        if (z16) {
                                            if (i16 == 2 || i16 == 1) {
                                                i29 = 5;
                                                i30 = 4;
                                            } else {
                                                i29 = 8;
                                                i30 = 5;
                                            }
                                            i23 = i30;
                                            z23 = true;
                                            z24 = true;
                                            z25 = true;
                                        } else {
                                            if (i35 > 0) {
                                                cVar = cVar;
                                                hVar2 = hVar2;
                                                hVarK3 = hVarK3;
                                                hVarK4 = hVarK4;
                                                hVarK5 = hVarK5;
                                                i43 = 6;
                                                i22 = 5;
                                            } else if (i35 != 0 || i21 != 0) {
                                                cVar = cVar;
                                                hVar2 = hVar2;
                                                hVarK3 = hVarK3;
                                                hVarK4 = hVarK4;
                                                hVarK5 = hVarK5;
                                                i43 = 6;
                                                i22 = 5;
                                                i23 = 4;
                                            } else if (z19) {
                                                i29 = (gVar3 == gVar5 || gVar4 == gVar5) ? 5 : 4;
                                                i23 = 4;
                                                z23 = true;
                                                z24 = true;
                                                z25 = true;
                                            } else {
                                                cVar = cVar;
                                                hVar2 = hVar2;
                                                hVarK3 = hVarK3;
                                                hVarK4 = hVarK4;
                                                hVarK5 = hVarK5;
                                                i43 = 6;
                                                i22 = 5;
                                                i23 = 8;
                                            }
                                            z23 = true;
                                            z24 = true;
                                            z25 = true;
                                        }
                                        i22 = i29;
                                        cVar = cVar;
                                    }
                                    i23 = 5;
                                    z23 = true;
                                    z24 = true;
                                    z25 = true;
                                } else {
                                    i22 = 5;
                                    i23 = 4;
                                    z23 = false;
                                    z24 = false;
                                }
                                i23 = 4;
                                z23 = true;
                                z24 = true;
                                z25 = false;
                                hVar2 = hVar2;
                            }
                            if (z24 || hVarK5 != hVar3 || gVar3 == gVar5) {
                                z26 = true;
                            } else {
                                z24 = false;
                                z26 = false;
                            }
                            if (z23) {
                                if (z32 && !z17 && !z19 && hVarK5 == hVar && hVar3 == hVar2) {
                                    i28 = 8;
                                    z27 = false;
                                    i27 = 8;
                                    z29 = false;
                                } else {
                                    z27 = z12;
                                    z29 = z26;
                                    i27 = i22;
                                    i28 = i43;
                                }
                                b4.h hVar4 = hVarK5;
                                gVar = gVar4;
                                cVar.b(hVarK3, hVar4, dVar.e(), f5, hVar3, hVarK4, dVar2.e(), i28);
                                hVarK5 = hVar4;
                                i22 = i27;
                                z26 = z29;
                            } else {
                                gVar = gVar4;
                                z27 = z12;
                            }
                            if (this.f23133i0 != 8 && ((hashSet = dVar2.f23106a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z24) {
                                if (z27 && hVarK5 != hVar3 && !z32 && ((gVar3 instanceof a) || (gVar instanceof a))) {
                                    i22 = 6;
                                }
                                cVar.f(hVarK3, hVarK5, dVar.e(), i22);
                                cVar.g(hVarK4, hVar3, -dVar2.e(), i22);
                            }
                            if (z27 || !z20 || (gVar3 instanceof a) || (gVar instanceof a) || gVar == gVar5) {
                                iMin2 = i23;
                                z28 = z26;
                            } else {
                                iMin2 = 6;
                                i22 = 6;
                                z28 = true;
                            }
                            if (z28) {
                                if (z25 && (!z19 || z13)) {
                                    if (gVar3 != gVar5 && gVar != gVar5) {
                                        i43 = iMin2;
                                    }
                                    if ((gVar3 instanceof l) || (gVar instanceof l)) {
                                        i43 = 5;
                                    }
                                    if ((gVar3 instanceof a) || (gVar instanceof a)) {
                                        i43 = 5;
                                    }
                                    if (z19) {
                                        i26 = 5;
                                    } else {
                                        i26 = i43;
                                    }
                                    iMin2 = Math.max(i26, iMin2);
                                }
                                if (z27) {
                                    iMin2 = Math.min(i22, iMin2);
                                    if (z16 || z19 || !(gVar3 == gVar5 || gVar == gVar5)) {
                                        i25 = iMin2;
                                    } else {
                                        i25 = 4;
                                    }
                                } else {
                                    i25 = iMin2;
                                }
                                cVar.e(hVarK3, hVarK5, dVar.e(), i25);
                                cVar.e(hVarK4, hVar3, -dVar2.e(), i25);
                            }
                            if (z27) {
                                if (hVar == hVarK5) {
                                    iE = dVar.e();
                                } else {
                                    iE = 0;
                                }
                                if (hVarK5 != hVar) {
                                    cVar.f(hVarK3, hVar, iE, 5);
                                }
                            }
                            if (z27 || !z32 || i13 != 0 || i21 != 0) {
                                i24 = 5;
                            } else if (z32 && i38 == 3) {
                                cVar.f(hVarK4, hVarK3, 0, 8);
                                i24 = 5;
                            } else {
                                i24 = 5;
                                cVar.f(hVarK4, hVarK3, 0, 5);
                            }
                        } else {
                            if (hVarK5.f3920f && hVar3.f3920f) {
                                cVar.b(hVarK3, hVarK5, dVar.e(), f5, hVar3, hVarK4, dVar2.e(), 8);
                                if (z12 && z22) {
                                    int iE2 = dVar2.f23111f != null ? dVar2.e() : 0;
                                    if (hVar3 != hVar2) {
                                        cVar.f(hVar2, hVarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i22 = 5;
                            i23 = 4;
                            z23 = true;
                            z24 = true;
                        }
                        z25 = false;
                        if (z24) {
                            z26 = true;
                        } else {
                            z26 = true;
                        }
                        if (z23) {
                            if (z32) {
                                z27 = z12;
                                z29 = z26;
                                i27 = i22;
                                i28 = i43;
                            } else {
                                z27 = z12;
                                z29 = z26;
                                i27 = i22;
                                i28 = i43;
                            }
                            b4.h hVar5 = hVarK5;
                            gVar = gVar4;
                            cVar.b(hVarK3, hVar5, dVar.e(), f5, hVar3, hVarK4, dVar2.e(), i28);
                            hVarK5 = hVar5;
                            i22 = i27;
                            z26 = z29;
                        } else {
                            gVar = gVar4;
                            z27 = z12;
                        }
                        if (this.f23133i0 != 8) {
                        }
                        if (z24) {
                            if (z27) {
                                i22 = 6;
                            }
                            cVar.f(hVarK3, hVarK5, dVar.e(), i22);
                            cVar.g(hVarK4, hVar3, -dVar2.e(), i22);
                        }
                        if (z27) {
                            iMin2 = i23;
                            z28 = z26;
                        } else {
                            iMin2 = i23;
                            z28 = z26;
                        }
                        if (z28) {
                            if (z25) {
                                if (gVar3 != gVar5) {
                                    i43 = iMin2;
                                }
                                if (gVar3 instanceof l) {
                                    i43 = 5;
                                } else {
                                    i43 = 5;
                                }
                                if (gVar3 instanceof a) {
                                    i43 = 5;
                                } else {
                                    i43 = 5;
                                }
                                if (z19) {
                                    i26 = 5;
                                } else {
                                    i26 = i43;
                                }
                                iMin2 = Math.max(i26, iMin2);
                            }
                            if (z27) {
                                iMin2 = Math.min(i22, iMin2);
                                if (z16) {
                                    i25 = iMin2;
                                } else {
                                    i25 = iMin2;
                                }
                            } else {
                                i25 = iMin2;
                            }
                            cVar.e(hVarK3, hVarK5, dVar.e(), i25);
                            cVar.e(hVarK4, hVar3, -dVar2.e(), i25);
                        }
                        if (z27) {
                            if (hVar == hVarK5) {
                                iE = dVar.e();
                            } else {
                                iE = 0;
                            }
                            if (hVarK5 != hVar) {
                                cVar.f(hVarK3, hVar, iE, 5);
                            }
                        }
                        if (z27) {
                            i24 = 5;
                        } else {
                            i24 = 5;
                        }
                    }
                    i33 = i24;
                } else {
                    hVar3 = hVarK6;
                    cVar.e(hVarK4, hVar3, -dVar2.e(), 8);
                    if (z12) {
                        cVar.f(hVarK3, hVar, 0, 5);
                        dVar2 = dVar2;
                        i24 = 5;
                        hVarK4 = hVarK4;
                        z22 = z22;
                    }
                    z27 = z12;
                    i33 = i24;
                }
                if (z27 || !z22) {
                    return;
                }
                int iE3 = dVar2.f23111f != null ? dVar2.e() : 0;
                if (hVar3 != hVar2) {
                    cVar.f(hVar2, hVarK4, iE3, i33);
                    return;
                }
                return;
            }
            hVar3 = hVarK6;
            i24 = 5;
            z27 = z12;
            i33 = i24;
            if (z27) {
                return;
            } else {
                return;
            }
        }
        if (z15) {
            cVar.e(hVarK4, hVarK3, 0, 3);
            if (i13 > 0) {
                cVar.f(hVarK4, hVarK3, i13, i19);
            }
            if (i14 < Integer.MAX_VALUE) {
                cVar.g(hVarK4, hVarK3, i14, i19);
            }
        } else {
            cVar.e(hVarK4, hVarK3, iMin, i19);
        }
        z22 = z14;
        i21 = i34;
        if (z21) {
        }
        boolean z35 = z22;
        if (i37 >= 2) {
        }
    }

    public final void e(c cVar, g gVar, c cVar2, int i11) {
        c cVar3;
        c cVar4;
        boolean z11;
        c cVar5 = c.CENTER;
        if (cVar == cVar5) {
            if (cVar2 != cVar5) {
                c cVar6 = c.LEFT;
                if (cVar2 == cVar6 || cVar2 == c.RIGHT) {
                    e(cVar6, gVar, cVar2, 0);
                    e(c.RIGHT, gVar, cVar2, 0);
                    j(cVar5).a(gVar.j(cVar2), 0);
                    return;
                }
                c cVar7 = c.TOP;
                if (cVar2 == cVar7 || cVar2 == c.BOTTOM) {
                    e(cVar7, gVar, cVar2, 0);
                    e(c.BOTTOM, gVar, cVar2, 0);
                    j(cVar5).a(gVar.j(cVar2), 0);
                    return;
                }
                return;
            }
            c cVar8 = c.LEFT;
            d dVarJ = j(cVar8);
            c cVar9 = c.RIGHT;
            d dVarJ2 = j(cVar9);
            c cVar10 = c.TOP;
            d dVarJ3 = j(cVar10);
            c cVar11 = c.BOTTOM;
            d dVarJ4 = j(cVar11);
            boolean z12 = true;
            if ((dVarJ == null || !dVarJ.h()) && (dVarJ2 == null || !dVarJ2.h())) {
                e(cVar8, gVar, cVar8, 0);
                e(cVar9, gVar, cVar9, 0);
                z11 = true;
            } else {
                z11 = false;
            }
            if ((dVarJ3 == null || !dVarJ3.h()) && (dVarJ4 == null || !dVarJ4.h())) {
                e(cVar10, gVar, cVar10, 0);
                e(cVar11, gVar, cVar11, 0);
            } else {
                z12 = false;
            }
            if (z11 && z12) {
                j(cVar5).a(gVar.j(cVar5), 0);
                return;
            }
            if (z11) {
                c cVar12 = c.CENTER_X;
                j(cVar12).a(gVar.j(cVar12), 0);
                return;
            } else {
                if (z12) {
                    c cVar13 = c.CENTER_Y;
                    j(cVar13).a(gVar.j(cVar13), 0);
                    return;
                }
                return;
            }
        }
        c cVar14 = c.CENTER_X;
        if (cVar == cVar14 && (cVar2 == (cVar4 = c.LEFT) || cVar2 == c.RIGHT)) {
            d dVarJ5 = j(cVar4);
            d dVarJ6 = gVar.j(cVar2);
            d dVarJ7 = j(c.RIGHT);
            dVarJ5.a(dVarJ6, 0);
            dVarJ7.a(dVarJ6, 0);
            j(cVar14).a(dVarJ6, 0);
            return;
        }
        c cVar15 = c.CENTER_Y;
        if (cVar == cVar15 && (cVar2 == (cVar3 = c.TOP) || cVar2 == c.BOTTOM)) {
            d dVarJ8 = gVar.j(cVar2);
            j(cVar3).a(dVarJ8, 0);
            j(c.BOTTOM).a(dVarJ8, 0);
            j(cVar15).a(dVarJ8, 0);
            return;
        }
        if (cVar == cVar14 && cVar2 == cVar14) {
            c cVar16 = c.LEFT;
            j(cVar16).a(gVar.j(cVar16), 0);
            c cVar17 = c.RIGHT;
            j(cVar17).a(gVar.j(cVar17), 0);
            j(cVar14).a(gVar.j(cVar2), 0);
            return;
        }
        if (cVar == cVar15 && cVar2 == cVar15) {
            c cVar18 = c.TOP;
            j(cVar18).a(gVar.j(cVar18), 0);
            c cVar19 = c.BOTTOM;
            j(cVar19).a(gVar.j(cVar19), 0);
            j(cVar15).a(gVar.j(cVar2), 0);
            return;
        }
        d dVarJ9 = j(cVar);
        d dVarJ10 = gVar.j(cVar2);
        if (dVarJ9.i(dVarJ10)) {
            c cVar20 = c.BASELINE;
            if (cVar == cVar20) {
                d dVarJ11 = j(c.TOP);
                d dVarJ12 = j(c.BOTTOM);
                if (dVarJ11 != null) {
                    dVarJ11.j();
                }
                if (dVarJ12 != null) {
                    dVarJ12.j();
                }
            } else if (cVar == c.TOP || cVar == c.BOTTOM) {
                d dVarJ13 = j(cVar20);
                if (dVarJ13 != null) {
                    dVarJ13.j();
                }
                d dVarJ14 = j(cVar5);
                if (dVarJ14.f23111f != dVarJ10) {
                    dVarJ14.j();
                }
                d dVarF = j(cVar).f();
                d dVarJ15 = j(cVar15);
                if (dVarJ15.h()) {
                    dVarF.j();
                    dVarJ15.j();
                }
            } else if (cVar == c.LEFT || cVar == c.RIGHT) {
                d dVarJ16 = j(cVar5);
                if (dVarJ16.f23111f != dVarJ10) {
                    dVarJ16.j();
                }
                d dVarF2 = j(cVar).f();
                d dVarJ17 = j(cVar14);
                if (dVarJ17.h()) {
                    dVarF2.j();
                    dVarJ17.j();
                }
            }
            dVarJ9.a(dVarJ10, i11);
        }
    }

    public final void f(d dVar, d dVar2, int i11) {
        if (dVar.f23109d == this) {
            e(dVar.f23110e, dVar2.f23109d, dVar2.f23110e, i11);
        }
    }

    public void g(g gVar, HashMap map) {
        this.f23143o = gVar.f23143o;
        this.f23145p = gVar.f23145p;
        this.f23149r = gVar.f23149r;
        this.f23151s = gVar.f23151s;
        int[] iArr = gVar.f23153t;
        int i11 = iArr[0];
        int[] iArr2 = this.f23153t;
        iArr2[0] = i11;
        iArr2[1] = iArr[1];
        this.f23155u = gVar.f23155u;
        this.f23156v = gVar.f23156v;
        this.f23158x = gVar.f23158x;
        this.f23159y = gVar.f23159y;
        this.f23160z = gVar.f23160z;
        this.A = gVar.A;
        this.B = gVar.B;
        int[] iArr3 = gVar.C;
        this.C = Arrays.copyOf(iArr3, iArr3.length);
        this.D = gVar.D;
        this.E = gVar.E;
        this.F = gVar.F;
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.U = (f[]) Arrays.copyOf(this.U, 2);
        this.V = this.V == null ? null : (g) map.get(gVar.V);
        this.W = gVar.W;
        this.X = gVar.X;
        this.Y = gVar.Y;
        this.Z = gVar.Z;
        this.f23117a0 = gVar.f23117a0;
        this.f23119b0 = gVar.f23119b0;
        this.f23121c0 = gVar.f23121c0;
        this.f23123d0 = gVar.f23123d0;
        this.f23125e0 = gVar.f23125e0;
        this.f23127f0 = gVar.f23127f0;
        this.f23129g0 = gVar.f23129g0;
        this.f23131h0 = gVar.f23131h0;
        this.f23133i0 = gVar.f23133i0;
        this.f23135j0 = gVar.f23135j0;
        this.f23137k0 = gVar.f23137k0;
        this.f23139l0 = gVar.f23139l0;
        this.f23140m0 = gVar.f23140m0;
        float[] fArr = gVar.f23142n0;
        float f5 = fArr[0];
        float[] fArr2 = this.f23142n0;
        fArr2[0] = f5;
        fArr2[1] = fArr[1];
        g[] gVarArr = gVar.f23144o0;
        g gVar2 = gVarArr[0];
        g[] gVarArr2 = this.f23144o0;
        gVarArr2[0] = gVar2;
        gVarArr2[1] = gVarArr[1];
        g[] gVarArr3 = gVar.f23146p0;
        g gVar3 = gVarArr3[0];
        g[] gVarArr4 = this.f23146p0;
        gVarArr4[0] = gVar3;
        gVarArr4[1] = gVarArr3[1];
        g gVar4 = gVar.f23148q0;
        this.f23148q0 = gVar4 == null ? null : (g) map.get(gVar4);
        g gVar5 = gVar.f23150r0;
        this.f23150r0 = gVar5 != null ? (g) map.get(gVar5) : null;
    }

    public final void h(b4.c cVar) {
        cVar.k(this.J);
        cVar.k(this.K);
        cVar.k(this.L);
        cVar.k(this.M);
        if (this.f23121c0 > 0) {
            cVar.k(this.N);
        }
    }

    public final void i() {
        if (this.f23122d == null) {
            e4.m mVar = new e4.m(this);
            mVar.f24833h.f24803e = e4.f.LEFT;
            mVar.f24834i.f24803e = e4.f.RIGHT;
            mVar.f24831f = 0;
            this.f23122d = mVar;
        }
        if (this.f23124e == null) {
            e4.p pVar = new e4.p(this);
            e4.g gVar = new e4.g(pVar);
            pVar.f24817k = gVar;
            pVar.f24818l = null;
            pVar.f24833h.f24803e = e4.f.TOP;
            pVar.f24834i.f24803e = e4.f.BOTTOM;
            gVar.f24803e = e4.f.BASELINE;
            pVar.f24831f = 1;
            this.f23124e = pVar;
        }
    }

    public d j(c cVar) {
        switch (e.f23115a[cVar.ordinal()]) {
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            case 9:
                return null;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public final f k(int i11) {
        if (i11 == 0) {
            return this.U[0];
        }
        if (i11 == 1) {
            return this.U[1];
        }
        return null;
    }

    public final int l() {
        if (this.f23133i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final g m(int i11) {
        d dVar;
        d dVar2;
        if (i11 != 0) {
            if (i11 == 1 && (dVar2 = (dVar = this.M).f23111f) != null && dVar2.f23111f == dVar) {
                return dVar2.f23109d;
            }
            return null;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f23111f;
        if (dVar4 == null || dVar4.f23111f != dVar3) {
            return null;
        }
        return dVar4.f23109d;
    }

    public final g n(int i11) {
        d dVar;
        d dVar2;
        if (i11 != 0) {
            if (i11 == 1 && (dVar2 = (dVar = this.K).f23111f) != null && dVar2.f23111f == dVar) {
                return dVar2.f23109d;
            }
            return null;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f23111f;
        if (dVar4 == null || dVar4.f23111f != dVar3) {
            return null;
        }
        return dVar4.f23109d;
    }

    public void o(StringBuilder sb2) {
        sb2.append("  " + this.f23134j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.W);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.X);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f23117a0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f23119b0);
        sb2.append("\n");
        q(sb2, "left", this.J);
        q(sb2, "top", this.K);
        q(sb2, "right", this.L);
        q(sb2, "bottom", this.M);
        q(sb2, "baseline", this.N);
        q(sb2, "centerX", this.O);
        q(sb2, "centerY", this.P);
        int i11 = this.W;
        int i12 = this.f23123d0;
        int i13 = this.C[0];
        int i14 = this.f23155u;
        int i15 = this.f23149r;
        float f5 = this.f23157w;
        f fVar = this.U[0];
        float[] fArr = this.f23142n0;
        float f11 = fArr[0];
        p(sb2, "    width", i11, i12, i13, i14, i15, f5, fVar);
        int i16 = this.X;
        int i17 = this.f23125e0;
        int i18 = this.C[1];
        int i19 = this.f23158x;
        int i21 = this.f23151s;
        float f12 = this.f23160z;
        f fVar2 = this.U[1];
        float f13 = fArr[1];
        p(sb2, "    height", i16, i17, i18, i19, i21, f12, fVar2);
        float f14 = this.Y;
        int i22 = this.Z;
        if (f14 != CropImageView.DEFAULT_ASPECT_RATIO) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i22);
            sb2.append(BuildConfig.VERSION_NAME);
            sb2.append("],\n");
        }
        I(sb2, "    horizontalBias", this.f23127f0, 0.5f);
        I(sb2, "    verticalBias", this.f23129g0, 0.5f);
        H(this.f23139l0, 0, "    horizontalChainStyle", sb2);
        H(this.f23140m0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int r() {
        if (this.f23133i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public final int s() {
        g gVar = this.V;
        return (gVar == null || !(gVar instanceof h)) ? this.f23117a0 : ((h) gVar).B0 + this.f23117a0;
    }

    public final int t() {
        g gVar = this.V;
        return (gVar == null || !(gVar instanceof h)) ? this.f23119b0 : ((h) gVar).C0 + this.f23119b0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    public final boolean u(int i11) {
        if (i11 == 0) {
            if ((this.J.f23111f != null ? 1 : 0) + (this.L.f23111f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.K.f23111f != null ? 1 : 0) + (this.M.f23111f != null ? 1 : 0) + (this.N.f23111f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean v(int i11, int i12) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i11 == 0) {
            d dVar5 = this.J;
            d dVar6 = dVar5.f23111f;
            if (dVar6 == null || !dVar6.f23108c || (dVar4 = (dVar3 = this.L).f23111f) == null || !dVar4.f23108c) {
                return false;
            }
            return (dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f23111f.d()) >= i12;
        }
        d dVar7 = this.K;
        d dVar8 = dVar7.f23111f;
        if (dVar8 == null || !dVar8.f23108c || (dVar2 = (dVar = this.M).f23111f) == null || !dVar2.f23108c) {
            return false;
        }
        return (dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f23111f.d()) >= i12;
    }

    public final void w(c cVar, g gVar, c cVar2, int i11, int i12) {
        j(cVar).b(gVar.j(cVar2), i11, i12, true);
    }

    public final boolean x(int i11) {
        d dVar;
        d dVar2;
        int i12 = i11 * 2;
        d[] dVarArr = this.R;
        d dVar3 = dVarArr[i12];
        d dVar4 = dVar3.f23111f;
        return (dVar4 == null || dVar4.f23111f == dVar3 || (dVar2 = (dVar = dVarArr[i12 + 1]).f23111f) == null || dVar2.f23111f != dVar) ? false : true;
    }

    public final boolean y() {
        d dVar = this.J;
        d dVar2 = dVar.f23111f;
        if (dVar2 != null && dVar2.f23111f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f23111f;
        return dVar4 != null && dVar4.f23111f == dVar3;
    }

    public final boolean z() {
        d dVar = this.K;
        d dVar2 = dVar.f23111f;
        if (dVar2 != null && dVar2.f23111f == dVar) {
            return true;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f23111f;
        return dVar4 != null && dVar4.f23111f == dVar3;
    }

    public String toString() {
        String strK = BuildConfig.VERSION_NAME;
        StringBuilder sbN = ep.a.n(BuildConfig.VERSION_NAME);
        if (this.f23137k0 != null) {
            strK = ep.a.k(new StringBuilder(txBUGYhC.iwo), this.f23137k0, " ");
        }
        sbN.append(strK);
        sbN.append("(");
        sbN.append(this.f23117a0);
        sbN.append(", ");
        sbN.append(this.f23119b0);
        sbN.append(") - (");
        sbN.append(this.W);
        sbN.append(" x ");
        return p0.i(this.X, ")", sbN);
    }
}
