package aw;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import hh.p0;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f3219c;

    @Override // aw.p
    public final byte k() {
        return (byte) 4;
    }

    public a(p pVar) {
        super(pVar.f3237a);
        if (pVar.k() == -3) {
            this.f3219c = pVar;
            return;
        }
        int i11 = pVar.f3237a;
        byte bK = pVar.k();
        int i12 = ew.f.f25949a;
        Locale locale = Locale.ENGLISH;
        throw new IllegalArgumentException(p0.l("can't create the block complete message for id[", i11, gkbGsXmgaxRjJ.mjmRiKu, bK, "]"));
    }
}
