package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f38943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f38944b;

    public d(f fVar, i iVar) {
        this.f38944b = fVar;
        this.f38943a = iVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        f fVar = this.f38944b;
        DialogInterface.OnClickListener onClickListener = fVar.f38973o;
        i iVar = this.f38943a;
        onClickListener.onClick(iVar.f38992b, i11);
        if (fVar.f38977s) {
            return;
        }
        iVar.f38992b.dismiss();
    }
}
