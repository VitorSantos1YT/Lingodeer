package b0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xy.i implements fz.c {
    public final /* synthetic */ fz.c H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f3431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.u f3432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f3434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f3436f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f3437t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Object obj, r1 r1Var, long j11, fz.c cVar, vy.d dVar2) {
        super(1, dVar2);
        this.f3434d = dVar;
        this.f3435e = obj;
        this.f3436f = r1Var;
        this.f3437t = j11;
        this.H = cVar;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new b(this.f3434d, this.f3435e, this.f3436f, this.f3437t, this.H, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((b) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        kotlin.jvm.internal.u uVar;
        r1 r1Var = this.f3436f;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3433c;
        d dVar = this.f3434d;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                dVar.f3472c.f3615c = (s) dVar.f3470a.f3575a.invoke(this.f3435e);
                dVar.f3474e.setValue(r1Var.f3659c);
                dVar.f3473d.setValue(Boolean.TRUE);
                n nVar2 = dVar.f3472c;
                n nVar3 = new n(nVar2.f3613a, nVar2.f3614b.getValue(), e.k(nVar2.f3615c), nVar2.f3616d, Long.MIN_VALUE, nVar2.f3618f);
                kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                long j11 = this.f3437t;
                a aVar2 = new a(dVar, nVar3, this.H, uVar2, 0);
                this.f3431a = nVar3;
                this.f3432b = uVar2;
                this.f3433c = 1;
                if (e.d(nVar3, r1Var, j11, aVar2, this) == aVar) {
                    return aVar;
                }
                nVar = nVar3;
                uVar = uVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar = this.f3432b;
                nVar = this.f3431a;
                com.bumptech.glide.e.F(obj);
            }
            j jVar = uVar.f38357a ? j.BoundReached : j.Finished;
            d.b(dVar);
            return new k(nVar, jVar);
        } catch (CancellationException e8) {
            d.b(dVar);
            throw e8;
        }
    }
}
