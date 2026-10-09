package rt;

import com.lingodeer.data.model.CourseUnit;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class tb extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ uz.j f50439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f50440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt.m f50441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CourseUnit f50442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(vy.d dVar, wt.m mVar, CourseUnit courseUnit, int i11) {
        super(3, dVar);
        this.f50437a = i11;
        this.f50441e = mVar;
        this.f50442f = courseUnit;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uz.j jVar = (uz.j) obj;
        vy.d dVar = (vy.d) obj3;
        switch (this.f50437a) {
            case 0:
                tb tbVar = new tb(dVar, this.f50441e, this.f50442f, 0);
                tbVar.f50439c = jVar;
                tbVar.f50440d = obj2;
                return tbVar.invokeSuspend(qy.b0.f48488a);
            default:
                tb tbVar2 = new tb(dVar, this.f50441e, this.f50442f, 1);
                tbVar2.f50439c = jVar;
                tbVar2.f50440d = obj2;
                return tbVar2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50437a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50438b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.j jVar = this.f50439c;
                    CourseUnit courseUnit = this.f50442f;
                    kotlin.jvm.internal.m.f(courseUnit, "courseUnit");
                    wt.m mVar = this.f50441e;
                    vz.i iVarB = uz.x0.B(new gp.r(new jt.m(courseUnit, mVar, null)), new tb(null, mVar, courseUnit, 1));
                    this.f50439c = null;
                    this.f50440d = null;
                    this.f50438b = 1;
                    if (uz.x0.q(jVar, iVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f50438b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    uz.j jVar2 = this.f50439c;
                    gp.r rVar = new gp.r(new wt.e(this.f50441e, this.f50442f, (List) this.f50440d, null));
                    this.f50439c = null;
                    this.f50440d = null;
                    this.f50438b = 1;
                    if (uz.x0.q(jVar2, rVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
