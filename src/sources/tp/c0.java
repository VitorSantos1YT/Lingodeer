package tp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import hj.t3;
import java.util.concurrent.TimeUnit;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f52446b;

    public /* synthetic */ c0(i0 i0Var, int i11) {
        this.f52445a = i11;
        this.f52446b = i0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f52445a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                i0 i0Var = this.f52446b;
                ta.a aVar = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                ((t3) aVar).f33329c.setVisibility(0);
                HwCharacter hwCharacterX = i0.x(((ReviewNew) i0Var.O.get(i0Var.P)).getId());
                if (hwCharacterX != null) {
                    qy.l lVarA = bq.i.a(hwCharacterX);
                    ta.a aVar2 = i0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    HwView hwView = ((t3) aVar2).f33330d;
                    hwView.postDelayed(new b2.c(4, hwView, new mt.l0(i0Var, hwCharacterX, lVarA, 26)), 0L);
                }
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(i0Var.f36398d, R.anim.flash_card_txt_enter);
                ta.a aVar3 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((t3) aVar3).f33329c.startAnimation(animationLoadAnimation);
                th.j.a(qx.h.m(500L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new m5(i0Var, 5), vx.b.f54316e), i0Var.f36401t);
                ta.a aVar4 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((t3) aVar4).f33328b.setVisibility(8);
                ta.a aVar5 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((t3) aVar5).f33331e.setVisibility(0);
                break;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                this.f52446b.A();
                break;
            case 2:
                kotlin.jvm.internal.m.f(it, "it");
                this.f52446b.B();
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                this.f52446b.C();
                break;
        }
        return qy.b0.f48488a;
    }
}
