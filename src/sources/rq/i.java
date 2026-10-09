package rq;

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
import ot.e2;
import qp.n2;
import qy.q;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pq.a f49386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f49387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CardView f49388l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cm.a f49389n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public w0 f49390o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AnimatorSet f49391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f49392q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mp.b view, pq.a pinyinElem, pq.a rndElem) {
        super(view, pinyinElem);
        m.f(view, "view");
        m.f(pinyinElem, "pinyinElem");
        m.f(rndElem, "rndElem");
        this.f49386j = rndElem;
        this.f49389n = new cm.a();
        this.f49392q = BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final boolean a() {
        CardView cardView = this.f49388l;
        if (cardView == null) {
            return false;
        }
        if ((cardView != null ? cardView.getTag() : null) == null) {
            return false;
        }
        CardView cardView2 = this.f49388l;
        Object tag = cardView2 != null ? cardView2.getTag() : null;
        m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.vtskill.ui.syllable.object.VTSyllableElem");
        return m.a(this.f49358b, (pq.a) tag);
    }

    @Override // hi.a
    public final String b() {
        return this.f49392q;
    }

    @Override // hi.a
    public final void f() {
        this.f49364h.f();
        AnimatorSet animatorSet = this.f49391p;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f49391p;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        w0 w0Var = this.f49390o;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // hi.a
    public final List g() {
        pq.a aVar = this.f49358b;
        String str = aVar.f46983a;
        ArrayList arrayList = new ArrayList();
        q qVar = fv.b.f28186a;
        String str2 = aVar.f46983a;
        cm.a aVar2 = this.f49389n;
        String strA = aVar2.a(str2);
        m.e(strA, "getCharName(...)");
        String strE = fv.b.e(strA);
        String strA2 = aVar2.a(aVar.f46983a);
        m.e(strA2, "getCharName(...)");
        arrayList.add(new fv.a(0L, strE, fv.b.a(strA2, null, null)));
        pq.a aVar3 = this.f49386j;
        String strA3 = aVar2.a(aVar3.f46983a);
        m.e(strA3, "getCharName(...)");
        String strE2 = fv.b.e(strA3);
        String strA4 = aVar2.a(aVar3.f46983a);
        m.e(strA4, "getCharName(...)");
        arrayList.add(new fv.a(0L, strE2, fv.b.a(strA4, null, null)));
        return arrayList;
    }

    @Override // hi.a
    public final int i() {
        return 2;
    }

    @Override // hi.a
    public final void j() {
        ArrayList arrayList = new ArrayList();
        this.f49387k = arrayList;
        arrayList.add(this.f49358b);
        ArrayList arrayList2 = this.f49387k;
        if (arrayList2 == null) {
            m.n("options");
            throw null;
        }
        arrayList2.add(this.f49386j);
        ArrayList arrayList3 = this.f49387k;
        if (arrayList3 != null) {
            Collections.shuffle(arrayList3);
        } else {
            m.n("options");
            throw null;
        }
    }

    @Override // rq.b
    public final fz.f n() {
        return h.f49385a;
    }

    @Override // rq.b
    public final void o() {
        ((p0) this.f49357a).O(3);
        this.f49361e = this.f49358b.f46983a;
        ArrayList arrayList = this.f49387k;
        if (arrayList == null) {
            m.n("options");
            throw null;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            int iA = w4.c.a(i11, "rl_answer_");
            ArrayList arrayList2 = this.f49387k;
            if (arrayList2 == null) {
                m.n("options");
                throw null;
            }
            pq.a aVar = (pq.a) arrayList2.get(i11);
            View view = this.f49362f;
            if (view == null) {
                m.n("view");
                throw null;
            }
            View viewFindViewById = view.findViewById(iA);
            m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setTag(aVar);
            z.b(cardView, new n2(7, this, cardView));
            ((TextView) cardView.findViewById(R.id.tv_middle)).setText(aVar.f46983a);
        }
        ta.a aVar2 = this.f49363g;
        m.c(aVar2);
        z.b((FrameLayout) ((y1) aVar2).f33612b.f32407c, new e2(this, 17));
        ta.a aVar3 = this.f49363g;
        m.c(aVar3);
        ((FrameLayout) ((y1) aVar3).f33612b.f32407c).performClick();
    }

    @Override // hi.a
    public final void k() {
    }
}
