package pw;

import com.adjust.sdk.Constants;
import ij.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47197c;

    public a(d dVar) {
        String str = (String) dVar.f34422c;
        this.f47195a = (String) dVar.f34423d;
        int i11 = dVar.f34421b;
        this.f47196b = i11 == -1 ? str.equals("http") ? 80 : str.equals(Constants.SCHEME) ? 443 : -1 : i11;
        this.f47197c = dVar.toString();
    }

    public static int a(char c11) {
        if (c11 >= '0' && c11 <= '9') {
            return c11 - '0';
        }
        if (c11 >= 'a' && c11 <= 'f') {
            return c11 - 'W';
        }
        if (c11 < 'A' || c11 > 'F') {
            return -1;
        }
        return c11 - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f47197c.equals(this.f47197c);
    }

    public final int hashCode() {
        return this.f47197c.hashCode();
    }

    public final String toString() {
        return this.f47197c;
    }
}
