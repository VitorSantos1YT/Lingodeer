package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzhb extends zzgz {
    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* bridge */ /* synthetic */ zzha a(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.f9561e) {
            return zzhaVar;
        }
        zzha zzhaVarA = zzha.a();
        zzevVar.zzc = zzhaVarA;
        return zzhaVarA;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* synthetic */ zzha b(Object obj) {
        return ((zzev) obj).zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final Object c(Object obj, Object obj2) {
        zzha zzhaVar = zzha.f9561e;
        if (!zzhaVar.equals(obj2)) {
            if (zzhaVar.equals(obj)) {
                zzha zzhaVar2 = (zzha) obj2;
                zzha zzhaVar3 = (zzha) obj;
                int i11 = zzhaVar3.f9562a + zzhaVar2.f9562a;
                int[] iArrCopyOf = Arrays.copyOf(zzhaVar3.f9563b, i11);
                System.arraycopy(zzhaVar2.f9563b, 0, iArrCopyOf, zzhaVar3.f9562a, zzhaVar2.f9562a);
                Object[] objArrCopyOf = Arrays.copyOf(zzhaVar3.f9564c, i11);
                System.arraycopy(zzhaVar2.f9564c, 0, objArrCopyOf, zzhaVar3.f9562a, zzhaVar2.f9562a);
                return new zzha(i11, iArrCopyOf, objArrCopyOf, true);
            }
            zzha zzhaVar4 = (zzha) obj2;
            zzha zzhaVar5 = (zzha) obj;
            zzhaVar5.getClass();
            if (!zzhaVar4.equals(zzhaVar)) {
                if (!zzhaVar5.f9565d) {
                    throw new UnsupportedOperationException();
                }
                int i12 = zzhaVar5.f9562a + zzhaVar4.f9562a;
                zzhaVar5.c(i12);
                System.arraycopy(zzhaVar4.f9563b, 0, zzhaVar5.f9563b, zzhaVar5.f9562a, zzhaVar4.f9562a);
                System.arraycopy(zzhaVar4.f9564c, 0, zzhaVar5.f9564c, zzhaVar5.f9562a, zzhaVar4.f9562a);
                zzhaVar5.f9562a = i12;
                return obj;
            }
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* bridge */ /* synthetic */ void d(long j11, Object obj, int i11) {
        ((zzha) obj).b(i11 << 3, Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final void e(Object obj) {
        zzha zzhaVar = ((zzev) obj).zzc;
        if (zzhaVar.f9565d) {
            zzhaVar.f9565d = false;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgz
    public final /* synthetic */ void f(Object obj, Object obj2) {
        ((zzev) obj).zzc = (zzha) obj2;
    }
}
