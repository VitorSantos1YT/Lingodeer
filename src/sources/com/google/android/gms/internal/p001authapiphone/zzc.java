package com.google.android.gms.internal.p001authapiphone;

import android.os.BadParcelableException;
import android.os.Parcel;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9378a = 0;

    static {
        zzc.class.getClassLoader();
    }

    private zzc() {
    }

    public static void a(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(p.j(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
