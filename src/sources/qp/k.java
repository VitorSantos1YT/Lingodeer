package qp;

import android.view.View;
import com.lingo.lingoskill.object.Word;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f48005b;

    public /* synthetic */ k(n nVar, int i11) {
        this.f48004a = i11;
        this.f48005b = nVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f48004a) {
            case 0:
                n nVar = this.f48005b;
                nVar.r();
                ta.a aVar = nVar.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                int childCount = ((hj.l1) aVar).f32839d.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    ta.a aVar2 = nVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    View childAt = ((hj.l1) aVar2).f32839d.getChildAt(i11);
                    Object tag = childAt.getTag();
                    kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                    nVar.s(childAt, (Word) tag);
                    childAt.requestLayout();
                }
                ta.a aVar3 = nVar.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ((hj.l1) aVar3).f32839d.requestLayout();
                break;
            default:
                this.f48005b.r();
                break;
        }
        return qy.b0.f48488a;
    }
}
