package jp;

import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yalantis.ucrop.view.CropImageView;
import hj.x3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f36519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36520d = ff.h.l(2.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0 f36521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f36522f;

    public o0(p0 p0Var, float f5) {
        this.f36521e = p0Var;
        this.f36522f = f5;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent event) {
        kotlin.jvm.internal.m.f(view, "view");
        kotlin.jvm.internal.m.f(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.f36517a = System.currentTimeMillis();
            this.f36519c = event.getRawY();
            this.f36518b = true;
            return true;
        }
        p0 p0Var = this.f36521e;
        if (action == 1) {
            if (System.currentTimeMillis() - this.f36517a < 300) {
                ta.a aVar = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar);
                if (((x3) aVar).f33576i.f32668g.getAlpha() == 1.0f) {
                    p0Var.K();
                }
            }
            if (this.f36518b) {
                ta.a aVar2 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar2);
                ((x3) aVar2).f33576i.f32668g.setAlpha(1.0f);
                ta.a aVar3 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                ((x3) aVar3).f33569b.setAlpha(1.0f);
                this.f36518b = false;
                return true;
            }
        } else if (action == 2 && this.f36518b) {
            float rawY = event.getRawY() - this.f36519c;
            if (Math.abs(rawY) >= this.f36520d) {
                ta.a aVar4 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ((x3) aVar4).f33576i.f32668g.setAlpha(0.5f);
                ta.a aVar5 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar5);
                ((x3) aVar5).f33569b.setAlpha(0.5f);
                this.f36519c = event.getRawY();
                ta.a aVar6 = p0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                if (((x3) aVar6).f33576i.f32668g.getY() + rawY >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    ta.a aVar7 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar7);
                    float y10 = ((x3) aVar7).f33576i.f32668g.getY() + rawY;
                    View view2 = p0Var.f36399e;
                    kotlin.jvm.internal.m.c(view2);
                    int height = view2.getHeight();
                    ta.a aVar8 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar8);
                    if (y10 <= height - ((x3) aVar8).f33576i.f32668g.getHeight()) {
                        ta.a aVar9 = p0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar9);
                        ConstraintLayout constraintLayout = ((x3) aVar9).f33576i.f32668g;
                        ta.a aVar10 = p0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar10);
                        constraintLayout.setY(((x3) aVar10).f33576i.f32668g.getY() + rawY);
                        ta.a aVar11 = p0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar11);
                        LottieAnimationView lottieAnimationView = ((x3) aVar11).f33569b;
                        ta.a aVar12 = p0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar12);
                        lottieAnimationView.setY(((x3) aVar12).f33569b.getY() + rawY);
                        return true;
                    }
                }
                if (rawY > CropImageView.DEFAULT_ASPECT_RATIO) {
                    ta.a aVar13 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar13);
                    float y11 = ((x3) aVar13).f33576i.f32668g.getY() + rawY;
                    ta.a aVar14 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar14);
                    float height2 = y11 + ((x3) aVar14).f33576i.f32668g.getHeight();
                    View view3 = p0Var.f36399e;
                    kotlin.jvm.internal.m.c(view3);
                    if (height2 >= view3.getHeight()) {
                        ta.a aVar15 = p0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar15);
                        ConstraintLayout constraintLayout2 = ((x3) aVar15).f33576i.f32668g;
                        View view4 = p0Var.f36399e;
                        kotlin.jvm.internal.m.c(view4);
                        int height3 = view4.getHeight();
                        ta.a aVar16 = p0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar16);
                        constraintLayout2.setY(height3 - ((x3) aVar16).f33576i.f32668g.getHeight());
                        ta.a aVar17 = p0Var.f36400f;
                        kotlin.jvm.internal.m.c(aVar17);
                        ((x3) aVar17).f33569b.setY(this.f36522f);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
