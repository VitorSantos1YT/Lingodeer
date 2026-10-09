package q00;

import a10.c;
import a10.d;
import ay.k0;
import fr.p3;
import java.util.EnumSet;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements d {
    @Override // a10.d
    public final void a(c cVar) {
        r00.a aVar = new r00.a();
        EnumSet.allOf(l20.c.class);
        l20.c cVar2 = l20.c.URL;
        l20.c cVar3 = l20.c.EMAIL;
        EnumSet enumSetOf = EnumSet.of(cVar2, cVar3);
        if (enumSetOf == null) {
            throw new NullPointerException("linkTypes must not be null");
        }
        HashSet hashSet = new HashSet(enumSetOf);
        aVar.f48734a = new xq.c(hashSet.contains(cVar2) ? new k0(21) : null, hashSet.contains(l20.c.WWW) ? new p3(21) : null, hashSet.contains(cVar3) ? new tw.c(20) : null, 20);
        cVar.f286f.add(aVar);
    }
}
