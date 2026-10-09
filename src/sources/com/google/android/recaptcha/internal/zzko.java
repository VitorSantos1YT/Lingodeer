package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkn;
import com.google.android.recaptcha.internal.zzko;
import ep.a;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzko<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>> implements zzoi {
    protected int zza = 0;

    public static void zzc(Iterable iterable, List list) {
        zzkn.zzd(iterable, list);
    }

    public int zza(zzow zzowVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final zzle zzb() {
        try {
            int iZzo = zzo();
            zzle zzleVar = zzle.zzb;
            byte[] bArr = new byte[iZzo];
            zzlk zzlkVar = new zzlk(bArr, 0, iZzo);
            zze(zzlkVar);
            zzlkVar.zzC();
            return new zzlc(bArr);
        } catch (IOException e8) {
            throw new RuntimeException(a.g("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e8);
        }
    }

    public final byte[] zzd() {
        try {
            int iZzo = zzo();
            byte[] bArr = new byte[iZzo];
            zzlk zzlkVar = new zzlk(bArr, 0, iZzo);
            zze(zzlkVar);
            zzlkVar.zzC();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException(a.g("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e8);
        }
    }
}
