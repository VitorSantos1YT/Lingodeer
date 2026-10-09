package td;

import android.text.TextUtils;
import re.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f52122e = new e0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f52123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f52124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f52126d;

    public i(String str, Object obj, h hVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f52125c = str;
        this.f52123a = obj;
        this.f52124b = hVar;
    }

    public static i a(Object obj, String str) {
        return new i(str, obj, f52122e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f52125c.equals(((i) obj).f52125c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52125c.hashCode();
    }

    public final String toString() {
        return ep.a.k(new StringBuilder("Option{key='"), this.f52125c, "'}");
    }
}
