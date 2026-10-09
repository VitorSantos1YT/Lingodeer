package fb;

import android.os.Trace;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import j3.y0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f27043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f27044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f27045f;

    public /* synthetic */ b0(l lVar, String str, fz.a aVar, MutableLiveData mutableLiveData, a4.i iVar) {
        this.f27040a = 0;
        this.f27042c = lVar;
        this.f27041b = str;
        this.f27043d = aVar;
        this.f27044e = mutableLiveData;
        this.f27045f = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        x1.b bVarC;
        switch (this.f27040a) {
            case 0:
                l lVar = (l) this.f27042c;
                String label = this.f27041b;
                fz.a aVar = (fz.a) this.f27043d;
                MutableLiveData mutableLiveData = (MutableLiveData) this.f27044e;
                a4.i iVar = (a4.i) this.f27045f;
                lVar.getClass();
                boolean zA = v10.c.A();
                if (zA) {
                    try {
                        kotlin.jvm.internal.m.f(label, "label");
                        Trace.beginSection(v10.c.L(label));
                    } catch (Throwable th2) {
                        if (zA) {
                            Trace.endSection();
                        }
                        throw th2;
                    }
                }
                try {
                    aVar.invoke();
                    z zVar = a0.f27037b;
                    mutableLiveData.postValue(zVar);
                    iVar.a(zVar);
                    break;
                } catch (Throwable th3) {
                    mutableLiveData.postValue(new y(th3));
                    iVar.b(th3);
                    break;
                }
                if (zA) {
                    Trace.endSection();
                    return;
                }
                return;
            case 1:
                y0 y0Var = (y0) this.f27042c;
                v3.m mVar = (v3.m) this.f27043d;
                String str = this.f27041b;
                v3.c cVar = (v3.c) this.f27044e;
                n3.h hVar = (n3.h) this.f27045f;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    x1.f fVarJ = x1.l.j();
                    x1.b bVar = fVarJ instanceof x1.b ? (x1.b) fVarJ : null;
                    if (bVar == null || (bVarC = bVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        x1.f fVarJ2 = bVarC.j();
                        try {
                            y0 y0VarJ = j3.t.j(y0Var, mVar);
                            ry.r rVar = ry.r.f50854a;
                            new r3.c(str, y0VarJ, rVar, rVar, hVar, cVar).c();
                            x1.f.q(fVarJ2);
                            bVarC.w().d();
                            bVarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th4) {
                            x1.f.q(fVarJ2);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            bVarC.c();
                            throw th6;
                        }
                    }
                } catch (Throwable th7) {
                    Trace.endSection();
                    throw th7;
                }
            default:
                URL openIdKeyUrl = (URL) this.f27042c;
                kotlin.jvm.internal.y result = (kotlin.jvm.internal.y) this.f27043d;
                ReentrantLock lock = (ReentrantLock) this.f27044e;
                Condition condition = (Condition) this.f27045f;
                kotlin.jvm.internal.m.f(openIdKeyUrl, "$openIdKeyUrl");
                kotlin.jvm.internal.m.f(result, "$result");
                String kid = this.f27041b;
                kotlin.jvm.internal.m.f(kid, "$kid");
                kotlin.jvm.internal.m.f(lock, "$lock");
                URLConnection uRLConnectionOpenConnection = openIdKeyUrl.openConnection();
                kotlin.jvm.internal.m.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        kotlin.jvm.internal.m.e(inputStream, "connection.inputStream");
                        String strI = ob.f.I(new BufferedReader(new InputStreamReader(inputStream, oz.a.f46133a), OSSConstants.DEFAULT_BUFFER_SIZE));
                        httpURLConnection.getInputStream().close();
                        result.f38361a = new JSONObject(strI).optString(kid);
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                        } finally {
                            lock.unlock();
                        }
                        break;
                    } catch (Exception e8) {
                        e8.getMessage();
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                        } finally {
                            lock.unlock();
                        }
                        break;
                    }
                    return;
                } catch (Throwable th8) {
                    httpURLConnection.disconnect();
                    lock.lock();
                    try {
                        condition.signal();
                        throw th8;
                    } finally {
                        lock.unlock();
                    }
                }
        }
    }

    public /* synthetic */ b0(Object obj, Serializable serializable, String str, Object obj2, Object obj3, int i11) {
        this.f27040a = i11;
        this.f27042c = obj;
        this.f27043d = serializable;
        this.f27041b = str;
        this.f27044e = obj2;
        this.f27045f = obj3;
    }
}
