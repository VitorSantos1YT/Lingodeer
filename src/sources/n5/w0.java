package n5;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a00.e f43420a = new a00.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm.a f43421b = new dm.a(28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gp.r f43422c = new gp.r(new jp.t0(2, 3, null));

    public w0(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n5.g0
    public final Object a(fz.e eVar, xy.c cVar) throws Throwable {
        v0 v0Var;
        a00.e eVar2;
        Throwable th2;
        boolean z11;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i11 = v0Var.f43414e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                v0Var.f43414e = i11 - Integer.MIN_VALUE;
            } else {
                v0Var = new v0(this, cVar);
            }
        } else {
            v0Var = new v0(this, cVar);
        }
        Object obj = v0Var.f43412c;
        Object obj2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = v0Var.f43414e;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = v0Var.f43411b;
            eVar2 = v0Var.f43410a;
            try {
                com.bumptech.glide.e.F(obj);
                if (z11) {
                    eVar2.a(null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z11) {
                    eVar2.a(null);
                }
                throw th2;
            }
        }
        com.bumptech.glide.e.F(obj);
        a00.e eVar3 = this.f43420a;
        boolean zG = eVar3.g();
        try {
            Object objValueOf = Boolean.valueOf(zG);
            v0Var.f43410a = eVar3;
            v0Var.f43411b = zG;
            v0Var.f43414e = 1;
            Object objInvoke = eVar.invoke(objValueOf, v0Var);
            if (objInvoke == obj2) {
                return obj2;
            }
            eVar2 = eVar3;
            obj = objInvoke;
            z11 = zG;
            if (z11) {
                eVar2.a(null);
            }
            return obj;
        } catch (Throwable th4) {
            eVar2 = eVar3;
            th2 = th4;
            z11 = zG;
            if (z11) {
                eVar2.a(null);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n5.g0
    public final Object b(fz.c cVar, xy.c cVar2) throws Throwable {
        u0 u0Var;
        a00.e eVar;
        Throwable th2;
        a00.a aVar;
        if (cVar2 instanceof u0) {
            u0Var = (u0) cVar2;
            int i11 = u0Var.f43397e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u0Var.f43397e = i11 - Integer.MIN_VALUE;
            } else {
                u0Var = new u0(this, cVar2);
            }
        } else {
            u0Var = new u0(this, cVar2);
        }
        Object obj = u0Var.f43395c;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = u0Var.f43397e;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                u0Var.f43393a = cVar;
                eVar = this.f43420a;
                u0Var.f43394b = eVar;
                u0Var.f43397e = 1;
                if (eVar.b(u0Var) != aVar2) {
                }
                return aVar2;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a00.a) u0Var.f43393a;
                try {
                    com.bumptech.glide.e.F(obj);
                    aVar.a(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar.a(null);
                    throw th2;
                }
            }
            a00.e eVar2 = u0Var.f43394b;
            fz.c cVar3 = (fz.c) u0Var.f43393a;
            com.bumptech.glide.e.F(obj);
            eVar = eVar2;
            cVar = cVar3;
            u0Var.f43393a = eVar;
            u0Var.f43394b = null;
            u0Var.f43397e = 2;
            Object objInvoke = cVar.invoke(u0Var);
            if (objInvoke != aVar2) {
                a00.e eVar3 = eVar;
                obj = objInvoke;
                aVar = eVar3;
                aVar.a(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th4) {
            a00.e eVar4 = eVar;
            th2 = th4;
            aVar = eVar4;
            aVar.a(null);
            throw th2;
        }
    }

    @Override // n5.g0
    public final uz.i c() {
        return this.f43422c;
    }

    @Override // n5.g0
    public final Object d(ch.u uVar) {
        return new Integer(((AtomicInteger) this.f43421b.f23485b).incrementAndGet());
    }

    @Override // n5.g0
    public final Object e(xy.c cVar) {
        return new Integer(((AtomicInteger) this.f43421b.f23485b).get());
    }
}
