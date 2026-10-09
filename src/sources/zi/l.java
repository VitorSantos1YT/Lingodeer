package zi;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bq.z;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final xi.b f59254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f59255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CardView f59256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f59257l;
    public AnimatorSet m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f59258n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mp.b view, xi.b pinyinElem, xi.b rndElem) {
        super(view, pinyinElem);
        m.f(view, "view");
        m.f(pinyinElem, "pinyinElem");
        m.f(rndElem, "rndElem");
        this.f59254i = rndElem;
        this.f59258n = BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final boolean a() {
        CardView cardView = this.f59256k;
        if (cardView == null) {
            return false;
        }
        if ((cardView != null ? cardView.getTag() : null) == null) {
            return false;
        }
        CardView cardView2 = this.f59256k;
        Object tag = cardView2 != null ? cardView2.getTag() : null;
        m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.object.PinyinElem");
        return m.a(this.f59223b, (xi.b) tag);
    }

    @Override // hi.a
    public final String b() {
        return this.f59258n;
    }

    @Override // zi.b, hi.a
    public final void f() {
        super.f();
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.m;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
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
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return 4;
    }

    @Override // hi.a
    public final void j() {
        ArrayList arrayList = new ArrayList();
        this.f59255j = arrayList;
        arrayList.add(this.f59223b);
        ArrayList arrayList2 = this.f59255j;
        if (arrayList2 == null) {
            m.n("options");
            throw null;
        }
        arrayList2.add(this.f59254i);
        ArrayList arrayList3 = this.f59255j;
        if (arrayList3 != null) {
            Collections.shuffle(arrayList3);
        } else {
            m.n("options");
            throw null;
        }
    }

    @Override // zi.b
    public final fz.f n() {
        return k.f59253a;
    }

    @Override // zi.b
    public final void o() {
        ((p0) this.f59222a).O(3);
        xi.b bVar = this.f59223b;
        this.f59225d = bVar.f56090d ? bVar.a().concat(bVar.b()) : bVar.a().concat(bVar.c());
        ArrayList arrayList = this.f59255j;
        if (arrayList == null) {
            m.n("options");
            throw null;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iA = w4.c.a(i11, "rl_answer_");
            ArrayList arrayList2 = this.f59255j;
            if (arrayList2 == null) {
                m.n("options");
                throw null;
            }
            xi.b bVar2 = (xi.b) arrayList2.get(i11);
            View view = this.f59226e;
            if (view == null) {
                m.n("view");
                throw null;
            }
            View viewFindViewById = view.findViewById(iA);
            m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setTag(bVar2);
            z.b(cardView, new j(0, this, cardView));
            String strA = !bVar.a().equals(BuildConfig.VERSION_NAME) ? bVar2.a() : BuildConfig.VERSION_NAME;
            if (!bVar.c().equals(BuildConfig.VERSION_NAME)) {
                strA = bVar.f56090d ? strA.concat(bVar2.b()) : strA.concat(bVar2.c());
            }
            View viewFindViewById2 = cardView.findViewById(R.id.tv_middle);
            m.e(viewFindViewById2, "findViewById(...)");
            ((TextView) viewFindViewById2).setText(strA);
        }
        ta.a aVar = this.f59227f;
        m.c(aVar);
        z.b((FrameLayout) ((y1) aVar).f33612b.f32407c, new yb.a(this, 4));
        ta.a aVar2 = this.f59227f;
        m.c(aVar2);
        ((FrameLayout) ((y1) aVar2).f33612b.f32407c).performClick();
    }

    @Override // hi.a
    public final void k() {
    }
}
