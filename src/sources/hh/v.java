package hh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.fluent.ui.base.adapter.PdLearnDetailAdapter;
import com.lingo.lingoskill.object.PdLesson;
import com.lingodeer.R;
import hj.i4;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f32301b;

    public /* synthetic */ v(c0 c0Var, int i11) {
        this.f32300a = i11;
        this.f32301b = c0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        int i11 = this.f32300a;
        int i12 = 1;
        int i13 = 0;
        vy.d dVar = null;
        int i14 = 3;
        qy.b0 b0Var = qy.b0.f48488a;
        c0 c0Var = this.f32301b;
        View it = (View) obj;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                c0Var.requireActivity().finish();
                return b0Var;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                List list = uh.a.f52967a;
                Long[] lArrN = c.a.n();
                PdLesson pdLesson = c0Var.O;
                if (pdLesson != null) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(c0Var), null, null, new z(c0Var, ry.l.D(lArrN, pdLesson.getLessonId()), dVar, i13), 3);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            case 2:
                kotlin.jvm.internal.m.f(it, "it");
                List list2 = uh.a.f52967a;
                Long[] lArrN2 = c.a.n();
                PdLesson pdLesson2 = c0Var.O;
                if (pdLesson2 != null) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(c0Var), null, null, new z(c0Var, ry.l.D(lArrN2, pdLesson2.getLessonId()), dVar, i12), 3);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            case 3:
                kotlin.jvm.internal.m.f(it, "it");
                AtomicBoolean atomicBoolean = new AtomicBoolean(!c0Var.U.get());
                c0Var.U = atomicBoolean;
                boolean z11 = atomicBoolean.get();
                PdLearnDetailAdapter pdLearnDetailAdapter = c0Var.P;
                if (pdLearnDetailAdapter != null && (arrayList = pdLearnDetailAdapter.m) != null) {
                    int size = arrayList.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList.get(i15);
                        i15++;
                        TextView textView = (TextView) obj2;
                        if (z11) {
                            textView.setVisibility(0);
                        } else {
                            textView.setVisibility(8);
                        }
                    }
                }
                if (c0Var.U.get()) {
                    ta.a aVar = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((i4) aVar).m.setImageResource(R.drawable.pd_learn_listen_trans_active);
                } else {
                    ta.a aVar2 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((i4) aVar2).m.setImageResource(R.drawable.pd_learn_listen_trans_grey);
                }
                b7.e0.A(c0Var.t(), "jxz_fl_listen_click_trans");
                return b0Var;
            case 4:
                kotlin.jvm.internal.m.f(it, "it");
                c0.y(c0Var);
                return b0Var;
            case 5:
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar3 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                if (((i4) aVar3).f32707e.getVisibility() == 0) {
                    ta.a aVar4 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    ((i4) aVar4).f32707e.setVisibility(8);
                    ta.a aVar5 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar5);
                    com.bumptech.glide.e.m(((i4) aVar5).f32706d);
                } else {
                    c0Var.x();
                    ta.a aVar6 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar6);
                    ((i4) aVar6).f32707e.setVisibility(0);
                    bq.f fVar = new bq.f(c0Var.requireContext());
                    fVar.f4943a = true;
                    ta.a aVar7 = c0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar7);
                    fVar.l(((i4) aVar7).f32706d);
                    b7.e0.A(c0Var.t(), "jxz_fl_listen_click_keypoint");
                }
                return b0Var;
            case 6:
                kotlin.jvm.internal.m.f(it, "it");
                List list3 = uh.a.f52967a;
                Long[] lArrN3 = c.a.n();
                PdLesson pdLesson3 = c0Var.O;
                if (pdLesson3 != null) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(c0Var), null, null, new z(c0Var, ry.l.D(lArrN3, pdLesson3.getLessonId()), dVar, i14), 3);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            case 7:
                kotlin.jvm.internal.m.f(it, "it");
                List list4 = uh.a.f52967a;
                Long[] lArrN4 = c.a.n();
                PdLesson pdLesson4 = c0Var.O;
                if (pdLesson4 != null) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(c0Var), null, null, new z(c0Var, ry.l.D(lArrN4, pdLesson4.getLessonId()), dVar, 4), 3);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            case 8:
                kotlin.jvm.internal.m.f(it, "it");
                List list5 = uh.a.f52967a;
                Long[] lArrN5 = c.a.n();
                PdLesson pdLesson5 = c0Var.O;
                if (pdLesson5 != null) {
                    rz.e0.B(LifecycleOwnerKt.getLifecycleScope(c0Var), null, null, new z(c0Var, ry.l.D(lArrN5, pdLesson5.getLessonId()), dVar, 2), 3);
                    return b0Var;
                }
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            case 9:
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar8 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar8);
                ((i4) aVar8).f32707e.setVisibility(8);
                ta.a aVar9 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar9);
                com.bumptech.glide.e.m(((i4) aVar9).f32706d);
                return b0Var;
            case 10:
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar10 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar10);
                ((i4) aVar10).f32707e.setVisibility(8);
                ta.a aVar11 = c0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar11);
                com.bumptech.glide.e.m(((i4) aVar11).f32706d);
                return b0Var;
            case 11:
                kotlin.jvm.internal.m.f(it, "it");
                c0Var.requireActivity().finish();
                if (!c0Var.f32216d0) {
                    int i16 = PdFinishActivity.H;
                    Context contextRequireContext = c0Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    c0Var.startActivity(md.a.q(contextRequireContext, "FLUENT_READING"));
                }
                return b0Var;
            default:
                c0Var.z();
                Context contextRequireContext2 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                fb.g0.w(contextRequireContext2, c0Var, "fl_listen_word");
                return b0Var;
        }
    }
}
