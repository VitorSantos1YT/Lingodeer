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
public final /* synthetic */ class n0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f48070b;

    public /* synthetic */ n0(p0 p0Var, int i11) {
        this.f48069a = i11;
        this.f48070b = p0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws IOException {
        View it = (View) obj;
        switch (this.f48069a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                p0 p0Var = this.f48070b;
                h hVar = p0Var.f48106l;
                if (hVar == null) {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
                PopupWindow popupWindow = hVar.f59275k;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h hVar2 = p0Var.f48106l;
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
                p0 p0Var2 = this.f48070b;
                p0Var2.v();
                mp.b bVar = p0Var2.f47881a;
                String strB = p0Var2.b();
                ta.a aVar = p0Var2.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ImageView ivPlayer = ((hj.n1) aVar).f32958g;
                kotlin.jvm.internal.m.e(ivPlayer, "ivPlayer");
                ((jp.p0) bVar).H(ivPlayer, strB);
                break;
            case 2:
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar2 = this.f48070b.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.n1) aVar2).f32959h.performClick();
                break;
            case 3:
                kotlin.jvm.internal.m.f(it, "it");
                p0 p0Var3 = this.f48070b;
                ta.a aVar3 = p0Var3.f47886f;
                AtomicBoolean atomicBoolean = p0Var3.f48110q;
                kotlin.jvm.internal.m.c(aVar3);
                android.support.v4.media.session.a.H(((hj.n1) aVar3).f32958g.getBackground());
                ta.a aVar4 = p0Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.n1) aVar4).f32953b.setBackgroundResource(R.drawable.point_grey);
                ta.a aVar5 = p0Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.n1) aVar5).f32958g.setEnabled(false);
                ta.a aVar6 = p0Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                android.support.v4.media.session.a.H(((hj.n1) aVar6).f32957f.getBackground());
                ta.a aVar7 = p0Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.n1) aVar7).f32954c.setBackgroundResource(R.drawable.point_grey);
                ta.a aVar8 = p0Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((hj.n1) aVar8).f32957f.setEnabled(false);
                th.e eVar = ((jp.p0) p0Var3.f47881a).V;
                if (eVar != null) {
                    eVar.n();
                }
                p0Var3.v();
                if (atomicBoolean.get()) {
                    ta.a aVar9 = p0Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((hj.n1) aVar9).f32966p.c();
                    ta.a aVar10 = p0Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((hj.n1) aVar10).f32966p.setVisibility(8);
                    ta.a aVar11 = p0Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    ((hj.n1) aVar11).f32963l.setVisibility(8);
                    ta.a aVar12 = p0Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    ((hj.n1) aVar12).f32962k.setVisibility(0);
                    ta.a aVar13 = p0Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar13);
                    ((hj.n1) aVar13).f32959h.setVisibility(8);
                    ta.a aVar14 = p0Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    ((hj.n1) aVar14).f32955d.setVisibility(0);
                    ta.a aVar15 = p0Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar15);
                    ((hj.n1) aVar15).f32953b.setVisibility(0);
                    ta.a aVar16 = p0Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar16);
                    ((hj.n1) aVar16).f32954c.setVisibility(0);
                    atomicBoolean.set(false);
                    po.a aVar17 = p0Var3.f48109p;
                    if (aVar17 != null) {
                        aVar17.c();
                        File file = new File(p0Var3.f48108o);
                        if (file.exists()) {
                            av.i iVar = (av.i) p0Var3.f48112s.getValue();
                            Sentence sentence = p0Var3.f48105k;
                            if (sentence == null) {
                                kotlin.jvm.internal.m.n("mModel");
                                throw null;
                            }
                            String sentence2 = sentence.getSentence();
                            kotlin.jvm.internal.m.e(sentence2, "getSentence(...)");
                            Sentence sentence3 = p0Var3.f48105k;
                            if (sentence3 == null) {
                                kotlin.jvm.internal.m.n("mModel");
                                throw null;
                            }
                            List<Word> sentWords = sentence3.getSentWords();
                            kotlin.jvm.internal.m.e(sentWords, "getSentWords(...)");
                            ArrayList arrayList = new ArrayList(ry.n.W(sentWords, 10));
                            Iterator<T> it2 = sentWords.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((Word) it2.next()).getWord());
                            }
                            iVar.b(file, sentence2, arrayList, ry.r.f50854a, new os.a(20), new m0(p0Var3, 1));
                        } else {
                            p0Var3.u();
                        }
                    }
                } else {
                    Context context = p0Var3.f47883c;
                    kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    new RxPermissions((l.m) context).request("android.permission.RECORD_AUDIO").h(new n9.q(p0Var3, 13), vx.b.f54316e);
                }
                return qy.b0.f48488a;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                p0 p0Var4 = this.f48070b;
                ta.a aVar18 = p0Var4.f47886f;
                kotlin.jvm.internal.m.c(aVar18);
                android.support.v4.media.session.a.K(((hj.n1) aVar18).f32957f.getBackground());
                jp.p0 p0Var5 = (jp.p0) p0Var4.f47881a;
                th.e eVar2 = p0Var5.V;
                if (eVar2 != null) {
                    eVar2.n();
                }
                ta.a aVar19 = p0Var4.f47886f;
                kotlin.jvm.internal.m.c(aVar19);
                ((hj.n1) aVar19).f32957f.setEnabled(false);
                th.e eVar3 = p0Var5.V;
                if (eVar3 != null) {
                    eVar3.f52416c = new lp.j(p0Var4, 14);
                }
                if (eVar3 != null) {
                    eVar3.h(p0Var4.f48108o);
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
