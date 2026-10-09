package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzai;
import com.google.android.gms.internal.common.zzal;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GmsSignatureVerifier {
    static {
        zzaa zzaaVar = new zzaa();
        zzaaVar.f9147a = "com.google.android.gms";
        zzaaVar.f9148b = 204200000L;
        zzi zziVar = zzo.f9166f;
        byte[] bArrH = zziVar.h();
        byte[] bArrH2 = zzo.f9164d.h();
        byte[] bArrH3 = zzo.f9162b.h();
        zzal zzalVar = zzah.f9618b;
        Object[] objArr = {bArrH, bArrH2, bArrH3};
        zzai.a(3, objArr);
        zzah zzahVarO = zzah.o(3, objArr);
        Preconditions.g(zzahVarO);
        zzaaVar.f9149c = zzah.n(zzahVarO);
        zzh zzhVar = zzo.f9165e;
        byte[] bArrH4 = zzhVar.h();
        zzf zzfVar = zzo.f9163c;
        Object[] objArr2 = {bArrH4, zzfVar.h(), zzo.f9161a.h()};
        zzai.a(3, objArr2);
        zzah zzahVarO2 = zzah.o(3, objArr2);
        Preconditions.g(zzahVarO2);
        zzaaVar.f9150d = zzah.n(zzahVarO2);
        zzaaVar.a();
        zzaa zzaaVar2 = new zzaa();
        zzaaVar2.f9147a = "com.android.vending";
        zzaaVar2.f9148b = 82240000L;
        Object[] objArr3 = {zziVar.h()};
        zzai.a(1, objArr3);
        zzah zzahVarO3 = zzah.o(1, objArr3);
        Preconditions.g(zzahVarO3);
        zzaaVar2.f9149c = zzah.n(zzahVarO3);
        Object[] objArr4 = {zzhVar.h(), zzfVar.h()};
        zzai.a(2, objArr4);
        zzah zzahVarO4 = zzah.o(2, objArr4);
        Preconditions.g(zzahVarO4);
        zzaaVar2.f9150d = zzah.n(zzahVarO4);
        zzaaVar2.a();
        new HashMap();
    }
}
