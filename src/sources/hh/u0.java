package hh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.lingo.fluent.widget.MultipleTransformer;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdTips;
import com.lingodeer.R;
import fr.j3;
import hj.l4;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends bp.m {
    public PdLesson O;
    public final Object P;

    public u0() {
        super(s0.f32296a, "FluentLessonKeyPoints");
        this.P = com.bumptech.glide.d.u(qy.j.NONE, new bp.b1(12, this, new bj.a(this, 15)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [qy.n] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // ji.e
    public final void v(Bundle bundle) {
        ?? L;
        try {
            PdLesson pdLesson = ((jh.o) this.P.getValue()).f36374b;
            if (pdLesson == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            this.O = pdLesson;
            try {
                List<PdTips> tips = pdLesson.getTips();
                kotlin.jvm.internal.m.e(tips, "getTips(...)");
                L = new ArrayList(ry.n.W(tips, 10));
                for (PdTips pdTips : tips) {
                    kotlin.jvm.internal.m.c(pdTips);
                    L.add(p.a(pdTips));
                }
            } catch (Throwable th2) {
                L = com.bumptech.glide.e.l(th2);
            }
            if (L instanceof qy.n) {
                return;
            }
            List list = (List) L;
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            final int i11 = 0;
            ((l4) aVar).f32862g.setAdapter(new ih.b(this, (androidx.fragment.app.k0[]) list.toArray(new androidx.fragment.app.k0[0])));
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ViewPager2 viewPager2 = ((l4) aVar2).f32862g;
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ViewPager2 viewPager3 = ((l4) aVar3).f32862g;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            viewPager2.setPageTransformer(new MultipleTransformer(viewPager3, j3.Z(32, contextRequireContext)));
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            bq.z.b(((l4) aVar4).f32857b, new fz.c(this) { // from class: hh.r0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u0 f32293b;

                {
                    this.f32293b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            u0 u0Var = this.f32293b;
                            ta.a aVar5 = u0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar5);
                            int currentItem = ((l4) aVar5).f32862g.getCurrentItem() - 1;
                            if (currentItem >= 0) {
                                ta.a aVar6 = u0Var.f36400f;
                                kotlin.jvm.internal.m.c(aVar6);
                                ((l4) aVar6).f32862g.setCurrentItem(currentItem);
                            }
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            this.f32293b.requireActivity().finish();
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            bq.z.b(((l4) aVar5).f32858c, new com.google.accompanist.permissions.a(23, this, list));
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((l4) aVar6).f32862g.registerOnPageChangeCallback(new t0(this, list));
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((l4) aVar7).f32862g.setCurrentItem(0);
            x(list);
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            final int i12 = 1;
            bq.z.b((ImageView) ((l4) aVar8).f32860e.f32408d, new fz.c(this) { // from class: hh.r0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u0 f32293b;

                {
                    this.f32293b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            u0 u0Var = this.f32293b;
                            ta.a aVar9 = u0Var.f36400f;
                            kotlin.jvm.internal.m.c(aVar9);
                            int currentItem = ((l4) aVar9).f32862g.getCurrentItem() - 1;
                            if (currentItem >= 0) {
                                ta.a aVar10 = u0Var.f36400f;
                                kotlin.jvm.internal.m.c(aVar10);
                                ((l4) aVar10).f32862g.setCurrentItem(currentItem);
                            }
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            this.f32293b.requireActivity().finish();
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            TextView textView = (TextView) ((l4) aVar9).f32860e.f32407c;
            PdLesson pdLesson2 = this.O;
            if (pdLesson2 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            textView.setText(pdLesson2.getTitle());
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            TextView textView2 = (TextView) ((l4) aVar10).f32860e.f32409e;
            PdLesson pdLesson3 = this.O;
            if (pdLesson3 == null) {
                kotlin.jvm.internal.m.n("pdLesson");
                throw null;
            }
            textView2.setText(pdLesson3.getTitleTranslation());
            int[] iArr = bq.r.f4959a;
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            bq.m.J((TextView) ((l4) aVar11).f32860e.f32407c);
        } catch (Exception e8) {
            e8.printStackTrace();
            requireActivity().finish();
        }
    }

    public final void x(List list) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        TextView textView = ((l4) aVar).f32861f;
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        textView.setText((((l4) aVar2).f32862g.getCurrentItem() + 1) + "/" + list.size());
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        int currentItem = ((l4) aVar3).f32862g.getCurrentItem();
        if (currentItem == 0) {
            ta.a aVar4 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((l4) aVar4).f32857b.clearColorFilter();
            ta.a aVar5 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ImageView imageView = ((l4) aVar5).f32857b;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            imageView.setColorFilter(contextRequireContext.getColor(R.color.color_E3E3E3));
            ta.a aVar6 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ((l4) aVar6).f32857b.setEnabled(false);
            ta.a aVar7 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar7);
            ((l4) aVar7).f32858c.clearColorFilter();
            ta.a aVar8 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar8);
            ImageView imageView2 = ((l4) aVar8).f32858c;
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            imageView2.setColorFilter(contextRequireContext2.getColor(R.color.color_primary));
            ta.a aVar9 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar9);
            ((l4) aVar9).f32858c.setEnabled(true);
            return;
        }
        if (currentItem == list.size() - 1) {
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            ((l4) aVar10).f32857b.clearColorFilter();
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ImageView imageView3 = ((l4) aVar11).f32857b;
            Context contextRequireContext3 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
            imageView3.setColorFilter(contextRequireContext3.getColor(R.color.color_primary));
            ta.a aVar12 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar12);
            ((l4) aVar12).f32857b.setEnabled(true);
            ta.a aVar13 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar13);
            ((l4) aVar13).f32858c.clearColorFilter();
            ta.a aVar14 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar14);
            ImageView imageView4 = ((l4) aVar14).f32858c;
            Context contextRequireContext4 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
            imageView4.setColorFilter(contextRequireContext4.getColor(R.color.color_E3E3E3));
            ta.a aVar15 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar15);
            ((l4) aVar15).f32858c.setEnabled(false);
            return;
        }
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        ((l4) aVar16).f32857b.clearColorFilter();
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        ImageView imageView5 = ((l4) aVar17).f32857b;
        Context contextRequireContext5 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
        imageView5.setColorFilter(contextRequireContext5.getColor(R.color.color_primary));
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        ((l4) aVar18).f32857b.setEnabled(true);
        ta.a aVar19 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar19);
        ((l4) aVar19).f32858c.clearColorFilter();
        ta.a aVar20 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar20);
        ImageView imageView6 = ((l4) aVar20).f32858c;
        Context contextRequireContext6 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
        imageView6.setColorFilter(contextRequireContext6.getColor(R.color.color_primary));
        ta.a aVar21 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar21);
        ((l4) aVar21).f32858c.setEnabled(true);
    }
}
