package i5;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import nv.p;
import r.g2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Cursor f34153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f34155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f34156f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f34157t;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f34153c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f34155e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f34156f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f34153c = cursor;
            if (cursor != null) {
                a aVar2 = this.f34155e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f34156f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f34154d = cursor.getColumnIndexOrThrow("_id");
                this.f34151a = true;
                notifyDataSetChanged();
            } else {
                this.f34154d = -1;
                this.f34151a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f34151a || (cursor = this.f34153c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f34151a) {
            return null;
        }
        this.f34153c.moveToPosition(i11);
        if (view == null) {
            g2 g2Var = (g2) this;
            view = g2Var.L.inflate(g2Var.K, viewGroup, false);
        }
        a(view, this.f34153c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f34157t == null) {
            d dVar = new d();
            dVar.f34158a = this;
            this.f34157t = dVar;
        }
        return this.f34157t;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i11) {
        Cursor cursor;
        if (!this.f34151a || (cursor = this.f34153c) == null) {
            return null;
        }
        cursor.moveToPosition(i11);
        return this.f34153c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i11) {
        Cursor cursor;
        if (this.f34151a && (cursor = this.f34153c) != null && cursor.moveToPosition(i11)) {
            return this.f34153c.getLong(this.f34154d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (!this.f34151a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f34153c.moveToPosition(i11)) {
            throw new IllegalStateException(p.j(i11, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f34153c);
        return view;
    }
}
