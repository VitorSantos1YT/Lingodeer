package ve;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public we.c f53973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f53974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f53975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdapterView.OnItemClickListener f53976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f53977e;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        m.f(view, "view");
        AdapterView.OnItemClickListener onItemClickListener = this.f53976d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i11, j11);
        }
        View view2 = (View) this.f53975c.get();
        AdapterView adapterView2 = (AdapterView) this.f53974b.get();
        if (view2 == null || adapterView2 == null) {
            return;
        }
        c.c(this.f53973a, view2, adapterView2);
    }
}
