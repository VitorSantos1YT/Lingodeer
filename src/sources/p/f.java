package p;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import ob.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c implements q.j {
    public q.l H;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f46187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f46188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f46189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f46190f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f46191t;

    @Override // p.c
    public final void a() {
        if (this.f46191t) {
            return;
        }
        this.f46191t = true;
        this.f46189e.j(this);
    }

    @Override // p.c
    public final View b() {
        WeakReference weakReference = this.f46190f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // q.j
    public final boolean c(q.l lVar, MenuItem menuItem) {
        return ((b) this.f46189e.f44891b).b(this, menuItem);
    }

    @Override // p.c
    public final q.l d() {
        return this.H;
    }

    @Override // p.c
    public final MenuInflater e() {
        return new j(this.f46188d.getContext());
    }

    @Override // p.c
    public final CharSequence f() {
        return this.f46188d.getSubtitle();
    }

    @Override // p.c
    public final CharSequence g() {
        return this.f46188d.getTitle();
    }

    @Override // p.c
    public final void h() {
        this.f46189e.c(this, this.H);
    }

    @Override // q.j
    public final void i(q.l lVar) {
        h();
        this.f46188d.i();
    }

    @Override // p.c
    public final boolean j() {
        return this.f46188d.U;
    }

    @Override // p.c
    public final void k(View view) {
        this.f46188d.setCustomView(view);
        this.f46190f = view != null ? new WeakReference(view) : null;
    }

    @Override // p.c
    public final void l(int i11) {
        m(this.f46187c.getString(i11));
    }

    @Override // p.c
    public final void m(CharSequence charSequence) {
        this.f46188d.setSubtitle(charSequence);
    }

    @Override // p.c
    public final void n(int i11) {
        o(this.f46187c.getString(i11));
    }

    @Override // p.c
    public final void o(CharSequence charSequence) {
        this.f46188d.setTitle(charSequence);
    }

    @Override // p.c
    public final void p(boolean z11) {
        this.f46180b = z11;
        this.f46188d.setTitleOptional(z11);
    }
}
