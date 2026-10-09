package no;

import com.google.firebase.database.DatabaseReference;
import com.lingo.lingoskill.speak.object.PodUser;
import rz.b0;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f43878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PodUser f43879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(s sVar, PodUser podUser, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43876a = i11;
        this.f43878c = sVar;
        this.f43879d = podUser;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43876a) {
            case 0:
                return new i(this.f43878c, this.f43879d, dVar, 0);
            default:
                return new i(this.f43878c, this.f43879d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43876a) {
            case 0:
                break;
        }
        return ((i) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f43876a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43877b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                DatabaseReference databaseReference = this.f43878c.f43916a;
                if (databaseReference == null) {
                    kotlin.jvm.internal.m.n("mUserDb");
                    throw null;
                }
                nl.b bVar = new nl.b(qx.p.h(databaseReference.e(this.f43879d.getUid())), 2);
                this.f43877b = 1;
                Object objV = x0.v(bVar, this);
                return objV == aVar ? aVar : objV;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f43877b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                DatabaseReference databaseReference2 = this.f43878c.f43916a;
                if (databaseReference2 == null) {
                    kotlin.jvm.internal.m.n("mUserDb");
                    throw null;
                }
                nl.b bVar2 = new nl.b(qx.p.h(databaseReference2.e(this.f43879d.getUid())), 3);
                this.f43877b = 1;
                Object objV2 = x0.v(bVar2, this);
                return objV2 == aVar2 ? aVar2 : objV2;
        }
    }
}
