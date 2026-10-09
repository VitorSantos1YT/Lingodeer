package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaiw;
import com.google.android.gms.internal.p002firebaseauthapi.zzaix;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import ep.a;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaix<MessageType extends zzaix<MessageType, BuilderType>, BuilderType extends zzaiw<MessageType, BuilderType>> implements zzaly {
    protected transient int zza = 0;

    public int b(zzamr zzamrVar) {
        int iE = e();
        if (iE != -1) {
            return iE;
        }
        int iH = zzamrVar.h(this);
        d(iH);
        return iH;
    }

    public void d(int i11) {
        throw new UnsupportedOperationException();
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    public final zzaje f() {
        try {
            int iB = ((zzaku) this).b(null);
            zzaje zzajeVar = zzaje.f10066b;
            zzajn zzajnVar = new zzajn(iB);
            zzakb zzakbVar = zzajnVar.f10075a;
            ((zzaku) this).a(zzakbVar);
            if (zzakbVar.b() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (zzakbVar.b() >= 0) {
                return new zzajp(zzajnVar.f10076b);
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e8) {
            throw new RuntimeException(a.g("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e8);
        }
    }

    public final byte[] g() {
        try {
            int iB = ((zzaku) this).b(null);
            byte[] bArr = new byte[iB];
            boolean z11 = zzakb.f10105b;
            zzaka zzakaVar = new zzaka(bArr, iB);
            ((zzaku) this).a(zzakaVar);
            if (zzakaVar.b() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (zzakaVar.b() >= 0) {
                return bArr;
            }
            throw new IllegalStateException(gkbGsXmgaxRjJ.GQPGPGskv);
        } catch (IOException e8) {
            throw new RuntimeException(a.g("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e8);
        }
    }
}
