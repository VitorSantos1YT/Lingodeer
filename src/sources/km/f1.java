package km;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.object.YinTu;
import com.lingo.lingoskill.object.YinTuDao;
import com.lingo.lingoskill.object.YouYin;
import com.lingo.lingoskill.object.YouYinDao;
import com.lingo.lingoskill.object.ZhuoYinDao;
import com.lingodeer.R;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.j4;
import fr.j3;
import hj.h5;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends bp.m {
    public a9.i O;

    public f1() {
        super(e1.f38178a, BuildConfig.VERSION_NAME);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.text.SpannableStringBuilder, java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.widget.TextView] */
    @Override // ji.e
    public final void v(Bundle bundle) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        String strY = ff.h.y(contextRequireContext, R.string.introduction);
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(strY, mVar, view);
        getContext();
        this.O = new a9.i(1);
        View view2 = this.f36399e;
        kotlin.jvm.internal.m.c(view2);
        FlexboxLayout flexboxLayout = (FlexboxLayout) view2.findViewById(R.id.flex_yoon_1);
        View view3 = this.f36399e;
        kotlin.jvm.internal.m.c(view3);
        FlexboxLayout flexboxLayout2 = (FlexboxLayout) view3.findViewById(R.id.flex_yoon_2);
        View view4 = this.f36399e;
        kotlin.jvm.internal.m.c(view4);
        FlexboxLayout flexboxLayout3 = (FlexboxLayout) view4.findViewById(R.id.flex_yoon_3);
        k10.g gVarQueryBuilder = j3.J().o().queryBuilder();
        org.greenrobot.greendao.d dVar = YinTuDao.Properties.Id;
        boolean z11 = false;
        gVarQueryBuilder.f(dVar.d(7, 12, 17, 22, 27, 32, 42), new k10.h[0]);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.c(flexboxLayout);
        kotlin.jvm.internal.m.c(listD);
        x(flexboxLayout, listD);
        k10.g gVarQueryBuilder2 = j3.J().t().queryBuilder();
        gVarQueryBuilder2.f(ZhuoYinDao.Properties.Id.d(7, 17, 22), new k10.h[0]);
        List listD2 = gVarQueryBuilder2.d();
        kotlin.jvm.internal.m.c(listD2);
        x(flexboxLayout, listD2);
        k10.g gVarQueryBuilder3 = j3.J().o().queryBuilder();
        gVarQueryBuilder3.f(dVar.d(36, 38, 40), new k10.h[0]);
        for (YinTu yinTu : gVarQueryBuilder3.d()) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_flex_yoon_2, (ViewGroup) flexboxLayout2, false);
            ((TextView) viewInflate.findViewById(R.id.f22244tv)).setText(yinTu.getPing());
            bq.z.b(viewInflate, new j9.h(8, this, yinTu));
            flexboxLayout2.addView(viewInflate);
        }
        if (dm.a.f23483c == null) {
            synchronized (dm.a.class) {
                if (dm.a.f23483c == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    dm.a.f23483c = new dm.a(lingoSkillApplication);
                }
            }
        }
        dm.a aVar = dm.a.f23483c;
        kotlin.jvm.internal.m.c(aVar);
        k10.g gVarQueryBuilder4 = aVar.s().queryBuilder();
        gVarQueryBuilder4.f(YouYinDao.Properties.Id.d(10, 2, 15), new k10.h[0]);
        for (YouYin youYin : gVarQueryBuilder4.d()) {
            View viewInflate2 = LayoutInflater.from(getContext()).inflate(R.layout.item_flex_yoon_3, (ViewGroup) flexboxLayout3, false);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.tv_top);
            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_bottom);
            textView.setText(youYin.getPing());
            textView2.setText(youYin.getLuoMa());
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            textView.setTextColor(contextRequireContext2.getColor(R.color.colorAccent));
            Context contextRequireContext3 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
            textView2.setTextColor(contextRequireContext3.getColor(R.color.colorAccent));
            bq.z.b(viewInflate2, new j9.h(9, this, youYin));
            flexboxLayout3.addView(viewInflate2);
        }
        View viewInflate3 = LayoutInflater.from(getContext()).inflate(R.layout.item_flex_yoon_3, (ViewGroup) flexboxLayout3, false);
        TextView textView3 = (TextView) viewInflate3.findViewById(R.id.tv_top);
        TextView textView4 = (TextView) viewInflate3.findViewById(R.id.tv_bottom);
        textView3.setText("...");
        textView4.setText(BuildConfig.VERSION_NAME);
        Context contextRequireContext4 = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
        textView3.setTextColor(contextRequireContext4.getColor(R.color.colorAccent));
        ep.a.z(requireContext(), "requireContext(...)", R.color.colorAccent, textView4);
        flexboxLayout3.addView(viewInflate3);
        int[] iArr = {17, 2108, 2501};
        int i11 = 0;
        while (i11 < 3) {
            int i12 = iArr[i11];
            Word wordH = ij.c.h(i12);
            if (wordH == null) {
                return;
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            View viewInflate4 = layoutInflaterFrom.inflate(R.layout.item_syllable_jp_word_info, ((h5) aVar2).f32661b, z11);
            ?? r9 = (TextView) viewInflate4.findViewById(R.id.tv_word);
            TextView textView5 = (TextView) viewInflate4.findViewById(R.id.tv_luoma);
            ((TextView) viewInflate4.findViewById(R.id.tv_trans)).setText(wordH.getTranslations());
            ?? spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(wordH.getWord() + "( " + wordH.getZhuyin() + " )");
            int length = spannableStringBuilder.length();
            for (?? r13 = z11; r13 < length; r13++) {
                if (kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder.charAt(r13)), "ん")) {
                    Context contextRequireContext5 = requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext5, "requireContext(...)");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(contextRequireContext5.getColor(R.color.colorAccent)), r13, r13 + 1, 33);
                }
            }
            r9.setText(spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) wordH.getLuoma());
            int length2 = spannableStringBuilder2.length();
            for (int i13 = 0; i13 < length2; i13++) {
                if (i13 != 0 && kotlin.jvm.internal.m.a(String.valueOf(spannableStringBuilder2.charAt(i13)), "n")) {
                    Context contextRequireContext6 = requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext6, "requireContext(...)");
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(contextRequireContext6.getColor(R.color.colorAccent)), i13, i13 + 1, 33);
                }
            }
            textView5.setText(spannableStringBuilder2);
            bq.z.b(viewInflate4, new j4(this, i12, 1));
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((h5) aVar3).f32661b.addView(viewInflate4);
            i11++;
            z11 = false;
        }
    }

    public final void x(FlexboxLayout flexboxLayout, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseYintuIntel baseYintuIntel = (BaseYintuIntel) it.next();
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_flex_yoon_1, (ViewGroup) flexboxLayout, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_left);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_right);
            textView.setText(baseYintuIntel.getPing());
            textView2.setText(baseYintuIntel.getLuoMa());
            if (flexboxLayout.getChildCount() % 2 == 0) {
                Context contextRequireContext = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                viewInflate.setBackgroundColor(contextRequireContext.getColor(R.color.color_FFF0CB));
            } else {
                Context contextRequireContext2 = requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                viewInflate.setBackgroundColor(contextRequireContext2.getColor(R.color.white));
            }
            bq.z.b(viewInflate, new j9.h(10, this, baseYintuIntel));
            flexboxLayout.addView(viewInflate);
        }
    }
}
