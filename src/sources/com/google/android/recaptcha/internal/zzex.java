package com.google.android.recaptcha.internal;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzex {
    private final zzfm zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzex() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final zzew zza(String str) throws zzbd {
        try {
            HttpURLConnection httpURLConnectionZza = this.zza.zza(str);
            httpURLConnectionZza.setRequestMethod("POST");
            httpURLConnectionZza.setDoOutput(true);
            httpURLConnectionZza.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-protobuffer");
            return new zzew(httpURLConnectionZza);
        } catch (zzbd e8) {
            throw e8;
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e10.getMessage());
        }
    }

    public /* synthetic */ zzex(zzfm zzfmVar, int i11, f fVar) {
        this.zza = new zzfm();
    }
}
