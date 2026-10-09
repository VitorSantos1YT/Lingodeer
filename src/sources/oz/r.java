package oz;

import dl.ExOZ.xItStCyvVEZ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends se.p {
    public static String g0(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        List listZ = nz.n.Z(new nz.o(str, 2));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ) {
            if (!q.K0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!qx.p.s(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Integer num = (Integer) ry.m.C0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listZ.size();
        int iA = ns.o.A(listZ);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length3);
                ry.m.x0(arrayList3, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i13 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            String str3 = (String) next;
            String strY0 = ((i11 == 0 || i11 == iA) && q.K0(str3)) ? null : q.y0(iIntValue, str3);
            if (strY0 != null) {
                arrayList3.add(strY0);
            }
            i11 = i13;
        }
    }

    public static String h0(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        if (q.K0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listZ = nz.n.Z(new nz.o(str, 2));
        int length = str.length();
        listZ.size();
        int iA = ns.o.A(listZ);
        ArrayList arrayList = new ArrayList();
        Iterator it = listZ.iterator();
        int i11 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                ry.m.x0(arrayList, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                ns.o.V();
                throw null;
            }
            String str2 = (String) next;
            if ((i11 != 0 && i11 != iA) || !q.K0(str2)) {
                int length2 = str2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i13 = -1;
                        break;
                    }
                    if (!qx.p.s(str2.charAt(i13))) {
                        break;
                    }
                    i13++;
                }
                if (i13 != -1 && x.r0(i13, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i13);
                    kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i11 = i12;
        }
    }

    public static String e0(String str, String str2) {
        kotlin.jvm.internal.m.f(str, "<this>");
        int i11 = 2;
        return nz.n.V(nz.n.W(new nz.o(str, i11), new gh.g(str2, i11)), xItStCyvVEZ.uwPjpu);
    }
}
