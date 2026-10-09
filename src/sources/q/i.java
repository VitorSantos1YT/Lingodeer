package q;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f47273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47274b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f47277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47278f;

    public i(l lVar, LayoutInflater layoutInflater, boolean z11, int i11) {
        this.f47276d = z11;
        this.f47277e = layoutInflater;
        this.f47273a = lVar;
        this.f47278f = i11;
        a();
    }

    public final void a() {
        l lVar = this.f47273a;
        n nVar = lVar.X;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.L;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((n) arrayList.get(i11)) == nVar) {
                    this.f47274b = i11;
                    return;
                }
            }
        }
        this.f47274b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i11) {
        ArrayList arrayListL;
        boolean z11 = this.f47276d;
        l lVar = this.f47273a;
        if (z11) {
            lVar.i();
            arrayListL = lVar.L;
        } else {
            arrayListL = lVar.l();
        }
        int i12 = this.f47274b;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return (n) arrayListL.get(i11);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z11 = this.f47276d;
        l lVar = this.f47273a;
        if (z11) {
            lVar.i();
            arrayListL = lVar.L;
        } else {
            arrayListL = lVar.l();
        }
        return this.f47274b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public final View getView(int i11, View view, ViewGroup viewGroup) {
        boolean z11 = false;
        if (view == null) {
            view = this.f47277e.inflate(this.f47278f, viewGroup, false);
        }
        int i12 = getItem(i11).f47292b;
        int i13 = i11 - 1;
        int i14 = i13 >= 0 ? getItem(i13).f47292b : i12;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f47273a.m() && i12 != i14) {
            z11 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z11);
        w wVar = (w) view;
        if (this.f47275c) {
            listMenuItemView.setForceShowIcon(true);
        }
        wVar.c(getItem(i11));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
