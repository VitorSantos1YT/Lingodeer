package x00;

import java.util.regex.Pattern;
import w00.k;
import z00.a0;
import z00.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements b10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f55626a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // b10.a
    public final qh.d a(k kVar) {
        b10.b bVar = kVar.f54423h;
        bVar.k();
        char cN = bVar.n();
        if (cN == '\n') {
            bVar.k();
            return new qh.d(10, new j(), bVar.o());
        }
        if (!f55626a.matcher(String.valueOf(cN)).matches()) {
            return new qh.d(10, new a0("\\"), bVar.o());
        }
        bVar.k();
        return new qh.d(10, new a0(String.valueOf(cN)), bVar.o());
    }
}
