package v4;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f53511b = new e(new f(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f53512a;

    public e(f fVar) {
        this.f53512a = fVar;
    }

    public static e a(String str) {
        if (str == null || str.isEmpty()) {
            return f53511b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = strArrSplit[i11];
            int i12 = d.f53510a;
            localeArr[i11] = Locale.forLanguageTag(str2);
        }
        return new e(new f(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f53512a.equals(((e) obj).f53512a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53512a.f53513a.hashCode();
    }

    public final String toString() {
        return this.f53512a.f53513a.toString();
    }
}
