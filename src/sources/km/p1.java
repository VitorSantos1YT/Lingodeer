package km;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.l5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends bp.m {
    public a9.i O;

    public p1() {
        super(o1.f38256a, BuildConfig.VERSION_NAME);
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
        final int i11 = 0;
        bq.z.b(((l5) aVar).f32864b.f32356b, new fz.c(this) { // from class: km.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f38247b;

            {
                this.f38247b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i12 = i11;
                qy.b0 b0Var = qy.b0.f48488a;
                p1 p1Var = this.f38247b;
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        final int i12 = 1;
        bq.z.b((LinearLayout) ((l5) aVar2).f32864b.f32358d, new fz.c(this) { // from class: km.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f38247b;

            {
                this.f38247b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i13 = i12;
                qy.b0 b0Var = qy.b0.f48488a;
                p1 p1Var = this.f38247b;
                View it = (View) obj;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        final int i13 = 2;
        bq.z.b((TextView) ((l5) aVar3).f32864b.f32362h, new fz.c(this) { // from class: km.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f38247b;

            {
                this.f38247b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i14 = i13;
                qy.b0 b0Var = qy.b0.f48488a;
                p1 p1Var = this.f38247b;
                View it = (View) obj;
                switch (i14) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        final int i14 = 3;
        bq.z.b((LinearLayout) ((l5) aVar4).f32864b.f32360f, new fz.c(this) { // from class: km.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f38247b;

            {
                this.f38247b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                qy.b0 b0Var = qy.b0.f48488a;
                p1 p1Var = this.f38247b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        final int i15 = 4;
        bq.z.b((TextView) ((l5) aVar5).f32864b.f32361g, new fz.c(this) { // from class: km.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f38247b;

            {
                this.f38247b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i16 = i15;
                qy.b0 b0Var = qy.b0.f48488a;
                p1 p1Var = this.f38247b;
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        final int i16 = 5;
        bq.z.b((LinearLayout) ((l5) aVar6).f32864b.f32359e, new fz.c(this) { // from class: km.n1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p1 f38247b;

            {
                this.f38247b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i17 = i16;
                qy.b0 b0Var = qy.b0.f48488a;
                p1 p1Var = this.f38247b;
                View it = (View) obj;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar);
                        qy.q qVar = fv.b.f28186a;
                        iVar.v(fv.b.c("a", null, null));
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        qy.q qVar2 = fv.b.f28186a;
                        iVar2.v(fv.b.c("a", null, null));
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        qy.q qVar3 = fv.b.f28186a;
                        iVar3.v(fv.b.c("a", null, null));
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        qy.q qVar4 = fv.b.f28186a;
                        iVar4.v(fv.b.c("a", null, null));
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        qy.q qVar5 = fv.b.f28186a;
                        iVar5.v(fv.b.c("a", null, null));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = p1Var.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        qy.q qVar6 = fv.b.f28186a;
                        iVar6.v(fv.b.c("a", null, null));
                        break;
                }
                return b0Var;
            }
        });
        if (oz.q.v0("release", "debug", false)) {
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((l5) aVar7).f32865c.setOnLongClickListener(new fk.c(this, 2));
        }
    }
}
