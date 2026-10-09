package zi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.concurrent.TimeUnit;
import jp.p0;
import kotlin.jvm.internal.m;
import n9.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements hi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.b f59222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.b f59223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f59224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f59225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f59226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ta.a f59227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f59228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f59229h;

    public b(mp.b ctrlView, xi.b pinyinElem) {
        m.f(ctrlView, "ctrlView");
        m.f(pinyinElem, "pinyinElem");
        this.f59222a = ctrlView;
        this.f59223b = pinyinElem;
        this.f59224c = ((p0) ctrlView).C();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        x.n();
        this.f59228g = new q(29, false);
        this.f59229h = BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final String c() {
        return this.f59229h;
    }

    @Override // hi.a
    public final void d(ViewGroup viewGroup) {
        fz.f fVarN = n();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f59224c);
        m.e(layoutInflaterFrom, "from(...)");
        ta.a aVar = (ta.a) fVarN.invoke(layoutInflaterFrom, viewGroup, Boolean.FALSE);
        this.f59227f = aVar;
        m.c(aVar);
        View root = aVar.getRoot();
        m.e(root, "getRoot(...)");
        this.f59226e = root;
        if (viewGroup.getChildCount() <= 0) {
            m(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                th.j.a(qx.h.m(viewGroup.getLayoutTransition().getDuration(3), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new qh.d(14, this, (RelativeLayout) viewGroup), a.f59215b), this.f59228g);
                return;
            }
            viewGroup.removeViewAt(childCount);
        }
    }

    @Override // hi.a
    public void f() {
        this.f59228g.f();
    }

    @Override // hi.a
    public final String h() {
        return ep.a.e(" \n", this.f59225d);
    }

    @Override // hi.a
    public final long l() {
        return 0L;
    }

    public final void m(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        View view = this.f59226e;
        if (view == null) {
            m.n("view");
            throw null;
        }
        viewGroup.addView(view);
        p0 p0Var = (p0) this.f59222a;
        th.e eVar = p0Var.V;
        if (eVar != null) {
            eVar.a();
        }
        th.e eVar2 = p0Var.V;
        if (eVar2 != null) {
            eVar2.g();
        }
        th.e eVar3 = p0Var.V;
        if (eVar3 != null) {
            eVar3.n();
        }
        o();
    }

    public abstract fz.f n();

    public abstract void o();

    @Override // hi.a
    public final void e() {
    }
}
