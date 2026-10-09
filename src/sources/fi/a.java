package fi;

import com.lingo.lingoskill.object.HwCharacter;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import hj.e3;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f27295b;

    public /* synthetic */ a(d dVar, int i11) {
        this.f27294a = i11;
        this.f27295b = dVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f27294a) {
            case 0:
                d dVar = this.f27295b;
                dVar.h();
                e3 e3Var = dVar.M;
                m.c(e3Var);
                HwView hwView = (HwView) e3Var.f32524c;
                HwCharacter hwCharacter = dVar.f27300f;
                if (hwCharacter == null) {
                    m.n("mHwCharacter");
                    throw null;
                }
                hwView.e(hwCharacter.getCharPath(), dVar.K, dVar.L);
                e3 e3Var2 = dVar.M;
                m.c(e3Var2);
                ((HwView) e3Var2.f32524c).setTimeGap(100);
                e3 e3Var3 = dVar.M;
                m.c(e3Var3);
                ((HwView) e3Var3.f32524c).setShowBijiWhenWriting(true);
                e3 e3Var4 = dVar.M;
                m.c(e3Var4);
                ((HwView) e3Var4.f32524c).f();
                break;
                break;
            default:
                this.f27295b.f27299e.o();
                break;
        }
        return b0.f48488a;
    }
}
