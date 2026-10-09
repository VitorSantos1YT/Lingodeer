package rq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.concurrent.TimeUnit;
import jp.p0;
import kotlin.jvm.internal.m;
import n9.q;
import qh.z;
import th.j;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements hi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.b f49357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pq.a f49358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f49359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Env f49360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f49362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ta.a f49363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f49364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49365i;

    public b(mp.b mView, pq.a mElem) {
        m.f(mView, "mView");
        m.f(mElem, "mElem");
        this.f49357a = mView;
        this.f49358b = mElem;
        this.f49359c = ((p0) mView).C();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        this.f49360d = x.n();
        this.f49364h = new q(29, false);
        this.f49365i = BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final String c() {
        return this.f49365i;
    }

    @Override // hi.a
    public final void d(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() <= 0) {
            m(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                j.a(qx.h.m(viewGroup.getLayoutTransition().getDuration(3), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new z(3, this, (RelativeLayout) viewGroup), a.f49350b), this.f49364h);
                return;
            }
            viewGroup.removeViewAt(childCount);
        }
    }

    @Override // hi.a
    public final void e() {
    }

    @Override // hi.a
    public final String h() {
        return ep.a.e(" \n", this.f49361e);
    }

    @Override // hi.a
    public final long l() {
        return 0L;
    }

    public abstract fz.f n();

    public abstract void o();

    public final void m(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        fz.f fVarN = n();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f49359c);
        m.e(layoutInflaterFrom, "from(...)");
        ta.a aVar = (ta.a) fVarN.invoke(layoutInflaterFrom, viewGroup, Boolean.FALSE);
        this.f49363g = aVar;
        m.c(aVar);
        View root = aVar.getRoot();
        m.e(root, EHjhWcesDUIsIw.vYIiMImAYAkWjV);
        this.f49362f = root;
        viewGroup.addView(root);
        o();
    }
}
