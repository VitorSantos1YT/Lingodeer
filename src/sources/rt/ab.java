package rt;

import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ab extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f49453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f49454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb f49455e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(bb bbVar, vy.d dVar) {
        super(3, dVar);
        this.f49455e = bbVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ab abVar = new ab(this.f49455e, (vy.d) obj3);
        abVar.f49453c = (List) obj;
        abVar.f49454d = zBooleanValue;
        return abVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        List list = this.f49453c;
        boolean z11 = this.f49454d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f49452b;
        if (i12 != 0) {
            if (i12 == 1) {
                com.bumptech.glide.e.F(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i13 = this.f49451a;
                com.bumptech.glide.e.F(obj);
                i11 = i13;
            }
            ry.r rVar = ry.r.f50854a;
            return new CourseTestFinishSummaryUiState.Success(z11, i11, 100, false, rVar, rVar, (List) obj, null, 128, null);
        }
        com.bumptech.glide.e.F(obj);
        bb bbVar = this.f49455e;
        wt.o0 o0Var = bbVar.f49539d;
        CoursePracticeType coursePracticeType = bbVar.H;
        int size = list.size();
        this.f49453c = list;
        this.f49454d = z11;
        this.f49452b = 1;
        obj = wt.o0.b(o0Var, coursePracticeType, size, this, 4);
        if (obj != aVar) {
        }
        return aVar;
        int iIntValue = ((Number) obj).intValue();
        yz.f fVar = rz.o0.f50940a;
        yz.e eVar = yz.e.f58387a;
        za zaVar = new za(list, null);
        this.f49453c = null;
        this.f49454d = z11;
        this.f49451a = iIntValue;
        this.f49452b = 2;
        Object objM = rz.e0.M(eVar, zaVar, this);
        if (objM != aVar) {
            i11 = iIntValue;
            obj = objM;
            ry.r rVar2 = ry.r.f50854a;
            return new CourseTestFinishSummaryUiState.Success(z11, i11, 100, false, rVar2, rVar2, (List) obj, null, 128, null);
        }
        return aVar;
    }
}
