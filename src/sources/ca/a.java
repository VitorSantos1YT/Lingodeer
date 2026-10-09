package ca;

import kotlin.jvm.internal.m;
import qy.b0;
import rt.qa;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f6748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i11, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f6746a = i11;
        this.f6748c = cVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6746a) {
            case 0:
                a aVar = new a(0, this.f6748c, dVar);
                aVar.f6747b = obj;
                return aVar;
            case 1:
                a aVar2 = new a(1, this.f6748c, dVar);
                aVar2.f6747b = obj;
                return aVar2;
            default:
                a aVar3 = new a(this.f6748c, dVar);
                aVar3.f6747b = obj;
                return aVar3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6746a) {
            case 0:
                return ((a) create((y9.l) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            case 1:
                return ((a) create((y9.l) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            default:
                a aVar = (a) create((qa) obj, (vy.d) obj2);
                b0 b0Var = b0.f48488a;
                aVar.invokeSuspend(b0Var);
                return b0Var;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f6746a;
        fz.c cVar = this.f6748c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                y9.l lVar = (y9.l) this.f6747b;
                m.d(lVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.invoke(lVar.c());
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                y9.l lVar2 = (y9.l) this.f6747b;
                m.d(lVar2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.invoke(lVar2.c());
            default:
                qa qaVar = (qa) this.f6747b;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                cVar.invoke(qaVar);
                return b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f6746a = 2;
        this.f6748c = cVar;
    }
}
