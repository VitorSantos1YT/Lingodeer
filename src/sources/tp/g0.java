package tp;

import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.data.model.ReviewStatus;
import fr.n3;
import rz.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f52464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f52465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(i0 i0Var, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f52462a = i12;
        this.f52464c = i0Var;
        this.f52465d = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f52462a) {
            case 0:
                return new g0(this.f52464c, this.f52465d, dVar, 0);
            default:
                return new g0(this.f52464c, this.f52465d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f52462a) {
            case 0:
                break;
        }
        return ((g0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f52462a;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = this.f52465d;
        i0 i0Var = this.f52464c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f52463b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                ReviewNew reviewNew = (ReviewNew) i0Var.O.get(i0Var.P);
                wt.q qVar = (wt.q) i0Var.V.getValue();
                String cwsId = reviewNew.getCwsId();
                kotlin.jvm.internal.m.e(cwsId, "getCwsId(...)");
                Long unit = reviewNew.getUnit();
                kotlin.jvm.internal.m.e(unit, "getUnit(...)");
                long jLongValue = unit.longValue();
                long id2 = reviewNew.getId();
                int iA = nv.p.a(reviewNew, "getElemType(...)");
                Long lastStudyTime = reviewNew.getLastStudyTime();
                kotlin.jvm.internal.m.e(lastStudyTime, "getLastStudyTime(...)");
                long jLongValue2 = lastStudyTime.longValue();
                String status = reviewNew.getStatus();
                kotlin.jvm.internal.m.e(status, "getStatus(...)");
                ReviewStatus reviewStatus = new ReviewStatus(cwsId, jLongValue, id2, iA, jLongValue2, status);
                this.f52463b = 1;
                Object objA = ((n3) qVar.f55345b).a(reviewStatus, i12, this);
                if (objA != aVar) {
                    objA = b0Var;
                }
                return objA == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f52463b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                yz.f fVar = o0.f50940a;
                yz.e eVar = yz.e.f58387a;
                g0 g0Var = new g0(i0Var, i12, null, 0);
                this.f52463b = 1;
                return rz.e0.M(eVar, g0Var, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}
