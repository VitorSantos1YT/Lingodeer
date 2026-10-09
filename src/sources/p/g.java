package p;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import q.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f46193b;

    public g(Context context, c cVar) {
        this.f46192a = context;
        this.f46193b = cVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f46193b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f46193b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new y(this.f46192a, this.f46193b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f46193b.e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f46193b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f46193b.f46179a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f46193b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f46193b.f46180b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f46193b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f46193b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f46193b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f46193b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f46193b.f46179a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f46193b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z11) {
        this.f46193b.p(z11);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i11) {
        this.f46193b.l(i11);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i11) {
        this.f46193b.n(i11);
    }
}
