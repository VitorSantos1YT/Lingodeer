package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.Process;
import ep.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsv implements zzrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzafc f11959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzro[] f11960b;

    public zzsv(zzafc zzafcVar) {
        this.f11959a = zzafcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object a(zzrs zzrsVar) throws IOException {
        Uri uri = zzrsVar.f11923d;
        AtomicLong atomicLong = zzsu.f11958a;
        int iMyPid = Process.myPid();
        long id2 = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = zzsu.f11958a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id2).length();
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb2.append(".mobstore_tmp-");
        sb2.append(iMyPid);
        sb2.append("-");
        sb2.append(id2);
        a.y(jCurrentTimeMillis, "-", "-", sb2);
        sb2.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb2.toString())).build();
        zzsx zzsxVar = zzrsVar.f11920a;
        ArrayList arrayListA = zzrsVar.a(zzsxVar.d(uriBuild));
        zzro[] zzroVarArr = this.f11960b;
        if (zzroVarArr != null) {
            zzroVarArr[0].a(arrayListA);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListA.get(0);
            try {
                this.f11959a.g(outputStream);
                zzro[] zzroVarArr2 = this.f11960b;
                if (zzroVarArr2 != null) {
                    zzroVarArr2[0].zzb();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                zzsxVar.f(uriBuild, uri);
                return null;
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Exception e8) {
            try {
                zzsxVar.e(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e8 instanceof IOException) {
                throw ((IOException) e8);
            }
            throw new IOException(e8);
        }
    }
}
