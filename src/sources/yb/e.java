package yb;

import cf.x;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import km.s0;
import kotlin.jvm.internal.m;
import m00.a0;
import m00.c0;
import m00.d0;
import nv.p;
import oz.o;
import oz.q;
import pt.ImS.aYZzTH;
import rz.e0;
import rz.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Closeable, Flushable {
    public static final o S = new o("[a-z0-9_-]{1,120}");
    public long H;
    public int K;
    public c0 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final d R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f57578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f57579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f57580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0 f57581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f57582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f57583f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wz.d f57584t;

    /* JADX WARN: Code duplicated, block: B:58:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:26:0x005c, B:28:0x006c, B:37:0x00aa, B:39:0x00b1, B:42:0x00b6, B:44:0x00c7, B:47:0x00cc, B:52:0x0107, B:54:0x0112, B:58:0x011b, B:48:0x00e4, B:50:0x00f9, B:51:0x0104, B:36:0x009a, B:61:0x0120, B:62:0x0127), top: B:65:0x0001 }] */
    public static final void a(e eVar, bq.f fVar, boolean z11) {
        synchronized (eVar) {
            b bVar = (b) fVar.f4944b;
            if (!m.a(bVar.f57572g, fVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z11 || bVar.f57571f) {
                for (int i11 = 0; i11 < 2; i11++) {
                    eVar.R.f((a0) bVar.f57569d.get(i11));
                }
            } else {
                for (int i12 = 0; i12 < 2; i12++) {
                    if (((boolean[]) fVar.f4945c)[i12] && !eVar.R.h((a0) bVar.f57569d.get(i12))) {
                        fVar.d(false);
                        return;
                    }
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    a0 a0Var = (a0) bVar.f57569d.get(i13);
                    a0 a0Var2 = (a0) bVar.f57568c.get(i13);
                    if (eVar.R.h(a0Var)) {
                        eVar.R.b(a0Var, a0Var2);
                    } else {
                        d dVar = eVar.R;
                        a0 a0Var3 = (a0) bVar.f57568c.get(i13);
                        if (!dVar.h(a0Var3)) {
                            kc.h.a(dVar.x(a0Var3));
                        }
                    }
                    long j11 = bVar.f57567b[i13];
                    Long l9 = (Long) eVar.R.p(a0Var2).f24794e;
                    long jLongValue = l9 != null ? l9.longValue() : 0L;
                    bVar.f57567b[i13] = jLongValue;
                    eVar.H = (eVar.H - j11) + jLongValue;
                }
            }
            bVar.f57572g = null;
            if (bVar.f57571f) {
                eVar.p(bVar);
                return;
            }
            eVar.K++;
            c0 c0Var = eVar.L;
            m.c(c0Var);
            if (z11 || bVar.f57570e) {
                bVar.f57570e = true;
                c0Var.l0("CLEAN");
                c0Var.writeByte(32);
                c0Var.l0(bVar.f57566a);
                for (long j12 : bVar.f57567b) {
                    c0Var.writeByte(32);
                    c0Var.b(j12);
                }
                c0Var.writeByte(10);
            } else {
                eVar.f57583f.remove(bVar.f57566a);
                c0Var.l0("REMOVE");
                c0Var.writeByte(32);
                c0Var.l0(bVar.f57566a);
                c0Var.writeByte(10);
            }
            c0Var.flush();
            if (eVar.H > eVar.f57579b) {
                eVar.e();
            } else if (eVar.K >= 2000) {
                eVar.e();
            }
        }
    }

    public static void v(String str) {
        if (!S.f(str)) {
            throw new IllegalArgumentException(p.q("keys must match regex [a-z0-9_-]{1,120}: \"", str, '\"').toString());
        }
    }

    public final synchronized bq.f b(String str) {
        if (this.O) {
            throw new IllegalStateException("cache is closed");
        }
        v(str);
        d();
        b bVar = (b) this.f57583f.get(str);
        if ((bVar != null ? bVar.f57572g : null) != null) {
            return null;
        }
        if (bVar != null && bVar.f57573h != 0) {
            return null;
        }
        if (!this.P && !this.Q) {
            c0 c0Var = this.L;
            m.c(c0Var);
            c0Var.l0("DIRTY");
            c0Var.writeByte(32);
            c0Var.l0(str);
            c0Var.writeByte(10);
            c0Var.flush();
            if (this.M) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(this, str);
                this.f57583f.put(str, bVar);
            }
            bq.f fVar = new bq.f(this, bVar);
            bVar.f57572g = fVar;
            return fVar;
        }
        e();
        return null;
    }

    public final synchronized c c(String str) {
        c cVarA;
        if (this.O) {
            throw new IllegalStateException("cache is closed");
        }
        v(str);
        d();
        b bVar = (b) this.f57583f.get(str);
        if (bVar != null && (cVarA = bVar.a()) != null) {
            boolean z11 = true;
            this.K++;
            c0 c0Var = this.L;
            m.c(c0Var);
            c0Var.l0("READ");
            c0Var.writeByte(32);
            c0Var.l0(str);
            c0Var.writeByte(10);
            if (this.K < 2000) {
                z11 = false;
            }
            if (z11) {
                e();
            }
            return cVarA;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.N && !this.O) {
                for (b bVar : (b[]) this.f57583f.values().toArray(new b[0])) {
                    bq.f fVar = bVar.f57572g;
                    if (fVar != null) {
                        b bVar2 = (b) fVar.f4944b;
                        if (m.a(bVar2.f57572g, fVar)) {
                            bVar2.f57571f = true;
                        }
                    }
                }
                q();
                e0.i(this.f57584t, null);
                c0 c0Var = this.L;
                m.c(c0Var);
                c0Var.close();
                this.L = null;
                this.O = true;
                return;
            }
            this.O = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        try {
            if (this.N) {
                return;
            }
            this.R.f(this.f57581d);
            if (this.R.h(this.f57582e)) {
                if (this.R.h(this.f57580c)) {
                    this.R.f(this.f57582e);
                } else {
                    this.R.b(this.f57582e, this.f57580c);
                }
            }
            if (this.R.h(this.f57580c)) {
                try {
                    h();
                    f();
                    this.N = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        ef.e.l(this.R, this.f57578a);
                        this.O = false;
                        x();
                        this.N = true;
                    } catch (Throwable th2) {
                        this.O = false;
                        throw th2;
                    }
                }
            }
            x();
            this.N = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void e() {
        e0.B(this.f57584t, null, null, new s0(this, null, 17), 3);
    }

    public final void f() {
        Iterator it = this.f57583f.values().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i11 = 0;
            if (bVar.f57572g == null) {
                while (i11 < 2) {
                    j11 += bVar.f57567b[i11];
                    i11++;
                }
            } else {
                bVar.f57572g = null;
                while (i11 < 2) {
                    a0 a0Var = (a0) bVar.f57568c.get(i11);
                    d dVar = this.R;
                    dVar.f(a0Var);
                    dVar.f((a0) bVar.f57569d.get(i11));
                    i11++;
                }
                it.remove();
            }
        }
        this.H = j11;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.N) {
            if (this.O) {
                throw new IllegalStateException("cache is closed");
            }
            q();
            c0 c0Var = this.L;
            m.c(c0Var);
            c0Var.flush();
        }
    }

    public final void h() throws Throwable {
        d dVar = this.R;
        a0 file = this.f57580c;
        d0 d0VarC = m00.b.c(dVar.y(file));
        try {
            String strC0 = d0VarC.c0(Long.MAX_VALUE);
            String strC1 = d0VarC.c0(Long.MAX_VALUE);
            String strC2 = d0VarC.c0(Long.MAX_VALUE);
            String strC3 = d0VarC.c0(Long.MAX_VALUE);
            String strC4 = d0VarC.c0(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strC0) || !"1".equals(strC1) || !m.a(String.valueOf(1), strC2) || !m.a(String.valueOf(2), strC3) || strC4.length() > 0) {
                throw new IOException("unexpected journal header: [" + strC0 + ", " + strC1 + ", " + strC2 + ", " + strC3 + ", " + strC4 + ']');
            }
            int i11 = 0;
            while (true) {
                try {
                    i(d0VarC.c0(Long.MAX_VALUE));
                    i11++;
                } catch (EOFException unused) {
                    this.K = i11 - this.f57583f.size();
                    if (d0VarC.R()) {
                        dVar.getClass();
                        m.f(file, "file");
                        this.L = m00.b.b(new f(dVar.a(file), new a(this, 0)));
                    } else {
                        x();
                    }
                    try {
                        d0VarC.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                d0VarC.close();
            } catch (Throwable th4) {
                x.b(th, th4);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void i(String str) throws IOException {
        String strSubstring;
        int iH0 = q.H0(str, ' ', 0, 6);
        if (iH0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i11 = iH0 + 1;
        int iH1 = q.H0(str, ' ', i11, 4);
        LinkedHashMap linkedHashMap = this.f57583f;
        if (iH1 == -1) {
            strSubstring = str.substring(i11);
            m.e(strSubstring, "substring(...)");
            if (iH0 == 6 && oz.x.s0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i11, iH1);
            m.e(strSubstring, "substring(...)");
        }
        Object bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = (b) bVar;
        if (iH1 == -1 || iH0 != 5 || !oz.x.s0(str, "CLEAN", false)) {
            if (iH1 == -1 && iH0 == 5 && oz.x.s0(str, "DIRTY", false)) {
                bVar2.f57572g = new bq.f(this, bVar2);
                return;
            } else {
                if (iH1 != -1 || iH0 != 4 || !oz.x.s0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iH1 + 1);
        m.e(strSubstring2, "substring(...)");
        List listX0 = q.X0(strSubstring2, new char[]{' '}, 6);
        bVar2.f57570e = true;
        bVar2.f57572g = null;
        if (listX0.size() != 2) {
            throw new IOException("unexpected journal line: " + listX0);
        }
        try {
            int size = listX0.size();
            for (int i12 = 0; i12 < size; i12++) {
                bVar2.f57567b[i12] = Long.parseLong((String) listX0.get(i12));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listX0);
        }
    }

    public final void p(b bVar) {
        c0 c0Var;
        int i11 = bVar.f57573h;
        String str = bVar.f57566a;
        if (i11 > 0 && (c0Var = this.L) != null) {
            c0Var.l0("DIRTY");
            c0Var.writeByte(32);
            c0Var.l0(str);
            c0Var.writeByte(10);
            c0Var.flush();
        }
        if (bVar.f57573h > 0 || bVar.f57572g != null) {
            bVar.f57571f = true;
            return;
        }
        for (int i12 = 0; i12 < 2; i12++) {
            this.R.f((a0) bVar.f57568c.get(i12));
            long j11 = this.H;
            long[] jArr = bVar.f57567b;
            this.H = j11 - jArr[i12];
            jArr[i12] = 0;
        }
        this.K++;
        c0 c0Var2 = this.L;
        if (c0Var2 != null) {
            c0Var2.l0("REMOVE");
            c0Var2.writeByte(32);
            c0Var2.l0(str);
            c0Var2.writeByte(10);
        }
        this.f57583f.remove(str);
        if (this.K >= 2000) {
            e();
        }
    }

    public final void q() {
        while (this.H > this.f57579b) {
            for (b bVar : this.f57583f.values()) {
                if (!bVar.f57571f) {
                    p(bVar);
                }
            }
            return;
        }
        this.P = false;
    }

    public final synchronized void x() {
        Throwable th2;
        try {
            c0 c0Var = this.L;
            if (c0Var != null) {
                c0Var.close();
            }
            c0 c0VarB = m00.b.b(this.R.x(this.f57581d));
            try {
                c0VarB.l0("libcore.io.DiskLruCache");
                c0VarB.writeByte(10);
                c0VarB.l0("1");
                c0VarB.writeByte(10);
                c0VarB.b(1);
                c0VarB.writeByte(10);
                c0VarB.b(2);
                c0VarB.writeByte(10);
                c0VarB.writeByte(10);
                for (b bVar : this.f57583f.values()) {
                    if (bVar.f57572g != null) {
                        c0VarB.l0("DIRTY");
                        c0VarB.writeByte(32);
                        c0VarB.l0(bVar.f57566a);
                        c0VarB.writeByte(10);
                    } else {
                        c0VarB.l0("CLEAN");
                        c0VarB.writeByte(32);
                        c0VarB.l0(bVar.f57566a);
                        for (long j11 : bVar.f57567b) {
                            c0VarB.writeByte(32);
                            c0VarB.b(j11);
                        }
                        c0VarB.writeByte(10);
                    }
                }
                try {
                    c0VarB.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    c0VarB.close();
                } catch (Throwable th5) {
                    x.b(th4, th5);
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.R.h(this.f57580c)) {
                this.R.b(this.f57580c, this.f57582e);
                this.R.b(this.f57581d, this.f57580c);
                this.R.f(this.f57582e);
            } else {
                this.R.b(this.f57581d, this.f57580c);
            }
            d dVar = this.R;
            a0 file = this.f57580c;
            dVar.getClass();
            m.f(file, "file");
            this.L = m00.b.b(new f(dVar.a(file), new a(this, 0)));
            this.K = 0;
            this.M = false;
            this.Q = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public e(long j11, m00.o oVar, a0 a0Var, y yVar) {
        this.f57578a = a0Var;
        this.f57579b = j11;
        if (j11 > 0) {
            this.f57580c = a0Var.e("journal");
            this.f57581d = a0Var.e("journal.tmp");
            this.f57582e = a0Var.e("journal.bkp");
            this.f57583f = new LinkedHashMap(0, 0.75f, true);
            this.f57584t = e0.c(ew.a.w(e0.e(), yVar.limitedParallelism(1)));
            this.R = new d(oVar);
            return;
        }
        throw new IllegalArgumentException(aYZzTH.tHAAATkyZM);
    }
}
