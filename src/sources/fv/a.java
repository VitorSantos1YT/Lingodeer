package fv;

import fr.o0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f28185d;

    public a(long j11, String url, String relFileName) {
        m.f(url, "url");
        m.f(relFileName, "relFileName");
        this.f28182a = url;
        this.f28183b = relFileName;
        this.f28185d = j11;
        String strM = (j11 == 0 || j11 == 1) ? defpackage.e.m(xt.b.a().b(), relFileName) : j11 == 2 ? defpackage.e.m(xt.b.a().h(), relFileName) : j11 == 3 ? defpackage.e.m(xt.b.a().k(), relFileName) : j11 == 6 ? defpackage.e.m(xt.b.a().p(), relFileName) : j11 == 4 ? defpackage.e.m(xt.b.a().o(), relFileName) : j11 == 5 ? defpackage.e.m(xt.b.a().q(), relFileName) : j11 == 7 ? defpackage.e.m(xt.b.a().n(), relFileName) : j11 == 8 ? defpackage.e.m(xt.b.a().r(), relFileName) : j11 == -2 ? defpackage.e.m(((o0) xt.b.a().f56254a).v(), relFileName) : j11 == 9 ? defpackage.e.m(xt.b.a().f(), relFileName) : j11 == 11 ? defpackage.e.m(xt.b.a().m(), relFileName) : j11 == 12 ? defpackage.e.m(xt.b.a().l(), relFileName) : defpackage.e.m(xt.b.a().e(), relFileName);
        this.f28184c = strM;
    }

    public final String a() {
        return this.f28184c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(aVar.f28184c, this.f28184c) && m.a(aVar.f28182a, this.f28182a) && m.a(aVar.f28183b, this.f28183b);
    }

    public final int hashCode() {
        return this.f28184c.hashCode() + defpackage.e.d(this.f28182a.hashCode() * 31, 31, this.f28183b);
    }

    public a(String url, String fullPath, String relFileName) {
        m.f(url, "url");
        m.f(fullPath, "fullPath");
        m.f(relFileName, "relFileName");
        this.f28185d = -1L;
        this.f28182a = url;
        this.f28183b = relFileName;
        this.f28184c = fullPath;
    }
}
