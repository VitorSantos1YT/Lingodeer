package r;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements h0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l.k f48534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f48535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f48536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f48537d;

    public c0(AppCompatSpinner appCompatSpinner) {
        this.f48537d = appCompatSpinner;
    }

    @Override // r.h0
    public final boolean b() {
        l.k kVar = this.f48534a;
        if (kVar != null) {
            return kVar.isShowing();
        }
        return false;
    }

    @Override // r.h0
    public final int c() {
        return 0;
    }

    @Override // r.h0
    public final void dismiss() {
        l.k kVar = this.f48534a;
        if (kVar != null) {
            kVar.dismiss();
            this.f48534a = null;
        }
    }

    @Override // r.h0
    public final CharSequence e() {
        return this.f48536c;
    }

    @Override // r.h0
    public final Drawable f() {
        return null;
    }

    @Override // r.h0
    public final void g(CharSequence charSequence) {
        this.f48536c = charSequence;
    }

    @Override // r.h0
    public final void m(int i11, int i12) {
        if (this.f48535b == null) {
            return;
        }
        AppCompatSpinner appCompatSpinner = this.f48537d;
        l.j jVar = new l.j(appCompatSpinner.getPopupContext());
        CharSequence charSequence = this.f48536c;
        if (charSequence != null) {
            jVar.setTitle(charSequence);
        }
        d0 d0Var = this.f48535b;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        l.f fVar = jVar.f39020a;
        fVar.f38972n = d0Var;
        fVar.f38973o = this;
        fVar.f38978t = selectedItemPosition;
        fVar.f38977s = true;
        l.k kVarCreate = jVar.create();
        this.f48534a = kVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = kVarCreate.f39024f.f38996f;
        alertController$RecycleListView.setTextDirection(i11);
        alertController$RecycleListView.setTextAlignment(i12);
        this.f48534a.show();
    }

    @Override // r.h0
    public final int n() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        AppCompatSpinner appCompatSpinner = this.f48537d;
        appCompatSpinner.setSelection(i11);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(null, i11, this.f48535b.getItemId(i11));
        }
        dismiss();
    }

    @Override // r.h0
    public final void p(ListAdapter listAdapter) {
        this.f48535b = (d0) listAdapter;
    }

    @Override // r.h0
    public final void d(int i11) {
    }

    @Override // r.h0
    public final void j(Drawable drawable) {
    }

    @Override // r.h0
    public final void k(int i11) {
    }

    @Override // r.h0
    public final void l(int i11) {
    }
}
