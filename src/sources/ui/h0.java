package ui;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import com.youth.banner.config.BannerConfig;
import hj.u4;
import rt.m9;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends ji.e {
    public int N;

    public h0() {
        super(g0.f52988a, BuildConfig.VERSION_NAME);
    }

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(INTENTS.EXTRA_INT, this.N);
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        t().c("jxz_alphabet_finish_exam", new m9(26));
        int i11 = requireArguments().getInt(INTENTS.EXTRA_INT);
        String string = requireArguments().getString(INTENTS.EXTRA_STRING);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((u4) aVar).f33399e.setText(String.valueOf(i11));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        TextView textView = ((u4) aVar2).f33400f;
        kotlin.jvm.internal.m.c(string);
        textView.setText(string.concat("%"));
        if (bundle == null) {
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new sr.d(this, null, 7), 3);
        } else {
            this.N = bundle.getInt(INTENTS.EXTRA_INT);
            x();
        }
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((ImageView) ((u4) aVar3).f33397c.f33392d).setScaleX(0.5f);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((ImageView) ((u4) aVar4).f33397c.f33392d).setScaleY(0.5f);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((ImageView) ((u4) aVar5).f33397c.f33392d).setAlpha(0.5f);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((ImageView) ((u4) aVar6).f33397c.f33393e).setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((ImageView) ((u4) aVar7).f33397c.f33393e).setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) ((u4) aVar8).f33397c.f33394f, "rotation", CropImageView.DEFAULT_ASPECT_RATIO, 360.0f);
        objectAnimatorOfFloat.setDuration(BannerConfig.LOOP_TIME);
        objectAnimatorOfFloat.setRepeatMode(1);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        w0 w0VarB = s0.b((ImageView) ((u4) aVar9).f33397c.f33392d);
        w0VarB.c(1.0f);
        w0VarB.d(1.0f);
        w0VarB.a(1.0f);
        w0VarB.e(1200L);
        w0VarB.f(new BounceInterpolator());
        w0VarB.i();
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        w0 w0VarB2 = s0.b((ImageView) ((u4) aVar10).f33397c.f33393e);
        w0VarB2.c(1.0f);
        w0VarB2.d(1.0f);
        w0VarB2.e(1200L);
        w0VarB2.f(new BounceInterpolator());
        w0VarB2.i();
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        bq.z.b(((u4) aVar11).f33396b, new s0.a(this, 13));
    }

    public final void x() {
        String string = getString(R.string._plus_s_xp, String.valueOf(this.N));
        kotlin.jvm.internal.m.e(string, "getString(...)");
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((u4) aVar).f33397c.f33390b.setText(string);
    }
}
