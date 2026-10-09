package p7;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements z, x7.o, t7.j, t7.m {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Map f46462r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final y6.p f46463s0;
    public final t7.g H;
    public final long K;
    public final y6.p L;
    public final long M;
    public final t7.n N;
    public final b O;
    public final b7.f P;
    public final n0 Q;
    public final n0 R;
    public final Handler S;
    public y T;
    public k8.b U;
    public y0[] V;
    public r0[] W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f46464a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f46465a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.f f46466b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public dm.c f46467b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k7.g f46468c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public x7.y f46469c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final re.v f46470d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f46471d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7.c f46472e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f46473e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k7.c f46474f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f46475f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f46476g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f46477h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f46478i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f46479j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f46480k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f46481l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f46482m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f46483n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f46484o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f46485p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f46486q0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v0 f46487t;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f46462r0 = Collections.unmodifiableMap(map);
        y6.o oVar = new y6.o();
        oVar.f57253a = "icy";
        oVar.m = y6.d0.o("application/x-icy");
        f46463s0 = new y6.p(oVar);
    }

    public s0(Uri uri, d7.f fVar, b bVar, k7.g gVar, k7.c cVar, re.v vVar, k7.c cVar2, v0 v0Var, t7.g gVar2, int i11, y6.p pVar, long j11, u7.a aVar) {
        this.f46464a = uri;
        this.f46466b = fVar;
        this.f46468c = gVar;
        this.f46474f = cVar;
        this.f46470d = vVar;
        this.f46472e = cVar2;
        this.f46487t = v0Var;
        this.H = gVar2;
        this.K = i11;
        this.L = pVar;
        this.N = aVar != null ? new t7.n(aVar) : new t7.n("ProgressiveMediaPeriod");
        this.O = bVar;
        this.M = j11;
        this.P = new b7.f();
        this.Q = new n0(this, 0);
        this.R = new n0(this, 1);
        this.S = b7.f0.m(null);
        this.W = new r0[0];
        this.V = new y0[0];
        this.f46482m0 = -9223372036854775807L;
        this.f46475f0 = 1;
    }

    public final void A(int i11) {
        b();
        dm.c cVar = this.f46467b0;
        boolean[] zArr = (boolean[]) cVar.f23493e;
        if (zArr[i11]) {
            return;
        }
        y6.p pVar = ((g1) cVar.f23490b).a(i11).f57307d[0];
        this.f46472e.b(y6.d0.i(pVar.f57291n), pVar, 0, null, this.f46481l0);
        zArr[i11] = true;
    }

    public final void B(int i11) {
        b();
        if (this.f46483n0) {
            if ((!this.Z || ((boolean[]) this.f46467b0.f23491c)[i11]) && !this.V[i11].p(false)) {
                this.f46482m0 = 0L;
                this.f46483n0 = false;
                this.f46477h0 = true;
                this.f46481l0 = 0L;
                this.f46484o0 = 0;
                for (y0 y0Var : this.V) {
                    y0Var.t(false);
                }
                y yVar = this.T;
                yVar.getClass();
                yVar.b(this);
            }
        }
    }

    public final x7.e0 C(r0 r0Var) {
        int length = this.V.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (r0Var.equals(this.W[i11])) {
                return this.V[i11];
            }
        }
        if (this.X) {
            b7.a.B("Extractor added new track (id=" + r0Var.f46458a + ") after finishing tracks.");
            return new x7.l();
        }
        k7.g gVar = this.f46468c;
        gVar.getClass();
        y0 y0Var = new y0(this.H, gVar, this.f46474f);
        y0Var.f46543f = this;
        int i12 = length + 1;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.W, i12);
        r0VarArr[length] = r0Var;
        String str = b7.f0.f3975a;
        this.W = r0VarArr;
        y0[] y0VarArr = (y0[]) Arrays.copyOf(this.V, i12);
        y0VarArr[length] = y0Var;
        this.V = y0VarArr;
        return y0Var;
    }

    public final void D(x7.y yVar) {
        this.f46469c0 = this.U == null ? yVar : new x7.q(-9223372036854775807L);
        this.f46471d0 = yVar.k();
        boolean z11 = !this.f46480k0 && yVar.k() == -9223372036854775807L;
        this.f46473e0 = z11;
        this.f46475f0 = z11 ? 7 : 1;
        if (this.Y) {
            this.f46487t.t(this.f46471d0, yVar, z11);
        } else {
            z();
        }
    }

    public final void E() {
        p0 p0Var = new p0(this, this.f46464a, this.f46466b, this.O, this, this.P);
        if (this.Y) {
            b7.a.j(y());
            long j11 = this.f46471d0;
            if (j11 != -9223372036854775807L && this.f46482m0 > j11) {
                this.f46485p0 = true;
                this.f46482m0 = -9223372036854775807L;
                return;
            }
            x7.y yVar = this.f46469c0;
            yVar.getClass();
            long j12 = yVar.i(this.f46482m0).f55956a.f55960b;
            long j13 = this.f46482m0;
            p0Var.f46448f.f38845a = j12;
            p0Var.K = j13;
            p0Var.H = true;
            p0Var.N = false;
            for (y0 y0Var : this.V) {
                y0Var.f46556t = this.f46482m0;
            }
            this.f46482m0 = -9223372036854775807L;
        }
        this.f46484o0 = f();
        this.N.d(p0Var, this, this.f46470d.w(this.f46475f0));
    }

    public final boolean F() {
        return this.f46477h0 || y();
    }

    @Override // p7.b1
    public final boolean a() {
        boolean z11;
        if (!this.N.a()) {
            return false;
        }
        b7.f fVar = this.P;
        synchronized (fVar) {
            z11 = fVar.f3974b;
        }
        return z11;
    }

    public final void b() {
        b7.a.j(this.Y);
        this.f46467b0.getClass();
        this.f46469c0.getClass();
    }

    @Override // t7.j
    public final void c(t7.l lVar, long j11, long j12) {
        p0 p0Var = (p0) lVar;
        if (this.f46471d0 == -9223372036854775807L && this.f46469c0 != null) {
            long jM = m(true);
            long j13 = jM == Long.MIN_VALUE ? 0L : jM + 10000;
            this.f46471d0 = j13;
            this.f46487t.t(j13, this.f46469c0, this.f46473e0);
        }
        d7.p pVar = p0Var.f46444b;
        Uri uri = pVar.f23255c;
        s sVar = new s(pVar.f23256d);
        this.f46470d.getClass();
        this.f46472e.d(sVar, 1, -1, null, 0, null, p0Var.K, this.f46471d0);
        this.f46485p0 = true;
        y yVar = this.T;
        yVar.getClass();
        yVar.b(this);
    }

    @Override // t7.m
    public final void d() {
        for (y0 y0Var : this.V) {
            y0Var.t(true);
            hd.b bVar = y0Var.f46545h;
            if (bVar != null) {
                bVar.x(y0Var.f46542e);
                y0Var.f46545h = null;
                y0Var.f46544g = null;
            }
        }
        b bVar2 = this.O;
        x7.m mVar = bVar2.f46326b;
        if (mVar != null) {
            mVar.release();
            bVar2.f46326b = null;
        }
        bVar2.f46327c = null;
    }

    @Override // t7.j
    public final f9.e e(t7.l lVar, long j11, long j12, IOException iOException, int i11) {
        long jMin;
        f9.e eVar;
        x7.y yVar;
        p0 p0Var = (p0) lVar;
        d7.p pVar = p0Var.f46444b;
        Uri uri = pVar.f23255c;
        s sVar = new s(pVar.f23256d);
        String str = b7.f0.f3975a;
        this.f46470d.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = DataSourceException.f2114b;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i11 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f2115a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            eVar = t7.n.f52096e;
        } else {
            int iF = f();
            int i13 = iF > this.f46484o0 ? 1 : 0;
            if (this.f46480k0 || !((yVar = this.f46469c0) == null || yVar.k() == -9223372036854775807L)) {
                this.f46484o0 = iF;
            } else if (!this.Y || F()) {
                this.f46477h0 = this.Y;
                this.f46481l0 = 0L;
                this.f46484o0 = 0;
                for (y0 y0Var : this.V) {
                    y0Var.t(false);
                }
                p0Var.f46448f.f38845a = 0L;
                p0Var.K = 0L;
                p0Var.H = true;
                p0Var.N = false;
            } else {
                this.f46483n0 = true;
                eVar = t7.n.f52095d;
            }
            eVar = new f9.e(i13, jMin, false);
        }
        f9.e eVar2 = eVar;
        int i14 = eVar2.f27021b;
        this.f46472e.e(sVar, 1, -1, null, 0, null, p0Var.K, this.f46471d0, iOException, !(i14 == 0 || i14 == 1));
        return eVar2;
    }

    public final int f() {
        int i11 = 0;
        for (y0 y0Var : this.V) {
            i11 += y0Var.f46553q + y0Var.f46552p;
        }
        return i11;
    }

    @Override // t7.j
    public final void g(t7.l lVar, long j11, long j12, boolean z11) {
        p0 p0Var = (p0) lVar;
        d7.p pVar = p0Var.f46444b;
        Uri uri = pVar.f23255c;
        s sVar = new s(pVar.f23256d);
        this.f46470d.getClass();
        this.f46472e.c(sVar, 1, -1, null, 0, null, p0Var.K, this.f46471d0);
        if (z11) {
            return;
        }
        for (y0 y0Var : this.V) {
            y0Var.t(false);
        }
        if (this.f46479j0 > 0) {
            y yVar = this.T;
            yVar.getClass();
            yVar.b(this);
        }
    }

    @Override // p7.b1
    public final long h() {
        return w();
    }

    @Override // p7.z
    public final long i(long j11, f7.h1 h1Var) {
        b();
        if (!this.f46469c0.d()) {
            return 0L;
        }
        x7.x xVarI = this.f46469c0.i(j11);
        return h1Var.a(j11, xVarI.f55956a.f55959a, xVarI.f55957b.f55959a);
    }

    @Override // p7.z
    public final void j() throws IOException {
        int iW = this.f46470d.w(this.f46475f0);
        t7.n nVar = this.N;
        IOException iOException = nVar.f52099c;
        if (iOException != null) {
            throw iOException;
        }
        t7.k kVar = nVar.f52098b;
        if (kVar != null) {
            if (iW == Integer.MIN_VALUE) {
                iW = kVar.f52088a;
            }
            IOException iOException2 = kVar.f52092e;
            if (iOException2 != null && kVar.f52093f > iW) {
                throw iOException2;
            }
        }
        if (this.f46485p0 && !this.Y) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087 A[LOOP:1: B:42:0x0085->B:43:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1 A[LOOP:2: B:47:0x009f->B:48:0x00a1, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0081, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0098, please report this as an issue */
    @Override // p7.z
    public final long k(long j11) {
        int i11;
        int i12;
        b();
        boolean[] zArr = (boolean[]) this.f46467b0.f23491c;
        if (!this.f46469c0.d()) {
            j11 = 0;
        }
        this.f46477h0 = false;
        boolean z11 = true;
        boolean z12 = this.f46481l0 == j11;
        this.f46481l0 = j11;
        if (y()) {
            this.f46482m0 = j11;
            return j11;
        }
        int i13 = this.f46475f0;
        t7.n nVar = this.N;
        if (i13 == 7 || !(this.f46485p0 || nVar.a())) {
            this.f46483n0 = false;
            this.f46482m0 = j11;
            this.f46485p0 = false;
            this.f46478i0 = false;
            if (nVar.a()) {
                for (y0 y0Var : this.V) {
                    y0Var.g();
                }
                t7.k kVar = nVar.f52098b;
                b7.a.k(kVar);
                kVar.a(false);
                return j11;
            }
            nVar.f52099c = null;
            for (y0 y0Var2 : this.V) {
                y0Var2.t(false);
            }
        } else {
            int length = this.V.length;
            for (int i14 = 0; i14 < length; i14++) {
                y0 y0Var3 = this.V[i14];
                if (y0Var3.m() != 0 || !z12) {
                    if (!(this.f46465a0 ? y0Var3.u(y0Var3.f46553q) : y0Var3.v(j11, this.f46485p0)) && (zArr[i14] || !this.Z)) {
                        z11 = false;
                        break;
                    }
                }
            }
            if (!z11) {
                this.f46483n0 = false;
                this.f46482m0 = j11;
                this.f46485p0 = false;
                this.f46478i0 = false;
                if (nVar.a()) {
                    while (i12 < r2) {
                        y0Var.g();
                    }
                    t7.k kVar2 = nVar.f52098b;
                    b7.a.k(kVar2);
                    kVar2.a(false);
                    return j11;
                }
                nVar.f52099c = null;
                while (i11 < r2) {
                    y0Var2.t(false);
                }
            }
        }
        return j11;
    }

    @Override // p7.z
    public final void l(long j11) throws Throwable {
        if (this.f46465a0) {
            return;
        }
        b();
        if (y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f46467b0.f23492d;
        int length = this.V.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.V[i11].f(j11, zArr[i11]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final long m(boolean z11) {
        y0 y0Var;
        long jMax = Long.MIN_VALUE;
        for (int i11 = 0; i11 < this.V.length; i11++) {
            if (z11) {
                y0Var = this.V[i11];
                synchronized (y0Var) {
                    jMax = Math.max(jMax, y0Var.f46558v);
                }
            } else {
                dm.c cVar = this.f46467b0;
                cVar.getClass();
                if (((boolean[]) cVar.f23492d)[i11]) {
                    y0Var = this.V[i11];
                    synchronized (y0Var) {
                    }
                    jMax = Math.max(jMax, y0Var.f46558v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    @Override // p7.z
    public final void n(y yVar, long j11) {
        this.T = yVar;
        y6.p pVar = this.L;
        if (pVar == null) {
            this.P.c();
            E();
        } else {
            v(0, 3).b(pVar);
            D(new x7.v(-9223372036854775807L, new long[]{0}, new long[]{0}));
            o();
            this.f46482m0 = j11;
        }
    }

    @Override // x7.o
    public final void o() {
        this.X = true;
        this.S.post(this.Q);
    }

    @Override // t7.j
    public final void p(t7.l lVar, long j11, long j12, int i11) {
        s sVar;
        p0 p0Var = (p0) lVar;
        d7.p pVar = p0Var.f46444b;
        if (i11 == 0) {
            sVar = new s(p0Var.L);
        } else {
            Uri uri = pVar.f23255c;
            sVar = new s(pVar.f23256d);
        }
        this.f46472e.f(sVar, 1, -1, null, 0, null, p0Var.K, this.f46471d0, i11);
    }

    @Override // x7.o
    public final void q(x7.y yVar) {
        this.S.post(new b2.c(29, this, yVar));
    }

    @Override // p7.z
    public final long r(s7.s[] sVarArr, boolean[] zArr, z0[] z0VarArr, boolean[] zArr2, long j11) {
        s7.s sVar;
        b();
        dm.c cVar = this.f46467b0;
        g1 g1Var = (g1) cVar.f23490b;
        boolean[] zArr3 = (boolean[]) cVar.f23492d;
        int i11 = this.f46479j0;
        for (int i12 = 0; i12 < sVarArr.length; i12++) {
            z0 z0Var = z0VarArr[i12];
            if (z0Var != null && (sVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((q0) z0Var).f46451a;
                b7.a.j(zArr3[i13]);
                this.f46479j0--;
                zArr3[i13] = false;
                z0VarArr[i12] = null;
            }
        }
        boolean z11 = !this.f46476g0 ? j11 == 0 || this.f46465a0 : i11 != 0;
        for (int i14 = 0; i14 < sVarArr.length; i14++) {
            if (z0VarArr[i14] == null && (sVar = sVarArr[i14]) != null) {
                b7.a.j(sVar.length() == 1);
                b7.a.j(sVar.h(0) == 0);
                int iIndexOf = g1Var.f46389b.indexOf(sVar.b());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                b7.a.j(!zArr3[iIndexOf]);
                this.f46479j0++;
                zArr3[iIndexOf] = true;
                this.f46478i0 = sVar.m().f57297t | this.f46478i0;
                z0VarArr[i14] = new q0(this, iIndexOf);
                zArr2[i14] = true;
                if (!z11) {
                    y0 y0Var = this.V[iIndexOf];
                    z11 = (y0Var.m() == 0 || y0Var.v(j11, true)) ? false : true;
                }
            }
        }
        if (this.f46479j0 == 0) {
            this.f46483n0 = false;
            this.f46477h0 = false;
            this.f46478i0 = false;
            t7.n nVar = this.N;
            if (nVar.a()) {
                for (y0 y0Var2 : this.V) {
                    y0Var2.g();
                }
                t7.k kVar = nVar.f52098b;
                b7.a.k(kVar);
                kVar.a(false);
            } else {
                this.f46485p0 = false;
                for (y0 y0Var3 : this.V) {
                    y0Var3.t(false);
                }
            }
        } else if (z11) {
            j11 = k(j11);
            for (int i15 = 0; i15 < z0VarArr.length; i15++) {
                if (z0VarArr[i15] != null) {
                    zArr2[i15] = true;
                }
            }
        }
        this.f46476g0 = true;
        return j11;
    }

    @Override // p7.z
    public final long s() {
        if (this.f46478i0) {
            this.f46478i0 = false;
            return this.f46481l0;
        }
        if (!this.f46477h0) {
            return -9223372036854775807L;
        }
        if (!this.f46485p0 && f() <= this.f46484o0) {
            return -9223372036854775807L;
        }
        this.f46477h0 = false;
        return this.f46481l0;
    }

    @Override // p7.z
    public final g1 t() {
        b();
        return (g1) this.f46467b0.f23490b;
    }

    @Override // p7.b1
    public final boolean u(f7.j0 j0Var) {
        if (this.f46485p0) {
            return false;
        }
        t7.n nVar = this.N;
        if (nVar.f52099c != null || this.f46483n0) {
            return false;
        }
        if ((this.Y || this.L != null) && this.f46479j0 == 0) {
            return false;
        }
        boolean zC = this.P.c();
        if (nVar.a()) {
            return zC;
        }
        E();
        return true;
    }

    @Override // x7.o
    public final x7.e0 v(int i11, int i12) {
        return C(new r0(i11, false));
    }

    @Override // p7.b1
    public final long w() {
        long jM;
        boolean z11;
        long j11;
        b();
        if (this.f46485p0 || this.f46479j0 == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f46482m0;
        }
        if (this.Z) {
            int length = this.V.length;
            jM = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                dm.c cVar = this.f46467b0;
                if (((boolean[]) cVar.f23491c)[i11] && ((boolean[]) cVar.f23492d)[i11]) {
                    y0 y0Var = this.V[i11];
                    synchronized (y0Var) {
                        z11 = y0Var.f46559w;
                    }
                    if (z11) {
                        continue;
                    } else {
                        y0 y0Var2 = this.V[i11];
                        synchronized (y0Var2) {
                            j11 = y0Var2.f46558v;
                        }
                        jM = Math.min(jM, j11);
                    }
                }
            }
        } else {
            jM = Long.MAX_VALUE;
        }
        if (jM == Long.MAX_VALUE) {
            jM = m(false);
        }
        return jM == Long.MIN_VALUE ? this.f46481l0 : jM;
    }

    public final boolean y() {
        return this.f46482m0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z() {
        y6.p pVar;
        y6.c0 c0VarA;
        long j11 = this.M;
        if (this.f46486q0 || this.Y || !this.X || this.f46469c0 == null) {
            return;
        }
        y0[] y0VarArr = this.V;
        int length = y0VarArr.length;
        char c11 = 0;
        int i11 = 0;
        while (true) {
            y6.p pVar2 = null;
            if (i11 >= length) {
                b7.f fVar = this.P;
                synchronized (fVar) {
                    fVar.f3974b = false;
                }
                int length2 = this.V.length;
                y6.p0[] p0VarArr = new y6.p0[length2];
                boolean[] zArr = new boolean[length2];
                int i12 = 0;
                while (i12 < length2) {
                    y0 y0Var = this.V[i12];
                    synchronized (y0Var) {
                        pVar = y0Var.f46561y ? null : y0Var.B;
                    }
                    pVar.getClass();
                    String str = pVar.f57291n;
                    boolean zK = y6.d0.k(str);
                    boolean z11 = (zK || y6.d0.n(str)) ? true : c11;
                    zArr[i12] = z11;
                    char c12 = c11;
                    this.Z = (this.Z ? 1 : 0) | (z11 ? 1 : 0);
                    this.f46465a0 = (j11 != -9223372036854775807L && length2 == 1 && y6.d0.l(str)) ? 1 : c12;
                    k8.b bVar = this.U;
                    if (bVar != null) {
                        int i13 = bVar.f37965a;
                        if (zK || this.W[i12].f46459b) {
                            y6.c0 c0Var = pVar.f57290l;
                            if (c0Var == null) {
                                y6.b0[] b0VarArr = new y6.b0[1];
                                b0VarArr[c12] = bVar;
                                c0VarA = new y6.c0(b0VarArr);
                            } else {
                                y6.b0[] b0VarArr2 = new y6.b0[1];
                                b0VarArr2[c12] = bVar;
                                c0VarA = c0Var.a(b0VarArr2);
                            }
                            y6.o oVarA = pVar.a();
                            oVarA.f57263k = c0VarA;
                            pVar = new y6.p(oVarA);
                        }
                        if (zK && pVar.f57286h == -1 && pVar.f57287i == -1 && i13 != -1) {
                            y6.o oVarA2 = pVar.a();
                            oVarA2.f57260h = i13;
                            pVar = new y6.p(oVarA2);
                        }
                    }
                    int iB = this.f46468c.b(pVar);
                    y6.o oVarA3 = pVar.a();
                    oVarA3.N = iB;
                    y6.p pVar3 = new y6.p(oVarA3);
                    p0VarArr[i12] = new y6.p0(Integer.toString(i12), pVar3);
                    this.f46478i0 = pVar3.f57297t | this.f46478i0;
                    i12++;
                    c11 = c12;
                }
                this.f46467b0 = new dm.c(new g1(p0VarArr), zArr);
                if (this.f46465a0 && this.f46471d0 == -9223372036854775807L) {
                    this.f46471d0 = j11;
                    this.f46469c0 = new o0(this, this.f46469c0);
                }
                this.f46487t.t(this.f46471d0, this.f46469c0, this.f46473e0);
                this.Y = true;
                y yVar = this.T;
                yVar.getClass();
                yVar.d(this);
                return;
            }
            y0 y0Var2 = y0VarArr[i11];
            synchronized (y0Var2) {
                if (!y0Var2.f46561y) {
                    pVar2 = y0Var2.B;
                }
            }
            if (pVar2 == null) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // p7.b1
    public final void x(long j11) {
    }
}
