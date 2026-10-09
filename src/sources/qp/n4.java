package qp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class n4 extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f48080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f48081l;
    public ArrayList m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f48082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f48084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f48085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f48086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qy.q f48087s;

    public n4(mp.b bVar, long j11, List list) {
        super(bVar, j11, 1);
        this.f48080k = list;
        this.f48082n = new ArrayList();
        this.f48086r = BuildConfig.VERSION_NAME;
        this.f48087s = com.bumptech.glide.d.v(new dt.k2(this, j11, 5));
    }

    public static void u(View view) {
        ((FrameLayout) view.findViewById(R.id.frame_layout)).setVisibility(8);
    }

    public void A(TextView textView) {
        ff.h.L(this.f47883c, textView, 20);
    }

    public void B(Word word, TextView textView, TextView textView2, TextView textView3) {
        A(textView2);
        zq.c.e(word, textView, textView2, textView3, true);
        textView3.setVisibility(0);
        textView3.setText(word.getTranslations());
    }

    @Override // qp.a, hi.a
    public final boolean a() {
        return false;
    }

    @Override // hi.a
    public final String b() {
        return this.f48086r;
    }

    @Override // qp.a, hi.a
    public String c() {
        return (String) this.f48087s.getValue();
    }

    @Override // hi.a
    public List g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = v().iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Word word = (Word) it.next();
            qy.q qVar = fv.b.f28186a;
            arrayList.add(new fv.a(2L, fv.b.Z(word.getWordId()), fv.b.V(word.getWordId())));
        }
        return arrayList;
    }

    @Override // hi.a
    public int i() {
        return 0;
    }

    @Override // hi.a
    public void j() throws NoSuchElemException {
        List listW = w();
        if (listW == null) {
            throw new NoSuchElemException();
        }
        this.f48081l = new ArrayList();
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            Word wordH = ij.c.h(((Number) it.next()).longValue());
            if (wordH != null) {
                v().add(wordH);
            }
        }
        if (v().isEmpty()) {
            throw new NoSuchElemException();
        }
    }

    @Override // hi.a
    public final void k() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            kotlin.jvm.internal.m.n("views");
            throw null;
        }
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            kotlin.jvm.internal.m.e(obj, "next(...)");
            View view = (View) obj;
            Object tag = view.getTag();
            kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            Word word = (Word) tag;
            Object tag2 = view.getTag(R.id.tag_word);
            kotlin.jvm.internal.m.d(tag2, "null cannot be cast to non-null type kotlin.Boolean");
            if (((Boolean) tag2).booleanValue()) {
                TextView textView = (TextView) view.findViewById(R.id.tv_top);
                TextView textView2 = (TextView) view.findViewById(R.id.tv_middle);
                TextView textView3 = (TextView) view.findViewById(R.id.tv_bottom);
                kotlin.jvm.internal.m.c(textView);
                kotlin.jvm.internal.m.c(textView2);
                kotlin.jvm.internal.m.c(textView3);
                y(word, textView, textView2, textView3);
            }
        }
        ArrayList arrayList2 = this.f48082n;
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            kotlin.jvm.internal.m.e(obj2, "next(...)");
            View view2 = (View) obj2;
            Object tag3 = view2.getTag();
            kotlin.jvm.internal.m.d(tag3, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
            TextView textView4 = (TextView) view2.findViewById(R.id.tv_top);
            TextView textView5 = (TextView) view2.findViewById(R.id.tv_middle);
            TextView textView6 = (TextView) view2.findViewById(R.id.tv_bottom);
            kotlin.jvm.internal.m.c(textView4);
            kotlin.jvm.internal.m.c(textView5);
            kotlin.jvm.internal.m.c(textView6);
            B((Word) tag3, textView4, textView5, textView6);
        }
    }

    @Override // qp.d
    public fz.f n() {
        return l4.f48045a;
    }

    @Override // qp.d
    public final void p() throws Throwable {
        boolean z11 = false;
        this.f48085q = false;
        boolean z12 = true;
        ((jp.p0) this.f47881a).O(1);
        Collections.shuffle(v());
        int size = v().size();
        Context context = this.f47883c;
        if (size == 3) {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            LinearLayout linearLayout = ((hj.a3) aVar).f32339c;
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            LinearLayout linearLayout2 = ((hj.a3) aVar2).f32340d;
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            LinearLayout[] linearLayoutArr = {linearLayout, linearLayout2, ((hj.a3) aVar3).f32341e};
            for (int i11 = 0; i11 < 3; i11++) {
                LinearLayout linearLayout3 = linearLayoutArr[i11];
                kotlin.jvm.internal.m.c(linearLayout3);
                linearLayout3.removeViewAt(3);
                ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                layoutParams.height = (int) ((context.getResources().getDimension(R.dimen.dp_16) + context.getResources().getDimension(R.dimen.dp_80)) * 3);
                linearLayout3.setLayoutParams(layoutParams);
            }
        }
        if (v().size() == 2) {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            LinearLayout linearLayout4 = ((hj.a3) aVar4).f32339c;
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            LinearLayout linearLayout5 = ((hj.a3) aVar5).f32340d;
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            LinearLayout[] linearLayoutArr2 = {linearLayout4, linearLayout5, ((hj.a3) aVar6).f32341e};
            for (int i12 = 0; i12 < 3; i12++) {
                LinearLayout linearLayout6 = linearLayoutArr2[i12];
                kotlin.jvm.internal.m.c(linearLayout6);
                linearLayout6.removeViewAt(3);
                linearLayout6.removeViewAt(2);
                ViewGroup.LayoutParams layoutParams2 = linearLayout6.getLayoutParams();
                layoutParams2.height = (int) ((context.getResources().getDimension(R.dimen.dp_16) + context.getResources().getDimension(R.dimen.dp_80)) * 2);
                linearLayout6.setLayoutParams(layoutParams2);
            }
        }
        this.m = new ArrayList();
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        int childCount = ((hj.a3) aVar7).f32339c.getChildCount();
        int i13 = 0;
        while (true) {
            Throwable th2 = null;
            String str = "views";
            if (i13 >= childCount) {
                Collections.shuffle(v());
                ta.a aVar8 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                int childCount2 = ((hj.a3) aVar8).f32340d.getChildCount();
                int i14 = 0;
                while (i14 < childCount2) {
                    ta.a aVar9 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    View childAt = ((hj.a3) aVar9).f32340d.getChildAt(i14);
                    kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                    CardView cardView = (CardView) childAt;
                    cardView.setCardElevation(ff.h.l(2.0f));
                    Object obj = v().get(i14);
                    kotlin.jvm.internal.m.e(obj, "get(...)");
                    Word word = (Word) obj;
                    cardView.setTag(word);
                    cardView.setTag(R.id.tag_word, Boolean.FALSE);
                    TextView textView = (TextView) cardView.findViewById(R.id.tv_middle);
                    textView.setText(word.getTranslations());
                    Throwable th3 = th2;
                    String str2 = str;
                    textView.postDelayed(new b2.c(4, textView, new w0(textView, 4)), 0L);
                    bq.z.b(cardView, new bt.n1(cardView, this, z11, 10));
                    ArrayList arrayList = this.m;
                    if (arrayList == null) {
                        kotlin.jvm.internal.m.n(str2);
                        throw th3;
                    }
                    arrayList.add(cardView);
                    i14++;
                    th2 = th3;
                    str = str2;
                }
                ta.a aVar10 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                ((SlowPlaySwitchBtn) ((hj.a3) aVar10).f32338b.f32490c).setResOpen(R.drawable.ic_play_switch_close);
                ta.a aVar11 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                ((SlowPlaySwitchBtn) ((hj.a3) aVar11).f32338b.f32490c).setResClose(R.drawable.ic_play_switch_open);
                ta.a aVar12 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                SlowPlaySwitchBtn slowPlaySwitchBtn = (SlowPlaySwitchBtn) ((hj.a3) aVar12).f32338b.f32490c;
                Env env = this.f47884d;
                slowPlaySwitchBtn.setChecked(env.wordModel6AudioSwitch);
                ta.a aVar13 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                ((SlowPlaySwitchBtn) ((hj.a3) aVar13).f32338b.f32490c).b();
                this.f48084p = env.wordModel6AudioSwitch;
                ta.a aVar14 = this.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                bq.z.b((SlowPlaySwitchBtn) ((hj.a3) aVar14).f32338b.f32490c, new ot.e2(this, 14));
                if (env.isAudioModel) {
                    ta.a aVar15 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar15);
                    ((SlowPlaySwitchBtn) ((hj.a3) aVar15).f32338b.f32490c).setVisibility(0);
                } else {
                    ta.a aVar16 = this.f47886f;
                    kotlin.jvm.internal.m.c(aVar16);
                    ((SlowPlaySwitchBtn) ((hj.a3) aVar16).f32338b.f32490c).setVisibility(8);
                }
                ef.e.B(o());
                return;
            }
            ta.a aVar17 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar17);
            View childAt2 = ((hj.a3) aVar17).f32339c.getChildAt(i13);
            kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            CardView cardView2 = (CardView) childAt2;
            cardView2.setCardElevation(ff.h.l(2.0f));
            Object obj2 = v().get(i13);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            cardView2.setTag(v().get(i13));
            cardView2.setTag(R.id.tag_word, Boolean.TRUE);
            TextView textView2 = (TextView) cardView2.findViewById(R.id.tv_top);
            TextView textView3 = (TextView) cardView2.findViewById(R.id.tv_middle);
            TextView textView4 = (TextView) cardView2.findViewById(R.id.tv_bottom);
            kotlin.jvm.internal.m.c(textView2);
            kotlin.jvm.internal.m.c(textView3);
            kotlin.jvm.internal.m.c(textView4);
            y((Word) obj2, textView2, textView3, textView4);
            bq.z.b(cardView2, new bt.n1(cardView2, this, z12, 10));
            ArrayList arrayList2 = this.m;
            if (arrayList2 == null) {
                kotlin.jvm.internal.m.n("views");
                throw null;
            }
            arrayList2.add(cardView2);
            i13++;
        }
    }

    public final ArrayList v() {
        ArrayList arrayList = this.f48081l;
        if (arrayList != null) {
            return arrayList;
        }
        kotlin.jvm.internal.m.n("options");
        throw null;
    }

    public List w() {
        return this.f48080k;
    }

    public void x(Word word) {
        qy.q qVar = fv.b.f28186a;
        ((jp.p0) this.f47881a).I(fv.b.Y(word.getWordId(), null, null));
    }

    public void y(Word word, TextView textView, TextView textView2, TextView textView3) {
        zq.c.e(word, textView, textView2, textView3, true);
        textView2.postDelayed(new b2.c(4, textView2, new k4(this, textView2)), 0L);
        textView.postDelayed(new b2.c(4, textView, new w0(textView, 3)), 0L);
    }

    public void z(TextView textView) {
        try {
            v10.c.G(textView);
            ff.h.L(this.f47883c, textView, 20);
            textView.postDelayed(new b2.c(4, textView, new k4(textView, this)), 0L);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
