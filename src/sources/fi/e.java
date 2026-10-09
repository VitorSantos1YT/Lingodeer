package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import bq.r;
import com.lingo.lingoskill.object.ARChar;
import hj.h1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import ob.u;
import qy.b0;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f27303b;

    public /* synthetic */ e(i iVar, int i11) {
        this.f27302a = i11;
        this.f27303b = iVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f27302a;
        int i12 = 0;
        b0 b0Var = b0.f48488a;
        i iVar = this.f27303b;
        View v11 = (View) obj;
        switch (i11) {
            case 0:
                m.f(v11, "v");
                Object tag = v11.getTag();
                m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.ARChar");
                ta.a aVar = iVar.f45600c;
                m.c(aVar);
                ((h1) aVar).f32647d.getText().toString();
                String strI = iVar.i((ARChar) tag);
                gi.h hVar = iVar.f27312e;
                ta.a aVar2 = iVar.f45600c;
                m.c(aVar2);
                hVar.a((ImageView) ((h1) aVar2).f32645b.f32408d, strI);
                int[] iArr = r.f4959a;
                long jB = bq.m.B(strI);
                int[] iArr2 = new int[2];
                ta.a aVar3 = iVar.f45600c;
                m.c(aVar3);
                ((h1) aVar3).f32648e.getLocationOnScreen(iArr2);
                ta.a aVar4 = iVar.f45600c;
                m.c(aVar4);
                int[] iArr3 = {(((h1) aVar).f32647d.getWidth() / 2) + i, (((h1) aVar).f32647d.getHeight() / 2) + i};
                ((h1) aVar4).f32647d.getLocationOnScreen(iArr3);
                int i13 = iArr3[0];
                ta.a aVar5 = iVar.f45600c;
                m.c(aVar5);
                int i14 = iArr3[1];
                ta.a aVar6 = iVar.f45600c;
                m.c(aVar6);
                ta.a aVar7 = iVar.f45600c;
                m.c(aVar7);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((h1) aVar7).f32647d, "translationX", iArr2[0] - iArr3[0]);
                m.e(objectAnimatorOfFloat, "ofFloat(...)");
                ta.a aVar8 = iVar.f45600c;
                m.c(aVar8);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(((h1) aVar8).f32647d, "translationY", iArr2[1] - iArr3[1]);
                m.e(objectAnimatorOfFloat2, "ofFloat(...)");
                ta.a aVar9 = iVar.f45600c;
                m.c(aVar9);
                ((h1) aVar9).f32646c.setVisibility(4);
                AnimatorSet animatorSet = new AnimatorSet();
                iVar.H = animatorSet;
                animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
                AnimatorSet animatorSet2 = iVar.H;
                m.c(animatorSet2);
                animatorSet2.setDuration(300L);
                iVar.K = new h(iVar, jB);
                AnimatorSet animatorSet3 = iVar.H;
                m.c(animatorSet3);
                animatorSet3.addListener(iVar.K);
                AnimatorSet animatorSet4 = iVar.H;
                m.c(animatorSet4);
                animatorSet4.start();
                return b0Var;
            case 1:
                m.f(v11, "it");
                iVar.f27313f = 0L;
                int i15 = iVar.f27314t;
                ArrayList arrayList = iVar.N;
                if (arrayList == null) {
                    m.n("charList");
                    throw null;
                }
                if (i15 < arrayList.size()) {
                    ArrayList arrayList2 = iVar.N;
                    if (arrayList2 == null) {
                        m.n("charList");
                        throw null;
                    }
                    Object obj2 = arrayList2.get(iVar.f27314t);
                    m.e(obj2, "get(...)");
                    String strI2 = iVar.i((ARChar) obj2);
                    gi.h hVar2 = iVar.f27312e;
                    ta.a aVar10 = iVar.f45600c;
                    m.c(aVar10);
                    hVar2.a((ImageView) ((h1) aVar10).f32645b.f32408d, strI2);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = iVar.N;
                    if (arrayList4 == null) {
                        m.n("charList");
                        throw null;
                    }
                    Iterator it = arrayList4.iterator();
                    m.e(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        m.e(next, "next(...)");
                        arrayList3.add(iVar.i((ARChar) next));
                    }
                    q qVar = fv.b.f28186a;
                    ARChar aRChar = iVar.M;
                    if (aRChar == null) {
                        m.n("curChar");
                        throw null;
                    }
                    arrayList3.add(fv.b.d(aRChar.getAudioName() + ".mp3"));
                    int size = arrayList3.size();
                    while (i12 < size) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        m.e(obj3, "next(...)");
                        String str = (String) obj3;
                        int iIndexOf = arrayList3.indexOf(str);
                        if (iIndexOf > 0) {
                            long j11 = iVar.f27313f;
                            int[] iArr4 = r.f4959a;
                            iVar.f27313f = bq.m.B((String) arrayList3.get(iIndexOf - 1)) + j11;
                        }
                        th.j.a(qx.h.m(iVar.f27313f, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new u(8, iVar, str), g.f27306c), iVar.f45601d);
                    }
                }
                return b0Var;
            case 2:
                m.f(v11, "it");
                ((ImageView) i.h(iVar).f32645b.f32408d).performClick();
                return b0Var;
            default:
                m.f(v11, "it");
                ((ImageView) i.h(iVar).f32645b.f32408d).performClick();
                return b0Var;
        }
    }
}
