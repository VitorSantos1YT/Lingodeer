package p9;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46641b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f46640a = i11;
        this.f46641b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
        switch (this.f46640a) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) this.f46641b;
                if (i11 >= 0) {
                    String string = dropDownPreference.f2312w0[i11].toString();
                    if (!string.equals(dropDownPreference.f2313x0)) {
                        dropDownPreference.a(string);
                        dropDownPreference.J(string);
                    }
                }
                break;
            default:
                ((SearchView) this.f46641b).o(i11);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i11 = this.f46640a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
