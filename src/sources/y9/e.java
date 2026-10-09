package y9;

import android.database.SQLException;
import bt.w;
import cf.x;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.y;
import rz.e0;
import wz.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f57473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f57474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal f57475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f57476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f57477e;

    public e(qh.d dVar) {
        this.f57475c = new ThreadLocal();
        this.f57476d = new AtomicBoolean(false);
        int i11 = pz.a.f47220d;
        this.f57477e = pz.f.p(30, pz.c.SECONDS);
        j jVar = new j(1, new xa.a(dVar, 8));
        this.f57473a = jVar;
        this.f57474b = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153 A[Catch: all -> 0x01a4, TRY_LEAVE, TryCatch #2 {all -> 0x01a4, blocks: (B:63:0x012a, B:68:0x0148, B:70:0x0153, B:84:0x01a8, B:85:0x01af), top: B:110:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x018c A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #1 {all -> 0x01a3, blocks: (B:74:0x0186, B:76:0x018c, B:78:0x0198, B:80:0x019c), top: B:108:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a8 A[Catch: all -> 0x01a4, TRY_ENTER, TryCatch #2 {all -> 0x01a4, blocks: (B:63:0x012a, B:68:0x0148, B:70:0x0153, B:84:0x01a8, B:85:0x01af), top: B:110:0x012a }] */
    @Override // y9.b
    public final Object K(boolean z11, fz.e eVar, xy.c cVar) throws IllegalAccessException, InvocationTargetException {
        d dVar;
        y yVar;
        Throwable th2;
        j jVar;
        j jVar2;
        vy.i context;
        e eVar2;
        fz.e eVar3;
        y yVar2;
        boolean z12;
        Object obj;
        y yVar3;
        s sVar;
        f fVar;
        boolean z13 = z11;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i11 = dVar.L;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.L = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objM = dVar.H;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = dVar.L;
        vy.d dVar2 = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            if (this.f57476d.get()) {
                com.bumptech.glide.f.H(21, "Connection pool is closed");
                throw null;
            }
            ThreadLocal threadLocal = this.f57475c;
            s sVar2 = (s) threadLocal.get();
            re.q qVar = a.f57461b;
            if (sVar2 == null) {
                a aVar2 = (a) dVar.getContext().get(qVar);
                sVar2 = aVar2 != null ? aVar2.f57462a : null;
            }
            if (sVar2 == null) {
                j jVar3 = z13 ? this.f57473a : this.f57474b;
                yVar = new y();
                try {
                    vy.i context2 = dVar.getContext();
                    long j11 = this.f57477e;
                    w wVar = new w(this, z13, 5);
                    dVar.f57466a = this;
                    dVar.f57467b = (Serializable) eVar;
                    dVar.f57468c = jVar3;
                    dVar.f57469d = yVar;
                    dVar.f57470e = context2;
                    dVar.f57471f = yVar;
                    dVar.f57472t = z13;
                    dVar.L = 3;
                    Object objB = jVar3.b(j11, wVar, dVar);
                    if (objB != aVar) {
                        jVar2 = jVar3;
                        objM = objB;
                        context = context2;
                        eVar2 = this;
                        eVar3 = eVar;
                        yVar2 = yVar;
                        f fVar2 = (f) objM;
                        fVar2.getClass();
                        kotlin.jvm.internal.m.f(context, "context");
                        fVar2.f57480c = context;
                        fVar2.f57481d = new Throwable();
                        if (eVar2.f57473a == eVar2.f57474b) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        yVar2.f38361a = new s(fVar2, z12);
                        obj = yVar.f38361a;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        s sVar3 = (s) obj;
                        a aVar3 = new a(sVar3);
                        ThreadLocal threadLocal2 = eVar2.f57475c;
                        kotlin.jvm.internal.m.f(threadLocal2, "<this>");
                        vy.i iVarW = ew.a.w(aVar3, new u(sVar3, threadLocal2));
                        xg.b bVar = new xg.b(3, eVar3, yVar, null);
                        dVar.f57466a = jVar2;
                        dVar.f57467b = yVar;
                        dVar.f57468c = null;
                        dVar.f57469d = null;
                        dVar.f57470e = null;
                        dVar.f57471f = null;
                        dVar.L = 4;
                        objM = e0.M(iVarW, bVar, dVar);
                        if (objM != aVar) {
                            yVar3 = yVar;
                            jVar = jVar2;
                            sVar = (s) yVar3.f38361a;
                            if (sVar != null) {
                                fVar = sVar.f57537a;
                                if (sVar.f57540d.compareAndSet(false, true)) {
                                    com.bumptech.glide.f.o(fVar, "ROLLBACK TRANSACTION");
                                }
                                fVar.f57480c = null;
                                fVar.f57481d = null;
                                jVar.e(fVar);
                            }
                            return objM;
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    jVar = jVar3;
                }
            } else {
                if (!z13 && sVar2.f57538b) {
                    com.bumptech.glide.f.H(1, "Cannot upgrade connection from reader to writer");
                    throw null;
                }
                if (dVar.getContext().get(qVar) == null) {
                    a aVar4 = new a(sVar2);
                    kotlin.jvm.internal.m.f(threadLocal, "<this>");
                    vy.i iVarW2 = ew.a.w(aVar4, new u(sVar2, threadLocal));
                    xg.b bVar2 = new xg.b(2, eVar, sVar2, dVar2);
                    dVar.L = 1;
                    Object objM2 = e0.M(iVarW2, bVar2, dVar);
                    if (objM2 != aVar) {
                        return objM2;
                    }
                } else {
                    dVar.L = 2;
                    Object objInvoke = eVar.invoke(sVar2, dVar);
                    if (objInvoke != aVar) {
                        return objInvoke;
                    }
                }
            }
            return aVar;
        }
        if (i12 == 1) {
            com.bumptech.glide.e.F(objM);
            return objM;
        }
        if (i12 == 2) {
            com.bumptech.glide.e.F(objM);
            return objM;
        }
        if (i12 == 3) {
            z13 = dVar.f57472t;
            yVar2 = dVar.f57471f;
            vy.i iVar = dVar.f57470e;
            y yVar4 = dVar.f57469d;
            j jVar4 = dVar.f57468c;
            eVar3 = (fz.e) dVar.f57467b;
            e eVar4 = (e) dVar.f57466a;
            try {
                com.bumptech.glide.e.F(objM);
                context = iVar;
                yVar = yVar4;
                eVar2 = eVar4;
                jVar2 = jVar4;
                try {
                    f fVar3 = (f) objM;
                    fVar3.getClass();
                    kotlin.jvm.internal.m.f(context, "context");
                    fVar3.f57480c = context;
                    fVar3.f57481d = new Throwable();
                    if (eVar2.f57473a == eVar2.f57474b && z13) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    yVar2.f38361a = new s(fVar3, z12);
                    obj = yVar.f38361a;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    s sVar4 = (s) obj;
                    a aVar5 = new a(sVar4);
                    ThreadLocal threadLocal3 = eVar2.f57475c;
                    kotlin.jvm.internal.m.f(threadLocal3, "<this>");
                    vy.i iVarW3 = ew.a.w(aVar5, new u(sVar4, threadLocal3));
                    xg.b bVar3 = new xg.b(3, eVar3, yVar, null);
                    dVar.f57466a = jVar2;
                    dVar.f57467b = yVar;
                    dVar.f57468c = null;
                    dVar.f57469d = null;
                    dVar.f57470e = null;
                    dVar.f57471f = null;
                    dVar.L = 4;
                    objM = e0.M(iVarW3, bVar3, dVar);
                    if (objM != aVar) {
                        yVar3 = yVar;
                        jVar = jVar2;
                        sVar = (s) yVar3.f38361a;
                        if (sVar != null) {
                            fVar = sVar.f57537a;
                            if (sVar.f57540d.compareAndSet(false, true)) {
                                com.bumptech.glide.f.o(fVar, "ROLLBACK TRANSACTION");
                            }
                            fVar.f57480c = null;
                            fVar.f57481d = null;
                            jVar.e(fVar);
                        }
                        return objM;
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th2 = th4;
                    jVar = jVar2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                yVar = yVar4;
                jVar = jVar4;
            }
        } else {
            if (i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar3 = (y) dVar.f57467b;
            jVar = (j) dVar.f57466a;
            try {
                com.bumptech.glide.e.F(objM);
                try {
                    sVar = (s) yVar3.f38361a;
                    if (sVar != null) {
                        fVar = sVar.f57537a;
                        if (sVar.f57540d.compareAndSet(false, true)) {
                            try {
                                com.bumptech.glide.f.o(fVar, "ROLLBACK TRANSACTION");
                            } catch (SQLException unused) {
                            }
                        }
                        fVar.f57480c = null;
                        fVar.f57481d = null;
                        jVar.e(fVar);
                    }
                } catch (Throwable unused2) {
                }
                return objM;
            } catch (Throwable th6) {
                yVar = yVar3;
                th2 = th6;
            }
        }
        try {
            throw th2;
        } catch (Throwable th7) {
            try {
                s sVar5 = (s) yVar.f38361a;
                if (sVar5 == null) {
                    throw th7;
                }
                if (sVar5.f57540d.compareAndSet(false, true)) {
                    try {
                        com.bumptech.glide.f.o(sVar5.f57537a, "ROLLBACK TRANSACTION");
                    } catch (SQLException unused3) {
                    }
                }
                f fVar4 = sVar5.f57537a;
                fVar4.f57480c = null;
                fVar4.f57481d = null;
                jVar.e(fVar4);
                throw th7;
            } catch (Throwable th8) {
                x.b(th2, th8);
                throw th7;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f57476d.compareAndSet(false, true)) {
            this.f57473a.c();
            this.f57474b.c();
        }
    }

    public e(final qh.d dVar, final String fileName, int i11) {
        kotlin.jvm.internal.m.f(fileName, "fileName");
        this.f57475c = new ThreadLocal();
        final int i12 = 0;
        this.f57476d = new AtomicBoolean(false);
        int i13 = pz.a.f47220d;
        this.f57477e = pz.f.p(30, pz.c.SECONDS);
        if (i11 > 0) {
            this.f57473a = new j(i11, new fz.a() { // from class: y9.c
                @Override // fz.a
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            ja.a aVarC = dVar.c(fileName);
                            com.bumptech.glide.f.o(aVarC, "PRAGMA query_only = 1");
                            return aVarC;
                        default:
                            return dVar.c(fileName);
                    }
                }
            });
            final int i14 = 1;
            this.f57474b = new j(1, new fz.a() { // from class: y9.c
                @Override // fz.a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            ja.a aVarC = dVar.c(fileName);
                            com.bumptech.glide.f.o(aVarC, "PRAGMA query_only = 1");
                            return aVarC;
                        default:
                            return dVar.c(fileName);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
