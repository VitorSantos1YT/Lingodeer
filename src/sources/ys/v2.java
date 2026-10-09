package ys;

import com.lingodeer.data.model.CourseUiState;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.UnitState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CourseUiState.Success f58295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f58296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b3 f58297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(CourseUiState.Success success, fz.c cVar, l1.b3 b3Var, vy.d dVar) {
        super(2, dVar);
        this.f58295a = success;
        this.f58296b = cVar;
        this.f58297c = b3Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new v2(this.f58295a, this.f58296b, this.f58297c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        v2 v2Var = (v2) create((rz.b0) obj, (vy.d) obj2);
        qy.b0 b0Var = qy.b0.f48488a;
        v2Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        float f5 = a3.f57917a;
        l1.b3 b3Var = this.f58297c;
        int iIntValue = ((Number) b3Var.getValue()).intValue();
        CourseUiState.Success success = this.f58295a;
        if (iIntValue < success.getCourseUnits().size()) {
            CourseUnit courseUnit = success.getCourseUnits().get(((Number) b3Var.getValue()).intValue());
            if (courseUnit.getUnitState() != UnitState.StateLocked) {
                this.f58296b.invoke(courseUnit.getActiveTopBannerRes());
            }
        }
        return qy.b0.f48488a;
    }
}
