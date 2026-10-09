package om;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.JPCharDao;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwCharThumbView;
import com.lingodeer.data.env.Env;
import hj.o6;
import hj.r6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import ob.u;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends b implements View.OnClickListener {
    public final long H;
    public Context K;
    public JPChar L;
    public JPChar M;
    public final ArrayList N;
    public final JPCharDao O;
    public final ArrayList P;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nm.b f45611f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Env f45612t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nm.b bVar, Env env, int i11, long j11, int i12) {
        super(i11);
        this.f45610e = i12;
        switch (i12) {
            case 1:
                kotlin.jvm.internal.m.f(env, "env");
                super(i11);
                this.f45611f = bVar;
                this.f45612t = env;
                this.H = j11;
                this.N = new ArrayList();
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication);
                            ij.d.f34419e = new ij.d(lingoSkillApplication);
                        }
                        break;
                    }
                }
                kotlin.jvm.internal.m.c(ij.d.f34419e);
                this.O = ij.d.i();
                this.P = new ArrayList();
                return;
            default:
                kotlin.jvm.internal.m.f(env, "env");
                this.f45611f = bVar;
                this.f45612t = env;
                this.H = j11;
                this.N = new ArrayList();
                this.P = new ArrayList();
                if (ij.d.f34419e == null) {
                    synchronized (ij.d.class) {
                        if (ij.d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            kotlin.jvm.internal.m.c(lingoSkillApplication2);
                            ij.d.f34419e = new ij.d(lingoSkillApplication2);
                        }
                        break;
                    }
                }
                kotlin.jvm.internal.m.c(ij.d.f34419e);
                this.O = ij.d.i();
                return;
        }
    }

    @Override // om.b
    public final fz.f c() {
        switch (this.f45610e) {
            case 0:
                return g.f45609a;
            default:
                return f.f45608a;
        }
    }

    @Override // om.b
    public final void e() {
        switch (this.f45610e) {
            case 0:
                this.f45611f.f43850a.x(1);
                Context context = d().getContext();
                kotlin.jvm.internal.m.e(context, "getContext(...)");
                this.K = context;
                ta.a aVar = this.f45600c;
                kotlin.jvm.internal.m.c(aVar);
                ((o6) aVar).f33049d.setOnClickListener(this);
                ta.a aVar2 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar2);
                ((o6) aVar2).f33050e.setOnClickListener(this);
                ta.a aVar3 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar3);
                ((o6) aVar3).f33047b.setOnClickListener(this);
                ta.a aVar4 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar4);
                CardView cardView = ((o6) aVar4).f33049d;
                ArrayList arrayList = this.P;
                arrayList.add(cardView);
                ta.a aVar5 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar5);
                arrayList.add(((o6) aVar5).f33050e);
                ta.a aVar6 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar6);
                TextView textView = ((o6) aVar6).f33051f;
                JPChar jPChar = this.L;
                if (jPChar == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                textView.setText(jPChar.getDisplayLuoMa());
                ta.a aVar7 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar7);
                HwCharThumbView hwCharThumbView = ((o6) aVar7).f33048c;
                JPChar jPChar2 = this.L;
                if (jPChar2 == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                hwCharThumbView.setAHanzi(jPChar2.getCharPath());
                ArrayList arrayList2 = this.N;
                Collections.shuffle(arrayList2);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((CardView) arrayList.get(i11)).setTag(arrayList2.get(i11));
                    View childAt = ((CardView) arrayList.get(i11)).getChildAt(0);
                    kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
                    View childAt2 = ((FrameLayout) childAt).getChildAt(0);
                    kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) childAt2;
                    um.c.a(textView2);
                    if (this.f45612t.isPing) {
                        textView2.setText(((JPChar) arrayList2.get(i11)).getPian());
                    } else {
                        textView2.setText(((JPChar) arrayList2.get(i11)).getPing());
                    }
                }
                return;
            default:
                this.f45611f.f43850a.x(1);
                Context context2 = d().getContext();
                kotlin.jvm.internal.m.e(context2, "getContext(...)");
                this.K = context2;
                ta.a aVar8 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar8);
                ((r6) aVar8).f33243f.setOnClickListener(this);
                ta.a aVar9 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar9);
                ((r6) aVar9).f33244g.setOnClickListener(this);
                ta.a aVar10 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar10);
                ((r6) aVar10).f33239b.setOnClickListener(this);
                ta.a aVar11 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar11);
                CardView cardView2 = ((r6) aVar11).f33243f;
                ArrayList arrayList3 = this.P;
                arrayList3.add(cardView2);
                ta.a aVar12 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar12);
                arrayList3.add(((r6) aVar12).f33244g);
                ta.a aVar13 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar13);
                TextView textView3 = ((r6) aVar13).f33245h;
                JPChar jPChar3 = this.L;
                if (jPChar3 == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                textView3.setText(jPChar3.getDisplayLuoMa());
                ArrayList arrayList4 = this.N;
                Collections.shuffle(arrayList4);
                int size2 = arrayList3.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((CardView) arrayList3.get(i12)).setTag(arrayList4.get(i12));
                    View childAt3 = ((CardView) arrayList3.get(i12)).getChildAt(0);
                    kotlin.jvm.internal.m.d(childAt3, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout = (FrameLayout) childAt3;
                    View childAt4 = frameLayout.getChildAt(0);
                    kotlin.jvm.internal.m.d(childAt4, "null cannot be cast to non-null type com.lingodeer.course.stroke_order_view_new.old.HwCharThumbView");
                    View childAt5 = frameLayout.getChildAt(1);
                    kotlin.jvm.internal.m.d(childAt5, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView4 = (TextView) childAt5;
                    ((HwCharThumbView) childAt4).setAHanzi(((JPChar) arrayList4.get(i12)).getCharPath());
                    um.c.a(textView4);
                    if (this.f45612t.isPing) {
                        textView4.setText(((JPChar) arrayList4.get(i12)).getPian());
                    } else {
                        textView4.setText(((JPChar) arrayList4.get(i12)).getPing());
                    }
                }
                h();
                return;
        }
    }

    @Override // om.b
    public final void f() {
        switch (this.f45610e) {
            case 0:
                Long lValueOf = Long.valueOf(this.f45598a);
                JPCharDao jPCharDao = this.O;
                Object objLoad = jPCharDao.load(lValueOf);
                kotlin.jvm.internal.m.e(objLoad, "load(...)");
                this.L = (JPChar) objLoad;
                Object objLoad2 = jPCharDao.load(Long.valueOf(this.H));
                kotlin.jvm.internal.m.e(objLoad2, "load(...)");
                this.M = (JPChar) objLoad2;
                JPChar jPChar = this.L;
                if (jPChar == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                ArrayList arrayList = this.N;
                arrayList.add(jPChar);
                JPChar jPChar2 = this.M;
                if (jPChar2 != null) {
                    arrayList.add(jPChar2);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("randomChar");
                    throw null;
                }
            default:
                Long lValueOf2 = Long.valueOf(this.f45598a);
                JPCharDao jPCharDao2 = this.O;
                Object objLoad3 = jPCharDao2.load(lValueOf2);
                kotlin.jvm.internal.m.e(objLoad3, "load(...)");
                this.L = (JPChar) objLoad3;
                Object objLoad4 = jPCharDao2.load(Long.valueOf(this.H));
                kotlin.jvm.internal.m.e(objLoad4, "load(...)");
                this.M = (JPChar) objLoad4;
                JPChar jPChar3 = this.L;
                if (jPChar3 == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                ArrayList arrayList2 = this.N;
                arrayList2.add(jPChar3);
                JPChar jPChar4 = this.M;
                if (jPChar4 != null) {
                    arrayList2.add(jPChar4);
                    return;
                } else {
                    kotlin.jvm.internal.m.n("randomChar");
                    throw null;
                }
        }
    }

    public void h() {
        q qVar = fv.b.f28186a;
        JPChar jPChar = this.L;
        if (jPChar == null) {
            kotlin.jvm.internal.m.n("jpChar");
            throw null;
        }
        String displayLuoMa = jPChar.getDisplayLuoMa();
        kotlin.jvm.internal.m.e(displayLuoMa, "getDisplayLuoMa(...)");
        String path = fv.b.c(displayLuoMa, null, null);
        ta.a aVar = this.f45600c;
        kotlin.jvm.internal.m.c(aVar);
        ImageView imageView = (ImageView) ((r6) aVar).f33241d.f32408d;
        nm.b bVar = this.f45611f;
        a9.i iVar = bVar.H;
        kotlin.jvm.internal.m.f(path, "path");
        kotlin.jvm.internal.m.f(imageView, "imageView");
        bq.d dVar = bVar.K;
        if (dVar != null) {
            dVar.k(0);
        }
        bVar.K = new dn.b(imageView, 3);
        android.support.v4.media.session.a.H(imageView.getBackground());
        if (new File(path).exists()) {
            iVar.y();
            iVar.f520d = bVar.K;
            iVar.v(path);
            android.support.v4.media.session.a.K(imageView.getBackground());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v11) {
        int i11 = this.f45610e;
        nm.b bVar = this.f45611f;
        ArrayList arrayList = this.P;
        n9.q qVar = this.f45601d;
        kotlin.jvm.internal.m.f(v11, "v");
        switch (i11) {
            case 0:
                if (v11.getId() == R.id.card_content) {
                    q qVar2 = fv.b.f28186a;
                    JPChar jPChar = this.L;
                    if (jPChar == null) {
                        kotlin.jvm.internal.m.n("jpChar");
                        throw null;
                    }
                    String displayLuoMa = jPChar.getDisplayLuoMa();
                    kotlin.jvm.internal.m.e(displayLuoMa, "getDisplayLuoMa(...)");
                    bVar.a(fv.b.c(displayLuoMa, null, null));
                    return;
                }
                Object tag = v11.getTag();
                JPChar jPChar2 = tag instanceof JPChar ? (JPChar) tag : null;
                if (jPChar2 == null) {
                    return;
                }
                String displayLuoMa2 = jPChar2.getDisplayLuoMa();
                kotlin.jvm.internal.m.e(displayLuoMa2, "getDisplayLuoMa(...)");
                q qVar3 = fv.b.f28186a;
                bVar.a(fv.b.c(displayLuoMa2, null, null));
                JPChar jPChar3 = this.L;
                if (jPChar3 == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                if (jPChar2.equals(jPChar3)) {
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((CardView) arrayList.get(i12)).setClickable(false);
                    }
                    CardView cardView = (CardView) v11;
                    cardView.getChildAt(0).setBackgroundResource(R.drawable.bg_word_model_correct);
                    cardView.setTranslationZ(ff.h.l(8.0f));
                    th.j.a(qx.h.m(800L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(this, 2), a.f45594e), qVar);
                    return;
                }
                Context context = this.K;
                if (context == null) {
                    kotlin.jvm.internal.m.n("mContext");
                    throw null;
                }
                v11.startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_shake));
                View childAt = ((CardView) v11).getChildAt(0);
                kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type android.widget.FrameLayout");
                FrameLayout frameLayout = (FrameLayout) childAt;
                frameLayout.setBackgroundResource(R.drawable.bg_word_model_wrong);
                th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new b1.p(25, frameLayout, this), a.f45595f), qVar);
                return;
            default:
                if (v11.getId() == R.id.card_content) {
                    h();
                    return;
                }
                Object tag2 = v11.getTag();
                JPChar jPChar4 = tag2 instanceof JPChar ? (JPChar) tag2 : null;
                if (jPChar4 == null) {
                    return;
                }
                String displayLuoMa3 = jPChar4.getDisplayLuoMa();
                kotlin.jvm.internal.m.e(displayLuoMa3, "getDisplayLuoMa(...)");
                q qVar4 = fv.b.f28186a;
                bVar.a(fv.b.c(displayLuoMa3, null, null));
                JPChar jPChar5 = this.L;
                if (jPChar5 == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                if (!jPChar4.equals(jPChar5)) {
                    Context context2 = this.K;
                    if (context2 == null) {
                        kotlin.jvm.internal.m.n("mContext");
                        throw null;
                    }
                    v11.startAnimation(AnimationUtils.loadAnimation(context2, R.anim.anim_shake));
                    View childAt2 = ((CardView) v11).getChildAt(0);
                    kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type android.widget.FrameLayout");
                    FrameLayout frameLayout2 = (FrameLayout) childAt2;
                    frameLayout2.setBackgroundResource(R.drawable.bg_word_model_wrong);
                    th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new u(24, frameLayout2, this), a.f45593d), qVar);
                    return;
                }
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((CardView) arrayList.get(i13)).setClickable(false);
                }
                CardView cardView2 = (CardView) v11;
                cardView2.getChildAt(0).setBackgroundResource(R.drawable.bg_word_model_correct);
                cardView2.setTranslationZ(ff.h.l(15.0f));
                ta.a aVar = this.f45600c;
                kotlin.jvm.internal.m.c(aVar);
                int i14 = 8;
                ((r6) aVar).f33242e.setVisibility(8);
                ta.a aVar2 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar2);
                ((r6) aVar2).f33240c.setVisibility(0);
                ta.a aVar3 = this.f45600c;
                kotlin.jvm.internal.m.c(aVar3);
                HwCharThumbView hwCharThumbView = ((r6) aVar3).f33240c;
                JPChar jPChar6 = this.L;
                if (jPChar6 == null) {
                    kotlin.jvm.internal.m.n("jpChar");
                    throw null;
                }
                hwCharThumbView.setAHanzi(jPChar6.getCharPath());
                th.j.a(qx.h.m(800L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(this, i14), a.f45592c), qVar);
                return;
        }
    }
}
