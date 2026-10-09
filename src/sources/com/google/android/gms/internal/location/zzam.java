package com.google.android.gms.internal.location;

import android.os.IInterface;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface zzam extends IInterface {
    void B(zzbc zzbcVar);

    void C0(zzah zzahVar);

    void G0(zzao zzaoVar);

    LocationAvailability H(String str);

    void c();

    void g1(IStatusCallback iStatusCallback);

    void n0(zzl zzlVar);

    void x(StatusCallback statusCallback);

    void zzp();
}
