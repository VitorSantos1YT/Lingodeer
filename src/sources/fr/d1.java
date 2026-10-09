package fr;

import com.lingodeer.data.model.UserInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f27460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v1 f27461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(List list, v1 v1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27458a = i11;
        this.f27460c = list;
        this.f27461d = v1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27458a) {
            case 0:
                return new d1(this.f27460c, this.f27461d, dVar, 0);
            default:
                return new d1(this.f27460c, this.f27461d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27458a) {
            case 0:
                break;
        }
        return ((d1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        switch (this.f27458a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27459b;
                v1 v1Var = this.f27461d;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    List list = this.f27460c;
                    if (!list.isEmpty() || ((o0) v1Var.f27910a).f27733a.isUnloginUser()) {
                        return list;
                    }
                    gp.r rVarN = ((x4) v1Var.f27911b).n();
                    this.f27459b = 1;
                    obj = uz.x0.u(rVarN, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List<String> allFollowers = ((UserInfo) obj).getAllFollowers();
                uz.i1 i1Var = v1Var.f27916g;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, allFollowers));
                return allFollowers;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f27459b;
                v1 v1Var2 = this.f27461d;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    List list2 = this.f27460c;
                    if (!list2.isEmpty() || ((o0) v1Var2.f27910a).f27733a.isUnloginUser()) {
                        return list2;
                    }
                    gp.r rVarN2 = ((x4) v1Var2.f27911b).n();
                    this.f27459b = 1;
                    obj = uz.x0.u(rVarN2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List<String> allFollowings = ((UserInfo) obj).getAllFollowings();
                uz.i1 i1Var2 = v1Var2.f27915f;
                do {
                    value2 = i1Var2.getValue();
                } while (!i1Var2.j(value2, allFollowings));
                return allFollowings;
        }
    }
}
