package vt;

import com.lingodeer.data.model.SubLearnProgress;
import com.lingodeer.database.model.SubLearnProgressEntity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d1 f54190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(d1 d1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f54188a = i11;
        this.f54190c = d1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f54188a) {
            case 0:
                return new c1(this.f54190c, dVar, 0);
            default:
                return new c1(this.f54190c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f54188a) {
            case 0:
                break;
        }
        return ((c1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [wy.a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f54188a) {
            case 0:
                Object arrayList = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f54189b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.e1 e1Var = this.f54190c.f54216a;
                    this.f54189b = 1;
                    obj = cf.x.C(this, e1Var.f2984a, true, false, new au.a(22));
                    if (obj != arrayList) {
                    }
                    return arrayList;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                Iterable<SubLearnProgressEntity> iterable = (Iterable) obj;
                arrayList = new ArrayList(ry.n.W(iterable, 10));
                for (SubLearnProgressEntity subLearnProgressEntity : iterable) {
                    kotlin.jvm.internal.m.f(subLearnProgressEntity, "<this>");
                    arrayList.add(new SubLearnProgress(subLearnProgressEntity.getId(), subLearnProgressEntity.getProgress(), subLearnProgressEntity.getTime()));
                }
                return arrayList;
            default:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f54189b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.e1 e1Var2 = this.f54190c.f54216a;
                    this.f54189b = 1;
                    obj = cf.x.C(this, e1Var2.f2984a, true, false, new au.f("cn_tone", 22));
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                SubLearnProgressEntity subLearnProgressEntity2 = (SubLearnProgressEntity) obj;
                if (subLearnProgressEntity2 != null) {
                    return new SubLearnProgress(subLearnProgressEntity2.getId(), subLearnProgressEntity2.getProgress(), subLearnProgressEntity2.getTime());
                }
                return null;
        }
    }
}
