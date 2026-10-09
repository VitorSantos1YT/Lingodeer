package com.google.firebase.appcheck.playintegrity.internal;

import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import com.google.firebase.appcheck.internal.NetworkClient;
import com.google.firebase.appcheck.internal.RetryManager;
import defpackage.e;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PlayIntegrityAppCheckProvider implements AppCheckProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntegrityManager f17852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NetworkClient f17853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f17854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f17855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RetryManager f17856f;

    public PlayIntegrityAppCheckProvider(FirebaseApp firebaseApp, Executor executor, Executor executor2) {
        firebaseApp.b();
        String str = firebaseApp.f17716c.f17735e;
        firebaseApp.b();
        IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(firebaseApp.f17714a);
        NetworkClient networkClient = new NetworkClient(firebaseApp);
        RetryManager retryManager = new RetryManager();
        this.f17851a = str;
        this.f17852b = integrityManagerCreate;
        this.f17853c = networkClient;
        this.f17854d = executor;
        this.f17855e = executor2;
        this.f17856f = retryManager;
    }

    @Override // com.google.firebase.appcheck.AppCheckProvider
    public final Task a() {
        final GeneratePlayIntegrityChallengeRequest generatePlayIntegrityChallengeRequest = new GeneratePlayIntegrityChallengeRequest();
        Task taskCall = Tasks.call(this.f17855e, new Callable(generatePlayIntegrityChallengeRequest) { // from class: com.google.firebase.appcheck.playintegrity.internal.c
            @Override // java.util.concurrent.Callable
            public final Object call() throws FirebaseException, UnsupportedEncodingException {
                PlayIntegrityAppCheckProvider playIntegrityAppCheckProvider = this.f17861a;
                NetworkClient networkClient = playIntegrityAppCheckProvider.f17853c;
                byte[] bytes = new JSONObject().toString().getBytes(Constants.ENCODING);
                RetryManager retryManager = playIntegrityAppCheckProvider.f17856f;
                networkClient.getClass();
                long j11 = retryManager.f17832c;
                retryManager.f17830a.getClass();
                if (j11 > System.currentTimeMillis()) {
                    throw new FirebaseException("Too many attempts.");
                }
                String str = networkClient.f17828d;
                String str2 = networkClient.f17827c;
                String str3 = networkClient.f17826b;
                StringBuilder sbS = e.s("https://firebaseappcheck.googleapis.com/v1/projects/", str, "/apps/", str2, ":generatePlayIntegrityChallenge?key=");
                sbS.append(str3);
                JSONObject jSONObject = new JSONObject(networkClient.a(new URL(sbS.toString()), bytes, retryManager, false));
                String strA = Strings.a(jSONObject.optString("challenge"));
                String strA2 = Strings.a(jSONObject.optString("ttl"));
                if (strA == null || strA2 == null) {
                    throw new FirebaseException("Unexpected server response.");
                }
                GeneratePlayIntegrityChallengeResponse generatePlayIntegrityChallengeResponse = new GeneratePlayIntegrityChallengeResponse();
                generatePlayIntegrityChallengeResponse.f17850a = strA;
                return generatePlayIntegrityChallengeResponse;
            }
        });
        final int i11 = 1;
        SuccessContinuation successContinuation = new SuccessContinuation(this) { // from class: com.google.firebase.appcheck.playintegrity.internal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlayIntegrityAppCheckProvider f17858b;

            {
                this.f17858b = this;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                switch (i11) {
                    case 0:
                        final ExchangePlayIntegrityTokenRequest exchangePlayIntegrityTokenRequest = new ExchangePlayIntegrityTokenRequest(((IntegrityTokenResponse) obj).token());
                        final PlayIntegrityAppCheckProvider playIntegrityAppCheckProvider = this.f17858b;
                        return Tasks.call(playIntegrityAppCheckProvider.f17855e, new Callable() { // from class: com.google.firebase.appcheck.playintegrity.internal.b
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws JSONException, FirebaseException, UnsupportedEncodingException {
                                PlayIntegrityAppCheckProvider playIntegrityAppCheckProvider2 = playIntegrityAppCheckProvider;
                                NetworkClient networkClient = playIntegrityAppCheckProvider2.f17853c;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("playIntegrityToken", exchangePlayIntegrityTokenRequest.f17849a);
                                byte[] bytes = jSONObject.toString().getBytes(Constants.ENCODING);
                                RetryManager retryManager = playIntegrityAppCheckProvider2.f17856f;
                                networkClient.getClass();
                                long j11 = retryManager.f17832c;
                                retryManager.f17830a.getClass();
                                if (j11 > System.currentTimeMillis()) {
                                    throw new FirebaseException("Too many attempts.");
                                }
                                String str = networkClient.f17828d;
                                String str2 = networkClient.f17827c;
                                String str3 = networkClient.f17826b;
                                StringBuilder sbS = e.s("https://firebaseappcheck.googleapis.com/v1/projects/", str, "/apps/", str2, ":exchangePlayIntegrityToken?key=");
                                sbS.append(str3);
                                JSONObject jSONObject2 = new JSONObject(networkClient.a(new URL(sbS.toString()), bytes, retryManager, true));
                                String strA = Strings.a(jSONObject2.optString("token"));
                                String strA2 = Strings.a(jSONObject2.optString("ttl"));
                                if (strA == null || strA2 == null) {
                                    throw new FirebaseException("Unexpected server response.");
                                }
                                AppCheckTokenResponse appCheckTokenResponse = new AppCheckTokenResponse();
                                appCheckTokenResponse.f17799a = strA;
                                appCheckTokenResponse.f17800b = strA2;
                                return appCheckTokenResponse;
                            }
                        });
                    default:
                        PlayIntegrityAppCheckProvider playIntegrityAppCheckProvider2 = this.f17858b;
                        return playIntegrityAppCheckProvider2.f17852b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(playIntegrityAppCheckProvider2.f17851a)).setNonce(((GeneratePlayIntegrityChallengeResponse) obj).f17850a).build());
                }
            }
        };
        Executor executor = this.f17854d;
        final int i12 = 0;
        return taskCall.onSuccessTask(executor, successContinuation).onSuccessTask(executor, new SuccessContinuation(this) { // from class: com.google.firebase.appcheck.playintegrity.internal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlayIntegrityAppCheckProvider f17858b;

            {
                this.f17858b = this;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                switch (i12) {
                    case 0:
                        final ExchangePlayIntegrityTokenRequest exchangePlayIntegrityTokenRequest = new ExchangePlayIntegrityTokenRequest(((IntegrityTokenResponse) obj).token());
                        final PlayIntegrityAppCheckProvider playIntegrityAppCheckProvider = this.f17858b;
                        return Tasks.call(playIntegrityAppCheckProvider.f17855e, new Callable() { // from class: com.google.firebase.appcheck.playintegrity.internal.b
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws JSONException, FirebaseException, UnsupportedEncodingException {
                                PlayIntegrityAppCheckProvider playIntegrityAppCheckProvider2 = playIntegrityAppCheckProvider;
                                NetworkClient networkClient = playIntegrityAppCheckProvider2.f17853c;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("playIntegrityToken", exchangePlayIntegrityTokenRequest.f17849a);
                                byte[] bytes = jSONObject.toString().getBytes(Constants.ENCODING);
                                RetryManager retryManager = playIntegrityAppCheckProvider2.f17856f;
                                networkClient.getClass();
                                long j11 = retryManager.f17832c;
                                retryManager.f17830a.getClass();
                                if (j11 > System.currentTimeMillis()) {
                                    throw new FirebaseException("Too many attempts.");
                                }
                                String str = networkClient.f17828d;
                                String str2 = networkClient.f17827c;
                                String str3 = networkClient.f17826b;
                                StringBuilder sbS = e.s("https://firebaseappcheck.googleapis.com/v1/projects/", str, "/apps/", str2, ":exchangePlayIntegrityToken?key=");
                                sbS.append(str3);
                                JSONObject jSONObject2 = new JSONObject(networkClient.a(new URL(sbS.toString()), bytes, retryManager, true));
                                String strA = Strings.a(jSONObject2.optString("token"));
                                String strA2 = Strings.a(jSONObject2.optString("ttl"));
                                if (strA == null || strA2 == null) {
                                    throw new FirebaseException("Unexpected server response.");
                                }
                                AppCheckTokenResponse appCheckTokenResponse = new AppCheckTokenResponse();
                                appCheckTokenResponse.f17799a = strA;
                                appCheckTokenResponse.f17800b = strA2;
                                return appCheckTokenResponse;
                            }
                        });
                    default:
                        PlayIntegrityAppCheckProvider playIntegrityAppCheckProvider2 = this.f17858b;
                        return playIntegrityAppCheckProvider2.f17852b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(playIntegrityAppCheckProvider2.f17851a)).setNonce(((GeneratePlayIntegrityChallengeResponse) obj).f17850a).build());
                }
            }
        }).onSuccessTask(executor, new c3.a(20));
    }
}
