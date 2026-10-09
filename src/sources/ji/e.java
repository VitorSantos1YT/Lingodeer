package ji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k0;
import androidx.fragment.app.p0;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import java.util.WeakHashMap;
import l.m;
import n9.q;
import qy.j;
import vt.n0;
import wt.o0;
import z4.j0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends k0 {
    public final Object H;
    public final Object K;
    public final Object L;
    public final Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fz.f f36395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f36398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f36399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ta.a f36400f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f36401t;

    /* JADX WARN: Multi-variable type inference failed */
    public e(fz.f inflate, String str) {
        kotlin.jvm.internal.m.f(inflate, "inflate");
        this.f36395a = inflate;
        this.f36396b = str;
        this.f36397c = getClass().getSimpleName();
        this.f36401t = new q(29, false);
        j jVar = j.SYNCHRONIZED;
        this.H = com.bumptech.glide.d.u(jVar, new d(this, 0 == true ? 1 : 0));
        this.K = com.bumptech.glide.d.u(jVar, new d(this, 1));
        com.bumptech.glide.d.u(jVar, new d(this, 2));
        this.L = com.bumptech.glide.d.u(jVar, new d(this, 3));
        this.M = com.bumptech.glide.d.u(jVar, new d(this, 4));
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.m.f(inflater, "inflater");
        ta.a aVar = (ta.a) this.f36395a.invoke(inflater, viewGroup, Boolean.FALSE);
        this.f36400f = aVar;
        kotlin.jvm.internal.m.c(aVar);
        this.f36399e = aVar.getRoot();
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        View root = aVar2.getRoot();
        kotlin.jvm.internal.m.e(root, "getRoot(...)");
        View viewFindViewById = root.findViewById(R.id.status_bar_view);
        int i11 = 12;
        if (viewFindViewById != null) {
            h2.d dVar = new h2.d(i11);
            WeakHashMap weakHashMap = s0.f58893a;
            j0.m(viewFindViewById, dVar);
        } else {
            View viewFindViewById2 = root.findViewById(R.id.banner_view);
            if (viewFindViewById2 != null) {
                h2.d dVar2 = new h2.d(i11);
                WeakHashMap weakHashMap2 = s0.f58893a;
                j0.m(viewFindViewById2, dVar2);
            } else {
                View viewFindViewById3 = root.findViewById(R.id.toolbar);
                if (viewFindViewById3 != null) {
                    h2.d dVar3 = new h2.d(i11);
                    WeakHashMap weakHashMap3 = s0.f58893a;
                    j0.m(viewFindViewById3, dVar3);
                }
            }
        }
        return this.f36399e;
    }

    @Override // androidx.fragment.app.k0
    public void onDestroy() {
        super.onDestroy();
        this.f36398d = null;
        this.f36399e = null;
    }

    @Override // androidx.fragment.app.k0
    public void onDestroyView() {
        super.onDestroyView();
        q();
        this.f36400f = null;
        if (w() && f10.e.b().e(this)) {
            f10.e.b().l(this);
        }
        this.f36401t.f();
    }

    @Override // androidx.fragment.app.k0
    public void onResume() {
        super.onResume();
        String str = this.f36396b;
        if (str.length() > 0) {
            t().d(str);
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onViewCreated(view, bundle);
        p0 activity = getActivity();
        kotlin.jvm.internal.m.d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.f36398d = (m) activity;
        v(bundle);
        if (!w() || f10.e.b().e(this)) {
            return;
        }
        f10.e.b().j(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final Env r() {
        return (Env) this.H.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final n0 s() {
        return (n0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final ur.a t() {
        return (ur.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final o0 u() {
        return (o0) this.L.getValue();
    }

    public abstract void v(Bundle bundle);

    public boolean w() {
        return this instanceof ui.m;
    }

    public void q() {
    }
}
