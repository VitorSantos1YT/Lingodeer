package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f38949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f38950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f38951c;

    public e(f fVar, AlertController$RecycleListView alertController$RecycleListView, i iVar) {
        this.f38951c = fVar;
        this.f38949a = alertController$RecycleListView;
        this.f38950b = iVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        f fVar = this.f38951c;
        boolean[] zArr = fVar.f38975q;
        AlertController$RecycleListView alertController$RecycleListView = this.f38949a;
        if (zArr != null) {
            zArr[i11] = alertController$RecycleListView.isItemChecked(i11);
        }
        fVar.f38979u.onClick(this.f38950b.f38992b, i11, alertController$RecycleListView.isItemChecked(i11));
    }
}
