package km;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.yalantis.ucrop.view.CropImageView;
import hj.b4;
import java.util.concurrent.TimeUnit;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f38153b;

    public /* synthetic */ a(f fVar, int i11) {
        this.f38152a = i11;
        this.f38153b = fVar;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f38152a;
        f fVar = this.f38153b;
        switch (i11) {
            case 0:
                return Integer.valueOf(fVar.requireArguments().getInt(PQgum.tojBqGqhxDVWf, 0));
            default:
                ta.a aVar = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                LinearLayout linearLayout = ((b4) aVar).f32392j;
                View view = fVar.f36399e;
                kotlin.jvm.internal.m.c(view);
                float width = view.getWidth();
                ta.a aVar2 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                linearLayout.setTranslationX(width - ((b4) aVar2).f32392j.getX());
                ta.a aVar3 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((b4) aVar3).f32392j.setVisibility(0);
                ta.a aVar4 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                TextView textView = ((b4) aVar4).m;
                View view2 = fVar.f36399e;
                kotlin.jvm.internal.m.c(view2);
                float width2 = view2.getWidth();
                ta.a aVar5 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                textView.setTranslationX(width2 - ((b4) aVar5).m.getX());
                ta.a aVar6 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((b4) aVar6).m.setVisibility(0);
                ta.a aVar7 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar7);
                MaterialButton materialButton = ((b4) aVar7).f32385c;
                View view3 = fVar.f36399e;
                kotlin.jvm.internal.m.c(view3);
                float width3 = view3.getWidth();
                ta.a aVar8 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                materialButton.setTranslationX(width3 - ((b4) aVar8).f32385c.getX());
                ta.a aVar9 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                ((b4) aVar9).f32385c.setVisibility(0);
                ta.a aVar10 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                FrameLayout frameLayout = ((b4) aVar10).f32387e;
                ta.a aVar11 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                float y10 = ((b4) aVar11).f32387e.getY();
                ta.a aVar12 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar12);
                frameLayout.setPivotY(y10 + ((b4) aVar12).f32387e.getHeight());
                ta.a aVar13 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar13);
                FrameLayout frameLayout2 = ((b4) aVar13).f32387e;
                ta.a aVar14 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar14);
                float x11 = ((b4) aVar14).f32387e.getX();
                ta.a aVar15 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar15);
                frameLayout2.setPivotX(x11 + (((b4) aVar15).f32387e.getWidth() / 2));
                ta.a aVar16 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar16);
                z4.w0 w0VarB = z4.s0.b(((b4) aVar16).f32390h);
                w0VarB.a(1.0f);
                w0VarB.e(700L);
                w0VarB.i();
                ta.a aVar17 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar17);
                ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(((b4) aVar17).f32387e, PropertyValuesHolder.ofFloat("rotation", 4.0f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, CropImageView.DEFAULT_ASPECT_RATIO)).setDuration(700L);
                kotlin.jvm.internal.m.e(duration, "setDuration(...)");
                duration.setInterpolator(new DecelerateInterpolator());
                duration.start();
                ta.a aVar18 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar18);
                FrameLayout frameLayout3 = ((b4) aVar18).f32387e;
                View view4 = fVar.f36399e;
                kotlin.jvm.internal.m.c(view4);
                float width4 = view4.getWidth();
                ta.a aVar19 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar19);
                float x12 = width4 - ((b4) aVar19).f32387e.getX();
                View view5 = fVar.f36399e;
                kotlin.jvm.internal.m.c(view5);
                ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(frameLayout3, PropertyValuesHolder.ofFloat("translationX", x12, CropImageView.DEFAULT_ASPECT_RATIO, (-view5.getWidth()) / 9.0f, CropImageView.DEFAULT_ASPECT_RATIO)).setDuration(700L);
                kotlin.jvm.internal.m.e(duration2, "setDuration(...)");
                duration2.setInterpolator(new DecelerateInterpolator());
                duration2.start();
                ta.a aVar20 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar20);
                ((b4) aVar20).f32387e.setVisibility(0);
                th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new a5.f(fVar, 20), d.f38166c), fVar.f36401t);
                return qy.b0.f48488a;
        }
    }
}
