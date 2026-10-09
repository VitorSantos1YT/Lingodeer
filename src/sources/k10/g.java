package k10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.c f37850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f37851b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final org.greenrobot.greendao.a f37854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f37855f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f37852c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f37853d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f37856g = " COLLATE NOCASE";

    public g(org.greenrobot.greendao.a aVar) {
        this.f37854e = aVar;
        this.f37850a = new ob.c(aVar);
    }

    public final void a(StringBuilder sb2) {
        ArrayList arrayList = this.f37852c;
        arrayList.clear();
        ArrayList arrayList2 = this.f37853d;
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            sb2.append(" JOIN ");
            sb2.append('\"');
            throw null;
        }
        ob.c cVar = this.f37850a;
        if (!((ArrayList) cVar.f44800c).isEmpty()) {
            sb2.append(" WHERE ");
            ListIterator listIterator = ((ArrayList) cVar.f44800c).listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.hasPrevious()) {
                    sb2.append(" AND ");
                }
                h hVar = (h) listIterator.next();
                org.greenrobot.greendao.d dVar = hVar.f37860d;
                int i11 = j10.c.f35524a;
                sb2.append("T");
                sb2.append('.');
                sb2.append('\"');
                sb2.append(dVar.f45727e);
                sb2.append('\"');
                sb2.append(hVar.f37861e);
                if (hVar.f37857a) {
                    arrayList.add(hVar.f37858b);
                } else {
                    Object[] objArr = hVar.f37859c;
                    if (objArr != null) {
                        for (Object obj : objArr) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
    }

    public final e b() {
        StringBuilder sbC = c();
        Integer num = this.f37855f;
        ArrayList arrayList = this.f37852c;
        if (num != null) {
            sbC.append(" LIMIT ?");
            arrayList.add(this.f37855f);
            arrayList.size();
        }
        return (e) new c(this.f37854e, sbC.toString(), a.b(arrayList.toArray()), 1, (byte) 0).b();
    }

    public final StringBuilder c() {
        org.greenrobot.greendao.a aVar = this.f37854e;
        StringBuilder sb2 = new StringBuilder(j10.c.c(aVar.getTablename(), aVar.getAllColumns()));
        a(sb2);
        StringBuilder sb3 = this.f37851b;
        if (sb3 != null && sb3.length() > 0) {
            sb2.append(" ORDER BY ");
            sb2.append((CharSequence) this.f37851b);
        }
        return sb2;
    }

    public final List d() {
        int size;
        StringBuilder sbC = c();
        Integer num = this.f37855f;
        ArrayList arrayList = this.f37852c;
        if (num != null) {
            sbC.append(" LIMIT ?");
            arrayList.add(this.f37855f);
            size = arrayList.size() - 1;
        } else {
            size = -1;
        }
        f fVar = (f) new c(this.f37854e, sbC.toString(), a.b(arrayList.toArray()), size).b();
        fVar.a();
        return ((org.greenrobot.greendao.a) fVar.f37841b.f40184b).loadAllAndCloseCursor(fVar.f37840a.getDatabase().d(fVar.f37842c, fVar.f37843d));
    }

    public final void e(String str, org.greenrobot.greendao.d... dVarArr) {
        String str2;
        for (org.greenrobot.greendao.d dVar : dVarArr) {
            StringBuilder sb2 = this.f37851b;
            if (sb2 == null) {
                this.f37851b = new StringBuilder();
            } else if (sb2.length() > 0) {
                this.f37851b.append(",");
            }
            StringBuilder sb3 = this.f37851b;
            this.f37850a.k(dVar);
            sb3.append("T");
            sb3.append('.');
            sb3.append('\'');
            sb3.append(dVar.f45727e);
            sb3.append('\'');
            if (String.class.equals(dVar.f45724b) && (str2 = this.f37856g) != null) {
                this.f37851b.append(str2);
            }
            this.f37851b.append(str);
        }
    }

    public final void f(h hVar, h... hVarArr) {
        ob.c cVar = this.f37850a;
        cVar.getClass();
        cVar.k(hVar.f37860d);
        ArrayList arrayList = (ArrayList) cVar.f44800c;
        arrayList.add(hVar);
        for (h hVar2 : hVarArr) {
            if (hVar2 instanceof h) {
                cVar.k(hVar2.f37860d);
            }
            arrayList.add(hVar2);
        }
    }
}
