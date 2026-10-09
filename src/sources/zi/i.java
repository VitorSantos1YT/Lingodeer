package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bq.z;
import com.google.android.flexbox.FlexboxLayout;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jp.p0;
import kotlin.jvm.internal.m;
import ns.o;
import qp.n2;
import qp.r;
import qy.q;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xi.c f59247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f59248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f59249k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mp.b view, xi.b bVar, xi.c lesson) {
        super(view, bVar);
        m.f(view, "view");
        m.f(lesson, "lesson");
        this.f59247i = lesson;
        this.f59248j = new ArrayList();
    }

    @Override // hi.a
    public final boolean a() {
        StringBuilder sb2 = new StringBuilder();
        ta.a aVar = this.f59227f;
        m.c(aVar);
        int childCount = ((x1) aVar).f33564c.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            ta.a aVar2 = this.f59227f;
            m.c(aVar2);
            View childAt = ((x1) aVar2).f33564c.getChildAt(i11);
            if (childAt.getTag(R.id.tag_pinyin) != null) {
                Object tag = childAt.getTag(R.id.tag_pinyin);
                m.d(tag, "null cannot be cast to non-null type kotlin.String");
                sb2.append((String) tag);
            }
        }
        xi.b bVar = this.f59223b;
        return bVar.f56090d ? m.a(sb2.toString(), bVar.a().concat(bVar.b())) : m.a(sb2.toString(), bVar.a().concat(bVar.c()));
    }

    @Override // hi.a
    public final String b() {
        xi.b pinyinElem = this.f59223b;
        m.f(pinyinElem, "pinyinElem");
        q qVar = fv.f.f28191a;
        String str = pinyinElem.f56087a;
        m.c(str);
        String str2 = pinyinElem.f56088b;
        m.c(str2);
        return defpackage.e.m(xt.b.a().b(), fv.f.a(pinyinElem.f56089c, str, str2));
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
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return 2;
    }

    @Override // hi.a
    public final void j() {
        int iM = j3.M(3);
        this.f59249k = iM;
        int i11 = iM == 2 ? 8 : 4;
        ArrayList arrayList = this.f59248j;
        arrayList.clear();
        int i12 = this.f59249k;
        xi.c cVar = this.f59247i;
        xi.b bVar = this.f59223b;
        if (i12 == 0) {
            arrayList.add(bVar.a());
            String[] strArrSplit = cVar.f56098d.split(";");
            ArrayList arrayListM = o.M(Arrays.copyOf(strArrSplit, strArrSplit.length));
            Collections.shuffle(arrayListM);
            while (arrayList.size() < i11) {
                if (!arrayList.contains(arrayListM.get(0))) {
                    arrayList.add(arrayListM.get(0));
                }
                Collections.shuffle(arrayListM);
            }
            Collections.shuffle(arrayList);
            return;
        }
        if (i12 == 1) {
            boolean z11 = bVar.f56090d;
            String str = bVar.f56087a;
            if (z11) {
                arrayList.add(bVar.b());
            } else {
                arrayList.add(bVar.c());
            }
            String[] strArrA = cVar.a();
            ArrayList arrayListM2 = o.M(Arrays.copyOf(strArrA, strArrA.length));
            Collections.shuffle(arrayListM2);
            while (arrayList.size() < i11) {
                String strE = (String) arrayListM2.get(0);
                if (bVar.f56090d) {
                    strE = fv.g.E(j3.N(1, 5), strE);
                }
                if (!arrayList.contains(strE)) {
                    if (m.a(str, "j") || m.a(str, "q") || m.a(str, "x") || m.a(str, "y") || m.a(str, "w")) {
                        if (arrayList.contains("ü") && m.a(strE, "u")) {
                            Collections.shuffle(arrayListM2);
                        } else if (arrayList.contains("u") && m.a(strE, "ü")) {
                            Collections.shuffle(arrayListM2);
                        }
                    }
                    arrayList.add(strE);
                }
                Collections.shuffle(arrayListM2);
            }
            Collections.shuffle(arrayList);
            return;
        }
        if (i12 != 2) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String strA = bVar.a();
        boolean z12 = bVar.f56090d;
        String str2 = bVar.f56087a;
        arrayList2.add(strA);
        String[] strArrSplit2 = cVar.f56098d.split(";");
        ArrayList arrayListM3 = o.M(Arrays.copyOf(strArrSplit2, strArrSplit2.length));
        Collections.shuffle(arrayListM3);
        while (arrayList2.size() < 4) {
            if (!arrayList2.contains(arrayListM3.get(0))) {
                arrayList2.add(arrayListM3.get(0));
            }
            Collections.shuffle(arrayListM3);
        }
        Collections.shuffle(arrayList2);
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        if (z12) {
            arrayList3.add(bVar.b());
        } else {
            arrayList3.add(bVar.c());
        }
        String[] strArrA2 = cVar.a();
        ArrayList arrayListM4 = o.M(Arrays.copyOf(strArrA2, strArrA2.length));
        Collections.shuffle(arrayListM4);
        while (arrayList3.size() < 4) {
            String strE2 = (String) arrayListM4.get(0);
            if (z12) {
                strE2 = fv.g.E(j3.N(1, 5), strE2);
            }
            if (m.a(str2, "j") || m.a(str2, "q") || m.a(str2, "x") || m.a(str2, "y") || m.a(str2, "w")) {
                if (arrayList.contains("ü") && m.a(strE2, "u")) {
                    Collections.shuffle(arrayListM4);
                } else if (arrayList.contains("u") && m.a(strE2, "ü")) {
                    Collections.shuffle(arrayListM4);
                }
            }
            if (!arrayList3.contains(strE2)) {
                arrayList3.add(strE2);
            }
            Collections.shuffle(arrayListM4);
        }
        Collections.shuffle(arrayList3);
        arrayList.addAll(arrayList3);
    }

    @Override // zi.b
    public final fz.f n() {
        return h.f59246a;
    }

    @Override // zi.b
    public final void o() {
        p0 p0Var = (p0) this.f59222a;
        p0Var.O(1);
        int i11 = this.f59249k;
        xi.b bVar = this.f59223b;
        if (i11 == 0) {
            ta.a aVar = this.f59227f;
            m.c(aVar);
            FlexboxLayout flexboxLayout = ((x1) aVar).f33564c;
            String strA = bVar.a();
            boolean z11 = bVar.f56090d;
            q(flexboxLayout, strA);
            if (z11) {
                ta.a aVar2 = this.f59227f;
                m.c(aVar2);
                q(((x1) aVar2).f33564c, bVar.b());
            } else {
                ta.a aVar3 = this.f59227f;
                m.c(aVar3);
                q(((x1) aVar3).f33564c, bVar.c());
            }
            ta.a aVar4 = this.f59227f;
            m.c(aVar4);
            View childAt = ((x1) aVar4).f33564c.getChildAt(1);
            m.e(childAt, "getChildAt(...)");
            View viewFindViewById = childAt.findViewById(R.id.ll_item);
            m.e(viewFindViewById, "findViewById(...)");
            LinearLayout linearLayout = (LinearLayout) viewFindViewById;
            if (z11) {
                childAt.setTag(R.id.tag_pinyin, bVar.b());
            } else {
                childAt.setTag(R.id.tag_pinyin, bVar.c());
            }
            linearLayout.setVisibility(0);
        } else if (i11 == 1) {
            ta.a aVar5 = this.f59227f;
            m.c(aVar5);
            q(((x1) aVar5).f33564c, bVar.a());
            if (bVar.f56090d) {
                ta.a aVar6 = this.f59227f;
                m.c(aVar6);
                q(((x1) aVar6).f33564c, bVar.b());
            } else {
                ta.a aVar7 = this.f59227f;
                m.c(aVar7);
                q(((x1) aVar7).f33564c, bVar.c());
            }
            ta.a aVar8 = this.f59227f;
            m.c(aVar8);
            View childAt2 = ((x1) aVar8).f33564c.getChildAt(0);
            m.e(childAt2, "getChildAt(...)");
            View viewFindViewById2 = childAt2.findViewById(R.id.ll_item);
            m.e(viewFindViewById2, "findViewById(...)");
            childAt2.setTag(R.id.tag_pinyin, bVar.a());
            ((LinearLayout) viewFindViewById2).setVisibility(0);
        } else if (i11 == 2) {
            ta.a aVar9 = this.f59227f;
            m.c(aVar9);
            q(((x1) aVar9).f33564c, bVar.a());
            if (bVar.f56090d) {
                ta.a aVar10 = this.f59227f;
                m.c(aVar10);
                q(((x1) aVar10).f33564c, bVar.b());
            } else {
                ta.a aVar11 = this.f59227f;
                m.c(aVar11);
                q(((x1) aVar11).f33564c, bVar.c());
            }
        }
        ArrayList arrayList = this.f59248j;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            String str = (String) obj;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f59224c);
            ta.a aVar12 = this.f59227f;
            m.c(aVar12);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_cn_pinyin_test_02_bottom_elem, (ViewGroup) ((x1) aVar12).f33563b, false);
            ((TextView) viewInflate.findViewById(R.id.tv_pinyin)).setText(str);
            LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.ll_item);
            m.c(linearLayout2);
            z.b(linearLayout2, new x0.j(this, linearLayout2, str, 7));
            ta.a aVar13 = this.f59227f;
            m.c(aVar13);
            ((x1) aVar13).f33563b.addView(viewInflate);
        }
        ta.a aVar14 = this.f59227f;
        m.c(aVar14);
        z.b((ImageView) ((x1) aVar14).f33565d.f32408d, new yb.a(this, 3));
        this.f59225d = bVar.f56090d ? bVar.a().concat(bVar.b()) : bVar.a().concat(bVar.c());
        q qVar = fv.f.f28191a;
        String str2 = bVar.f56087a;
        m.c(str2);
        String str3 = bVar.f56088b;
        m.c(str3);
        String strM = defpackage.e.m(xt.b.a().b(), fv.f.a(bVar.f56089c, str2, str3));
        ta.a aVar15 = this.f59227f;
        m.c(aVar15);
        p0Var.H((ImageView) ((x1) aVar15).f33565d.f32408d, strM);
    }

    public final void p(View view) {
        w0 w0VarB = s0.b(view);
        w0VarB.j(CropImageView.DEFAULT_ASPECT_RATIO);
        w0VarB.l(CropImageView.DEFAULT_ASPECT_RATIO);
        w0VarB.e(300L);
        w0VarB.i();
        th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new r(12, view, this), a.f59218e), this.f59228g);
    }

    public final void q(FlexboxLayout flexboxLayout, String str) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f59224c);
        ta.a aVar = this.f59227f;
        m.c(aVar);
        View viewInflate = layoutInflaterFrom.inflate(R.layout.item_cn_pinyin_test_02_top_elem, (ViewGroup) ((x1) aVar).f33564c, false);
        ((TextView) viewInflate.findViewById(R.id.tv_pinyin)).setText(str);
        z.b(viewInflate, new n2(29, viewInflate, this));
        flexboxLayout.addView(viewInflate);
    }

    @Override // hi.a
    public final void k() {
    }
}
