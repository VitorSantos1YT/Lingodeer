package okhttp3.internal.http2;

import fr.p3;
import kotlin.jvm.internal.m;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Header {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f45389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f45390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f45391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f45392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f45393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f45394i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f45395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f45396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45397c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        l lVar = l.f40723d;
        f45389d = p3.l(":");
        f45390e = p3.l(":status");
        f45391f = p3.l(":method");
        f45392g = p3.l(":path");
        f45393h = p3.l(":scheme");
        f45394i = p3.l(":authority");
    }

    public Header(l name, l value) {
        m.f(name, "name");
        m.f(value, "value");
        this.f45395a = name;
        this.f45396b = value;
        this.f45397c = value.e() + name.e() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return m.a(this.f45395a, header.f45395a) && m.a(this.f45396b, header.f45396b);
    }

    public final int hashCode() {
        return this.f45396b.hashCode() + (this.f45395a.hashCode() * 31);
    }

    public final String toString() {
        return this.f45395a.v() + ": " + this.f45396b.v();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(p3.l(str), p3.l(str2));
        l lVar = l.f40723d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(l name, String value) {
        this(name, p3.l(value));
        m.f(name, "name");
        m.f(value, "value");
        l lVar = l.f40723d;
    }
}
