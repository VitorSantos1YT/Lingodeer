package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzacd implements zzafj {
    static {
        zzadf zzadfVar = zzadf.f11253b;
        int i11 = zzacf.f11197a;
    }

    @Override // com.google.android.gms.internal.measurement.zzafj
    public final zzadu a(InputStream inputStream, zzadf zzadfVar) throws zzaeh {
        zzacv zzacvVarH = zzacv.h(inputStream, 4096);
        int i11 = zzadu.zzd;
        zzadu zzaduVarN = ((zzadq) this).f11267a.n();
        try {
            zzafp zzafpVarA = zzafl.f11317c.a(zzaduVarN.getClass());
            Object obj = zzacvVarH.f11231c;
            zzafpVarA.g(zzaduVarN, obj != null ? (zzacw) obj : new zzacw(zzacvVarH), zzadfVar);
            zzafpVarA.a(zzaduVarN);
            zzacvVarH.m(0);
            if (zzadu.v(zzaduVarN, true)) {
                return zzaduVarN;
            }
            throw new zzafy().a();
        } catch (zzaeh e8) {
            if (e8.f11277a) {
                throw new zzaeh(e8.getMessage(), e8);
            }
            throw e8;
        } catch (zzafy e10) {
            throw e10.a();
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzaeh) {
                throw ((zzaeh) e11.getCause());
            }
            throw new zzaeh(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzaeh) {
                throw ((zzaeh) e12.getCause());
            }
            throw e12;
        }
    }
}
