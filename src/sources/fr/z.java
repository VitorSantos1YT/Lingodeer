package fr;

import com.lingodeer.data.model.DailyLearnHistory;
import com.lingodeer.data.model.DailyLearnHistoryKt;
import com.lingodeer.data.model.DailyLearnTimeHistory;
import com.lingodeer.data.model.DailyLearnTimeHistoryKt;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f27996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, ArrayList arrayList, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27994a = i11;
        this.f27996c = c0Var;
        this.f27997d = arrayList;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27994a) {
            case 0:
                return new z(this.f27996c, this.f27997d, dVar, 0);
            case 1:
                return new z(this.f27996c, this.f27997d, dVar, 1);
            case 2:
                return new z(this.f27996c, this.f27997d, dVar, 2);
            default:
                return new z(this.f27996c, this.f27997d, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27994a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((z) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27994a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27995b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.f0 f0Var = this.f27996c.f27428a;
                    ArrayList arrayList = this.f27997d;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        arrayList2.add(DailyLearnHistoryKt.asEntityModel((DailyLearnHistory) obj2));
                    }
                    this.f27995b = 1;
                    Object objC = cf.x.C(this, f0Var.f2988a, false, true, new au.b(6, f0Var, arrayList2));
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
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f27995b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.k0 k0Var = this.f27996c.f27429b;
                    ArrayList arrayList3 = this.f27997d;
                    ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                    int size2 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj3 = arrayList3.get(i14);
                        i14++;
                        arrayList4.add(DailyLearnTimeHistoryKt.asEntityModel((DailyLearnTimeHistory) obj3));
                    }
                    this.f27995b = 1;
                    Object objC2 = cf.x.C(this, k0Var.f3036a, false, true, new au.b(8, k0Var, arrayList4));
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
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f27995b;
                qy.b0 b0Var3 = qy.b0.f48488a;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.k0 k0Var2 = this.f27996c.f27429b;
                    ArrayList arrayList5 = this.f27997d;
                    ArrayList arrayList6 = new ArrayList(ry.n.W(arrayList5, 10));
                    int size3 = arrayList5.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj4 = arrayList5.get(i16);
                        i16++;
                        arrayList6.add(DailyLearnTimeHistoryKt.asEntityModel((DailyLearnTimeHistory) obj4));
                    }
                    this.f27995b = 1;
                    Object objB = cf.x.B(k0Var2.f3036a, new au.j0(k0Var2, arrayList6, null, 1), this);
                    if (objB != wy.a.COROUTINE_SUSPENDED) {
                        objB = b0Var3;
                    }
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var3;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f27995b;
                qy.b0 b0Var4 = qy.b0.f48488a;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.f0 f0Var2 = this.f27996c.f27428a;
                    ArrayList arrayList7 = this.f27997d;
                    ArrayList arrayList8 = new ArrayList(ry.n.W(arrayList7, 10));
                    int size4 = arrayList7.size();
                    int i18 = 0;
                    while (i18 < size4) {
                        Object obj5 = arrayList7.get(i18);
                        i18++;
                        arrayList8.add(DailyLearnHistoryKt.asEntityModel((DailyLearnHistory) obj5));
                    }
                    this.f27995b = 1;
                    Object objB2 = cf.x.B(f0Var2.f2988a, new au.d0(f0Var2, arrayList8, null, 1), this);
                    if (objB2 != wy.a.COROUTINE_SUSPENDED) {
                        objB2 = b0Var4;
                    }
                    if (objB2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var4;
        }
    }
}
