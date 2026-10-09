package x00;

import java.util.regex.Pattern;
import w00.k;
import z00.a0;
import z00.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements b10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f55624a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f55625b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // b10.a
    public final qh.d a(k kVar) {
        String strE;
        b10.b bVar = kVar.f54423h;
        bVar.k();
        a9.e eVarO = bVar.o();
        if (bVar.c('>') > 0) {
            a10.f fVarE = bVar.e(eVarO, bVar.o());
            String strE2 = fVarE.e();
            bVar.k();
            if (f55624a.matcher(strE2).matches()) {
                strE = strE2;
            } else {
                strE = f55625b.matcher(strE2).matches() ? ep.a.e("mailto:", strE2) : null;
            }
            if (strE != null) {
                p pVar = new p(strE, null);
                a0 a0Var = new a0(strE2);
                a0Var.g(fVarE.g());
                pVar.c(a0Var);
                return new qh.d(10, pVar, bVar.o());
            }
        }
        return null;
    }
}
