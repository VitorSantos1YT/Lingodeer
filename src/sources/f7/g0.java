package f7;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.api.Service;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.DescriptorProtos;
import com.lingodeer.data.model.INTENTS;
import com.stkouyu.util.httputil.Consts;
import com.yalantis.ucrop.view.CropImageView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Handler.Callback, p7.y, z0, v7.t {
    public static final long G0 = b7.f0.V(10000);
    public ExoPlaybackException A0;
    public o C0;
    public boolean E0;
    public final b7.a0 H;
    public final com.android.billingclient.api.d0 K;
    public final Looper L;
    public final y6.n0 M;
    public final y6.m0 N;
    public final long O;
    public final k P;
    public final ArrayList Q;
    public final b7.y R;
    public final r S;
    public final n0 T;
    public final x0 U;
    public final h V;
    public final long W;
    public final g7.j X;
    public final g7.f Y;
    public final b7.a0 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1[] f26741a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f26742a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e[] f26743b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final d f26744b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean[] f26745c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public h1 f26746c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s7.v f26747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s7.w f26749e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f26750e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f26751f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f26752f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public f0 f26753g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public y0 f26754h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public e9.w f26755i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f26756j0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f26758l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f26759m0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f26761o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f26762p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f26763q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f26764r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f26765s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t7.e f26766t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f26767t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f26768u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public f0 f26769v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long f26770w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f26771x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f26772y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f26773z0;
    public long D0 = -9223372036854775807L;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f26757k0 = false;
    public float F0 = 1.0f;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public g1 f26748d0 = g1.f26774b;
    public long B0 = -9223372036854775807L;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f26760n0 = -9223372036854775807L;

    public g0(Context context, e[] eVarArr, e[] eVarArr2, s7.v vVar, s7.w wVar, j jVar, t7.e eVar, int i11, boolean z11, g7.f fVar, h1 h1Var, h hVar, long j11, Looper looper, b7.y yVar, r rVar, g7.j jVar2, o oVar, final v7.t tVar) {
        Looper looper2;
        this.S = rVar;
        this.f26747d = vVar;
        this.f26749e = wVar;
        this.f26751f = jVar;
        this.f26766t = eVar;
        this.f26762p0 = i11;
        this.f26763q0 = z11;
        this.f26746c0 = h1Var;
        this.V = hVar;
        this.W = j11;
        boolean z12 = false;
        this.R = yVar;
        this.X = jVar2;
        this.C0 = oVar;
        this.Y = fVar;
        this.O = jVar.f26808g;
        y6.l0 l0Var = y6.o0.f57278a;
        y0 y0VarK = y0.k(wVar);
        this.f26754h0 = y0VarK;
        this.f26755i0 = new e9.w(y0VarK);
        this.f26743b = new e[eVarArr.length];
        this.f26745c = new boolean[eVarArr.length];
        s7.q qVar = (s7.q) vVar;
        qVar.getClass();
        this.f26741a = new f1[eVarArr.length];
        boolean z13 = false;
        for (int i12 = 0; i12 < eVarArr.length; i12++) {
            e eVar2 = eVarArr[i12];
            eVar2.f26703e = i12;
            eVar2.f26704f = jVar2;
            eVar2.f26705t = yVar;
            this.f26743b[i12] = eVar2;
            e eVar3 = this.f26743b[i12];
            synchronized (eVar3.f26699a) {
                eVar3.T = qVar;
            }
            e eVar4 = eVarArr2[i12];
            if (eVar4 != null) {
                eVar4.f26703e = i12;
                eVar4.f26704f = jVar2;
                eVar4.f26705t = yVar;
                z13 = true;
            }
            f1[] f1VarArr = this.f26741a;
            e eVar5 = eVarArr[i12];
            f1 f1Var = new f1();
            f1Var.f26734e = eVar5;
            f1Var.f26732c = i12;
            f1Var.f26735f = eVar4;
            f1Var.f26733d = 0;
            f1Var.f26730a = false;
            f1Var.f26731b = false;
            f1VarArr[i12] = f1Var;
        }
        this.f26742a0 = z13;
        this.P = new k(this, yVar);
        this.Q = new ArrayList();
        this.M = new y6.n0();
        this.N = new y6.m0();
        b7.a.j(vVar.f51467a == null);
        vVar.f51467a = this;
        vVar.f51468b = eVar;
        this.f26773z0 = true;
        b7.a0 a0VarA = yVar.a(looper, null);
        this.Z = a0VarA;
        this.T = new n0(fVar, a0VarA, new com.google.firebase.database.android.d(this, 17), oVar);
        this.U = new x0(this, fVar, a0VarA, jVar2);
        com.android.billingclient.api.d0 d0Var = new com.android.billingclient.api.d0();
        this.K = d0Var;
        synchronized (d0Var.f7498b) {
            try {
                if (((Looper) d0Var.f7499c) == null) {
                    if (d0Var.f7497a == 0 && ((HandlerThread) d0Var.f7500d) == null) {
                        z12 = true;
                    }
                    b7.a.j(z12);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    d0Var.f7500d = handlerThread;
                    handlerThread.start();
                    d0Var.f7499c = ((HandlerThread) d0Var.f7500d).getLooper();
                }
                d0Var.f7497a++;
                looper2 = (Looper) d0Var.f7499c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = looper2;
        b7.a0 a0VarA2 = yVar.a(looper2, this);
        this.H = a0VarA2;
        this.f26744b0 = new d(context, looper2, this);
        a0VarA2.a(35, new v7.t() { // from class: f7.b0
            @Override // v7.t
            public final void c(long j12, long j13, y6.p pVar, MediaFormat mediaFormat) {
                g0 g0Var = this.f26664a;
                g0Var.getClass();
                tVar.c(j12, j13, pVar, mediaFormat);
                g0Var.c(j12, j13, pVar, mediaFormat);
            }
        }).b();
    }

    public static Pair S(y6.o0 o0Var, f0 f0Var, boolean z11, int i11, boolean z12, y6.n0 n0Var, y6.m0 m0Var) {
        int iT;
        y6.o0 o0Var2 = f0Var.f26727a;
        if (o0Var.p()) {
            return null;
        }
        y6.o0 o0Var3 = o0Var2.p() ? o0Var : o0Var2;
        try {
            Pair pairI = o0Var3.i(n0Var, m0Var, f0Var.f26728b, f0Var.f26729c);
            if (!o0Var.equals(o0Var3)) {
                if (o0Var.b(pairI.first) == -1) {
                    if (!z11 || (iT = T(n0Var, m0Var, i11, z12, pairI.first, o0Var3, o0Var)) == -1) {
                        return null;
                    }
                    return o0Var.i(n0Var, m0Var, iT, -9223372036854775807L);
                }
                if (o0Var3.g(pairI.first, m0Var).f57233f && o0Var3.m(m0Var.f57230c, n0Var, 0L).f57250n == o0Var3.b(pairI.first)) {
                    return o0Var.i(n0Var, m0Var, o0Var.g(pairI.first, m0Var).f57230c, f0Var.f26729c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(y6.n0 n0Var, y6.m0 m0Var, int i11, boolean z11, Object obj, y6.o0 o0Var, y6.o0 o0Var2) {
        y6.o0 o0Var3 = o0Var;
        Object obj2 = o0Var3.m(o0Var3.g(obj, m0Var).f57230c, n0Var, 0L).f57238a;
        for (int i12 = 0; i12 < o0Var2.o(); i12++) {
            if (o0Var2.m(i12, n0Var, 0L).f57238a.equals(obj2)) {
                return i12;
            }
        }
        int iB = o0Var3.b(obj);
        int iH = o0Var3.h();
        int iB2 = -1;
        int i13 = 0;
        while (i13 < iH && iB2 == -1) {
            y6.o0 o0Var4 = o0Var3;
            int iD = o0Var4.d(iB, m0Var, n0Var, i11, z11);
            if (iD == -1) {
                break;
            }
            iB2 = o0Var2.b(o0Var4.l(iD));
            i13++;
            o0Var3 = o0Var4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return o0Var2.f(iB2, m0Var, false).f57230c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p7.b1, p7.z] */
    public static boolean z(l0 l0Var) {
        if (l0Var != null) {
            try {
                ?? r9 = l0Var.f26825a;
                if (l0Var.f26829e) {
                    for (p7.z0 z0Var : l0Var.f26827c) {
                        if (z0Var != null) {
                            z0Var.b();
                        }
                    }
                } else {
                    r9.j();
                }
                if ((!l0Var.f26829e ? 0L : r9.h()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i11, p7.b0 b0Var) {
        n0 n0Var = this.T;
        l0 l0Var = n0Var.f26884k;
        if (l0Var != null && l0Var.f26831g.f26842a.equals(b0Var)) {
            f1 f1Var = this.f26741a[i11];
            l0 l0Var2 = n0Var.f26884k;
            int i12 = f1Var.f26733d;
            boolean z11 = (i12 == 2 || i12 == 4) && f1Var.d(l0Var2) == ((e) f1Var.f26734e);
            boolean z12 = f1Var.f26733d == 3 && f1Var.d(l0Var2) == ((e) f1Var.f26735f);
            if (z11 || z12) {
                return true;
            }
        }
        return false;
    }

    public final void A0(y6.o0 o0Var, p7.b0 b0Var, y6.o0 o0Var2, p7.b0 b0Var2, long j11, boolean z11) {
        boolean zR0 = r0(o0Var, b0Var);
        Object obj = b0Var.f46328a;
        if (!zR0) {
            y6.e0 e0Var = b0Var.b() ? y6.e0.f57184d : this.f26754h0.f26966o;
            k kVar = this.P;
            if (kVar.b().equals(e0Var)) {
                return;
            }
            this.H.d(16);
            kVar.c(e0Var);
            x(this.f26754h0.f26966o, e0Var.f57185a, false, false);
            return;
        }
        y6.m0 m0Var = this.N;
        int i11 = o0Var.g(obj, m0Var).f57230c;
        y6.n0 n0Var = this.M;
        o0Var.n(i11, n0Var);
        y6.t tVar = n0Var.f57247j;
        h hVar = this.V;
        hVar.getClass();
        hVar.f26778c = b7.f0.K(tVar.f57334a);
        hVar.f26781f = b7.f0.K(tVar.f57335b);
        hVar.f26782g = b7.f0.K(tVar.f57336c);
        float f5 = tVar.f57337d;
        if (f5 == -3.4028235E38f) {
            f5 = 0.97f;
        }
        hVar.f26785j = f5;
        float f11 = tVar.f57338e;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        hVar.f26784i = f11;
        if (f5 == 1.0f && f11 == 1.0f) {
            hVar.f26778c = -9223372036854775807L;
        }
        hVar.a();
        if (j11 != -9223372036854775807L) {
            hVar.f26779d = m(o0Var, obj, j11);
            hVar.a();
            return;
        }
        if (!Objects.equals(!o0Var2.p() ? o0Var2.m(o0Var2.g(b0Var2.f46328a, m0Var).f57230c, n0Var, 0L).f57238a : null, n0Var.f57238a) || z11) {
            hVar.f26779d = -9223372036854775807L;
            hVar.a();
        }
    }

    public final boolean B() {
        l0 l0Var = this.T.f26882i;
        long j11 = l0Var.f26831g.f26846e;
        if (l0Var.f26829e) {
            return j11 == -9223372036854775807L || this.f26754h0.f26970s < j11 || !q0();
        }
        return false;
    }

    public final void B0(boolean z11, boolean z12) {
        long jElapsedRealtime;
        this.f26759m0 = z11;
        if (!z11 || z12) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.R.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f26760n0 = jElapsedRealtime;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, p7.z] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, p7.b1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, p7.b1] */
    public final void C() {
        boolean zC;
        if (z(this.T.f26885l)) {
            l0 l0Var = this.T.f26885l;
            long jP = p(!l0Var.f26829e ? 0L : l0Var.f26825a.h());
            l0 l0Var2 = this.T.f26882i;
            long j11 = r0(this.f26754h0.f26953a, l0Var.f26831g.f26842a) ? this.V.f26783h : -9223372036854775807L;
            g7.j jVar = this.X;
            y6.o0 o0Var = this.f26754h0.f26953a;
            float f5 = this.P.b().f57185a;
            boolean z11 = this.f26754h0.f26964l;
            h0 h0Var = new h0(jVar, jP, f5, this.f26759m0, j11);
            zC = this.f26751f.c(h0Var);
            l0 l0Var3 = this.T.f26882i;
            if (!zC && l0Var3.f26829e && jP < 500000 && this.O > 0) {
                l0Var3.f26825a.l(this.f26754h0.f26970s);
                zC = this.f26751f.c(h0Var);
            }
        } else {
            zC = false;
        }
        this.f26761o0 = zC;
        if (zC) {
            l0 l0Var4 = this.T.f26885l;
            l0Var4.getClass();
            i0 i0Var = new i0();
            i0Var.f26797a = this.f26770w0 - l0Var4.f26839p;
            float f11 = this.P.b().f57185a;
            b7.a.d(f11 > CropImageView.DEFAULT_ASPECT_RATIO || f11 == -3.4028235E38f);
            i0Var.f26798b = f11;
            long j12 = this.f26760n0;
            b7.a.d(j12 >= 0 || j12 == -9223372036854775807L);
            i0Var.f26799c = j12;
            j0 j0Var = new j0(i0Var);
            b7.a.j(l0Var4.m == null);
            l0Var4.f26825a.u(j0Var);
        }
        v0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, p7.b1, p7.z] */
    public final void D() {
        n0 n0Var = this.T;
        n0Var.k();
        l0 l0Var = n0Var.m;
        if (l0Var != null) {
            ?? r9 = l0Var.f26825a;
            if ((!l0Var.f26828d || l0Var.f26829e) && !r9.a()) {
                y6.o0 o0Var = this.f26754h0.f26953a;
                if (l0Var.f26829e) {
                    r9.w();
                }
                Iterator it = this.f26751f.f26809h.values().iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).f26795a) {
                        return;
                    }
                }
                if (!l0Var.f26828d) {
                    long j11 = l0Var.f26831g.f26843b;
                    l0Var.f26828d = true;
                    r9.n(this, j11);
                    return;
                }
                i0 i0Var = new i0();
                i0Var.f26797a = this.f26770w0 - l0Var.f26839p;
                float f5 = this.P.b().f57185a;
                b7.a.d(f5 > CropImageView.DEFAULT_ASPECT_RATIO || f5 == -3.4028235E38f);
                i0Var.f26798b = f5;
                long j12 = this.f26760n0;
                b7.a.d(j12 >= 0 || j12 == -9223372036854775807L);
                i0Var.f26799c = j12;
                j0 j0Var = new j0(i0Var);
                b7.a.j(l0Var.m == null);
                r9.u(j0Var);
            }
        }
    }

    public final void E() {
        e9.w wVar = this.f26755i0;
        y0 y0Var = this.f26754h0;
        boolean z11 = wVar.f25421a | (((y0) wVar.f25425e) != y0Var);
        wVar.f25421a = z11;
        wVar.f25425e = y0Var;
        if (z11) {
            a0 a0Var = this.S.f26900a;
            a0Var.M.c(new b2.c(11, a0Var, wVar));
            this.f26755i0 = new e9.w(this.f26754h0);
        }
    }

    public final void F(int i11) {
        f1 f1Var = this.f26741a[i11];
        try {
            l0 l0Var = this.T.f26882i;
            l0Var.getClass();
            e eVarD = f1Var.d(l0Var);
            eVarD.getClass();
            p7.z0 z0Var = eVarD.K;
            z0Var.getClass();
            z0Var.b();
        } catch (IOException | RuntimeException e8) {
            int i12 = ((e) f1Var.f26734e).f26700b;
            if (i12 != 3 && i12 != 5) {
                throw e8;
            }
            s7.w wVar = this.T.f26882i.f26838o;
            b7.a.p("Disabling track due to error: " + y6.p.c(wVar.f51471c[i11].m()), e8);
            s7.w wVar2 = new s7.w((e1[]) wVar.f51470b.clone(), (s7.s[]) wVar.f51471c.clone(), wVar.f51472d, wVar.f51473e);
            wVar2.f51470b[i11] = null;
            wVar2.f51471c[i11] = null;
            i(i11);
            l0 l0Var2 = this.T.f26882i;
            l0Var2.a(wVar2, this.f26754h0.f26970s, false, new boolean[l0Var2.f26834j.length]);
        }
    }

    public final void G(int i11, boolean z11) {
        boolean[] zArr = this.f26745c;
        if (zArr[i11] != z11) {
            zArr[i11] = z11;
            this.Z.c(new b1.f(this, i11, z11));
        }
    }

    public final void H() throws Throwable {
        v(this.U.b(), true);
    }

    public final void I() {
        this.f26755i0.c(1);
        throw null;
    }

    public final void J() {
        this.f26755i0.c(1);
        O(false, false, false, true);
        j jVar = this.f26751f;
        HashMap map = jVar.f26809h;
        long id2 = Thread.currentThread().getId();
        long j11 = jVar.f26810i;
        b7.a.i("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j11 == -1 || j11 == id2);
        jVar.f26810i = id2;
        g7.j jVar2 = this.X;
        if (!map.containsKey(jVar2)) {
            map.put(jVar2, new i());
        }
        i iVar = (i) map.get(jVar2);
        iVar.getClass();
        int i11 = jVar.f26807f;
        if (i11 == -1) {
            i11 = 13107200;
        }
        iVar.f26796b = i11;
        iVar.f26795a = false;
        m0(this.f26754h0.f26953a.p() ? 4 : 2);
        y0 y0Var = this.f26754h0;
        boolean z11 = y0Var.f26964l;
        y0(this.f26744b0.d(y0Var.f26957e, z11), y0Var.f26965n, y0Var.m, z11);
        t7.i iVar2 = (t7.i) this.f26766t;
        iVar2.getClass();
        x0 x0Var = this.U;
        ArrayList arrayList = x0Var.f26937b;
        b7.a.j(!x0Var.f26946k);
        x0Var.f26947l = iVar2;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            w0 w0Var = (w0) arrayList.get(i12);
            x0Var.e(w0Var);
            x0Var.f26942g.add(w0Var);
        }
        x0Var.f26946k = true;
        this.H.e(2);
    }

    public final void K(b7.f fVar) {
        com.android.billingclient.api.d0 d0Var = this.K;
        b7.a0 a0Var = this.H;
        try {
            O(true, false, true, false);
            L();
            j jVar = this.f26751f;
            if (jVar.f26809h.remove(this.X) != null) {
                jVar.d();
            }
            if (jVar.f26809h.isEmpty()) {
                jVar.f26810i = -1L;
            }
            d dVar = this.f26744b0;
            dVar.f26679c = null;
            dVar.a();
            dVar.c(0);
            this.f26747d.a();
            m0(1);
        } finally {
            a0Var.f3950a.removeCallbacksAndMessages(null);
            d0Var.b();
            fVar.c();
        }
    }

    public final void L() {
        for (int i11 = 0; i11 < this.f26741a.length; i11++) {
            e eVar = this.f26743b[i11];
            synchronized (eVar.f26699a) {
                eVar.T = null;
            }
            f1 f1Var = this.f26741a[i11];
            e eVar2 = (e) f1Var.f26734e;
            b7.a.j(eVar2.H == 0);
            eVar2.s();
            f1Var.f26730a = false;
            e eVar3 = (e) f1Var.f26735f;
            if (eVar3 != null) {
                b7.a.j(eVar3.H == 0);
                eVar3.s();
                f1Var.f26731b = false;
            }
        }
    }

    public final void M(int i11, int i12, p7.c1 c1Var) throws Throwable {
        this.f26755i0.c(1);
        x0 x0Var = this.U;
        x0Var.getClass();
        b7.a.d(i11 >= 0 && i11 <= i12 && i12 <= x0Var.f26937b.size());
        x0Var.f26945j = c1Var;
        x0Var.g(i11, i12);
        v(x0Var.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public final void N() {
        int i11;
        int i12;
        float f5 = this.P.b().f57185a;
        n0 n0Var = this.T;
        l0 l0Var = n0Var.f26882i;
        l0 l0Var2 = n0Var.f26883j;
        s7.w wVar = null;
        l0 l0Var3 = l0Var;
        boolean z11 = true;
        while (l0Var3 != null && l0Var3.f26829e) {
            y0 y0Var = this.f26754h0;
            s7.w wVarJ = l0Var3.j(f5, y0Var.f26953a, y0Var.f26964l);
            s7.w wVar2 = l0Var3 == this.T.f26882i ? wVarJ : wVar;
            s7.w wVar3 = l0Var3.f26838o;
            s7.s[] sVarArr = wVarJ.f51471c;
            if (wVar3 != null && wVar3.f51471c.length == sVarArr.length) {
                int i13 = 0;
                while (true) {
                    if (i13 >= sVarArr.length) {
                        if (l0Var3 == l0Var2) {
                            z11 = false;
                        }
                        l0Var3 = l0Var3.m;
                        wVar = wVar2;
                    } else if (wVarJ.a(wVar3, i13)) {
                        i13++;
                    }
                }
            }
            if (!z11) {
                i11 = 4;
                this.T.n(l0Var3);
                if (l0Var3.f26829e) {
                    long jMax = Math.max(l0Var3.f26831g.f26843b, this.f26770w0 - l0Var3.f26839p);
                    if (this.f26742a0 && f() && this.T.f26884k == l0Var3) {
                        h();
                    }
                    i12 = 4;
                    l0Var3.a(wVarJ, jMax, false, new boolean[l0Var3.f26834j.length]);
                }
                u(true);
                if (this.f26754h0.f26957e != i12) {
                    C();
                    z0();
                    this.H.e(2);
                    return;
                }
                return;
            }
            n0 n0Var2 = this.T;
            l0 l0Var4 = n0Var2.f26882i;
            boolean z12 = (n0Var2.n(l0Var4) & 1) != 0;
            boolean[] zArr = new boolean[this.f26741a.length];
            wVar2.getClass();
            long jA = l0Var4.a(wVar2, this.f26754h0.f26970s, z12, zArr);
            y0 y0Var2 = this.f26754h0;
            boolean z13 = (y0Var2.f26957e == 4 || jA == y0Var2.f26970s) ? false : true;
            y0 y0Var3 = this.f26754h0;
            i11 = 4;
            this.f26754h0 = y(y0Var3.f26954b, jA, y0Var3.f26955c, y0Var3.f26956d, z13, 5);
            if (z13) {
                Q(jA);
            }
            h();
            boolean[] zArr2 = new boolean[this.f26741a.length];
            int i14 = 0;
            while (true) {
                f1[] f1VarArr = this.f26741a;
                if (i14 >= f1VarArr.length) {
                    break;
                }
                int iC = f1VarArr[i14].c();
                zArr2[i14] = this.f26741a[i14].g();
                f1 f1Var = this.f26741a[i14];
                p7.z0 z0Var = l0Var4.f26827c[i14];
                k kVar = this.P;
                long j11 = this.f26770w0;
                boolean z14 = zArr[i14];
                e eVar = (e) f1Var.f26734e;
                if (f1.h(eVar)) {
                    if (z0Var != eVar.K) {
                        f1Var.a(eVar, kVar);
                    } else if (z14) {
                        eVar.P = false;
                        eVar.N = j11;
                        eVar.O = j11;
                        eVar.r(j11, false);
                    }
                }
                e eVar2 = (e) f1Var.f26735f;
                if (eVar2 != null && f1.h(eVar2)) {
                    if (z0Var != eVar2.K) {
                        f1Var.a(eVar2, kVar);
                    } else if (z14) {
                        eVar2.P = false;
                        eVar2.N = j11;
                        eVar2.O = j11;
                        eVar2.r(j11, false);
                    }
                }
                if (iC - this.f26741a[i14].c() > 0) {
                    G(i14, false);
                }
                this.f26768u0 -= iC - this.f26741a[i14].c();
                i14++;
            }
            l(zArr2, this.f26770w0);
            l0Var4.f26832h = true;
            i12 = i11;
            u(true);
            if (this.f26754h0.f26957e != i12) {
                C();
                z0();
                this.H.e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    public final void O(boolean z11, boolean z12, boolean z13, boolean z14) {
        long j11;
        long j12;
        long j13;
        boolean z15;
        y6.o0 d1Var;
        this.H.d(2);
        this.f26752f0 = false;
        this.f26753g0 = null;
        this.A0 = null;
        B0(false, true);
        k kVar = this.P;
        kVar.f26820b = false;
        j1 j1Var = (j1) kVar.f26821c;
        if (j1Var.f26815b) {
            j1Var.a(j1Var.d());
            j1Var.f26815b = false;
        }
        this.f26770w0 = 1000000000000L;
        for (int i11 = 0; i11 < this.f26741a.length; i11++) {
            try {
                i(i11);
            } catch (ExoPlaybackException e8) {
                e = e8;
                b7.a.p("Disable failed.", e);
            } catch (RuntimeException e10) {
                e = e10;
                b7.a.p("Disable failed.", e);
            }
        }
        this.D0 = -9223372036854775807L;
        if (z11) {
            for (f1 f1Var : this.f26741a) {
                try {
                    f1Var.k();
                } catch (RuntimeException e11) {
                    b7.a.p("Reset failed.", e11);
                }
            }
        }
        this.f26768u0 = 0;
        y0 y0Var = this.f26754h0;
        p7.b0 b0Var = y0Var.f26954b;
        long j14 = y0Var.f26970s;
        if (this.f26754h0.f26954b.b()) {
            j11 = this.f26754h0.f26955c;
        } else {
            y0 y0Var2 = this.f26754h0;
            y6.m0 m0Var = this.N;
            p7.b0 b0Var2 = y0Var2.f26954b;
            y6.o0 o0Var = y0Var2.f26953a;
            if (o0Var.p() || o0Var.g(b0Var2.f46328a, m0Var).f57233f) {
                j11 = this.f26754h0.f26955c;
            } else {
                j11 = this.f26754h0.f26970s;
            }
        }
        if (z12) {
            this.f26769v0 = null;
            Pair pairO = o(this.f26754h0.f26953a);
            b0Var = (p7.b0) pairO.first;
            long jLongValue = ((Long) pairO.second).longValue();
            z15 = b0Var.equals(this.f26754h0.f26954b) ? false : true;
            j12 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            long j15 = j11;
            j12 = j14;
            j13 = j15;
            z15 = false;
        }
        this.T.b();
        this.f26761o0 = false;
        y6.o0 o0Var2 = this.f26754h0.f26953a;
        if (z13 && (o0Var2 instanceof d1)) {
            d1 d1Var2 = (d1) o0Var2;
            p7.c1 c1Var = this.U.f26945j;
            y6.o0[] o0VarArr = d1Var2.f26696h;
            y6.o0[] o0VarArr2 = new y6.o0[o0VarArr.length];
            for (int i12 = 0; i12 < o0VarArr.length; i12++) {
                o0VarArr2[i12] = new c1(o0VarArr[i12]);
            }
            d1Var = new d1(o0VarArr2, d1Var2.f26697i, c1Var);
            if (b0Var.f46329b != -1) {
                d1Var.g(b0Var.f46328a, this.N);
                int i13 = this.N.f57230c;
                y6.n0 n0Var = this.M;
                d1Var.m(i13, n0Var, 0L);
                if (n0Var.a()) {
                    b0Var = new p7.b0(b0Var.f46331d, b0Var.f46328a);
                }
            }
        } else {
            d1Var = o0Var2;
        }
        y0 y0Var3 = this.f26754h0;
        int i14 = y0Var3.f26957e;
        ExoPlaybackException exoPlaybackException = z14 ? null : y0Var3.f26958f;
        p7.g1 g1Var = z15 ? p7.g1.f46387d : y0Var3.f26960h;
        s7.w wVar = z15 ? this.f26749e : y0Var3.f26961i;
        List listS = z15 ? ImmutableList.s() : y0Var3.f26962j;
        y0 y0Var4 = this.f26754h0;
        this.f26754h0 = new y0(d1Var, b0Var, j13, j12, i14, exoPlaybackException, false, g1Var, wVar, listS, b0Var, y0Var4.f26964l, y0Var4.m, y0Var4.f26965n, y0Var4.f26966o, j12, 0L, j12, 0L, false);
        if (z13) {
            n0 n0Var2 = this.T;
            if (!n0Var2.f26889q.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < n0Var2.f26889q.size(); i15++) {
                    ((l0) n0Var2.f26889q.get(i15)).i();
                }
                n0Var2.f26889q = arrayList;
                n0Var2.m = null;
                n0Var2.k();
            }
            x0 x0Var = this.U;
            HashMap map = x0Var.f26941f;
            for (v0 v0Var : map.values()) {
                try {
                    v0Var.f26926a.n(v0Var.f26927b);
                } catch (RuntimeException e12) {
                    b7.a.p("Failed to release child source.", e12);
                }
                p7.a aVar = v0Var.f26926a;
                u0 u0Var = v0Var.f26928c;
                aVar.q(u0Var);
                v0Var.f26926a.p(u0Var);
            }
            map.clear();
            x0Var.f26942g.clear();
            x0Var.f26946k = false;
        }
    }

    public final void P() {
        l0 l0Var = this.T.f26882i;
        this.f26758l0 = l0Var != null && l0Var.f26831g.f26850i && this.f26757k0;
    }

    public final void Q(long j11) {
        l0 l0Var = this.T.f26882i;
        long j12 = j11 + (l0Var == null ? 1000000000000L : l0Var.f26839p);
        this.f26770w0 = j12;
        ((j1) this.P.f26821c).a(j12);
        for (f1 f1Var : this.f26741a) {
            long j13 = this.f26770w0;
            e eVarD = f1Var.d(l0Var);
            if (eVarD != null) {
                eVarD.P = false;
                eVarD.N = j13;
                eVarD.O = j13;
                eVarD.r(j13, false);
            }
        }
        for (l0 l0Var2 = r0.f26882i; l0Var2 != null; l0Var2 = l0Var2.m) {
            for (s7.s sVar : l0Var2.f26838o.f51471c) {
                if (sVar != null) {
                    sVar.r();
                }
            }
        }
    }

    public final void R(y6.o0 o0Var, y6.o0 o0Var2) {
        if (o0Var.p() && o0Var2.p()) {
            return;
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            hh.p0.z(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j11) {
        boolean z11 = this.f26750e0;
        long jMin = 1000;
        long j12 = G0;
        if (z11) {
            this.f26748d0.getClass();
            jMin = this.f26754h0.f26957e != 3 ? j12 : 1000L;
            for (f1 f1Var : this.f26741a) {
                long j13 = this.f26770w0;
                long j14 = this.f26771x0;
                e eVar = (e) f1Var.f26735f;
                e eVar2 = (e) f1Var.f26734e;
                long jI = f1.h(eVar2) ? eVar2.i(j13, j14) : Long.MAX_VALUE;
                if (eVar != null && eVar.H != 0) {
                    jI = Math.min(jI, eVar.i(j13, j14));
                }
                jMin = Math.min(jMin, b7.f0.V(jI));
            }
            if (this.f26754h0.m()) {
                l0 l0Var = this.T.f26882i;
                l0 l0Var2 = l0Var != null ? l0Var.m : null;
                if (l0Var2 != null) {
                    if ((b7.f0.K(jMin) * this.f26754h0.f26966o.f57185a) + this.f26770w0 >= l0Var2.e()) {
                        jMin = Math.min(jMin, j12);
                    }
                }
            }
        } else if (this.f26754h0.f26957e != 3 || q0()) {
            jMin = j12;
        }
        this.H.f3950a.sendEmptyMessageAtTime(2, j11 + jMin);
    }

    public final void V(boolean z11) {
        p7.b0 b0Var = this.T.f26882i.f26831g.f26842a;
        long jX = X(b0Var, this.f26754h0.f26970s, true, false);
        if (jX != this.f26754h0.f26970s) {
            y0 y0Var = this.f26754h0;
            this.f26754h0 = y(b0Var, jX, y0Var.f26955c, y0Var.f26956d, z11, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:26:0x00a7, B:31:0x00b4, B:33:0x00ba, B:34:0x00bd, B:38:0x00d0, B:40:0x00d6, B:44:0x00de, B:48:0x00ec, B:49:0x00f1, B:51:0x00f9, B:53:0x010a, B:59:0x0118), top: B:110:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4 A[Catch: all -> 0x00aa, TryCatch #4 {all -> 0x00aa, blocks: (B:26:0x00a7, B:31:0x00b4, B:33:0x00ba, B:34:0x00bd, B:38:0x00d0, B:40:0x00d6, B:44:0x00de, B:48:0x00ec, B:49:0x00f1, B:51:0x00f9, B:53:0x010a, B:59:0x0118), top: B:110:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba A[Catch: all -> 0x00aa, TryCatch #4 {all -> 0x00aa, blocks: (B:26:0x00a7, B:31:0x00b4, B:33:0x00ba, B:34:0x00bd, B:38:0x00d0, B:40:0x00d6, B:44:0x00de, B:48:0x00ec, B:49:0x00f1, B:51:0x00f9, B:53:0x010a, B:59:0x0118), top: B:110:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6 A[Catch: all -> 0x0176, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:24:0x009d, B:36:0x00c6), top: B:106:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d0 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #4 {all -> 0x00aa, blocks: (B:26:0x00a7, B:31:0x00b4, B:33:0x00ba, B:34:0x00bd, B:38:0x00d0, B:40:0x00d6, B:44:0x00de, B:48:0x00ec, B:49:0x00f1, B:51:0x00f9, B:53:0x010a, B:59:0x0118), top: B:110:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, p7.z] */
    public final void W(f0 f0Var, boolean z11) throws Throwable {
        long jLongValue;
        long j11;
        p7.b0 b0VarP;
        long j12;
        boolean z12;
        long j13;
        long j14;
        long jI;
        boolean z13;
        n0 n0Var;
        boolean z14;
        long jX;
        boolean z15;
        p7.b0 b0Var;
        long j15;
        p7.b0 b0Var2;
        long j16;
        long j17;
        l0 l0Var;
        y0 y0Var;
        int i11;
        int i12;
        long j18;
        g0 g0Var = this;
        g0Var.f26755i0.c(z11 ? 1 : 0);
        if (g0Var.f26752f0) {
            g0Var.f26753g0 = f0Var;
            return;
        }
        Pair pairS = S(g0Var.f26754h0.f26953a, f0Var, true, g0Var.f26762p0, g0Var.f26763q0, g0Var.M, g0Var.N);
        try {
            try {
                if (pairS != null) {
                    Object obj = pairS.first;
                    jLongValue = ((Long) pairS.second).longValue();
                    j11 = f0Var.f26729c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                    b0VarP = g0Var.T.p(g0Var.f26754h0.f26953a, obj, jLongValue);
                    if (b0VarP.b()) {
                        g0Var.f26754h0.f26953a.g(b0VarP.f46328a, g0Var.N);
                        if (g0Var.N.e(b0VarP.f46329b) == b0VarP.f46330c) {
                            g0Var.N.f57234g.getClass();
                        }
                        z12 = true;
                        jLongValue = 0;
                    } else {
                        j12 = 0;
                        z12 = f0Var.f26729c == -9223372036854775807L;
                    }
                    if (g0Var.f26754h0.f26953a.p()) {
                        if (pairS == null) {
                            if (g0Var.f26754h0.f26957e != 1) {
                                g0Var.m0(4);
                            }
                            g0Var.O(false, true, false, true);
                        } else {
                            if (b0VarP.equals(g0Var.f26754h0.f26954b)) {
                                l0Var = g0Var.T.f26882i;
                                if (l0Var == null && l0Var.f26829e && jLongValue != j12) {
                                    ?? r9 = l0Var.f26825a;
                                    long j19 = g0Var.M.m;
                                    if (g0Var.f26750e0 && j19 != -9223372036854775807L) {
                                        g0Var.f26748d0.getClass();
                                    }
                                    jI = r9.i(jLongValue, g0Var.f26746c0);
                                } else {
                                    jI = jLongValue;
                                }
                                if (b7.f0.V(jI) != b7.f0.V(g0Var.f26754h0.f26970s) && ((i11 = (y0Var = g0Var.f26754h0).f26957e) == 2 || i11 == 3)) {
                                    j17 = y0Var.f26970s;
                                    i12 = 2;
                                    j18 = j17;
                                    z12 = z12;
                                    b0Var2 = b0VarP;
                                    j16 = j11;
                                }
                            } else {
                                jI = jLongValue;
                            }
                            try {
                                g0Var.f26752f0 = g0Var.f26750e0;
                                if (g0Var.f26754h0.f26957e == 4) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                try {
                                    n0Var = g0Var.T;
                                    if (n0Var.f26882i != n0Var.f26883j) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    jX = g0Var.X(b0VarP, jI, z14, z13);
                                    if (jLongValue != jX) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    z12 |= z15;
                                    try {
                                        y0 y0Var2 = g0Var.f26754h0;
                                        b0Var = b0VarP;
                                        try {
                                            y6.o0 o0Var = y0Var2.f26953a;
                                            j15 = j11;
                                            try {
                                                g0Var.A0(o0Var, b0Var, o0Var, y0Var2.f26954b, j15, true);
                                                b0Var2 = b0Var;
                                                j16 = j15;
                                                j17 = jX;
                                                i12 = 2;
                                                j18 = j17;
                                                g0Var = this;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                b0VarP = b0Var;
                                                j13 = j15;
                                                j14 = jX;
                                                g0Var.f26754h0 = g0Var.y(b0VarP, j14, j13, j14, z12, 2);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            b0VarP = b0Var;
                                            j13 = j11;
                                            j14 = jX;
                                            g0Var.f26754h0 = g0Var.y(b0VarP, j14, j13, j14, z12, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    j13 = j11;
                                    j14 = jLongValue;
                                    g0Var.f26754h0 = g0Var.y(b0VarP, j14, j13, j14, z12, 2);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                        g0Var.f26754h0 = g0Var.y(b0Var2, j17, j16, j18, z12, i12);
                        return;
                    }
                    g0Var.f26769v0 = f0Var;
                    z12 = z12;
                    b0Var2 = b0VarP;
                    j17 = jLongValue;
                    j16 = j11;
                    i12 = 2;
                    j18 = j17;
                    g0Var = this;
                    g0Var.f26754h0 = g0Var.y(b0Var2, j17, j16, j18, z12, i12);
                    return;
                }
                Pair pairO = g0Var.o(g0Var.f26754h0.f26953a);
                b0VarP = (p7.b0) pairO.first;
                jLongValue = ((Long) pairO.second).longValue();
                z12 = !g0Var.f26754h0.f26953a.p();
                j11 = -9223372036854775807L;
                if (g0Var.f26754h0.f26953a.p()) {
                    if (pairS == null) {
                        if (g0Var.f26754h0.f26957e != 1) {
                            g0Var.m0(4);
                        }
                        g0Var.O(false, true, false, true);
                    } else {
                        if (b0VarP.equals(g0Var.f26754h0.f26954b)) {
                            l0Var = g0Var.T.f26882i;
                            if (l0Var == null) {
                                jI = jLongValue;
                            } else {
                                jI = jLongValue;
                            }
                            if (b7.f0.V(jI) != b7.f0.V(g0Var.f26754h0.f26970s)) {
                            }
                        } else {
                            jI = jLongValue;
                        }
                        g0Var.f26752f0 = g0Var.f26750e0;
                        if (g0Var.f26754h0.f26957e == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        n0Var = g0Var.T;
                        if (n0Var.f26882i != n0Var.f26883j) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        jX = g0Var.X(b0VarP, jI, z14, z13);
                        if (jLongValue != jX) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z12 |= z15;
                        y0 y0Var3 = g0Var.f26754h0;
                        b0Var = b0VarP;
                        y6.o0 o0Var2 = y0Var3.f26953a;
                        j15 = j11;
                        g0Var.A0(o0Var2, b0Var, o0Var2, y0Var3.f26954b, j15, true);
                        b0Var2 = b0Var;
                        j16 = j15;
                        j17 = jX;
                        i12 = 2;
                        j18 = j17;
                        g0Var = this;
                    }
                    g0Var.f26754h0 = g0Var.y(b0Var2, j17, j16, j18, z12, i12);
                    return;
                }
                g0Var.f26769v0 = f0Var;
                z12 = z12;
                b0Var2 = b0VarP;
                j17 = jLongValue;
                j16 = j11;
                i12 = 2;
                j18 = j17;
                g0Var = this;
                g0Var.f26754h0 = g0Var.y(b0Var2, j17, j16, j18, z12, i12);
                return;
            } catch (Throwable th7) {
                th = th7;
                z12 = z12;
                b0VarP = b0VarP;
                j14 = jLongValue;
                j13 = j11;
            }
        } catch (Throwable th8) {
            th = th8;
            z12 = z12;
            b0VarP = b0VarP;
        }
        j12 = 0;
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, p7.z] */
    public final long X(p7.b0 b0Var, long j11, boolean z11, boolean z12) {
        f1[] f1VarArr;
        u0();
        B0(false, true);
        if (z12 || this.f26754h0.f26957e == 3) {
            m0(2);
        }
        n0 n0Var = this.T;
        l0 l0Var = n0Var.f26882i;
        l0 l0Var2 = l0Var;
        while (l0Var2 != null && !b0Var.equals(l0Var2.f26831g.f26842a)) {
            l0Var2 = l0Var2.m;
        }
        if (z11 || l0Var != l0Var2 || (l0Var2 != null && l0Var2.f26839p + j11 < 0)) {
            int i11 = 0;
            while (true) {
                f1VarArr = this.f26741a;
                if (i11 >= f1VarArr.length) {
                    break;
                }
                i(i11);
                i11++;
            }
            this.D0 = -9223372036854775807L;
            if (l0Var2 != null) {
                while (n0Var.f26882i != l0Var2) {
                    n0Var.a();
                }
                n0Var.n(l0Var2);
                l0Var2.f26839p = 1000000000000L;
                l(new boolean[f1VarArr.length], n0Var.f26883j.e());
                l0Var2.f26832h = true;
            }
        }
        h();
        if (l0Var2 != null) {
            ?? r11 = l0Var2.f26825a;
            n0Var.n(l0Var2);
            if (!l0Var2.f26829e) {
                l0Var2.f26831g = l0Var2.f26831g.b(j11);
            } else if (l0Var2.f26830f) {
                j11 = r11.k(j11);
                r11.l(j11 - this.O);
            }
            Q(j11);
            C();
        } else {
            n0Var.b();
            Q(j11);
        }
        u(false);
        this.H.e(2);
        return j11;
    }

    public final void Y(b1 b1Var) {
        b1Var.getClass();
        b7.a0 a0Var = this.H;
        if (b1Var.f26670e != this.L) {
            a0Var.a(15, b1Var).b();
            return;
        }
        synchronized (b1Var) {
        }
        try {
            b1Var.f26666a.f(b1Var.f26668c, b1Var.f26669d);
            b1Var.a(true);
            int i11 = this.f26754h0.f26957e;
            if (i11 == 3 || i11 == 2) {
                a0Var.e(2);
            }
        } catch (Throwable th2) {
            b1Var.a(true);
            throw th2;
        }
    }

    public final void Z(b1 b1Var) {
        Looper looper = b1Var.f26670e;
        if (looper.getThread().isAlive()) {
            this.R.a(looper, null).c(new b2.a(this, b1Var));
        } else {
            b7.a.B("Trying to send message on a dead thread.");
            b1Var.a(false);
        }
    }

    public final void a(d0 d0Var, int i11) throws Throwable {
        this.f26755i0.c(1);
        x0 x0Var = this.U;
        if (i11 == -1) {
            i11 = x0Var.f26937b.size();
        }
        v(x0Var.a(i11, d0Var.f26685a, d0Var.f26686b), false);
    }

    public final void a0(y6.d dVar, boolean z11) {
        s7.q qVar = (s7.q) this.f26747d;
        if (!qVar.f51457i.equals(dVar)) {
            qVar.f51457i = dVar;
            qVar.f();
        }
        if (!z11) {
            dVar = null;
        }
        d dVar2 = this.f26744b0;
        if (!Objects.equals(dVar2.f26680d, dVar)) {
            dVar2.f26680d = dVar;
            int i11 = dVar == null ? 0 : 1;
            dVar2.f26682f = i11;
            b7.a.c("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i11 == 1 || i11 == 0);
        }
        y0 y0Var = this.f26754h0;
        boolean z12 = y0Var.f26964l;
        y0(dVar2.d(y0Var.f26957e, z12), y0Var.f26965n, y0Var.m, z12);
    }

    @Override // p7.a1
    public final void b(p7.b1 b1Var) {
        this.H.a(9, (p7.z) b1Var).b();
    }

    public final void b0(boolean z11, b7.f fVar) {
        if (this.f26764r0 != z11) {
            this.f26764r0 = z11;
            if (!z11) {
                for (f1 f1Var : this.f26741a) {
                    f1Var.k();
                }
            }
        }
        if (fVar != null) {
            fVar.c();
        }
    }

    @Override // v7.t
    public final void c(long j11, long j12, y6.p pVar, MediaFormat mediaFormat) {
        if (this.f26752f0) {
            b7.a0 a0Var = this.H;
            a0Var.getClass();
            b7.z zVarB = b7.a0.b();
            zVarB.f4046a = a0Var.f3950a.obtainMessage(37);
            zVarB.b();
        }
    }

    public final void c0(d0 d0Var) throws Throwable {
        this.f26755i0.c(1);
        int i11 = d0Var.f26687c;
        p7.c1 c1Var = d0Var.f26686b;
        ArrayList arrayList = d0Var.f26685a;
        if (i11 != -1) {
            this.f26769v0 = new f0(new d1(arrayList, c1Var), d0Var.f26687c, d0Var.f26688d);
        }
        x0 x0Var = this.U;
        ArrayList arrayList2 = x0Var.f26937b;
        x0Var.g(0, arrayList2.size());
        v(x0Var.a(arrayList2.size(), arrayList, c1Var), false);
    }

    @Override // p7.y
    public final void d(p7.z zVar) {
        this.H.a(8, zVar).b();
    }

    public final void d0(boolean z11) {
        this.f26757k0 = z11;
        P();
        if (this.f26758l0) {
            n0 n0Var = this.T;
            if (n0Var.f26883j != n0Var.f26882i) {
                V(true);
                u(false);
            }
        }
    }

    public final void e() {
        for (f1 f1Var : this.f26741a) {
            g1 g1Var = this.f26750e0 ? this.f26748d0 : null;
            ((e) f1Var.f26734e).f(18, g1Var);
            e eVar = (e) f1Var.f26735f;
            if (eVar != null) {
                eVar.f(18, g1Var);
            }
        }
    }

    public final void e0(y6.e0 e0Var) {
        this.H.d(16);
        k kVar = this.P;
        kVar.c(e0Var);
        y6.e0 e0VarB = kVar.b();
        x(e0VarB, e0VarB.f57185a, true, true);
    }

    public final boolean f() {
        if (!this.f26742a0) {
            return false;
        }
        for (f1 f1Var : this.f26741a) {
            if (f1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void f0(o oVar) {
        this.C0 = oVar;
        y6.o0 o0Var = this.f26754h0.f26953a;
        n0 n0Var = this.T;
        n0Var.getClass();
        oVar.getClass();
        if (n0Var.f26889q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < n0Var.f26889q.size(); i11++) {
            ((l0) n0Var.f26889q.get(i11)).i();
        }
        n0Var.f26889q = arrayList;
        n0Var.m = null;
        n0Var.k();
    }

    public final void g() {
        N();
        V(true);
    }

    public final void g0(int i11) {
        this.f26762p0 = i11;
        y6.o0 o0Var = this.f26754h0.f26953a;
        n0 n0Var = this.T;
        n0Var.f26880g = i11;
        int iR = n0Var.r(o0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            h();
        }
        u(false);
    }

    public final void h() {
        e eVar;
        if (this.f26742a0 && f()) {
            for (f1 f1Var : this.f26741a) {
                int iC = f1Var.c();
                if (f1Var.f()) {
                    int i11 = f1Var.f26733d;
                    boolean z11 = i11 == 4 || i11 == 2;
                    int i12 = i11 != 4 ? 0 : 1;
                    if (z11) {
                        eVar = (e) f1Var.f26734e;
                    } else {
                        eVar = (e) f1Var.f26735f;
                        eVar.getClass();
                    }
                    f1Var.a(eVar, this.P);
                    f1Var.i(z11);
                    f1Var.f26733d = i12;
                }
                this.f26768u0 -= iC - f1Var.c();
            }
            this.D0 = -9223372036854775807L;
        }
    }

    public final void h0(boolean z11) throws Throwable {
        if (!z11) {
            this.f26752f0 = false;
            this.H.d(37);
            f0 f0Var = this.f26753g0;
            if (f0Var != null) {
                W(f0Var, false);
                this.f26753g0 = null;
            }
        }
        this.f26750e0 = z11;
        e();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i11;
        l0 l0Var;
        p7.b0 b0Var;
        l0 l0Var2;
        int i12;
        int i13 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z11 = message.arg1 != 0;
                    int i14 = message.arg2;
                    this.f26755i0.c(1);
                    y0(this.f26744b0.d(this.f26754h0.f26957e, z11), i14 >> 4, i14 & 15, z11);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    W((f0) message.obj, true);
                    break;
                case 4:
                    e0((y6.e0) message.obj);
                    break;
                case 5:
                    j0((h1) message.obj);
                    break;
                case 6:
                    t0(false, true);
                    break;
                case 7:
                    K((b7.f) message.obj);
                    return true;
                case 8:
                    w((p7.z) message.obj);
                    break;
                case 9:
                    s((p7.z) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    g0(message.arg1);
                    break;
                case 12:
                    k0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (b7.f) message.obj);
                    break;
                case 14:
                    Y((b1) message.obj);
                    break;
                case 15:
                    Z((b1) message.obj);
                    break;
                case 16:
                    y6.e0 e0Var = (y6.e0) message.obj;
                    x(e0Var, e0Var.f57185a, true, false);
                    break;
                case 17:
                    c0((d0) message.obj);
                    break;
                case 18:
                    a((d0) message.obj, message.arg1);
                    break;
                case 19:
                    hh.p0.z(message.obj);
                    I();
                    throw null;
                case 20:
                    M(message.arg1, message.arg2, (p7.c1) message.obj);
                    break;
                case 21:
                    l0((p7.c1) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    d0(message.arg1 != 0);
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                default:
                    return false;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    g();
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    N();
                    V(true);
                    break;
                case 27:
                    x0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    f0((o) message.obj);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    o0(pair.first, (b7.f) pair.second);
                    break;
                case 31:
                    a0((y6.d) message.obj, message.arg1 != 0);
                    break;
                case Consts.SP /* 32 */:
                    p0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    q(message.arg1);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    r();
                    break;
                case 35:
                    n0((v7.t) message.obj);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    h0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f26752f0 = false;
                    f0 f0Var = this.f26753g0;
                    if (f0Var != null) {
                        W(f0Var, false);
                        this.f26753g0 = null;
                    }
                    break;
                case 38:
                    i0((g1) message.obj);
                    break;
            }
        } catch (ParserException e8) {
            boolean z12 = e8.f2110a;
            int i15 = e8.f2111b;
            if (i15 == 1) {
                i12 = z12 ? 3001 : INTENTS.REQ_SIGN_UP;
            } else {
                if (i15 == 4) {
                    i12 = z12 ? INTENTS.REQ_FLASH_CARD_SETTING : INTENTS.REQ_LOGIN;
                }
                t(e8, i13);
            }
            i13 = i12;
            t(e8, i13);
        } catch (DataSourceException e10) {
            t(e10, e10.f2115a);
        } catch (ExoPlaybackException e11) {
            e = e11;
            int i16 = e.f2119c;
            n0 n0Var = this.T;
            if (i16 == 1 && (l0Var2 = n0Var.f26883j) != null && e.H == null) {
                e = e.a(l0Var2.f26831g.f26842a);
            }
            int i17 = e.f2119c;
            b7.a0 a0Var = this.H;
            if (i17 == 1 && (b0Var = e.H) != null && A(e.f2121e, b0Var)) {
                this.E0 = true;
                h();
                l0 l0VarG = n0Var.g();
                l0 l0Var3 = n0Var.f26882i;
                if (l0Var3 != l0VarG) {
                    while (l0Var3 != null) {
                        l0 l0Var4 = l0Var3.m;
                        if (l0Var4 == l0VarG) {
                            break;
                        }
                        l0Var3 = l0Var4;
                    }
                }
                n0Var.n(l0Var3);
                if (this.f26754h0.f26957e != 4) {
                    C();
                    a0Var.e(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.A0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.A0;
                }
                if (e.f2119c == 1 && n0Var.f26882i != n0Var.f26883j) {
                    while (true) {
                        l0Var = n0Var.f26882i;
                        if (l0Var == n0Var.f26883j) {
                            break;
                        }
                        n0Var.a();
                    }
                    b7.a.h(l0Var);
                    E();
                    m0 m0Var = l0Var.f26831g;
                    p7.b0 b0Var2 = m0Var.f26842a;
                    long j11 = m0Var.f26843b;
                    this.f26754h0 = y(b0Var2, j11, m0Var.f26844c, j11, true, 0);
                }
                if (e.K && (this.A0 == null || (i11 = e.f2112a) == 5004 || i11 == 5003)) {
                    b7.a.C("Recoverable renderer error", e);
                    if (this.A0 == null) {
                        this.A0 = e;
                    }
                    b7.z zVarA = a0Var.a(25, e);
                    Handler handler = a0Var.f3950a;
                    Message message2 = zVarA.f4046a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    zVarA.a();
                } else {
                    b7.a.p("Playback error", e);
                    t0(true, false);
                    this.f26754h0 = this.f26754h0.f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e12) {
            t(e12, e12.f2137a);
        } catch (BehindLiveWindowException e13) {
            t(e13, 1002);
        } catch (IOException e14) {
            t(e14, 2000);
        } catch (RuntimeException e15) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e15, ((e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) ? 1004 : 1000);
            b7.a.p("Playback error", exoPlaybackException2);
            t0(true, false);
            this.f26754h0 = this.f26754h0.f(exoPlaybackException2);
        }
        E();
        return true;
    }

    public final void i(int i11) {
        f1[] f1VarArr = this.f26741a;
        int iC = f1VarArr[i11].c();
        f1 f1Var = f1VarArr[i11];
        e eVar = (e) f1Var.f26734e;
        k kVar = this.P;
        f1Var.a(eVar, kVar);
        e eVar2 = (e) f1Var.f26735f;
        if (eVar2 != null) {
            boolean z11 = (eVar2.H == 0 || f1Var.f26733d == 3) ? false : true;
            f1Var.a(eVar2, kVar);
            f1Var.i(false);
            if (z11) {
                e eVar3 = (e) f1Var.f26734e;
                eVar2.getClass();
                eVar2.f(17, eVar3);
            }
        }
        f1Var.f26733d = 0;
        G(i11, false);
        this.f26768u0 -= iC;
    }

    public final void i0(g1 g1Var) {
        this.f26748d0 = g1Var;
        e();
    }

    /* JADX WARN: Failed to calculate best type for var: r23v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v8 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v86 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v86 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v3 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 2292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.g0.j():void");
    }

    public final void j0(h1 h1Var) {
        this.f26746c0 = h1Var;
    }

    public final void k(l0 l0Var, int i11, boolean z11, long j11) {
        f1 f1Var = this.f26741a[i11];
        boolean zG = f1Var.g();
        e eVar = (e) f1Var.f26734e;
        if (zG) {
            return;
        }
        boolean z12 = l0Var == this.T.f26882i;
        s7.w wVar = l0Var.f26838o;
        e1 e1Var = wVar.f51470b[i11];
        s7.s sVar = wVar.f51471c[i11];
        boolean z13 = q0() && this.f26754h0.f26957e == 3;
        boolean z14 = !z11 && z13;
        this.f26768u0++;
        p7.z0 z0Var = l0Var.f26827c[i11];
        long j12 = l0Var.f26839p;
        p7.b0 b0Var = l0Var.f26831g.f26842a;
        e eVar2 = (e) f1Var.f26735f;
        int length = sVar != null ? sVar.length() : 0;
        y6.p[] pVarArr = new y6.p[length];
        for (int i12 = 0; i12 < length; i12++) {
            sVar.getClass();
            pVarArr[i12] = sVar.f(i12);
        }
        int i13 = f1Var.f26733d;
        k kVar = this.P;
        if (i13 == 0 || i13 == 2 || i13 == 4) {
            f1Var.f26730a = true;
            b7.a.j(eVar.H == 0);
            eVar.f26702d = e1Var;
            eVar.S = b0Var;
            eVar.H = 1;
            eVar.q(z14, z12);
            eVar.z(pVarArr, z0Var, j11, j12, b0Var);
            eVar.P = false;
            eVar.N = j11;
            eVar.O = j11;
            eVar.r(j11, z14);
            kVar.a(eVar);
        } else {
            f1Var.f26731b = true;
            eVar2.getClass();
            b7.a.j(eVar2.H == 0);
            eVar2.f26702d = e1Var;
            eVar2.S = b0Var;
            eVar2.H = 1;
            eVar2.q(z14, z12);
            eVar2.z(pVarArr, z0Var, j11, j12, b0Var);
            eVar2.P = false;
            eVar2.N = j11;
            eVar2.O = j11;
            eVar2.r(j11, z14);
            kVar.a(eVar2);
        }
        c0 c0Var = new c0(this);
        e eVarD = f1Var.d(l0Var);
        eVarD.getClass();
        eVarD.f(11, c0Var);
        if (z13 && z12) {
            f1Var.m();
        }
    }

    public final void k0(boolean z11) {
        this.f26763q0 = z11;
        y6.o0 o0Var = this.f26754h0.f26953a;
        n0 n0Var = this.T;
        n0Var.f26881h = z11;
        int iR = n0Var.r(o0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            h();
        }
        u(false);
    }

    public final void l(boolean[] zArr, long j11) {
        f1[] f1VarArr;
        long j12;
        l0 l0Var = this.T.f26883j;
        s7.w wVar = l0Var.f26838o;
        int i11 = 0;
        while (true) {
            f1VarArr = this.f26741a;
            if (i11 >= f1VarArr.length) {
                break;
            }
            if (!wVar.b(i11)) {
                f1VarArr[i11].k();
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < f1VarArr.length) {
            if (wVar.b(i12) && f1VarArr[i12].d(l0Var) == null) {
                j12 = j11;
                k(l0Var, i12, zArr[i12], j12);
            } else {
                j12 = j11;
            }
            i12++;
            j11 = j12;
        }
    }

    public final void l0(p7.c1 c1Var) throws Throwable {
        this.f26755i0.c(1);
        x0 x0Var = this.U;
        int size = x0Var.f26937b.size();
        if (c1Var.f46337b.length != size) {
            c1Var = new p7.c1(new Random(c1Var.f46336a.nextLong())).a(size);
        }
        x0Var.f26945j = c1Var;
        v(x0Var.b(), false);
    }

    public final long m(y6.o0 o0Var, Object obj, long j11) {
        y6.m0 m0Var = this.N;
        int i11 = o0Var.g(obj, m0Var).f57230c;
        y6.n0 n0Var = this.M;
        o0Var.n(i11, n0Var);
        if (n0Var.f57243f != -9223372036854775807L && n0Var.a() && n0Var.f57246i) {
            return b7.f0.K(b7.f0.v(n0Var.f57244g) - n0Var.f57243f) - (j11 + m0Var.f57232e);
        }
        return -9223372036854775807L;
    }

    public final void m0(int i11) {
        y0 y0Var = this.f26754h0;
        if (y0Var.f26957e != i11) {
            if (i11 != 2) {
                this.B0 = -9223372036854775807L;
            }
            if (i11 != 3 && y0Var.f26967p) {
                this.f26754h0 = y0Var.i(false);
            }
            this.f26754h0 = this.f26754h0.h(i11);
        }
    }

    public final long n(l0 l0Var) {
        if (l0Var == null) {
            return 0L;
        }
        long jMax = l0Var.f26839p;
        if (!l0Var.f26829e) {
            return jMax;
        }
        int i11 = 0;
        while (true) {
            f1[] f1VarArr = this.f26741a;
            if (i11 >= f1VarArr.length) {
                return jMax;
            }
            if (f1VarArr[i11].d(l0Var) != null) {
                e eVarD = f1VarArr[i11].d(l0Var);
                Objects.requireNonNull(eVarD);
                long j11 = eVarD.O;
                if (j11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j11, jMax);
            }
            i11++;
        }
    }

    public final void n0(v7.t tVar) {
        for (f1 f1Var : this.f26741a) {
            e eVar = (e) f1Var.f26734e;
            if (eVar.f26700b == 2) {
                eVar.f(7, tVar);
                e eVar2 = (e) f1Var.f26735f;
                if (eVar2 != null) {
                    eVar2.f(7, tVar);
                }
            }
        }
    }

    public final Pair o(y6.o0 o0Var) {
        long j11 = 0;
        if (o0Var.p()) {
            return Pair.create(y0.f26952u, 0L);
        }
        int iA = o0Var.a(this.f26763q0);
        Pair pairI = o0Var.i(this.M, this.N, iA, -9223372036854775807L);
        p7.b0 b0VarP = this.T.p(o0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (b0VarP.b()) {
            Object obj = b0VarP.f46328a;
            y6.m0 m0Var = this.N;
            o0Var.g(obj, m0Var);
            if (b0VarP.f46330c == m0Var.e(b0VarP.f46329b)) {
                m0Var.f57234g.getClass();
            }
        } else {
            j11 = jLongValue;
        }
        return Pair.create(b0VarP, Long.valueOf(j11));
    }

    public final void o0(Object obj, b7.f fVar) {
        for (f1 f1Var : this.f26741a) {
            e eVar = (e) f1Var.f26734e;
            if (eVar.f26700b == 2) {
                int i11 = f1Var.f26733d;
                if (i11 == 4 || i11 == 1) {
                    e eVar2 = (e) f1Var.f26735f;
                    eVar2.getClass();
                    eVar2.f(1, obj);
                } else {
                    eVar.f(1, obj);
                }
            }
        }
        int i12 = this.f26754h0.f26957e;
        if (i12 == 3 || i12 == 2) {
            this.H.e(2);
        }
        if (fVar != null) {
            fVar.c();
        }
    }

    public final long p(long j11) {
        l0 l0Var = this.T.f26885l;
        if (l0Var == null) {
            return 0L;
        }
        return Math.max(0L, j11 - (this.f26770w0 - l0Var.f26839p));
    }

    public final void p0(float f5) {
        this.F0 = f5;
        float f11 = f5 * this.f26744b0.f26683g;
        for (f1 f1Var : this.f26741a) {
            e eVar = (e) f1Var.f26734e;
            if (eVar.f26700b == 1) {
                eVar.f(2, Float.valueOf(f11));
                e eVar2 = (e) f1Var.f26735f;
                if (eVar2 != null) {
                    eVar2.f(2, Float.valueOf(f11));
                }
            }
        }
    }

    public final void q(int i11) {
        y0 y0Var = this.f26754h0;
        y0(i11, y0Var.f26965n, y0Var.m, y0Var.f26964l);
    }

    public final boolean q0() {
        y0 y0Var = this.f26754h0;
        return y0Var.f26964l && y0Var.f26965n == 0;
    }

    public final void r() {
        p0(this.F0);
    }

    public final boolean r0(y6.o0 o0Var, p7.b0 b0Var) {
        if (b0Var.b() || o0Var.p()) {
            return false;
        }
        int i11 = o0Var.g(b0Var.f46328a, this.N).f57230c;
        y6.n0 n0Var = this.M;
        o0Var.n(i11, n0Var);
        return n0Var.a() && n0Var.f57246i && n0Var.f57243f != -9223372036854775807L;
    }

    public final void s(p7.z zVar) {
        n0 n0Var = this.T;
        l0 l0Var = n0Var.f26885l;
        if (l0Var != null && l0Var.f26825a == zVar) {
            n0Var.m(this.f26770w0);
            C();
            return;
        }
        l0 l0Var2 = n0Var.m;
        if (l0Var2 == null || l0Var2.f26825a != zVar) {
            return;
        }
        D();
    }

    public final void s0() {
        l0 l0Var = this.T.f26882i;
        if (l0Var == null) {
            return;
        }
        s7.w wVar = l0Var.f26838o;
        int i11 = 0;
        while (true) {
            f1[] f1VarArr = this.f26741a;
            if (i11 >= f1VarArr.length) {
                return;
            }
            if (wVar.b(i11)) {
                f1VarArr[i11].m();
            }
            i11++;
        }
    }

    public final void t(IOException iOException, int i11) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i11);
        l0 l0Var = this.T.f26882i;
        if (l0Var != null) {
            exoPlaybackException = exoPlaybackException.a(l0Var.f26831g.f26842a);
        }
        b7.a.p("Playback error", exoPlaybackException);
        t0(false, false);
        this.f26754h0 = this.f26754h0.f(exoPlaybackException);
    }

    public final void t0(boolean z11, boolean z12) {
        O(z11 || !this.f26764r0, false, true, false);
        this.f26755i0.c(z12 ? 1 : 0);
        j jVar = this.f26751f;
        if (jVar.f26809h.remove(this.X) != null) {
            jVar.d();
        }
        this.f26744b0.d(1, this.f26754h0.f26964l);
        m0(1);
    }

    public final void u(boolean z11) {
        l0 l0Var = this.T.f26885l;
        p7.b0 b0Var = l0Var == null ? this.f26754h0.f26954b : l0Var.f26831g.f26842a;
        boolean zEquals = this.f26754h0.f26963k.equals(b0Var);
        if (!zEquals) {
            this.f26754h0 = this.f26754h0.c(b0Var);
        }
        y0 y0Var = this.f26754h0;
        y0Var.f26968q = l0Var == null ? y0Var.f26970s : l0Var.d();
        y0 y0Var2 = this.f26754h0;
        y0Var2.f26969r = p(y0Var2.f26968q);
        if ((!zEquals || z11) && l0Var != null && l0Var.f26829e) {
            w0(l0Var.f26838o);
        }
    }

    public final void u0() {
        k kVar = this.P;
        kVar.f26820b = false;
        j1 j1Var = (j1) kVar.f26821c;
        if (j1Var.f26815b) {
            j1Var.a(j1Var.d());
            j1Var.f26815b = false;
        }
        for (f1 f1Var : this.f26741a) {
            e eVar = (e) f1Var.f26735f;
            e eVar2 = (e) f1Var.f26734e;
            if (f1.h(eVar2)) {
                f1.b(eVar2);
            }
            if (eVar != null && eVar.H != 0) {
                f1.b(eVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0351  */
    /* JADX WARN: Code duplicated, block: B:205:0x0354  */
    /* JADX WARN: Code duplicated, block: B:210:0x0369  */
    /* JADX WARN: Code duplicated, block: B:212:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x0388  */
    /* JADX WARN: Code duplicated, block: B:221:0x0393  */
    /* JADX WARN: Code duplicated, block: B:223:0x0398  */
    /* JADX WARN: Code duplicated, block: B:227:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:232:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:233:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:236:0x03de  */
    /* JADX WARN: Code duplicated, block: B:238:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x0405  */
    /* JADX WARN: Code duplicated, block: B:249:0x0410  */
    /* JADX WARN: Code duplicated, block: B:251:0x0415  */
    /* JADX WARN: Code duplicated, block: B:255:0x0436  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [y6.o0] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [y6.o0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [f7.y0] */
    /* JADX WARN: Type inference failed for: r2v35, types: [f7.n0] */
    /* JADX WARN: Type inference failed for: r35v0, types: [f7.g0] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25, types: [y6.o0] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v(y6.o0 o0Var, boolean z11) throws Throwable {
        long jLongValue;
        y6.o0 o0Var2;
        y6.n0 n0Var;
        Object obj;
        int iA;
        long jH;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        long j11;
        long j12;
        long j13;
        e0 e0Var;
        int i11;
        long jLongValue2;
        boolean z16;
        boolean z17;
        boolean z18;
        ?? r25;
        ?? r11;
        p7.b0 b0Var;
        ?? r26;
        long j14;
        p7.b0 b0Var2;
        Object obj2;
        ?? r9;
        int i12;
        boolean z19;
        ?? r27;
        ?? r12;
        y6.o0 o0Var3;
        l0 l0Var;
        boolean z20;
        long j15;
        p7.b0 b0Var3;
        Object obj3;
        boolean z21;
        int i13;
        y0 y0Var = this.f26754h0;
        f0 f0Var = this.f26769v0;
        n0 n0Var2 = this.T;
        int i14 = this.f26762p0;
        boolean z22 = this.f26763q0;
        y6.n0 n0Var3 = this.M;
        y6.m0 m0Var = this.N;
        int i15 = 4;
        if (o0Var.p()) {
            r25 = 1;
            jLongValue = 0;
            o0Var2 = o0Var;
            e0Var = new e0(y0.f26952u, 0L, -9223372036854775807L, false, true, false);
        } else {
            p7.b0 b0Var4 = y0Var.f26954b;
            Object obj4 = b0Var4.f46328a;
            y6.o0 o0Var4 = y0Var.f26953a;
            boolean z23 = o0Var4.p() || o0Var4.g(b0Var4.f46328a, m0Var).f57233f;
            jLongValue = (y0Var.f26954b.b() || z23) ? y0Var.f26955c : y0Var.f26970s;
            if (f0Var != null) {
                boolean z24 = false;
                o0Var2 = o0Var;
                Pair pairS = S(o0Var2, f0Var, true, i14, z22, n0Var3, m0Var);
                if (pairS == null) {
                    iA = o0Var2.a(z22);
                    obj = obj4;
                    z17 = false;
                    jLongValue2 = jLongValue;
                    z18 = true;
                } else {
                    if (f0Var.f26729c == -9223372036854775807L) {
                        iA = o0Var2.g(pairS.first, m0Var).f57230c;
                        obj = obj4;
                        z16 = false;
                        jLongValue2 = jLongValue;
                    } else {
                        obj = pairS.first;
                        jLongValue2 = ((Long) pairS.second).longValue();
                        iA = -1;
                        z16 = true;
                    }
                    z24 = y0Var.f26957e == 4;
                    z17 = z16;
                    z18 = false;
                }
                jLongValue = jLongValue2;
                n0Var = n0Var3;
                z13 = z18;
                z12 = z24;
                z14 = z17;
            } else {
                o0Var2 = o0Var;
                if (y0Var.f26953a.p()) {
                    iA = o0Var2.a(z22);
                    n0Var = n0Var3;
                    obj = obj4;
                } else if (o0Var2.b(obj4) == -1) {
                    int iT = T(n0Var3, m0Var, i14, z22, obj, y0Var.f26953a, o0Var2);
                    n0Var = n0Var3;
                    if (iT == -1) {
                        obj = obj4;
                        o0Var2 = o0Var2;
                        m0Var = m0Var;
                        iT = o0Var2.a(z22);
                        z15 = true;
                    } else {
                        obj = obj4;
                        o0Var2 = o0Var2;
                        m0Var = m0Var;
                        z15 = false;
                    }
                    iA = iT;
                    z13 = z15;
                    jLongValue = jLongValue;
                    z12 = false;
                    z14 = false;
                } else {
                    n0Var = n0Var3;
                    if (jLongValue == -9223372036854775807L) {
                        obj = obj4;
                        iA = o0Var2.g(obj, m0Var).f57230c;
                    } else if (z23) {
                        y0Var.f26953a.g(b0Var4.f46328a, m0Var);
                        if (y0Var.f26953a.m(m0Var.f57230c, n0Var, 0L).f57250n == y0Var.f26953a.b(b0Var4.f46328a)) {
                            Pair pairI = o0Var2.i(n0Var, m0Var, o0Var2.g(obj, m0Var).f57230c, jLongValue + m0Var.f57232e);
                            obj = pairI.first;
                            jH = ((Long) pairI.second).longValue();
                        } else {
                            jH = o0Var2.g(obj, m0Var).f57231d != -9223372036854775807L ? b7.f0.h(jLongValue, 0L, m0Var.f57231d - 1) : jLongValue;
                        }
                        jLongValue = jH;
                        iA = -1;
                        z12 = false;
                        z13 = false;
                        z14 = true;
                    } else {
                        iA = -1;
                        z12 = false;
                        z13 = false;
                        z14 = false;
                    }
                }
                z12 = false;
                z13 = false;
                z14 = false;
            }
            if (iA != -1) {
                Pair pairI2 = o0Var2.i(n0Var, m0Var, iA, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue = ((Long) pairI2.second).longValue();
                j12 = -9223372036854775807L;
                j11 = jLongValue;
            } else {
                j11 = jLongValue;
                j12 = j11;
            }
            p7.b0 b0VarP = n0Var2.p(o0Var2, obj, j11);
            int i16 = b0VarP.f46332e;
            boolean z25 = b0Var4.f46328a.equals(obj) && !b0Var4.b() && !b0VarP.b() && (i16 == -1 || ((i11 = b0Var4.f46332e) != -1 && i16 >= i11));
            y6.m0 m0VarG = o0Var2.g(obj, m0Var);
            if (!z23 && jLongValue == j12) {
                Object obj5 = b0Var4.f46328a;
                int i17 = b0Var4.f46329b;
                if (obj5.equals(b0VarP.f46328a)) {
                    if (b0Var4.b()) {
                        m0VarG.g(i17);
                    }
                    if (b0VarP.b()) {
                        m0VarG.g(b0VarP.f46329b);
                    }
                }
            }
            if (z25) {
                b0VarP = b0Var4;
            }
            if (!b0VarP.b()) {
                j13 = j11;
            } else if (b0VarP.equals(b0Var4)) {
                j11 = y0Var.f26970s;
                j13 = j11;
            } else {
                o0Var2.g(b0VarP.f46328a, m0Var);
                if (b0VarP.f46330c == m0Var.e(b0VarP.f46329b)) {
                    m0Var.f57234g.getClass();
                }
                j13 = 0;
            }
            p7.b0 b0Var5 = b0VarP;
            e0Var = new e0(b0Var5, j13, j12, z12, z13, z14);
            r25 = b0Var5;
        }
        p7.b0 b0Var6 = e0Var.f26706a;
        long j16 = e0Var.f26708c;
        boolean z26 = e0Var.f26709d;
        long j17 = e0Var.f26707b;
        boolean z27 = (this.f26754h0.f26954b.equals(b0Var6) && j17 == this.f26754h0.f26970s) ? false : true;
        try {
            if (e0Var.f26710e) {
                try {
                    z19 = true;
                    z19 = true;
                    if (this.f26754h0.f26957e != 1) {
                        try {
                            m0(4);
                        } catch (Throwable th2) {
                            th = th2;
                            r11 = o0Var2;
                            b0Var = b0Var6;
                            jLongValue = j17;
                            r26 = z19;
                            i15 = 2;
                        }
                    }
                    O(false, false, false, true);
                } catch (Throwable th3) {
                    th = th3;
                    z19 = true;
                    r11 = o0Var2;
                    b0Var = b0Var6;
                    jLongValue = j17;
                    r26 = z19;
                    i15 = 2;
                }
            } else {
                z19 = true;
            }
            f1[] f1VarArr = this.f26741a;
            int length = f1VarArr.length;
            int i18 = 0;
            ?? r13 = z19;
            while (i18 < length) {
                f1 f1Var = f1VarArr[i18];
                e eVar = (e) f1Var.f26734e;
                if (!Objects.equals(eVar.R, o0Var2)) {
                    eVar.R = o0Var2;
                }
                e eVar2 = (e) f1Var.f26735f;
                if (eVar2 != null && !Objects.equals(eVar2.R, o0Var2)) {
                    eVar2.R = o0Var2;
                }
                i18++;
                r13 = 1;
                i15 = 4;
            }
            try {
                if (z27) {
                    r13 = o0Var2;
                    jLongValue = j17;
                    i15 = 2;
                    z20 = true;
                    z20 = true;
                    r27 = 1;
                    r25 = 1;
                    if (r13.p()) {
                        b0Var = b0Var6;
                    } else {
                        for (l0 l0Var2 = this.T.f26882i; l0Var2 != null; l0Var2 = l0Var2.m) {
                            if (l0Var2.f26831g.f26842a.equals(b0Var6)) {
                                l0Var2.f26831g = this.T.h(r13, l0Var2.f26831g);
                                l0Var2.k();
                            }
                        }
                        try {
                            n0 n0Var4 = this.T;
                            b0Var = b0Var6;
                            try {
                                jLongValue = X(b0Var, jLongValue, n0Var4.f26882i != n0Var4.f26883j, z26);
                            } catch (Throwable th4) {
                                th = th4;
                                jLongValue = jLongValue;
                                r12 = r13;
                                r11 = r12;
                                r26 = r27;
                                y0 y0Var2 = this.f26754h0;
                                y6.o0 o0Var5 = y0Var2.f26953a;
                                p7.b0 b0Var7 = y0Var2.f26954b;
                                if (e0Var.f26711f) {
                                    j14 = jLongValue;
                                } else {
                                    j14 = -9223372036854775807L;
                                }
                                b0Var2 = b0Var;
                                A0(r11, b0Var2, o0Var5, b0Var7, j14, false);
                                if (z27) {
                                    y0 y0Var3 = this.f26754h0;
                                    obj2 = y0Var3.f26954b.f46328a;
                                    y6.o0 o0Var6 = y0Var3.f26953a;
                                    if (z27) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j18 = this.f26754h0.f26956d;
                                    if (r11.b(obj2) == -1) {
                                        i12 = 4;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.f26754h0 = y(b0Var2, jLongValue, j16, j18, r9, i12);
                                } else {
                                    y0 y0Var4 = this.f26754h0;
                                    obj2 = y0Var4.f26954b.f46328a;
                                    y6.o0 o0Var7 = y0Var4.f26953a;
                                    if (z27) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j19 = this.f26754h0.f26956d;
                                    if (r11.b(obj2) == -1) {
                                        i12 = 4;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.f26754h0 = y(b0Var2, jLongValue, j16, j19, r9, i12);
                                }
                                P();
                                R(r11, this.f26754h0.f26953a);
                                this.f26754h0 = this.f26754h0.j(r11);
                                if (!r11.p()) {
                                    this.f26769v0 = null;
                                }
                                u(false);
                                this.H.e(i15);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            b0Var = b0Var6;
                            r12 = r13;
                            r27 = r25;
                            r11 = r12;
                            r26 = r27;
                            y0 y0Var5 = this.f26754h0;
                            y6.o0 o0Var8 = y0Var5.f26953a;
                            p7.b0 b0Var8 = y0Var5.f26954b;
                            if (e0Var.f26711f) {
                                j14 = jLongValue;
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            b0Var2 = b0Var;
                            A0(r11, b0Var2, o0Var8, b0Var8, j14, false);
                            if (z27) {
                                y0 y0Var6 = this.f26754h0;
                                obj2 = y0Var6.f26954b.f46328a;
                                y6.o0 o0Var9 = y0Var6.f26953a;
                                if (z27) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j110 = this.f26754h0.f26956d;
                                if (r11.b(obj2) == -1) {
                                    i12 = 4;
                                } else {
                                    i12 = 3;
                                }
                                this.f26754h0 = y(b0Var2, jLongValue, j16, j110, r9, i12);
                            } else {
                                y0 y0Var7 = this.f26754h0;
                                obj2 = y0Var7.f26954b.f46328a;
                                y6.o0 o0Var10 = y0Var7.f26953a;
                                if (z27) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j111 = this.f26754h0.f26956d;
                                if (r11.b(obj2) == -1) {
                                    i12 = 4;
                                } else {
                                    i12 = 3;
                                }
                                this.f26754h0 = y(b0Var2, jLongValue, j16, j111, r9, i12);
                            }
                            P();
                            R(r11, this.f26754h0.f26953a);
                            this.f26754h0 = this.f26754h0.j(r11);
                            if (!r11.p()) {
                                this.f26769v0 = null;
                            }
                            u(false);
                            this.H.e(i15);
                            throw th;
                        }
                    }
                    y0 y0Var8 = this.f26754h0;
                    y6.o0 o0Var11 = y0Var8.f26953a;
                    p7.b0 b0Var9 = y0Var8.f26954b;
                    if (e0Var.f26711f) {
                        j15 = jLongValue;
                    } else {
                        j15 = -9223372036854775807L;
                    }
                    b0Var3 = b0Var;
                    A0(o0Var, b0Var3, o0Var11, b0Var9, j15, false);
                    if (z27) {
                        y0 y0Var9 = this.f26754h0;
                        obj3 = y0Var9.f26954b.f46328a;
                        y6.o0 o0Var12 = y0Var9.f26953a;
                        if (z27) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        long j21 = this.f26754h0.f26956d;
                        if (o0Var.b(obj3) == -1) {
                            i13 = 4;
                        } else {
                            i13 = 3;
                        }
                        this.f26754h0 = y(b0Var3, jLongValue, j16, j21, z21, i13);
                    } else {
                        y0 y0Var10 = this.f26754h0;
                        obj3 = y0Var10.f26954b.f46328a;
                        y6.o0 o0Var13 = y0Var10.f26953a;
                        if (z27) {
                            z21 = false;
                        } else {
                            z21 = false;
                        }
                        long j22 = this.f26754h0.f26956d;
                        if (o0Var.b(obj3) == -1) {
                            i13 = 4;
                        } else {
                            i13 = 3;
                        }
                        this.f26754h0 = y(b0Var3, jLongValue, j16, j22, z21, i13);
                    }
                    P();
                    R(o0Var, this.f26754h0.f26953a);
                    this.f26754h0 = this.f26754h0.j(o0Var);
                    if (!o0Var.p()) {
                        this.f26769v0 = null;
                    }
                    u(false);
                    this.H.e(i15);
                    return;
                }
                try {
                    l0 l0Var3 = this.T.f26883j;
                    try {
                        jLongValue = j17;
                        try {
                            i15 = 2;
                            r25 = 1;
                            z20 = true;
                            z20 = true;
                            z20 = true;
                            try {
                                int iS = this.T.s(o0Var, this.f26770w0, l0Var3 == null ? 0L : n(l0Var3), (!f() || (l0Var = this.T.f26884k) == null) ? 0L : n(l0Var));
                                if ((iS & 1) != 0) {
                                    V(false);
                                } else if ((iS & 2) != 0) {
                                    h();
                                }
                                b0Var = b0Var6;
                                y0 y0Var11 = this.f26754h0;
                                y6.o0 o0Var14 = y0Var11.f26953a;
                                p7.b0 b0Var10 = y0Var11.f26954b;
                                if (e0Var.f26711f) {
                                    j15 = jLongValue;
                                } else {
                                    j15 = -9223372036854775807L;
                                }
                                b0Var3 = b0Var;
                                A0(o0Var, b0Var3, o0Var14, b0Var10, j15, false);
                                if (z27 || j16 != this.f26754h0.f26955c) {
                                    y0 y0Var12 = this.f26754h0;
                                    obj3 = y0Var12.f26954b.f46328a;
                                    y6.o0 o0Var15 = y0Var12.f26953a;
                                    if (z27 || !z11 || o0Var15.p() || o0Var15.g(obj3, this.N).f57233f) {
                                        z21 = false;
                                    } else {
                                        z21 = z20;
                                    }
                                    long j23 = this.f26754h0.f26956d;
                                    if (o0Var.b(obj3) == -1) {
                                        i13 = 4;
                                    } else {
                                        i13 = 3;
                                    }
                                    this.f26754h0 = y(b0Var3, jLongValue, j16, j23, z21, i13);
                                }
                                P();
                                R(o0Var, this.f26754h0.f26953a);
                                this.f26754h0 = this.f26754h0.j(o0Var);
                                if (!o0Var.p()) {
                                    this.f26769v0 = null;
                                }
                                u(false);
                                this.H.e(i15);
                                return;
                            } catch (Throwable th6) {
                                th = th6;
                                r13 = o0Var;
                                b0Var = b0Var6;
                                r12 = r13;
                                r27 = r25;
                                r11 = r12;
                                r26 = r27;
                                y0 y0Var13 = this.f26754h0;
                                y6.o0 o0Var16 = y0Var13.f26953a;
                                p7.b0 b0Var11 = y0Var13.f26954b;
                                if (e0Var.f26711f) {
                                    j14 = jLongValue;
                                } else {
                                    j14 = -9223372036854775807L;
                                }
                                b0Var2 = b0Var;
                                A0(r11, b0Var2, o0Var16, b0Var11, j14, false);
                                if (z27) {
                                    y0 y0Var14 = this.f26754h0;
                                    obj2 = y0Var14.f26954b.f46328a;
                                    y6.o0 o0Var17 = y0Var14.f26953a;
                                    if (z27) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j112 = this.f26754h0.f26956d;
                                    if (r11.b(obj2) == -1) {
                                        i12 = 4;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.f26754h0 = y(b0Var2, jLongValue, j16, j112, r9, i12);
                                } else {
                                    y0 y0Var15 = this.f26754h0;
                                    obj2 = y0Var15.f26954b.f46328a;
                                    y6.o0 o0Var18 = y0Var15.f26953a;
                                    if (z27) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j113 = this.f26754h0.f26956d;
                                    if (r11.b(obj2) == -1) {
                                        i12 = 4;
                                    } else {
                                        i12 = 3;
                                    }
                                    this.f26754h0 = y(b0Var2, jLongValue, j16, j113, r9, i12);
                                }
                                P();
                                R(r11, this.f26754h0.f26953a);
                                this.f26754h0 = this.f26754h0.j(r11);
                                if (!r11.p()) {
                                    this.f26769v0 = null;
                                }
                                u(false);
                                this.H.e(i15);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            r13 = o0Var;
                            i15 = 2;
                            r25 = 1;
                            b0Var = b0Var6;
                            r12 = r13;
                            r27 = r25;
                            r11 = r12;
                            r26 = r27;
                            y0 y0Var16 = this.f26754h0;
                            y6.o0 o0Var19 = y0Var16.f26953a;
                            p7.b0 b0Var12 = y0Var16.f26954b;
                            if (e0Var.f26711f) {
                                j14 = jLongValue;
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            b0Var2 = b0Var;
                            A0(r11, b0Var2, o0Var19, b0Var12, j14, false);
                            if (z27) {
                                y0 y0Var17 = this.f26754h0;
                                obj2 = y0Var17.f26954b.f46328a;
                                y6.o0 o0Var110 = y0Var17.f26953a;
                                if (z27) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j114 = this.f26754h0.f26956d;
                                if (r11.b(obj2) == -1) {
                                    i12 = 4;
                                } else {
                                    i12 = 3;
                                }
                                this.f26754h0 = y(b0Var2, jLongValue, j16, j114, r9, i12);
                            } else {
                                y0 y0Var18 = this.f26754h0;
                                obj2 = y0Var18.f26954b.f46328a;
                                y6.o0 o0Var111 = y0Var18.f26953a;
                                if (z27) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j115 = this.f26754h0.f26956d;
                                if (r11.b(obj2) == -1) {
                                    i12 = 4;
                                } else {
                                    i12 = 3;
                                }
                                this.f26754h0 = y(b0Var2, jLongValue, j16, j115, r9, i12);
                            }
                            P();
                            R(r11, this.f26754h0.f26953a);
                            this.f26754h0 = this.f26754h0.j(r11);
                            if (!r11.p()) {
                                this.f26769v0 = null;
                            }
                            u(false);
                            this.H.e(i15);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        o0Var3 = o0Var;
                        jLongValue = j17;
                        r13 = o0Var3;
                        i15 = 2;
                        r25 = 1;
                        b0Var = b0Var6;
                        r12 = r13;
                        r27 = r25;
                        r11 = r12;
                        r26 = r27;
                        y0 y0Var19 = this.f26754h0;
                        y6.o0 o0Var112 = y0Var19.f26953a;
                        p7.b0 b0Var13 = y0Var19.f26954b;
                        if (e0Var.f26711f) {
                            j14 = jLongValue;
                        } else {
                            j14 = -9223372036854775807L;
                        }
                        b0Var2 = b0Var;
                        A0(r11, b0Var2, o0Var112, b0Var13, j14, false);
                        if (z27) {
                            y0 y0Var110 = this.f26754h0;
                            obj2 = y0Var110.f26954b.f46328a;
                            y6.o0 o0Var113 = y0Var110.f26953a;
                            if (z27) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            long j116 = this.f26754h0.f26956d;
                            if (r11.b(obj2) == -1) {
                                i12 = 4;
                            } else {
                                i12 = 3;
                            }
                            this.f26754h0 = y(b0Var2, jLongValue, j16, j116, r9, i12);
                        } else {
                            y0 y0Var111 = this.f26754h0;
                            obj2 = y0Var111.f26954b.f46328a;
                            y6.o0 o0Var114 = y0Var111.f26953a;
                            if (z27) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            long j117 = this.f26754h0.f26956d;
                            if (r11.b(obj2) == -1) {
                                i12 = 4;
                            } else {
                                i12 = 3;
                            }
                            this.f26754h0 = y(b0Var2, jLongValue, j16, j117, r9, i12);
                        }
                        P();
                        R(r11, this.f26754h0.f26953a);
                        this.f26754h0 = this.f26754h0.j(r11);
                        if (!r11.p()) {
                            this.f26769v0 = null;
                        }
                        u(false);
                        this.H.e(i15);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    o0Var3 = o0Var2;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            r11 = o0Var2;
            b0Var = b0Var6;
            jLongValue = j17;
            i15 = 2;
            r26 = 1;
        }
        y0 y0Var112 = this.f26754h0;
        y6.o0 o0Var115 = y0Var112.f26953a;
        p7.b0 b0Var14 = y0Var112.f26954b;
        if (e0Var.f26711f) {
            j14 = jLongValue;
        } else {
            j14 = -9223372036854775807L;
        }
        b0Var2 = b0Var;
        A0(r11, b0Var2, o0Var115, b0Var14, j14, false);
        if (z27 || j16 != this.f26754h0.f26955c) {
            y0 y0Var113 = this.f26754h0;
            obj2 = y0Var113.f26954b.f46328a;
            y6.o0 o0Var116 = y0Var113.f26953a;
            if (z27 || !z11 || o0Var116.p() || o0Var116.g(obj2, this.N).f57233f) {
                r9 = 0;
            } else {
                r9 = r26;
            }
            long j118 = this.f26754h0.f26956d;
            if (r11.b(obj2) == -1) {
                i12 = 4;
            } else {
                i12 = 3;
            }
            this.f26754h0 = y(b0Var2, jLongValue, j16, j118, r9, i12);
        }
        P();
        R(r11, this.f26754h0.f26953a);
        this.f26754h0 = this.f26754h0.j(r11);
        if (!r11.p()) {
            this.f26769v0 = null;
        }
        u(false);
        this.H.e(i15);
        throw th;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, p7.b1] */
    public final void v0() {
        l0 l0Var = this.T.f26885l;
        boolean z11 = this.f26761o0 || (l0Var != null && l0Var.f26825a.a());
        y0 y0Var = this.f26754h0;
        if (z11 != y0Var.f26959g) {
            this.f26754h0 = y0Var.b(z11);
        }
    }

    public final void w(p7.z zVar) {
        l0 l0Var;
        n0 n0Var = this.T;
        l0 l0Var2 = n0Var.f26885l;
        k kVar = this.P;
        if (l0Var2 != null && l0Var2.f26825a == zVar) {
            l0Var2.getClass();
            if (!l0Var2.f26829e) {
                float f5 = kVar.b().f57185a;
                y0 y0Var = this.f26754h0;
                l0Var2.f(f5, y0Var.f26953a, y0Var.f26964l);
            }
            w0(l0Var2.f26838o);
            if (l0Var2 == n0Var.f26882i) {
                Q(l0Var2.f26831g.f26843b);
                l(new boolean[this.f26741a.length], n0Var.f26883j.e());
                l0Var2.f26832h = true;
                y0 y0Var2 = this.f26754h0;
                p7.b0 b0Var = y0Var2.f26954b;
                long j11 = l0Var2.f26831g.f26843b;
                this.f26754h0 = y(b0Var, j11, y0Var2.f26955c, j11, false, 5);
            }
            C();
            return;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= n0Var.f26889q.size()) {
                l0Var = null;
                break;
            }
            l0Var = (l0) n0Var.f26889q.get(i11);
            if (l0Var.f26825a == zVar) {
                break;
            } else {
                i11++;
            }
        }
        if (l0Var != null) {
            b7.a.j(true ^ l0Var.f26829e);
            float f11 = kVar.b().f57185a;
            y0 y0Var3 = this.f26754h0;
            l0Var.f(f11, y0Var3.f26953a, y0Var3.f26964l);
            l0 l0Var3 = n0Var.m;
            if (l0Var3 == null || l0Var3.f26825a != zVar) {
                return;
            }
            D();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void w0(s7.w wVar) {
        l0 l0Var = this.T.f26885l;
        l0Var.getClass();
        p(l0Var.d());
        if (r0(this.f26754h0.f26953a, l0Var.f26831g.f26842a)) {
            long j11 = this.V.f26783h;
        }
        y6.o0 o0Var = this.f26754h0.f26953a;
        float f5 = this.P.b().f57185a;
        boolean z11 = this.f26754h0.f26964l;
        s7.s[] sVarArr = wVar.f51471c;
        j jVar = this.f26751f;
        i iVar = (i) jVar.f26809h.get(this.X);
        iVar.getClass();
        int iMax = jVar.f26807f;
        if (iMax == -1) {
            int length = sVarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = 13107200;
                if (i11 < length) {
                    s7.s sVar = sVarArr[i11];
                    if (sVar != null) {
                        switch (sVar.b().f57306c) {
                            case -2:
                                i13 = 0;
                                i12 += i13;
                                break;
                            case -1:
                            case 1:
                                i12 += i13;
                                break;
                            case 0:
                                i13 = 144310272;
                                i12 += i13;
                                break;
                            case 2:
                                i13 = 131072000;
                                i12 += i13;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i13 = 131072;
                                i12 += i13;
                                break;
                            case 4:
                                i13 = 26214400;
                                i12 += i13;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i11++;
                } else {
                    iMax = Math.max(13107200, i12);
                }
            }
        }
        iVar.f26796b = iMax;
        jVar.d();
    }

    public final void x(y6.e0 e0Var, float f5, boolean z11, boolean z12) {
        int i11;
        if (z11) {
            if (z12) {
                this.f26755i0.c(1);
            }
            this.f26754h0 = this.f26754h0.g(e0Var);
        }
        float f11 = e0Var.f57185a;
        l0 l0Var = this.T.f26882i;
        while (true) {
            i11 = 0;
            if (l0Var == null) {
                break;
            }
            s7.s[] sVarArr = l0Var.f26838o.f51471c;
            int length = sVarArr.length;
            while (i11 < length) {
                s7.s sVar = sVarArr[i11];
                if (sVar != null) {
                    sVar.p(f11);
                }
                i11++;
            }
            l0Var = l0Var.m;
        }
        f1[] f1VarArr = this.f26741a;
        int length2 = f1VarArr.length;
        while (i11 < length2) {
            f1 f1Var = f1VarArr[i11];
            float f12 = e0Var.f57185a;
            ((e) f1Var.f26734e).A(f5, f12);
            e eVar = (e) f1Var.f26735f;
            if (eVar != null) {
                eVar.A(f5, f12);
            }
            i11++;
        }
    }

    public final void x0(int i11, int i12, List list) throws Throwable {
        this.f26755i0.c(1);
        x0 x0Var = this.U;
        x0Var.getClass();
        ArrayList arrayList = x0Var.f26937b;
        b7.a.d(i11 >= 0 && i11 <= i12 && i12 <= arrayList.size());
        b7.a.d(list.size() == i12 - i11);
        for (int i13 = i11; i13 < i12; i13++) {
            ((w0) arrayList.get(i13)).f26930a.r((y6.x) list.get(i13 - i11));
        }
        v(x0Var.b(), false);
    }

    public final y0 y(p7.b0 b0Var, long j11, long j12, long j13, boolean z11, int i11) {
        boolean z12;
        this.f26773z0 = (!this.f26773z0 && j11 == this.f26754h0.f26970s && b0Var.equals(this.f26754h0.f26954b)) ? false : true;
        P();
        y0 y0Var = this.f26754h0;
        p7.g1 g1Var = y0Var.f26960h;
        s7.w wVar = y0Var.f26961i;
        List listS = y0Var.f26962j;
        if (this.U.f26946k) {
            l0 l0Var = this.T.f26882i;
            g1Var = l0Var == null ? p7.g1.f46387d : l0Var.f26837n;
            wVar = l0Var == null ? this.f26749e : l0Var.f26838o;
            s7.s[] sVarArr = wVar.f51471c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            boolean z13 = false;
            for (s7.s sVar : sVarArr) {
                if (sVar != null) {
                    y6.c0 c0Var = sVar.f(0).f57290l;
                    if (c0Var == null) {
                        builder.h(new y6.c0(new y6.b0[0]));
                    } else {
                        builder.h(c0Var);
                        z13 = true;
                    }
                }
            }
            listS = z13 ? builder.j() : ImmutableList.s();
            if (l0Var != null) {
                m0 m0Var = l0Var.f26831g;
                if (m0Var.f26844c != j12) {
                    l0Var.f26831g = m0Var.a(j12);
                }
            }
            f1[] f1VarArr = this.f26741a;
            n0 n0Var = this.T;
            l0 l0Var2 = n0Var.f26882i;
            if (l0Var2 == n0Var.f26883j && l0Var2 != null) {
                s7.w wVar2 = l0Var2.f26838o;
                int i12 = 0;
                boolean z14 = false;
                while (true) {
                    if (i12 >= f1VarArr.length) {
                        z12 = true;
                        break;
                    }
                    if (wVar2.b(i12)) {
                        if (((e) f1VarArr[i12].f26734e).f26700b != 1) {
                            z12 = false;
                            break;
                        }
                        if (wVar2.f51470b[i12].f26713a != 0) {
                            z14 = true;
                        }
                    }
                    i12++;
                }
                boolean z15 = z14 && z12;
                if (z15 != this.f26767t0) {
                    this.f26767t0 = z15;
                    if (!z15 && this.f26754h0.f26967p) {
                        this.H.e(2);
                    }
                }
            }
        } else if (!b0Var.equals(y0Var.f26954b)) {
            g1Var = p7.g1.f46387d;
            wVar = this.f26749e;
            listS = ImmutableList.s();
        }
        p7.g1 g1Var2 = g1Var;
        s7.w wVar3 = wVar;
        List list = listS;
        if (z11) {
            e9.w wVar4 = this.f26755i0;
            if (!wVar4.f25423c || wVar4.f25424d == 5) {
                wVar4.f25421a = true;
                wVar4.f25423c = true;
                wVar4.f25424d = i11;
            } else {
                b7.a.d(i11 == 5);
            }
        }
        y0 y0Var2 = this.f26754h0;
        return y0Var2.d(b0Var, j11, j12, j13, p(y0Var2.f26968q), g1Var2, wVar3, list);
    }

    public final void y0(int i11, int i12, int i13, boolean z11) {
        boolean z12 = z11 && i11 != -1;
        if (i11 == -1) {
            i13 = 2;
        } else if (i13 == 2) {
            i13 = 1;
        }
        if (i11 == 0) {
            i12 = 1;
        } else if (i12 == 1) {
            i12 = 0;
        }
        y0 y0Var = this.f26754h0;
        if (y0Var.f26964l == z12 && y0Var.f26965n == i12 && y0Var.m == i13) {
            return;
        }
        this.f26754h0 = y0Var.e(i13, i12, z12);
        B0(false, false);
        n0 n0Var = this.T;
        for (l0 l0Var = n0Var.f26882i; l0Var != null; l0Var = l0Var.m) {
            for (s7.s sVar : l0Var.f26838o.f51471c) {
                if (sVar != null) {
                    sVar.e(z12);
                }
            }
        }
        if (!q0()) {
            u0();
            z0();
            y0 y0Var2 = this.f26754h0;
            if (y0Var2.f26967p) {
                this.f26754h0 = y0Var2.i(false);
            }
            n0Var.m(this.f26770w0);
            return;
        }
        int i14 = this.f26754h0.f26957e;
        b7.a0 a0Var = this.H;
        if (i14 != 3) {
            if (i14 == 2) {
                a0Var.e(2);
            }
        } else {
            k kVar = this.P;
            kVar.f26820b = true;
            ((j1) kVar.f26821c).f();
            s0();
            a0Var.e(2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, p7.z] */
    public final void z0() {
        y6.e0 e0VarB;
        long j11;
        float f5;
        l0 l0Var = this.T.f26882i;
        if (l0Var == null) {
            return;
        }
        long jS = l0Var.f26829e ? l0Var.f26825a.s() : -9223372036854775807L;
        if (jS != -9223372036854775807L) {
            if (!l0Var.g()) {
                this.T.n(l0Var);
                u(false);
                C();
            }
            Q(jS);
            if (jS != this.f26754h0.f26970s) {
                y0 y0Var = this.f26754h0;
                this.f26754h0 = y(y0Var.f26954b, jS, y0Var.f26955c, jS, true, 5);
            }
        } else {
            k kVar = this.P;
            boolean z11 = l0Var != this.T.f26883j;
            j1 j1Var = (j1) kVar.f26821c;
            e eVar = (e) kVar.f26823e;
            if (eVar == null || eVar.m() || ((z11 && ((e) kVar.f26823e).H != 2) || (!((e) kVar.f26823e).o() && (z11 || ((e) kVar.f26823e).l())))) {
                kVar.f26819a = true;
                if (kVar.f26820b) {
                    j1Var.f();
                }
            } else {
                k0 k0Var = (k0) kVar.f26824f;
                k0Var.getClass();
                long jD = k0Var.d();
                if (!kVar.f26819a) {
                    j1Var.a(jD);
                    e0VarB = k0Var.b();
                    if (!e0VarB.equals(j1Var.f26818e)) {
                        j1Var.c(e0VarB);
                        ((g0) kVar.f26822d).H.a(16, e0VarB).b();
                    }
                } else if (jD >= j1Var.d()) {
                    kVar.f26819a = false;
                    if (kVar.f26820b) {
                        j1Var.f();
                    }
                    j1Var.a(jD);
                    e0VarB = k0Var.b();
                    if (!e0VarB.equals(j1Var.f26818e)) {
                        j1Var.c(e0VarB);
                        ((g0) kVar.f26822d).H.a(16, e0VarB).b();
                    }
                } else if (j1Var.f26815b) {
                    j1Var.a(j1Var.d());
                    j1Var.f26815b = false;
                }
            }
            long jD2 = kVar.d();
            this.f26770w0 = jD2;
            long j12 = jD2 - l0Var.f26839p;
            long j13 = this.f26754h0.f26970s;
            if (!this.Q.isEmpty() && !this.f26754h0.f26954b.b()) {
                if (this.f26773z0) {
                    this.f26773z0 = false;
                }
                y0 y0Var2 = this.f26754h0;
                y0Var2.f26953a.b(y0Var2.f26954b.f46328a);
                int iMin = Math.min(this.f26772y0, this.Q.size());
                if (iMin > 0 && this.Q.get(iMin - 1) != null) {
                    throw new ClassCastException();
                }
                if (iMin < this.Q.size() && this.Q.get(iMin) != null) {
                    throw new ClassCastException();
                }
                this.f26772y0 = iMin;
            }
            if (this.P.e()) {
                boolean z12 = !this.f26755i0.f25423c;
                y0 y0Var3 = this.f26754h0;
                this.f26754h0 = y(y0Var3.f26954b, j12, y0Var3.f26955c, j12, z12, 6);
            } else {
                y0 y0Var4 = this.f26754h0;
                y0Var4.f26970s = j12;
                y0Var4.f26971t = SystemClock.elapsedRealtime();
            }
        }
        this.f26754h0.f26968q = this.T.f26885l.d();
        y0 y0Var5 = this.f26754h0;
        y0Var5.f26969r = p(y0Var5.f26968q);
        y0 y0Var6 = this.f26754h0;
        if (y0Var6.f26964l && y0Var6.f26957e == 3 && r0(y0Var6.f26953a, y0Var6.f26954b)) {
            y0 y0Var7 = this.f26754h0;
            float f11 = 1.0f;
            if (y0Var7.f26966o.f57185a == 1.0f) {
                h hVar = this.V;
                long jM = m(y0Var7.f26953a, y0Var7.f26954b.f46328a, y0Var7.f26970s);
                long j14 = this.f26754h0.f26969r;
                if (hVar.f26778c != -9223372036854775807L) {
                    long j15 = jM - j14;
                    long j16 = hVar.m;
                    if (j16 == -9223372036854775807L) {
                        hVar.m = j15;
                        hVar.f26788n = 0L;
                    } else {
                        long jMax = Math.max(j15, (long) ((j15 * 9.999871E-4f) + (j16 * 0.999f)));
                        hVar.m = jMax;
                        hVar.f26788n = (long) ((9.999871E-4f * Math.abs(j15 - jMax)) + (hVar.f26788n * 0.999f));
                    }
                    if (hVar.f26787l != -9223372036854775807L) {
                        j11 = 1000;
                        if (SystemClock.elapsedRealtime() - hVar.f26787l < 1000) {
                            f11 = hVar.f26786k;
                        }
                    } else {
                        j11 = 1000;
                    }
                    hVar.f26787l = SystemClock.elapsedRealtime();
                    long j17 = (hVar.f26788n * 3) + hVar.m;
                    if (hVar.f26783h > j17) {
                        float fK = b7.f0.K(j11);
                        f5 = 1.0E-7f;
                        long[] jArr = {j17, hVar.f26780e, hVar.f26783h - (((long) ((hVar.f26786k - 1.0f) * fK)) + ((long) ((hVar.f26784i - 1.0f) * fK)))};
                        long j18 = jArr[0];
                        for (int i11 = 1; i11 < 3; i11++) {
                            long j19 = jArr[i11];
                            if (j19 > j18) {
                                j18 = j19;
                            }
                        }
                        hVar.f26783h = j18;
                    } else {
                        f5 = 1.0E-7f;
                        long jH = b7.f0.h(jM - ((long) (Math.max(CropImageView.DEFAULT_ASPECT_RATIO, hVar.f26786k - 1.0f) / 1.0E-7f)), hVar.f26783h, j17);
                        hVar.f26783h = jH;
                        long j21 = hVar.f26782g;
                        if (j21 != -9223372036854775807L && jH > j21) {
                            hVar.f26783h = j21;
                        }
                    }
                    long j22 = jM - hVar.f26783h;
                    if (Math.abs(j22) < hVar.f26776a) {
                        hVar.f26786k = 1.0f;
                    } else {
                        hVar.f26786k = b7.f0.f((f5 * j22) + 1.0f, hVar.f26785j, hVar.f26784i);
                    }
                    f11 = hVar.f26786k;
                }
                if (this.P.b().f57185a != f11) {
                    y6.e0 e0Var = new y6.e0(f11, this.f26754h0.f26966o.f57186b);
                    this.H.d(16);
                    this.P.c(e0Var);
                    x(this.f26754h0.f26966o, this.P.b().f57185a, false, false);
                }
            }
        }
    }
}
