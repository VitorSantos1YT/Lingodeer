package ca;

import bt.t5;
import et.o;
import java.util.List;
import l1.a1;
import l1.h1;
import rz.b0;
import rz.e0;
import rz.o0;
import w9.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6756a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f6759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vy.d dVar, s sVar, boolean z11, boolean z12, fz.c cVar) {
        super(2, dVar);
        this.f6758c = sVar;
        this.f6759d = z11;
        this.f6760e = z12;
        this.f6761f = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6756a) {
            case 0:
                return new c((s) this.f6758c, this.f6759d, this.f6760e, (fz.c) this.f6761f, dVar);
            case 1:
                return new c(dVar, (s) this.f6758c, this.f6759d, this.f6760e, (fz.c) this.f6761f);
            default:
                return new c(this.f6759d, (o) this.f6758c, this.f6760e, (a1) this.f6761f, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6756a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f6756a) {
            case 0:
                s sVar = (s) this.f6758c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f6757b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                boolean z11 = !(sVar.q() && sVar.r()) && this.f6759d;
                boolean z12 = this.f6760e;
                b bVar = new b(z11, z12, sVar, null, (fz.c) this.f6761f, 0);
                this.f6757b = 1;
                Object objY = sVar.y(z12, bVar, this);
                return objY == aVar ? aVar : objY;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f6757b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                s sVar2 = (s) this.f6758c;
                boolean z13 = this.f6760e;
                boolean z14 = this.f6759d;
                b bVar2 = new b(z13, z14, sVar2, null, (fz.c) this.f6761f, 1);
                this.f6757b = 1;
                Object objY2 = sVar2.y(z14, bVar2, this);
                return objY2 == aVar2 ? aVar2 : objY2;
            default:
                a1 a1Var = (a1) this.f6761f;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f6757b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (this.f6759d) {
                        ot.f fVar = ((et.j) ((o) this.f6758c)).f25885b;
                        List list = fVar.f45803b;
                        List list2 = fVar.f45804c;
                        this.f6757b = 1;
                        obj = e0.M(o0.f50940a, new t5(list, list2, this.f6760e, (vy.d) null, 3), this);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                    } else {
                        ((h1) a1Var).m(-1);
                    }
                    return qy.b0.f48488a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                ((h1) a1Var).m(((Number) ((qy.l) obj).f48495a).intValue());
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s sVar, boolean z11, boolean z12, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f6758c = sVar;
        this.f6759d = z11;
        this.f6760e = z12;
        this.f6761f = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z11, o oVar, boolean z12, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f6759d = z11;
        this.f6758c = oVar;
        this.f6760e = z12;
        this.f6761f = a1Var;
    }
}
