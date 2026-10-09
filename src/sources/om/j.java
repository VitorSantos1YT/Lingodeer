package om;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bq.z;
import bt.n1;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.JPChar;
import com.lingo.lingoskill.object.JPCharDao;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import hj.p6;
import java.util.ArrayList;
import java.util.Collections;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class j extends b {
    public Context H;
    public final JPCharDao K;
    public final ArrayList L;
    public CardView M;
    public final ArrayList N;
    public final ArrayList O;
    public int P;
    public boolean Q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nm.b f45614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Env f45615f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f45616t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nm.b bVar, Env mEnv, ArrayList arrayList) {
        super(0L);
        kotlin.jvm.internal.m.f(mEnv, "mEnv");
        this.f45614e = bVar;
        this.f45615f = mEnv;
        this.f45616t = arrayList;
        if (ij.d.f34419e == null) {
            synchronized (ij.d.class) {
                if (ij.d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    ij.d.f34419e = new ij.d(lingoSkillApplication);
                }
            }
        }
        kotlin.jvm.internal.m.c(ij.d.f34419e);
        this.K = ij.d.i();
        this.L = new ArrayList();
        this.N = new ArrayList();
        this.O = new ArrayList();
    }

    public static void h(CardView cardView) {
        ((FrameLayout) cardView.findViewById(R.id.frame_layout)).setVisibility(8);
    }

    @Override // om.b
    public final fz.f c() {
        return i.f45613a;
    }

    @Override // om.b
    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.L;
        if (arrayList2.size() == 0) {
            return;
        }
        boolean z11 = false;
        this.f45614e.f43850a.x(0);
        Context context = d().getContext();
        kotlin.jvm.internal.m.e(context, "getContext(...)");
        this.H = context;
        Collections.shuffle(arrayList2);
        ta.a aVar = this.f45600c;
        kotlin.jvm.internal.m.c(aVar);
        int childCount = ((p6) aVar).f33101b.getChildCount();
        int i11 = 0;
        while (true) {
            arrayList = this.N;
            if (i11 >= childCount) {
                break;
            }
            ta.a aVar2 = this.f45600c;
            kotlin.jvm.internal.m.c(aVar2);
            View childAt = ((p6) aVar2).f33101b.getChildAt(i11);
            kotlin.jvm.internal.m.d(childAt, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            CardView cardView = (CardView) childAt;
            cardView.setCardElevation(ff.h.l(2.0f));
            JPChar jPChar = (JPChar) arrayList2.get(i11);
            cardView.setTag(arrayList2.get(i11));
            cardView.setTag(R.id.tag_word, Boolean.TRUE);
            View viewFindViewById = cardView.findViewById(R.id.tv_top);
            kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
            View viewFindViewById2 = cardView.findViewById(R.id.tv_middle);
            kotlin.jvm.internal.m.e(viewFindViewById2, "findViewById(...)");
            View viewFindViewById3 = cardView.findViewById(R.id.tv_bottom);
            kotlin.jvm.internal.m.e(viewFindViewById3, "findViewById(...)");
            j(jPChar, (TextView) viewFindViewById, (TextView) viewFindViewById2, (TextView) viewFindViewById3);
            z.b(cardView, new n1((Object) cardView, (Object) this, true, 7));
            arrayList.add(cardView);
            i11++;
        }
        Collections.shuffle(arrayList2);
        ta.a aVar3 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar3);
        int childCount2 = ((p6) aVar3).f33102c.getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            ta.a aVar4 = this.f45600c;
            kotlin.jvm.internal.m.c(aVar4);
            View childAt2 = ((p6) aVar4).f33102c.getChildAt(i12);
            kotlin.jvm.internal.m.d(childAt2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            CardView cardView2 = (CardView) childAt2;
            cardView2.setCardElevation(ff.h.l(2.0f));
            JPChar jPChar2 = (JPChar) arrayList2.get(i12);
            cardView2.setTag(jPChar2);
            cardView2.setTag(R.id.tag_word, Boolean.FALSE);
            View viewFindViewById4 = cardView2.findViewById(R.id.tv_middle);
            kotlin.jvm.internal.m.e(viewFindViewById4, "findViewById(...)");
            k(jPChar2, (TextView) viewFindViewById4);
            z.b(cardView2, new n1(cardView2, this, z11, 7));
            arrayList.add(cardView2);
        }
        ta.a aVar5 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar5);
        ((p6) aVar5).f33104e.setResOpen(R.drawable.ic_play_switch_close);
        ta.a aVar6 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar6);
        ((p6) aVar6).f33104e.setResClose(R.drawable.ic_play_switch_open);
        ta.a aVar7 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar7);
        SlowPlaySwitchBtn slowPlaySwitchBtn = ((p6) aVar7).f33104e;
        Env env = this.f45615f;
        slowPlaySwitchBtn.setChecked(env.wordModel6AudioSwitch);
        ta.a aVar8 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar8);
        ((p6) aVar8).f33104e.b();
        this.Q = env.wordModel6AudioSwitch;
        ta.a aVar9 = this.f45600c;
        kotlin.jvm.internal.m.c(aVar9);
        z.b(((p6) aVar9).f33104e, new kp.j(this, 27));
    }

    @Override // om.b
    public final void f() {
        ArrayList arrayList = this.f45616t;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.L;
            if (i11 >= size) {
                Collections.shuffle(arrayList2);
                return;
            }
            Object obj = arrayList.get(i11);
            i11++;
            Object objLoad = this.K.load(Long.valueOf(((Number) obj).longValue()));
            kotlin.jvm.internal.m.e(objLoad, "load(...)");
            arrayList2.add(objLoad);
        }
    }

    public final void i(String str) {
        q qVar = fv.b.f28186a;
        kotlin.jvm.internal.m.c(str);
        this.f45614e.a(fv.b.c(str, null, null));
    }

    public void j(JPChar option, TextView textView, TextView textView2, TextView textView3) {
        kotlin.jvm.internal.m.f(option, "option");
        um.c.a(textView2);
        textView.setVisibility(8);
        textView3.setVisibility(8);
        if (this.f45615f.isPing) {
            textView2.setText(option.getPing());
        } else {
            textView2.setText(option.getPian());
        }
    }

    public void k(JPChar option, TextView textView) {
        kotlin.jvm.internal.m.f(option, "option");
        textView.setText(option.getDisplayLuoMa());
    }

    public void l(JPChar jPChar, TextView textView, TextView textView2, TextView textView3) {
        um.c.a(textView2);
        textView.setVisibility(8);
        if (this.f45615f.isPing) {
            textView2.setText(jPChar.getPing());
        } else {
            textView2.setText(jPChar.getPian());
        }
        k(jPChar, textView3);
    }
}
