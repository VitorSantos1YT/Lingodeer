package bp;

import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.lingoskill.ui.review.FlashCardFinishActivity;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f4788b;

    public /* synthetic */ r0(int i11, fz.a aVar) {
        this.f4787a = i11;
        this.f4788b = aVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f4787a;
        qy.b0 b0Var = qy.b0.f48488a;
        fz.a aVar = this.f4788b;
        switch (i11) {
            case 0:
                aVar.invoke();
                return b0Var;
            case 1:
                aVar.invoke();
                return b0Var;
            case 2:
                return (f2.b) aVar.invoke();
            case 3:
                g3.b0 semantics = (g3.b0) obj;
                kotlin.jvm.internal.m.f(semantics, "$this$semantics");
                g3.z.c(semantics, new g3.j(((Number) aVar.invoke()).floatValue(), new lz.d(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), 0));
                return b0Var;
            case 4:
                aVar.invoke();
                return b0Var;
            case 5:
                aVar.invoke();
                return b0Var;
            case 6:
                km.f it = (km.f) obj;
                int i12 = PdFinishActivity.H;
                kotlin.jvm.internal.m.f(it, "it");
                it.P = new hh.i(0, aVar);
                return b0Var;
            case 7:
                aVar.invoke();
                return b0Var;
            case 8:
                l1.j0 DisposableEffect = (l1.j0) obj;
                kotlin.jvm.internal.m.f(DisposableEffect, "$this$DisposableEffect");
                return new bt.j1(aVar, 5);
            case 9:
                km.f it2 = (km.f) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                it2.P = new hh.i(1, aVar);
                return b0Var;
            case 10:
                ((Boolean) obj).booleanValue();
                aVar.invoke();
                return b0Var;
            case 11:
                ((Boolean) obj).booleanValue();
                aVar.invoke();
                return b0Var;
            case 12:
                ((Boolean) obj).booleanValue();
                aVar.invoke();
                return b0Var;
            case 13:
                km.f it3 = (km.f) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                it3.P = new sm.b(0, aVar);
                return b0Var;
            case 14:
                tp.x it4 = (tp.x) obj;
                int i13 = FlashCardFinishActivity.K;
                kotlin.jvm.internal.m.f(it4, "it");
                it4.U = new hh.i(2, aVar);
                return b0Var;
            case 15:
                km.f it5 = (km.f) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                it5.P = new sm.b(1, aVar);
                return b0Var;
            case 16:
                ((Boolean) obj).booleanValue();
                aVar.invoke();
                return b0Var;
            default:
                kotlin.jvm.internal.m.f((ja.a) obj, "it");
                return aVar.invoke();
        }
    }
}
