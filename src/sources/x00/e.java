package x00;

import nv.p;
import w00.k;
import z00.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements b10.a {
    @Override // b10.a
    public final qh.d a(k kVar) {
        b10.b bVar = kVar.f54423h;
        a9.e eVarO = bVar.o();
        int i11 = bVar.i('`');
        a9.e eVarO2 = bVar.o();
        while (bVar.c('`') > 0) {
            a9.e eVarO3 = bVar.o();
            if (bVar.i('`') == i11) {
                z00.d dVar = new z00.d();
                String strReplace = bVar.e(eVarO2, eVarO3).e().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i12 = 0;
                    if (strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                        int length = strReplace.length();
                        while (true) {
                            if (i12 >= length) {
                                i12 = length;
                                break;
                            }
                            if (strReplace.charAt(i12) != ' ') {
                                break;
                            }
                            i12++;
                        }
                        if (i12 != length) {
                            strReplace = p.i(1, 1, strReplace);
                        }
                    }
                }
                dVar.f58422g = strReplace;
                return new qh.d(10, dVar, bVar.o());
            }
        }
        return new qh.d(10, new a0(bVar.e(eVarO, eVarO2).e()), eVarO2);
    }
}
