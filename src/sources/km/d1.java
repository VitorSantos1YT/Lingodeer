package km;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingo.lingoskill.object.YinTuDao;
import com.lingo.lingoskill.object.ZhuoYinDao;
import com.lingodeer.R;
import com.lingodeer.data.model.LearnType;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends bp.m {
    public a9.i O;

    public d1() {
        super(c1.f38164a, BuildConfig.VERSION_NAME);
        LearnType learnType = LearnType.LEARN;
    }

    @Override // ji.e, androidx.fragment.app.k0
    public final void onDestroy() {
        super.onDestroy();
        a9.i iVar = this.O;
        if (iVar != null) {
            iVar.y();
        }
        a9.i iVar2 = this.O;
        if (iVar2 != null) {
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
        FlexboxLayout flexboxLayout = (FlexboxLayout) view2.findViewById(R.id.flex_voiced_1);
        View view3 = this.f36399e;
        kotlin.jvm.internal.m.c(view3);
        FlexboxLayout flexboxLayout2 = (FlexboxLayout) view3.findViewById(R.id.flex_voiced_2);
        View view4 = this.f36399e;
        kotlin.jvm.internal.m.c(view4);
        FlexboxLayout flexboxLayout3 = (FlexboxLayout) view4.findViewById(R.id.flex_voiced_3);
        View view5 = this.f36399e;
        kotlin.jvm.internal.m.c(view5);
        FlexboxLayout flexboxLayout4 = (FlexboxLayout) view5.findViewById(R.id.flex_voiced_4);
        View view6 = this.f36399e;
        kotlin.jvm.internal.m.c(view6);
        FlexboxLayout flexboxLayout5 = (FlexboxLayout) view6.findViewById(R.id.flex_voiced_5);
        View view7 = this.f36399e;
        kotlin.jvm.internal.m.c(view7);
        FlexboxLayout flexboxLayout6 = (FlexboxLayout) view7.findViewById(R.id.flex_voiced_6);
        View view8 = this.f36399e;
        kotlin.jvm.internal.m.c(view8);
        FlexboxLayout flexboxLayout7 = (FlexboxLayout) view8.findViewById(R.id.flex_voiced_7);
        View view9 = this.f36399e;
        kotlin.jvm.internal.m.c(view9);
        FlexboxLayout flexboxLayout8 = (FlexboxLayout) view9.findViewById(R.id.flex_voiced_8);
        View view10 = this.f36399e;
        kotlin.jvm.internal.m.c(view10);
        FlexboxLayout flexboxLayout9 = (FlexboxLayout) view10.findViewById(R.id.flex_voiced_9);
        k10.g gVarQueryBuilder = j3.J().o().queryBuilder();
        org.greenrobot.greendao.d dVar = YinTuDao.Properties.Id;
        gVarQueryBuilder.f(dVar.a(6, 10), new k10.h[0]);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.c(flexboxLayout);
        kotlin.jvm.internal.m.c(listD);
        x(flexboxLayout, "( k )", listD, 0);
        k10.g gVarQueryBuilder2 = j3.J().t().queryBuilder();
        org.greenrobot.greendao.d dVar2 = ZhuoYinDao.Properties.Id;
        gVarQueryBuilder2.f(dVar2.a(1, 5), new k10.h[0]);
        List listD2 = gVarQueryBuilder2.d();
        kotlin.jvm.internal.m.c(flexboxLayout2);
        kotlin.jvm.internal.m.c(listD2);
        x(flexboxLayout2, "( g )", listD2, 1);
        k10.g gVarQueryBuilder3 = j3.J().o().queryBuilder();
        gVarQueryBuilder3.f(dVar.a(11, 15), new k10.h[0]);
        List listD3 = gVarQueryBuilder3.d();
        kotlin.jvm.internal.m.c(flexboxLayout3);
        kotlin.jvm.internal.m.c(listD3);
        x(flexboxLayout3, "( s )", listD3, 0);
        k10.g gVarQueryBuilder4 = j3.J().t().queryBuilder();
        gVarQueryBuilder4.f(dVar2.a(6, 10), new k10.h[0]);
        List listD4 = gVarQueryBuilder4.d();
        kotlin.jvm.internal.m.c(flexboxLayout4);
        kotlin.jvm.internal.m.c(listD4);
        x(flexboxLayout4, "( z )", listD4, 1);
        k10.g gVarQueryBuilder5 = j3.J().o().queryBuilder();
        gVarQueryBuilder5.f(dVar.a(16, 20), new k10.h[0]);
        List listD5 = gVarQueryBuilder5.d();
        kotlin.jvm.internal.m.c(flexboxLayout5);
        kotlin.jvm.internal.m.c(listD5);
        x(flexboxLayout5, "( t )", listD5, 0);
        k10.g gVarQueryBuilder6 = j3.J().t().queryBuilder();
        gVarQueryBuilder6.f(dVar2.a(11, 15), new k10.h[0]);
        List listD6 = gVarQueryBuilder6.d();
        kotlin.jvm.internal.m.c(flexboxLayout6);
        kotlin.jvm.internal.m.c(listD6);
        x(flexboxLayout6, "( d )", listD6, 1);
        k10.g gVarQueryBuilder7 = j3.J().o().queryBuilder();
        gVarQueryBuilder7.f(dVar.a(26, 30), new k10.h[0]);
        List listD7 = gVarQueryBuilder7.d();
        kotlin.jvm.internal.m.c(flexboxLayout7);
        kotlin.jvm.internal.m.c(listD7);
        x(flexboxLayout7, "( h )", listD7, 0);
        k10.g gVarQueryBuilder8 = j3.J().t().queryBuilder();
        gVarQueryBuilder8.f(dVar2.a(16, 20), new k10.h[0]);
        List listD8 = gVarQueryBuilder8.d();
        kotlin.jvm.internal.m.c(flexboxLayout8);
        kotlin.jvm.internal.m.c(listD8);
        x(flexboxLayout8, "( b )", listD8, 1);
        k10.g gVarQueryBuilder9 = j3.J().t().queryBuilder();
        gVarQueryBuilder9.f(dVar2.a(21, 25), new k10.h[0]);
        List listD9 = gVarQueryBuilder9.d();
        kotlin.jvm.internal.m.c(flexboxLayout9);
        kotlin.jvm.internal.m.c(listD9);
        x(flexboxLayout9, "( p )", listD9, 1);
    }

    public final void x(FlexboxLayout flexboxLayout, String str, List list, int i11) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.item_recycler_fifty_sound_double_tv_pre, (ViewGroup) flexboxLayout, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_top);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_arrow_btm);
        textView.setText(str);
        if (i11 == 0) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            textView.setTextColor(contextRequireContext.getColor(R.color.color_65A8FC));
            imageView.setVisibility(0);
        } else {
            Context contextRequireContext2 = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
            textView.setTextColor(contextRequireContext2.getColor(R.color.colorAccent));
            imageView.setVisibility(8);
        }
        flexboxLayout.addView(viewInflate);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BaseYintuIntel baseYintuIntel = (BaseYintuIntel) it.next();
            View viewInflate2 = LayoutInflater.from(getContext()).inflate(R.layout.item_recycler_fifty_sound_double_tv, (ViewGroup) flexboxLayout, false);
            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_top);
            TextView textView3 = (TextView) viewInflate2.findViewById(R.id.tv_bottom);
            textView2.setText(baseYintuIntel.getPing());
            textView3.setText(baseYintuIntel.getPian() + " " + baseYintuIntel.getLuoMa());
            bq.z.b(viewInflate2, new j9.h(7, this, baseYintuIntel));
            flexboxLayout.addView(viewInflate2);
        }
    }
}
