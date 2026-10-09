package bh;

import com.lingodeer.data.model.CourseLessonFinishStatusKt;
import com.lingodeer.data.model.CourseUnitFinishStatus;
import com.lingodeer.data.model.CourseUnitFinishStatusKt;
import com.lingodeer.database.model.LessonFinishStatusEntity;
import com.lingodeer.database.model.UnitFinishStatusEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f4433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i11, int i12, long j11, a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f4428a = i12;
        this.f4431d = i11;
        this.f4432e = j11;
        this.f4433f = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4428a) {
            case 0:
                a1 a1Var = this.f4433f;
                return new y(this.f4431d, 0, this.f4432e, a1Var, dVar);
            case 1:
                a1 a1Var2 = this.f4433f;
                return new y(this.f4431d, 1, this.f4432e, a1Var2, dVar);
            default:
                a1 a1Var3 = this.f4433f;
                return new y(this.f4431d, 2, this.f4432e, a1Var3, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4428a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((y) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object objU;
        String str;
        Object objU2;
        String str2;
        CourseUnitFinishStatus courseUnitFinishStatusAsExternalModel;
        Object objU3;
        String str3;
        CourseUnitFinishStatus courseUnitFinishStatus;
        switch (this.f4428a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4430c;
                int i12 = this.f4431d;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String id2 = b7.e0.k(this.f4432e, xt.d.k(i12), "_");
                    au.u0 u0Var = this.f4433f.f4150d;
                    kotlin.jvm.internal.m.f(id2, "id");
                    no.g gVarL = qx.p.l(u0Var.f3075a, new String[]{"lesson_finish_status"}, new au.f(id2, 16));
                    this.f4429b = id2;
                    this.f4430c = 1;
                    objU = uz.x0.u(gVarL, this);
                    if (objU == aVar) {
                        return aVar;
                    }
                    str = id2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str4 = this.f4429b;
                    com.bumptech.glide.e.F(obj);
                    objU = obj;
                    str = str4;
                }
                LessonFinishStatusEntity lessonFinishStatusEntity = (LessonFinishStatusEntity) objU;
                if (lessonFinishStatusEntity == null) {
                    lessonFinishStatusEntity = new LessonFinishStatusEntity(str, xt.d.k(i12), false, false, false, false, System.currentTimeMillis(), true);
                }
                return CourseLessonFinishStatusKt.asExternalModel(lessonFinishStatusEntity);
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4430c;
                int i14 = this.f4431d;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String id3 = b7.e0.k(this.f4432e, xt.d.k(i14), "_");
                    au.f1 f1Var = this.f4433f.f4148b;
                    kotlin.jvm.internal.m.f(id3, "id");
                    no.g gVarL2 = qx.p.l(f1Var.f2991a, new String[]{"unit_finish_status"}, new au.f(id3, 24));
                    this.f4429b = id3;
                    this.f4430c = 1;
                    objU2 = uz.x0.u(gVarL2, this);
                    if (objU2 == aVar2) {
                        return aVar2;
                    }
                    str2 = id3;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str5 = this.f4429b;
                    com.bumptech.glide.e.F(obj);
                    objU2 = obj;
                    str2 = str5;
                }
                UnitFinishStatusEntity unitFinishStatusEntity = (UnitFinishStatusEntity) objU2;
                return (unitFinishStatusEntity == null || (courseUnitFinishStatusAsExternalModel = CourseUnitFinishStatusKt.asExternalModel(unitFinishStatusEntity)) == null) ? new CourseUnitFinishStatus(str2, xt.d.k(i14), -1, false, false, false, false, false, false, System.currentTimeMillis(), true) : courseUnitFinishStatusAsExternalModel;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f4430c;
                int i16 = this.f4431d;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String id4 = b7.e0.k(this.f4432e, xt.d.k(i16), "_");
                    au.f1 f1Var2 = this.f4433f.f4148b;
                    kotlin.jvm.internal.m.f(id4, "id");
                    no.g gVarL3 = qx.p.l(f1Var2.f2991a, new String[]{"unit_finish_status"}, new au.f(id4, 24));
                    this.f4429b = id4;
                    this.f4430c = 1;
                    objU3 = uz.x0.u(gVarL3, this);
                    if (objU3 == aVar3) {
                        return aVar3;
                    }
                    str3 = id4;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str6 = this.f4429b;
                    com.bumptech.glide.e.F(obj);
                    objU3 = obj;
                    str3 = str6;
                }
                UnitFinishStatusEntity unitFinishStatusEntity2 = (UnitFinishStatusEntity) objU3;
                if (unitFinishStatusEntity2 == null || (courseUnitFinishStatus = CourseUnitFinishStatusKt.asExternalModel(unitFinishStatusEntity2)) == null) {
                    courseUnitFinishStatus = new CourseUnitFinishStatus(str3, xt.d.k(i16), -1, false, false, false, false, false, false, System.currentTimeMillis(), true);
                }
                return new Integer(courseUnitFinishStatus.getCurEnterLessonIndex());
        }
    }
}
