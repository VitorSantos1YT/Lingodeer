package ve;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f54008a;

    public j(k kVar) {
        this.f54008a = kVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        try {
            boolean zB = qf.a.b(k.class);
            Handler handler = null;
            k kVar = this.f54008a;
            if (zB) {
                weakReference = null;
            } else {
                try {
                    weakReference = kVar.f54011b;
                } catch (Throwable th2) {
                    qf.a.a(k.class, th2);
                    weakReference = null;
                }
            }
            Activity activity = (Activity) weakReference.get();
            View viewS = ef.e.s(activity);
            if (activity != null && viewS != null) {
                String simpleName = activity.getClass().getSimpleName();
                d dVar = d.f53979a;
                boolean z11 = false;
                if (!qf.a.b(d.class)) {
                    try {
                        z11 = d.f53985g.get();
                    } catch (Throwable th3) {
                        qf.a.a(d.class, th3);
                    }
                }
                if (z11) {
                    FutureTask futureTask = new FutureTask(new ax.c(viewS));
                    if (!qf.a.b(k.class)) {
                        try {
                            handler = kVar.f54010a;
                        } catch (Throwable th4) {
                            qf.a.a(k.class, th4);
                        }
                    }
                    handler.post(futureTask);
                    String str = BuildConfig.VERSION_NAME;
                    try {
                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                    } catch (Exception unused) {
                        k.a();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("screenname", simpleName);
                        jSONObject.put("screenshot", str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(we.h.c(viewS));
                        jSONObject.put("view", jSONArray);
                    } catch (JSONException unused2) {
                        k.a();
                    }
                    String string = jSONObject.toString();
                    m.e(string, "viewTree.toString()");
                    if (qf.a.b(k.class)) {
                        return;
                    }
                    try {
                        if (!qf.a.b(kVar)) {
                            try {
                                s.d().execute(new pb.b(21, string, kVar));
                            } catch (Throwable th5) {
                                qf.a.a(kVar, th5);
                            }
                        }
                    } catch (Throwable th6) {
                        qf.a.a(k.class, th6);
                    }
                }
            }
        } catch (Exception unused3) {
            k.a();
        }
    }
}
