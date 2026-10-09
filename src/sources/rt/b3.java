package rt;

import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryType;
import com.lingodeer.data.model.uistate.CourseTestFinishSummaryUiState;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b3 extends xy.i implements fz.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CourseTestFinishSummaryType f49478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ LinkedHashMap f49480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ qy.l f49481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f49482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e3 f49483f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f49484t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(e3 e3Var, vt.n0 n0Var, vy.d dVar) {
        super(6, dVar);
        this.f49483f = e3Var;
        this.f49484t = n0Var;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        b3 b3Var = new b3(this.f49483f, this.f49484t, (vy.d) obj6);
        b3Var.f49480c = (LinkedHashMap) obj;
        b3Var.f49481d = (qy.l) obj4;
        b3Var.f49482e = zBooleanValue;
        return b3Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        CourseTestFinishSummaryType courseTestFinishSummaryType;
        LinkedHashMap linkedHashMap = this.f49480c;
        qy.l lVar = this.f49481d;
        boolean z11 = this.f49482e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f49479b;
        int i12 = 1;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            int iIntValue = ((Number) lVar.f48495a).intValue();
            Set set = (Set) lVar.f48496b;
            e3 e3Var = this.f49483f;
            rz.e0.B(ViewModelKt.getViewModelScope(e3Var), null, null, new v2(e3Var, null, i12), 3);
            CourseTestFinishSummaryType courseTestFinishSummaryType2 = CourseTestFinishSummaryType.LESSON;
            CoursePracticeType coursePracticeType = e3Var.f49676x0;
            int size = linkedHashMap.size();
            wt.m mVar = e3Var.f49666n0;
            wt.o0 o0Var = e3Var.f49667o0;
            this.f49480c = null;
            this.f49481d = null;
            this.f49478a = courseTestFinishSummaryType2;
            this.f49482e = z11;
            this.f49479b = 1;
            yz.f fVar = rz.o0.f50940a;
            obj = rz.e0.M(yz.e.f58387a, new ea(linkedHashMap, iIntValue, size, set, coursePracticeType, courseTestFinishSummaryType2, o0Var, mVar, this.f49484t, null), this);
            if (obj == aVar) {
                return aVar;
            }
            courseTestFinishSummaryType = courseTestFinishSummaryType2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CourseTestFinishSummaryType courseTestFinishSummaryType3 = this.f49478a;
            com.bumptech.glide.e.F(obj);
            courseTestFinishSummaryType = courseTestFinishSummaryType3;
        }
        return CourseTestFinishSummaryUiState.Success.copy$default((CourseTestFinishSummaryUiState.Success) obj, z11, 0, 0, false, null, null, null, courseTestFinishSummaryType, 126, null);
    }
}
