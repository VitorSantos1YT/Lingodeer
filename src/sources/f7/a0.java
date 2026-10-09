package f7;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import b0.h2;
import bp.u3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends h2 implements ExoPlayer {
    public boolean A0;
    public TextureView B0;
    public final int C0;
    public b7.x D0;
    public final y6.d E0;
    public float F0;
    public boolean G0;
    public final e[] H;
    public a7.d H0;
    public final boolean I0;
    public boolean J0;
    public final e[] K;
    public final int K0;
    public final s7.v L;
    public y6.z0 L0;
    public final b7.a0 M;
    public y6.a0 M0;
    public final r N;
    public y0 N0;
    public final g0 O;
    public int O0;
    public final b7.n P;
    public long P0;
    public final CopyOnWriteArraySet Q;
    public final y6.m0 R;
    public final ArrayList S;
    public final boolean T;
    public final p7.a0 U;
    public final g7.f V;
    public final Looper W;
    public final t7.e X;
    public final long Y;
    public final long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final long f26632a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final b7.y f26633b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.w f26634c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final x f26635c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y6.f0 f26636d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final y f26637d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b7.f f26638e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final bq.f f26639e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f26640f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final u3 f26641f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final u3 f26642g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final long f26643h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final b7.c f26644i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f26645j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f26646k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f26647l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f26648m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f26649n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f26650o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ImmutableSet f26651p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final g1 f26652q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final h1 f26653r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public p7.c1 f26654s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y6.j0 f26655t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final o f26656t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public y6.f0 f26657u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public y6.a0 f26658v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Object f26659w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Surface f26660x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public SurfaceHolder f26661y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public SphericalGLSurfaceView f26662z0;

    static {
        y6.y.a("media3.exoplayer");
    }

    public a0(n nVar, i1 i1Var) {
        super(11);
        this.f26638e = new b7.f();
        try {
            b7.a.u("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + b7.f0.f3975a + "]");
            Context context = nVar.f26852a;
            Looper looper = nVar.f26859h;
            b7.y yVar = nVar.f26853b;
            this.f26640f = context.getApplicationContext();
            this.V = new g7.f(yVar);
            this.K0 = nVar.f26860i;
            this.E0 = nVar.f26861j;
            this.C0 = nVar.f26862k;
            this.G0 = false;
            this.f26643h0 = nVar.f26870t;
            x xVar = new x(this);
            this.f26635c0 = xVar;
            this.f26637d0 = new y();
            e[] eVarArrL = ((ob.c) nVar.f26854c.get()).l(new Handler(looper), xVar, xVar, xVar, xVar);
            this.H = eVarArrL;
            b7.a.j(eVarArrL.length > 0);
            this.K = new e[eVarArrL.length];
            int i11 = 0;
            while (true) {
                e[] eVarArr = this.K;
                if (i11 >= eVarArr.length) {
                    break;
                }
                int i12 = this.H[i11].f26700b;
                eVarArr[i11] = null;
                i11++;
            }
            this.L = (s7.v) nVar.f26856e.get();
            this.U = (p7.a0) nVar.f26855d.get();
            this.X = (t7.e) nVar.f26858g.get();
            this.T = nVar.f26863l;
            this.f26653r0 = nVar.m;
            this.Y = nVar.f26865o;
            this.Z = nVar.f26866p;
            this.f26632a0 = nVar.f26867q;
            this.f26652q0 = nVar.f26864n;
            this.W = looper;
            this.f26633b0 = yVar;
            this.f26655t = i1Var == null ? this : i1Var;
            this.P = new b7.n(looper, yVar, new f.s(this));
            this.Q = new CopyOnWriteArraySet();
            this.S = new ArrayList();
            this.f26654s0 = new p7.c1();
            this.f26656t0 = o.f26890a;
            e[] eVarArr2 = this.H;
            this.f26634c = new s7.w(new e1[eVarArr2.length], new s7.s[eVarArr2.length], y6.v0.f57369b, null);
            this.R = new y6.m0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i13 = 0; i13 < 20; i13++) {
                int i14 = iArr[i13];
                b7.a.j(!false);
                sparseBooleanArray.append(i14, true);
            }
            this.L.getClass();
            b7.a.j(!false);
            sparseBooleanArray.append(29, true);
            b7.a.j(!false);
            y6.n nVar2 = new y6.n(sparseBooleanArray);
            this.f26636d = new y6.f0(nVar2);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i15 = 0; i15 < nVar2.f57235a.size(); i15++) {
                int iA = nVar2.a(i15);
                b7.a.j(!false);
                sparseBooleanArray2.append(iA, true);
            }
            b7.a.j(!false);
            sparseBooleanArray2.append(4, true);
            b7.a.j(!false);
            sparseBooleanArray2.append(10, true);
            b7.a.j(!false);
            this.f26657u0 = new y6.f0(new y6.n(sparseBooleanArray2));
            this.M = this.f26633b0.a(this.W, null);
            r rVar = new r(this);
            this.N = rVar;
            this.N0 = y0.k(this.f26634c);
            this.V.O(this.f26655t, this.W);
            g7.j jVar = new g7.j(nVar.f26873w);
            g0 g0Var = new g0(this.f26640f, this.H, this.K, this.L, this.f26634c, (j) nVar.f26857f.get(), this.X, this.f26645j0, this.f26646k0, this.V, this.f26653r0, nVar.f26868r, nVar.f26869s, this.W, this.f26633b0, rVar, jVar, this.f26656t0, this.f26637d0);
            Looper looper2 = g0Var.L;
            b7.a0 a0Var = g0Var.H;
            this.O = g0Var;
            this.F0 = 1.0f;
            this.f26645j0 = 0;
            y6.a0 a0Var2 = y6.a0.B;
            this.f26658v0 = a0Var2;
            this.M0 = a0Var2;
            this.O0 = -1;
            this.H0 = a7.d.f432c;
            this.I0 = true;
            i(this.V);
            t7.e eVar = this.X;
            Handler handler = new Handler(this.W);
            g7.f fVar = this.V;
            t7.i iVar = (t7.i) eVar;
            iVar.getClass();
            fVar.getClass();
            t7.d dVar = iVar.f52076c;
            dVar.getClass();
            CopyOnWriteArrayList<t7.c> copyOnWriteArrayList = (CopyOnWriteArrayList) dVar.f52059b;
            for (t7.c cVar : copyOnWriteArrayList) {
                if (cVar.f52056b == fVar) {
                    cVar.f52057c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new t7.c(handler, fVar));
            this.Q.add(this.f26635c0);
            if (Build.VERSION.SDK_INT >= 31) {
                this.f26633b0.a(looper2, null).c(new com.google.firebase.crashlytics.internal.common.i(this.f26640f, nVar.f26871u, this, jVar));
            }
            Looper looper3 = this.W;
            b7.y yVar2 = this.f26633b0;
            r rVar2 = new r(this);
            b7.c cVar2 = new b7.c();
            cVar2.f3959b = yVar2.a(looper2, null);
            cVar2.f3960c = yVar2.a(looper3, null);
            cVar2.f3962e = 0;
            cVar2.f3963f = 0;
            cVar2.f3961d = rVar2;
            this.f26644i0 = cVar2;
            cVar2.d(new b2.a(this, 14));
            Context context2 = nVar.f26852a;
            Looper looper4 = nVar.f26859h;
            x xVar2 = this.f26635c0;
            b7.y yVar3 = this.f26633b0;
            bq.f fVar2 = new bq.f();
            fVar2.f4944b = context2.getApplicationContext();
            fVar2.f4946d = yVar3.a(looper2, null);
            fVar2.f4945c = new a(fVar2, yVar3.a(looper4, null), xVar2);
            this.f26639e0 = fVar2;
            fVar2.p();
            this.f26641f0 = new u3(context, looper2, this.f26633b0, 2);
            this.f26642g0 = new u3(context, looper2, this.f26633b0, 3);
            int i16 = y6.i.f57203c;
            this.L0 = y6.z0.f57406d;
            this.D0 = b7.x.f4042c;
            a0Var.a(38, this.f26652q0).b();
            y6.d dVar2 = this.E0;
            a0Var.getClass();
            b7.z zVarB = b7.a0.b();
            zVarB.f4046a = a0Var.f3950a.obtainMessage(31, 0, 0, dVar2);
            zVarB.b();
            F0(1, 3, this.E0);
            F0(2, 4, Integer.valueOf(this.C0));
            F0(2, 5, 0);
            F0(1, 9, Boolean.valueOf(this.G0));
            F0(6, 8, this.f26637d0);
            F0(-1, 16, Integer.valueOf(this.K0));
        } finally {
            this.f26638e.c();
        }
    }

    public static y0 A0(y0 y0Var, int i11) {
        y0 y0VarH = y0Var.h(i11);
        return (i11 == 1 || i11 == 4) ? y0VarH.b(false) : y0VarH;
    }

    public static long z0(y0 y0Var) {
        y6.n0 n0Var = new y6.n0();
        y6.m0 m0Var = new y6.m0();
        y0Var.f26953a.g(y0Var.f26954b.f46328a, m0Var);
        long j11 = y0Var.f26955c;
        return j11 == -9223372036854775807L ? y0Var.f26953a.m(m0Var.f57230c, n0Var, 0L).f57249l : m0Var.f57232e + j11;
    }

    @Override // y6.j0
    public final void A(SurfaceView surfaceView) {
        Q0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        Q0();
        if (holder == null || holder != this.f26661y0) {
            return;
        }
        t0();
    }

    @Override // y6.j0
    public final void B(y6.h0 h0Var) {
        Q0();
        h0Var.getClass();
        b7.n nVar = this.P;
        nVar.f();
        CopyOnWriteArraySet<b7.m> copyOnWriteArraySet = (CopyOnWriteArraySet) nVar.f4008f;
        for (b7.m mVar : copyOnWriteArraySet) {
            if (mVar.f3999a.equals(h0Var)) {
                b7.l lVar = (b7.l) nVar.f4007e;
                mVar.f4002d = true;
                if (mVar.f4001c) {
                    mVar.f4001c = false;
                    lVar.a(mVar.f3999a, mVar.f4000b.b());
                }
                copyOnWriteArraySet.remove(mVar);
            }
        }
    }

    public final y0 B0(y0 y0Var, y6.o0 o0Var, Pair pair) {
        b7.a.d(o0Var.p() || pair != null);
        y6.o0 o0Var2 = y0Var.f26953a;
        long jV0 = v0(y0Var);
        y0 y0VarJ = y0Var.j(o0Var);
        if (o0Var.p()) {
            p7.b0 b0Var = y0.f26952u;
            long jK = b7.f0.K(this.P0);
            y0 y0VarC = y0VarJ.d(b0Var, jK, jK, jK, 0L, p7.g1.f46387d, this.f26634c, ImmutableList.s()).c(b0Var);
            y0VarC.f26968q = y0VarC.f26970s;
            return y0VarC;
        }
        Object obj = y0VarJ.f26954b.f46328a;
        boolean zEquals = obj.equals(pair.first);
        p7.b0 b0Var2 = !zEquals ? new p7.b0(pair.first) : y0VarJ.f26954b;
        long jLongValue = ((Long) pair.second).longValue();
        long jK2 = b7.f0.K(jV0);
        if (!o0Var2.p()) {
            jK2 -= o0Var2.g(obj, this.R).f57232e;
        }
        if (!zEquals || jLongValue < jK2) {
            p7.b0 b0Var3 = b0Var2;
            b7.a.j(!b0Var3.b());
            y0 y0VarC2 = y0VarJ.d(b0Var3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? p7.g1.f46387d : y0VarJ.f26960h, !zEquals ? this.f26634c : y0VarJ.f26961i, !zEquals ? ImmutableList.s() : y0VarJ.f26962j).c(b0Var3);
            y0VarC2.f26968q = jLongValue;
            return y0VarC2;
        }
        if (jLongValue != jK2) {
            p7.b0 b0Var4 = b0Var2;
            b7.a.j(!b0Var4.b());
            long jMax = Math.max(0L, y0VarJ.f26969r - (jLongValue - jK2));
            long j11 = y0VarJ.f26968q;
            if (y0VarJ.f26963k.equals(y0VarJ.f26954b)) {
                j11 = jLongValue + jMax;
            }
            y0 y0VarD = y0VarJ.d(b0Var4, jLongValue, jLongValue, jLongValue, jMax, y0VarJ.f26960h, y0VarJ.f26961i, y0VarJ.f26962j);
            y0VarD.f26968q = j11;
            return y0VarD;
        }
        int iB = o0Var.b(y0VarJ.f26963k.f46328a);
        if (iB != -1 && o0Var.f(iB, this.R, false).f57230c == o0Var.g(b0Var2.f46328a, this.R).f57230c) {
            return y0VarJ;
        }
        o0Var.g(b0Var2.f46328a, this.R);
        long jA = b0Var2.b() ? this.R.a(b0Var2.f46329b, b0Var2.f46330c) : this.R.f57231d;
        p7.b0 b0Var5 = b0Var2;
        y0 y0VarC3 = y0VarJ.d(b0Var5, y0VarJ.f26970s, y0VarJ.f26970s, y0VarJ.f26956d, jA - y0VarJ.f26970s, y0VarJ.f26960h, y0VarJ.f26961i, y0VarJ.f26962j).c(b0Var5);
        y0VarC3.f26968q = jA;
        return y0VarC3;
    }

    @Override // y6.j0
    public final int C() {
        Q0();
        return this.N0.f26965n;
    }

    public final Pair C0(y6.o0 o0Var, int i11, long j11) {
        if (o0Var.p()) {
            this.O0 = i11;
            if (j11 == -9223372036854775807L) {
                j11 = 0;
            }
            this.P0 = j11;
            return null;
        }
        if (i11 == -1 || i11 >= o0Var.o()) {
            i11 = o0Var.a(this.f26646k0);
            j11 = b7.f0.V(o0Var.m(i11, (y6.n0) this.f3561b, 0L).f57249l);
        }
        return o0Var.i((y6.n0) this.f3561b, this.R, i11, b7.f0.K(j11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y6.j0
    public final void D(y6.t0 t0Var) {
        y6.t0 t0VarA;
        Q0();
        s7.v vVar = this.L;
        vVar.getClass();
        y6.t0 t0VarJ = J();
        if (this.f26650o0) {
            this.f26651p0 = t0Var.f57357t;
            ImmutableSet immutableSet = this.f26652q0.f26775a;
            y6.s0 s0VarA = t0Var.a();
            UnmodifiableIterator it = immutableSet.iterator();
            while (it.hasNext()) {
                s0VarA.i(((Integer) it.next()).intValue(), true);
            }
            t0VarA = s0VarA.a();
        } else {
            t0VarA = t0Var;
        }
        if (!t0VarA.equals(((s7.q) vVar).e())) {
            vVar.b(t0VarA);
        }
        if (t0VarJ.equals(t0Var)) {
            return;
        }
        this.P.e(19, new com.google.firebase.database.android.d(t0Var, 13));
    }

    public final void D0(final int i11, final int i12) {
        b7.x xVar = this.D0;
        if (i11 == xVar.f4043a && i12 == xVar.f4044b) {
            return;
        }
        this.D0 = new b7.x(i11, i12);
        this.P.e(24, new b7.k() { // from class: f7.q
            @Override // b7.k
            public final void invoke(Object obj) {
                ((y6.h0) obj).E(i11, i12);
            }
        });
        F0(2, 14, new b7.x(i11, i12));
    }

    @Override // y6.j0
    public final int E() {
        Q0();
        return this.f26645j0;
    }

    public final void E0() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.f26662z0;
        x xVar = this.f26635c0;
        if (sphericalGLSurfaceView != null) {
            b1 b1VarU0 = u0(this.f26637d0);
            b7.a.j(!b1VarU0.f26671f);
            b1VarU0.f26668c = 10000;
            b7.a.j(!b1VarU0.f26671f);
            b1VarU0.f26669d = null;
            b1VarU0.b();
            this.f26662z0.f2147a.remove(xVar);
            this.f26662z0 = null;
        }
        TextureView textureView = this.B0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != xVar) {
                b7.a.B("SurfaceTextureListener already unset or replaced.");
            } else {
                this.B0.setSurfaceTextureListener(null);
            }
            this.B0 = null;
        }
        SurfaceHolder surfaceHolder = this.f26661y0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(xVar);
            this.f26661y0 = null;
        }
    }

    @Override // y6.j0
    public final y6.o0 F() {
        Q0();
        return this.N0.f26953a;
    }

    public final void F0(int i11, int i12, Object obj) {
        for (e eVar : this.H) {
            if (i11 == -1 || eVar.f26700b == i11) {
                b1 b1VarU0 = u0(eVar);
                b7.a.j(!b1VarU0.f26671f);
                b1VarU0.f26668c = i12;
                b7.a.j(!b1VarU0.f26671f);
                b1VarU0.f26669d = obj;
                b1VarU0.b();
            }
        }
        for (e eVar2 : this.K) {
            if (eVar2 != null && (i11 == -1 || eVar2.f26700b == i11)) {
                b1 b1VarU1 = u0(eVar2);
                b7.a.j(!b1VarU1.f26671f);
                b1VarU1.f26668c = i12;
                b7.a.j(!b1VarU1.f26671f);
                b1VarU1.f26669d = obj;
                b1VarU1.b();
            }
        }
    }

    @Override // y6.j0
    public final Looper G() {
        return this.W;
    }

    public final void G0(p7.a aVar) {
        Q0();
        List listSingletonList = Collections.singletonList(aVar);
        Q0();
        H0(listSingletonList);
    }

    @Override // y6.j0
    public final boolean H() {
        Q0();
        return this.f26646k0;
    }

    public final void H0(List list) {
        Q0();
        x0(this.N0);
        P();
        this.f26647l0++;
        ArrayList arrayList = this.S;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                arrayList.remove(i11);
            }
            p7.c1 c1Var = this.f26654s0;
            int[] iArr = c1Var.f46337b;
            int[] iArr2 = new int[iArr.length - size];
            int i12 = 0;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 < 0 || i14 >= size) {
                    int i15 = i13 - i12;
                    if (i14 >= 0) {
                        i14 -= size;
                    }
                    iArr2[i15] = i14;
                } else {
                    i12++;
                }
            }
            this.f26654s0 = new p7.c1(iArr2, new Random(c1Var.f46336a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < list.size(); i16++) {
            w0 w0Var = new w0((p7.a) list.get(i16), this.T);
            arrayList2.add(w0Var);
            arrayList.add(i16, new z(w0Var.f26931b, w0Var.f26930a));
        }
        this.f26654s0 = this.f26654s0.a(arrayList2.size());
        d1 d1Var = new d1(arrayList, this.f26654s0);
        boolean zP = d1Var.p();
        int i17 = d1Var.f26692d;
        if (!zP && -1 >= i17) {
            throw new IllegalSeekPositionException();
        }
        int iA = d1Var.a(this.f26646k0);
        y0 y0VarB0 = B0(this.N0, d1Var, C0(d1Var, iA, -9223372036854775807L));
        int i18 = y0VarB0.f26957e;
        if (iA != -1 && i18 != 1) {
            i18 = (d1Var.p() || iA >= i17) ? 4 : 2;
        }
        y0 y0VarA0 = A0(y0VarB0, i18);
        this.O.H.a(17, new d0(arrayList2, this.f26654s0, iA, b7.f0.K(-9223372036854775807L))).b();
        O0(y0VarA0, 0, (this.N0.f26954b.f46328a.equals(y0VarA0.f26954b.f46328a) || this.N0.f26953a.p()) ? false : true, 4, w0(y0VarA0), -1, false);
    }

    public final void I0(SurfaceHolder surfaceHolder) {
        this.A0 = false;
        this.f26661y0 = surfaceHolder;
        surfaceHolder.addCallback(this.f26635c0);
        Surface surface = this.f26661y0.getSurface();
        if (surface == null || !surface.isValid()) {
            D0(0, 0);
        } else {
            Rect surfaceFrame = this.f26661y0.getSurfaceFrame();
            D0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // y6.j0
    public final y6.t0 J() {
        Q0();
        s7.j jVarE = ((s7.q) this.L).e();
        if (!this.f26650o0) {
            return jVarE;
        }
        jVarE.getClass();
        s7.i iVar = new s7.i(jVarE);
        iVar.j(this.f26651p0);
        return new s7.j(iVar);
    }

    public final void J0(Object obj) {
        Object obj2 = this.f26659w0;
        boolean zB = true;
        boolean z11 = (obj2 == null || obj2 == obj) ? false : true;
        long j11 = z11 ? this.f26643h0 : -9223372036854775807L;
        g0 g0Var = this.O;
        if (!g0Var.f26756j0 && g0Var.L.getThread().isAlive()) {
            b7.f fVar = new b7.f(g0Var.R);
            g0Var.H.a(30, new Pair(obj, fVar)).b();
            if (j11 != -9223372036854775807L) {
                zB = fVar.b(j11);
            }
        }
        if (z11) {
            Object obj3 = this.f26659w0;
            Surface surface = this.f26660x0;
            if (obj3 == surface) {
                surface.release();
                this.f26660x0 = null;
            }
        }
        this.f26659w0 = obj;
        if (zB) {
            return;
        }
        L0(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
    }

    @Override // y6.j0
    public final long K() {
        Q0();
        if (this.N0.f26953a.p()) {
            return this.P0;
        }
        y0 y0Var = this.N0;
        long j11 = 0;
        if (y0Var.f26963k.f46331d != y0Var.f26954b.f46331d) {
            return b7.f0.V(y0Var.f26953a.m(y(), (y6.n0) this.f3561b, 0L).m);
        }
        long j12 = y0Var.f26968q;
        if (this.N0.f26963k.b()) {
            y0 y0Var2 = this.N0;
            y0Var2.f26953a.g(y0Var2.f26963k.f46328a, this.R).d(this.N0.f26963k.f46329b);
        } else {
            j11 = j12;
        }
        y0 y0Var3 = this.N0;
        y6.o0 o0Var = y0Var3.f26953a;
        Object obj = y0Var3.f26963k.f46328a;
        y6.m0 m0Var = this.R;
        o0Var.g(obj, m0Var);
        return b7.f0.V(j11 + m0Var.f57232e);
    }

    public final void K0(float f5) {
        Q0();
        final float f11 = b7.f0.f(f5, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        if (this.F0 == f11) {
            return;
        }
        this.F0 = f11;
        this.O.H.a(32, Float.valueOf(f11)).b();
        this.P.e(22, new b7.k() { // from class: f7.t
            @Override // b7.k
            public final void invoke(Object obj) {
                ((y6.h0) obj).i(f11);
            }
        });
    }

    @Override // y6.j0
    public final void L(TextureView textureView) {
        Q0();
        if (textureView == null) {
            t0();
            return;
        }
        E0();
        this.B0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            b7.a.B("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f26635c0);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            J0(null);
            D0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            J0(surface);
            this.f26660x0 = surface;
            D0(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void L0(ExoPlaybackException exoPlaybackException) {
        y0 y0Var = this.N0;
        y0 y0VarC = y0Var.c(y0Var.f26954b);
        y0VarC.f26968q = y0VarC.f26970s;
        y0VarC.f26969r = 0L;
        y0 y0VarA0 = A0(y0VarC, 1);
        if (exoPlaybackException != null) {
            y0VarA0 = y0VarA0.f(exoPlaybackException);
        }
        y0 y0Var2 = y0VarA0;
        this.f26647l0++;
        b7.a0 a0Var = this.O.H;
        a0Var.getClass();
        b7.z zVarB = b7.a0.b();
        zVarB.f4046a = a0Var.f3950a.obtainMessage(6);
        zVarB.b();
        O0(y0Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // y6.j0
    public final y6.a0 M() {
        Q0();
        return this.f26658v0;
    }

    public final void M0() {
        int iK;
        int iE;
        y6.f0 f0Var = this.f26657u0;
        String str = b7.f0.f3975a;
        y6.j0 j0Var = this.f26655t;
        boolean zD = j0Var.d();
        h2 h2Var = (h2) j0Var;
        y6.n0 n0Var = (y6.n0) h2Var.f3561b;
        y6.o0 o0VarF = h2Var.F();
        boolean z11 = !o0VarF.p() && o0VarF.m(h2Var.y(), n0Var, 0L).f57245h;
        y6.o0 o0VarF2 = h2Var.F();
        if (o0VarF2.p()) {
            iK = -1;
        } else {
            int iY = h2Var.y();
            int iE2 = h2Var.E();
            if (iE2 == 1) {
                iE2 = 0;
            }
            iK = o0VarF2.k(iY, iE2, h2Var.H());
        }
        boolean z12 = iK != -1;
        y6.o0 o0VarF3 = h2Var.F();
        if (o0VarF3.p()) {
            iE = -1;
        } else {
            int iY2 = h2Var.y();
            int iE3 = h2Var.E();
            if (iE3 == 1) {
                iE3 = 0;
            }
            iE = o0VarF3.e(iY2, iE3, h2Var.H());
        }
        boolean z13 = iE != -1;
        boolean zF0 = h2Var.f0();
        y6.o0 o0VarF4 = h2Var.F();
        boolean z14 = !o0VarF4.p() && o0VarF4.m(h2Var.y(), n0Var, 0L).f57246i;
        boolean zP = j0Var.F().p();
        w00.d dVar = new w00.d();
        com.android.billingclient.api.k0 k0Var = (com.android.billingclient.api.k0) dVar.f54378a;
        y6.n nVar = this.f26636d.f57193a;
        k0Var.getClass();
        for (int i11 = 0; i11 < nVar.f57235a.size(); i11++) {
            k0Var.a(nVar.a(i11));
        }
        boolean z15 = !zD;
        dVar.b(4, z15);
        dVar.b(5, z11 && !zD);
        dVar.b(6, z12 && !zD);
        dVar.b(7, !zP && (z12 || !zF0 || z11) && !zD);
        dVar.b(8, z13 && !zD);
        dVar.b(9, !zP && (z13 || (zF0 && z14)) && !zD);
        dVar.b(10, z15);
        dVar.b(11, z11 && !zD);
        dVar.b(12, z11 && !zD);
        y6.f0 f0Var2 = new y6.f0(k0Var.b());
        this.f26657u0 = f0Var2;
        if (f0Var2.equals(f0Var)) {
            return;
        }
        this.P.c(13, new r(this));
    }

    @Override // y6.j0
    public final void N(List list) {
        Q0();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(this.U.c((y6.x) list.get(i11)));
        }
        H0(arrayList);
    }

    public final void N0(int i11, boolean z11) {
        int i12;
        if (this.f26650o0) {
            i12 = 4;
        } else {
            i12 = (this.N0.f26965n != 1 || z11) ? 0 : 1;
        }
        y0 y0VarA = this.N0;
        if (y0VarA.f26964l == z11 && y0VarA.f26965n == i12 && y0VarA.m == i11) {
            return;
        }
        this.f26647l0++;
        if (y0VarA.f26967p) {
            y0VarA = y0VarA.a();
        }
        y0 y0VarE = y0VarA.e(i11, i12, z11);
        int i13 = i11 | (i12 << 4);
        b7.a0 a0Var = this.O.H;
        a0Var.getClass();
        b7.z zVarB = b7.a0.b();
        zVarB.f4046a = a0Var.f3950a.obtainMessage(1, z11 ? 1 : 0, i13);
        zVarB.b();
        O0(y0VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void O0(final y0 y0Var, int i11, boolean z11, int i12, long j11, int i13, boolean z12) {
        Pair pair;
        int i14;
        y6.x xVar;
        int i15;
        Object obj;
        y6.x xVar2;
        Object obj2;
        int i16;
        long j12;
        long j13;
        long jZ0;
        long jZ1;
        Object obj3;
        y6.x xVar3;
        Object obj4;
        int i17;
        y0 y0Var2 = this.N0;
        this.N0 = y0Var;
        boolean zEquals = y0Var2.f26953a.equals(y0Var.f26953a);
        y6.n0 n0Var = (y6.n0) this.f3561b;
        y6.m0 m0Var = this.R;
        y6.o0 o0Var = y0Var2.f26953a;
        p7.b0 b0Var = y0Var2.f26954b;
        y6.o0 o0Var2 = y0Var.f26953a;
        p7.b0 b0Var2 = y0Var.f26954b;
        if (o0Var2.p() && o0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (o0Var2.p() != o0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!o0Var.m(o0Var.g(b0Var.f46328a, m0Var).f57230c, n0Var, 0L).f57238a.equals(o0Var2.m(o0Var2.g(b0Var2.f46328a, m0Var).f57230c, n0Var, 0L).f57238a)) {
            if (z11 && i12 == 0) {
                i14 = 1;
            } else if (z11 && i12 == 1) {
                i14 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i14 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i14));
        } else if (z11 && i12 == 0 && b0Var.f46331d < b0Var2.f46331d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z11 && i12 == 1 && z12) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            xVar = y0Var.f26953a.p() ? null : y0Var.f26953a.m(y0Var.f26953a.g(y0Var.f26954b.f46328a, this.R).f57230c, (y6.n0) this.f3561b, 0L).f57240c;
            this.M0 = y6.a0.B;
        } else {
            xVar = null;
        }
        if (zBooleanValue || !y0Var2.f26962j.equals(y0Var.f26962j)) {
            y6.z zVarA = this.M0.a();
            List list = y0Var.f26962j;
            for (int i18 = 0; i18 < list.size(); i18++) {
                y6.c0 c0Var = (y6.c0) list.get(i18);
                int i19 = 0;
                while (true) {
                    y6.b0[] b0VarArr = c0Var.f57178a;
                    if (i19 < b0VarArr.length) {
                        b0VarArr[i19].b(zVarA);
                        i19++;
                    }
                }
            }
            this.M0 = new y6.a0(zVarA);
        }
        y6.a0 a0VarS0 = s0();
        boolean zEquals2 = a0VarS0.equals(this.f26658v0);
        this.f26658v0 = a0VarS0;
        boolean z13 = y0Var2.f26964l != y0Var.f26964l;
        boolean z14 = y0Var2.f26957e != y0Var.f26957e;
        if (z14 || z13) {
            P0();
        }
        boolean z15 = y0Var2.f26959g != y0Var.f26959g;
        if (!zEquals) {
            this.P.c(0, new com.google.android.material.sidesheet.b(y0Var, i11, 1));
        }
        if (z11) {
            y6.m0 m0Var2 = new y6.m0();
            if (y0Var2.f26953a.p()) {
                i15 = i13;
                obj = null;
                xVar2 = null;
                obj2 = null;
                i16 = -1;
            } else {
                Object obj5 = y0Var2.f26954b.f46328a;
                y0Var2.f26953a.g(obj5, m0Var2);
                int i21 = m0Var2.f57230c;
                int iB = y0Var2.f26953a.b(obj5);
                obj = y0Var2.f26953a.m(i21, (y6.n0) this.f3561b, 0L).f57238a;
                xVar2 = ((y6.n0) this.f3561b).f57240c;
                obj2 = obj5;
                i15 = i21;
                i16 = iB;
            }
            if (i12 == 0) {
                if (y0Var2.f26954b.b()) {
                    p7.b0 b0Var3 = y0Var2.f26954b;
                    jZ0 = m0Var2.a(b0Var3.f46329b, b0Var3.f46330c);
                    jZ1 = z0(y0Var2);
                } else {
                    if (y0Var2.f26954b.f46332e != -1) {
                        jZ0 = z0(this.N0);
                    } else {
                        j12 = m0Var2.f57232e;
                        j13 = m0Var2.f57231d;
                        jZ0 = j12 + j13;
                    }
                    jZ1 = jZ0;
                }
            } else if (y0Var2.f26954b.b()) {
                jZ0 = y0Var2.f26970s;
                jZ1 = z0(y0Var2);
            } else {
                j12 = m0Var2.f57232e;
                j13 = y0Var2.f26970s;
                jZ0 = j12 + j13;
                jZ1 = jZ0;
            }
            long jV = b7.f0.V(jZ0);
            long jV2 = b7.f0.V(jZ1);
            p7.b0 b0Var4 = y0Var2.f26954b;
            y6.i0 i0Var = new y6.i0(obj, i15, xVar2, obj2, i16, jV, jV2, b0Var4.f46329b, b0Var4.f46330c);
            y6.n0 n0Var2 = (y6.n0) this.f3561b;
            int iY = y();
            if (this.N0.f26953a.p()) {
                obj3 = null;
                xVar3 = null;
                obj4 = null;
                i17 = -1;
            } else {
                y0 y0Var3 = this.N0;
                Object obj6 = y0Var3.f26954b.f46328a;
                y0Var3.f26953a.g(obj6, this.R);
                int iB2 = this.N0.f26953a.b(obj6);
                Object obj7 = this.N0.f26953a.m(iY, n0Var2, 0L).f57238a;
                xVar3 = n0Var2.f57240c;
                i17 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jV3 = b7.f0.V(j11);
            long jV4 = this.N0.f26954b.b() ? b7.f0.V(z0(this.N0)) : jV3;
            p7.b0 b0Var5 = this.N0.f26954b;
            this.P.c(11, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(i12, i0Var, new y6.i0(obj3, iY, xVar3, obj4, i17, jV3, jV4, b0Var5.f46329b, b0Var5.f46330c)));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z14 = z14;
        }
        if (zBooleanValue) {
            this.P.c(1, new com.google.android.material.sidesheet.b(xVar, iIntValue, 2));
        }
        if (y0Var2.f26958f != y0Var.f26958f) {
            final int i22 = 8;
            this.P.c(10, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj8) {
                    y6.h0 h0Var = (y6.h0) obj8;
                    switch (i22) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
            if (y0Var.f26958f != null) {
                final int i23 = 9;
                this.P.c(10, new b7.k() { // from class: f7.p
                    @Override // b7.k
                    public final void invoke(Object obj8) {
                        y6.h0 h0Var = (y6.h0) obj8;
                        switch (i23) {
                            case 0:
                                h0Var.d(y0Var.f26961i.f51472d);
                                break;
                            case 1:
                                y0 y0Var4 = y0Var;
                                boolean z16 = y0Var4.f26959g;
                                h0Var.getClass();
                                h0Var.f(y0Var4.f26959g);
                                break;
                            case 2:
                                y0 y0Var5 = y0Var;
                                h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                                break;
                            case 3:
                                h0Var.k(y0Var.f26957e);
                                break;
                            case 4:
                                y0 y0Var6 = y0Var;
                                h0Var.h(y0Var6.m, y0Var6.f26964l);
                                break;
                            case 5:
                                h0Var.b(y0Var.f26965n);
                                break;
                            case 6:
                                h0Var.H(y0Var.m());
                                break;
                            case 7:
                                h0Var.B(y0Var.f26966o);
                                break;
                            case 8:
                                h0Var.A(y0Var.f26958f);
                                break;
                            default:
                                h0Var.D(y0Var.f26958f);
                                break;
                        }
                    }
                });
            }
        }
        s7.w wVar = y0Var2.f26961i;
        s7.w wVar2 = y0Var.f26961i;
        if (wVar != wVar2) {
            s7.v vVar = this.L;
            Object obj8 = wVar2.f51473e;
            vVar.getClass();
            final int i24 = 0;
            this.P.c(2, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj9) {
                    y6.h0 h0Var = (y6.h0) obj9;
                    switch (i24) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.P.c(14, new com.google.firebase.database.android.d(this.f26658v0, 12));
        }
        if (z15) {
            final int i25 = 1;
            this.P.c(3, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj9) {
                    y6.h0 h0Var = (y6.h0) obj9;
                    switch (i25) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
        }
        if (z14 || z13) {
            final int i26 = 2;
            this.P.c(-1, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj9) {
                    y6.h0 h0Var = (y6.h0) obj9;
                    switch (i26) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i27 = 3;
            this.P.c(4, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj9) {
                    y6.h0 h0Var = (y6.h0) obj9;
                    switch (i27) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
        }
        if (z13 || y0Var2.m != y0Var.m) {
            final int i28 = 4;
            this.P.c(5, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj9) {
                    y6.h0 h0Var = (y6.h0) obj9;
                    switch (i28) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
        }
        if (y0Var2.f26965n != y0Var.f26965n) {
            final int i29 = 5;
            this.P.c(6, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj9) {
                    y6.h0 h0Var = (y6.h0) obj9;
                    switch (i29) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
        }
        if (y0Var2.m() != y0Var.m()) {
            final int i30 = 6;
            this.P.c(7, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj9) {
                    y6.h0 h0Var = (y6.h0) obj9;
                    switch (i30) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
        }
        if (!y0Var2.f26966o.equals(y0Var.f26966o)) {
            final int i31 = 7;
            this.P.c(12, new b7.k() { // from class: f7.p
                @Override // b7.k
                public final void invoke(Object obj9) {
                    y6.h0 h0Var = (y6.h0) obj9;
                    switch (i31) {
                        case 0:
                            h0Var.d(y0Var.f26961i.f51472d);
                            break;
                        case 1:
                            y0 y0Var4 = y0Var;
                            boolean z16 = y0Var4.f26959g;
                            h0Var.getClass();
                            h0Var.f(y0Var4.f26959g);
                            break;
                        case 2:
                            y0 y0Var5 = y0Var;
                            h0Var.y(y0Var5.f26957e, y0Var5.f26964l);
                            break;
                        case 3:
                            h0Var.k(y0Var.f26957e);
                            break;
                        case 4:
                            y0 y0Var6 = y0Var;
                            h0Var.h(y0Var6.m, y0Var6.f26964l);
                            break;
                        case 5:
                            h0Var.b(y0Var.f26965n);
                            break;
                        case 6:
                            h0Var.H(y0Var.m());
                            break;
                        case 7:
                            h0Var.B(y0Var.f26966o);
                            break;
                        case 8:
                            h0Var.A(y0Var.f26958f);
                            break;
                        default:
                            h0Var.D(y0Var.f26958f);
                            break;
                    }
                }
            });
        }
        M0();
        this.P.b();
        if (y0Var2.f26967p != y0Var.f26967p) {
            Iterator it = this.Q.iterator();
            while (it.hasNext()) {
                ((x) it.next()).f26935a.P0();
            }
        }
    }

    @Override // y6.j0
    public final long P() {
        Q0();
        return b7.f0.V(w0(this.N0));
    }

    public final void P0() {
        int iU = u();
        u3 u3Var = this.f26642g0;
        u3 u3Var2 = this.f26641f0;
        boolean z11 = false;
        if (iU != 1) {
            if (iU == 2 || iU == 3) {
                Q0();
                boolean z12 = this.N0.f26967p;
                if (g() && !z12) {
                    z11 = true;
                }
                u3Var2.c(z11);
                u3Var.c(g());
                return;
            }
            if (iU != 4) {
                throw new IllegalStateException();
            }
        }
        u3Var2.c(false);
        u3Var.c(false);
    }

    @Override // y6.j0
    public final long Q() {
        Q0();
        return this.Y;
    }

    public final void Q0() {
        this.f26638e.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.W;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = b7.f0.f3975a;
            Locale locale = Locale.US;
            String strH = ep.a.h("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.I0) {
                throw new IllegalStateException(strH);
            }
            b7.a.C(strH, this.J0 ? null : new IllegalStateException());
            this.J0 = true;
        }
    }

    @Override // y6.j0
    public final void a() {
        Q0();
        y0 y0Var = this.N0;
        if (y0Var.f26957e != 1) {
            return;
        }
        y0 y0VarF = y0Var.f(null);
        y0 y0VarA0 = A0(y0VarF, y0VarF.f26953a.p() ? 4 : 2);
        this.f26647l0++;
        b7.a0 a0Var = this.O.H;
        a0Var.getClass();
        b7.z zVarB = b7.a0.b();
        zVarB.f4046a = a0Var.f3950a.obtainMessage(29);
        zVarB.b();
        O0(y0VarA0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // y6.j0
    public final y6.e0 b() {
        Q0();
        return this.N0.f26966o;
    }

    @Override // y6.j0
    public final void c(y6.e0 e0Var) {
        Q0();
        if (this.N0.f26966o.equals(e0Var)) {
            return;
        }
        y0 y0VarG = this.N0.g(e0Var);
        this.f26647l0++;
        this.O.H.a(4, e0Var).b();
        O0(y0VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // y6.j0
    public final boolean d() {
        Q0();
        return this.N0.f26954b.b();
    }

    @Override // y6.j0
    public final long e() {
        Q0();
        return b7.f0.V(this.N0.f26969r);
    }

    @Override // y6.j0
    public final y6.f0 f() {
        Q0();
        return this.f26657u0;
    }

    @Override // y6.j0
    public final boolean g() {
        Q0();
        return this.N0.f26964l;
    }

    @Override // y6.j0
    public final long getDuration() {
        Q0();
        if (!d()) {
            y6.o0 o0VarF = F();
            if (o0VarF.p()) {
                return -9223372036854775807L;
            }
            return b7.f0.V(o0VarF.m(y(), (y6.n0) this.f3561b, 0L).m);
        }
        y0 y0Var = this.N0;
        p7.b0 b0Var = y0Var.f26954b;
        y6.o0 o0Var = y0Var.f26953a;
        Object obj = b0Var.f46328a;
        y6.m0 m0Var = this.R;
        o0Var.g(obj, m0Var);
        return b7.f0.V(m0Var.a(b0Var.f46329b, b0Var.f46330c));
    }

    @Override // y6.j0
    public final void h(boolean z11) {
        Q0();
        if (this.f26646k0 != z11) {
            this.f26646k0 = z11;
            b7.a0 a0Var = this.O.H;
            a0Var.getClass();
            b7.z zVarB = b7.a0.b();
            zVarB.f4046a = a0Var.f3950a.obtainMessage(12, z11 ? 1 : 0, 0);
            zVarB.b();
            s sVar = new s(z11, 0);
            b7.n nVar = this.P;
            nVar.c(9, sVar);
            M0();
            nVar.b();
        }
    }

    @Override // y6.j0
    public final void i(y6.h0 h0Var) {
        h0Var.getClass();
        this.P.a(h0Var);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        Q0();
        return this.f26650o0;
    }

    @Override // y6.j0
    public final long j() {
        Q0();
        return this.f26632a0;
    }

    @Override // y6.j0
    public final int k() {
        Q0();
        if (this.N0.f26953a.p()) {
            return 0;
        }
        y0 y0Var = this.N0;
        return y0Var.f26953a.b(y0Var.f26954b.f46328a);
    }

    @Override // b0.h2
    public final void k0(int i11, int i12, long j11, boolean z11) {
        Q0();
        if (i11 == -1) {
            return;
        }
        b7.a.d(i11 >= 0);
        y6.o0 o0Var = this.N0.f26953a;
        if (o0Var.p() || i11 < o0Var.o()) {
            g7.f fVar = this.V;
            if (!fVar.K) {
                g7.a aVarI = fVar.I();
                fVar.K = true;
                fVar.N(aVarI, -1, new g2.a(22));
            }
            this.f26647l0++;
            if (d()) {
                b7.a.B("seekTo ignored because an ad is playing");
                e9.w wVar = new e9.w(this.N0);
                wVar.c(1);
                a0 a0Var = this.N.f26900a;
                a0Var.M.c(new b2.c(11, a0Var, wVar));
                return;
            }
            y0 y0VarH = this.N0;
            int i13 = y0VarH.f26957e;
            if (i13 == 3 || (i13 == 4 && !o0Var.p())) {
                y0VarH = this.N0.h(2);
            }
            int iY = y();
            y0 y0VarB0 = B0(y0VarH, o0Var, C0(o0Var, i11, j11));
            this.O.H.a(3, new f0(o0Var, i11, b7.f0.K(j11))).b();
            O0(y0VarB0, 0, true, 1, w0(y0VarB0), iY, z11);
        }
    }

    @Override // y6.j0
    public final void l(TextureView textureView) {
        Q0();
        if (textureView == null || textureView != this.B0) {
            return;
        }
        t0();
    }

    @Override // y6.j0
    public final y6.z0 m() {
        Q0();
        return this.L0;
    }

    @Override // y6.j0
    public final int n() {
        Q0();
        if (d()) {
            return this.N0.f26954b.f46330c;
        }
        return -1;
    }

    @Override // y6.j0
    public final void o(SurfaceView surfaceView) {
        Q0();
        if (surfaceView instanceof v7.s) {
            E0();
            J0(surfaceView);
            I0(surfaceView.getHolder());
            return;
        }
        boolean z11 = surfaceView instanceof SphericalGLSurfaceView;
        x xVar = this.f26635c0;
        if (z11) {
            E0();
            this.f26662z0 = (SphericalGLSurfaceView) surfaceView;
            b1 b1VarU0 = u0(this.f26637d0);
            b7.a.j(!b1VarU0.f26671f);
            b1VarU0.f26668c = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.f26662z0;
            b7.a.j(true ^ b1VarU0.f26671f);
            b1VarU0.f26669d = sphericalGLSurfaceView;
            b1VarU0.b();
            this.f26662z0.f2147a.add(xVar);
            J0(this.f26662z0.getVideoSurface());
            I0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        Q0();
        if (holder == null) {
            t0();
            return;
        }
        E0();
        this.A0 = true;
        this.f26661y0 = holder;
        holder.addCallback(xVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            J0(null);
            D0(0, 0);
        } else {
            J0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            D0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // y6.j0
    public final void r(boolean z11) {
        Q0();
        N0(1, z11);
    }

    @Override // y6.j0
    public final void release() {
        String str;
        boolean zB;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [AndroidXMedia3/1.8.0] [");
        sb2.append(b7.f0.f3975a);
        sb2.append("] [");
        HashSet hashSet = y6.y.f57378a;
        synchronized (y6.y.class) {
            str = y6.y.f57379b;
        }
        sb2.append(str);
        sb2.append("]");
        b7.a.u(sb2.toString());
        Q0();
        this.f26639e0.p();
        this.f26641f0.c(false);
        this.f26642g0.c(false);
        g0 g0Var = this.O;
        int i11 = 1;
        if (g0Var.f26756j0 || !g0Var.L.getThread().isAlive()) {
            zB = true;
        } else {
            g0Var.f26756j0 = true;
            b7.f fVar = new b7.f(g0Var.R);
            g0Var.H.a(7, fVar).b();
            zB = fVar.b(g0Var.W);
        }
        if (!zB) {
            this.P.e(10, new f.s(i11));
        }
        this.P.d();
        this.M.f3950a.removeCallbacksAndMessages(null);
        t7.e eVar = this.X;
        g7.f fVar2 = this.V;
        CopyOnWriteArrayList<t7.c> copyOnWriteArrayList = (CopyOnWriteArrayList) ((t7.i) eVar).f52076c.f52059b;
        for (t7.c cVar : copyOnWriteArrayList) {
            if (cVar.f52056b == fVar2) {
                cVar.f52057c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        y0 y0Var = this.N0;
        if (y0Var.f26967p) {
            this.N0 = y0Var.a();
        }
        y0 y0VarA0 = A0(this.N0, 1);
        this.N0 = y0VarA0;
        y0 y0VarC = y0VarA0.c(y0VarA0.f26954b);
        this.N0 = y0VarC;
        y0VarC.f26968q = y0VarC.f26970s;
        this.N0.f26969r = 0L;
        g7.f fVar3 = this.V;
        b7.a0 a0Var = fVar3.H;
        b7.a.k(a0Var);
        a0Var.c(new b2.a(fVar3, 18));
        E0();
        Surface surface = this.f26660x0;
        if (surface != null) {
            surface.release();
            this.f26660x0 = null;
        }
        this.H0 = a7.d.f432c;
    }

    @Override // y6.j0
    public final long s() {
        Q0();
        return this.Z;
    }

    public final y6.a0 s0() {
        y6.o0 o0VarF = F();
        if (o0VarF.p()) {
            return this.M0;
        }
        y6.x xVar = o0VarF.m(y(), (y6.n0) this.f3561b, 0L).f57240c;
        y6.z zVarA = this.M0.a();
        y6.a0 a0Var = xVar.f57375d;
        if (a0Var != null) {
            ImmutableList immutableList = a0Var.A;
            byte[] bArr = a0Var.f57154f;
            CharSequence charSequence = a0Var.f57149a;
            if (charSequence != null) {
                zVarA.f57381a = charSequence;
            }
            CharSequence charSequence2 = a0Var.f57150b;
            if (charSequence2 != null) {
                zVarA.f57382b = charSequence2;
            }
            CharSequence charSequence3 = a0Var.f57151c;
            if (charSequence3 != null) {
                zVarA.f57383c = charSequence3;
            }
            CharSequence charSequence4 = a0Var.f57152d;
            if (charSequence4 != null) {
                zVarA.f57384d = charSequence4;
            }
            CharSequence charSequence5 = a0Var.f57153e;
            if (charSequence5 != null) {
                zVarA.f57385e = charSequence5;
            }
            if (bArr != null) {
                Integer num = a0Var.f57155g;
                zVarA.f57386f = bArr == null ? null : (byte[]) bArr.clone();
                zVarA.f57387g = num;
            }
            Integer num2 = a0Var.f57156h;
            if (num2 != null) {
                zVarA.f57388h = num2;
            }
            Integer num3 = a0Var.f57157i;
            if (num3 != null) {
                zVarA.f57389i = num3;
            }
            Integer num4 = a0Var.f57158j;
            if (num4 != null) {
                zVarA.f57390j = num4;
            }
            Boolean bool = a0Var.f57159k;
            if (bool != null) {
                zVarA.f57391k = bool;
            }
            Integer num5 = a0Var.f57160l;
            if (num5 != null) {
                zVarA.f57392l = num5;
            }
            Integer num6 = a0Var.m;
            if (num6 != null) {
                zVarA.f57392l = num6;
            }
            Integer num7 = a0Var.f57161n;
            if (num7 != null) {
                zVarA.m = num7;
            }
            Integer num8 = a0Var.f57162o;
            if (num8 != null) {
                zVarA.f57393n = num8;
            }
            Integer num9 = a0Var.f57163p;
            if (num9 != null) {
                zVarA.f57394o = num9;
            }
            Integer num10 = a0Var.f57164q;
            if (num10 != null) {
                zVarA.f57395p = num10;
            }
            Integer num11 = a0Var.f57165r;
            if (num11 != null) {
                zVarA.f57396q = num11;
            }
            CharSequence charSequence6 = a0Var.f57166s;
            if (charSequence6 != null) {
                zVarA.f57397r = charSequence6;
            }
            CharSequence charSequence7 = a0Var.f57167t;
            if (charSequence7 != null) {
                zVarA.f57398s = charSequence7;
            }
            CharSequence charSequence8 = a0Var.f57168u;
            if (charSequence8 != null) {
                zVarA.f57399t = charSequence8;
            }
            Integer num12 = a0Var.f57169v;
            if (num12 != null) {
                zVarA.f57400u = num12;
            }
            Integer num13 = a0Var.f57170w;
            if (num13 != null) {
                zVarA.f57401v = num13;
            }
            CharSequence charSequence9 = a0Var.f57171x;
            if (charSequence9 != null) {
                zVarA.f57402w = charSequence9;
            }
            CharSequence charSequence10 = a0Var.f57172y;
            if (charSequence10 != null) {
                zVarA.f57403x = charSequence10;
            }
            Integer num14 = a0Var.f57173z;
            if (num14 != null) {
                zVarA.f57404y = num14;
            }
            if (!immutableList.isEmpty()) {
                zVarA.f57405z = ImmutableList.n(immutableList);
            }
        }
        return new y6.a0(zVarA);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        Q0();
        F0(4, 15, imageOutput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z11) {
        y6.t0 t0VarA;
        Q0();
        if (z11 == this.f26650o0) {
            return;
        }
        this.f26650o0 = z11;
        g1 g1Var = this.f26652q0;
        if (!g1Var.f26775a.isEmpty()) {
            s7.v vVar = this.L;
            vVar.getClass();
            s7.j jVarE = ((s7.q) vVar).e();
            if (z11) {
                this.f26651p0 = jVarE.f57357t;
                ImmutableSet immutableSet = g1Var.f26775a;
                y6.s0 s0VarA = jVarE.a();
                UnmodifiableIterator it = immutableSet.iterator();
                while (it.hasNext()) {
                    s0VarA.i(((Integer) it.next()).intValue(), true);
                }
                t0VarA = s0VarA.a();
            } else {
                jVarE.getClass();
                s7.i iVar = new s7.i(jVarE);
                iVar.j(this.f26651p0);
                s7.j jVar = new s7.j(iVar);
                this.f26651p0 = null;
                t0VarA = jVar;
            }
            if (!t0VarA.equals(jVarE)) {
                vVar.b(t0VarA);
            }
        }
        this.O.H.a(36, Boolean.valueOf(z11)).b();
        y0 y0Var = this.N0;
        N0(y0Var.m, y0Var.f26964l);
    }

    @Override // y6.j0
    public final void stop() {
        Q0();
        L0(null);
        ImmutableList immutableListS = ImmutableList.s();
        long j11 = this.N0.f26970s;
        this.H0 = new a7.d(immutableListS);
    }

    @Override // y6.j0
    public final long t() {
        Q0();
        return v0(this.N0);
    }

    public final void t0() {
        Q0();
        E0();
        J0(null);
        D0(0, 0);
    }

    @Override // y6.j0
    public final int u() {
        Q0();
        return this.N0.f26957e;
    }

    public final b1 u0(a1 a1Var) {
        int iX0 = x0(this.N0);
        y6.o0 o0Var = this.N0.f26953a;
        if (iX0 == -1) {
            iX0 = 0;
        }
        g0 g0Var = this.O;
        return new b1(g0Var, a1Var, o0Var, iX0, g0Var.L);
    }

    @Override // y6.j0
    public final y6.v0 v() {
        Q0();
        return this.N0.f26961i.f51472d;
    }

    public final long v0(y0 y0Var) {
        p7.b0 b0Var = y0Var.f26954b;
        long j11 = y0Var.f26955c;
        y6.o0 o0Var = y0Var.f26953a;
        if (!b0Var.b()) {
            return b7.f0.V(w0(y0Var));
        }
        Object obj = y0Var.f26954b.f46328a;
        y6.m0 m0Var = this.R;
        o0Var.g(obj, m0Var);
        if (j11 == -9223372036854775807L) {
            return b7.f0.V(o0Var.m(x0(y0Var), (y6.n0) this.f3561b, 0L).f57249l);
        }
        return b7.f0.V(j11) + b7.f0.V(m0Var.f57232e);
    }

    @Override // y6.j0
    public final a7.d w() {
        Q0();
        return this.H0;
    }

    public final long w0(y0 y0Var) {
        if (y0Var.f26953a.p()) {
            return b7.f0.K(this.P0);
        }
        long jL = y0Var.f26967p ? y0Var.l() : y0Var.f26970s;
        if (y0Var.f26954b.b()) {
            return jL;
        }
        y6.o0 o0Var = y0Var.f26953a;
        Object obj = y0Var.f26954b.f46328a;
        y6.m0 m0Var = this.R;
        o0Var.g(obj, m0Var);
        return jL + m0Var.f57232e;
    }

    @Override // y6.j0
    public final int x() {
        Q0();
        if (d()) {
            return this.N0.f26954b.f46329b;
        }
        return -1;
    }

    public final int x0(y0 y0Var) {
        return y0Var.f26953a.p() ? this.O0 : y0Var.f26953a.g(y0Var.f26954b.f46328a, this.R).f57230c;
    }

    @Override // y6.j0
    public final int y() {
        Q0();
        int iX0 = x0(this.N0);
        if (iX0 == -1) {
            return 0;
        }
        return iX0;
    }

    @Override // y6.j0
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final ExoPlaybackException q() {
        Q0();
        return this.N0.f26958f;
    }

    @Override // y6.j0
    public final void z(int i11) {
        Q0();
        if (this.f26645j0 != i11) {
            this.f26645j0 = i11;
            b7.a0 a0Var = this.O.H;
            a0Var.getClass();
            b7.z zVarB = b7.a0.b();
            zVarB.f4046a = a0Var.f3950a.obtainMessage(11, i11, 0);
            zVarB.b();
            com.yalantis.ucrop.a aVar = new com.yalantis.ucrop.a(i11, 1);
            b7.n nVar = this.P;
            nVar.c(8, aVar);
            M0();
            nVar.b();
        }
    }
}
