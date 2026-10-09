package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9151b;

    public zzj(byte[] bArr) {
        Preconditions.b(bArr.length == 25);
        this.f9151b = Arrays.hashCode(bArr);
    }

    public static byte[] j(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    public final boolean equals(Object obj) {
        IObjectWrapper iObjectWrapperZzd;
        if (!(obj instanceof com.google.android.gms.common.internal.zzx)) {
            return false;
        }
        try {
            com.google.android.gms.common.internal.zzx zzxVar = (com.google.android.gms.common.internal.zzx) obj;
            if (zzxVar.zze() == this.f9151b && (iObjectWrapperZzd = zzxVar.zzd()) != null) {
                return Arrays.equals(h(), (byte[]) ObjectWrapper.j(iObjectWrapperZzd));
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public abstract byte[] h();

    public final int hashCode() {
        return this.f9151b;
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        return new ObjectWrapper(h());
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        return this.f9151b;
    }
}
