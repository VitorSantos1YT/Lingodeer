package ou;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import g00.d1;
import g2.k;
import g2.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.m;
import lz.g;
import ns.o;
import oz.q;
import qy.h;
import qy.j;
import qy.l;
import ry.n;
import ry.r;
import ry.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@c00.e
public final class c {
    public static final b Companion = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h[] f46067j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f46071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f46072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f46073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f46074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46076i;

    static {
        j jVar = j.PUBLICATION;
        f46067j = new h[]{null, com.bumptech.glide.d.u(jVar, new ns.d(9)), com.bumptech.glide.d.u(jVar, new ns.d(10)), com.bumptech.glide.d.u(jVar, new ns.d(11)), null, null};
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[LOOP:6: B:31:0x0080->B:33:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, ry.r] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public c(int i11, String character, List list, List medians, List list2, int i12, int i13) {
        int i14;
        Iterator it;
        if (7 != (i11 & 7)) {
            d1.k(i11, 7, a.f46066a.getDescriptor());
            throw null;
        }
        this.f46068a = character;
        this.f46069b = list;
        this.f46070c = medians;
        int i15 = i11 & 8;
        Object arrayList = r.f50854a;
        if (i15 == 0) {
            this.f46071d = arrayList;
        } else {
            this.f46071d = list2;
        }
        int size = list.size();
        m.f(character, "character");
        m.f(medians, "medians");
        int iMin = Math.min(size, medians.size());
        int i16 = 0;
        if (iMin > 0) {
            if (character.length() == 0) {
                g gVarU = hz.b.U(0, iMin);
                arrayList = new ArrayList(n.W(gVarU, 10));
                it = gVarU.iterator();
                while (((lz.f) it).f40537c) {
                    int iNextInt = ((w) it).nextInt();
                    arrayList.add(new d(iNextInt, o.K(Integer.valueOf(iNextInt))));
                }
            } else {
                int i17 = 0;
                while (true) {
                    if (i17 < character.length()) {
                        char cCharAt = character.charAt(i17);
                        if ((12352 > cCharAt || cCharAt >= 12448) && ((12448 > cCharAt || cCharAt >= 12544) && (12784 > cCharAt || cCharAt >= 12800))) {
                            g gVarU2 = hz.b.U(0, iMin);
                            arrayList = new ArrayList(n.W(gVarU2, 10));
                            it = gVarU2.iterator();
                            while (((lz.f) it).f40537c) {
                                int iNextInt2 = ((w) it).nextInt();
                                arrayList.add(new d(iNextInt2, o.K(Integer.valueOf(iNextInt2))));
                            }
                        } else {
                            i17++;
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayListM = o.M(0);
                        int i18 = 1;
                        int i19 = 1;
                        while (i19 < iMin) {
                            List list3 = (List) medians.get(i19 - 1);
                            List list4 = (List) medians.get(i19);
                            int iMin2 = Math.min(list3.size(), list4.size());
                            if (iMin2 == 0) {
                                arrayList2.add(ry.m.a1(arrayListM));
                                arrayListM = o.M(Integer.valueOf(i19));
                            } else {
                                int i21 = i16;
                                while (i21 < Math.min(list3.size(), list4.size()) && m.a(list3.get((list3.size() - i18) - i21), list4.get((list4.size() - i18) - i21))) {
                                    i21++;
                                }
                                int i22 = (i21 < 5 || ((float) i21) / ((float) iMin2) < 0.45f) ? i16 : i18;
                                boolean z11 = ob.f.D(list4) >= 1024 && i21 >= 3;
                                int i23 = 0;
                                while (i23 < Math.min(list3.size(), list4.size()) && m.a(list3.get(i23), list4.get(i23))) {
                                    i23++;
                                }
                                boolean z12 = i23 >= 3 && i21 >= 3 && ((float) Math.min(iMin2, i23 + i21)) / ((float) iMin2) >= 0.65f;
                                if (i22 != 0 || z11 || z12) {
                                    arrayListM.add(Integer.valueOf(i19));
                                } else {
                                    arrayList2.add(ry.m.a1(arrayListM));
                                    arrayListM = o.M(Integer.valueOf(i19));
                                }
                            }
                            i19++;
                            i16 = 0;
                            i18 = 1;
                        }
                        arrayList2.add(ry.m.a1(arrayListM));
                        arrayList = new ArrayList(n.W(arrayList2, 10));
                        int size2 = arrayList2.size();
                        int i24 = 0;
                        while (i24 < size2) {
                            Object obj = arrayList2.get(i24);
                            i24++;
                            List list5 = (List) obj;
                            Iterator it2 = list5.iterator();
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            Object next = it2.next();
                            if (it2.hasNext()) {
                                int iD = ob.f.D((List) medians.get(((Number) next).intValue()));
                                do {
                                    Object next2 = it2.next();
                                    int iD2 = ob.f.D((List) medians.get(((Number) next2).intValue()));
                                    if (iD > iD2) {
                                        next = next2;
                                        iD = iD2;
                                    }
                                } while (it2.hasNext());
                            }
                            arrayList.add(new d(((Number) next).intValue(), list5));
                        }
                    }
                }
            }
        }
        this.f46072e = arrayList;
        this.f46073f = new ArrayList();
        this.f46074g = new ArrayList();
        if ((i11 & 16) == 0) {
            i14 = 0;
            this.f46075h = 0;
        } else {
            i14 = 0;
            this.f46075h = i12;
        }
        if ((i11 & 32) == 0) {
            this.f46076i = i14;
        } else {
            this.f46076i = i13;
        }
    }

    public final float a(double d5) {
        return (float) (d5 * ((double) (this.f46075h / 1024.0f)));
    }

    public final float b(double d5) {
        return (float) ((-(d5 - ((double) 900))) * ((double) (this.f46076i / 1024.0f)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
    public final void c() {
        int i11;
        ArrayList arrayList = this.f46074g;
        m.d(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<androidx.compose.ui.graphics.Path>");
        c0.b(arrayList).clear();
        Iterator it = this.f46072e.iterator();
        while (it.hasNext()) {
            List list = (List) ry.m.t0(((d) it.next()).f46077a, this.f46070c);
            if (list == null || list.isEmpty()) {
                c0.b(arrayList).add(g2.o.a());
            } else {
                k kVarA = g2.o.a();
                ArrayList arrayList2 = new ArrayList(n.W(list, 10));
                Iterator it2 = list.iterator();
                while (true) {
                    i11 = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    List list2 = (List) it2.next();
                    arrayList2.add(new l(Float.valueOf(a(((Number) list2.get(0)).intValue())), Float.valueOf(b(((Number) list2.get(1)).intValue()))));
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    if (((Number) ((l) obj).f48495a).floatValue() > CropImageView.DEFAULT_ASPECT_RATIO) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    c0.b(arrayList).add(kVarA);
                } else {
                    kVarA.g(((Number) ((l) arrayList3.get(0)).f48495a).floatValue(), ((Number) ((l) arrayList3.get(0)).f48496b).floatValue());
                    int size2 = arrayList3.size() - 1;
                    while (i11 < size2) {
                        l lVar = (l) arrayList3.get(i11);
                        i11++;
                        l lVar2 = (l) arrayList3.get(i11);
                        Object obj2 = lVar.f48495a;
                        Object obj3 = lVar.f48496b;
                        float fFloatValue = ((Number) lVar2.f48495a).floatValue() + ((Number) obj2).floatValue();
                        float f5 = 2;
                        Number number = (Number) obj3;
                        kVarA.i(((Number) lVar.f48495a).floatValue(), number.floatValue(), fFloatValue / f5, (((Number) lVar2.f48496b).floatValue() + number.floatValue()) / f5);
                    }
                    l lVar3 = (l) ry.m.z0(arrayList3);
                    kVarA.f(((Number) lVar3.f48495a).floatValue(), ((Number) lVar3.f48496b).floatValue());
                    c0.b(arrayList).add(kVarA);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.lang.Object] */
    public final void d() {
        String[] strArr;
        ArrayList arrayList = this.f46073f;
        m.d(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<androidx.compose.ui.graphics.Path>");
        c0.b(arrayList).clear();
        List list = this.f46069b;
        ArrayList arrayList2 = new ArrayList(n.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ob.e eVar = new ob.e(19);
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList3 = new ArrayList();
            StringBuilder sb3 = new StringBuilder();
            int length = str.length();
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if (Character.isDigit(cCharAt) || cCharAt == '.') {
                    sb3.append(cCharAt);
                } else {
                    if (sb3.length() > 0) {
                        String string = sb3.toString();
                        m.e(string, "toString(...)");
                        arrayList3.add(string);
                        sb3.setLength(0);
                    }
                    if (Character.isLetter(cCharAt)) {
                        arrayList3.add(String.valueOf(cCharAt));
                    } else if (cCharAt == '-') {
                        sb3.append(cCharAt);
                    }
                }
            }
            if (sb3.length() > 0) {
                String string2 = sb3.toString();
                m.e(string2, "toString(...)");
                arrayList3.add(string2);
            }
            String[] strArr2 = (String[]) arrayList3.toArray(new String[0]);
            int length2 = strArr2.length;
            double d5 = 0.0d;
            String str2 = BuildConfig.VERSION_NAME;
            double d11 = 0.0d;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length2) {
                ArrayList arrayList4 = arrayList;
                String str3 = strArr2[i13];
                Iterator it2 = it;
                char cCharAt2 = str3.charAt(i11);
                if (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '-') {
                    strArr = strArr2;
                    sb2.append(str3);
                    str2 = str3;
                    i14 = 0;
                } else {
                    i14++;
                    double d12 = Double.parseDouble(str3);
                    int iHashCode = str2.hashCode();
                    strArr = strArr2;
                    if (iHashCode == 72) {
                        if (str2.equals("H")) {
                            sb2.append(a(d12));
                        } else if (i14 % 2 != 0) {
                            if (Character.isLowerCase(q.C0(str2))) {
                                d12 += d11;
                                sb2.append(b(d12) - b(d11));
                            } else {
                                sb2.append(b(d12));
                            }
                            d11 = d12;
                        } else if (Character.isLowerCase(q.C0(str2))) {
                            d12 += d5;
                            sb2.append(a(d12) - a(d5));
                        } else {
                            sb2.append(a(d12));
                        }
                        d5 = d12;
                    } else if (iHashCode != 86) {
                        if (iHashCode != 104) {
                            if (iHashCode == 118 && str2.equals("v")) {
                                d12 += d11;
                                sb2.append(b(d12) - b(d11));
                            }
                            d11 = d12;
                        } else {
                            if (str2.equals("h")) {
                                d12 += d5;
                                sb2.append(a(d12) - a(d5));
                            }
                            d5 = d12;
                        }
                        if (i14 % 2 != 0) {
                            if (Character.isLowerCase(q.C0(str2))) {
                                d12 += d11;
                                sb2.append(b(d12) - b(d11));
                            } else {
                                sb2.append(b(d12));
                            }
                            d11 = d12;
                        } else {
                            if (Character.isLowerCase(q.C0(str2))) {
                                d12 += d5;
                                sb2.append(a(d12) - a(d5));
                            } else {
                                sb2.append(a(d12));
                            }
                            d5 = d12;
                        }
                    } else {
                        if (str2.equals("V")) {
                            sb2.append(b(d12));
                        } else if (i14 % 2 != 0) {
                            if (Character.isLowerCase(q.C0(str2))) {
                                d12 += d5;
                                sb2.append(a(d12) - a(d5));
                            } else {
                                sb2.append(a(d12));
                            }
                            d5 = d12;
                        } else if (Character.isLowerCase(q.C0(str2))) {
                            d12 += d11;
                            sb2.append(b(d12) - b(d11));
                        } else {
                            sb2.append(b(d12));
                        }
                        d11 = d12;
                    }
                }
                sb2.append(" ");
                i13++;
                arrayList = arrayList4;
                it = it2;
                strArr2 = strArr;
                i11 = 0;
            }
            ArrayList arrayList5 = arrayList;
            Iterator it3 = it;
            if (sb2.length() > 0) {
                m.e(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
            }
            String string3 = sb2.toString();
            m.e(string3, "toString(...)");
            ArrayList arrayList6 = (ArrayList) eVar.f44804b;
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
                eVar.f44804b = arrayList6;
            } else {
                arrayList6.clear();
            }
            eVar.u(arrayList6, string3);
            k kVarA = g2.o.a();
            ArrayList arrayList7 = (ArrayList) eVar.f44804b;
            arrayList2.add(arrayList7 != null ? l2.a.e(arrayList7, kVarA) : g2.o.a());
            arrayList = arrayList5;
            it = it3;
        }
        ArrayList arrayList8 = arrayList;
        for (d dVar : this.f46072e) {
            k kVarA2 = g2.o.a();
            Iterator it4 = dVar.f46078b.iterator();
            while (it4.hasNext()) {
                p0 p0Var = (p0) ry.m.t0(((Number) it4.next()).intValue(), arrayList2);
                if (p0Var != null) {
                    p0.b(kVarA2, p0Var);
                }
            }
            c0.b(arrayList8).add(kVarA2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f46068a, cVar.f46068a) && m.a(this.f46069b, cVar.f46069b) && m.a(this.f46070c, cVar.f46070c) && m.a(this.f46071d, cVar.f46071d);
    }

    public final int hashCode() {
        return this.f46071d.hashCode() + hh.p0.b(hh.p0.b(this.f46068a.hashCode() * 31, 31, this.f46069b), 31, this.f46070c);
    }

    public final String toString() {
        return "HanziBean(character=" + this.f46068a + ", strokes=" + this.f46069b + ", medians=" + this.f46070c + ", radStrokes=" + this.f46071d + ")";
    }
}
