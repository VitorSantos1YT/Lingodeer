package km;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableTest;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 extends bp.m {
    public a9.i O;

    public s1() {
        super(r1.f38270a, BuildConfig.VERSION_NAME);
        LearnType learnType = LearnType.LEARN;
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroy() {
        super.onDestroy();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
            a9.i iVar2 = this.O;
            kotlin.jvm.internal.m.c(iVar2);
            iVar2.l();
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        getContext();
        this.O = new a9.i(1);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        final int i11 = 1;
        bq.z.b((TextView) ((m5) aVar).f32937b.f33394f, new fz.c(this) { // from class: km.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s1 f38266b;

            {
                this.f38266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                s1 s1Var = this.f38266b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        s1Var.requireActivity().finish();
                        int i13 = SyllableTest.Q;
                        androidx.fragment.app.p0 p0VarRequireActivity = s1Var.requireActivity();
                        kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                        s1Var.startActivity(g.a(p0VarRequireActivity, 1));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 2;
        bq.z.b((LinearLayout) ((m5) aVar2).f32937b.f33392d, new fz.c(this) { // from class: km.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s1 f38266b;

            {
                this.f38266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                s1 s1Var = this.f38266b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        s1Var.requireActivity().finish();
                        int i14 = SyllableTest.Q;
                        androidx.fragment.app.p0 p0VarRequireActivity = s1Var.requireActivity();
                        kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                        s1Var.startActivity(g.a(p0VarRequireActivity, 1));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        final int i13 = 3;
        bq.z.b(((m5) aVar3).f32937b.f33390b, new fz.c(this) { // from class: km.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s1 f38266b;

            {
                this.f38266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                s1 s1Var = this.f38266b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        s1Var.requireActivity().finish();
                        int i15 = SyllableTest.Q;
                        androidx.fragment.app.p0 p0VarRequireActivity = s1Var.requireActivity();
                        kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                        s1Var.startActivity(g.a(p0VarRequireActivity, 1));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        final int i14 = 4;
        bq.z.b((LinearLayout) ((m5) aVar4).f32937b.f33393e, new fz.c(this) { // from class: km.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s1 f38266b;

            {
                this.f38266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                qy.b0 b0Var = qy.b0.f48488a;
                s1 s1Var = this.f38266b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        s1Var.requireActivity().finish();
                        int i16 = SyllableTest.Q;
                        androidx.fragment.app.p0 p0VarRequireActivity = s1Var.requireActivity();
                        kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                        s1Var.startActivity(g.a(p0VarRequireActivity, 1));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        final int i15 = 0;
        bq.z.b(((m5) aVar5).f32939d, new fz.c(this) { // from class: km.q1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s1 f38266b;

            {
                this.f38266b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i16 = i15;
                qy.b0 b0Var = qy.b0.f48488a;
                s1 s1Var = this.f38266b;
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        s1Var.requireActivity().finish();
                        int i17 = SyllableTest.Q;
                        androidx.fragment.app.p0 p0VarRequireActivity = s1Var.requireActivity();
                        kotlin.jvm.internal.m.e(p0VarRequireActivity, "requireActivity(...)");
                        s1Var.startActivity(g.a(p0VarRequireActivity, 1));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        hh.p0.y(s1Var.O, 6L, null, null);
                        break;
                }
                return b0Var;
            }
        });
        if (oz.q.v0("release", "debug", false)) {
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((m5) aVar6).f32938c.setOnLongClickListener(new fk.c(this, 3));
        }
    }
}
