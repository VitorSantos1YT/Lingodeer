package qp;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.lingo.lingoskill.object.Sentence;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.RxPermissions;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f48197b;

    public /* synthetic */ t(w wVar, int i11) {
        this.f48196a = i11;
        this.f48197b = wVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws IOException {
        View it = (View) obj;
        switch (this.f48196a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                w wVar = this.f48197b;
                h hVar = wVar.f48234l;
                if (hVar == null) {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
                PopupWindow popupWindow = hVar.f59275k;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h hVar2 = wVar.f48234l;
                    if (hVar2 == null) {
                        kotlin.jvm.internal.m.n("sentenceLayout");
                        throw null;
                    }
                    PopupWindow popupWindow2 = hVar2.f59275k;
                    if (popupWindow2 != null) {
                        popupWindow2.dismiss();
                    }
                }
                return qy.b0.f48488a;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                w wVar2 = this.f48197b;
                wVar2.v();
                mp.b bVar = wVar2.f47881a;
                String strB = wVar2.b();
                ta.a aVar = wVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ImageView ivPlayer = ((hj.n1) aVar).f32958g;
                kotlin.jvm.internal.m.e(ivPlayer, "ivPlayer");
                ((jp.p0) bVar).H(ivPlayer, strB);
                break;
            case 2:
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar2 = this.f48197b.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.n1) aVar2).f32959h.performClick();
                break;
            case 3:
                kotlin.jvm.internal.m.f(it, "it");
                w wVar3 = this.f48197b;
                ta.a aVar3 = wVar3.f47886f;
                AtomicBoolean atomicBoolean = wVar3.f48239r;
                kotlin.jvm.internal.m.c(aVar3);
                android.support.v4.media.session.a.H(((hj.n1) aVar3).f32958g.getBackground());
                ta.a aVar4 = wVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.n1) aVar4).f32953b.setBackgroundResource(R.drawable.point_grey);
                ta.a aVar5 = wVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.n1) aVar5).f32958g.setEnabled(false);
                ta.a aVar6 = wVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                android.support.v4.media.session.a.H(((hj.n1) aVar6).f32957f.getBackground());
                ta.a aVar7 = wVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.n1) aVar7).f32954c.setBackgroundResource(R.drawable.point_grey);
                ta.a aVar8 = wVar3.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((hj.n1) aVar8).f32957f.setEnabled(false);
                th.e eVar = ((jp.p0) wVar3.f47881a).V;
                if (eVar != null) {
                    eVar.n();
                }
                wVar3.v();
                if (atomicBoolean.get()) {
                    ta.a aVar9 = wVar3.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((hj.n1) aVar9).f32966p.c();
                    ta.a aVar10 = wVar3.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((hj.n1) aVar10).f32966p.setVisibility(8);
                    ta.a aVar11 = wVar3.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    ((hj.n1) aVar11).f32963l.setVisibility(8);
                    ta.a aVar12 = wVar3.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    ((hj.n1) aVar12).f32962k.setVisibility(0);
                    ta.a aVar13 = wVar3.f47886f;
                    kotlin.jvm.internal.m.c(aVar13);
                    ((hj.n1) aVar13).f32959h.setVisibility(8);
                    ta.a aVar14 = wVar3.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    ((hj.n1) aVar14).f32955d.setVisibility(0);
                    ta.a aVar15 = wVar3.f47886f;
                    kotlin.jvm.internal.m.c(aVar15);
                    ((hj.n1) aVar15).f32953b.setVisibility(0);
                    ta.a aVar16 = wVar3.f47886f;
                    kotlin.jvm.internal.m.c(aVar16);
                    ((hj.n1) aVar16).f32954c.setVisibility(0);
                    atomicBoolean.set(false);
                    po.a aVar17 = wVar3.f48237p;
                    if (aVar17 != null) {
                        aVar17.c();
                        File file = new File(wVar3.f48236o);
                        if (file.exists()) {
                            av.i iVar = (av.i) wVar3.f48240s.getValue();
                            Sentence sentence = wVar3.f48233k;
                            if (sentence == null) {
                                kotlin.jvm.internal.m.n("mModel");
                                throw null;
                            }
                            String sentence2 = sentence.getSentence();
                            kotlin.jvm.internal.m.e(sentence2, "getSentence(...)");
                            Sentence sentence3 = wVar3.f48233k;
                            if (sentence3 == null) {
                                kotlin.jvm.internal.m.n("mModel");
                                throw null;
                            }
                            List<Word> sentWordsNOMF = sentence3.getSentWordsNOMF();
                            kotlin.jvm.internal.m.e(sentWordsNOMF, "getSentWordsNOMF(...)");
                            ArrayList arrayList = new ArrayList(ry.n.W(sentWordsNOMF, 10));
                            Iterator<T> it2 = sentWordsNOMF.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((Word) it2.next()).getWord());
                            }
                            iVar.b(file, sentence2, arrayList, ry.r.f50854a, new os.a(19), new u(wVar3, 0));
                        } else {
                            wVar3.u();
                        }
                    }
                } else {
                    Context context = wVar3.f47883c;
                    kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    new RxPermissions((l.m) context).request("android.permission.RECORD_AUDIO").h(new n9.q(wVar3, 12), vx.b.f54316e);
                }
                return qy.b0.f48488a;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                w wVar4 = this.f48197b;
                ta.a aVar18 = wVar4.f47886f;
                kotlin.jvm.internal.m.c(aVar18);
                android.support.v4.media.session.a.K(((hj.n1) aVar18).f32957f.getBackground());
                jp.p0 p0Var = (jp.p0) wVar4.f47881a;
                th.e eVar2 = p0Var.V;
                if (eVar2 != null) {
                    eVar2.n();
                }
                ta.a aVar19 = wVar4.f47886f;
                kotlin.jvm.internal.m.c(aVar19);
                ((hj.n1) aVar19).f32957f.setEnabled(false);
                th.e eVar3 = p0Var.V;
                if (eVar3 != null) {
                    eVar3.f52416c = new lp.j(wVar4, 13);
                }
                if (eVar3 != null) {
                    eVar3.h(wVar4.f48236o);
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
