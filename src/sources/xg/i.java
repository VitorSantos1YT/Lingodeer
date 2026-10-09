package xg;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.k0;
import kotlin.jvm.internal.m;
import l1.n;
import n9.q;
import qy.j;
import vt.n0;
import wt.o0;
import z2.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f56081a = new q(29, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f56082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f56083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f56084d;

    public i() {
        j jVar = j.SYNCHRONIZED;
        com.bumptech.glide.d.u(jVar, new h(this, 0));
        this.f56082b = com.bumptech.glide.d.u(jVar, new h(this, 1));
        this.f56083c = com.bumptech.glide.d.u(jVar, new h(this, 2));
        this.f56084d = com.bumptech.glide.d.u(jVar, new h(this, 3));
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        m.f(inflater, "inflater");
        Context contextRequireContext = requireContext();
        m.e(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(p1.f58646d);
        composeView.setContent(new t1.d(new g(this, bundle, 0), true, 938028263));
        return composeView;
    }

    @Override // androidx.fragment.app.k0
    public final void onDestroyView() {
        super.onDestroyView();
        this.f56081a.f();
    }

    public abstract void q(Bundle bundle, n nVar, int i11);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final n0 r() {
        return (n0) this.f56082b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qy.h] */
    public final o0 s() {
        return (o0) this.f56084d.getValue();
    }
}
