package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGmsClient<T extends IInterface> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Feature[] f8886a0 = new Feature[0];
    public IGmsServiceBroker K;
    public ConnectionProgressReportCallbacks L;
    public IInterface M;
    public zze O;
    public final BaseConnectionCallbacks Q;
    public final BaseOnConnectionFailedListener R;
    public final int S;
    public final String T;
    public volatile String U;
    public volatile AttributionSourceWrapper V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzs f8888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GmsClientSupervisor f8890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f8891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f8892f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f8887a = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f8893t = new Object();
    public final Object H = new Object();
    public final ArrayList N = new ArrayList();
    public int P = 1;
    public ConnectionResult W = null;
    public boolean X = false;
    public volatile zzj Y = null;
    public final AtomicInteger Z = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface BaseConnectionCallbacks {
        void g(int i11);

        void h();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface BaseOnConnectionFailedListener {
        void j(ConnectionResult connectionResult);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ConnectionProgressReportCallbacks {
        void a(ConnectionResult connectionResult);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseGmsClient f8894a;

        public LegacyClientCallbackAdapter(BaseGmsClient baseGmsClient) {
            java.util.Objects.requireNonNull(baseGmsClient);
            this.f8894a = baseGmsClient;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void a(ConnectionResult connectionResult) {
            boolean zE1 = connectionResult.E1();
            BaseGmsClient baseGmsClient = this.f8894a;
            if (zE1) {
                baseGmsClient.e(null, baseGmsClient.x());
                return;
            }
            BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.R;
            if (baseOnConnectionFailedListener != null) {
                baseOnConnectionFailedListener.j(connectionResult);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface SignOutCallbacks {
        void a();
    }

    public BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i11, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        Preconditions.h(context, "Context must not be null");
        this.f8889c = context;
        Preconditions.h(looper, "Looper must not be null");
        Preconditions.h(gmsClientSupervisor, "Supervisor must not be null");
        this.f8890d = gmsClientSupervisor;
        Preconditions.h(googleApiAvailabilityLight, "API availability must not be null");
        this.f8891e = googleApiAvailabilityLight;
        this.f8892f = new zzb(this, looper);
        this.S = i11;
        this.Q = baseConnectionCallbacks;
        this.R = baseOnConnectionFailedListener;
        this.T = str;
    }

    public abstract String A();

    public boolean B() {
        return m() >= 211700000;
    }

    public boolean C() {
        return this instanceof com.google.android.gms.common.moduleinstall.internal.zaz;
    }

    public final /* synthetic */ boolean D(int i11, int i12, IInterface iInterface) {
        synchronized (this.f8893t) {
            try {
                if (this.P != i11) {
                    return false;
                }
                E(i12, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void E(int i11, IInterface iInterface) {
        zzs zzsVar;
        Preconditions.b((i11 == 4) == (iInterface != null));
        synchronized (this.f8893t) {
            try {
                this.P = i11;
                this.M = iInterface;
                Bundle bundle = null;
                if (i11 == 1) {
                    zze zzeVar = this.O;
                    if (zzeVar != null) {
                        GmsClientSupervisor gmsClientSupervisor = this.f8890d;
                        String str = this.f8888b.f9043a;
                        Preconditions.g(str);
                        this.f8888b.getClass();
                        if (this.T == null) {
                            this.f8889c.getClass();
                        }
                        boolean z11 = this.f8888b.f9044b;
                        gmsClientSupervisor.getClass();
                        gmsClientSupervisor.c(new zzn(str, z11), zzeVar);
                        this.O = null;
                    }
                } else if (i11 == 2 || i11 == 3) {
                    zze zzeVar2 = this.O;
                    if (zzeVar2 != null && (zzsVar = this.f8888b) != null) {
                        new StringBuilder(String.valueOf(zzsVar.f9043a).length() + 70 + "com.google.android.gms".length());
                        GmsClientSupervisor gmsClientSupervisor2 = this.f8890d;
                        String str2 = this.f8888b.f9043a;
                        Preconditions.g(str2);
                        this.f8888b.getClass();
                        if (this.T == null) {
                            this.f8889c.getClass();
                        }
                        boolean z12 = this.f8888b.f9044b;
                        gmsClientSupervisor2.getClass();
                        gmsClientSupervisor2.c(new zzn(str2, z12), zzeVar2);
                        this.Z.incrementAndGet();
                    }
                    zze zzeVar3 = new zze(this, this.Z.get());
                    this.O = zzeVar3;
                    String strA = A();
                    boolean zB = B();
                    this.f8888b = new zzs(strA, zB);
                    if (zB && m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f8888b.f9043a)));
                    }
                    GmsClientSupervisor gmsClientSupervisor3 = this.f8890d;
                    String str3 = this.f8888b.f9043a;
                    Preconditions.g(str3);
                    this.f8888b.getClass();
                    String name = this.T;
                    if (name == null) {
                        name = this.f8889c.getClass().getName();
                    }
                    ConnectionResult connectionResultB = gmsClientSupervisor3.b(new zzn(str3, this.f8888b.f9044b), zzeVar3, name, v());
                    if (!connectionResultB.E1()) {
                        new StringBuilder(String.valueOf(this.f8888b.f9043a).length() + 34 + tcppUUQxZjFdy.xyxro.length());
                        int i12 = connectionResultB.f8631b;
                        if (i12 == -1) {
                            i12 = 16;
                        }
                        if (connectionResultB.f8632c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultB.f8632c);
                        }
                        int i13 = this.Z.get();
                        zzg zzgVar = new zzg(this, i12, bundle);
                        Handler handler = this.f8892f;
                        handler.sendMessage(handler.obtainMessage(7, i13, -1, zzgVar));
                    }
                } else if (i11 == 4) {
                    Preconditions.g(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z11;
        synchronized (this.f8893t) {
            z11 = this.P == 4;
        }
        return z11;
    }

    public final void e(IAccountAccessor iAccountAccessor, Set set) {
        AttributionSource attributionSource;
        Bundle bundleW = w();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.V == null || (attributionSource = this.V.f9139a) == null || attributionSource.getAttributionTag() == null) ? this.U : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i11 = this.S;
        int i12 = GoogleApiAvailabilityLight.f8645a;
        Scope[] scopeArr = GetServiceRequest.Q;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.R;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i11, i12, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f8919d = this.f8889c.getPackageName();
        getServiceRequest.f8922t = bundleW;
        if (set != null) {
            getServiceRequest.f8921f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            Account accountT = t();
            if (accountT == null) {
                accountT = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.H = accountT;
            if (iAccountAccessor != null) {
                getServiceRequest.f8920e = iAccountAccessor.asBinder();
            }
        }
        getServiceRequest.K = f8886a0;
        getServiceRequest.L = u();
        if (C()) {
            getServiceRequest.O = true;
        }
        try {
            try {
                synchronized (this.H) {
                    try {
                        IGmsServiceBroker iGmsServiceBroker = this.K;
                        if (iGmsServiceBroker != null) {
                            iGmsServiceBroker.E(new zzd(this, this.Z.get()), getServiceRequest);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i13 = this.Z.get();
                zzf zzfVar = new zzf(this, 8, null, null);
                Handler handler = this.f8892f;
                handler.sendMessage(handler.obtainMessage(1, i13, -1, zzfVar));
            }
        } catch (DeadObjectException unused2) {
            int i14 = this.Z.get();
            Handler handler2 = this.f8892f;
            handler2.sendMessage(handler2.obtainMessage(6, i14, 3));
        } catch (SecurityException e8) {
            throw e8;
        }
    }

    public void f(String str) {
        this.f8887a = str;
        j();
    }

    public final boolean g() {
        boolean z11;
        synchronized (this.f8893t) {
            int i11 = this.P;
            z11 = true;
            if (i11 != 2 && i11 != 3) {
                z11 = false;
            }
        }
        return z11;
    }

    public final String h() {
        if (!c() || this.f8888b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public void j() {
        this.Z.incrementAndGet();
        ArrayList arrayList = this.N;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    zzc zzcVar = (zzc) arrayList.get(i11);
                    synchronized (zzcVar) {
                        zzcVar.f9011a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.H) {
            this.K = null;
        }
        E(1, null);
    }

    public final void k(SignOutCallbacks signOutCallbacks) {
        signOutCallbacks.a();
    }

    public final boolean l() {
        return true;
    }

    public int m() {
        return GoogleApiAvailabilityLight.f8645a;
    }

    public final Feature[] n() {
        zzj zzjVar = this.Y;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f9023b;
    }

    public final String o() {
        return this.f8887a;
    }

    public boolean p() {
        return false;
    }

    public final void q() {
        int iC = this.f8891e.c(this.f8889c, m());
        if (iC == 0) {
            i(new LegacyClientCallbackAdapter(this));
            return;
        }
        E(1, null);
        this.L = new LegacyClientCallbackAdapter(this);
        int i11 = this.Z.get();
        Handler handler = this.f8892f;
        handler.sendMessage(handler.obtainMessage(3, i11, iC, null));
    }

    public final void r() {
        if (!c()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface s(IBinder iBinder);

    public Account t() {
        return null;
    }

    public Feature[] u() {
        return f8886a0;
    }

    public Executor v() {
        return null;
    }

    public Bundle w() {
        return new Bundle();
    }

    public Set x() {
        return Collections.EMPTY_SET;
    }

    public final IInterface y() {
        IInterface iInterface;
        synchronized (this.f8893t) {
            try {
                if (this.P == 5) {
                    throw new DeadObjectException();
                }
                r();
                iInterface = this.M;
                Preconditions.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String z();

    public final void i(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        Preconditions.h(connectionProgressReportCallbacks, scqhIrGXy.bMh);
        this.L = connectionProgressReportCallbacks;
        E(2, null);
    }
}
