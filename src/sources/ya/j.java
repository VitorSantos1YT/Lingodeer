package ya;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.math.BigInteger;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f57558f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f57563e = com.bumptech.glide.d.v(new xa.a(this, 9));

    static {
        new j(BuildConfig.VERSION_NAME, 0, 0, 0);
        f57558f = new j(BuildConfig.VERSION_NAME, 0, 1, 0);
        new j(BuildConfig.VERSION_NAME, 1, 0, 0);
    }

    public j(String str, int i11, int i12, int i13) {
        this.f57559a = i11;
        this.f57560b = i12;
        this.f57561c = i13;
        this.f57562d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        j other = (j) obj;
        m.f(other, "other");
        Object value = this.f57563e.getValue();
        m.e(value, "getValue(...)");
        Object value2 = other.f57563e.getValue();
        m.e(value2, "getValue(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f57559a == jVar.f57559a && this.f57560b == jVar.f57560b && this.f57561c == jVar.f57561c;
    }

    public final int hashCode() {
        return ((((527 + this.f57559a) * 31) + this.f57560b) * 31) + this.f57561c;
    }

    public final String toString() {
        String str = this.f57562d;
        String strE = !oz.q.K0(str) ? ep.a.e("-", str) : BuildConfig.VERSION_NAME;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f57559a);
        sb2.append('.');
        sb2.append(this.f57560b);
        sb2.append('.');
        return p0.i(this.f57561c, strE, sb2);
    }
}
