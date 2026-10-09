package rl;

import com.google.gson.JsonObject;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsonObject f49266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(JsonObject jsonObject, vy.d dVar, int i11) {
        super(1, dVar);
        this.f49264a = i11;
        this.f49266c = jsonObject;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f49264a) {
            case 0:
                return new c(this.f49266c, dVar, 0);
            case 1:
                return new c(this.f49266c, dVar, 1);
            case 2:
                return new c(this.f49266c, dVar, 2);
            case 3:
                return new c(this.f49266c, dVar, 3);
            default:
                return new c(this.f49266c, dVar, 4);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f49264a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((c) create(dVar)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49264a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f49265b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                a aVar2 = h.f49285c;
                this.f49265b = 1;
                Object objE = aVar2.e(this.f49266c, this);
                return objE == aVar ? aVar : objE;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f49265b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                a aVar4 = h.f49285c;
                this.f49265b = 1;
                Object objB = aVar4.b(this.f49266c, this);
                return objB == aVar3 ? aVar3 : objB;
            case 2:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f49265b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                a aVar6 = h.f49285c;
                this.f49265b = 1;
                Object objC = aVar6.c(this.f49266c, this);
                return objC == aVar5 ? aVar5 : objC;
            case 3:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f49265b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                a aVar8 = h.f49285c;
                this.f49265b = 1;
                Object objD = aVar8.d(this.f49266c, this);
                return objD == aVar7 ? aVar7 : objD;
            default:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f49265b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                a aVar10 = h.f49285c;
                this.f49265b = 1;
                Object objA = aVar10.a(this.f49266c, this);
                return objA == aVar9 ? aVar9 : objA;
        }
    }
}
