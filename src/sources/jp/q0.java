package jp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import bp.g2;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import hj.d3;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends BottomSheetDialogFragment {
    public long S;
    public long T;
    public final n9.q U;
    public d3 V;
    public final Object W;

    public q0() {
        LearnType learnType = LearnType.LEARN;
        this.U = new n9.q(29, false);
        this.W = com.bumptech.glide.d.u(qy.j.SYNCHRONIZED, new bj.a(this, 18));
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s(R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.compose_view, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        ComposeView composeView = (ComposeView) viewInflate;
        this.V = new d3(composeView, 0, composeView);
        return composeView;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.U.f();
        this.V = null;
    }

    @Override // androidx.fragment.app.k0
    public final void onPause() {
        super.onPause();
        if (this.T > 0) {
            int i11 = 2;
            vy.d dVar = null;
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g2(i11, 28, dVar), 3);
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (cf.x.n().hasFindPerfectTime.booleanValue()) {
                return;
            }
            rz.e0.B(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g2(i11, 29, dVar), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qy.h] */
    @Override // androidx.fragment.app.k0
    public final void onResume() {
        super.onResume();
        this.T = System.currentTimeMillis();
        ((ur.a) this.W.getValue()).d("MainCourseInLessonTips");
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onViewCreated(view, bundle);
        requireArguments().getString(INTENTS.EXTRA_STRING);
        this.S = requireArguments().getLong(INTENTS.EXTRA_LONG);
        d3 d3Var = this.V;
        kotlin.jvm.internal.m.c(d3Var);
        ComposeView composeView = (ComposeView) d3Var.f32490c;
        composeView.setViewCompositionStrategy(p1.f58646d);
        composeView.setContent(new t1.d(new ch.b0(this, 18), true, 893231317));
    }
}
