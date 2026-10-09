package gi;

import a9.i;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import ci.v;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTestActivity;
import com.lingo.lingoskill.object.ARChar;
import com.lingo.lingoskill.object.HwCharacter;
import hj.q5;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import n9.q;
import ns.o;
import nv.p;
import ob.m;
import qy.b0;
import se.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements mm.a {
    public bq.d H;
    public final q K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f29271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bi.a f29272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f29273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public om.b f29274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29276f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f29277t;

    public h(v vVar, ARSyllableTestActivity aRSyllableTestActivity, bi.a lesson) {
        kotlin.jvm.internal.m.f(lesson, "lesson");
        this.f29271a = vVar;
        this.f29272b = lesson;
        this.f29276f = -1;
        this.K = new q(29, false);
        vVar.N = this;
        this.f29277t = new i(1);
    }

    @Override // ii.a
    public final void A() {
        om.b bVar = this.f29274d;
        if (bVar != null) {
            bVar.b();
        }
        this.K.f();
    }

    public final void a(ImageView imageView, String path) {
        kotlin.jvm.internal.m.f(path, "path");
        kotlin.jvm.internal.m.f(imageView, "imageView");
        bq.d dVar = this.H;
        if (dVar != null) {
            dVar.k(0);
        }
        this.H = new dn.b(imageView, 2);
        android.support.v4.media.session.a.H(imageView.getBackground());
        if (new File(path).exists()) {
            i iVar = this.f29277t;
            iVar.y();
            iVar.f520d = this.H;
            iVar.v(path);
            android.support.v4.media.session.a.K(imageView.getBackground());
        }
    }

    @Override // mm.a
    public final boolean b() {
        return this.f29276f == this.f29275e - 1;
    }

    public final void c(String path) {
        kotlin.jvm.internal.m.f(path, "path");
        bq.d dVar = this.H;
        if (dVar != null) {
            dVar.k(0);
        }
        this.H = new g7.c(28);
        i iVar = this.f29277t;
        iVar.y();
        if (new File(path).exists()) {
            iVar.f520d = this.H;
            iVar.v(path);
        }
    }

    @Override // mm.a
    public final Object j(vy.d dVar) {
        List listK;
        String str = this.f29272b.f4453d;
        kotlin.jvm.internal.m.e(str, "getLessonStr(...)");
        m mVar = new m(this, str);
        this.f29273c = mVar;
        ArrayList arrayList = (ArrayList) mVar.f44827c;
        ArrayList arrayList2 = new ArrayList();
        Matcher matcherW = p.w(0, "\n", "compile(...)", str);
        if (matcherW.find()) {
            ArrayList arrayList3 = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcherW, str, iC, arrayList3);
            } while (matcherW.find());
            p.B(iC, str, arrayList3);
            listK = arrayList3;
        } else {
            listK = o.K(str.toString());
        }
        for (String str2 : (String[]) listK.toArray(new String[0])) {
            k.w();
            ARChar aRCharA = wh.a.a(str2);
            if (aRCharA != null) {
                aRCharA.getID();
                if (((HwCharacter) k.w().f55171a.load(Long.valueOf(aRCharA.getID()))) != null) {
                    om.o oVar = new om.o();
                    oVar.f45626b = (int) aRCharA.getID();
                    oVar.f45625a = 0;
                    arrayList.add(oVar);
                } else {
                    om.o oVar2 = new om.o();
                    oVar2.f45626b = (int) aRCharA.getID();
                    oVar2.f45625a = 1;
                    arrayList2.add(oVar2);
                    arrayList.add(oVar2);
                    if (arrayList2.size() % 2 == 0) {
                        om.o oVar3 = new om.o();
                        oVar3.f45626b = (int) aRCharA.getID();
                        oVar3.f45625a = 2;
                        arrayList.add(oVar3);
                    }
                }
            }
        }
        m mVar2 = this.f29273c;
        kotlin.jvm.internal.m.c(mVar2);
        int size = ((ArrayList) mVar2.f44827c).size();
        this.f29275e = size;
        v vVar = this.f29271a;
        if (vVar.getView() != null) {
            ta.a aVar = vVar.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ProgressBar progressBar = ((q5) aVar).f33171f;
            kotlin.jvm.internal.m.c(progressBar);
            progressBar.setMax(size * 100);
        }
        ta.a aVar2 = vVar.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((LinearLayout) ((q5) aVar2).f33170e.f32525d).setVisibility(8);
        o();
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // mm.a
    public final void o() {
        om.b dVar;
        om.b bVar;
        int i11;
        int i12;
        int i13 = this.f29276f + 1;
        this.f29276f = i13;
        int i14 = this.f29275e;
        v vVar = this.f29271a;
        if (i13 >= i14) {
            om.b bVar2 = this.f29274d;
            kotlin.jvm.internal.m.c(bVar2);
            bVar2.b();
            g gVar = new g(this, 0);
            if (vVar.getView() == null) {
                return;
            }
            ta.a aVar = vVar.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ProgressBar progressBar = ((q5) aVar).f33171f;
            ta.a aVar2 = vVar.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            int progress = ((q5) aVar2).f33171f.getProgress();
            ta.a aVar3 = vVar.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, "progress", progress, ((q5) aVar3).f33171f.getMax());
            objectAnimatorOfInt.setDuration(500L);
            objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt.addListener(gVar);
            objectAnimatorOfInt.start();
            return;
        }
        om.b bVar3 = this.f29274d;
        if (bVar3 != null) {
            bVar3.b();
        }
        m mVar = this.f29273c;
        kotlin.jvm.internal.m.c(mVar);
        h hVar = (h) mVar.f44826b;
        int i15 = this.f29276f;
        ArrayList arrayList = (ArrayList) mVar.f44828d;
        ArrayList arrayList2 = (ArrayList) mVar.f44827c;
        int i16 = ((om.o) arrayList2.get(i15)).f45625a;
        if (i16 != 0) {
            if (i16 == 1) {
                dVar = new fi.i(hVar, ((om.o) arrayList2.get(i15)).f45626b);
                arrayList.add(arrayList2.get(i15));
            } else if (i16 != 2) {
                bVar = null;
            } else {
                jz.d dVar2 = jz.e.f37397a;
                int i17 = ((om.o) ry.m.I0(arrayList)).f45626b;
                double dRandom = Math.random();
                int size = arrayList.size();
                while (true) {
                    i12 = (int) (dRandom * ((double) size));
                    if (((om.o) arrayList.get(i12)).f45626b != i17) {
                        break;
                    }
                    dRandom = Math.random();
                    size = arrayList.size();
                }
                fi.k kVar = new fi.k(hVar, i17, ((om.o) arrayList.get(i12)).f45626b);
                arrayList.clear();
                bVar = kVar;
            }
            if (bVar != null) {
                bVar.f();
            }
            this.f29274d = bVar;
            kotlin.jvm.internal.m.c(bVar);
            ta.a aVar4 = vVar.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            bVar.g(((q5) aVar4).f33168c);
            i11 = this.f29276f;
            if (vVar.getView() == null) {
                return;
            }
            ta.a aVar5 = vVar.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ProgressBar progressBar2 = ((q5) aVar5).f33171f;
            ta.a aVar6 = vVar.f36400f;
            kotlin.jvm.internal.m.c(aVar6);
            ProgressBar progressBar3 = ((q5) aVar6).f33171f;
            kotlin.jvm.internal.m.c(progressBar3);
            ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(progressBar2, "progress", progressBar3.getProgress(), i11 * 100);
            objectAnimatorOfInt2.setDuration(500L);
            objectAnimatorOfInt2.setInterpolator(new LinearInterpolator());
            objectAnimatorOfInt2.start();
        }
        dVar = new fi.d(hVar, ((om.o) arrayList2.get(i15)).f45626b);
        bVar = dVar;
        if (bVar != null) {
            bVar.f();
        }
        this.f29274d = bVar;
        kotlin.jvm.internal.m.c(bVar);
        ta.a aVar7 = vVar.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        bVar.g(((q5) aVar7).f33168c);
        i11 = this.f29276f;
        if (vVar.getView() == null) {
            return;
        }
        ta.a aVar8 = vVar.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        ProgressBar progressBar4 = ((q5) aVar8).f33171f;
        ta.a aVar9 = vVar.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        ProgressBar progressBar5 = ((q5) aVar9).f33171f;
        kotlin.jvm.internal.m.c(progressBar5);
        ObjectAnimator objectAnimatorOfInt3 = ObjectAnimator.ofInt(progressBar4, "progress", progressBar5.getProgress(), i11 * 100);
        objectAnimatorOfInt3.setDuration(500L);
        objectAnimatorOfInt3.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt3.start();
    }

    @Override // ii.a
    public final void start() {
    }
}
