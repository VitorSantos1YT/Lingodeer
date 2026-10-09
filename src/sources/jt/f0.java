package jt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av.j0 f36922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f36923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f36924d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(av.j0 j0Var, CourseSentence courseSentence, v vVar, vy.d dVar) {
        super(2, dVar);
        this.f36922b = j0Var;
        this.f36923c = courseSentence;
        this.f36924d = vVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new f0(this.f36922b, this.f36923c, this.f36924d, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f36921a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            String recordPath = this.f36923c.getRecordPath();
            et.x xVar = new et.x(this.f36924d, 1);
            this.f36921a = 1;
            if (this.f36922b.e(recordPath, xVar, this) == aVar) {
                return aVar;
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
