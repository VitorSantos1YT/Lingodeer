package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzmm implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        zzadu zzaduVarP;
        zzjh zzjhVar = (zzjh) task.getResult();
        zzmf zzmfVarE = zzmg.E();
        String str = zzjhVar.f11620a;
        zzmfVarE.m();
        ((zzmg) zzmfVarE.f11266b).F(str);
        String str2 = zzjhVar.f11622c;
        zzmfVarE.m();
        ((zzmg) zzmfVarE.f11266b).H(str2);
        boolean z11 = zzjhVar.f11625f;
        zzmfVarE.m();
        ((zzmg) zzmfVarE.f11266b).K(z11);
        long j11 = zzjhVar.f11626t;
        zzmfVarE.m();
        ((zzmg) zzmfVarE.f11266b).L(j11);
        byte[] bArr = zzjhVar.f11621b;
        if (bArr != null) {
            zzacr zzacrVarK = zzacr.k(bArr, 0, bArr.length);
            zzmfVarE.m();
            ((zzmg) zzmfVarE.f11266b).G(zzacrVarK);
        }
        for (zzjf zzjfVar : zzjhVar.f11623d) {
            for (zzjo zzjoVar : zzjfVar.f11617b) {
                int i11 = zzjoVar.f11645t;
                String str3 = zzjoVar.f11639a;
                if (i11 == 1) {
                    zzmh zzmhVarE = zzmi.E();
                    zzmhVarE.s(str3);
                    if (i11 != 1) {
                        throw new IllegalArgumentException("Not a long type");
                    }
                    long j12 = zzjoVar.f11640b;
                    zzmhVarE.m();
                    ((zzmi) zzmhVarE.f11266b).H(j12);
                    zzaduVarP = zzmhVarE.p();
                } else if (i11 == 2) {
                    zzmh zzmhVarE2 = zzmi.E();
                    zzmhVarE2.s(str3);
                    if (i11 != 2) {
                        throw new IllegalArgumentException("Not a boolean type");
                    }
                    boolean z12 = zzjoVar.f11641c;
                    zzmhVarE2.m();
                    ((zzmi) zzmhVarE2.f11266b).I(z12);
                    zzaduVarP = zzmhVarE2.p();
                } else if (i11 == 3) {
                    zzmh zzmhVarE3 = zzmi.E();
                    zzmhVarE3.s(str3);
                    if (i11 != 3) {
                        throw new IllegalArgumentException("Not a double type");
                    }
                    double d5 = zzjoVar.f11642d;
                    zzmhVarE3.m();
                    ((zzmi) zzmhVarE3.f11266b).J(d5);
                    zzaduVarP = zzmhVarE3.p();
                } else if (i11 == 4) {
                    zzmh zzmhVarE4 = zzmi.E();
                    zzmhVarE4.s(str3);
                    if (i11 != 4) {
                        throw new IllegalArgumentException("Not a String type");
                    }
                    String str4 = zzjoVar.f11643e;
                    Preconditions.g(str4);
                    zzmhVarE4.m();
                    ((zzmi) zzmhVarE4.f11266b).K(str4);
                    zzaduVarP = zzmhVarE4.p();
                } else {
                    if (i11 != 5) {
                        throw new IllegalArgumentException(e.g(i11, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i11).length() + 24)));
                    }
                    zzmh zzmhVarE5 = zzmi.E();
                    zzmhVarE5.s(str3);
                    if (i11 != 5) {
                        throw new IllegalArgumentException("Not a bytes type");
                    }
                    byte[] bArr2 = zzjoVar.f11644f;
                    Preconditions.g(bArr2);
                    zzacr zzacrVarK2 = zzacr.k(bArr2, 0, bArr2.length);
                    zzmhVarE5.m();
                    ((zzmi) zzmhVarE5.f11266b).L(zzacrVarK2);
                    zzaduVarP = zzmhVarE5.p();
                }
                zzmfVarE.m();
                ((zzmg) zzmfVarE.f11266b).I((zzmi) zzaduVarP);
            }
            String[] strArr = zzjfVar.f11618c;
            if (strArr != null) {
                for (String str5 : strArr) {
                    zzmfVarE.m();
                    ((zzmg) zzmfVarE.f11266b).J(str5);
                }
            }
        }
        return (zzmg) zzmfVarE.p();
    }
}
