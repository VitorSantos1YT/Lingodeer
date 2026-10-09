package bh;

import com.lingodeer.data.model.CourseLessonFinishStatus;
import com.lingodeer.data.model.CourseLessonFinishStatusKt;
import com.lingodeer.data.model.CourseUnitFinishStatus;
import com.lingodeer.data.model.CourseUnitFinishStatusKt;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f4213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4214d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(a1 a1Var, ArrayList arrayList, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4211a = i11;
        this.f4213c = a1Var;
        this.f4214d = arrayList;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4211a) {
            case 0:
                return new g0(this.f4213c, this.f4214d, dVar, 0);
            default:
                return new g0(this.f4213c, this.f4214d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4211a) {
            case 0:
                break;
        }
        return ((g0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4211a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4212b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.u0 u0Var = this.f4213c.f4150d;
                    ArrayList arrayList = this.f4214d;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        arrayList2.add(CourseLessonFinishStatusKt.asEntity((CourseLessonFinishStatus) obj2));
                    }
                    this.f4212b = 1;
                    Object objC = cf.x.C(this, u0Var.f3075a, false, true, new au.b(23, u0Var, arrayList2));
                    if (objC != wy.a.COROUTINE_SUSPENDED) {
                        objC = b0Var;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4212b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.f1 f1Var = this.f4213c.f4148b;
                    ArrayList arrayList3 = this.f4214d;
                    ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                    int size2 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj3 = arrayList3.get(i14);
                        i14++;
                        arrayList4.add(CourseUnitFinishStatusKt.asEntityModel((CourseUnitFinishStatus) obj3));
                    }
                    this.f4212b = 1;
                    Object objC2 = cf.x.C(this, f1Var.f2991a, false, true, new au.d1(3, f1Var, arrayList4));
                    if (objC2 != wy.a.COROUTINE_SUSPENDED) {
                        objC2 = b0Var2;
                    }
                    if (objC2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
        }
    }
}
