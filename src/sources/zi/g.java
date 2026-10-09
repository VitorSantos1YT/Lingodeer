package zi;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bq.z;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.v1;
import java.util.ArrayList;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f59241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f59242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f59243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f59244l;
    public f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f59245n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mp.b view, xi.b pinyinElem) {
        super(view, pinyinElem);
        m.f(view, "view");
        m.f(pinyinElem, "pinyinElem");
        this.f59242j = new ArrayList();
        this.f59245n = BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final boolean a() {
        return false;
    }

    @Override // hi.a
    public final String b() {
        return this.f59245n;
    }

    @Override // zi.b, hi.a
    public final void f() {
        super.f();
        ta.a aVar = this.f59227f;
        m.c(aVar);
        ((v1) aVar).f33452f.b();
        AnimatorSet animatorSet = this.f59244l;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f59244l;
        if (animatorSet2 != null) {
            animatorSet2.removeListener(this.m);
        }
        AnimatorSet animatorSet3 = this.f59244l;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        q qVar = fv.f.f28191a;
        xi.b bVar = this.f59223b;
        String str = bVar.f56087a;
        m.c(str);
        String str2 = bVar.f56088b;
        m.c(str2);
        int i11 = bVar.f56089c;
        String strC = fv.f.c(i11, str, str2);
        String str3 = bVar.f56087a;
        m.c(str3);
        m.c(str2);
        arrayList.add(new fv.a(0L, strC, fv.f.a(i11, str3, str2)));
        if (str3 != null && !str3.equals(BuildConfig.VERSION_NAME)) {
            arrayList.add(new fv.a(0L, fv.f.e(bVar.a()), fv.f.d(bVar.a())));
        }
        if (str2 != null && !str2.equals(BuildConfig.VERSION_NAME)) {
            arrayList.add(new fv.a(0L, fv.f.g(i11, bVar.c()), fv.f.f(i11, bVar.c())));
        }
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // zi.b
    public final fz.f n() {
        return e.f59237a;
    }

    @Override // zi.b
    public final void o() {
        Context context;
        ((p0) this.f59222a).O(1);
        ArrayList arrayList = this.f59242j;
        arrayList.clear();
        xi.b bVar = this.f59223b;
        if (!bVar.a().equals(BuildConfig.VERSION_NAME)) {
            arrayList.add(bVar.a());
        }
        if (!bVar.c().equals(BuildConfig.VERSION_NAME)) {
            if (bVar.f56090d) {
                arrayList.add(bVar.b());
            } else {
                arrayList.add(bVar.c());
            }
        }
        ta.a aVar = this.f59227f;
        m.c(aVar);
        ((v1) aVar).f33448b.removeAllViews();
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            context = this.f59224c;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            m.e(obj, "next(...)");
            String str = (String) obj;
            ta.a aVar2 = this.f59227f;
            m.c(aVar2);
            FlexboxLayout flexboxLayout = ((v1) aVar2).f33448b;
            int iIndexOf = arrayList.indexOf(str);
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            ta.a aVar3 = this.f59227f;
            m.c(aVar3);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_cn_pinyin_test_01_elem, (ViewGroup) ((v1) aVar3).f33448b, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_pinyin);
            if (iIndexOf == 0) {
                m.f(context, "context");
                textView.setTextColor(context.getColor(R.color.primary_black));
            } else {
                m.f(context, "context");
                textView.setTextColor(context.getColor(R.color.color_889401));
            }
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.ll_elem);
            textView.setText(str);
            linearLayout.setVisibility(4);
            z.b(linearLayout, new x0.j(this, str, textView, 6));
            flexboxLayout.addView(viewInflate);
        }
        if (this.f59243k < arrayList.size()) {
            ta.a aVar4 = this.f59227f;
            m.c(aVar4);
            ((v1) aVar4).f33451e.setText((CharSequence) arrayList.get(this.f59243k));
        }
        ta.a aVar5 = this.f59227f;
        m.c(aVar5);
        z.b(((v1) aVar5).f33451e, new d(this, 0));
        ta.a aVar6 = this.f59227f;
        m.c(aVar6);
        z.b((ImageView) ((v1) aVar6).f33450d.f32408d, new d(this, 1));
        ta.a aVar7 = this.f59227f;
        m.c(aVar7);
        ((v1) aVar7).f33452f.setDuration(2500L);
        ta.a aVar8 = this.f59227f;
        m.c(aVar8);
        ((v1) aVar8).f33452f.setInitialRadius(ff.h.l(16.0f));
        ta.a aVar9 = this.f59227f;
        m.c(aVar9);
        ((v1) aVar9).f33452f.setStyle(Paint.Style.FILL);
        ta.a aVar10 = this.f59227f;
        m.c(aVar10);
        ((v1) aVar10).f33452f.setSpeed(500);
        ta.a aVar11 = this.f59227f;
        m.c(aVar11);
        WaveView waveView = ((v1) aVar11).f33452f;
        m.f(context, "context");
        waveView.setColor(context.getColor(R.color.color_BFDF98));
        ta.a aVar12 = this.f59227f;
        m.c(aVar12);
        ((v1) aVar12).f33452f.setInterpolator(new AccelerateDecelerateInterpolator());
        ta.a aVar13 = this.f59227f;
        m.c(aVar13);
        ((v1) aVar13).f33452f.a();
    }

    @Override // hi.a
    public final void j() {
    }

    @Override // hi.a
    public final void k() {
    }
}
