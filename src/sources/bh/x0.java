package bh;

import com.lingodeer.data.model.CourseUnitFinishStatus;
import com.lingodeer.data.model.CourseUnitFinishStatusKt;
import com.lingodeer.database.model.UnitFinishStatusEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f4424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(int i11, int i12, long j11, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f4424b = a1Var;
        this.f4425c = i11;
        this.f4426d = j11;
        this.f4427e = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        long j11 = this.f4426d;
        return new x0(this.f4425c, this.f4427e, j11, this.f4424b, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f4423a;
        qy.b0 b0Var = qy.b0.f48488a;
        a1 a1Var = this.f4424b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            gp.r rVarH = a1Var.h(this.f4425c, this.f4426d);
            this.f4423a = 1;
            objU = uz.x0.u(rVarH, this);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            com.bumptech.glide.e.F(obj);
            objU = obj;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return b0Var;
        CourseUnitFinishStatus courseUnitFinishStatus = (CourseUnitFinishStatus) objU;
        int curEnterLessonIndex = courseUnitFinishStatus.getCurEnterLessonIndex();
        int i12 = this.f4427e;
        if (curEnterLessonIndex != i12) {
            au.f1 f1Var = a1Var.f4148b;
            UnitFinishStatusEntity unitFinishStatusEntityAsEntityModel = CourseUnitFinishStatusKt.asEntityModel(CourseUnitFinishStatus.copy$default(courseUnitFinishStatus, null, null, i12, false, false, false, false, false, false, 0L, true, 1019, null));
            this.f4423a = 2;
            Object objC = cf.x.C(this, f1Var.f2991a, false, true, new au.d1(2, f1Var, unitFinishStatusEntityAsEntityModel));
            if (objC != aVar) {
                objC = b0Var;
            }
            if (objC == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }
}
