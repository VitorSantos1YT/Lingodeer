package jj;

import android.database.Cursor;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f36410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36414f;

    public static ArrayList a(org.greenrobot.greendao.database.a aVar, String str) {
        Cursor cursorD = aVar.d("PRAGMA table_info(`" + str + "`)", null);
        if (cursorD == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        while (cursorD.moveToNext()) {
            b bVar = new b();
            boolean z11 = false;
            bVar.f36409a = cursorD.getInt(0);
            bVar.f36410b = cursorD.getString(1);
            bVar.f36411c = cursorD.getString(2);
            bVar.f36412d = cursorD.getInt(3) == 1;
            bVar.f36413e = cursorD.getString(4);
            if (cursorD.getInt(5) == 1) {
                z11 = true;
            }
            bVar.f36414f = z11;
            arrayList.add(bVar);
        }
        cursorD.close();
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && b.class == obj.getClass() && this.f36410b.equals(((b) obj).f36410b);
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TableInfo{cid=");
        sb2.append(this.f36409a);
        sb2.append(", name='");
        sb2.append(this.f36410b);
        sb2.append("', type='");
        sb2.append(this.f36411c);
        sb2.append("', notnull=");
        sb2.append(this.f36412d);
        sb2.append(", dfltValue='");
        sb2.append(this.f36413e);
        sb2.append("', pk=");
        return ep.a.l(sb2, this.f36414f, '}');
    }
}
