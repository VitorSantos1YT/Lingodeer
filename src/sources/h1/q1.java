package h1;

import java.util.LinkedHashSet;
import rt.mf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long f30901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Object obj, vy.d dVar, int i11) {
        super(3, dVar);
        this.f30900a = i11;
        this.f30902c = obj;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f30900a) {
            case 0:
                long j11 = ((f2.b) obj2).f26570a;
                q1 q1Var = new q1((r1) this.f30902c, (vy.d) obj3, 0);
                q1Var.f30901b = j11;
                qy.b0 b0Var = qy.b0.f48488a;
                q1Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                long j12 = ((f2.b) obj2).f26570a;
                q1 q1Var2 = new q1((p8) this.f30902c, (vy.d) obj3, 1);
                q1Var2.f30901b = j12;
                qy.b0 b0Var2 = qy.b0.f48488a;
                q1Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                q1 q1Var3 = new q1((mf) this.f30902c, this.f30901b, (vy.d) obj3);
                qy.b0 b0Var3 = qy.b0.f48488a;
                q1Var3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f30900a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f30902c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                long j11 = this.f30901b;
                r1 r1Var = (r1) obj2;
                r1Var.V = f2.b.e(j11);
                r1Var.W = f2.b.f(j11);
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                long j12 = this.f30901b;
                p8 p8Var = (p8) obj2;
                p8Var.f30864n.m((p8Var.f30859h ? p8Var.f30858g.l() - f2.b.e(j12) : f2.b.e(j12)) - p8Var.m.l());
                break;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                mf mfVar = (mf) obj2;
                LinkedHashSet linkedHashSet = mfVar.f50105f;
                long j13 = this.f30901b;
                linkedHashSet.remove(new Long(j13));
                mfVar.b(j13);
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(mf mfVar, long j11, vy.d dVar) {
        super(3, dVar);
        this.f30900a = 2;
        this.f30902c = mfVar;
        this.f30901b = j11;
    }
}
