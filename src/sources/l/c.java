package l;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f38941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f38942b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ContextThemeWrapper contextThemeWrapper, int i11, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i11, R.id.text1, charSequenceArr);
        this.f38942b = fVar;
        this.f38941a = alertController$RecycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i11, view, viewGroup);
        boolean[] zArr = this.f38942b.f38975q;
        if (zArr != null && zArr[i11]) {
            this.f38941a.setItemChecked(i11, true);
        }
        return view2;
    }
}
