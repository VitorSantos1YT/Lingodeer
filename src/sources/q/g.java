package q;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.lingodeer.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47265a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f47266b;

    public g(h hVar) {
        this.f47266b = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f47266b.f47269c;
        n nVar = lVar.X;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.L;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((n) arrayList.get(i11)) == nVar) {
                    this.f47265a = i11;
                    return;
                }
            }
        }
        this.f47265a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i11) {
        h hVar = this.f47266b;
        l lVar = hVar.f47269c;
        lVar.i();
        ArrayList arrayList = lVar.L;
        hVar.getClass();
        int i12 = this.f47265a;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return (n) arrayList.get(i11);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.f47266b;
        l lVar = hVar.f47269c;
        lVar.i();
        int size = lVar.L.size();
        hVar.getClass();
        return this.f47265a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f47266b.f47268b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((w) view).c(getItem(i11));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
