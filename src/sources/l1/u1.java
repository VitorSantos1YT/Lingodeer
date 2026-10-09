package l1;

import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements s1, b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f39483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy.i f39484b;

    public u1(b1 b1Var, vy.i iVar) {
        this.f39483a = b1Var;
        this.f39484b = iVar;
    }

    @Override // l1.b1
    public final fz.c a() {
        return this.f39483a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final wy.a b(fz.a aVar, xy.c cVar) {
        t1 t1Var;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i11 = t1Var.f39472d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t1Var.f39472d = i11 - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(this, cVar);
            }
        } else {
            t1Var = new t1(this, cVar);
        }
        Object obj = t1Var.f39470b;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = t1Var.f39472d;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                t1Var.f39469a = (kotlin.jvm.internal.n) aVar;
                t1Var.f39472d = 1;
                rz.m mVar = new rz.m(1, ue.f.x(t1Var));
                mVar.s();
                aVar = aVar;
                if (mVar.r() == aVar2) {
                    return aVar2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fz.a aVar3 = (fz.a) t1Var.f39469a;
                com.bumptech.glide.e.F(obj);
                aVar = aVar3;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }

    @Override // rz.b0
    public final vy.i getCoroutineContext() {
        return this.f39484b;
    }

    @Override // l1.b3
    public final Object getValue() {
        return this.f39483a.getValue();
    }

    @Override // l1.b1
    public final Object i() {
        return this.f39483a.i();
    }

    @Override // l1.b1
    public final void setValue(Object obj) {
        this.f39483a.setValue(obj);
    }
}
