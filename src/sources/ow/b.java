package ow;

import fr.p3;
import m00.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f46091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f46092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f46093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f46094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f46095h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f46096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f46097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46098c;

    static {
        l lVar = l.f40723d;
        f46091d = p3.l(":status");
        f46092e = p3.l(":method");
        f46093f = p3.l(":path");
        f46094g = p3.l(":scheme");
        f46095h = p3.l(":authority");
        p3.l(":host");
        p3.l(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        this(p3.l(str), p3.l(str2));
        l lVar = l.f40723d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46096a.equals(bVar.f46096a) && this.f46097b.equals(bVar.f46097b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46097b.hashCode() + ((this.f46096a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return ep.a.D(this.f46096a.v(), ": ", this.f46097b.v());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        this(lVar, p3.l(str));
        l lVar2 = l.f40723d;
    }

    public b(l lVar, l lVar2) {
        this.f46096a = lVar;
        this.f46097b = lVar2;
        this.f46098c = lVar2.e() + lVar.e() + 32;
    }
}
