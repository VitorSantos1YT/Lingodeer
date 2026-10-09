package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zae extends zai {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BaseImplementation.ApiMethodImpl f8833b;

    public zae(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(1);
        this.f8833b = apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void a(Status status) {
        try {
            this.f8833b.l(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f8833b.l(new Status(10, p.u(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void c(zaaa zaaaVar, boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        Map map = zaaaVar.f8767a;
        BaseImplementation.ApiMethodImpl apiMethodImpl = this.f8833b;
        map.put(apiMethodImpl, boolValueOf);
        apiMethodImpl.c(new zay(zaaaVar, apiMethodImpl));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void d(zabk zabkVar) throws DeadObjectException {
        try {
            BaseImplementation.ApiMethodImpl apiMethodImpl = this.f8833b;
            Api.Client client = zabkVar.f8779b;
            apiMethodImpl.getClass();
            try {
                apiMethodImpl.k(client);
            } catch (DeadObjectException e8) {
                apiMethodImpl.l(new Status(8, e8.getLocalizedMessage(), null, null));
                throw e8;
            } catch (RemoteException e10) {
                apiMethodImpl.l(new Status(8, e10.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e11) {
            b(e11);
        }
    }
}
