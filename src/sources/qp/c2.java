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
public final /* synthetic */ class c2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f47871b;

    public /* synthetic */ c2(f2 f2Var, int i11) {
        this.f47870a = i11;
        this.f47871b = f2Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws IOException {
        View it = (View) obj;
        switch (this.f47870a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                f2 f2Var = this.f47871b;
                f2Var.v();
                mp.b bVar = f2Var.f47881a;
                String strB = f2Var.b();
                ta.a aVar = f2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ImageView ivPlayer = ((hj.n2) aVar).f32973g;
                kotlin.jvm.internal.m.e(ivPlayer, "ivPlayer");
                ((jp.p0) bVar).H(ivPlayer, strB);
                break;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                f2 f2Var2 = this.f47871b;
                h hVar = f2Var2.f47924l;
                if (hVar == null) {
                    kotlin.jvm.internal.m.n("sentenceLayout");
                    throw null;
                }
                PopupWindow popupWindow = hVar.f59275k;
                if (popupWindow != null && popupWindow.isShowing()) {
                    h hVar2 = f2Var2.f47924l;
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
            case 2:
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar2 = this.f47871b.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ((hj.n2) aVar2).f32974h.performClick();
                break;
            case 3:
                kotlin.jvm.internal.m.f(it, "it");
                f2 f2Var3 = this.f47871b;
                ta.a aVar3 = f2Var3.f47886f;
                AtomicBoolean atomicBoolean = f2Var3.f47928q;
                kotlin.jvm.internal.m.c(aVar3);
                android.support.v4.media.session.a.H(((hj.n2) aVar3).f32973g.getBackground());
                ta.a aVar4 = f2Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.n2) aVar4).f32968b.setBackgroundResource(R.drawable.point_grey);
                ta.a aVar5 = f2Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.n2) aVar5).f32973g.setEnabled(false);
                ta.a aVar6 = f2Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                android.support.v4.media.session.a.H(((hj.n2) aVar6).f32972f.getBackground());
                ta.a aVar7 = f2Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.n2) aVar7).f32969c.setBackgroundResource(R.drawable.point_grey);
                ta.a aVar8 = f2Var3.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((hj.n2) aVar8).f32972f.setEnabled(false);
                th.e eVar = ((jp.p0) f2Var3.f47881a).V;
                if (eVar != null) {
                    eVar.n();
                }
                f2Var3.v();
                if (atomicBoolean.get()) {
                    ta.a aVar9 = f2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((hj.n2) aVar9).m.c();
                    ta.a aVar10 = f2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((hj.n2) aVar10).m.setVisibility(8);
                    ta.a aVar11 = f2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    ((hj.n2) aVar11).f32977k.setVisibility(8);
                    ta.a aVar12 = f2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    ((hj.n2) aVar12).f32976j.setVisibility(0);
                    ta.a aVar13 = f2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar13);
                    ((hj.n2) aVar13).f32974h.setVisibility(8);
                    ta.a aVar14 = f2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar14);
                    ((hj.n2) aVar14).f32970d.setVisibility(0);
                    ta.a aVar15 = f2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar15);
                    ((hj.n2) aVar15).f32968b.setVisibility(0);
                    ta.a aVar16 = f2Var3.f47886f;
                    kotlin.jvm.internal.m.c(aVar16);
                    ((hj.n2) aVar16).f32969c.setVisibility(0);
                    atomicBoolean.set(false);
                    po.a aVar17 = f2Var3.f47927p;
                    if (aVar17 != null) {
                        aVar17.c();
                        File file = new File(f2Var3.f47926o);
                        if (file.exists()) {
                            av.i iVar = (av.i) f2Var3.f47929r.getValue();
                            Sentence sentence = f2Var3.f47923k;
                            if (sentence == null) {
                                kotlin.jvm.internal.m.n("mModel");
                                throw null;
                            }
                            String sentence2 = sentence.getSentence();
                            kotlin.jvm.internal.m.e(sentence2, "getSentence(...)");
                            Sentence sentence3 = f2Var3.f47923k;
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
                            iVar.b(file, sentence2, arrayList, ry.r.f50854a, new os.a(21), new d2(f2Var3, 0));
                        } else {
                            f2Var3.u();
                        }
                    }
                } else {
                    Context context = f2Var3.f47883c;
                    kotlin.jvm.internal.m.d(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    new RxPermissions((l.m) context).request("android.permission.RECORD_AUDIO").h(new lf.x0(f2Var3, 21), vx.b.f54316e);
                }
                return qy.b0.f48488a;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                f2 f2Var4 = this.f47871b;
                ta.a aVar18 = f2Var4.f47886f;
                kotlin.jvm.internal.m.c(aVar18);
                android.support.v4.media.session.a.K(((hj.n2) aVar18).f32972f.getBackground());
                jp.p0 p0Var = (jp.p0) f2Var4.f47881a;
                th.e eVar2 = p0Var.V;
                if (eVar2 != null) {
                    eVar2.n();
                }
                ta.a aVar19 = f2Var4.f47886f;
                kotlin.jvm.internal.m.c(aVar19);
                ((hj.n2) aVar19).f32972f.setEnabled(false);
                th.e eVar3 = p0Var.V;
                if (eVar3 != null) {
                    eVar3.f52416c = new o20.i(f2Var4, 13);
                }
                if (eVar3 != null) {
                    eVar3.h(f2Var4.f47926o);
                }
                return qy.b0.f48488a;
        }
        return qy.b0.f48488a;
    }
}
