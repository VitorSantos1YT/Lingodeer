package td;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pe.c f52127b = new pe.c(0);

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        int i11 = 0;
        while (true) {
            pe.c cVar = this.f52127b;
            if (i11 >= cVar.f56767c) {
                return;
            }
            i iVar = (i) cVar.f(i11);
            Object objJ = this.f52127b.j(i11);
            h hVar = iVar.f52124b;
            if (iVar.f52126d == null) {
                iVar.f52126d = iVar.f52125c.getBytes(g.f52121a);
            }
            hVar.f(iVar.f52126d, objJ, messageDigest);
            i11++;
        }
    }

    public final Object c(i iVar) {
        pe.c cVar = this.f52127b;
        return cVar.containsKey(iVar) ? cVar.get(iVar) : iVar.f52123a;
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f52127b.equals(((j) obj).f52127b);
        }
        return false;
    }

    @Override // td.g
    public final int hashCode() {
        return this.f52127b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f52127b + '}';
    }
}
