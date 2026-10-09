package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import y.e;
import y.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zabk implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zat {
    public final zacm H;
    public boolean K;
    public final /* synthetic */ GoogleApiManager O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Api.Client f8779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApiKey f8780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zaaa f8781d;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f8784t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f8778a = new LinkedList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f8782e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f8783f = new HashMap();
    public final ArrayList L = new ArrayList();
    public ConnectionResult M = null;
    public int N = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public zabk(GoogleApiManager googleApiManager, GoogleApi googleApi) {
        String str;
        this.O = googleApiManager;
        Looper looper = googleApiManager.P.getLooper();
        ClientSettings.Builder builderA = googleApi.a();
        Account account = builderA.f8906a;
        f fVar = builderA.f8907b;
        String str2 = builderA.f8908c;
        String str3 = builderA.f8909d;
        SignInOptions signInOptions = SignInOptions.f13694a;
        ClientSettings clientSettings = new ClientSettings(account, fVar, null, str2, str3, signInOptions);
        Api.AbstractClientBuilder abstractClientBuilder = googleApi.f8679d.f8661a;
        Preconditions.g(abstractClientBuilder);
        Api.Client clientA = abstractClientBuilder.a(googleApi.f8676a, looper, clientSettings, googleApi.f8680e, this, this);
        AttributionSourceWrapper attributionSourceWrapper = googleApi.f8678c;
        if (attributionSourceWrapper != null && (clientA instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientA).V = attributionSourceWrapper;
        } else if ((attributionSourceWrapper == null || !(clientA instanceof NonGmsServiceBrokerClient)) && (str = googleApi.f8677b) != null && (clientA instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientA).U = str;
        }
        this.f8779b = clientA;
        this.f8780c = googleApi.f8681f;
        this.f8781d = new zaaa();
        this.f8784t = googleApi.f8683h;
        if (!clientA.p()) {
            this.H = null;
            return;
        }
        Context context = googleApiManager.f8736e;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.P;
        ClientSettings.Builder builderA2 = googleApi.a();
        this.H = new zacm(context, zaoVar, new ClientSettings(builderA2.f8906a, builderA2.f8907b, null, builderA2.f8908c, builderA2.f8909d, signInOptions));
    }

    public final void a() {
        Api.Client client = this.f8779b;
        GoogleApiManager googleApiManager = this.O;
        Preconditions.c(googleApiManager.P);
        this.M = null;
        m(ConnectionResult.f8629f);
        if (this.K) {
            com.google.android.gms.internal.base.zao zaoVar = googleApiManager.P;
            ApiKey apiKey = this.f8780c;
            zaoVar.removeMessages(11, apiKey);
            googleApiManager.P.removeMessages(9, apiKey);
            this.K = false;
        }
        Iterator it = this.f8783f.values().iterator();
        while (it.hasNext()) {
            RegisterListenerMethod registerListenerMethod = ((zacd) it.next()).f8813a;
            if (n(registerListenerMethod.f8745b) != null) {
                it.remove();
            } else {
                try {
                    registerListenerMethod.a(client, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    g(3);
                    client.f("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException | RuntimeException unused2) {
                    it.remove();
                }
            }
        }
        d();
        k();
    }

    public final void b(int i11) {
        Preconditions.c(this.O.P);
        this.M = null;
        this.K = true;
        String strO = this.f8779b.o();
        zaaa zaaaVar = this.f8781d;
        zaaaVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i11 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i11 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (strO != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(strO);
        }
        zaaaVar.a(true, new Status(20, sb2.toString(), null, null));
        ApiKey apiKey = this.f8780c;
        GoogleApiManager googleApiManager = this.O;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.P;
        zaoVar.sendMessageDelayed(Message.obtain(zaoVar, 9, apiKey), 5000L);
        com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.P;
        zaoVar2.sendMessageDelayed(Message.obtain(zaoVar2, 11, apiKey), 120000L);
        SparseIntArray sparseIntArray = googleApiManager.f8738t.f8984a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f8783f.values().iterator();
        while (it.hasNext()) {
            ((zacd) it.next()).f8815c.run();
        }
    }

    public final boolean c(ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.T) {
            try {
                GoogleApiManager googleApiManager = this.O;
                if (googleApiManager.M == null || !googleApiManager.N.contains(this.f8780c)) {
                    return false;
                }
                zaab zaabVar = googleApiManager.M;
                int i11 = this.f8784t;
                zaabVar.getClass();
                zam zamVar = new zam(connectionResult, i11);
                AtomicReference atomicReference = zaabVar.f8847b;
                do {
                    if (atomicReference.compareAndSet(null, zamVar)) {
                        zaabVar.f8848c.post(new zao(zaabVar, zamVar));
                        break;
                    }
                } while (atomicReference.get() == null);
                googleApiManager.f8737f.h(googleApiManager.f8736e, connectionResult, true);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f8778a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            zai zaiVar = (zai) arrayList.get(i11);
            if (!this.f8779b.c()) {
                return;
            }
            if (e(zaiVar)) {
                linkedList.remove(zaiVar);
            }
        }
    }

    public final boolean e(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaaa zaaaVar = this.f8781d;
            Api.Client client = this.f8779b;
            zaiVar.c(zaaaVar, client.p());
            try {
                zaiVar.d(this);
                return true;
            } catch (DeadObjectException unused) {
                g(1);
                client.f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        zac zacVar = (zac) zaiVar;
        Feature featureN = n(zacVar.f(this));
        if (featureN == null) {
            zaaa zaaaVar2 = this.f8781d;
            Api.Client client2 = this.f8779b;
            zaiVar.c(zaaaVar2, client2.p());
            try {
                zaiVar.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                g(1);
                client2.f("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f8779b.getClass().getName();
        String str = featureN.f8638a;
        long jD1 = featureN.D1();
        int length = name.length();
        new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jD1).length() + 2);
        GoogleApiManager googleApiManager = this.O;
        if (!googleApiManager.Q || !zacVar.g(this)) {
            zacVar.b(new UnsupportedApiCallException(featureN));
            return true;
        }
        int iH = zacVar.h(this);
        zabl zablVar = new zabl(this.f8780c, featureN);
        ArrayList arrayList = this.L;
        int iIndexOf = arrayList.indexOf(zablVar);
        if (iIndexOf >= 0) {
            zabl zablVar2 = (zabl) arrayList.get(iIndexOf);
            googleApiManager.P.removeMessages(15, zablVar2);
            googleApiManager.P.sendMessageDelayed(Message.obtain(googleApiManager.P, 15, zablVar2), 5000L);
            return false;
        }
        arrayList.add(zablVar);
        googleApiManager.P.sendMessageDelayed(Message.obtain(googleApiManager.P, 15, zablVar), 5000L);
        googleApiManager.P.sendMessageDelayed(Message.obtain(googleApiManager.P, 16, zablVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iH));
        if (c(connectionResult)) {
            String str2 = featureN.f8638a;
            long jD2 = featureN.D1();
            new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jD2).length());
            return false;
        }
        if (!googleApiManager.g(connectionResult, this.f8784t)) {
            return false;
        }
        String str3 = featureN.f8638a;
        long jD3 = featureN.D1();
        new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jD3).length());
        return false;
    }

    public final void f(Status status, Exception exc, boolean z11) {
        Preconditions.c(this.O.P);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f8778a.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z11 || zaiVar.f8839a == 2) {
                if (status != null) {
                    zaiVar.a(status);
                } else {
                    zaiVar.b(exc);
                }
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void g(int i11) {
        GoogleApiManager googleApiManager = this.O;
        if (Looper.myLooper() == googleApiManager.P.getLooper()) {
            b(i11);
        } else {
            googleApiManager.P.post(new zabh(this, i11));
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void h() {
        GoogleApiManager googleApiManager = this.O;
        if (Looper.myLooper() == googleApiManager.P.getLooper()) {
            a();
        } else {
            googleApiManager.P.post(new zabg(this));
        }
    }

    public final void i(Status status) {
        Preconditions.c(this.O.P);
        f(status, null, false);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void j(ConnectionResult connectionResult) {
        p(connectionResult, null);
    }

    public final void k() {
        GoogleApiManager googleApiManager = this.O;
        com.google.android.gms.internal.base.zao zaoVar = googleApiManager.P;
        ApiKey apiKey = this.f8780c;
        zaoVar.removeMessages(12, apiKey);
        com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.P;
        zaoVar2.sendMessageDelayed(zaoVar2.obtainMessage(12, apiKey), googleApiManager.f8732a);
    }

    public final boolean l(boolean z11) {
        Preconditions.c(this.O.P);
        Api.Client client = this.f8779b;
        if (!client.c() || !this.f8783f.isEmpty()) {
            return false;
        }
        zaaa zaaaVar = this.f8781d;
        if (zaaaVar.f8767a.isEmpty() && zaaaVar.f8768b.isEmpty()) {
            client.f("Timing out service connection.");
            return true;
        }
        if (!z11) {
            return false;
        }
        k();
        return false;
    }

    public final void m(ConnectionResult connectionResult) {
        HashSet hashSet = this.f8782e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        zal zalVar = (zal) it.next();
        if (Objects.a(connectionResult, ConnectionResult.f8629f)) {
            this.f8779b.h();
        }
        zalVar.getClass();
        throw null;
    }

    public final Feature n(Feature[] featureArr) {
        if (featureArr == null || featureArr.length == 0) {
            return null;
        }
        Feature[] featureArrN = this.f8779b.n();
        if (featureArrN == null) {
            featureArrN = new Feature[0];
        }
        e eVar = new e(featureArrN.length);
        for (Feature feature : featureArrN) {
            eVar.put(feature.f8638a, Long.valueOf(feature.D1()));
        }
        for (Feature feature2 : featureArr) {
            Long l9 = (Long) eVar.get(feature2.f8638a);
            if (l9 == null || l9.longValue() < feature2.D1()) {
                return feature2;
            }
        }
        return null;
    }

    public final void o(ConnectionResult connectionResult) {
        Preconditions.c(this.O.P);
        Api.Client client = this.f8779b;
        String name = client.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        client.f(defpackage.e.p(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        p(connectionResult, null);
    }

    public final void p(ConnectionResult connectionResult, RuntimeException runtimeException) {
        com.google.android.gms.signin.zae zaeVar;
        GoogleApiManager googleApiManager = this.O;
        Preconditions.c(googleApiManager.P);
        zacm zacmVar = this.H;
        if (zacmVar != null && (zaeVar = zacmVar.f8828f) != null) {
            zaeVar.j();
        }
        Preconditions.c(this.O.P);
        this.M = null;
        SparseIntArray sparseIntArray = googleApiManager.f8738t.f8984a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        m(connectionResult);
        if ((this.f8779b instanceof com.google.android.gms.common.internal.service.zau) && connectionResult.f8631b != 24) {
            googleApiManager.f8733b = true;
            com.google.android.gms.internal.base.zao zaoVar = googleApiManager.P;
            zaoVar.sendMessageDelayed(zaoVar.obtainMessage(19), 300000L);
        }
        int i11 = connectionResult.f8631b;
        if (i11 == 4) {
            i(GoogleApiManager.S);
            return;
        }
        if (i11 == 25) {
            i(GoogleApiManager.c(this.f8780c, connectionResult));
            return;
        }
        LinkedList linkedList = this.f8778a;
        if (linkedList.isEmpty()) {
            this.M = connectionResult;
            return;
        }
        if (runtimeException != null) {
            Preconditions.c(googleApiManager.P);
            f(null, runtimeException, false);
            return;
        }
        if (!googleApiManager.Q) {
            i(GoogleApiManager.c(this.f8780c, connectionResult));
            return;
        }
        ApiKey apiKey = this.f8780c;
        f(GoogleApiManager.c(apiKey, connectionResult), null, true);
        if (linkedList.isEmpty() || c(connectionResult) || googleApiManager.g(connectionResult, this.f8784t)) {
            return;
        }
        if (connectionResult.f8631b == 18) {
            this.K = true;
        }
        if (!this.K) {
            i(GoogleApiManager.c(apiKey, connectionResult));
        } else {
            com.google.android.gms.internal.base.zao zaoVar2 = googleApiManager.P;
            zaoVar2.sendMessageDelayed(Message.obtain(zaoVar2, 9, apiKey), 5000L);
        }
    }

    public final void q(zai zaiVar) {
        Preconditions.c(this.O.P);
        boolean zC = this.f8779b.c();
        LinkedList linkedList = this.f8778a;
        if (zC) {
            if (e(zaiVar)) {
                k();
                return;
            } else {
                linkedList.add(zaiVar);
                return;
            }
        }
        linkedList.add(zaiVar);
        ConnectionResult connectionResult = this.M;
        if (connectionResult == null || !connectionResult.D1()) {
            s();
        } else {
            p(this.M, null);
        }
    }

    public final void r() {
        Preconditions.c(this.O.P);
        Status status = GoogleApiManager.R;
        i(status);
        zaaa zaaaVar = this.f8781d;
        zaaaVar.getClass();
        zaaaVar.a(false, status);
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f8783f.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            q(new zah(listenerKey, new TaskCompletionSource()));
        }
        m(new ConnectionResult(4, null, null));
        Api.Client client = this.f8779b;
        if (client.c()) {
            client.k(new zabj(this));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        GoogleApiManager googleApiManager = this.O;
        Preconditions.c(googleApiManager.P);
        Api.Client client = this.f8779b;
        if (client.c() || client.g()) {
            return;
        }
        try {
            int iA = googleApiManager.f8738t.a(googleApiManager.f8736e, client);
            if (iA != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iA, null, null);
                new StringBuilder(client.getClass().getName().length() + 35 + connectionResult.toString().length());
                p(connectionResult, null);
                return;
            }
            zabn zabnVar = new zabn(googleApiManager, client, this.f8780c);
            if (client.p()) {
                zacm zacmVar = this.H;
                Preconditions.g(zacmVar);
                com.google.android.gms.signin.zae zaeVar = zacmVar.f8828f;
                if (zaeVar != null) {
                    zaeVar.j();
                }
                ClientSettings clientSettings = zacmVar.f8827e;
                clientSettings.f8905h = Integer.valueOf(System.identityHashCode(zacmVar));
                Api.AbstractClientBuilder abstractClientBuilder = zacmVar.f8825c;
                Context context = zacmVar.f8823a;
                Handler handler = zacmVar.f8824b;
                zacmVar.f8828f = (com.google.android.gms.signin.zae) abstractClientBuilder.a(context, handler.getLooper(), clientSettings, clientSettings.f8904g, zacmVar, zacmVar);
                zacmVar.f8829t = zabnVar;
                Set set = zacmVar.f8826d;
                if (set == null || set.isEmpty()) {
                    handler.post(new zacj(zacmVar));
                } else {
                    zacmVar.f8828f.b();
                }
            }
            try {
                client.i(zabnVar);
            } catch (SecurityException e8) {
                p(new ConnectionResult(10, null, null), e8);
            }
        } catch (IllegalStateException e10) {
            p(new ConnectionResult(10, null, null), e10);
        }
    }
}
