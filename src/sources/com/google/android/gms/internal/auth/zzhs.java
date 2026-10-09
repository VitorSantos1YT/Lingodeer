package com.google.android.gms.internal.auth;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhs extends zzev implements zzfy {
    private static final zzhs zzb;
    private zzez zzd = zzgg.f9535d;

    static {
        zzhs zzhsVar = new zzhs();
        zzb = zzhsVar;
        zzev.d(zzhsVar);
    }

    private zzhs() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (r7 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.auth.zzhs i(byte[] r7) throws com.google.android.gms.internal.auth.zzfb {
        /*
            com.google.android.gms.internal.auth.zzhs r0 = com.google.android.gms.internal.auth.zzhs.zzb
            int r5 = r7.length
            com.google.android.gms.internal.auth.zzel r1 = com.google.android.gms.internal.auth.zzel.f9487b
            r2 = 4
            java.lang.Object r0 = r0.g(r2)
            r2 = r0
            com.google.android.gms.internal.auth.zzev r2 = (com.google.android.gms.internal.auth.zzev) r2
            com.google.android.gms.internal.auth.zzgf r0 = com.google.android.gms.internal.auth.zzgf.f9532c     // Catch: java.lang.IndexOutOfBoundsException -> L5e java.io.IOException -> L63 com.google.android.gms.internal.auth.zzgy -> L7e com.google.android.gms.internal.auth.zzfb -> L8a
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L5e java.io.IOException -> L63 com.google.android.gms.internal.auth.zzgy -> L7e com.google.android.gms.internal.auth.zzfb -> L8a
            com.google.android.gms.internal.auth.zzgi r3 = r0.a(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L5e java.io.IOException -> L63 com.google.android.gms.internal.auth.zzgy -> L7e com.google.android.gms.internal.auth.zzfb -> L8a
            com.google.android.gms.internal.auth.zzdt r6 = new com.google.android.gms.internal.auth.zzdt     // Catch: java.lang.IndexOutOfBoundsException -> L5e java.io.IOException -> L63 com.google.android.gms.internal.auth.zzgy -> L7e com.google.android.gms.internal.auth.zzfb -> L8a
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L5e java.io.IOException -> L63 com.google.android.gms.internal.auth.zzgy -> L7e com.google.android.gms.internal.auth.zzfb -> L8a
            r1.getClass()     // Catch: java.lang.IndexOutOfBoundsException -> L5e java.io.IOException -> L63 com.google.android.gms.internal.auth.zzgy -> L7e com.google.android.gms.internal.auth.zzfb -> L8a
            r4 = 0
            r1 = r3
            r3 = r7
            r1.d(r2, r3, r4, r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L5e java.io.IOException -> L63 com.google.android.gms.internal.auth.zzgy -> L7e com.google.android.gms.internal.auth.zzfb -> L8a
            r1.a(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L5e java.io.IOException -> L63 com.google.android.gms.internal.auth.zzgy -> L7e com.google.android.gms.internal.auth.zzfb -> L8a
            r7 = 1
            java.lang.Object r1 = r2.g(r7)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r7) goto L36
            goto L4a
        L36:
            if (r1 == 0) goto L4d
            java.lang.Class r7 = r2.getClass()
            com.google.android.gms.internal.auth.zzgi r7 = r0.a(r7)
            boolean r7 = r7.f(r2)
            r0 = 2
            r2.g(r0)
            if (r7 == 0) goto L4d
        L4a:
            com.google.android.gms.internal.auth.zzhs r2 = (com.google.android.gms.internal.auth.zzhs) r2
            return r2
        L4d:
            com.google.android.gms.internal.auth.zzgy r7 = new com.google.android.gms.internal.auth.zzgy
            java.lang.String r0 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r7.<init>(r0)
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r7 = r7.getMessage()
            r0.<init>(r7)
            throw r0
        L5e:
            com.google.android.gms.internal.auth.zzfb r7 = com.google.android.gms.internal.auth.zzfb.c()
            throw r7
        L63:
            r0 = move-exception
            r7 = r0
            java.lang.Throwable r0 = r7.getCause()
            boolean r0 = r0 instanceof com.google.android.gms.internal.auth.zzfb
            if (r0 == 0) goto L74
            java.lang.Throwable r7 = r7.getCause()
            com.google.android.gms.internal.auth.zzfb r7 = (com.google.android.gms.internal.auth.zzfb) r7
            throw r7
        L74:
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r1 = r7.getMessage()
            r0.<init>(r1, r7)
            throw r0
        L7e:
            r0 = move-exception
            r7 = r0
            com.google.android.gms.internal.auth.zzfb r0 = new com.google.android.gms.internal.auth.zzfb
            java.lang.String r7 = r7.getMessage()
            r0.<init>(r7)
            throw r0
        L8a:
            r0 = move-exception
            r7 = r0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhs.i(byte[]):com.google.android.gms.internal.auth.zzhs");
    }

    @Override // com.google.android.gms.internal.auth.zzev
    public final Object g(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgh(zzb, new Object[]{scqhIrGXy.zzzSPnPlksO});
        }
        if (i12 == 3) {
            return new zzhs();
        }
        if (i12 == 4) {
            return new zzhr(zzb);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
