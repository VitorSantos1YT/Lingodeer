package fr;

import com.lingodeer.data.model.DailyLearnHistory;
import com.lingodeer.data.model.DailyLearnHistoryKt;
import com.lingodeer.data.model.DailyLearnTimeHistory;
import com.lingodeer.data.model.DailyLearnTimeHistoryKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f27980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f27981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(c0 c0Var, List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27978a = i11;
        this.f27980c = c0Var;
        this.f27981d = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27978a) {
            case 0:
                return new y(this.f27980c, this.f27981d, dVar, 0);
            default:
                return new y(this.f27980c, this.f27981d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27978a) {
            case 0:
                break;
        }
        return ((y) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27978a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f27979b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.k0 k0Var = this.f27980c.f27429b;
                    List list = this.f27981d;
                    ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(DailyLearnTimeHistoryKt.asEntityModel((DailyLearnTimeHistory) it.next()));
                    }
                    this.f27979b = 1;
                    Object objB = cf.x.B(k0Var.f3036a, new au.j0(k0Var, arrayList, null, 0), this);
                    if (objB != wy.a.COROUTINE_SUSPENDED) {
                        objB = b0Var;
                    }
                    if (objB == aVar) {
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
                int i12 = this.f27979b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    au.f0 f0Var = this.f27980c.f27428a;
                    List list2 = this.f27981d;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(DailyLearnHistoryKt.asEntityModel((DailyLearnHistory) it2.next()));
                    }
                    this.f27979b = 1;
                    Object objB2 = cf.x.B(f0Var.f2988a, new au.d0(f0Var, arrayList2, null, 0), this);
                    if (objB2 != wy.a.COROUTINE_SUSPENDED) {
                        objB2 = b0Var2;
                    }
                    if (objB2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
        }
    }
}
