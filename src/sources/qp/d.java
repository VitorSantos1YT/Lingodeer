package qp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements hi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.b f47881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f47883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Env f47884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f47885e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ta.a f47886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n9.q f47887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f47888h;

    public d(mp.b ctrlView, long j11) {
        kotlin.jvm.internal.m.f(ctrlView, "ctrlView");
        this.f47881a = ctrlView;
        this.f47882b = j11;
        this.f47883c = ((jp.p0) ctrlView).C();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        this.f47884d = cf.x.n();
        this.f47885e = BuildConfig.VERSION_NAME;
        this.f47887g = new n9.q(29, false);
    }

    @Override // hi.a
    public void d(ViewGroup parent) {
        kotlin.jvm.internal.m.f(parent, "parent");
        fz.f fVarN = n();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f47883c);
        kotlin.jvm.internal.m.e(layoutInflaterFrom, "from(...)");
        ta.a aVar = (ta.a) fVarN.invoke(layoutInflaterFrom, parent, Boolean.FALSE);
        this.f47886f = aVar;
        kotlin.jvm.internal.m.c(aVar);
        View root = aVar.getRoot();
        kotlin.jvm.internal.m.e(root, "getRoot(...)");
        this.f47888h = root;
        if (parent.getChildCount() <= 0) {
            m(parent);
            return;
        }
        int childCount = parent.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                th.j.a(qx.h.m(parent.getLayoutTransition().getDuration(3), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new b(0, this, parent), c.f47860b), this.f47887g);
                return;
            }
            parent.removeViewAt(childCount);
        }
    }

    @Override // hi.a
    public final void e() {
        ef.e.B((ViewGroup) o());
    }

    @Override // hi.a
    public void f() {
        this.f47887g.f();
    }

    @Override // hi.a
    public String h() {
        return this.f47885e;
    }

    @Override // hi.a
    public final long l() {
        return this.f47882b;
    }

    public final void m(ViewGroup parent) {
        kotlin.jvm.internal.m.f(parent, "parent");
        parent.removeAllViews();
        parent.addView(o());
        jp.p0 p0Var = (jp.p0) this.f47881a;
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
        p();
        e();
    }

    public abstract fz.f n();

    public final View o() {
        View view = this.f47888h;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.m.n("view");
        throw null;
    }

    public abstract void p();

    public final void q(String str) {
        kotlin.jvm.internal.m.f(str, "<set-?>");
        this.f47885e = str;
    }
}
