package y9;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import qy.b0;
import w9.w;
import w9.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements x, t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f57537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ry.k f57539c = new ry.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f57540d = new AtomicBoolean(false);

    public s(f fVar, boolean z11) {
        this.f57537a = fVar;
        this.f57538b = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w9.m
    public final Object a(String str, fz.c cVar, xy.c cVar2) {
        r rVar;
        f fVar;
        s sVar;
        if (cVar2 instanceof r) {
            rVar = (r) cVar2;
            int i11 = rVar.f57536t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.f57536t = i11 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar2);
            }
        } else {
            rVar = new r(this, cVar2);
        }
        Object obj = rVar.f57534e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = rVar.f57536t;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (this.f57540d.get()) {
                com.bumptech.glide.f.H(21, "Connection is recycled");
                throw null;
            }
            a aVar2 = (a) rVar.getContext().get(a.f57461b);
            if (aVar2 == null || aVar2.f57462a != this) {
                com.bumptech.glide.f.H(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            rVar.f57530a = this;
            rVar.f57531b = str;
            rVar.f57532c = cVar;
            fVar = this.f57537a;
            rVar.f57533d = fVar;
            rVar.f57536t = 1;
            if (fVar.f57479b.b(rVar) == aVar) {
                return aVar;
            }
            sVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar2 = rVar.f57533d;
            cVar = rVar.f57532c;
            String str2 = rVar.f57531b;
            sVar = rVar.f57530a;
            com.bumptech.glide.e.F(obj);
            fVar = fVar2;
            str = str2;
        }
        try {
            k kVar = new k(sVar, sVar.f57537a.B1(str));
            try {
                Object objInvoke = cVar.invoke(kVar);
                hz.b.h(kVar, null);
                fVar.a(null);
                return objInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    hz.b.h(kVar, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            fVar.a(null);
            throw th4;
        }
    }

    @Override // w9.x
    public final Object b(w wVar, fz.e eVar, xy.i iVar) {
        if (this.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().get(a.f57461b);
        if (aVar != null && aVar.f57462a == this) {
            return g(wVar, eVar, iVar);
        }
        com.bumptech.glide.f.H(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // y9.t
    public final ja.a c() {
        return this.f57537a;
    }

    @Override // w9.x
    public final Object d(xy.i iVar) {
        if (this.f57540d.get()) {
            com.bumptech.glide.f.H(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().get(a.f57461b);
        if (aVar != null && aVar.f57462a == this) {
            return Boolean.valueOf(!this.f57539c.isEmpty());
        }
        com.bumptech.glide.f.H(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(w wVar, xy.c cVar) {
        o oVar;
        f fVar;
        s sVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i11 = oVar.f57517f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f57517f = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f57515d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = oVar.f57517f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            oVar.f57512a = this;
            oVar.f57513b = wVar;
            fVar = this.f57537a;
            oVar.f57514c = fVar;
            oVar.f57517f = 1;
            if (fVar.f57479b.b(oVar) == aVar) {
                return aVar;
            }
            sVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar2 = oVar.f57514c;
            w wVar2 = oVar.f57513b;
            sVar = oVar.f57512a;
            com.bumptech.glide.e.F(obj);
            fVar = fVar2;
            wVar = wVar2;
        }
        try {
            ry.k kVar = sVar.f57539c;
            f fVar3 = sVar.f57537a;
            int i13 = kVar.f50852c;
            if (kVar.isEmpty()) {
                int i14 = n.f57511a[wVar.ordinal()];
                if (i14 == 1) {
                    com.bumptech.glide.f.o(fVar3, "BEGIN DEFERRED TRANSACTION");
                } else if (i14 == 2) {
                    com.bumptech.glide.f.o(fVar3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i14 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.bumptech.glide.f.o(fVar3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                com.bumptech.glide.f.o(fVar3, "SAVEPOINT '" + i13 + '\'');
            }
            kVar.addLast(new m(i13));
            b0 b0Var = b0.f48488a;
            fVar.a(null);
            return b0Var;
        } catch (Throwable th2) {
            fVar.a(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(boolean z11, xy.c cVar) {
        p pVar;
        s sVar;
        f fVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i11 = pVar.f57523f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.f57523f = i11 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object obj = pVar.f57521d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = pVar.f57523f;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            pVar.f57518a = this;
            f fVar2 = this.f57537a;
            pVar.f57519b = fVar2;
            pVar.f57520c = z11;
            pVar.f57523f = 1;
            if (fVar2.f57479b.b(pVar) == aVar) {
                return aVar;
            }
            sVar = this;
            fVar = fVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = pVar.f57520c;
            fVar = pVar.f57519b;
            sVar = pVar.f57518a;
            com.bumptech.glide.e.F(obj);
        }
        try {
            ry.k kVar = sVar.f57539c;
            f fVar3 = sVar.f57537a;
            if (kVar.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            m mVar = (m) ry.m.M0(kVar);
            if (z11) {
                mVar.getClass();
                if (kVar.isEmpty()) {
                    com.bumptech.glide.f.o(fVar3, "END TRANSACTION");
                } else {
                    com.bumptech.glide.f.o(fVar3, "RELEASE SAVEPOINT '" + mVar.f57510a + '\'');
                }
            } else if (kVar.isEmpty()) {
                com.bumptech.glide.f.o(fVar3, "ROLLBACK TRANSACTION");
            } else {
                com.bumptech.glide.f.o(fVar3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + mVar.f57510a + '\'');
            }
            b0 b0Var = b0.f48488a;
            fVar.a(null);
            return b0Var;
        } catch (Throwable th2) {
            fVar.a(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(w wVar, fz.e eVar, xy.c cVar) throws Throwable {
        q qVar;
        s sVar;
        s sVar2;
        int i11;
        SQLException e8;
        Throwable th2;
        boolean z11;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i12 = qVar.f57529f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                qVar.f57529f = i12 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objInvoke = qVar.f57527d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = qVar.f57529f;
        try {
            if (i13 == 0) {
                com.bumptech.glide.e.F(objInvoke);
                if (wVar == null) {
                    wVar = w.DEFERRED;
                }
                qVar.f57524a = this;
                qVar.f57525b = (Serializable) eVar;
                qVar.f57529f = 1;
                if (e(wVar, qVar) != aVar) {
                    sVar = this;
                }
                return aVar;
            }
            if (i13 == 1) {
                eVar = (fz.e) qVar.f57525b;
                sVar = (s) qVar.f57524a;
                com.bumptech.glide.e.F(objInvoke);
            } else {
                if (i13 != 2) {
                    if (i13 == 3 || i13 == 4) {
                        Object obj = qVar.f57524a;
                        com.bumptech.glide.e.F(objInvoke);
                        return obj;
                    }
                    if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th2 = (Throwable) qVar.f57525b;
                    th = (Throwable) qVar.f57524a;
                    try {
                        com.bumptech.glide.e.F(objInvoke);
                        throw th2;
                    } catch (SQLException e10) {
                        e8 = e10;
                        if (th != null) {
                            throw e8;
                        }
                        cf.x.b(th, e8);
                        throw th2;
                    }
                }
                i11 = qVar.f57526c;
                sVar2 = (s) qVar.f57524a;
                try {
                    com.bumptech.glide.e.F(objInvoke);
                    z11 = i11 != 0;
                    qVar.f57524a = objInvoke;
                    qVar.f57529f = 3;
                    if (sVar2.f(z11, qVar) != aVar) {
                        return aVar;
                    }
                    return objInvoke;
                } catch (Throwable th3) {
                    th = th3;
                    sVar = sVar2;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        try {
                            qVar.f57524a = th;
                            qVar.f57525b = th4;
                            qVar.f57529f = 5;
                            if (sVar.f(false, qVar) != aVar) {
                                throw th4;
                            }
                        } catch (SQLException e11) {
                            e8 = e11;
                            th2 = th4;
                            if (th != null) {
                                throw e8;
                            }
                            cf.x.b(th, e8);
                            throw th2;
                        }
                    }
                }
            }
            l lVar = new l(sVar, 0);
            qVar.f57524a = sVar;
            qVar.f57525b = null;
            qVar.f57526c = 1;
            qVar.f57529f = 2;
            objInvoke = eVar.invoke(lVar, qVar);
            if (objInvoke != aVar) {
                sVar2 = sVar;
                i11 = 1;
                if (i11 != 0) {
                }
                qVar.f57524a = objInvoke;
                qVar.f57529f = 3;
                if (sVar2.f(z11, qVar) != aVar) {
                    return objInvoke;
                }
            }
            return aVar;
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
    }
}
