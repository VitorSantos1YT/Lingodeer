package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzss implements zzrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzafj f11956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzadf f11957b;

    public zzss(zzafj zzafjVar) {
        zzadf zzadfVar = zzadf.f11253b;
        int i11 = zzacf.f11197a;
        this.f11957b = zzadf.f11254c;
        this.f11956a = zzafjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object a(zzrs zzrsVar) throws IOException {
        InputStream inputStreamC = zzst.c(zzrsVar);
        try {
            zzadu zzaduVarA = this.f11956a.a(inputStreamC, this.f11957b);
            if (inputStreamC != null) {
                inputStreamC.close();
            }
            return zzaduVarA;
        } catch (Throwable th2) {
            if (inputStreamC != null) {
                try {
                    inputStreamC.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
