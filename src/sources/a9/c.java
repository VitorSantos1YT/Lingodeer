package a9;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import b7.f0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fb.g0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f472k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f473l;
    public ArrayList m;

    public c(String str, String str2, long j11, long j12, h hVar, String[] strArr, String str3, String str4, c cVar) {
        this.f462a = str;
        this.f463b = str2;
        this.f470i = str4;
        this.f467f = hVar;
        this.f468g = strArr;
        this.f464c = str2 != null;
        this.f465d = j11;
        this.f466e = j12;
        str3.getClass();
        this.f469h = str3;
        this.f471j = cVar;
        this.f472k = new HashMap();
        this.f473l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, BuildConfig.VERSION_NAME, null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a7.a aVar = new a7.a();
            aVar.f388a = new SpannableStringBuilder();
            aVar.f389b = null;
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((a7.a) treeMap.get(str)).f388a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i11) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (c) arrayList.get(i11);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z11) {
        String str = this.f462a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z11 || zEquals || (zEquals2 && this.f470i != null)) {
            long j11 = this.f465d;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
            long j12 = this.f466e;
            if (j12 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j12));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i11 = 0; i11 < this.m.size(); i11++) {
            ((c) this.m.get(i11)).d(treeSet, z11 || zEquals);
        }
    }

    public final boolean f(long j11) {
        long j12 = this.f465d;
        long j13 = this.f466e;
        if (j12 == -9223372036854775807L && j13 == -9223372036854775807L) {
            return true;
        }
        if (j12 <= j11 && j13 == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j11 >= j13) {
            return j12 <= j11 && j11 < j13;
        }
        return true;
    }

    public final void g(long j11, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f469h;
        if (!BuildConfig.VERSION_NAME.equals(str3)) {
            str = str3;
        }
        if (f(j11) && "div".equals(this.f462a) && (str2 = this.f470i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i11 = 0; i11 < c(); i11++) {
            b(i11).g(j11, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x020c  */
    /* JADX WARN: Code duplicated, block: B:146:0x021a  */
    /* JADX WARN: Code duplicated, block: B:148:0x021d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0220  */
    /* JADX WARN: Code duplicated, block: B:151:0x0226  */
    /* JADX WARN: Code duplicated, block: B:153:0x0239  */
    /* JADX WARN: Code duplicated, block: B:165:0x026b  */
    /* JADX WARN: Code duplicated, block: B:168:0x0283  */
    /* JADX WARN: Code duplicated, block: B:169:0x0292  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    public final void h(long j11, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i11;
        c cVar;
        int i12;
        h hVarZ;
        int i13;
        float f5;
        float f11;
        float f12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i14;
        RelativeSizeSpan relativeSizeSpan;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Map map3 = map;
        if (f(j11)) {
            String str2 = this.f469h;
            String str3 = BuildConfig.VERSION_NAME.equals(str2) ? str : str2;
            Iterator it2 = this.f473l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f472k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    a7.a aVar = (a7.a) treeMap.get(str4);
                    aVar.getClass();
                    g gVar = (g) map2.get(str3);
                    gVar.getClass();
                    int i21 = gVar.f496j;
                    h hVarZ2 = g0.z(this.f467f, this.f468g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.f388a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.f388a = spannableStringBuilder;
                        aVar.f389b = null;
                    }
                    if (hVarZ2 != null) {
                        int i22 = hVarZ2.f504h;
                        int i23 = 1;
                        if (((i22 == -1 && hVarZ2.f505i == -1) ? -1 : (i22 == 1 ? (char) 1 : (char) 0) | (hVarZ2.f505i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i24 = hVarZ2.f504h;
                            if (i24 != -1) {
                                if (i24 == i23) {
                                    i17 = i23;
                                } else {
                                    i17 = 0;
                                }
                                if (hVarZ2.f505i == i23) {
                                    i18 = 2;
                                } else {
                                    i18 = 0;
                                }
                                i19 = i17 | i18;
                            } else if (hVarZ2.f505i == -1) {
                                i19 = -1;
                                i23 = 1;
                            } else {
                                i23 = 1;
                                if (i24 == i23) {
                                    i17 = i23;
                                } else {
                                    i17 = 0;
                                }
                                if (hVarZ2.f505i == i23) {
                                    i18 = 2;
                                } else {
                                    i18 = 0;
                                }
                                i19 = i17 | i18;
                            }
                            StyleSpan styleSpan = new StyleSpan(i19);
                            i11 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i11 = 33;
                        }
                        if (hVarZ2.f502f == i23) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i11);
                        }
                        if (hVarZ2.f503g == i23) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i11);
                        }
                        if (hVarZ2.f499c) {
                            if (!hVarZ2.f499c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            ew.a.h(spannableStringBuilder, new ForegroundColorSpan(hVarZ2.f498b), iIntValue, iIntValue2);
                        }
                        if (hVarZ2.f501e) {
                            if (!hVarZ2.f501e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            ew.a.h(spannableStringBuilder, new BackgroundColorSpan(hVarZ2.f500d), iIntValue, iIntValue2);
                        }
                        if (hVarZ2.f497a != null) {
                            ew.a.h(spannableStringBuilder, new TypefaceSpan(hVarZ2.f497a), iIntValue, iIntValue2);
                        }
                        b bVar = hVarZ2.f513r;
                        if (bVar != null) {
                            int i25 = bVar.f459a;
                            if (i25 == -1) {
                                i25 = (i21 == 2 || i21 == 1) ? 3 : 1;
                                i16 = 1;
                            } else {
                                i16 = bVar.f460b;
                            }
                            int i26 = bVar.f461c;
                            if (i26 == -2) {
                                i26 = 1;
                            }
                            ew.a.h(spannableStringBuilder, new a7.i(i25, i16, i26), iIntValue, iIntValue2);
                        }
                        int i27 = hVarZ2.m;
                        if (i27 == 2) {
                            c cVar2 = this.f471j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                h hVarZ3 = g0.z(cVar2.f467f, cVar2.f468g, map3);
                                if (hVarZ3 != null && hVarZ3.m == 1) {
                                    break;
                                } else {
                                    cVar2 = cVar2.f471j;
                                }
                            }
                            if (cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        cVar = null;
                                        break;
                                    }
                                    c cVar3 = (c) arrayDeque.pop();
                                    h hVarZ4 = g0.z(cVar3.f467f, cVar3.f468g, map3);
                                    if (hVarZ4 != null && hVarZ4.m == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int iC = cVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(cVar3.b(iC));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.c() == 1) {
                                        i12 = 0;
                                        if (cVar.b(0).f463b != null) {
                                            String str5 = cVar.b(0).f463b;
                                            String str6 = f0.f3975a;
                                            h hVarZ5 = g0.z(cVar.f467f, cVar.f468g, map3);
                                            int i28 = hVarZ5 != null ? hVarZ5.f509n : -1;
                                            if (i28 == -1 && (hVarZ = g0.z(cVar2.f467f, cVar2.f468g, map3)) != null) {
                                                i28 = hVarZ.f509n;
                                            }
                                            spannableStringBuilder.setSpan(new a7.h(str5, i28), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                    b7.a.u("Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (hVarZ2.f512q == 1) {
                                ew.a.h(spannableStringBuilder, new a7.f(), iIntValue, iIntValue2);
                            }
                            i13 = hVarZ2.f506j;
                            f5 = 100.0f;
                            if (i13 != 1) {
                                it = it2;
                                f11 = 100.0f;
                                ew.a.h(spannableStringBuilder, new AbsoluteSizeSpan((int) hVarZ2.f507k, true), iIntValue, iIntValue2);
                            } else if (i13 != 2) {
                                it = it2;
                                f11 = 100.0f;
                                ew.a.h(spannableStringBuilder, new RelativeSizeSpan(hVarZ2.f507k), iIntValue, iIntValue2);
                            } else if (i13 != 3) {
                                it = it2;
                                f11 = 100.0f;
                            } else {
                                float f13 = hVarZ2.f507k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i29 = i12;
                                sizeChange = f13;
                                i14 = i29;
                                while (i14 < length) {
                                    float f14 = f5;
                                    relativeSizeSpan = relativeSizeSpanArr[i14];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i15 = i14;
                                    } else {
                                        i15 = i14;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i14 = i15 + 1;
                                    f5 = f14;
                                    it2 = it3;
                                }
                                it = it2;
                                f11 = f5;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f462a)) {
                                f12 = hVarZ2.f514s;
                                if (f12 != Float.MAX_VALUE) {
                                    aVar.f403q = (f12 * (-90.0f)) / f11;
                                }
                                alignment = hVarZ2.f510o;
                                if (alignment != null) {
                                    aVar.f390c = alignment;
                                }
                                alignment2 = hVarZ2.f511p;
                                if (alignment2 != null) {
                                    aVar.f391d = alignment2;
                                }
                            }
                        } else if (i27 == 3 || i27 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        i12 = 0;
                        if (hVarZ2.f512q == 1) {
                            ew.a.h(spannableStringBuilder, new a7.f(), iIntValue, iIntValue2);
                        }
                        i13 = hVarZ2.f506j;
                        f5 = 100.0f;
                        if (i13 != 1) {
                            it = it2;
                            f11 = 100.0f;
                            ew.a.h(spannableStringBuilder, new AbsoluteSizeSpan((int) hVarZ2.f507k, true), iIntValue, iIntValue2);
                        } else if (i13 != 2) {
                            it = it2;
                            f11 = 100.0f;
                            ew.a.h(spannableStringBuilder, new RelativeSizeSpan(hVarZ2.f507k), iIntValue, iIntValue2);
                        } else if (i13 != 3) {
                            it = it2;
                            f11 = 100.0f;
                        } else {
                            float f15 = hVarZ2.f507k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i210 = i12;
                            sizeChange = f15;
                            i14 = i210;
                            while (i14 < length) {
                                float f16 = f5;
                                relativeSizeSpan = relativeSizeSpanArr[i14];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i15 = i14;
                                } else {
                                    i15 = i14;
                                }
                                i14 = i15 + 1;
                                f5 = f16;
                                it2 = it4;
                            }
                            it = it2;
                            f11 = f5;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f462a)) {
                            f12 = hVarZ2.f514s;
                            if (f12 != Float.MAX_VALUE) {
                                aVar.f403q = (f12 * (-90.0f)) / f11;
                            }
                            alignment = hVarZ2.f510o;
                            if (alignment != null) {
                                aVar.f390c = alignment;
                            }
                            alignment2 = hVarZ2.f511p;
                            if (alignment2 != null) {
                                aVar.f391d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i30 = 0;
            while (i30 < c()) {
                b(i30).h(j11, map3, map2, str3, treeMap);
                i30++;
                map3 = map;
            }
        }
    }

    public final void i(long j11, boolean z11, String str, TreeMap treeMap) {
        HashMap map = this.f472k;
        map.clear();
        HashMap map2 = this.f473l;
        map2.clear();
        String str2 = this.f462a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f469h;
        String str4 = BuildConfig.VERSION_NAME.equals(str3) ? str : str3;
        if (this.f464c && z11) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f463b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z11) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j11)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((a7.a) entry.getValue()).f388a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i11 = 0; i11 < c(); i11++) {
                b(i11).i(j11, z11 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((a7.a) entry2.getValue()).f388a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
