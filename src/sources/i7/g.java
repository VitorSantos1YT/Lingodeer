package i7;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import b7.f0;
import com.google.common.math.LongMath;
import d7.q;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p7.b0;
import p7.s;
import p7.z;
import re.v;
import t7.p;
import y6.t;
import y6.u;
import y6.x;
import y6.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends p7.a {
    public t7.n A;
    public q B;
    public DashManifestStaleException C;
    public Handler D;
    public t E;
    public Uri F;
    public final Uri G;
    public j7.c H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public x P;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f34196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d7.e f34197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ij.d f34198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p20.c f34199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k7.g f34200l;
    public final v m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ob.i f34201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f34202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f34203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k7.c f34204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f34205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a5.f f34206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f34207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f34208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f34209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f34210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final hd.d f34211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t7.o f34212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d7.f f34213z;

    static {
        y.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [i7.c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [i7.c] */
    public g(x xVar, d7.e eVar, p pVar, ij.d dVar, p20.c cVar, k7.g gVar, v vVar, long j11, long j12) {
        this.P = xVar;
        this.E = xVar.f57374c;
        u uVar = xVar.f57373b;
        uVar.getClass();
        Uri uri = uVar.f57358a;
        this.F = uri;
        this.G = uri;
        this.H = null;
        this.f34197i = eVar;
        this.f34205r = pVar;
        this.f34198j = dVar;
        this.f34200l = gVar;
        this.m = vVar;
        this.f34202o = j11;
        this.f34203p = j12;
        this.f34199k = cVar;
        this.f34201n = new ob.i(4);
        this.f34196h = false;
        this.f34204q = new k7.c(this.f46320c.f37958c, 0, null);
        this.f34207t = new Object();
        this.f34208u = new SparseArray();
        this.f34211x = new hd.d(this, 17);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.f34206s = new a5.f(this, 15);
        this.f34212y = new a5.j(this, 20);
        final int i11 = 0;
        this.f34209v = new Runnable(this) { // from class: i7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f34182b;

            {
                this.f34182b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f34182b.y();
                        break;
                    default:
                        this.f34182b.w(false);
                        break;
                }
            }
        };
        final int i12 = 1;
        this.f34210w = new Runnable(this) { // from class: i7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f34182b;

            {
                this.f34182b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f34182b.y();
                        break;
                    default:
                        this.f34182b.w(false);
                        break;
                }
            }
        };
    }

    public static boolean s(j7.h hVar) {
        List list = hVar.f36133c;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = ((j7.a) list.get(i11)).f36089b;
            if (i12 == 1 || i12 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p7.a
    public final z a(b0 b0Var, t7.g gVar, long j11) {
        int iIntValue = ((Integer) b0Var.f46328a).intValue() - this.O;
        k7.c cVar = new k7.c(this.f46320c.f37958c, 0, b0Var);
        k7.c cVar2 = new k7.c(this.f46321d.f37958c, 0, b0Var);
        int i11 = this.O + iIntValue;
        j7.c cVar3 = this.H;
        q qVar = this.B;
        long j12 = this.L;
        g7.j jVar = this.f46324g;
        b7.a.k(jVar);
        b bVar = new b(i11, cVar3, this.f34201n, iIntValue, this.f34198j, qVar, this.f34200l, cVar2, this.m, cVar, j12, this.f34212y, gVar, this.f34199k, this.f34211x, jVar);
        this.f34208u.put(i11, bVar);
        return bVar;
    }

    @Override // p7.a
    public final synchronized x g() {
        return this.P;
    }

    @Override // p7.a
    public final void i() {
        this.f34212y.b();
    }

    @Override // p7.a
    public final void k(q qVar) {
        this.B = qVar;
        Looper looperMyLooper = Looper.myLooper();
        g7.j jVar = this.f46324g;
        b7.a.k(jVar);
        k7.g gVar = this.f34200l;
        gVar.c(looperMyLooper, jVar);
        gVar.a();
        if (this.f34196h) {
            w(false);
            return;
        }
        this.f34213z = this.f34197i.s();
        this.A = new t7.n("DashMediaSource");
        this.D = f0.m(null);
        y();
    }

    @Override // p7.a
    public final void m(z zVar) {
        b bVar = (b) zVar;
        o oVar = bVar.O;
        oVar.K = true;
        oVar.f34254d.removeCallbacksAndMessages(null);
        for (q7.g gVar : bVar.T) {
            gVar.C(bVar);
        }
        bVar.S = null;
        this.f34208u.remove(bVar.f34173a);
    }

    @Override // p7.a
    public final void o() {
        this.I = false;
        this.f34213z = null;
        t7.n nVar = this.A;
        if (nVar != null) {
            nVar.c(null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.f34208u.clear();
        ob.i iVar = this.f34201n;
        ((HashMap) iVar.f44813b).clear();
        ((HashMap) iVar.f44814c).clear();
        ((HashMap) iVar.f44815d).clear();
        this.f34200l.release();
    }

    @Override // p7.a
    public final synchronized void r(x xVar) {
        this.P = xVar;
    }

    public final void t() {
        boolean z11;
        t7.n nVar = this.A;
        hd.b bVar = new hd.b(this, 19);
        synchronized (u7.b.f52815b) {
            z11 = u7.b.f52816c;
        }
        if (z11) {
            bVar.u();
            return;
        }
        if (nVar == null) {
            nVar = new t7.n("SntpClient");
        }
        nVar.d(new re.q(3), new f(bVar, 1), 1);
    }

    public final void u(t7.q qVar) {
        long j11 = qVar.f52100a;
        d7.p pVar = qVar.f52103d;
        Uri uri = pVar.f23255c;
        s sVar = new s(pVar.f23256d);
        this.m.getClass();
        this.f34204q.c(sVar, qVar.f52102c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void v(IOException iOException) {
        b7.a.p("Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        w(true);
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0291  */
    /* JADX WARN: Code duplicated, block: B:156:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:159:0x0301  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:196:0x03bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [int] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r15v10, types: [int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v25, types: [s7.s] */
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
    public final void w(boolean z11) {
        long j11;
        long jMax;
        long j12;
        boolean z12;
        boolean z13;
        long j13;
        long j14;
        long j15;
        int i11;
        long jMin;
        float f5;
        float f11;
        long jV;
        long jK;
        long jMin2;
        boolean z14;
        boolean z15 = false;
        int i12 = 0;
        while (true) {
            SparseArray sparseArray = this.f34208u;
            if (i12 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i12);
            if (iKeyAt >= this.O) {
                b bVar = (b) sparseArray.valueAt(i12);
                j7.c cVar = this.H;
                int i13 = iKeyAt - this.O;
                bVar.W = cVar;
                bVar.X = i13;
                o oVar = bVar.O;
                oVar.H = z15;
                oVar.f34256f = cVar;
                Iterator it = oVar.f34255e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < oVar.f34256f.f36105h) {
                        it.remove();
                    }
                }
                q7.g[] gVarArr = bVar.T;
                if (gVarArr != null) {
                    int length = gVarArr.length;
                    for (?? r11 = z15; r11 < length; r11++) {
                        k kVar = gVarArr[r11].f47541e;
                        i[] iVarArr = kVar.f34232i;
                        try {
                            kVar.f34234k = cVar;
                            kVar.f34235l = i13;
                            long jC = cVar.c(i13);
                            ArrayList arrayListA = kVar.a();
                            for (?? r15 = z15; r15 < iVarArr.length; r15++) {
                                try {
                                    iVarArr[r15] = iVarArr[r15].a(jC, (j7.m) arrayListA.get(kVar.f34233j.h(r15)));
                                } catch (BehindLiveWindowException e8) {
                                    e = e8;
                                    kVar.m = e;
                                }
                            }
                        } catch (BehindLiveWindowException e10) {
                            e = e10;
                        }
                        z15 = false;
                    }
                    z14 = true;
                    bVar.S.b(bVar);
                } else {
                    z14 = true;
                }
                bVar.Y = cVar.a(i13).f36134d;
                for (l lVar : bVar.U) {
                    for (j7.g gVar : bVar.Y) {
                        if (gVar.a().equals(lVar.f34241e.a())) {
                            lVar.a(gVar, (cVar.f36101d && i13 == cVar.m.size() + (-1)) ? z14 : false);
                            break;
                        }
                    }
                }
            }
            i12++;
            z15 = false;
        }
        int i14 = 1;
        j7.h hVarA = this.H.a(0);
        int size = this.H.m.size() - 1;
        j7.h hVarA2 = this.H.a(size);
        long jC2 = this.H.c(size);
        long jK2 = f0.K(f0.v(this.L));
        long jC3 = this.H.c(0);
        long j16 = hVarA.f36132b;
        List list = hVarA.f36133c;
        long jK3 = f0.K(j16);
        boolean zS = s(hVarA);
        long jMax2 = jK3;
        int i15 = 0;
        while (true) {
            long j17 = jK3;
            if (i15 >= list.size()) {
                j11 = 0;
                jMax = jMax2;
                break;
            }
            j7.a aVar = (j7.a) list.get(i15);
            j11 = 0;
            List list2 = aVar.f36090c;
            int i16 = aVar.f36089b;
            boolean z16 = (i16 == i14 || i16 == 2) ? false : true;
            if ((!zS || !z16) && !list2.isEmpty()) {
                h hVarC = ((j7.m) list2.get(0)).c();
                if (hVarC == null || hVarC.z(jC3, jK2) == 0) {
                    jMax = j17;
                    break;
                }
                jMax2 = Math.max(jMax2, hVarC.b(hVarC.g(jC3, jK2)) + j17);
            }
            i15++;
            jK3 = j17;
            i14 = 1;
        }
        long j18 = hVarA2.f36132b;
        List list3 = hVarA2.f36133c;
        long jK4 = f0.K(j18);
        boolean zS2 = s(hVarA2);
        long jMin3 = Long.MAX_VALUE;
        int i17 = 0;
        while (true) {
            if (i17 >= list3.size()) {
                j12 = jMin3;
                break;
            }
            j7.a aVar2 = (j7.a) list3.get(i17);
            boolean z17 = zS2;
            List list4 = aVar2.f36090c;
            int i18 = aVar2.f36089b;
            long j19 = jK4;
            boolean z18 = (i18 == 1 || i18 == 2) ? false : true;
            if ((!z17 || !z18) && !list4.isEmpty()) {
                h hVarC2 = ((j7.m) list4.get(0)).c();
                if (hVarC2 == null) {
                    j12 = j19 + jC2;
                    break;
                }
                long jZ = hVarC2.z(jC2, jK2);
                if (jZ == j11) {
                    j12 = j19;
                    break;
                } else {
                    long jG = (hVarC2.g(jC2, jK2) + jZ) - 1;
                    jMin3 = Math.min(jMin3, hVarC2.e(jG, jC2) + hVarC2.b(jG) + j19);
                }
            }
            i17++;
            zS2 = z17;
            jK4 = j19;
        }
        if (!this.H.f36101d) {
            z12 = false;
            break;
        }
        int i19 = 0;
        while (true) {
            if (i19 >= list3.size()) {
                z12 = true;
                break;
            }
            h hVarC3 = ((j7.m) ((j7.a) list3.get(i19)).f36090c.get(0)).c();
            if (hVarC3 == null || hVarC3.t()) {
                z12 = false;
                break;
            }
            i19++;
        }
        if (z12) {
            long j21 = this.H.f36103f;
            if (j21 != -9223372036854775807L) {
                jMax = Math.max(jMax, j12 - f0.K(j21));
            }
        }
        long j22 = j12 - jMax;
        j7.c cVar2 = this.H;
        if (cVar2.f36101d) {
            b7.a.j(cVar2.f36098a != -9223372036854775807L);
            long jK5 = (jK2 - f0.K(this.H.f36098a)) - jMax;
            t tVar = g().f57374c;
            long jV2 = f0.V(jK5);
            long j23 = tVar.f57336c;
            if (j23 != -9223372036854775807L) {
                jMin = Math.min(jV2, j23);
            } else {
                j7.t tVar2 = this.H.f36107j;
                if (tVar2 != null) {
                    long j24 = tVar2.f36170c;
                    if (j24 != -9223372036854775807L) {
                        jMin = Math.min(jV2, j24);
                    } else {
                        jMin = jV2;
                    }
                } else {
                    jMin = jV2;
                }
            }
            long jV3 = f0.V(jK5 - j22);
            if (jV3 < j11 && jMin > j11) {
                jV3 = j11;
            }
            j13 = -9223372036854775807L;
            long j25 = this.H.f36100c;
            if (j25 != -9223372036854775807L) {
                jV3 = Math.min(jV3 + j25, jV2);
            }
            long jH = jV3;
            long j26 = tVar.f57335b;
            if (j26 != -9223372036854775807L) {
                jH = f0.h(j26, jH, jV2);
            } else {
                j7.t tVar3 = this.H.f36107j;
                if (tVar3 != null) {
                    long j27 = tVar3.f36169b;
                    if (j27 != -9223372036854775807L) {
                        jH = f0.h(j27, jH, jV2);
                    }
                }
            }
            long j28 = jH;
            long j29 = j28 > jMin ? j28 : jMin;
            long j30 = this.E.f57334a;
            if (j30 == -9223372036854775807L) {
                j7.c cVar3 = this.H;
                j7.t tVar4 = cVar3.f36107j;
                if (tVar4 != null) {
                    long j31 = tVar4.f36168a;
                    if (j31 != -9223372036854775807L) {
                        j30 = j31;
                    } else {
                        j30 = cVar3.f36104g;
                        if (j30 == -9223372036854775807L) {
                            j30 = this.f34202o;
                        }
                    }
                } else {
                    j30 = cVar3.f36104g;
                    if (j30 == -9223372036854775807L) {
                        j30 = this.f34202o;
                    }
                }
            }
            if (j30 < j28) {
                j30 = j28;
            }
            long j32 = this.f34203p;
            long jH2 = j30 > j29 ? f0.h(f0.V(jK5 - Math.min(j32, j22 / 2)), j28, j29) : j30;
            z13 = z12;
            long j33 = j29;
            float f12 = tVar.f57337d;
            if (f12 == -3.4028235E38f) {
                j7.t tVar5 = this.H.f36107j;
                f12 = tVar5 != null ? tVar5.f36171d : -3.4028235E38f;
            }
            float f13 = tVar.f57338e;
            if (f13 == -3.4028235E38f) {
                j7.t tVar6 = this.H.f36107j;
                f13 = tVar6 != null ? tVar6.f36172e : -3.4028235E38f;
            }
            if (f12 == -3.4028235E38f && f13 == -3.4028235E38f) {
                j7.t tVar7 = this.H.f36107j;
                if (tVar7 == null || tVar7.f36168a == -9223372036854775807L) {
                    f11 = 1.0f;
                    f5 = 1.0f;
                }
                j7.t tVar8 = new j7.t();
                tVar8.f36168a = jH2;
                tVar8.f36169b = j28;
                tVar8.f36170c = j33;
                tVar8.f36171d = f11;
                tVar8.f36172e = f5;
                this.E = new t(tVar8);
                jV = f0.V(jMax) + this.H.f36098a;
                jK = jK5 - f0.K(this.E.f57334a);
                jMin2 = Math.min(j32, j22 / 2);
                if (jK < jMin2) {
                    j15 = jMin2;
                    j14 = jV;
                } else {
                    j14 = jV;
                    j15 = jK;
                }
            }
            f11 = f12;
            f5 = f13;
            j7.t tVar9 = new j7.t();
            tVar9.f36168a = jH2;
            tVar9.f36169b = j28;
            tVar9.f36170c = j33;
            tVar9.f36171d = f11;
            tVar9.f36172e = f5;
            this.E = new t(tVar9);
            jV = f0.V(jMax) + this.H.f36098a;
            jK = jK5 - f0.K(this.E.f57334a);
            jMin2 = Math.min(j32, j22 / 2);
            if (jK < jMin2) {
                j15 = jMin2;
                j14 = jV;
            } else {
                j14 = jV;
                j15 = jK;
            }
        } else {
            z13 = z12;
            j13 = -9223372036854775807L;
            j14 = -9223372036854775807L;
            j15 = j11;
        }
        long jK6 = jMax - f0.K(hVarA.f36132b);
        j7.c cVar4 = this.H;
        l(new d(cVar4.f36098a, j14, this.L, this.O, jK6, j22, j15, cVar4, g(), this.H.f36101d ? this.E : null));
        if (this.f34196h) {
            return;
        }
        Handler handler = this.D;
        c cVar5 = this.f34210w;
        handler.removeCallbacks(cVar5);
        if (z13) {
            Handler handler2 = this.D;
            j7.c cVar6 = this.H;
            long jV4 = f0.v(this.L);
            int size2 = cVar6.m.size() - 1;
            j7.h hVarA3 = cVar6.a(size2);
            long j34 = hVarA3.f36132b;
            List list5 = hVarA3.f36133c;
            long jK7 = f0.K(j34);
            long jC4 = cVar6.c(size2);
            long jK8 = f0.K(jV4);
            long jK9 = f0.K(cVar6.f36098a);
            long jK10 = f0.K(cVar6.f36102e);
            if (jK10 == j13 || jK10 >= 5000000) {
                jK10 = 5000000;
            }
            int i21 = 0;
            while (i21 < list5.size()) {
                List list6 = ((j7.a) list5.get(i21)).f36090c;
                if (list6.isEmpty()) {
                    i11 = i21;
                } else {
                    i11 = i21;
                    h hVarC4 = ((j7.m) list6.get(0)).c();
                    if (hVarC4 != null) {
                        long jH3 = (hVarC4.h(jC4, jK8) + (jK9 + jK7)) - jK8;
                        if (jH3 > j11 && (jH3 < jK10 - 100000 || (jH3 > jK10 && jH3 < jK10 + 100000))) {
                            jK10 = jH3;
                        }
                    }
                }
                i21 = i11 + 1;
            }
            handler2.postDelayed(cVar5, LongMath.b(jK10, 1000L, RoundingMode.CEILING));
        }
        if (this.I) {
            y();
            return;
        }
        if (z11) {
            j7.c cVar7 = this.H;
            if (cVar7.f36101d) {
                long j35 = cVar7.f36102e;
                if (j35 != j13) {
                    if (j35 == j11) {
                        j35 = 5000;
                    }
                    this.D.postDelayed(this.f34209v, Math.max(j11, (this.J + j35) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void x(ob.u uVar, p pVar) {
        d7.f fVar = this.f34213z;
        Uri uri = Uri.parse((String) uVar.f44892c);
        Map map = Collections.EMPTY_MAP;
        b7.a.l(uri, "The uri must be set.");
        this.A.d(new t7.q(fVar, new d7.h(uri, 1, null, map, 0L, -1L, null, 1), 5, pVar), new f(this, 0), 1);
    }

    public final void y() {
        Uri uri;
        this.D.removeCallbacks(this.f34209v);
        t7.n nVar = this.A;
        if (nVar.f52099c != null) {
            return;
        }
        if (nVar.a()) {
            this.I = true;
            return;
        }
        synchronized (this.f34207t) {
            uri = this.F;
        }
        this.I = false;
        Map map = Collections.EMPTY_MAP;
        b7.a.l(uri, "The uri must be set.");
        t7.q qVar = new t7.q(this.f34213z, new d7.h(uri, 1, null, map, 0L, -1L, null, 1), 4, this.f34205r);
        a5.f fVar = this.f34206s;
        this.m.getClass();
        this.A.d(qVar, fVar, 3);
    }
}
