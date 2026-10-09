package f7;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7.f f26876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b7.a0 f26877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.firebase.database.android.d f26878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l0 f26882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l0 f26883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l0 f26884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l0 f26885l;
    public l0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f26886n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f26887o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f26888p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y6.m0 f26874a = new y6.m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6.n0 f26875b = new y6.n0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f26889q = new ArrayList();

    public n0(g7.f fVar, b7.a0 a0Var, com.google.firebase.database.android.d dVar, o oVar) {
        this.f26876c = fVar;
        this.f26877d = a0Var;
        this.f26878e = dVar;
    }

    public static p7.b0 o(y6.o0 o0Var, Object obj, long j11, long j12, y6.n0 n0Var, y6.m0 m0Var) {
        o0Var.g(obj, m0Var);
        o0Var.n(m0Var.f57230c, n0Var);
        o0Var.b(obj);
        int i11 = m0Var.f57234g.f57176a;
        if (i11 != 0) {
            if (i11 == 1) {
                m0Var.f(0);
            }
            m0Var.f57234g.getClass();
            m0Var.g(0);
        }
        o0Var.g(obj, m0Var);
        int iC = m0Var.c(j11);
        return iC == -1 ? new p7.b0(obj, j12, m0Var.b(j11)) : new p7.b0(obj, iC, m0Var.e(iC), j12, -1);
    }

    public final l0 a() {
        l0 l0Var = this.f26882i;
        if (l0Var == null) {
            return null;
        }
        if (l0Var == this.f26883j) {
            this.f26883j = l0Var.m;
        }
        if (l0Var == this.f26884k) {
            this.f26884k = l0Var.m;
        }
        l0Var.i();
        int i11 = this.f26886n - 1;
        this.f26886n = i11;
        if (i11 == 0) {
            this.f26885l = null;
            l0 l0Var2 = this.f26882i;
            this.f26887o = l0Var2.f26826b;
            this.f26888p = l0Var2.f26831g.f26842a.f46331d;
        }
        this.f26882i = this.f26882i.m;
        l();
        return this.f26882i;
    }

    public final void b() {
        if (this.f26886n == 0) {
            return;
        }
        l0 l0Var = this.f26882i;
        b7.a.k(l0Var);
        this.f26887o = l0Var.f26826b;
        this.f26888p = l0Var.f26831g.f26842a.f46331d;
        while (l0Var != null) {
            l0Var.i();
            l0Var = l0Var.m;
        }
        this.f26882i = null;
        this.f26885l = null;
        this.f26883j = null;
        this.f26884k = null;
        this.f26886n = 0;
        l();
    }

    public final m0 c(y6.o0 o0Var, l0 l0Var, long j11) {
        y6.o0 o0Var2;
        Object obj;
        long j12;
        long j13;
        long j14;
        long jQ;
        m0 m0Var = l0Var.f26831g;
        long j15 = (l0Var.f26839p + m0Var.f26846e) - j11;
        if (!m0Var.f26849h) {
            p7.b0 b0Var = m0Var.f26842a;
            Object obj2 = b0Var.f46328a;
            int i11 = b0Var.f46332e;
            y6.m0 m0Var2 = this.f26874a;
            o0Var.g(obj2, m0Var2);
            boolean z11 = m0Var.f26848g;
            if (!b0Var.b()) {
                if (i11 != -1) {
                    m0Var2.f(i11);
                }
                int iE = m0Var2.e(i11);
                m0Var2.g(i11);
                if (iE != m0Var2.f57234g.a(i11).f57142a) {
                    return e(o0Var, b0Var.f46328a, b0Var.f46332e, iE, m0Var.f26846e, b0Var.f46331d, z11);
                }
                o0Var.g(obj2, m0Var2);
                m0Var2.d(i11);
                m0Var2.f57234g.a(i11).getClass();
                return f(o0Var, b0Var.f46328a, 0L, m0Var.f26846e, b0Var.f46331d, false);
            }
            int i12 = b0Var.f46329b;
            int i13 = m0Var2.f57234g.a(i12).f57142a;
            if (i13 == -1) {
                return null;
            }
            int iA = m0Var2.f57234g.a(i12).a(b0Var.f46330c);
            if (iA < i13) {
                return e(o0Var, b0Var.f46328a, i12, iA, m0Var.f26844c, b0Var.f46331d, z11);
            }
            long jLongValue = m0Var.f26844c;
            if (jLongValue == -9223372036854775807L) {
                Pair pairJ = o0Var.j(this.f26875b, m0Var2, m0Var2.f57230c, -9223372036854775807L, Math.max(0L, j15));
                o0Var2 = o0Var;
                if (pairJ == null) {
                    return null;
                }
                jLongValue = ((Long) pairJ.second).longValue();
            } else {
                o0Var2 = o0Var;
            }
            int i14 = b0Var.f46329b;
            o0Var2.g(obj2, m0Var2);
            m0Var2.d(i14);
            m0Var2.f57234g.a(i14).getClass();
            return f(o0Var, b0Var.f46328a, Math.max(0L, jLongValue), m0Var.f26844c, b0Var.f46331d, z11);
        }
        m0 m0Var3 = l0Var.f26831g;
        p7.b0 b0Var2 = m0Var3.f26842a;
        long j16 = m0Var3.f26844c;
        int iD = o0Var.d(o0Var.b(b0Var2.f46328a), this.f26874a, this.f26875b, this.f26880g, this.f26881h);
        if (iD != -1) {
            y6.m0 m0Var4 = this.f26874a;
            int i15 = o0Var.f(iD, m0Var4, true).f57230c;
            Object obj3 = m0Var4.f57229b;
            obj3.getClass();
            long j17 = b0Var2.f46331d;
            if (o0Var.m(i15, this.f26875b, 0L).f57250n == iD) {
                Pair pairJ2 = o0Var.j(this.f26875b, this.f26874a, i15, -9223372036854775807L, Math.max(0L, j15));
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    l0 l0Var2 = l0Var.m;
                    if (l0Var2 == null || !l0Var2.f26826b.equals(obj4)) {
                        jQ = q(obj4);
                        if (jQ == -1) {
                            jQ = this.f26879f;
                            this.f26879f = 1 + jQ;
                        }
                    } else {
                        jQ = l0Var2.f26831g.f26842a.f46331d;
                    }
                    obj = obj4;
                    j12 = jLongValue2;
                    j14 = jQ;
                    j13 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j12 = 0;
                j13 = 0;
                j14 = j17;
            }
            p7.b0 b0VarO = o(o0Var, obj, j12, j14, this.f26875b, this.f26874a);
            if (j13 != -9223372036854775807L && j16 != -9223372036854775807L) {
                int i16 = o0Var.g(b0Var2.f46328a, m0Var4).f57234g.f57176a;
                m0Var4.f57234g.getClass();
                if (i16 > 0) {
                    m0Var4.g(0);
                }
            }
            return d(o0Var, b0VarO, j13, j12);
        }
        return null;
    }

    public final m0 d(y6.o0 o0Var, p7.b0 b0Var, long j11, long j12) {
        o0Var.g(b0Var.f46328a, this.f26874a);
        return b0Var.b() ? e(o0Var, b0Var.f46328a, b0Var.f46329b, b0Var.f46330c, j11, b0Var.f46331d, false) : f(o0Var, b0Var.f46328a, j12, j11, b0Var.f46331d, false);
    }

    public final m0 e(y6.o0 o0Var, Object obj, int i11, int i12, long j11, long j12, boolean z11) {
        p7.b0 b0Var = new p7.b0(obj, i11, i12, j12, -1);
        y6.m0 m0Var = this.f26874a;
        long jA = o0Var.g(obj, m0Var).a(i11, i12);
        if (i12 == m0Var.e(i11)) {
            m0Var.f57234g.getClass();
        }
        m0Var.g(i11);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new m0(b0Var, jMax, j11, -9223372036854775807L, jA, z11, false, false, false, false);
    }

    public final m0 f(y6.o0 o0Var, Object obj, long j11, long j12, long j13, boolean z11) {
        long j14;
        y6.m0 m0Var = this.f26874a;
        o0Var.g(obj, m0Var);
        int iB = m0Var.b(j11);
        boolean z12 = false;
        if (iB != -1) {
            m0Var.g(iB);
        } else if (m0Var.f57234g.f57176a > 0) {
            m0Var.g(0);
        }
        p7.b0 b0Var = new p7.b0(obj, j13, iB);
        if (!b0Var.b() && iB == -1) {
            z12 = true;
        }
        boolean zJ = j(o0Var, b0Var);
        boolean zI = i(o0Var, b0Var, z12);
        if (iB != -1) {
            m0Var.g(iB);
        }
        if (iB != -1) {
            m0Var.f(iB);
        }
        if (iB != -1) {
            m0Var.d(iB);
            j14 = 0;
        } else {
            j14 = -9223372036854775807L;
        }
        long j15 = (j14 == -9223372036854775807L || j14 == Long.MIN_VALUE) ? m0Var.f57231d : j14;
        return new m0(b0Var, (j15 == -9223372036854775807L || j11 < j15) ? j11 : Math.max(0L, j15 - ((long) 1)), j12, j14, j15, z11, false, z12, zJ, zI);
    }

    public final l0 g() {
        return this.f26884k;
    }

    public final m0 h(y6.o0 o0Var, m0 m0Var) {
        long j11;
        long jA;
        p7.b0 b0Var = m0Var.f26842a;
        boolean zB = b0Var.b();
        int i11 = b0Var.f46332e;
        boolean z11 = !zB && i11 == -1;
        int i12 = b0Var.f46329b;
        boolean zJ = j(o0Var, b0Var);
        boolean zI = i(o0Var, b0Var, z11);
        Object obj = b0Var.f46328a;
        y6.m0 m0Var2 = this.f26874a;
        o0Var.g(obj, m0Var2);
        if (b0Var.b() || i11 == -1) {
            j11 = -9223372036854775807L;
        } else {
            m0Var2.d(i11);
            j11 = 0;
        }
        if (b0Var.b()) {
            jA = m0Var2.a(i12, b0Var.f46330c);
        } else {
            jA = (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? m0Var2.f57231d : j11;
        }
        if (b0Var.b()) {
            m0Var2.g(i12);
        } else if (i11 != -1) {
            m0Var2.g(i11);
        }
        return new m0(b0Var, m0Var.f26843b, m0Var.f26844c, j11, jA, m0Var.f26847f, false, z11, zJ, zI);
    }

    public final boolean i(y6.o0 o0Var, p7.b0 b0Var, boolean z11) {
        int iB = o0Var.b(b0Var.f46328a);
        if (!o0Var.m(o0Var.f(iB, this.f26874a, false).f57230c, this.f26875b, 0L).f57246i) {
            if (o0Var.d(iB, this.f26874a, this.f26875b, this.f26880g, this.f26881h) == -1 && z11) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(y6.o0 o0Var, p7.b0 b0Var) {
        boolean z11 = !b0Var.b() && b0Var.f46332e == -1;
        Object obj = b0Var.f46328a;
        if (z11) {
            if (o0Var.m(o0Var.g(obj, this.f26874a).f57230c, this.f26875b, 0L).f57251o == o0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        l0 l0Var = this.m;
        if (l0Var == null || l0Var.h()) {
            this.m = null;
            for (int i11 = 0; i11 < this.f26889q.size(); i11++) {
                l0 l0Var2 = (l0) this.f26889q.get(i11);
                if (!l0Var2.h()) {
                    this.m = l0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (l0 l0Var = this.f26882i; l0Var != null; l0Var = l0Var.m) {
            builder.h(l0Var.f26831g.f26842a);
        }
        l0 l0Var2 = this.f26883j;
        this.f26877d.c(new androidx.fragment.app.d(this, builder, l0Var2 == null ? null : l0Var2.f26831g.f26842a, 6));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, p7.b1] */
    public final void m(long j11) {
        l0 l0Var = this.f26885l;
        if (l0Var != null) {
            b7.a.j(l0Var.m == null);
            if (l0Var.f26829e) {
                l0Var.f26825a.x(j11 - l0Var.f26839p);
            }
        }
    }

    public final int n(l0 l0Var) {
        b7.a.k(l0Var);
        int i11 = 0;
        if (l0Var.equals(this.f26885l)) {
            return 0;
        }
        this.f26885l = l0Var;
        while (true) {
            l0Var = l0Var.m;
            if (l0Var == null) {
                break;
            }
            if (l0Var == this.f26883j) {
                l0 l0Var2 = this.f26882i;
                this.f26883j = l0Var2;
                this.f26884k = l0Var2;
                i11 = 3;
            }
            if (l0Var == this.f26884k) {
                this.f26884k = this.f26883j;
                i11 |= 2;
            }
            l0Var.i();
            this.f26886n--;
        }
        l0 l0Var3 = this.f26885l;
        l0Var3.getClass();
        if (l0Var3.m != null) {
            l0Var3.b();
            l0Var3.m = null;
            l0Var3.c();
        }
        l();
        return i11;
    }

    public final p7.b0 p(y6.o0 o0Var, Object obj, long j11) {
        long jQ;
        int iB;
        Object obj2 = obj;
        y6.m0 m0Var = this.f26874a;
        int i11 = o0Var.g(obj2, m0Var).f57230c;
        Object obj3 = this.f26887o;
        if (obj3 == null || (iB = o0Var.b(obj3)) == -1 || o0Var.f(iB, m0Var, false).f57230c != i11) {
            l0 l0Var = this.f26882i;
            while (true) {
                if (l0Var == null) {
                    l0 l0Var2 = this.f26882i;
                    while (true) {
                        if (l0Var2 == null) {
                            jQ = q(obj2);
                            if (jQ != -1) {
                                break;
                            }
                            jQ = this.f26879f;
                            this.f26879f = 1 + jQ;
                            if (this.f26882i != null) {
                                break;
                            }
                            this.f26887o = obj2;
                            this.f26888p = jQ;
                            break;
                        }
                        int iB2 = o0Var.b(l0Var2.f26826b);
                        if (iB2 != -1 && o0Var.f(iB2, m0Var, false).f57230c == i11) {
                            jQ = l0Var2.f26831g.f26842a.f46331d;
                            break;
                        }
                        l0Var2 = l0Var2.m;
                    }
                } else {
                    if (l0Var.f26826b.equals(obj2)) {
                        jQ = l0Var.f26831g.f26842a.f46331d;
                        break;
                    }
                    l0Var = l0Var.m;
                }
            }
        } else {
            jQ = this.f26888p;
        }
        o0Var.g(obj2, m0Var);
        int i12 = m0Var.f57230c;
        y6.n0 n0Var = this.f26875b;
        o0Var.n(i12, n0Var);
        boolean z11 = false;
        for (int iB3 = o0Var.b(obj); iB3 >= n0Var.f57250n; iB3--) {
            o0Var.f(iB3, m0Var, true);
            boolean z12 = m0Var.f57234g.f57176a > 0;
            z11 |= z12;
            if (m0Var.c(m0Var.f57231d) != -1) {
                obj2 = m0Var.f57229b;
                obj2.getClass();
            }
            if (z11 && (!z12 || m0Var.f57231d != 0)) {
                break;
            }
        }
        return o(o0Var, obj2, j11, jQ, this.f26875b, this.f26874a);
    }

    public final long q(Object obj) {
        for (int i11 = 0; i11 < this.f26889q.size(); i11++) {
            l0 l0Var = (l0) this.f26889q.get(i11);
            if (l0Var.f26826b.equals(obj)) {
                return l0Var.f26831g.f26842a.f46331d;
            }
        }
        return -1L;
    }

    public final int r(y6.o0 o0Var) {
        y6.o0 o0Var2;
        l0 l0Var;
        l0 l0Var2 = this.f26882i;
        if (l0Var2 == null) {
            return 0;
        }
        int iB = o0Var.b(l0Var2.f26826b);
        while (true) {
            o0Var2 = o0Var;
            iB = o0Var2.d(iB, this.f26874a, this.f26875b, this.f26880g, this.f26881h);
            while (true) {
                l0Var2.getClass();
                l0Var = l0Var2.m;
                if (l0Var == null || l0Var2.f26831g.f26849h) {
                    break;
                }
                l0Var2 = l0Var;
            }
            if (iB == -1 || l0Var == null || o0Var2.b(l0Var.f26826b) != iB) {
                break;
            }
            l0Var2 = l0Var;
            o0Var = o0Var2;
        }
        int iN = n(l0Var2);
        l0Var2.f26831g = h(o0Var2, l0Var2.f26831g);
        return iN;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    public final int s(y6.o0 o0Var, long j11, long j12, long j13) {
        m0 m0VarH;
        boolean z11;
        l0 l0Var = this.f26882i;
        l0 l0Var2 = null;
        while (true) {
            int i11 = 0;
            if (l0Var == null) {
                return 0;
            }
            m0 m0Var = l0Var.f26831g;
            if (l0Var2 == null) {
                m0VarH = h(o0Var, m0Var);
            } else {
                m0 m0VarC = c(o0Var, l0Var2, j11);
                if (m0VarC == null || m0Var.f26843b != m0VarC.f26843b || !m0Var.f26842a.equals(m0VarC.f26842a)) {
                    return n(l0Var2);
                }
                m0VarH = m0VarC;
            }
            long j14 = m0VarH.f26846e;
            long j15 = m0Var.f26844c;
            long j16 = m0Var.f26846e;
            l0Var.f26831g = m0VarH.a(j15);
            if (j16 != j14) {
                l0Var.k();
                long j17 = j14 == -9223372036854775807L ? Long.MAX_VALUE : j14 + l0Var.f26839p;
                boolean z12 = l0Var == this.f26883j && !l0Var.f26831g.f26848g && (j12 == Long.MIN_VALUE || j12 >= j17);
                boolean z13 = l0Var == this.f26884k && (j13 == Long.MIN_VALUE || j13 >= j17);
                int iN = n(l0Var);
                if (iN != 0) {
                    return iN;
                }
                if (j16 == -9223372036854775807L && m0Var.f26845d == Long.MIN_VALUE) {
                    long j18 = m0VarH.f26845d;
                    if (j18 == -9223372036854775807L || j18 == Long.MIN_VALUE) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else {
                    z11 = false;
                }
                if (z12 && (j16 != -9223372036854775807L || z11)) {
                    i11 = 1;
                }
                return z13 ? i11 | 2 : i11;
            }
            l0Var2 = l0Var;
            l0Var = l0Var.m;
        }
    }
}
