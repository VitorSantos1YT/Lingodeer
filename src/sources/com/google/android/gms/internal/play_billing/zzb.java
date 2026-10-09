package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
enum zzb {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final zzbw zzp;
    private final int zzr;

    static {
        zzbv zzbvVar = new zzbv();
        for (zzb zzbVar : values()) {
            Integer numValueOf = Integer.valueOf(zzbVar.zzr);
            int i11 = zzbvVar.f12266b + 1;
            Object[] objArr = zzbvVar.f12265a;
            int length = objArr.length;
            int i12 = i11 + i11;
            if (i12 > length) {
                if (i12 > length) {
                    length = length + (length >> 1) + 1;
                    if (length < i12) {
                        int iHighestOneBit = Integer.highestOneBit(i12 - 1);
                        length = iHighestOneBit + iHighestOneBit;
                    }
                    if (length < 0) {
                        length = Integer.MAX_VALUE;
                    }
                }
                zzbvVar.f12265a = Arrays.copyOf(objArr, length);
            }
            Object[] objArr2 = zzbvVar.f12265a;
            int i13 = zzbvVar.f12266b;
            int i14 = i13 + i13;
            objArr2[i14] = numValueOf;
            objArr2[i14 + 1] = zzbVar;
            zzbvVar.f12266b = i13 + 1;
        }
        zzbu zzbuVar = zzbvVar.f12267c;
        if (zzbuVar != null) {
            throw zzbuVar.a();
        }
        zzcf zzcfVarE = zzcf.e(zzbvVar.f12266b, zzbvVar.f12265a, zzbvVar);
        zzbu zzbuVar2 = zzbvVar.f12267c;
        if (zzbuVar2 != null) {
            throw zzbuVar2.a();
        }
        zzp = zzcfVarE;
    }

    zzb(int i11) {
        this.zzr = i11;
    }

    public static zzb a(int i11) {
        zzbw zzbwVar = zzp;
        Integer numValueOf = Integer.valueOf(i11);
        return !zzbwVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (zzb) zzbwVar.get(numValueOf);
    }
}
