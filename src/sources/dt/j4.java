package dt;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.viewpager.widget.ViewPager;
import com.lingo.lingoskill.japanskill.ui.syllable.SyllableIntroductionActivity;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingodeer.data.model.INTENTS;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Collection;
import java.util.List;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j4 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23919c;

    public /* synthetic */ j4(int i11, Collection collection) {
        this.f23917a = 6;
        this.f23918b = i11;
        this.f23919c = collection;
    }

    public /* synthetic */ j4(Object obj, int i11, int i12) {
        this.f23917a = i12;
        this.f23919c = obj;
        this.f23918b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f23917a;
        Object[] objArr = 0;
        int i12 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f23919c;
        int i13 = this.f23918b;
        switch (i11) {
            case 0:
                w2.f1 f1Var = (w2.f1) obj;
                kotlin.jvm.internal.m.f(f1Var, ealNNtLp.eUiLJkulVfSZoy);
                f1Var.f((w2.g1) obj2, 0, -i13, CropImageView.DEFAULT_ASPECT_RATIO);
                return b0Var;
            case 1:
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                a9.i iVar = ((km.f1) obj2).O;
                kotlin.jvm.internal.m.c(iVar);
                iVar.v(fv.b.Y(i13, null, null));
                return b0Var;
            case 2:
                ViewPager viewPager = (ViewPager) obj2;
                View it2 = (View) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                Context context = viewPager.getContext();
                int i14 = SyllableIntroductionActivity.T;
                Context context2 = viewPager.getContext();
                kotlin.jvm.internal.m.e(context2, "getContext(...)");
                Intent intent = new Intent(context2, (Class<?>) SyllableIntroductionActivity.class);
                intent.putExtra(INTENTS.EXTRA_INT, i13 + 1);
                context.startActivity(intent);
                return b0Var;
            case 3:
                n0.j0 j0Var = (n0.j0) obj;
                l0.a aVar = ((m0.x) obj2).f40650a;
                x1.f fVarN = re.q.n();
                re.q.t(fVarN, re.q.r(fVarN), fVarN != null ? fVarN.e() : null);
                aVar.getClass();
                int i15 = j0Var.f42961a;
                if (i15 == -1) {
                    i15 = 2;
                }
                for (int i16 = 0; i16 < i15; i16++) {
                    j0Var.a(i13 + i16);
                }
                return b0Var;
            case 4:
                tp.o oVar = (tp.o) obj2;
                View it3 = (View) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                int i17 = i13 - 1;
                int i18 = oVar.P;
                if (i18 >= 0 && i18 < oVar.O.size()) {
                    ReviewNew review = (ReviewNew) oVar.O.get(oVar.P);
                    vp.d dVar = (vp.d) oVar.f52485d0.getValue();
                    dVar.getClass();
                    kotlin.jvm.internal.m.f(review, "review");
                    rz.e0.B(ViewModelKt.getViewModelScope(dVar), null, null, new bp.t3(review, dVar, i17, (vy.d) null, 19), 3);
                    if (i17 == -1) {
                        oVar.X++;
                    } else if (i17 == 0) {
                        oVar.Y++;
                    } else if (i17 == 1) {
                        oVar.Z++;
                    }
                    ta.a aVar2 = oVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((hj.v) aVar2).f33442r.setText(String.valueOf(oVar.X));
                    ta.a aVar3 = oVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((hj.v) aVar3).f33443s.setText(String.valueOf(oVar.Y));
                    ta.a aVar4 = oVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((hj.v) aVar4).f33444t.setText(String.valueOf(oVar.Z));
                    ta.a aVar5 = oVar.f36400f;
                    kotlin.jvm.internal.m.c(aVar5);
                    ((hj.v) aVar5).f33441q.setText(String.valueOf(oVar.W - (oVar.P + 1)));
                }
                oVar.D();
                return b0Var;
            case 5:
                tp.i0 i0Var = (tp.i0) obj2;
                int i19 = i13 - 1;
                int i21 = i0Var.P;
                if (i21 >= 0 && i21 < i0Var.O.size()) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(i0Var), null, null, new tp.g0(i0Var, i19, objArr == true ? 1 : 0, i12), 3);
                    if (i19 == -1) {
                        i0Var.R++;
                    } else if (i19 == 0) {
                        i0Var.S++;
                    } else if (i19 == 1) {
                        i0Var.T++;
                    }
                    ta.a aVar6 = i0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    ((hj.t3) aVar6).f33336j.setText(String.valueOf(i0Var.R));
                    ta.a aVar7 = i0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ((hj.t3) aVar7).f33337k.setText(String.valueOf(i0Var.S));
                    ta.a aVar8 = i0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar8);
                    ((hj.t3) aVar8).f33338l.setText(String.valueOf(i0Var.T));
                    ta.a aVar9 = i0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((hj.t3) aVar9).f33335i.setText(String.valueOf(i0Var.Q - (i0Var.P + 1)));
                }
                i0Var.z();
                return b0Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i13, (Collection) obj2));
        }
    }
}
