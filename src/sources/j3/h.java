package j3;

import java.util.ArrayList;
import java.util.List;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements CharSequence {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f35698e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f35701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f35702d;

    static {
        o2 o2Var = o0.f35728a;
    }

    public h(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f35699a = list;
        this.f35700b = str;
        int i11 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i12 = 0; i12 < size; i12++) {
                f fVar = (f) list.get(i12);
                Object obj = fVar.f35689a;
                if (obj instanceof p0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(fVar);
                } else if (obj instanceof c0) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(fVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f35701c = arrayList;
        this.f35702d = arrayList2;
        List listS0 = arrayList2 != null ? ry.m.S0(arrayList2, new g(i11)) : null;
        if (listS0 == null || listS0.isEmpty()) {
            return;
        }
        int i13 = ((f) ry.m.q0(listS0)).f35691c;
        y.w wVar = y.l.f56733a;
        y.w wVar2 = new y.w(1);
        wVar2.a(i13);
        int size2 = listS0.size();
        for (int i14 = 1; i14 < size2; i14++) {
            f fVar2 = (f) listS0.get(i14);
            while (wVar2.f56783b != 0) {
                int iD = wVar2.d();
                int i15 = fVar2.f35690b;
                int i16 = fVar2.f35691c;
                if (i15 < iD) {
                    if (i16 > iD) {
                        p3.a.a("Paragraph overlap not allowed, end " + i16 + " should be less than or equal to " + iD);
                        break;
                    }
                    break;
                }
                wVar2.f(wVar2.f56783b - 1);
            }
            wVar2.a(fVar2.f35691c);
        }
    }

    public final List a(int i11) {
        List list = this.f35699a;
        if (list == null) {
            return ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            f fVar = (f) obj;
            if ((fVar.f35689a instanceof w) && i.b(0, i11, fVar.f35690b, fVar.f35691c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List b(int i11, String str) {
        List list = this.f35699a;
        if (list == null) {
            return ry.r.f50854a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            f fVar = (f) list.get(i12);
            Object obj = fVar.f35689a;
            int i13 = fVar.f35691c;
            int i14 = fVar.f35690b;
            String str2 = fVar.f35692d;
            if ((obj instanceof r0) && kotlin.jvm.internal.m.a(str, str2) && i.b(0, i11, i14, i13)) {
                Object obj2 = fVar.f35689a;
                kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                arrayList.add(new f(i14, i13, ((r0) obj2).f35774a, str2));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h subSequence(int i11, int i12) {
        ArrayList arrayList;
        if (i11 > i12) {
            p3.a.a("start (" + i11 + ") should be less or equal to end (" + i12 + ')');
        }
        String str = this.f35700b;
        if (i11 == 0 && i12 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i11, i12);
        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
        h hVar = i.f35705a;
        if (i11 > i12) {
            p3.a.a("start (" + i11 + ") should be less than or equal to end (" + i12 + ')');
        }
        List list = this.f35699a;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                f fVar = (f) list.get(i13);
                int i14 = fVar.f35690b;
                int i15 = fVar.f35691c;
                if (i.b(i11, i12, i14, i15)) {
                    arrayList.add(new f(Math.max(i11, fVar.f35690b) - i11, Math.min(i12, i15) - i11, fVar.f35689a, fVar.f35692d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new h(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i11) {
        return this.f35700b.charAt(i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f35700b, hVar.f35700b) && kotlin.jvm.internal.m.a(this.f35699a, hVar.f35699a);
    }

    public final int hashCode() {
        int iHashCode = this.f35700b.hashCode() * 31;
        List list = this.f35699a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f35700b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f35700b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(int i11, String str, ArrayList arrayList) {
        List list = (i11 & 2) != 0 ? ry.r.f50854a : arrayList;
        h hVar = i.f35705a;
        this(list.isEmpty() ? null : list, str);
    }

    public /* synthetic */ h(String str) {
        this(str, ry.r.f50854a);
    }

    public h(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
