package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.k1;
import androidx.lifecycle.LifecycleOwnerKt;
import b7.e0;
import ci.v;
import com.lingo.lingoskill.object.LanCustomInfo;
import com.lingo.lingoskill.object.PdWord;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import hj.u5;
import ij.l;
import java.util.ArrayList;
import java.util.Iterator;
import km.u;
import km.w1;
import km.x1;
import kotlin.jvm.internal.m;
import qh.c0;
import tp.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29270b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f29269a = i11;
        this.f29270b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f29269a) {
            case 5:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f29270b;
                actionBarOverlayLayout.f866b0 = null;
                actionBarOverlayLayout.L = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        k1 supportFragmentManager;
        switch (this.f29269a) {
            case 0:
                m.f(animation, "animation");
                v vVar = ((h) this.f29270b).f29271a;
                if (vVar.f36398d == null) {
                    return;
                }
                if (l.f34436b == null) {
                    synchronized (l.class) {
                        if (l.f34436b == null) {
                            l.f34436b = new l();
                        }
                        break;
                    }
                }
                int iD = e0.d(l.f34436b, 51);
                int i11 = vVar.P;
                if (iD == i11) {
                    LanCustomInfo lanCustomInfoB = ub.a.Z().b(51);
                    lanCustomInfoB.setPronun(i11 + 1);
                    ub.a.Z().f34437a.f34446f.insertOrReplace(lanCustomInfoB);
                }
                int i12 = vVar.P;
                Bundle bundle = new Bundle();
                bundle.putInt(INTENTS.EXTRA_INT, i12);
                u uVar = new u();
                uVar.setArguments(bundle);
                l.m mVar = vVar.f36398d;
                if (mVar == null || (supportFragmentManager = mVar.getSupportFragmentManager()) == null) {
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(R.id.fl_container, uVar, u.class.getSimpleName());
                aVar.h();
                return;
            case 1:
                m.f(animation, "animation");
                x1 x1Var = ((nm.b) this.f29270b).f43850a;
                if (x1Var.f36398d == null) {
                    return;
                }
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(x1Var), null, null, new w1(x1Var, null, 0), 3);
                l.m mVar2 = x1Var.f36398d;
                if (mVar2 != null) {
                    int i13 = x1Var.P;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt(INTENTS.EXTRA_INT, i13);
                    u uVar2 = new u();
                    uVar2.setArguments(bundle2);
                    ff.h.A(mVar2, uVar2);
                    return;
                }
                return;
            case 2:
                ((qa.v) this.f29270b).o();
                animation.removeListener(this);
                return;
            case 3:
                m.f(animation, "animation");
                super.onAnimationEnd(animation);
                qh.e eVar = (qh.e) this.f29270b;
                Iterator it = eVar.V.iterator();
                m.e(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    m.e(next, "next(...)");
                    Object tag = ((AppCompatTextView) next).getTag();
                    m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
                    String favId = ((PdWord) tag).getFavId();
                    sh.b bVar = eVar.N;
                    if (bVar == null) {
                        m.n("viewModel");
                        throw null;
                    }
                    if (m.a(favId, bVar.a().getWord().getFavId())) {
                        ta.a aVar2 = eVar.f36400f;
                        m.c(aVar2);
                        AppCompatTextView tvOption1 = ((u5) aVar2).f33424y;
                        m.e(tvOption1, "tvOption1");
                        eVar.D(tvOption1, false, true);
                    }
                }
                return;
            case 4:
                m.f(animation, "animation");
                super.onAnimationEnd(animation);
                c0 c0Var = (c0) this.f29270b;
                c0Var.z();
                Iterator it2 = c0Var.T.iterator();
                m.e(it2, "iterator(...)");
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    m.e(next2, "next(...)");
                    LinearLayout linearLayout = (LinearLayout) next2;
                    Object tag2 = linearLayout.getTag();
                    m.d(tag2, "null cannot be cast to non-null type com.lingo.lingoskill.object.PdWord");
                    String favId2 = ((PdWord) tag2).getFavId();
                    sh.c cVar = c0Var.S;
                    if (cVar == null) {
                        m.n("viewModel");
                        throw null;
                    }
                    if (m.a(favId2, cVar.b().getWord().getFavId())) {
                        c0Var.F(linearLayout, false, true);
                    }
                }
                return;
            case 5:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f29270b;
                actionBarOverlayLayout.f866b0 = null;
                actionBarOverlayLayout.L = false;
                return;
            case 6:
                ra.g gVar = (ra.g) this.f29270b;
                ArrayList arrayList = new ArrayList(gVar.f48998e);
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((ra.c) arrayList.get(i14)).a(gVar);
                }
                return;
            default:
                m.f(animation, "animation");
                super.onAnimationEnd(animation);
                o oVar = (o) this.f29270b;
                l.m mVar3 = oVar.f36398d;
                if (mVar3 != null) {
                    m.c(mVar3);
                    if (mVar3.isDestroyed()) {
                        return;
                    }
                }
                ta.a aVar3 = oVar.f36400f;
                m.c(aVar3);
                if (((LinearLayout) ((hj.v) aVar3).f33437l.f32524c) == null) {
                    return;
                }
                ta.a aVar4 = oVar.f36400f;
                m.c(aVar4);
                ((LinearLayout) ((hj.v) aVar4).f33437l.f32524c).setVisibility(8);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        switch (this.f29269a) {
            case 7:
                m.f(animation, "animation");
                super.onAnimationRepeat(animation);
                o oVar = (o) this.f29270b;
                l.m mVar = oVar.f36398d;
                if (mVar != null) {
                    m.c(mVar);
                    if (mVar.isDestroyed()) {
                    }
                }
                ta.a aVar = oVar.f36400f;
                m.c(aVar);
                if (((TextView) ((hj.v) aVar).f33437l.f32525d) != null) {
                    ta.a aVar2 = oVar.f36400f;
                    m.c(aVar2);
                    TextView textView = (TextView) ((hj.v) aVar2).f33437l.f32525d;
                    ta.a aVar3 = oVar.f36400f;
                    m.c(aVar3);
                    textView.setText(String.valueOf(Integer.valueOf(((TextView) ((hj.v) aVar3).f33437l.f32525d).getText().toString()).intValue() - 1));
                    break;
                }
                break;
            default:
                super.onAnimationRepeat(animation);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f29269a) {
            case 6:
                ra.g gVar = (ra.g) this.f29270b;
                ArrayList arrayList = new ArrayList(gVar.f48998e);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((ra.c) arrayList.get(i11)).b(gVar);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
