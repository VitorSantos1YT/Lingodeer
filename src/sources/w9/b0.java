package w9;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f54778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f54779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(g0 g0Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f54776a = i11;
        this.f54779d = g0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f54776a) {
            case 0:
                b0 b0Var = new b0(this.f54779d, dVar, 0);
                b0Var.f54778c = obj;
                return b0Var;
            case 1:
                b0 b0Var2 = new b0(this.f54779d, dVar, 1);
                b0Var2.f54778c = obj;
                return b0Var2;
            default:
                b0 b0Var3 = new b0(this.f54779d, dVar, 2);
                b0Var3.f54778c = obj;
                return b0Var3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54776a) {
            case 0:
                return ((b0) create((y9.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((b0) create((x) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((b0) create((x) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        x xVar;
        Object objD;
        Object objB;
        x xVar2;
        Object objD2;
        j[] jVarArr;
        j jVar;
        switch (this.f54776a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f54777b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                y9.l lVar = (y9.l) this.f54778c;
                this.f54777b = 1;
                Object objA = g0.a(this.f54779d, lVar, this);
                return objA == aVar ? aVar : objA;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f54777b;
                try {
                    if (i12 != 0) {
                        if (i12 == 1) {
                            xVar = (x) this.f54778c;
                            com.bumptech.glide.e.F(obj);
                            objD = obj;
                        } else {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.e.F(obj);
                            objB = obj;
                        }
                        return (Set) objB;
                    }
                    com.bumptech.glide.e.F(obj);
                    xVar = (x) this.f54778c;
                    this.f54778c = xVar;
                    this.f54777b = 1;
                    objD = xVar.d(this);
                    if (objD == aVar2) {
                        return aVar2;
                    }
                    if (!((Boolean) objD).booleanValue()) {
                        w wVar = w.IMMEDIATE;
                        b0 b0Var = new b0(this.f54779d, null, 0);
                        this.f54778c = null;
                        this.f54777b = 2;
                        objB = xVar.b(wVar, b0Var, this);
                        if (objB == aVar2) {
                            return aVar2;
                        }
                        return (Set) objB;
                    }
                } catch (SQLException unused) {
                }
                return ry.t.f50856a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f54777b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                boolean z11 = true;
                if (i13 != 0) {
                    if (i13 == 1) {
                        xVar2 = (x) this.f54778c;
                        com.bumptech.glide.e.F(obj);
                        objD2 = obj;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj);
                xVar2 = (x) this.f54778c;
                this.f54778c = xVar2;
                this.f54777b = 1;
                objD2 = xVar2.d(this);
                if (objD2 == aVar3) {
                    return aVar3;
                }
                if (!((Boolean) objD2).booleanValue()) {
                    g0 g0Var = this.f54779d;
                    bq.f fVar = g0Var.f54815h;
                    long[] jArr = (long[]) fVar.f4945c;
                    ReentrantLock reentrantLock = (ReentrantLock) fVar.f4944b;
                    reentrantLock.lock();
                    try {
                        if (fVar.f4943a) {
                            boolean z12 = false;
                            fVar.f4943a = false;
                            int length = jArr.length;
                            jVarArr = new j[length];
                            int i14 = 0;
                            boolean z13 = false;
                            while (i14 < length) {
                                if (jArr[i14] <= 0) {
                                    z11 = z12;
                                }
                                boolean[] zArr = (boolean[]) fVar.f4946d;
                                if (z11 != zArr[i14]) {
                                    zArr[i14] = z11;
                                    jVar = z11 ? j.ADD : j.REMOVE;
                                    z13 = true;
                                } else {
                                    jVar = j.NO_OP;
                                }
                                jVarArr[i14] = jVar;
                                i14++;
                                z11 = true;
                                z12 = false;
                            }
                            if (!z13) {
                                jVarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            jVarArr = null;
                        }
                        if (jVarArr != null) {
                            w wVar2 = w.IMMEDIATE;
                            js.l lVar2 = new js.l(jVarArr, g0Var, xVar2, null);
                            this.f54778c = null;
                            this.f54777b = 2;
                            if (xVar2.b(wVar2, lVar2, this) == aVar3) {
                                return aVar3;
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                return b0Var2;
        }
    }
}
