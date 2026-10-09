package no;

import com.lingo.lingoskill.speak.object.PodUser;
import rz.b0;
import rz.e0;
import rz.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f43883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PodUser f43884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(s sVar, PodUser podUser, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43880a = i11;
        this.f43883d = sVar;
        this.f43884e = podUser;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43880a) {
            case 0:
                j jVar = new j(this.f43883d, this.f43884e, dVar, 0);
                jVar.f43882c = obj;
                return jVar;
            default:
                j jVar2 = new j(this.f43883d, this.f43884e, dVar, 1);
                jVar2.f43882c = obj;
                return jVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43880a) {
            case 0:
                break;
        }
        return ((j) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f43880a) {
            case 0:
                b0 b0Var = (b0) this.f43882c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43881b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                i0 i0VarF = e0.f(b0Var, null, null, new i(this.f43883d, this.f43884e, null, 0), 3);
                this.f43882c = null;
                this.f43881b = 1;
                Object objO = i0VarF.o(this);
                return objO == aVar ? aVar : objO;
            default:
                b0 b0Var2 = (b0) this.f43882c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f43881b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i0 i0VarF2 = e0.f(b0Var2, null, null, new i(this.f43883d, this.f43884e, null, 1), 3);
                    this.f43882c = null;
                    this.f43881b = 1;
                    obj = i0VarF2.o(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return (PodUser) obj;
        }
    }
}
