package okhttp3;

import com.bumptech.glide.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.jvm.internal.m;
import nv.p;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import oz.q;
import qy.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Headers implements Iterable<l>, gz.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f45040b = new Companion(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Headers f45041c = new Headers(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f45042a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f45043a = new ArrayList(20);

        public final void a(String name, String value) {
            m.f(name, "name");
            m.f(value, "value");
            _HeadersCommonKt.b(name);
            _HeadersCommonKt.c(value, name);
            _HeadersCommonKt.a(this, name, value);
        }

        public final void b(String name, String value) {
            m.f(name, "name");
            m.f(value, "value");
            _HeadersCommonKt.a(this, name, value);
        }

        public final void c(String name, String value) {
            m.f(name, "name");
            m.f(value, "value");
            _HeadersCommonKt.b(name);
            b(name, value);
        }

        public final Headers d() {
            return new Headers((String[]) this.f45043a.toArray(new String[0]));
        }

        public final void e(String name) {
            m.f(name, "name");
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f45043a;
                if (i11 >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i11))) {
                    arrayList.remove(i11);
                    arrayList.remove(i11);
                    i11 -= 2;
                }
                i11 += 2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        public static Headers a(String... strArr) {
            String[] inputNamesAndValues = (String[]) Arrays.copyOf(strArr, strArr.length);
            m.f(inputNamesAndValues, "inputNamesAndValues");
            if (inputNamesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
            int length = strArr2.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (strArr2[i12] == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i12] = q.i1(inputNamesAndValues[i12]).toString();
            }
            int iV = e.v(0, strArr2.length - 1, 2);
            if (iV >= 0) {
                while (true) {
                    String str = strArr2[i11];
                    String str2 = strArr2[i11 + 1];
                    _HeadersCommonKt.b(str);
                    _HeadersCommonKt.c(str2, str);
                    if (i11 == iV) {
                        break;
                    }
                    i11 += 2;
                }
            }
            return new Headers(strArr2);
        }

        private Companion() {
        }
    }

    public Headers(String[] namesAndValues) {
        m.f(namesAndValues, "namesAndValues");
        this.f45042a = namesAndValues;
    }

    public final String b(String str) {
        String[] namesAndValues = this.f45042a;
        m.f(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int iV = e.v(length, 0, -2);
        if (iV > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(namesAndValues[length])) {
            if (length == iV) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final String d(int i11) {
        String str = (String) ry.l.Y(i11 * 2, this.f45042a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(p.o("name[", i11, ']'));
    }

    public final Builder e() {
        Builder builder = new Builder();
        ry.m.e0(builder.f45043a, this.f45042a);
        return builder;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.f45042a, ((Headers) obj).f45042a);
        }
        return false;
    }

    public final TreeMap f() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        m.e(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            String strD = d(i11);
            Locale US = Locale.US;
            m.e(US, "US");
            String lowerCase = strD.toLowerCase(US);
            m.e(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(g(i11));
        }
        return treeMap;
    }

    public final String g(int i11) {
        String str = (String) ry.l.Y((i11 * 2) + 1, this.f45042a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(p.o("value[", i11, ']'));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45042a);
    }

    @Override // java.lang.Iterable
    public final Iterator<l> iterator() {
        int size = size();
        l[] lVarArr = new l[size];
        for (int i11 = 0; i11 < size; i11++) {
            lVarArr[i11] = new l(d(i11), g(i11));
        }
        return kotlin.jvm.internal.l.a(lVarArr);
    }

    public final int size() {
        return this.f45042a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            String strD = d(i11);
            String strG = g(i11);
            sb2.append(strD);
            sb2.append(": ");
            if (_UtilCommonKt.j(strD)) {
                strG = "██";
            }
            sb2.append(strG);
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
