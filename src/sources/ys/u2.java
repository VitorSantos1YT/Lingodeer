package ys;

import com.lingodeer.data.model.CourseUiState;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f58280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.w f58281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseUiState.Success f58282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f58283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.a1 f58284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(l0.w wVar, CourseUiState.Success success, l1.b1 b1Var, l1.a1 a1Var, vy.d dVar) {
        super(2, dVar);
        this.f58281b = wVar;
        this.f58282c = success;
        this.f58283d = b1Var;
        this.f58284e = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new u2(this.f58281b, this.f58282c, this.f58283d, this.f58284e, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f58280a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            float f5 = a3.f57917a;
            l1.b1 b1Var = this.f58283d;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                b1Var.setValue(Boolean.FALSE);
                int currentEnterIndex = this.f58282c.getCurrentEnterIndex();
                int i12 = (-((l1.h1) this.f58284e).l()) / 4;
                this.f58280a = 1;
                if (this.f58281b.j(currentEnterIndex, i12, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }
}
