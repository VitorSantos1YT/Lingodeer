package com.google.android.gms.internal.measurement;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zznd f11758c = new zznd(zzmw.f11746b, zzmq.F());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzmw f11759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzmq f11760b;

    public zznd(zzmw zzmwVar, zzmq zzmqVar) {
        zzmwVar.getClass();
        this.f11759a = zzmwVar;
        this.f11760b = zzmqVar;
    }

    public static zznd a(zzacv zzacvVar, boolean z11) throws zzaeh {
        zzmw zzmwVarA;
        int iC = zzacvVar.C();
        if (iC > 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(iC).length() + 44);
            sb2.append("Unsupported version: ");
            sb2.append(iC);
            sb2.append(". Current version is: 1");
            throw new zzaeh(sb2.toString());
        }
        zzacvVar.C();
        int iA = zzacvVar.a(zzacvVar.A());
        zzadf zzadfVar = zzadf.f11253b;
        int i11 = zzacf.f11197a;
        zzmq zzmqVarE = zzmq.E(zzacvVar, zzadf.f11254c);
        zzacvVar.b(iA);
        zzmu zzmuVarA = zzmu.a();
        Inflater inflater = zzmuVarA.f11739a;
        try {
            if (z11) {
                int iA2 = zzacvVar.a(zzacvVar.A());
                int i12 = zznb.f11756a;
                int iC2 = zzacvVar.c();
                try {
                    zzmwVarA = zzmw.a(zzacv.h(new InflaterInputStream(new zzms(zzmuVarA, zzacvVar), inflater, iC2 < 0 ? 4096 : Math.min(iC2, 4096)), 4096));
                    inflater.reset();
                    if (zzacvVar.c() != 0) {
                        throw new zzaeh("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    zzacvVar.b(iA2);
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            } else {
                byte[] bArrZ = zzacvVar.z();
                int i13 = zznc.f11757a;
                inflater.setInput(bArrZ);
                try {
                    zzmwVarA = zzmw.a(zzacv.h(new zzmr(zzmuVarA), 4096));
                    inflater.reset();
                } catch (Throwable th3) {
                    inflater.reset();
                    throw th3;
                }
            }
            zzmuVarA.close();
            return new zznd(zzmwVarA, zzmqVarE);
        } catch (Throwable th4) {
            try {
                zzmuVarA.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }
}
