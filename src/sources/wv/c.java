package wv;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import ew.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import tp.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f55486a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l20.b f55487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f55488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f55489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f55490e;

    public c(e eVar, SparseArray sparseArray, SparseArray sparseArray2) {
        this.f55490e = eVar;
        this.f55488c = sparseArray;
        this.f55489d = sparseArray2;
    }

    public final void b() {
        SparseArray sparseArray;
        l20.b bVar = this.f55487b;
        if (bVar != null) {
            e eVar = (e) bVar.f39710e;
            ((Cursor) bVar.f39708c).close();
            ArrayList arrayList = (ArrayList) bVar.f39709d;
            if (!arrayList.isEmpty()) {
                String strJoin = TextUtils.join(", ", arrayList);
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) eVar.f52454b;
                int i11 = f.f25949a;
                Locale locale = Locale.ENGLISH;
                sQLiteDatabase.execSQL("DELETE FROM filedownloader WHERE _id IN (" + strJoin + ");");
                ((SQLiteDatabase) eVar.f52454b).execSQL("DELETE FROM filedownloaderConnection WHERE id IN (" + strJoin + ");");
            }
        }
        SparseArray sparseArray2 = this.f55486a;
        int size = sparseArray2.size();
        if (size < 0) {
            return;
        }
        e eVar2 = this.f55490e;
        SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) eVar2.f52454b;
        SQLiteDatabase sQLiteDatabase3 = (SQLiteDatabase) eVar2.f52454b;
        sQLiteDatabase2.beginTransaction();
        for (int i12 = 0; i12 < size; i12++) {
            try {
                int iKeyAt = sparseArray2.keyAt(i12);
                bw.c cVar = (bw.c) sparseArray2.get(iKeyAt);
                sQLiteDatabase3.delete("filedownloader", "_id = ?", new String[]{String.valueOf(iKeyAt)});
                sQLiteDatabase3.insert("filedownloader", null, cVar.i());
                if (cVar.M > 1) {
                    ArrayList arrayListQ = eVar2.q(iKeyAt);
                    if (arrayListQ.size() > 0) {
                        sQLiteDatabase3.delete("filedownloaderConnection", "id = ?", new String[]{String.valueOf(iKeyAt)});
                        int size2 = arrayListQ.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj = arrayListQ.get(i13);
                            i13++;
                            bw.a aVar = (bw.a) obj;
                            aVar.f6384a = cVar.f6390a;
                            sQLiteDatabase3.insert("filedownloaderConnection", null, aVar.a());
                        }
                    }
                }
            } catch (Throwable th2) {
                sQLiteDatabase3.endTransaction();
                throw th2;
            }
        }
        SparseArray sparseArray3 = this.f55488c;
        if (sparseArray3 != null && (sparseArray = this.f55489d) != null) {
            int size3 = sparseArray3.size();
            for (int i14 = 0; i14 < size3; i14++) {
                int i15 = ((bw.c) sparseArray3.valueAt(i14)).f6390a;
                ArrayList arrayListQ2 = eVar2.q(i15);
                if (arrayListQ2.size() > 0) {
                    sparseArray.put(i15, arrayListQ2);
                }
            }
        }
        sQLiteDatabase3.setTransactionSuccessful();
        sQLiteDatabase3.endTransaction();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        l20.b bVar = new l20.b(this.f55490e);
        this.f55487b = bVar;
        return bVar;
    }
}
