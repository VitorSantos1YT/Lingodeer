package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.m;
import md.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzew {
    private final HttpURLConnection zza;

    public zzew(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() throws zzbd {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e8.getMessage());
        } catch (IOException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e11.getMessage());
        }
    }

    private final OutputStream zzg() throws zzbd {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e8.getMessage());
        } catch (IOException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e11.getMessage());
        }
    }

    public final zzoi zza(zzoi zzoiVar) throws IOException, zzbd {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            byte[] bArrT = a.t(zzf());
            if (bArrT.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object objZzb = zzoiVar.zzD().zzb(bArrT);
                m.d(objZzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoi) objZzb;
            } catch (Exception e8) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e8.getMessage());
            }
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e10.getMessage());
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() throws zzbd {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e8.getMessage());
        } catch (IOException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e11.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) throws zzbd {
        try {
            zzg().write(bArr);
        } catch (zzbd e8) {
            throw e8;
        } catch (IOException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e10.getMessage());
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e11.getMessage());
        }
    }
}
