package rt;

import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class ib extends xy.i implements fz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ LinkedHashMap f49881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ qy.l f49882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f49883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb f49884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f49885f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(mb mbVar, vt.n0 n0Var, vy.d dVar) {
        super(6, dVar);
        this.f49884e = mbVar;
        this.f49885f = n0Var;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        ib ibVar = new ib(this.f49884e, this.f49885f, (vy.d) obj6);
        ibVar.f49881b = (LinkedHashMap) obj;
        ibVar.f49882c = (qy.l) obj4;
        ibVar.f49883d = zBooleanValue;
        return ibVar.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap = this.f49881b;
        qy.l lVar = this.f49882c;
        boolean z11 = this.f49883d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f49880a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            int iIntValue = ((Number) lVar.f48495a).intValue();
            Set set = (Set) lVar.f48496b;
            CourseTestFinishSummaryType courseTestFinishSummaryType = CourseTestFinishSummaryType.LESSON;
            CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_REVIEW_5_MIN_QUIZ;
            mb mbVar = this.f49884e;
            int iIntValue2 = ((Number) mbVar.M.getValue()).intValue();
            wt.m mVar = mbVar.f50072p0;
            wt.o0 o0Var = mbVar.f50073q0;
            this.f49881b = null;
            this.f49882c = null;
            this.f49883d = z11;
            this.f49880a = 1;
            yz.f fVar = rz.o0.f50940a;
            obj = rz.e0.M(yz.e.f58387a, new ea(linkedHashMap, iIntValue, iIntValue2, set, coursePracticeType, courseTestFinishSummaryType, o0Var, mVar, this.f49885f, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        CourseTestFinishSummaryUiState.Success successCopy$default = CourseTestFinishSummaryUiState.Success.copy$default((CourseTestFinishSummaryUiState.Success) obj, z11, 0, 0, false, null, null, null, null, 254, null);
        Objects.toString(successCopy$default);
        return successCopy$default;
    }
}
