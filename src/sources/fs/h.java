package fs;

import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f28032b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(fz.a aVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f28031a = i11;
        this.f28032b = aVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f28031a) {
            case 0:
                return new h(this.f28032b, dVar, 0);
            case 1:
                return new h(this.f28032b, dVar, 1);
            case 2:
                return new h(this.f28032b, dVar, 2);
            case 3:
                return new h(this.f28032b, dVar, 3);
            case 4:
                return new h(this.f28032b, dVar, 4);
            case 5:
                return new h(this.f28032b, dVar, 5);
            default:
                return new h(this.f28032b, dVar, 6);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f28031a) {
            case 0:
                h hVar = (h) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                hVar.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                h hVar2 = (h) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                hVar2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                h hVar3 = (h) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                hVar3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                h hVar4 = (h) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                hVar4.invokeSuspend(b0Var5);
                return b0Var5;
            case 4:
                h hVar5 = (h) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                hVar5.invokeSuspend(b0Var6);
                return b0Var6;
            case 5:
                h hVar6 = (h) create(b0Var, dVar);
                qy.b0 b0Var7 = qy.b0.f48488a;
                hVar6.invokeSuspend(b0Var7);
                return b0Var7;
            default:
                h hVar7 = (h) create(b0Var, dVar);
                qy.b0 b0Var8 = qy.b0.f48488a;
                hVar7.invokeSuspend(b0Var8);
                return b0Var8;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f28031a;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.a aVar = this.f28032b;
        switch (i11) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.invoke();
                break;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.invoke();
                break;
            case 2:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.invoke();
                break;
            case 3:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.invoke();
                break;
            case 4:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.invoke();
                break;
            case 5:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.invoke();
                break;
            default:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                aVar.invoke();
                break;
        }
        return b0Var;
    }
}
