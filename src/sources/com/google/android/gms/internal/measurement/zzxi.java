package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzyi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class zzxi<API extends zzyi<API>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzzf f12145a;

    public zzxi(zzzf zzzfVar) {
        this.f12145a = zzzfVar;
    }

    public static void a(String str, zzxz zzxzVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(zzxzVar.f12165b))));
        sb2.append(": logging error [");
        zzze.a(1, zzxzVar.g(), sb2);
        sb2.append("]: ");
        sb2.append(str);
        System.err.println(sb2);
        System.err.flush();
    }
}
