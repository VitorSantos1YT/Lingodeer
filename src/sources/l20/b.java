package l20;

import a9.e;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import dl.ExOZ.xItStCyvVEZ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f39709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39710e;

    public b(CharSequence charSequence, a aVar) {
        this.f39706a = 0;
        this.f39707b = 0;
        this.f39710e = null;
        this.f39708c = charSequence;
        this.f39709d = aVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f39706a) {
            case 0:
                return this.f39707b < ((CharSequence) this.f39708c).length();
            default:
                return ((Cursor) this.f39708c).moveToNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f39706a) {
            case 0:
                a aVar = (a) this.f39709d;
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (((m20.a) this.f39710e) == null) {
                    if (!aVar.hasNext()) {
                        int length = ((CharSequence) this.f39708c).length();
                        e eVar = new e(this.f39707b, length, 4);
                        this.f39707b = length;
                        return eVar;
                    }
                    if (!aVar.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    m20.a aVar2 = aVar.f39702b;
                    aVar.f39702b = null;
                    this.f39710e = aVar2;
                }
                int i11 = this.f39707b;
                m20.a aVar3 = (m20.a) this.f39710e;
                int i12 = aVar3.f40829b;
                if (i11 < i12) {
                    e eVar2 = new e(i11, i12, 4);
                    this.f39707b = i12;
                    return eVar2;
                }
                this.f39707b = aVar3.f40830c;
                this.f39710e = null;
                return aVar3;
            default:
                bw.c cVarU = tp.e.u((Cursor) this.f39708c);
                this.f39707b = cVarU.f6390a;
                return cVarU;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f39706a) {
            case 0:
                throw new UnsupportedOperationException(xItStCyvVEZ.JGBIHzvvFwRMYWL);
            default:
                ((ArrayList) this.f39709d).add(Integer.valueOf(this.f39707b));
                return;
        }
    }

    public b(tp.e eVar) {
        this.f39706a = 1;
        this.f39710e = eVar;
        this.f39709d = new ArrayList();
        this.f39708c = ((SQLiteDatabase) eVar.f52454b).rawQuery("SELECT * FROM filedownloader", null);
    }
}
