package com.liulishuo.filedownloader.message;

import aw.p;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import defpackage.e;
import ew.f;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class MessageSnapshot$NoFieldException extends IllegalStateException {
    /* JADX WARN: Illegal instructions before constructor call */
    public MessageSnapshot$NoFieldException(String str, p pVar) {
        int i11 = pVar.f3237a;
        byte bK = pVar.k();
        String name = pVar.getClass().getName();
        int i12 = f.f25949a;
        Locale locale = Locale.ENGLISH;
        String str2 = gkbGsXmgaxRjJ.RGtCLwcDNUFaCV;
        StringBuilder sbQ = e.q(i11, "There isn't a field for '", str, "' in this message ", str2);
        sbQ.append((int) bK);
        sbQ.append(str2);
        sbQ.append(name);
        super(sbQ.toString());
    }
}
