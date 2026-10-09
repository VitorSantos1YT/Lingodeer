package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzdr;
import com.google.android.gms.internal.play_billing.zzds;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzds<MessageType extends zzds<MessageType, BuilderType>, BuilderType extends zzdr<MessageType, BuilderType>> implements zzgl {
    protected int zza = 0;

    public final byte[] b() {
        try {
            zzfi zzfiVar = (zzfi) this;
            int iZzj = zzfiVar.zzj();
            byte[] bArr = new byte[iZzj];
            Logger logger = zzep.f12356b;
            zzem zzemVar = new zzem(bArr, iZzj);
            zzfiVar.c(zzemVar);
            if (zzemVar.v() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e8) {
            throw new RuntimeException(ep.a.g("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e8);
        }
    }

    public int d(zzgv zzgvVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final zzei zzf() {
        try {
            zzfi zzfiVar = (zzfi) this;
            int iZzj = zzfiVar.zzj();
            zzei zzeiVar = zzei.f12350b;
            byte[] bArr = new byte[iZzj];
            Logger logger = zzep.f12356b;
            zzem zzemVar = new zzem(bArr, iZzj);
            zzfiVar.c(zzemVar);
            if (zzemVar.v() == 0) {
                return new zzeg(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e8) {
            throw new RuntimeException(ep.a.g("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e8);
        }
    }
}
