package i5;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import com.tbruyelle.rxpermissions3.BuildConfig;
import r.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f34158a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((g2) this.f34158a).c((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorG;
        g2 g2Var = (g2) this.f34158a;
        SearchView searchView = g2Var.M;
        String string = charSequence == null ? BuildConfig.VERSION_NAME : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorG = g2Var.g(g2Var.N, string);
                if (cursorG != null) {
                    cursorG.getCount();
                } else {
                    cursorG = null;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            cursorG = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar = this.f34158a;
        Cursor cursor = cVar.f34153c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((g2) cVar).b((Cursor) obj);
    }
}
