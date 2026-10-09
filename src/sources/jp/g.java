package jp;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.ui.learn.adapter.AbsDialogModelAdapter;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements th.c, tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sentence f36469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f36470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f36471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f36472d;

    public g(Sentence sentence, i iVar, View view, int i11) {
        this.f36469a = sentence;
        this.f36470b = iVar;
        this.f36471c = view;
        this.f36472d = i11;
    }

    @Override // th.c, th.b
    public void a() {
        i iVar = this.f36470b;
        ArrayList arrayList = iVar.f36484n;
        ArrayList arrayList2 = iVar.f36485o;
        rx.b bVar = iVar.f36488r;
        if (bVar != null) {
            bVar.dispose();
        }
        View view = this.f36471c;
        Drawable background = ((ImageView) view.findViewById(R.id.iv_audio)).getBackground();
        kotlin.jvm.internal.m.e(background, "getBackground(...)");
        if (background instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) background;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        Sentence sentence = this.f36469a;
        if ((sentence.isHasChecked() || sentence.getModel() == null) && arrayList2.size() - 1 == this.f36472d && !iVar.f36492v) {
            if (arrayList2.size() == arrayList.size()) {
                iVar.x(2);
            } else {
                iVar.x(1);
            }
            if (iVar.f36489s) {
                iVar.f36489s = false;
                ta.a aVar = iVar.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.a) aVar).f32322e.performClick();
            }
        } else if (iVar.f36492v) {
            if (iVar.f36491u + 1 < arrayList.size()) {
                iVar.f36491u++;
                iVar.v();
            } else {
                i.u(iVar);
            }
        }
        AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
        if (absDialogModelAdapter != null) {
            absDialogModelAdapter.k(view);
        } else {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
    }

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        kotlin.jvm.internal.m.f(it, "it");
        qy.q qVar = fv.b.f28186a;
        Sentence sentence = this.f36469a;
        String strG = fv.b.G(sentence.getSentenceId(), null, null);
        boolean zD = com.google.android.material.datepicker.d.D(strG);
        int i11 = this.f36472d;
        View view = this.f36471c;
        i iVar = this.f36470b;
        if (zD) {
            th.e eVar = iVar.f36493w;
            eVar.m(iVar.f47884d.audioSpeed / 100.0f, false);
            eVar.h(strG);
            eVar.f52416c = new g(iVar, view, sentence, i11);
            FlexboxLayout flexboxLayout = (FlexboxLayout) view.findViewById(R.id.flex_sentence);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dy.j jVar = ky.e.f38937b;
            xx.f fVarH = qx.h.d(50L, 50L, timeUnit, jVar).k(jVar).g(px.b.a()).h(new ob.e(15, iVar, flexboxLayout), h.f36475b);
            th.j.a(fVarH, iVar.f47887g);
            iVar.f36488r = fVarH;
            return;
        }
        rx.b bVar = iVar.f36488r;
        ArrayList arrayList = iVar.f36484n;
        ArrayList arrayList2 = iVar.f36485o;
        if (bVar != null) {
            bVar.dispose();
        }
        Drawable background = ((ImageView) view.findViewById(R.id.iv_audio)).getBackground();
        kotlin.jvm.internal.m.e(background, "getBackground(...)");
        if (background instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) background;
            animationDrawable.selectDrawable(0);
            animationDrawable.stop();
        }
        if ((sentence.isHasChecked() || sentence.getModel() == null) && arrayList2.size() - 1 == i11 && !iVar.f36492v) {
            if (arrayList2.size() == arrayList.size()) {
                iVar.x(2);
            } else {
                iVar.x(1);
            }
            if (iVar.f36489s) {
                iVar.f36489s = false;
                ta.a aVar = iVar.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ((hj.a) aVar).f32322e.performClick();
            }
        } else if (iVar.f36492v) {
            if (iVar.f36491u + 1 < arrayList.size()) {
                iVar.f36491u++;
                iVar.v();
            } else {
                i.u(iVar);
            }
        }
        AbsDialogModelAdapter absDialogModelAdapter = iVar.f36486p;
        if (absDialogModelAdapter != null) {
            absDialogModelAdapter.k(view);
        } else {
            kotlin.jvm.internal.m.n("mAdapter");
            throw null;
        }
    }

    public g(i iVar, View view, Sentence sentence, int i11) {
        this.f36470b = iVar;
        this.f36471c = view;
        this.f36469a = sentence;
        this.f36472d = i11;
    }
}
