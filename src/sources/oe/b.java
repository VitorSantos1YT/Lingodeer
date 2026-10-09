package oe;

import java.security.MessageDigest;
import pe.f;
import td.g;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44902b;

    public b(Object obj) {
        f.c(obj, "Argument must not be null");
        this.f44902b = obj;
    }

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f44902b.toString().getBytes(g.f52121a));
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f44902b.equals(((b) obj).f44902b);
        }
        return false;
    }

    @Override // td.g
    public final int hashCode() {
        return this.f44902b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f44902b + '}';
    }
}
