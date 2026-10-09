package mw;

import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k3 implements Closeable {
    public j3 H;
    public int K;
    public boolean L;
    public e0 M;
    public e0 N;
    public long O;
    public boolean P;
    public int Q;
    public int R;
    public boolean S;
    public volatile boolean T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f42504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n5 f42506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r5 f42507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public lw.l f42508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f42509f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f42510t;

    public k3(b bVar, int i11, n5 n5Var, r5 r5Var) {
        lw.k kVar = lw.k.f40407b;
        this.H = j3.HEADER;
        this.K = 5;
        this.N = new e0();
        this.P = false;
        this.Q = -1;
        this.S = false;
        this.T = false;
        this.f42504a = bVar;
        this.f42508e = kVar;
        this.f42505b = i11;
        this.f42506c = n5Var;
        Preconditions.k(r5Var, "transportTracer");
        this.f42507d = r5Var;
    }

    public final void a() {
        if (this.P) {
            return;
        }
        boolean z11 = true;
        this.P = true;
        while (!this.T && this.O > 0 && d()) {
            try {
                int i11 = h3.f42439a[this.H.ordinal()];
                if (i11 == 1) {
                    c();
                } else {
                    if (i11 != 2) {
                        throw new AssertionError("Invalid state: " + this.H);
                    }
                    b();
                    this.O--;
                }
            } catch (Throwable th2) {
                this.P = false;
                throw th2;
            }
        }
        if (this.T) {
            close();
            this.P = false;
            return;
        }
        if (this.S) {
            if (this.N.f42403c != 0) {
                z11 = false;
            }
            if (z11) {
                close();
            }
        }
        this.P = false;
    }

    public final void b() {
        Object i3Var;
        int i11 = this.Q;
        long j11 = this.R;
        n5 n5Var = this.f42506c;
        boolean z11 = false;
        for (lw.j jVar : n5Var.f42589a) {
            jVar.d(i11, j11);
        }
        this.R = 0;
        if (this.L) {
            lw.l lVar = this.f42508e;
            if (lVar == lw.k.f40407b) {
                throw lw.q1.f40441l.h("Can't decode compressed gRPC message as compression not configured").a();
            }
            try {
                e0 e0Var = this.M;
                e4 e4Var = f4.f42422a;
                d4 d4Var = new d4();
                Preconditions.k(e0Var, "buffer");
                d4Var.f42391a = e0Var;
                i3Var = new i3(lVar.e(d4Var), this.f42505b, n5Var);
            } catch (IOException e8) {
                throw new RuntimeException(e8);
            }
        } else {
            long j12 = this.M.f42403c;
            lw.j[] jVarArr = n5Var.f42589a;
            for (lw.j jVar2 : jVarArr) {
                jVar2.f(j12);
            }
            e0 e0Var2 = this.M;
            e4 e4Var2 = f4.f42422a;
            d4 d4Var2 = new d4();
            Preconditions.k(e0Var2, "buffer");
            d4Var2.f42391a = e0Var2;
            i3Var = d4Var2;
        }
        this.M.getClass();
        this.M = null;
        b bVar = this.f42504a;
        dm.a aVar = new dm.a(27, z11);
        aVar.f23485b = i3Var;
        bVar.f42351j.e(aVar);
        this.H = j3.HEADER;
        this.K = 5;
    }

    public final void c() {
        int i11 = this.M.i();
        if ((i11 & 254) != 0) {
            throw lw.q1.f40441l.h("gRPC frame header malformed: reserved bits not zero").a();
        }
        this.L = (i11 & 1) != 0;
        e0 e0Var = this.M;
        e0Var.a(4);
        int i12 = e0Var.i() | (e0Var.i() << 24) | (e0Var.i() << 16) | (e0Var.i() << 8);
        this.K = i12;
        if (i12 < 0 || i12 > this.f42505b) {
            lw.q1 q1Var = lw.q1.f40439j;
            Locale locale = Locale.US;
            throw q1Var.h("gRPC message exceeds maximum size " + this.f42505b + ": " + i12).a();
        }
        int i13 = this.Q + 1;
        this.Q = i13;
        for (lw.j jVar : this.f42506c.f42589a) {
            jVar.c(i13);
        }
        r5 r5Var = this.f42507d;
        ((k2) r5Var.f42668b).a();
        ((n3) r5Var.f42667a).t();
        this.H = j3.BODY;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (isClosed()) {
            return;
        }
        e0 e0Var = this.M;
        boolean z11 = e0Var != null && e0Var.f42403c > 0;
        try {
            e0 e0Var2 = this.N;
            if (e0Var2 != null) {
                e0Var2.close();
            }
            e0 e0Var3 = this.M;
            if (e0Var3 != null) {
                e0Var3.close();
            }
            this.N = null;
            this.M = null;
            this.f42504a.c(z11);
        } catch (Throwable th2) {
            this.N = null;
            this.M = null;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r7.H == mw.j3.BODY) goto L17;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() throws java.lang.Throwable {
        /*
            r7 = this;
            mw.n5 r0 = r7.f42506c
            r1 = 0
            mw.e0 r2 = r7.M     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L11
            mw.e0 r2 = new mw.e0     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            r7.M = r2     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L5e
        L11:
            r2 = r1
        L12:
            int r3 = r7.K     // Catch: java.lang.Throwable -> L49
            mw.e0 r4 = r7.M     // Catch: java.lang.Throwable -> L49
            int r4 = r4.f42403c     // Catch: java.lang.Throwable -> L49
            int r3 = r3 - r4
            if (r3 <= 0) goto L4e
            mw.e0 r4 = r7.N     // Catch: java.lang.Throwable -> L49
            int r4 = r4.f42403c     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L38
            if (r2 <= 0) goto L37
            mw.b r3 = r7.f42504a
            r3.a(r2)
            mw.j3 r3 = r7.H
            mw.j3 r4 = mw.j3.BODY
            if (r3 != r4) goto L37
        L2e:
            long r3 = (long) r2
            r0.a(r3)
            int r0 = r7.R
            int r0 = r0 + r2
            r7.R = r0
        L37:
            return r1
        L38:
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L49
            int r2 = r2 + r3
            mw.e0 r4 = r7.M     // Catch: java.lang.Throwable -> L49
            mw.e0 r5 = r7.N     // Catch: java.lang.Throwable -> L49
            mw.d r3 = r5.d(r3)     // Catch: java.lang.Throwable -> L49
            r4.v(r3)     // Catch: java.lang.Throwable -> L49
            goto L12
        L49:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L5e
        L4e:
            r1 = 1
            if (r2 <= 0) goto L5d
            mw.b r3 = r7.f42504a
            r3.a(r2)
            mw.j3 r3 = r7.H
            mw.j3 r4 = mw.j3.BODY
            if (r3 != r4) goto L5d
            goto L2e
        L5d:
            return r1
        L5e:
            if (r1 <= 0) goto L74
            mw.b r3 = r7.f42504a
            r3.a(r1)
            mw.j3 r3 = r7.H
            mw.j3 r4 = mw.j3.BODY
            if (r3 != r4) goto L74
            long r3 = (long) r1
            r0.a(r3)
            int r0 = r7.R
            int r0 = r0 + r1
            r7.R = r0
        L74:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mw.k3.d():boolean");
    }

    public final boolean isClosed() {
        return this.N == null;
    }
}
