package fi;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import b1.p;
import com.lingo.lingoskill.object.ARChar;
import com.lingodeer.R;
import hj.g1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends om.b implements View.OnClickListener {
    public ARChar H;
    public ARChar K;
    public ArrayList L;
    public final ArrayList M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gi.h f27316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f27317f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f27318t;

    public k(gi.h hVar, long j11, long j12) {
        super(j11);
        this.f27316e = hVar;
        this.f27317f = j12;
        this.M = new ArrayList();
    }

    @Override // om.b
    public final fz.f c() {
        return j.f27315a;
    }

    @Override // om.b
    public final void e() {
        this.f27316e.f29271a.x(1);
        Context context = d().getContext();
        m.e(context, "getContext(...)");
        this.f27318t = context;
        ta.a aVar = this.f45600c;
        m.c(aVar);
        ((g1) aVar).f32600f.setOnClickListener(this);
        ta.a aVar2 = this.f45600c;
        m.c(aVar2);
        ((g1) aVar2).f32601g.setOnClickListener(this);
        ta.a aVar3 = this.f45600c;
        m.c(aVar3);
        ((g1) aVar3).f32596b.setOnClickListener(this);
        ta.a aVar4 = this.f45600c;
        m.c(aVar4);
        CardView cardView = ((g1) aVar4).f32600f;
        ArrayList arrayList = this.M;
        arrayList.add(cardView);
        ta.a aVar5 = this.f45600c;
        m.c(aVar5);
        arrayList.add(((g1) aVar5).f32601g);
        ta.a aVar6 = this.f45600c;
        m.c(aVar6);
        TextView textView = ((g1) aVar6).f32602h;
        ARChar aRChar = this.H;
        if (aRChar == null) {
            m.n("curChar");
            throw null;
        }
        textView.setText(aRChar.getZhuyin());
        ArrayList arrayList2 = this.L;
        if (arrayList2 == null) {
            m.n("answers");
            throw null;
        }
        Collections.shuffle(arrayList2);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList arrayList3 = this.L;
            if (arrayList3 == null) {
                m.n("answers");
                throw null;
            }
            ARChar aRChar2 = (ARChar) arrayList3.get(i11);
            ((CardView) arrayList.get(i11)).setTag(aRChar2);
            View childAt = ((CardView) arrayList.get(i11)).getChildAt(0);
            m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            View childAt2 = frameLayout.getChildAt(0);
            m.d(childAt2, "null cannot be cast to non-null type android.widget.TextView");
            View childAt3 = frameLayout.getChildAt(1);
            m.d(childAt3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) childAt3;
            ((TextView) childAt2).setText(aRChar2.getCharacter());
            textView2.setText(aRChar2.getZhuyin());
            textView2.setVisibility(8);
        }
        h();
    }

    @Override // om.b
    public final void f() {
        Object objLoad = se.k.w().f55173c.load(Long.valueOf(this.f45598a));
        m.e(objLoad, "load(...)");
        this.H = (ARChar) objLoad;
        Object objLoad2 = se.k.w().f55173c.load(Long.valueOf(this.f27317f));
        m.e(objLoad2, "load(...)");
        this.K = (ARChar) objLoad2;
        ArrayList arrayList = new ArrayList();
        this.L = arrayList;
        ARChar aRChar = this.H;
        if (aRChar == null) {
            m.n("curChar");
            throw null;
        }
        arrayList.add(aRChar);
        ArrayList arrayList2 = this.L;
        if (arrayList2 == null) {
            m.n("answers");
            throw null;
        }
        ARChar aRChar2 = this.K;
        if (aRChar2 != null) {
            arrayList2.add(aRChar2);
        } else {
            m.n("randomChar");
            throw null;
        }
    }

    public final void h() {
        q qVar = fv.b.f28186a;
        ARChar aRChar = this.H;
        if (aRChar == null) {
            m.n("curChar");
            throw null;
        }
        String strD = fv.b.d(aRChar.getAudioName() + ".mp3");
        ta.a aVar = this.f45600c;
        m.c(aVar);
        this.f27316e.a((ImageView) ((g1) aVar).f32598d.f32408d, strD);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v11) {
        m.f(v11, "v");
        if (v11.getId() == R.id.card_content) {
            h();
            return;
        }
        Object tag = v11.getTag();
        m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.ARChar");
        String audioName = ((ARChar) tag).getAudioName();
        m.e(audioName, "getAudioName(...)");
        q qVar = fv.b.f28186a;
        this.f27316e.c(fv.b.d(audioName.concat(".mp3")));
        Object tag2 = v11.getTag();
        ARChar aRChar = this.H;
        if (aRChar == null) {
            m.n("curChar");
            throw null;
        }
        boolean zA = m.a(tag2, aRChar);
        n9.q qVar2 = this.f45601d;
        if (!zA) {
            Context context = this.f27318t;
            if (context == null) {
                m.n("mContext");
                throw null;
            }
            v11.startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_shake));
            View childAt = ((CardView) v11).getChildAt(0);
            m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) childAt;
            frameLayout.setBackgroundResource(R.drawable.bg_word_model_wrong);
            th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new p(9, frameLayout, this), g.f27308e), qVar2);
            return;
        }
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((CardView) arrayList.get(i11)).setClickable(false);
        }
        CardView cardView = (CardView) v11;
        cardView.getChildAt(0).setBackgroundResource(R.drawable.bg_word_model_correct);
        cardView.setTranslationZ(ff.h.l(15.0f));
        ta.a aVar = this.f45600c;
        m.c(aVar);
        ((g1) aVar).f32599e.setVisibility(8);
        ta.a aVar2 = this.f45600c;
        m.c(aVar2);
        ((g1) aVar2).f32597c.setVisibility(0);
        ta.a aVar3 = this.f45600c;
        m.c(aVar3);
        TextView textView = ((g1) aVar3).f32597c;
        ARChar aRChar2 = this.H;
        if (aRChar2 == null) {
            m.n("curChar");
            throw null;
        }
        textView.setText(aRChar2.getCharacter());
        th.j.a(qx.h.m(800L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new hd.b(this, 12), g.f27307d), qVar2);
    }
}
