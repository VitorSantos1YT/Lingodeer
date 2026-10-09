package com.google.firebase.database.android;

import android.content.Intent;
import androidx.credentials.playservices.HiddenActivity;
import androidx.media3.common.PlaybackException;
import b7.k;
import b7.w;
import bq.r;
import c7.u;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.api.Service;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplayRegistrar;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksFactory;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.google.firebase.inappmessaging.model.InAppMessage;
import com.google.firebase.inappmessaging.model.TriggeredInAppMessage;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionEvents;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.splash.SplashIndexActivity;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ef.l;
import f7.f;
import f7.x;
import ff.i;
import hh.p0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;
import l1.b1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.s;
import x7.e0;
import y6.a0;
import y6.c0;
import y6.h0;
import y6.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Deferred.DeferredHandler, yw.b, ComponentFactory, Continuation, SuccessContinuation, Transformer, ObjectConstructor, u, k, l, tx.a, i.b, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19021b;

    public /* synthetic */ d(g7.a aVar, Object obj, int i11) {
        this.f19020a = i11;
        this.f19021b = obj;
    }

    @Override // yw.b
    public void accept(Object obj) {
        FirebaseInAppMessaging firebaseInAppMessaging = (FirebaseInAppMessaging) this.f19021b;
        TriggeredInAppMessage triggeredInAppMessage = (TriggeredInAppMessage) obj;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.e eVar = firebaseInAppMessaging.f19704d;
        if (eVar != null) {
            InAppMessage inAppMessage = triggeredInAppMessage.f20340a;
            DisplayCallbacksFactory displayCallbacksFactory = firebaseInAppMessaging.f19701a;
            eVar.displayMessage(inAppMessage, new DisplayCallbacksImpl(displayCallbacksFactory.f19975a, displayCallbacksFactory.f19976b, displayCallbacksFactory.f19977c, displayCallbacksFactory.f19978d, displayCallbacksFactory.f19979e, displayCallbacksFactory.f19980f, displayCallbacksFactory.f19981g, inAppMessage, triggeredInAppMessage.f20341b));
        }
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        EventGDTLogger eventGDTLogger = (EventGDTLogger) this.f19021b;
        SessionEvent sessionEvent = (SessionEvent) obj;
        int i11 = EventGDTLogger.f20883b;
        eventGDTLogger.getClass();
        SessionEvents.f20943a.getClass();
        String strB = SessionEvents.f20944b.b(sessionEvent);
        m.e(strB, "encode(...)");
        sessionEvent.f20940a.name();
        byte[] bytes = strB.getBytes(oz.a.f46133a);
        m.e(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // c7.u
    public void b(long j11, w wVar) {
        switch (this.f19020a) {
            case 10:
                x7.a.d(j11, wVar, (e0[]) ((ob.m) this.f19021b).f44827c);
                break;
            default:
                x7.a.e(j11, wVar, (e0[]) ((xq.c) this.f19021b).f56175c);
                break;
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f19020a) {
            case 8:
                return ConstructorConstructor.lambda$newDefaultConstructor$9((Constructor) this.f19021b);
            default:
                return ConstructorConstructor.lambda$newUnsafeAllocator$19((Class) this.f19021b);
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object d(ComponentContainer componentContainer) {
        switch (this.f19020a) {
            case 2:
                return ((FirebaseInAppMessagingRegistrar) this.f19021b).providesFirebaseInAppMessaging(componentContainer);
            case 3:
                return ((FirebaseInAppMessagingDisplayRegistrar) this.f19021b).buildFirebaseInAppMessagingUI(componentContainer);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0((Qualified) this.f19021b, componentContainer);
        }
    }

    @Override // ef.l
    public void e(File file) {
        HashMap map;
        HashMap map2;
        ff.b bVar;
        HashMap map3;
        ArrayList arrayList = (ArrayList) this.f19021b;
        m.f(file, "file");
        HashMap map4 = ff.b.m;
        int i11 = 0;
        if (qf.a.b(i.class)) {
            map = null;
            break;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[iAvailable];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (iAvailable >= 4) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i12 = byteBufferWrap.getInt();
                int i13 = i12 + 4;
                if (iAvailable >= i13) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i12, oz.a.f46133a));
                    JSONArray jSONArrayNames = jSONObject.names();
                    int length = jSONArrayNames.length();
                    String[] strArr = new String[length];
                    for (int i14 = 0; i14 < length; i14++) {
                        strArr[i14] = jSONArrayNames.getString(i14);
                    }
                    if (length > 1) {
                        Arrays.sort(strArr);
                    }
                    map = new HashMap();
                    int i15 = 0;
                    while (i15 < length) {
                        String str = strArr[i15];
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i16 = 1;
                            while (i11 < length2) {
                                int i17 = jSONArray.getInt(i11);
                                iArr[i11] = i17;
                                i16 *= i17;
                                i11++;
                            }
                            int i18 = i16 * 4;
                            int i19 = i13 + i18;
                            if (i19 <= iAvailable) {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i13, i18);
                                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                ff.a aVar = new ff.a(iArr);
                                byteBufferWrap2.asFloatBuffer().get(aVar.f27222c, 0, i16);
                                map.put(str, aVar);
                                i13 = i19;
                            }
                        }
                        i15++;
                        i11 = 0;
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            qf.a.a(i.class, th2);
        }
        map = null;
        break;
        if (map == null) {
            map2 = null;
            break;
        }
        map2 = new HashMap();
        if (qf.a.b(ff.b.class)) {
            map3 = null;
        } else {
            try {
                map3 = ff.b.m;
            } catch (Throwable th3) {
                qf.a.a(ff.b.class, th3);
                map3 = null;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (map3.containsKey(entry.getKey()) && (str2 = (String) map3.get(entry.getKey())) == null) {
                map2 = null;
                break;
            }
            map2.put(str2, entry.getValue());
        }
        if (map2 == null) {
            bVar = null;
        } else {
            try {
                bVar = new ff.b(map2);
            } catch (Exception unused2) {
                bVar = null;
            }
        }
        if (bVar != null) {
            int size = arrayList.size();
            int i21 = 0;
            while (i21 < size) {
                Object obj = arrayList.get(i21);
                i21++;
                ff.e eVar = (ff.e) obj;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eVar.f27236a);
                sb2.append('_');
                String strI = p0.i(eVar.f27239d, "_rule", sb2);
                String str3 = eVar.f27238c;
                com.google.android.datatransport.runtime.scheduling.jobscheduling.e eVar2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(8, eVar, bVar);
                File file2 = new File(i.b(), strI);
                if (str3 == null || file2.exists()) {
                    eVar2.e(file2);
                } else {
                    new ef.m(str3, file2, eVar2).execute(new String[0]);
                }
            }
        }
    }

    @Override // i.b
    public void f(Object obj) {
        LanguageItem languageItemV;
        String stringExtra;
        int i11 = this.f19020a;
        Object obj2 = this.f19021b;
        switch (i11) {
            case 20:
                ((fz.c) ((b1) obj2).getValue()).invoke(obj);
                break;
            default:
                SplashIndexActivity splashIndexActivity = (SplashIndexActivity) obj2;
                i.a it = (i.a) obj;
                int i12 = SplashIndexActivity.M;
                m.f(it, "it");
                if (it.f33864a == 3006) {
                    Intent intent = it.f33865b;
                    if (intent == null || (stringExtra = intent.getStringExtra(INTENTS.EXTRA_STRING)) == null) {
                        languageItemV = null;
                    } else {
                        int[] iArr = r.f4959a;
                        languageItemV = bq.m.v(splashIndexActivity, stringExtra);
                    }
                    if (languageItemV != null) {
                        int[] iArr2 = r.f4959a;
                        if (bq.m.r(languageItemV.getKeyLanguage()).length() > 0) {
                            Intent intent2 = new Intent(splashIndexActivity, (Class<?>) SwitchLanguageActivity.class);
                            intent2.putExtra(INTENTS.EXTRA_OBJECT, languageItemV);
                            intent2.putExtra(INTENTS.EXTRA_BOOLEAN, false);
                            intent2.putExtra(INTENTS.EXTRA_STRING, BuildConfig.VERSION_NAME);
                            splashIndexActivity.startActivity(intent2);
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void h(Provider provider) {
        ((AndroidAuthTokenProvider) this.f19021b).f19004b.set((InternalAuthProvider) provider.get());
    }

    @Override // b7.k
    public void invoke(Object obj) {
        switch (this.f19020a) {
            case 12:
                ((h0) obj).g((a0) this.f19021b);
                break;
            case 13:
                ((h0) obj).s((t0) this.f19021b);
                break;
            case 14:
                ((h0) obj).e((a7.d) this.f19021b);
                break;
            case 15:
                ((h0) obj).g(((x) this.f19021b).f26935a.f26658v0);
                break;
            case 16:
                ((h0) obj).r((c0) this.f19021b);
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((g7.i) ((g7.b) obj)).f28840o = (PlaybackException) this.f19021b;
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                f fVar = (f) this.f19021b;
                g7.i iVar = (g7.i) ((g7.b) obj);
                iVar.f28850y += fVar.f26721g;
                iVar.f28851z += fVar.f26719e;
                break;
            default:
                p7.x xVar = (p7.x) this.f19021b;
                g7.i iVar2 = (g7.i) ((g7.b) obj);
                iVar2.getClass();
                iVar2.f28848w = xVar.f46529a;
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i11 = this.f19020a;
        g5.c cVar = (g5.c) this.f19021b;
        switch (i11) {
            case 21:
                int i12 = HiddenActivity.f1441c;
                cVar.invoke(obj);
                break;
            case 22:
                int i13 = HiddenActivity.f1441c;
                cVar.invoke(obj);
                break;
            case 23:
                int i14 = HiddenActivity.f1441c;
                cVar.invoke(obj);
                break;
            default:
                int i15 = HiddenActivity.f1441c;
                cVar.invoke(obj);
                break;
        }
    }

    @Override // tx.a
    public void run() {
        ((fj.c) this.f19021b).H.postValue(100);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) this.f19021b;
        int[] iArr = ConfigFetchHandler.f20710k;
        return Tasks.forResult(fetchResponse);
    }

    public /* synthetic */ d(g7.a aVar, s sVar, p7.x xVar, IOException iOException, boolean z11) {
        this.f19020a = 27;
        this.f19021b = xVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z11;
        FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) this.f19021b;
        if (task.isSuccessful()) {
            ConfigCacheClient configCacheClient = firebaseRemoteConfig.f20648d;
            synchronized (configCacheClient) {
                configCacheClient.f20693c = Tasks.forResult(null);
            }
            ConfigStorageClient configStorageClient = configCacheClient.f20692b;
            synchronized (configStorageClient) {
                configStorageClient.f20772a.deleteFile(configStorageClient.f20773b);
            }
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (configContainer != null) {
                JSONArray jSONArray = configContainer.f20699d;
                FirebaseABTesting firebaseABTesting = firebaseRemoteConfig.f20646b;
                if (firebaseABTesting != null) {
                    try {
                        firebaseABTesting.c(FirebaseRemoteConfig.h(jSONArray));
                    } catch (AbtException | JSONException unused) {
                    }
                }
                RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = firebaseRemoteConfig.f20656l;
                try {
                    RolloutsState rolloutsStateA = rolloutsStateSubscriptionsHandler.f20785b.a(configContainer);
                    Iterator it = rolloutsStateSubscriptionsHandler.f20787d.iterator();
                    while (it.hasNext()) {
                        rolloutsStateSubscriptionsHandler.f20786c.execute(new og.a((RolloutsStateSubscriber) it.next(), rolloutsStateA, 1));
                    }
                } catch (FirebaseRemoteConfigException unused2) {
                }
            }
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public /* synthetic */ d(Object obj, int i11) {
        this.f19020a = i11;
        this.f19021b = obj;
    }
}
