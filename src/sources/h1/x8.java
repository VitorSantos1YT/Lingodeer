package h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a00.e f31315a = new a00.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.k1 f31316b = l1.t.B(null);

    public static Object b(x8 x8Var, String str, xy.i iVar) {
        q8 q8Var = q8.Short;
        x8Var.getClass();
        return x8Var.a(new v8(str, q8Var), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v8 v8Var, xy.c cVar) {
        w8 w8Var;
        a00.a aVar;
        x8 x8Var;
        v8 v8Var2;
        Throwable th2;
        x8 x8Var2;
        a00.a aVar2;
        if (cVar instanceof w8) {
            w8Var = (w8) cVar;
            int i11 = w8Var.f31251f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w8Var.f31251f = i11 - Integer.MIN_VALUE;
            } else {
                w8Var = new w8(this, cVar);
            }
        } else {
            w8Var = new w8(this, cVar);
        }
        Object obj = w8Var.f31249d;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i12 = w8Var.f31251f;
        try {
            try {
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    w8Var.f31246a = this;
                    w8Var.f31247b = v8Var;
                    aVar = this.f31315a;
                    w8Var.f31248c = aVar;
                    w8Var.f31251f = 1;
                    if (aVar.b(w8Var) != aVar3) {
                        x8Var = this;
                        v8Var2 = v8Var;
                    }
                    return aVar3;
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = w8Var.f31248c;
                    x8Var2 = w8Var.f31246a;
                    try {
                        com.bumptech.glide.e.F(obj);
                        x8Var2.f31316b.setValue(null);
                        aVar2.a(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        x8Var2.f31316b.setValue(null);
                        throw th2;
                    }
                }
                a00.a aVar4 = w8Var.f31248c;
                v8 v8Var3 = w8Var.f31247b;
                x8Var = w8Var.f31246a;
                com.bumptech.glide.e.F(obj);
                aVar = aVar4;
                v8Var2 = v8Var3;
                w8Var.f31246a = x8Var;
                w8Var.f31247b = v8Var2;
                w8Var.f31248c = aVar;
                w8Var.f31251f = 2;
                rz.m mVar = new rz.m(1, ue.f.x(w8Var));
                mVar.s();
                x8Var.f31316b.setValue(new u8(v8Var2, mVar));
                Object objR = mVar.r();
                if (objR != aVar3) {
                    a00.a aVar5 = aVar;
                    obj = objR;
                    aVar2 = aVar5;
                    x8Var2 = x8Var;
                    x8Var2.f31316b.setValue(null);
                    aVar2.a(null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th4) {
                th2 = th4;
                x8Var2 = x8Var;
                x8Var2.f31316b.setValue(null);
                throw th2;
            }
        } catch (Throwable th5) {
            v8Var.a(null);
            throw th5;
        }
    }
}
