package qp;

import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f47907b;

    public /* synthetic */ e(j jVar, int i11) {
        this.f47906a = i11;
        this.f47907b = jVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f47906a) {
            case 0:
                j jVar = this.f47907b;
                if (jVar.f47984j != null) {
                    ta.a aVar = jVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar);
                    ViewGroup.LayoutParams layoutParams = ((hj.k1) aVar).f32810e.getLayoutParams();
                    FrameLayout frameLayout = jVar.f47984j;
                    kotlin.jvm.internal.m.c(frameLayout);
                    layoutParams.width = frameLayout.getWidth();
                    FrameLayout frameLayout2 = jVar.f47984j;
                    kotlin.jvm.internal.m.c(frameLayout2);
                    layoutParams.height = frameLayout2.getHeight();
                    ta.a aVar2 = jVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((hj.k1) aVar2).f32810e.setLayoutParams(layoutParams);
                    ta.a aVar3 = jVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ImageView imageView = ((hj.k1) aVar3).f32810e;
                    imageView.postDelayed(new b2.c(4, imageView, new e(jVar, 2)), 0L);
                }
                return qy.b0.f48488a;
            case 1:
                j jVar2 = this.f47907b;
                ta.a aVar4 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                z4.w0 w0VarB = z4.s0.b(((hj.k1) aVar4).f32809d);
                ta.a aVar5 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                w0VarB.l(-((hj.k1) aVar5).f32809d.getHeight());
                w0VarB.h(600L);
                w0VarB.e(400L);
                w0VarB.i();
                break;
            default:
                j jVar3 = this.f47907b;
                ta.a aVar6 = jVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.k1) aVar6).f32810e.setVisibility(0);
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                FrameLayout frameLayout3 = jVar3.f47984j;
                kotlin.jvm.internal.m.c(frameLayout3);
                TextView textView = (TextView) frameLayout3.findViewById(R.id.tv_middle);
                ta.a aVar7 = jVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.k1) aVar7).f32810e.getLocationOnScreen(iArr);
                FrameLayout frameLayout4 = jVar3.f47984j;
                kotlin.jvm.internal.m.c(frameLayout4);
                frameLayout4.getLocationOnScreen(iArr2);
                textView.getLocationOnScreen(new int[2]);
                int i11 = iArr2[0] - iArr[0];
                int i12 = iArr2[1] - iArr[1];
                ta.a aVar8 = jVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                z4.w0 w0VarB2 = z4.s0.b(((hj.k1) aVar8).f32810e);
                w0VarB2.k(i11);
                w0VarB2.m(i12);
                w0VarB2.e(200L);
                w0VarB2.g(new um.a());
                w0VarB2.f(new DecelerateInterpolator());
                w0VarB2.i();
                break;
        }
        return qy.b0.f48488a;
    }
}
