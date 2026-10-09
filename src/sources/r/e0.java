package r;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48546b;

    public /* synthetic */ e0(Object obj, int i11) {
        this.f48545a = i11;
        this.f48546b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
        switch (this.f48545a) {
            case 0:
                androidx.appcompat.widget.d dVar = (androidx.appcompat.widget.d) this.f48546b;
                AppCompatSpinner appCompatSpinner = dVar.f1079i0;
                appCompatSpinner.setSelection(i11);
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i11, dVar.f1076f0.getItemId(i11));
                }
                dVar.dismiss();
                break;
            default:
                ((SearchView) this.f48546b).n(i11);
                break;
        }
    }
}
