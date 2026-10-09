package bt;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jt.s0 f6217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CourseWord f6219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y4(jt.s0 s0Var, int i11, CourseWord courseWord, vy.d dVar, int i12) {
        super(2, dVar);
        this.f6216a = i12;
        this.f6217b = s0Var;
        this.f6218c = i11;
        this.f6219d = courseWord;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6216a) {
            case 0:
                return new y4(this.f6217b, this.f6219d, dVar);
            case 1:
                return new y4(this.f6217b, this.f6218c, this.f6219d, dVar, 1);
            default:
                return new y4(this.f6217b, this.f6218c, this.f6219d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6216a) {
            case 0:
                return ((y4) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 1:
                y4 y4Var = (y4) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                y4Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                y4 y4Var2 = (y4) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                y4Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f6216a;
        CourseWord courseWord = this.f6219d;
        qy.b0 b0Var = qy.b0.f48488a;
        jt.s0 s0Var = this.f6217b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f6218c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f6218c = 1;
                    return s0Var.b(courseWord, this) == aVar ? aVar : b0Var;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                s0Var.f37172p.remove(this.f6218c);
                l1.b1 b1Var = s0Var.f37173q;
                Iterable<CourseWord> iterable = (Iterable) b1Var.getValue();
                ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                for (CourseWord courseWordCopy$default : iterable) {
                    if (kotlin.jvm.internal.m.a(courseWordCopy$default, courseWord)) {
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                    }
                    arrayList.add(courseWordCopy$default);
                }
                b1Var.setValue(arrayList);
                s0Var.f37167j.setValue(!s0Var.f37172p.isEmpty() ? ht.q.SELECTED : ht.q.DEFAULT);
                return b0Var;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                x1.p pVar = s0Var.f37172p;
                int i13 = this.f6218c;
                pVar.remove(i13);
                s0Var.f37172p.add(i13, CourseWord.copy$default(this.f6219d, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null));
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(jt.s0 s0Var, CourseWord courseWord, vy.d dVar) {
        super(2, dVar);
        this.f6216a = 0;
        this.f6217b = s0Var;
        this.f6219d = courseWord;
    }
}
