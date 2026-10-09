package d7;

import android.net.Uri;
import hh.p0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y6.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f23223i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f23224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f23227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f23230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23231h;

    static {
        y.a("media3.datasource");
    }

    public h(Uri uri, int i11, byte[] bArr, Map map, long j11, long j12, String str, int i12) {
        b7.a.d(j11 >= 0);
        b7.a.d(j11 >= 0);
        b7.a.d(j12 > 0 || j12 == -1);
        uri.getClass();
        this.f23224a = uri;
        this.f23225b = i11;
        this.f23226c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f23227d = Collections.unmodifiableMap(new HashMap(map));
        this.f23228e = j11;
        this.f23229f = j12;
        this.f23230g = str;
        this.f23231h = i12;
    }

    public final h a(long j11) {
        long j12 = this.f23229f;
        long j13 = j12 != -1 ? j12 - j11 : -1L;
        if (j11 == 0 && j12 == j13) {
            return this;
        }
        return new h(this.f23224a, this.f23225b, this.f23226c, this.f23227d, this.f23228e + j11, j13, this.f23230g, this.f23231h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i11 = this.f23225b;
        if (i11 == 1) {
            str = "GET";
        } else if (i11 == 2) {
            str = "POST";
        } else {
            if (i11 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f23224a);
        sb2.append(", ");
        sb2.append(this.f23228e);
        sb2.append(", ");
        sb2.append(this.f23229f);
        sb2.append(", ");
        sb2.append(this.f23230g);
        sb2.append(", ");
        return p0.i(this.f23231h, "]", sb2);
    }
}
