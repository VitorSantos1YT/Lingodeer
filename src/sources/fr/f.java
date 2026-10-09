package fr;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f27491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i11, ArrayList arrayList, vy.d dVar, int i12) {
        super(2, dVar);
        this.f27489a = i12;
        this.f27491c = iVar;
        this.f27492d = i11;
        this.f27493e = arrayList;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27489a) {
            case 0:
                return new f(this.f27491c, this.f27492d, this.f27493e, dVar, 0);
            default:
                return new f(this.f27491c, this.f27492d, this.f27493e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27489a) {
            case 0:
                break;
        }
        return ((f) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27489a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27490b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    gp.r rVarG = this.f27491c.f27579b.g(this.f27492d, ns.o.K(new Integer(1)), this.f27493e);
                    this.f27490b = 1;
                    obj = uz.x0.u(rVarG, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return new Integer(((List) obj).size());
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27490b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    gp.r rVarG2 = this.f27491c.f27579b.g(this.f27492d, ns.o.K(new Integer(0)), this.f27493e);
                    this.f27490b = 1;
                    obj = uz.x0.u(rVarG2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return new Integer(((List) obj).size());
        }
    }
}
