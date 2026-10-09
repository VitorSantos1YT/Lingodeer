package d0;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends xy.i implements fz.e {
    public final /* synthetic */ o1 H;
    public final /* synthetic */ xy.i K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.a f22761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f22762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o1 f22764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f22766f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1 f22767t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n1(l1 l1Var, o1 o1Var, fz.e eVar, Object obj, vy.d dVar) {
        super(2, dVar);
        this.f22767t = l1Var;
        this.H = o1Var;
        this.K = (xy.i) eVar;
        this.L = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        n1 n1Var = new n1(this.f22767t, this.H, this.K, this.L, dVar);
        n1Var.f22766f = obj;
        return n1Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a00.a, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [fz.e] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        o1 o1Var;
        Object obj2;
        m1 m1Var;
        a00.a aVar;
        ?? r9;
        o1 o1Var2;
        Throwable th2;
        m1 m1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        ?? r11 = this.f22765e;
        try {
            try {
                if (r11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vy.g gVar = ((rz.b0) this.f22766f).getCoroutineContext().get(rz.z.f50978b);
                    kotlin.jvm.internal.m.c(gVar);
                    m1 m1Var3 = new m1(this.f22767t, (rz.g1) gVar);
                    o1Var = this.H;
                    o1.a(o1Var, m1Var3);
                    a00.e eVar = o1Var.f22769b;
                    this.f22766f = m1Var3;
                    this.f22761a = eVar;
                    xy.i iVar = this.K;
                    this.f22762b = iVar;
                    Object obj3 = this.L;
                    this.f22763c = obj3;
                    this.f22764d = o1Var;
                    this.f22765e = 1;
                    if (eVar.b(this) != aVar2) {
                        obj2 = obj3;
                        m1Var = m1Var3;
                        aVar = eVar;
                        r9 = iVar;
                    }
                    return aVar2;
                }
                if (r11 != 1) {
                    if (r11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o1Var2 = (o1) this.f22762b;
                    aVar = this.f22761a;
                    m1Var2 = (m1) this.f22766f;
                    try {
                        com.bumptech.glide.e.F(obj);
                        atomicReference2 = o1Var2.f22768a;
                        while (!atomicReference2.compareAndSet(m1Var2, null) && atomicReference2.get() == m1Var2) {
                        }
                        aVar.a(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = o1Var2.f22768a;
                        while (!atomicReference.compareAndSet(m1Var2, null)) {
                        }
                        throw th2;
                    }
                }
                o1 o1Var3 = this.f22764d;
                obj2 = this.f22763c;
                fz.e eVar2 = (fz.e) this.f22762b;
                a00.a aVar3 = this.f22761a;
                m1Var = (m1) this.f22766f;
                com.bumptech.glide.e.F(obj);
                o1Var = o1Var3;
                aVar = aVar3;
                r9 = eVar2;
                this.f22766f = m1Var;
                this.f22761a = aVar;
                this.f22762b = o1Var;
                this.f22763c = null;
                this.f22764d = null;
                this.f22765e = 2;
                Object objInvoke = r9.invoke(obj2, this);
                if (objInvoke != aVar2) {
                    o1Var2 = o1Var;
                    obj = objInvoke;
                    m1Var2 = m1Var;
                    atomicReference2 = o1Var2.f22768a;
                    while (!atomicReference2.compareAndSet(m1Var2, null)) {
                    }
                    aVar.a(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th4) {
                o1Var2 = o1Var;
                th2 = th4;
                m1Var2 = m1Var;
                atomicReference = o1Var2.f22768a;
                while (!atomicReference.compareAndSet(m1Var2, null) && atomicReference.get() == m1Var2) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            r11.a(null);
            throw th5;
        }
    }
}
