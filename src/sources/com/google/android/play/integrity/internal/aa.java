package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class aa extends t {
    public final /* synthetic */ ad H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IBinder f16223t;

    public aa(ad adVar, IBinder iBinder) {
        this.f16223t = iBinder;
        this.H = adVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        ae aeVar = this.H.f16225a;
        aeVar.f16239n = (IInterface) aeVar.f16235i.a(this.f16223t);
        s sVar = aeVar.f16228b;
        int i11 = 0;
        sVar.b("linkToDeath", new Object[0]);
        try {
            aeVar.f16239n.asBinder().linkToDeath(aeVar.f16237k, 0);
        } catch (RemoteException e8) {
            sVar.a(e8, "linkToDeath failed", new Object[0]);
        }
        aeVar.f16233g = false;
        ArrayList arrayList = aeVar.f16230d;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((Runnable) obj).run();
        }
        aeVar.f16230d.clear();
    }
}
