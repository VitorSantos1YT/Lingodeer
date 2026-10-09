package com.lingo.lingoskill.http.msg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.cache.a;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import fb.j;
import fb.r;
import fb.u;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import km.n0;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import rz.e0;
import rz.o0;
import yz.e;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfigWorker extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FirebaseRemoteConfig f21884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        m.f(appContext, "appContext");
        m.f(workerParams, "workerParams");
        FirebaseRemoteConfig firebaseRemoteConfigD = FirebaseRemoteConfig.d();
        m.e(firebaseRemoteConfigD, "getInstance(...)");
        this.f21884e = firebaseRemoteConfigD;
        j jVar = this.f27111b.f2788b;
        jVar.getClass();
        Object obj = Boolean.FALSE;
        Object obj2 = jVar.f27096a.get(INTENTS.EXTRA_BOOLEAN);
        long j11 = ((Boolean) (obj2 instanceof Boolean ? obj2 : obj)).booleanValue() ? 1L : 3600L;
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        builder.a(j11);
        Tasks.call(firebaseRemoteConfigD.f20647c, new a(1, firebaseRemoteConfigD, new FirebaseRemoteConfigSettings(builder)));
        Context context = firebaseRemoteConfigD.f20645a;
        HashMap map = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                XmlResourceParser xml = resources.getXml(R.xml.remote_config_defaults);
                String name = null;
                String text = null;
                String text2 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        name = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (text != null && text2 != null) {
                                map.put(text, text2);
                            }
                            text = null;
                            text2 = null;
                        }
                        name = null;
                    } else if (eventType == 4 && name != null) {
                        int iHashCode = name.hashCode();
                        if (iHashCode != 106079) {
                            if (iHashCode == 111972721 && name.equals("value")) {
                                text2 = xml.getText();
                            }
                        } else if (name.equals("key")) {
                            text = xml.getText();
                        }
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        try {
            Date date = ConfigContainer.f20695h;
            ConfigContainer.Builder builder2 = new ConfigContainer.Builder(0);
            builder2.f20703a = new JSONObject(map);
            firebaseRemoteConfigD.f20650f.d(builder2.a()).onSuccessTask(FirebaseExecutors.a(), new c3.a(29));
        } catch (JSONException unused2) {
            Tasks.forResult(null);
        }
    }

    @Override // androidx.work.Worker
    public final u c() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.f21884e;
        try {
            Tasks.await(firebaseRemoteConfig.a());
            if (firebaseRemoteConfig.c().f20774a != -1) {
                return new r();
            }
            Task taskB = firebaseRemoteConfig.f20648d.b();
            Task taskB2 = firebaseRemoteConfig.f20649e.b();
            f fVar = o0.f50940a;
            e0.B(e0.c(e.f58387a), null, null, new n0(2, null, 4, false), 3);
            return u.a();
        } catch (Exception unused) {
            return new r();
        }
    }
}
