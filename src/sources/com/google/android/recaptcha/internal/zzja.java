package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.TimeoutCancellationException;
import qy.b0;
import qy.h;
import ry.m;
import rz.e0;
import rz.s;
import rz.t;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzja extends zze {
    public s zza;
    public zzfo zzb;
    private final zzek zzc;
    private zzsc zzf;
    private final zzek zzj;
    private final h zzk;
    private final h zzl;
    private final h zzm;
    private final h zzn;
    private final h zzo;
    private zzen zzp;
    private final zzbi zzq;
    private final Map zzd = zzjb.zza();
    private final Map zze = new LinkedHashMap();
    private final zzcb zzg = new zzcb(zzje.zza);
    private final zzjh zzh = zzjh.zzc();
    private final zzij zzi = new zzij(this);

    public zzja(zzek zzekVar, zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zzekVarZza = zzekVar.zza();
        zzekVarZza.zzc(zzekVar.zzd());
        this.zzj = zzekVarZza;
        int i11 = zzav.zza;
        this.zzk = d.v(zzis.zza);
        this.zzl = d.v(zzit.zza);
        this.zzm = d.v(zziu.zza);
        this.zzn = d.v(zziv.zza);
        this.zzo = d.v(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzE(zzsc zzscVar, vy.d dVar) {
        zzim zzimVar;
        zzbd e8;
        zzja zzjaVar;
        if (dVar instanceof zzim) {
            zzimVar = (zzim) dVar;
            int i11 = zzimVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzimVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzimVar = new zzim(this, dVar);
            }
        } else {
            zzimVar = new zzim(this, dVar);
        }
        Object objZzd = zzimVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzimVar.zzc;
        if (i12 == 0) {
            e.F(objZzd);
            try {
                zzff zzffVar = (zzff) this.zzn.getValue();
                zzek zzekVar = this.zzj;
                zzimVar.zzd = this;
                zzimVar.zzc = 1;
                objZzd = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                if (objZzd == aVar) {
                    return aVar;
                }
                zzjaVar = this;
            } catch (zzbd e10) {
                e8 = e10;
                zzjaVar = this;
                ((t) zzjaVar.zzA()).X(e8);
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zzjaVar = zzimVar.zzd;
            try {
                e.F(objZzd);
            } catch (zzbd e11) {
                e8 = e11;
                ((t) zzjaVar.zzA()).X(e8);
            }
        }
        e0.B(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) objZzd, null), 3);
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzF(String str, vy.d dVar) {
        zzio zzioVar;
        Exception exc;
        zzja zzjaVar;
        String str2;
        String str3;
        zzja zzjaVar2;
        zzbd zzbdVar;
        zzen zzenVar;
        if (dVar instanceof zzio) {
            zzioVar = (zzio) dVar;
            int i11 = zzioVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzioVar = new zzio(this, dVar);
            }
        } else {
            zzioVar = new zzio(this, dVar);
        }
        Object obj = zzioVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzioVar.zzc;
        if (i12 == 0) {
            e.F(obj);
            this.zzp = this.zzj.zzf(26);
            try {
                String strZza = ((zzbr) this.zzl.getValue()).zza();
                zzioVar.zzd = this;
                zzioVar.zze = str;
                zzioVar.zzf = strZza;
                zzioVar.zzc = 1;
                Object objZzw = zzw(zzioVar);
                if (objZzw == aVar) {
                    return aVar;
                }
                str2 = str;
                str3 = strZza;
                obj = objZzw;
                zzjaVar2 = this;
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
            } catch (Exception e8) {
                exc = e8;
                zzjaVar = this;
                zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzjaVar.zzp = null;
                ((t) zzjaVar.zzA()).X(zzbdVar);
                return b0.f48488a;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = zzioVar.zzf;
            String str5 = zzioVar.zze;
            zzjaVar = zzioVar.zzd;
            try {
                e.F(obj);
                str3 = str4;
                str2 = str5;
                zzjaVar2 = zzjaVar;
                try {
                    ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
                } catch (Exception e10) {
                    zzjaVar = zzjaVar2;
                    exc = e10;
                    zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                    zzenVar = zzjaVar.zzp;
                    if (zzenVar != null) {
                        zzenVar.zzb(zzbdVar);
                    }
                    zzjaVar.zzp = null;
                    ((t) zzjaVar.zzA()).X(zzbdVar);
                }
            } catch (Exception e11) {
                exc = e11;
                zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                zzenVar = zzjaVar.zzp;
                if (zzenVar != null) {
                    zzenVar.zzb(zzbdVar);
                }
                zzjaVar.zzp = null;
                ((t) zzjaVar.zzA()).X(zzbdVar);
                return b0.f48488a;
            }
        }
        return b0.f48488a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzG(String str, vy.d dVar) {
        zzix zzixVar;
        zzja zzjaVar;
        zzja zzjaVar2;
        if (dVar instanceof zzix) {
            zzixVar = (zzix) dVar;
            int i11 = zzixVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzixVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzixVar = new zzix(this, dVar);
            }
        } else {
            zzixVar = new zzix(this, dVar);
        }
        Object objZzb = zzixVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzixVar.zzc;
        b0 b0Var = b0.f48488a;
        if (i12 == 0) {
            e.F(objZzb);
            zzcb zzcbVar = this.zzg;
            zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
            zzixVar.zzd = this;
            zzixVar.zze = str;
            zzixVar.zzc = 1;
            objZzb = zzcbVar.zzb(zzjeVarArr, zzixVar);
            if (objZzb != aVar) {
                zzjaVar = this;
            }
            return aVar;
        }
        if (i12 == 1) {
            str = zzixVar.zze;
            zzjaVar = zzixVar.zzd;
            e.F(objZzb);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = zzixVar.zze;
            zzjaVar2 = zzixVar.zzd;
            e.F(objZzb);
        }
        zzjaVar2.zza = e0.b();
        zzek zzekVar = zzjaVar2.zzj;
        zzekVar.zzc(str);
        e0.B(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar.zzf(42), null), 3);
        return b0Var;
        if (((Boolean) objZzb).booleanValue()) {
            return b0Var;
        }
        zzcb zzcbVar2 = zzjaVar.zzg;
        zzje zzjeVar = zzje.zzb;
        zzixVar.zzd = zzjaVar;
        zzixVar.zze = str;
        zzixVar.zzc = 2;
        if (zzcbVar2.zzc(zzjeVar, zzixVar) != aVar) {
            zzjaVar2 = zzjaVar;
            zzjaVar2.zza = e0.b();
            zzek zzekVar2 = zzjaVar2.zzj;
            zzekVar2.zzc(str);
            e0.B(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar2.zzf(42), null), 3);
            return b0Var;
        }
        return aVar;
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    public final s zzA() {
        s sVar = this.zza;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    public final zzft zzC(zzsc zzscVar, zzcg zzcgVar, WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(m.b1(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, vy.d dVar) {
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        return zzshVarZzf.zzk();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7 A[Catch: Exception -> 0x004d, PHI: r2 r11
      0x00b7: PHI (r2v7 com.google.android.recaptcha.internal.zzja) = 
      (r2v17 com.google.android.recaptcha.internal.zzja)
      (r2v18 com.google.android.recaptcha.internal.zzja)
      (r2v19 com.google.android.recaptcha.internal.zzja)
     binds: [B:40:0x00a9, B:42:0x00b5, B:27:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r11v11 java.lang.String) = (r11v10 java.lang.String), (r11v10 java.lang.String), (r11v18 java.lang.String) binds: [B:40:0x00a9, B:42:0x00b5, B:27:0x0051] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {Exception -> 0x004d, blocks: (B:23:0x0048, B:45:0x00c9, B:43:0x00b7), top: B:56:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9 A[Catch: Exception -> 0x004d, PHI: r2 r11
      0x00c9: PHI (r2v8 ??) = (r2v15 ??), (r2v16 ??) binds: [B:44:0x00c7, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r11v12 java.lang.String) = (r11v11 java.lang.String), (r11v19 java.lang.String) binds: [B:44:0x00c7, B:23:0x0048] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x004d, blocks: (B:23:0x0048, B:45:0x00c9, B:43:0x00b7), top: B:56:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.recaptcha.internal.zzja] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.recaptcha.internal.zzja] */
    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzf(String str, vy.d dVar) throws Throwable {
        zzip zzipVar;
        ?? r9;
        zzja zzjaVar;
        zzja zzjaVar2;
        zzja zzjaVar3;
        s sVarZzA;
        if (dVar instanceof zzip) {
            zzipVar = (zzip) dVar;
            int i11 = zzipVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzipVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzipVar = new zzip(this, dVar);
            }
        } else {
            zzipVar = new zzip(this, dVar);
        }
        Object objZza = zzipVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        ?? r11 = zzipVar.zzc;
        try {
            if (r11 == 0) {
                e.F(objZza);
                zzcb zzcbVar = this.zzg;
                zzje zzjeVar = zzje.zzd;
                zzipVar.zzd = this;
                zzipVar.zze = str;
                zzipVar.zzc = 1;
                objZza = zzcbVar.zza(zzjeVar, zzipVar);
                if (objZza != aVar) {
                    zzjaVar = this;
                }
                zzjaVar2 = zzjaVar;
                zzjaVar3 = zzjaVar2;
                return aVar;
            }
            if (r11 != 1) {
                if (r11 == 2) {
                    str = zzipVar.zze;
                    zzja zzjaVar4 = zzipVar.zzd;
                    e.F(objZza);
                    zzjaVar2 = zzjaVar4;
                    zzjaVar2 = zzjaVar;
                    zzjaVar3 = zzjaVar2;
                    if (((Boolean) objZza).booleanValue()) {
                        zzjaVar3 = zzjaVar2;
                        sVarZzA = zzjaVar3.zzA();
                        zzipVar.zzd = zzjaVar3;
                        zzipVar.zze = str;
                        zzipVar.zzc = 4;
                        r11 = zzjaVar3;
                        if (((t) sVarZzA).o(zzipVar) != aVar) {
                            t tVarB = e0.b();
                            r11.zze.put(str, tVarB);
                            zztp zztpVarZzf = zztq.zzf();
                            zztpVarZzf.zze(str);
                            byte[] bArrZzd = ((zztq) zztpVarZzf.zzk()).zzd();
                            e0.B(r11.zzq.zzb(), null, null, new zziq(r11, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), null), 3);
                            zzipVar.zzd = r11;
                            zzipVar.zze = str;
                            zzipVar.zzc = 5;
                            objZza = tVarB.o(zzipVar);
                            if (objZza != aVar) {
                                r9 = r11;
                                zzsi zzsiVar = (zzsi) objZza;
                                zzsh zzshVarZzf = zzsi.zzf();
                                zzshVarZzf.zze(str);
                                zzsl zzslVarZzf = zzsm.zzf();
                                zzslVarZzf.zze(zzsiVar.zzl());
                                zzshVarZzf.zzq(zzslVarZzf);
                                zzsj zzsjVarZzf = zzsk.zzf();
                                zzsjVarZzf.zze(zzsiVar.zzj());
                                zzsjVarZzf.zzf(zzsiVar.zzM());
                                zzshVarZzf.zzr(zzsjVarZzf);
                                return zzshVarZzf.zzk();
                            }
                        }
                    } else {
                        zzipVar.zzd = zzjaVar2;
                        zzipVar.zze = str;
                        zzipVar.zzc = 3;
                        if (zzjaVar2.zzG(str, zzipVar) != aVar) {
                            zzjaVar3 = zzjaVar2;
                            sVarZzA = zzjaVar3.zzA();
                            zzipVar.zzd = zzjaVar3;
                            zzipVar.zze = str;
                            zzipVar.zzc = 4;
                            r11 = zzjaVar3;
                            if (((t) sVarZzA).o(zzipVar) != aVar) {
                                t tVarB2 = e0.b();
                                r11.zze.put(str, tVarB2);
                                zztp zztpVarZzf2 = zztq.zzf();
                                zztpVarZzf2.zze(str);
                                byte[] bArrZzd2 = ((zztq) zztpVarZzf2.zzk()).zzd();
                                e0.B(r11.zzq.zzb(), null, null, new zziq(r11, zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), null), 3);
                                zzipVar.zzd = r11;
                                zzipVar.zze = str;
                                zzipVar.zzc = 5;
                                objZza = tVarB2.o(zzipVar);
                                if (objZza != aVar) {
                                    r9 = r11;
                                    zzsi zzsiVar2 = (zzsi) objZza;
                                    zzsh zzshVarZzf2 = zzsi.zzf();
                                    zzshVarZzf2.zze(str);
                                    zzsl zzslVarZzf2 = zzsm.zzf();
                                    zzslVarZzf2.zze(zzsiVar2.zzl());
                                    zzshVarZzf2.zzq(zzslVarZzf2);
                                    zzsj zzsjVarZzf2 = zzsk.zzf();
                                    zzsjVarZzf2.zze(zzsiVar2.zzj());
                                    zzsjVarZzf2.zzf(zzsiVar2.zzM());
                                    zzshVarZzf2.zzr(zzsjVarZzf2);
                                    return zzshVarZzf2.zzk();
                                }
                            }
                        }
                    }
                    zzjaVar2 = zzjaVar;
                    zzjaVar3 = zzjaVar2;
                    return aVar;
                }
                if (r11 == 3) {
                    str = zzipVar.zze;
                    zzja zzjaVar5 = zzipVar.zzd;
                    e.F(objZza);
                    zzjaVar3 = zzjaVar5;
                    zzjaVar3 = zzjaVar2;
                    sVarZzA = zzjaVar3.zzA();
                    zzipVar.zzd = zzjaVar3;
                    zzipVar.zze = str;
                    zzipVar.zzc = 4;
                    r11 = zzjaVar3;
                    if (((t) sVarZzA).o(zzipVar) != aVar) {
                        t tVarB3 = e0.b();
                        r11.zze.put(str, tVarB3);
                        zztp zztpVarZzf3 = zztq.zzf();
                        zztpVarZzf3.zze(str);
                        byte[] bArrZzd3 = ((zztq) zztpVarZzf3.zzk()).zzd();
                        e0.B(r11.zzq.zzb(), null, null, new zziq(r11, zzkh.zzh().zzi(bArrZzd3, 0, bArrZzd3.length), null), 3);
                        zzipVar.zzd = r11;
                        zzipVar.zze = str;
                        zzipVar.zzc = 5;
                        objZza = tVarB3.o(zzipVar);
                        if (objZza != aVar) {
                            r9 = r11;
                            zzsi zzsiVar3 = (zzsi) objZza;
                            zzsh zzshVarZzf3 = zzsi.zzf();
                            zzshVarZzf3.zze(str);
                            zzsl zzslVarZzf3 = zzsm.zzf();
                            zzslVarZzf3.zze(zzsiVar3.zzl());
                            zzshVarZzf3.zzq(zzslVarZzf3);
                            zzsj zzsjVarZzf3 = zzsk.zzf();
                            zzsjVarZzf3.zze(zzsiVar3.zzj());
                            zzsjVarZzf3.zzf(zzsiVar3.zzM());
                            zzshVarZzf3.zzr(zzsjVarZzf3);
                            return zzshVarZzf3.zzk();
                        }
                    }
                    zzjaVar2 = zzjaVar;
                    zzjaVar3 = zzjaVar2;
                    return aVar;
                }
                if (r11 != 4) {
                    if (r11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = zzipVar.zze;
                    r9 = zzipVar.zzd;
                    try {
                        e.F(objZza);
                        r9 = r9;
                        zzsi zzsiVar4 = (zzsi) objZza;
                        zzsh zzshVarZzf4 = zzsi.zzf();
                        zzshVarZzf4.zze(str);
                        zzsl zzslVarZzf4 = zzsm.zzf();
                        zzslVarZzf4.zze(zzsiVar4.zzl());
                        zzshVarZzf4.zzq(zzslVarZzf4);
                        zzsj zzsjVarZzf4 = zzsk.zzf();
                        zzsjVarZzf4.zze(zzsiVar4.zzj());
                        zzsjVarZzf4.zzf(zzsiVar4.zzM());
                        zzshVarZzf4.zzr(zzsjVarZzf4);
                        return zzshVarZzf4.zzk();
                    } catch (Exception e8) {
                        e = e8;
                        zzbd zzbdVarZza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                        s sVar = (s) r9.zze.remove(str);
                        if (sVar != null) {
                            ((t) sVar).X(zzbdVarZza);
                        }
                        return e.l(zzbdVarZza);
                    }
                }
                str = zzipVar.zze;
                zzja zzjaVar6 = zzipVar.zzd;
                e.F(objZza);
                r11 = zzjaVar6;
                t tVarB4 = e0.b();
                r11.zze.put(str, tVarB4);
                zztp zztpVarZzf4 = zztq.zzf();
                zztpVarZzf4.zze(str);
                byte[] bArrZzd4 = ((zztq) zztpVarZzf4.zzk()).zzd();
                e0.B(r11.zzq.zzb(), null, null, new zziq(r11, zzkh.zzh().zzi(bArrZzd4, 0, bArrZzd4.length), null), 3);
                zzipVar.zzd = r11;
                zzipVar.zze = str;
                zzipVar.zzc = 5;
                objZza = tVarB4.o(zzipVar);
                if (objZza != aVar) {
                    r9 = r11;
                    zzsi zzsiVar5 = (zzsi) objZza;
                    zzsh zzshVarZzf5 = zzsi.zzf();
                    zzshVarZzf5.zze(str);
                    zzsl zzslVarZzf5 = zzsm.zzf();
                    zzslVarZzf5.zze(zzsiVar5.zzl());
                    zzshVarZzf5.zzq(zzslVarZzf5);
                    zzsj zzsjVarZzf5 = zzsk.zzf();
                    zzsjVarZzf5.zze(zzsiVar5.zzj());
                    zzsjVarZzf5.zzf(zzsiVar5.zzM());
                    zzshVarZzf5.zzr(zzsjVarZzf5);
                    return zzshVarZzf5.zzk();
                }
                zzjaVar2 = zzjaVar;
                zzjaVar3 = zzjaVar2;
                return aVar;
            }
            str = zzipVar.zze;
            zzja zzjaVar7 = zzipVar.zzd;
            e.F(objZza);
            zzjaVar = zzjaVar7;
            if (((Boolean) objZza).booleanValue()) {
                return e.l(new zzbd(zzbb.zzb, zzba.zzav, null));
            }
            zzcb zzcbVar2 = zzjaVar.zzg;
            zzje zzjeVar2 = zzje.zzc;
            zzipVar.zzd = zzjaVar;
            zzipVar.zze = str;
            zzipVar.zzc = 2;
            objZza = zzcbVar2.zza(zzjeVar2, zzipVar);
            if (objZza != aVar) {
                zzjaVar2 = zzjaVar;
                zzjaVar3 = zzjaVar2;
                if (((Boolean) objZza).booleanValue()) {
                    zzipVar.zzd = zzjaVar2;
                    zzipVar.zze = str;
                    zzipVar.zzc = 3;
                    if (zzjaVar2.zzG(str, zzipVar) != aVar) {
                        zzjaVar3 = zzjaVar2;
                        sVarZzA = zzjaVar3.zzA();
                        zzipVar.zzd = zzjaVar3;
                        zzipVar.zze = str;
                        zzipVar.zzc = 4;
                        r11 = zzjaVar3;
                        if (((t) sVarZzA).o(zzipVar) != aVar) {
                            t tVarB5 = e0.b();
                            r11.zze.put(str, tVarB5);
                            zztp zztpVarZzf5 = zztq.zzf();
                            zztpVarZzf5.zze(str);
                            byte[] bArrZzd5 = ((zztq) zztpVarZzf5.zzk()).zzd();
                            e0.B(r11.zzq.zzb(), null, null, new zziq(r11, zzkh.zzh().zzi(bArrZzd5, 0, bArrZzd5.length), null), 3);
                            zzipVar.zzd = r11;
                            zzipVar.zze = str;
                            zzipVar.zzc = 5;
                            objZza = tVarB5.o(zzipVar);
                            if (objZza != aVar) {
                                r9 = r11;
                                zzsi zzsiVar6 = (zzsi) objZza;
                                zzsh zzshVarZzf6 = zzsi.zzf();
                                zzshVarZzf6.zze(str);
                                zzsl zzslVarZzf6 = zzsm.zzf();
                                zzslVarZzf6.zze(zzsiVar6.zzl());
                                zzshVarZzf6.zzq(zzslVarZzf6);
                                zzsj zzsjVarZzf6 = zzsk.zzf();
                                zzsjVarZzf6.zze(zzsiVar6.zzj());
                                zzsjVarZzf6.zzf(zzsiVar6.zzM());
                                zzshVarZzf6.zzr(zzsjVarZzf6);
                                return zzshVarZzf6.zzk();
                            }
                        }
                    }
                } else {
                    zzjaVar3 = zzjaVar2;
                    sVarZzA = zzjaVar3.zzA();
                    zzipVar.zzd = zzjaVar3;
                    zzipVar.zze = str;
                    zzipVar.zzc = 4;
                    r11 = zzjaVar3;
                    if (((t) sVarZzA).o(zzipVar) != aVar) {
                        t tVarB6 = e0.b();
                        r11.zze.put(str, tVarB6);
                        zztp zztpVarZzf6 = zztq.zzf();
                        zztpVarZzf6.zze(str);
                        byte[] bArrZzd6 = ((zztq) zztpVarZzf6.zzk()).zzd();
                        e0.B(r11.zzq.zzb(), null, null, new zziq(r11, zzkh.zzh().zzi(bArrZzd6, 0, bArrZzd6.length), null), 3);
                        zzipVar.zzd = r11;
                        zzipVar.zze = str;
                        zzipVar.zzc = 5;
                        objZza = tVarB6.o(zzipVar);
                        if (objZza != aVar) {
                            r9 = r11;
                            zzsi zzsiVar7 = (zzsi) objZza;
                            zzsh zzshVarZzf7 = zzsi.zzf();
                            zzshVarZzf7.zze(str);
                            zzsl zzslVarZzf7 = zzsm.zzf();
                            zzslVarZzf7.zze(zzsiVar7.zzl());
                            zzshVarZzf7.zzq(zzslVarZzf7);
                            zzsj zzsjVarZzf7 = zzsk.zzf();
                            zzsjVarZzf7.zze(zzsiVar7.zzj());
                            zzsjVarZzf7.zzf(zzsiVar7.zzM());
                            zzshVarZzf7.zzr(zzsjVarZzf7);
                            return zzshVarZzf7.zzk();
                        }
                    }
                }
            }
            zzjaVar2 = zzjaVar;
            zzjaVar3 = zzjaVar2;
            return aVar;
        } catch (Exception e10) {
            e = e10;
            r9 = r11;
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzg(zzbd zzbdVar, vy.d dVar) {
        if (kotlin.jvm.internal.m.a(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzsc r6, vy.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzir
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.recaptcha.internal.zzir r0 = (com.google.android.recaptcha.internal.zzir) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzir r0 = new com.google.android.recaptcha.internal.zzir
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.zza
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.bumptech.glide.e.F(r7)
            goto L6c
        L36:
            com.bumptech.glide.e.F(r7)
            boolean r7 = r6.zzT()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzR()
            if (r7 == 0) goto L5f
            boolean r7 = r6.zzQ()
            if (r7 != 0) goto L4c
            goto L5f
        L4c:
            r5.zzf = r6
            com.google.android.recaptcha.internal.zzek r6 = r5.zzc
            java.lang.String r6 = r6.zzd()
            r0.zzc = r3
            java.lang.Object r6 = r5.zzG(r6, r0)
            if (r6 == r1) goto L6b
        L5c:
            qy.b0 r6 = qy.b0.f48488a
            return r6
        L5f:
            com.google.android.recaptcha.internal.zzcb r6 = r5.zzg
            com.google.android.recaptcha.internal.zzje r7 = com.google.android.recaptcha.internal.zzje.zzd
            r0.zzc = r4
            java.lang.Object r6 = r6.zzc(r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            com.google.android.recaptcha.internal.zzbd r6 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r7 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzav
            r1 = 0
            r6.<init>(r7, r0, r1)
            qy.n r6 = com.bumptech.glide.e.l(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzja.zzh(com.google.android.recaptcha.internal.zzsc, vy.d):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzi(String str, long j11, Exception exc, vy.d dVar) {
        exc.getMessage();
        s sVar = (s) this.zze.remove(str);
        if (sVar != null) {
            ((t) sVar).X(exc);
        }
        return b0.f48488a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzj(Exception exc, vy.d dVar) {
        return ((exc instanceof TimeoutCancellationException) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    public final zzcb zzm() {
        return this.zzg;
    }

    public final zzij zzq() {
        return this.zzi;
    }

    public final Object zzw(vy.d dVar) {
        return e0.M(this.zzq.zzb().getCoroutineContext(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), dVar);
    }

    public final Object zzx(vy.d dVar) {
        Object objM = e0.M(this.zzq.zzb().getCoroutineContext(), new zzil(this, null), dVar);
        return objM == a.COROUTINE_SUSPENDED ? objM : b0.f48488a;
    }
}
