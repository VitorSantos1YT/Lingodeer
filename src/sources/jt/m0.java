package jt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f37046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f37047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(s0 s0Var, ArrayList arrayList, vy.d dVar, int i11) {
        super(2, dVar);
        this.f37045a = i11;
        this.f37046b = s0Var;
        this.f37047c = arrayList;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37045a) {
            case 0:
                return new m0(this.f37046b, this.f37047c, dVar, 0);
            default:
                return new m0(this.f37046b, this.f37047c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f37045a) {
            case 0:
                m0 m0Var = (m0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                m0Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                m0 m0Var2 = (m0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                m0Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f37045a;
        qy.b0 b0Var = qy.b0.f48488a;
        ArrayList arrayList = this.f37047c;
        s0 s0Var = this.f37046b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                s0Var.f37172p.clear();
                s0Var.f37172p.addAll(arrayList);
                l1.b1 b1Var = s0Var.f37174r;
                List list = s0Var.f37161d;
                ArrayList arrayList2 = new ArrayList(ry.n.W(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(CourseWord.copy$default((CourseWord) it.next(), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null));
                }
                b1Var.setValue(arrayList2);
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                s0Var.f37173q.setValue(arrayList);
                break;
        }
        return b0Var;
    }
}
