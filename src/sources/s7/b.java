package s7;

import android.os.SystemClock;
import b7.f0;
import b7.y;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import y6.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t7.e f51390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f51391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f51392i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f51393j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f51394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f51395l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f51396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImmutableList f51397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f51398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f51399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f51400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f51401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f51402t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q7.a f51403u;

    public b(p0 p0Var, int[] iArr, t7.e eVar, long j11, long j12, long j13, ImmutableList immutableList) {
        super(p0Var, iArr);
        if (j13 < j11) {
            b7.a.B("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j13 = j11;
        }
        this.f51390g = eVar;
        this.f51391h = j11 * 1000;
        this.f51392i = j12 * 1000;
        this.f51393j = j13 * 1000;
        this.f51394k = 1279;
        this.f51395l = 719;
        this.m = 0.7f;
        this.f51396n = 0.75f;
        this.f51397o = ImmutableList.n(immutableList);
        this.f51398p = y.f4045a;
        this.f51399q = 1.0f;
        this.f51401s = 0;
        this.f51402t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i11);
            if (builder != null) {
                builder.h(new a(j11, jArr[i11]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            q7.a aVar = (q7.a) Iterables.c(list);
            long j11 = aVar.f47530t;
            if (j11 != -9223372036854775807L) {
                long j12 = aVar.H;
                if (j12 != -9223372036854775807L) {
                    return j12 - j11;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // s7.s
    public final int c() {
        return this.f51400r;
    }

    @Override // s7.c, s7.s
    public final void g() {
        this.f51402t = -9223372036854775807L;
        this.f51403u = null;
    }

    @Override // s7.s
    public final void i(long j11, long j12, long j13, List list, q7.j[] jVarArr) {
        long jX;
        this.f51398p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = this.f51400r;
        if (i11 >= jVarArr.length || !jVarArr[i11].next()) {
            int length = jVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    jX = x(list);
                    break;
                }
                q7.j jVar = jVarArr[i12];
                if (jVar.next()) {
                    jX = jVar.i() - jVar.c();
                    break;
                }
                i12++;
            }
        } else {
            q7.j jVar2 = jVarArr[this.f51400r];
            jX = jVar2.i() - jVar2.c();
        }
        int i13 = this.f51401s;
        if (i13 == 0) {
            this.f51401s = 1;
            this.f51400r = w(jElapsedRealtime);
            return;
        }
        int i14 = this.f51400r;
        int iD = list.isEmpty() ? -1 : d(((q7.a) Iterables.c(list)).f47527d);
        if (iD != -1) {
            i13 = ((q7.a) Iterables.c(list)).f47528e;
            i14 = iD;
        }
        int iW = w(jElapsedRealtime);
        if (iW != i14 && !a(i14, jElapsedRealtime)) {
            y6.p[] pVarArr = this.f51407d;
            y6.p pVar = pVarArr[i14];
            y6.p pVar2 = pVarArr[iW];
            long jMin = this.f51391h;
            if (j13 != -9223372036854775807L) {
                jMin = Math.min((long) ((jX != -9223372036854775807L ? j13 - jX : j13) * this.f51396n), jMin);
            }
            int i15 = pVar2.f57288j;
            int i16 = pVar.f57288j;
            if ((i15 > i16 && j12 < jMin) || (i15 < i16 && j12 >= this.f51392i)) {
                iW = i14;
            }
        }
        if (iW != i14) {
            i13 = 3;
        }
        this.f51401s = i13;
        this.f51400r = iW;
    }

    @Override // s7.c, s7.s
    public final int j(long j11, List list) {
        int i11;
        int i12;
        this.f51398p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = this.f51402t;
        if (j12 != -9223372036854775807L && jElapsedRealtime - j12 < 1000 && (list.isEmpty() || ((q7.a) Iterables.c(list)).equals(this.f51403u))) {
            return list.size();
        }
        this.f51402t = jElapsedRealtime;
        this.f51403u = list.isEmpty() ? null : (q7.a) Iterables.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jX = f0.x(((q7.a) list.get(size - 1)).f47530t - j11, this.f51399q);
        long j13 = this.f51393j;
        if (jX >= j13) {
            x(list);
            y6.p pVar = this.f51407d[w(jElapsedRealtime)];
            for (int i13 = 0; i13 < size; i13++) {
                q7.a aVar = (q7.a) list.get(i13);
                y6.p pVar2 = aVar.f47527d;
                if (f0.x(aVar.f47530t - j11, this.f51399q) >= j13 && pVar2.f57288j < pVar.f57288j && (i11 = pVar2.f57299v) != -1 && i11 <= this.f51395l && (i12 = pVar2.f57298u) != -1 && i12 <= this.f51394k && i11 < pVar.f57299v) {
                    return i13;
                }
            }
        }
        return size;
    }

    @Override // s7.c, s7.s
    public final void k() {
        this.f51403u = null;
    }

    @Override // s7.s
    public final int n() {
        return this.f51401s;
    }

    @Override // s7.c, s7.s
    public final void p(float f5) {
        this.f51399q = f5;
    }

    @Override // s7.s
    public final Object q() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int w(long j11) {
        long j12;
        t7.i iVar = (t7.i) this.f51390g;
        synchronized (iVar) {
            j12 = iVar.f52085l;
        }
        long j13 = (long) (j12 * this.m);
        this.f51390g.getClass();
        long j14 = (long) (j13 / this.f51399q);
        if (!this.f51397o.isEmpty()) {
            int i11 = 1;
            while (i11 < this.f51397o.size() - 1 && ((a) this.f51397o.get(i11)).f51388a < j14) {
                i11++;
            }
            a aVar = (a) this.f51397o.get(i11 - 1);
            a aVar2 = (a) this.f51397o.get(i11);
            long j15 = aVar.f51388a;
            float f5 = (j14 - j15) / (aVar2.f51388a - j15);
            long j16 = aVar.f51389b;
            j14 = j16 + ((long) (f5 * (aVar2.f51389b - j16)));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f51405b; i13++) {
            if (j11 == Long.MIN_VALUE || !a(i13, j11)) {
                if (this.f51407d[i13].f57288j <= j14) {
                    return i13;
                }
                i12 = i13;
            }
        }
        return i12;
    }
}
