package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.preference.PreferenceManager;
import ep.a;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f10752b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzcj f10753a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zza {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f10754a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10755b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f10756c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f10757d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public zzne f10758e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public zzby f10759f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public zzwn f10760g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public zzcj f10761h;

        public static zzcj a(byte[] bArr) throws IOException {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            if (zzcw.f10287a == null) {
                throw new NullPointerException("SecretKeyAccess cannot be null");
            }
            try {
                zzwt zzwtVarX = zzwt.x(byteArrayInputStream, zzakj.f10117b);
                byteArrayInputStream.close();
                zzwt zzwtVarO = zzbx.e(zzwtVarX).o();
                zzaku.zzb zzbVar = (zzaku.zzb) zzwtVarO.l(5);
                if (!zzbVar.f10130a.equals(zzwtVarO)) {
                    if (!zzbVar.f10131b.u()) {
                        zzbVar.j();
                    }
                    zzaku.zzb.f(zzbVar.f10131b, zzwtVarO);
                }
                return new zzcj((zzwt.zzb) zzbVar);
            } catch (Throwable th2) {
                byteArrayInputStream.close();
                throw th2;
            }
        }

        public static byte[] d(Context context, String str, String str2) throws CharConversionException {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return zzzj.b(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(a.g("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }

        public final synchronized zzmy b() {
            zzcj zzcjVarA;
            zzmy zzmyVar;
            zzne zzneVarA;
            try {
                if (this.f10755b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                zzwn zzwnVar = this.f10760g;
                if (zzwnVar != null && this.f10759f == null) {
                    this.f10759f = new zzby(zzcy.a(zzwnVar.g()));
                }
                synchronized (zzmy.f10752b) {
                    try {
                        byte[] bArrD = d(this.f10754a, this.f10755b, this.f10756c);
                        if (bArrD == null) {
                            if (this.f10757d != null) {
                                new zznd();
                                try {
                                    boolean zB = zznd.b(this.f10757d);
                                    try {
                                        zzneVarA = zznd.a(this.f10757d);
                                    } catch (GeneralSecurityException | ProviderException e8) {
                                        if (!zB) {
                                            throw new KeyStoreException(a.g("the master key ", this.f10757d, " exists but is unusable"), e8);
                                        }
                                        zzneVarA = null;
                                    }
                                } catch (GeneralSecurityException | ProviderException unused) {
                                }
                                this.f10758e = zzneVarA;
                            }
                            zzby zzbyVar = this.f10759f;
                            if (zzbyVar == null) {
                                throw new GeneralSecurityException("cannot read or generate keyset");
                            }
                            zzbx zzbxVarD = zzbx.d(zzbyVar);
                            zznf zznfVar = new zznf(this.f10754a, this.f10755b, this.f10756c);
                            zzne zzneVar = this.f10758e;
                            try {
                                if (zzneVar != null) {
                                    zzbxVarD.i(zznfVar, zzneVar, new byte[0]);
                                } else {
                                    if (zzcw.f10287a == null) {
                                        throw new NullPointerException("SecretKeyAccess cannot be null");
                                    }
                                    zznfVar.a(zzbxVarD.o());
                                }
                                zzwt zzwtVarO = zzbxVarD.o();
                                zzaku.zzb zzbVar = (zzaku.zzb) zzwtVarO.l(5);
                                if (!zzbVar.f10130a.equals(zzwtVarO)) {
                                    if (!zzbVar.f10131b.u()) {
                                        zzbVar.j();
                                    }
                                    zzaku.zzb.f(zzbVar.f10131b, zzwtVarO);
                                }
                                this.f10761h = new zzcj((zzwt.zzb) zzbVar);
                            } catch (IOException e10) {
                                throw new GeneralSecurityException(e10);
                            }
                        } else if (this.f10757d != null) {
                            try {
                                new zznd();
                                this.f10758e = zznd.a(this.f10757d);
                                try {
                                    zzwt zzwtVarO2 = zzbx.c(new zzbo(new ByteArrayInputStream(bArrD)), this.f10758e, new byte[0]).o();
                                    zzaku.zzb zzbVar2 = (zzaku.zzb) zzwtVarO2.l(5);
                                    if (!zzbVar2.f10130a.equals(zzwtVarO2)) {
                                        if (!zzbVar2.f10131b.u()) {
                                            zzbVar2.j();
                                        }
                                        zzaku.zzb.f(zzbVar2.f10131b, zzwtVarO2);
                                    }
                                    zzcjVarA = new zzcj((zzwt.zzb) zzbVar2);
                                } catch (IOException | GeneralSecurityException e11) {
                                    try {
                                        zzcjVarA = a(bArrD);
                                    } catch (IOException unused2) {
                                        throw e11;
                                    }
                                }
                            } catch (GeneralSecurityException | ProviderException e12) {
                                try {
                                    zzcjVarA = a(bArrD);
                                } catch (IOException unused3) {
                                    throw e12;
                                }
                            }
                            this.f10761h = zzcjVarA;
                        } else {
                            this.f10761h = a(bArrD);
                        }
                        zzmyVar = new zzmy();
                        new zznf(this.f10754a, this.f10755b, this.f10756c);
                        zzmyVar.f10753a = this.f10761h;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return zzmyVar;
        }

        public final void c(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            this.f10757d = str;
        }
    }

    public final synchronized zzbx a() {
        zzbx zzbxVarE;
        zzcj zzcjVar = this.f10753a;
        synchronized (zzcjVar) {
            zzbxVarE = zzbx.e((zzwt) zzcjVar.f10285a.g());
        }
        return zzbxVarE;
    }
}
