package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends p.c implements q.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f39028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.l f39029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ob.u f39030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f39031f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m0 f39032t;

    public l0(m0 m0Var, Context context, ob.u uVar) {
        this.f39032t = m0Var;
        this.f39028c = context;
        this.f39030e = uVar;
        q.l lVar = new q.l(context);
        lVar.N = 1;
        this.f39029d = lVar;
        lVar.f47284e = this;
    }

    @Override // p.c
    public final void a() {
        m0 m0Var = this.f39032t;
        if (m0Var.f39043i != this) {
            return;
        }
        if (m0Var.f39049p) {
            m0Var.f39044j = this;
            m0Var.f39045k = this.f39030e;
        } else {
            this.f39030e.j(this);
        }
        this.f39030e = null;
        m0Var.v(false);
        ActionBarContextView actionBarContextView = m0Var.f39040f;
        if (actionBarContextView.M == null) {
            actionBarContextView.g();
        }
        m0Var.f39037c.setHideOnContentScrollEnabled(m0Var.f39054u);
        m0Var.f39043i = null;
    }

    @Override // p.c
    public final View b() {
        WeakReference weakReference = this.f39031f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // q.j
    public final boolean c(q.l lVar, MenuItem menuItem) {
        ob.u uVar = this.f39030e;
        if (uVar != null) {
            return ((p.b) uVar.f44891b).b(this, menuItem);
        }
        return false;
    }

    @Override // p.c
    public final q.l d() {
        return this.f39029d;
    }

    @Override // p.c
    public final MenuInflater e() {
        return new p.j(this.f39028c);
    }

    @Override // p.c
    public final CharSequence f() {
        return this.f39032t.f39040f.getSubtitle();
    }

    @Override // p.c
    public final CharSequence g() {
        return this.f39032t.f39040f.getTitle();
    }

    @Override // p.c
    public final void h() {
        if (this.f39032t.f39043i != this) {
            return;
        }
        q.l lVar = this.f39029d;
        lVar.y();
        try {
            this.f39030e.c(this, lVar);
        } finally {
            lVar.x();
        }
    }

    @Override // q.j
    public final void i(q.l lVar) {
        if (this.f39030e == null) {
            return;
        }
        h();
        this.f39032t.f39040f.i();
    }

    @Override // p.c
    public final boolean j() {
        return this.f39032t.f39040f.U;
    }

    @Override // p.c
    public final void k(View view) {
        this.f39032t.f39040f.setCustomView(view);
        this.f39031f = new WeakReference(view);
    }

    @Override // p.c
    public final void l(int i11) {
        m(this.f39032t.f39035a.getResources().getString(i11));
    }

    @Override // p.c
    public final void m(CharSequence charSequence) {
        this.f39032t.f39040f.setSubtitle(charSequence);
    }

    @Override // p.c
    public final void n(int i11) {
        o(this.f39032t.f39035a.getResources().getString(i11));
    }

    @Override // p.c
    public final void o(CharSequence charSequence) {
        this.f39032t.f39040f.setTitle(charSequence);
    }

    @Override // p.c
    public final void p(boolean z11) {
        this.f46180b = z11;
        this.f39032t.f39040f.setTitleOptional(z11);
    }
}
