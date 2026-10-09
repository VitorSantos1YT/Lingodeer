package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zznf implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f13472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzgo f13473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zznl f13474c;

    public zznf(zznl zznlVar) {
        this.f13474c = zznlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void g(int i11) {
        zzic zzicVar = this.f13474c.f13202a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.l();
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.m.a("Service connection suspended");
        zzhz zzhzVar2 = zzicVar.f13100g;
        zzic.m(zzhzVar2);
        zzhzVar2.p(new zznb(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void h() {
        zzhz zzhzVar = this.f13474c.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.l();
        synchronized (this) {
            try {
                Preconditions.g(this.f13473b);
                zzgb zzgbVar = (zzgb) this.f13473b.y();
                zzhz zzhzVar2 = this.f13474c.f13202a.f13100g;
                zzic.m(zzhzVar2);
                zzhzVar2.p(new zzna(this, zzgbVar));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f13473b = null;
                this.f13472a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void j(ConnectionResult connectionResult) {
        zznl zznlVar = this.f13474c;
        zzhz zzhzVar = zznlVar.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.l();
        zzgu zzguVar = zznlVar.f13202a.f13099f;
        if (zzguVar == null || !zzguVar.f13203b) {
            zzguVar = null;
        }
        if (zzguVar != null) {
            zzguVar.f12949n.b(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.f13472a = false;
            this.f13473b = null;
        }
        zzhz zzhzVar2 = this.f13474c.f13202a.f13100g;
        zzic.m(zzhzVar2);
        zzhzVar2.p(new zzne(this, connectionResult));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzhz zzhzVar = this.f13474c.f13202a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.l();
        synchronized (this) {
            if (iBinder == null) {
                this.f13472a = false;
                zzgu zzguVar = this.f13474c.f13202a.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12942f.a("Service connected with null binder");
                return;
            }
            zzgb zzfzVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzfzVar = iInterfaceQueryLocalInterface instanceof zzgb ? (zzgb) iInterfaceQueryLocalInterface : new zzfz(iBinder);
                    zzgu zzguVar2 = this.f13474c.f13202a.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12949n.a("Bound to IMeasurementService interface");
                } else {
                    zzgu zzguVar3 = this.f13474c.f13202a.f13099f;
                    zzic.m(zzguVar3);
                    zzguVar3.f12942f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                zzgu zzguVar4 = this.f13474c.f13202a.f13099f;
                zzic.m(zzguVar4);
                zzguVar4.f12942f.a("Service connect failed to get IMeasurementService");
            }
            if (zzfzVar == null) {
                this.f13472a = false;
                try {
                    ConnectionTracker connectionTrackerB = ConnectionTracker.b();
                    zznl zznlVar = this.f13474c;
                    connectionTrackerB.c(zznlVar.f13202a.f13094a, zznlVar.f13488c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                zzhz zzhzVar2 = this.f13474c.f13202a.f13100g;
                zzic.m(zzhzVar2);
                zzhzVar2.p(new zzmy(this, zzfzVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzic zzicVar = this.f13474c.f13202a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.l();
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzguVar);
        zzguVar.m.a("Service disconnected");
        zzhz zzhzVar2 = zzicVar.f13100g;
        zzic.m(zzhzVar2);
        zzhzVar2.p(new zzmz(this, componentName));
    }
}
