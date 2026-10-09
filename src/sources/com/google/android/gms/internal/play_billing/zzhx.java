package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhx extends zzfi implements zzgm {
    private static final zzhx zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzig zzh;
    private int zzi;

    static {
        zzhx zzhxVar = new zzhx();
        zzb = zzhxVar;
        zzfi.m(zzhx.class, zzhxVar);
    }

    private zzhx() {
    }

    public static zzhx p(byte[] bArr, zzeu zzeuVar) throws zzfq {
        zzfi zzfiVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            zzfi zzfiVar2 = (zzfi) zzfiVar.f(4);
            try {
                zzgv zzgvVarA = zzgs.f12418c.a(zzfiVar2.getClass());
                zzgvVarA.e(zzfiVar2, bArr, 0, length, new zzdw(zzeuVar));
                zzgvVarA.zzf(zzfiVar2);
                zzfiVar = zzfiVar2;
            } catch (zzfq e8) {
                throw e8;
            } catch (zzhg e10) {
                throw new zzfq(e10.getMessage());
            } catch (IOException e11) {
                if (e11.getCause() instanceof zzfq) {
                    throw ((zzfq) e11.getCause());
                }
                throw new zzfq(e11.getMessage(), e11);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (zzfiVar == null || zzfi.e(zzfiVar, true)) {
            return (zzhx) zzfiVar;
        }
        throw new zzfq(new zzhg().getMessage());
    }

    public static /* synthetic */ void r(zzhx zzhxVar, zzil zzilVar) {
        zzhxVar.zzi = zzilVar.zza();
        zzhxVar.zzd |= 4;
    }

    public static /* synthetic */ void s(zzhx zzhxVar, zzig zzigVar) {
        zzhxVar.zzh = zzigVar;
        zzhxVar.zzd |= 2;
    }

    public static /* synthetic */ void t(zzhx zzhxVar, zzjf zzjfVar) {
        zzhxVar.zzf = zzjfVar;
        zzhxVar.zze = 7;
    }

    public static /* synthetic */ void u(zzhx zzhxVar, zzjv zzjvVar) {
        zzhxVar.zzf = zzjvVar;
        zzhxVar.zze = 6;
    }

    public static /* synthetic */ void v(zzhx zzhxVar, int i11) {
        zzhxVar.zzg = i11 - 1;
        zzhxVar.zzd |= 1;
    }

    public static zzhv w() {
        return (zzhv) zzb.g();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    public final Object f(int i11) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return new zzgu(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzhy.f12464a, "zzh", zziz.class, "zzi", zzik.f12466a, zzjv.class, zzjf.class});
        }
        if (i12 == 3) {
            return new zzhx();
        }
        if (i12 == 4) {
            return new zzhv(zzb);
        }
        if (i12 == 5) {
            return zzb;
        }
        throw null;
    }

    public final zzjf q() {
        return this.zze == 7 ? (zzjf) this.zzf : zzjf.q();
    }
}
