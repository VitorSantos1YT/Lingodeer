package om;

import com.lingo.lingoskill.object.JPChar;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import hj.e3;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f45603b;

    public /* synthetic */ c(e eVar, int i11) {
        this.f45602a = i11;
        this.f45603b = eVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f45602a) {
            case 0:
                e eVar = this.f45603b;
                eVar.h();
                e3 e3Var = eVar.M;
                kotlin.jvm.internal.m.c(e3Var);
                HwView hwView = (HwView) e3Var.f32524c;
                JPChar jPChar = eVar.f45607t;
                if (jPChar == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                hwView.e(jPChar.getCharPath(), eVar.K, eVar.L);
                e3 e3Var2 = eVar.M;
                kotlin.jvm.internal.m.c(e3Var2);
                ((HwView) e3Var2.f32524c).setTimeGap(50);
                e3 e3Var3 = eVar.M;
                kotlin.jvm.internal.m.c(e3Var3);
                ((HwView) e3Var3.f32524c).setShowBijiWhenWriting(false);
                e3 e3Var4 = eVar.M;
                kotlin.jvm.internal.m.c(e3Var4);
                ((HwView) e3Var4.f32524c).f();
                break;
                break;
            default:
                this.f45603b.f45605e.o();
                break;
        }
        return b0.f48488a;
    }
}
