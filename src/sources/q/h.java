package q;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements v, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f47267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f47268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f47269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f47270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u f47271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f47272f;

    public h(Context context) {
        this.f47267a = context;
        this.f47268b = LayoutInflater.from(context);
    }

    @Override // q.v
    public final void c(boolean z11) {
        g gVar = this.f47272f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // q.v
    public final void d(l lVar, boolean z11) {
        u uVar = this.f47271e;
        if (uVar != null) {
            uVar.d(lVar, z11);
        }
    }

    @Override // q.v
    public final boolean e() {
        return false;
    }

    @Override // q.v
    public final boolean f(b0 b0Var) {
        boolean zHasVisibleItems = b0Var.hasVisibleItems();
        Context context = b0Var.f47280a;
        if (!zHasVisibleItems) {
            return false;
        }
        m mVar = new m();
        mVar.f47287a = b0Var;
        l.j jVar = new l.j(context);
        h hVar = new h(jVar.getContext());
        mVar.f47289c = hVar;
        hVar.f47271e = mVar;
        b0Var.b(hVar, context);
        h hVar2 = mVar.f47289c;
        if (hVar2.f47272f == null) {
            hVar2.f47272f = new g(hVar2);
        }
        g gVar = hVar2.f47272f;
        l.f fVar = jVar.f39020a;
        fVar.f38972n = gVar;
        fVar.f38973o = mVar;
        View view = b0Var.Q;
        if (view != null) {
            fVar.f38964e = view;
        } else {
            fVar.f38962c = b0Var.P;
            jVar.setTitle(b0Var.O);
        }
        fVar.f38971l = mVar;
        l.k kVarCreate = jVar.create();
        mVar.f47288b = kVarCreate;
        kVarCreate.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f47288b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
        mVar.f47288b.show();
        u uVar = this.f47271e;
        if (uVar == null) {
            return true;
        }
        uVar.q(b0Var);
        return true;
    }

    @Override // q.v
    public final void g(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f47270d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // q.v
    public final int getId() {
        return 0;
    }

    @Override // q.v
    public final boolean i(n nVar) {
        return false;
    }

    @Override // q.v
    public final void j(Context context, l lVar) {
        if (this.f47267a != null) {
            this.f47267a = context;
            if (this.f47268b == null) {
                this.f47268b = LayoutInflater.from(context);
            }
        }
        this.f47269c = lVar;
        g gVar = this.f47272f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // q.v
    public final Parcelable k() {
        if (this.f47270d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f47270d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // q.v
    public final void l(u uVar) {
        throw null;
    }

    @Override // q.v
    public final boolean m(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        this.f47269c.q(this.f47272f.getItem(i11), this, 0);
    }
}
