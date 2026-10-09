package tp;

import android.content.ContentValues;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.lingo.lingoskill.ui.review.AckCardActivity;
import dl.ExOZ.xItStCyvVEZ;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import uz.i1;
import y2.c2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements tx.c, av.l, wv.a, u1.d, zd.r, zd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52454b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f52453a = i11;
        this.f52454b = obj;
    }

    public static bw.c u(Cursor cursor) {
        bw.c cVar = new bw.c();
        cVar.f6390a = cursor.getInt(cursor.getColumnIndex("_id"));
        cVar.f6391b = cursor.getString(cursor.getColumnIndex("url"));
        String string = cursor.getString(cursor.getColumnIndex("path"));
        boolean z11 = cursor.getShort(cursor.getColumnIndex("pathAsDirectory")) == 1;
        cVar.f6392c = string;
        cVar.f6393d = z11;
        cVar.e((byte) cursor.getShort(cursor.getColumnIndex("status")));
        cVar.d(cursor.getLong(cursor.getColumnIndex("sofar")));
        cVar.g(cursor.getLong(cursor.getColumnIndex("total")));
        cVar.K = cursor.getString(cursor.getColumnIndex("errMsg"));
        cVar.L = cursor.getString(cursor.getColumnIndex("etag"));
        cVar.f6394e = cursor.getString(cursor.getColumnIndex("filename"));
        cVar.M = cursor.getInt(cursor.getColumnIndex("connectionCount"));
        return cVar;
    }

    @Override // av.l
    public void a() {
        i1 i1Var = ((vs.d) this.f52454b).f54152d;
        i1Var.getClass();
        i1Var.l(null, -1);
    }

    @Override // tx.c
    public void accept(Object obj) {
        List list = (List) obj;
        AckCardActivity ackCardActivity = (AckCardActivity) this.f52454b;
        kotlin.jvm.internal.m.c(list);
        ackCardActivity.R = list;
        ((hj.f) ackCardActivity.j()).f32552h.setText(String.valueOf(ackCardActivity.R.size()));
        ackCardActivity.v();
    }

    @Override // wv.a
    public void b(bw.a aVar) {
        ((SQLiteDatabase) this.f52454b).insert("filedownloaderConnection", null, aVar.a());
    }

    @Override // wv.a
    public void c(int i11) {
    }

    @Override // wv.a
    public void clear() {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f52454b;
        sQLiteDatabase.delete("filedownloader", null, null);
        sQLiteDatabase.delete("filedownloaderConnection", null, null);
    }

    @Override // wv.a
    public void d(int i11, String str, long j11, long j12, int i12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sofar", Long.valueOf(j11));
        contentValues.put("total", Long.valueOf(j12));
        contentValues.put("etag", str);
        contentValues.put("connectionCount", Integer.valueOf(i12));
        y(i11, contentValues);
    }

    @Override // wv.a
    public void e(int i11) {
        remove(i11);
    }

    @Override // wv.a
    public void f(int i11, String str, String str2, long j11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 2);
        contentValues.put("total", Long.valueOf(j11));
        contentValues.put("etag", str);
        contentValues.put("filename", str2);
        y(i11, contentValues);
    }

    @Override // wv.a
    public void g(long j11, int i11, int i12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("currentOffset", Long.valueOf(j11));
        ((SQLiteDatabase) this.f52454b).update("filedownloaderConnection", contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i11), Integer.toString(i12)});
    }

    @Override // wv.a
    public void h(int i11) {
        ((SQLiteDatabase) this.f52454b).execSQL("DELETE FROM filedownloaderConnection WHERE id = " + i11);
    }

    @Override // wv.a
    public void i(Exception exc, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", exc.toString());
        contentValues.put("status", (Byte) (byte) 5);
        y(i11, contentValues);
    }

    @Override // wv.a
    public void j(int i11) {
    }

    @Override // wv.a
    public void k(bw.c cVar) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f52454b;
        if (cVar == null) {
            o00.a.P(this, "update but model == null!", new Object[0]);
        } else if (r(cVar.f6390a) != null) {
            sQLiteDatabase.update("filedownloader", cVar.i(), "_id = ? ", new String[]{String.valueOf(cVar.f6390a)});
        } else {
            sQLiteDatabase.insert("filedownloader", null, cVar.i());
        }
    }

    @Override // zd.a
    public com.bumptech.glide.load.data.d l(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.j(assetManager, str, 1);
    }

    public void m(y2.i0 i0Var) {
        if (!i0Var.I()) {
            v2.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((c2) this.f52454b).add(i0Var);
    }

    @Override // wv.a
    public void n(int i11, long j11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 3);
        contentValues.put("sofar", Long.valueOf(j11));
        y(i11, contentValues);
    }

    @Override // wv.a
    public void o(int i11, long j11, Throwable th2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th2.toString());
        contentValues.put("status", (Byte) (byte) -1);
        contentValues.put("sofar", Long.valueOf(j11));
        y(i11, contentValues);
    }

    @Override // zd.r
    public zd.q p(zd.w wVar) {
        return new zd.b(0, (AssetManager) this.f52454b, this);
    }

    @Override // wv.a
    public ArrayList q(int i11) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f52454b;
            int i12 = ew.f.f25949a;
            Locale locale = Locale.ENGLISH;
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM filedownloaderConnection WHERE id = ?", new String[]{Integer.toString(i11)});
            while (cursorRawQuery.moveToNext()) {
                bw.a aVar = new bw.a();
                aVar.f6384a = i11;
                aVar.f6385b = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("connectionIndex"));
                aVar.f6386c = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("startOffset"));
                aVar.f6387d = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("currentOffset"));
                aVar.f6388e = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("endOffset"));
                arrayList.add(aVar);
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @Override // wv.a
    public bw.c r(int i11) throws Throwable {
        Throwable th2;
        Cursor cursorRawQuery;
        try {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f52454b;
            int i12 = ew.f.f25949a;
            Locale locale = Locale.ENGLISH;
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM filedownloader WHERE _id = ?", new String[]{Integer.toString(i11)});
            try {
                if (!cursorRawQuery.moveToNext()) {
                    cursorRawQuery.close();
                    return null;
                }
                bw.c cVarU = u(cursorRawQuery);
                cursorRawQuery.close();
                return cVarU;
            } catch (Throwable th3) {
                th2 = th3;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursorRawQuery = null;
        }
    }

    @Override // wv.a
    public boolean remove(int i11) {
        return ((SQLiteDatabase) this.f52454b).delete("filedownloader", "_id = ?", new String[]{String.valueOf(i11)}) != 0;
    }

    @Override // wv.a
    public void s(int i11, int i12) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("connectionCount", Integer.valueOf(i12));
        ((SQLiteDatabase) this.f52454b).update("filedownloader", contentValues, "_id = ? ", new String[]{Integer.toString(i11)});
    }

    @Override // wv.a
    public void t(int i11, long j11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) -2);
        contentValues.put("sofar", Long.valueOf(j11));
        y(i11, contentValues);
    }

    public String toString() {
        switch (this.f52453a) {
            case 6:
                return ((c2) this.f52454b).toString();
            default:
                return super.toString();
        }
    }

    public boolean v(y2.i0 i0Var) {
        if (!i0Var.I()) {
            v2.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((c2) this.f52454b).remove(i0Var);
    }

    public void w() {
        ((WebSettingsBoundaryInterface) this.f52454b).setAlgorithmicDarkeningAllowed(true);
    }

    public void x() {
        ((WebSettingsBoundaryInterface) this.f52454b).setForceDark(2);
    }

    public e(int i11) {
        this.f52453a = i11;
        switch (i11) {
            case 4:
                this.f52454b = new b7.w(10);
                break;
            case 5:
            case 8:
            default:
                this.f52454b = new wv.d(ns.o.f44007a, "filedownloader.db", null, 4).getWritableDatabase();
                break;
            case 6:
                this.f52454b = new c2(y2.f.f56854b);
                break;
            case 7:
                u1.c cVar = new u1.c();
                this.f52454b = cVar;
                if (!cVar.f52723b) {
                    if (cVar.f52724c) {
                        v1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.f52724c = true;
                    break;
                }
                break;
            case 9:
                this.f52454b = new zd.n(500L);
                break;
        }
    }

    public void y(int i11, ContentValues contentValues) {
        ((SQLiteDatabase) this.f52454b).update(xItStCyvVEZ.QKjDFFl, contentValues, "_id = ? ", new String[]{String.valueOf(i11)});
    }
}
