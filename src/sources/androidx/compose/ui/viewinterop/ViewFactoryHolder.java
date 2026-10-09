package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import fz.c;
import l1.q;
import qp.m3;
import r2.d;
import w1.e;
import y2.t1;
import y3.b;
import y3.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final View f1228g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final d f1229h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public w1.d f1230i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public c f1231j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public c f1232k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public c f1233l0;

    public ViewFactoryHolder(Context context, c cVar, q qVar, e eVar, int i11, t1 t1Var) {
        View view = (View) cVar.invoke(context);
        d dVar = new d();
        super(context, qVar, i11, dVar, view, t1Var);
        this.f1228g0 = view;
        this.f1229h0 = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i11);
        Object objB = eVar != null ? eVar.b(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objB instanceof SparseArray ? (SparseArray) objB : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (eVar != null) {
            setSavableRegistryEntry(eVar.e(strValueOf, new f(this, 2)));
        }
        b bVar = b.f57055e;
        this.f1231j0 = bVar;
        this.f1232k0 = bVar;
        this.f1233l0 = bVar;
    }

    public static final void o(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(w1.d dVar) {
        w1.d dVar2 = this.f1230i0;
        if (dVar2 != null) {
            ((m3) dVar2).j();
        }
        this.f1230i0 = dVar;
    }

    public final d getDispatcher() {
        return this.f1229h0;
    }

    public final c getReleaseBlock() {
        return this.f1233l0;
    }

    public final c getResetBlock() {
        return this.f1232k0;
    }

    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    public final c getUpdateBlock() {
        return this.f1231j0;
    }

    public final void setReleaseBlock(c cVar) {
        this.f1233l0 = cVar;
        setRelease(new f(this, 3));
    }

    public final void setResetBlock(c cVar) {
        this.f1232k0 = cVar;
        setReset(new f(this, 4));
    }

    public final void setUpdateBlock(c cVar) {
        this.f1231j0 = cVar;
        setUpdate(new f(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
