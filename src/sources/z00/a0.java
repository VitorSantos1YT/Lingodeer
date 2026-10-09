package z00;

import com.android.billingclient.api.c0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f58420g;

    public a0(String str) {
        this.f58420g = str;
    }

    @Override // z00.t
    public final void a(c0 c0Var) {
        if (c0Var.f7470b == 0) {
            r00.a aVar = (r00.a) c0Var.f7471c;
            String str = this.f58420g;
            List listD = d();
            y yVar = listD.size() == 1 ? (y) listD.get(0) : null;
            xq.c cVar = aVar.f48734a;
            cVar.getClass();
            if (str == null) {
                throw new NullPointerException("input must not be null");
            }
            l20.b bVar = new l20.b(str, new l20.a(cVar, str));
            t tVar = this;
            while (bVar.hasNext()) {
                l20.d dVar = (l20.d) bVar.next();
                if (tVar == this && !bVar.hasNext() && !(dVar instanceof m20.a)) {
                    return;
                }
                int beginIndex = dVar.getBeginIndex();
                int endIndex = dVar.getEndIndex();
                a0 a0Var = new a0(str.substring(beginIndex, endIndex));
                if (yVar != null) {
                    a0Var.b(yVar.a(beginIndex, endIndex));
                }
                if (dVar instanceof m20.a) {
                    String strE = a0Var.f58420g;
                    if (((m20.a) dVar).f40828a == l20.c.EMAIL) {
                        strE = ep.a.e("mailto:", strE);
                    }
                    p pVar = new p(strE, null);
                    pVar.c(a0Var);
                    pVar.g(a0Var.d());
                    tVar.e(pVar);
                    tVar = pVar;
                } else {
                    tVar.e(a0Var);
                    tVar = a0Var;
                }
            }
            i();
        }
    }

    @Override // z00.t
    public final String h() {
        return ep.a.e("literal=", this.f58420g);
    }
}
