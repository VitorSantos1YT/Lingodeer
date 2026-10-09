package com.google.firebase.inappmessaging.internal;

import a0.b2;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.google.protobuf.Internal;
import ex.c0;
import ex.i0;
import ex.n0;
import ex.y;
import fb.b0;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements yw.c, Continuation, a4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20257e;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f20253a = obj;
        this.f20254b = obj2;
        this.f20255c = obj3;
        this.f20256d = obj4;
        this.f20257e = obj5;
    }

    @Override // yw.c
    public Object apply(Object obj) {
        InAppMessageStreamManager inAppMessageStreamManager = (InAppMessageStreamManager) this.f20253a;
        String str = (String) this.f20254b;
        m mVar = (m) this.f20255c;
        p pVar = (p) this.f20256d;
        k kVar = (k) this.f20257e;
        inAppMessageStreamManager.getClass();
        Internal.ProtobufList protobufListI = ((FetchEligibleCampaignsResponse) obj).I();
        int i11 = uw.d.f53244a;
        ax.d.a(protobufListI, "source is null");
        int i12 = 1;
        int i13 = 2;
        int i14 = 0;
        c0 c0Var = new c0(new c0(new c0(new c0(new n0(protobufListI, i12), new m(inAppMessageStreamManager, i13), i14), new n(str, i13), i14).b(mVar).b(pVar).b(kVar), nx.a.INSTANCE, 3), new b2(new o(), i12), i12);
        int i15 = uw.d.f53244a;
        ax.d.b(i15, "bufferSize");
        return new fx.k(new y(new i0(c0Var, i15)), new p(inAppMessageStreamManager, str, i14), i14);
    }

    @Override // a4.j
    public Object c(a4.i iVar) {
        ((Executor) this.f20253a).execute(new b0((fb.l) this.f20255c, (String) this.f20254b, (fz.a) this.f20256d, (MutableLiveData) this.f20257e, iVar));
        return qy.b0.f48488a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f20253a;
        Task task2 = (Task) this.f20254b;
        Task task3 = (Task) this.f20255c;
        Date date = (Date) this.f20256d;
        HashMap map = (HashMap) this.f20257e;
        int[] iArr = ConfigFetchHandler.f20710k;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            ConfigFetchHandler.FetchResponse fetchResponseA = configFetchHandler.a((String) task2.getResult(), ((InstallationTokenResult) task3.getResult()).a(), date, map);
            return fetchResponseA.f20720a != 0 ? Tasks.forResult(fetchResponseA) : configFetchHandler.f20716f.d(fetchResponseA.f20721b).onSuccessTask(configFetchHandler.f20713c, new com.google.firebase.database.android.d(fetchResponseA, 6));
        } catch (FirebaseRemoteConfigException e8) {
            return Tasks.forException(e8);
        }
    }

    public /* synthetic */ r(Executor executor, fb.l lVar, String str, fz.a aVar, MutableLiveData mutableLiveData) {
        this.f20253a = executor;
        this.f20255c = lVar;
        this.f20254b = str;
        this.f20256d = aVar;
        this.f20257e = mutableLiveData;
    }
}
