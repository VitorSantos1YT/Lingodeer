package qp;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d5 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f47900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f47901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f47902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f47903l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f47905o;

    public d5(mp.b bVar, long j11, ArrayList arrayList) {
        super(bVar, j11);
        this.f47900i = arrayList;
        this.m = 4;
        this.f47905o = BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final boolean a() {
        return false;
    }

    @Override // hi.a
    public final String b() {
        return this.f47905o;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "0;", ";13");
    }

    @Override // hi.a
    public final int i() {
        return 0;
    }

    @Override // hi.a
    public final void j() throws NoSuchElemException {
        List list = this.f47900i;
        if (list == null) {
            throw new NoSuchElemException();
        }
        this.f47901j = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Word wordH = ij.c.h(((Number) it.next()).longValue());
            if (wordH != null) {
                r().add(wordH);
            }
        }
        if (r().isEmpty()) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
    }

    @Override // qp.d
    public final fz.f n() {
        return b5.f47859a;
    }

    @Override // qp.d
    public final void p() {
        this.m = r().size();
        this.f47904n = false;
        ((jp.p0) this.f47881a).O(1);
        this.f47902k = s();
        ta.a aVar = this.f47886f;
        kotlin.jvm.internal.m.c(aVar);
        v((TextView) ((hj.t2) aVar).f33326b.f32490c);
        this.f47903l = new ArrayList();
        int i11 = this.m;
        int i12 = 0;
        while (i12 < i11) {
            i12++;
            View viewFindViewById = o().findViewById(w4.c.a(i12, "card_item_"));
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            cardView.setVisibility(0);
            ArrayList arrayList = this.f47903l;
            if (arrayList == null) {
                kotlin.jvm.internal.m.n("views");
                throw null;
            }
            arrayList.add(cardView);
        }
        View viewO = o();
        viewO.postDelayed(new b2.c(4, viewO, new lt.e(this, 25)), 0L);
    }

    public final ArrayList r() {
        ArrayList arrayList = this.f47901j;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.m.n("options");
        throw null;
    }

    public abstract ArrayList s();

    public abstract boolean t(Word word, String str);

    public final void u(Word word) {
        qy.q qVar = fv.b.f28186a;
        ((jp.p0) this.f47881a).I(fv.b.Y(word.getWordId(), null, null));
    }

    public abstract void v(TextView textView);

    public final void w(ImageView imageView, CardView cardView, TextView textView, Word word) {
        u(word);
        imageView.setVisibility(8);
        android.support.v4.media.session.a.m(cardView);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(14.0f, 18.0f);
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.motion.c(textView, 7));
        valueAnimatorOfFloat.start();
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer numValueOf = Integer.valueOf(cardView.getCardBackgroundColor().getDefaultColor());
        Context context = this.f47883c;
        kotlin.jvm.internal.m.f(context, "context");
        ObjectAnimator.ofObject(cardView, "cardBackgroundColor", argbEvaluator, numValueOf, Integer.valueOf(context.getColor(R.color.color_FFFDF3))).setDuration(400L).start();
    }

    @Override // hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = r().iterator();
        kotlin.jvm.internal.m.e(it, xTCJ.aOCxV);
        while (it.hasNext()) {
            Word word = (Word) it.next();
            qy.q qVar = fv.b.f28186a;
            arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
        }
        return arrayList;
    }
}
