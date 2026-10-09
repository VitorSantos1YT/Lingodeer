package re;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f49237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Exception f49238b;

    public z(a0 a0Var) {
        this.f49237a = a0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (!qf.a.b(this)) {
            try {
                Void[] params = (Void[]) objArr;
                if (!qf.a.b(this)) {
                    try {
                        kotlin.jvm.internal.m.f(params, "params");
                        try {
                            a0 a0Var = this.f49237a;
                            a0Var.getClass();
                            String str = y.f49225j;
                            return v.r(a0Var);
                        } catch (Exception e8) {
                            this.f49238b = e8;
                        }
                    } catch (Throwable th2) {
                        qf.a.a(this, th2);
                    }
                }
            } catch (Throwable th3) {
                qf.a.a(this, th3);
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            List result = (List) obj;
            if (qf.a.b(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.m.f(result, "result");
                super.onPostExecute(result);
                Exception exc = this.f49238b;
                if (exc != null) {
                    String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    s sVar = s.f49201a;
                    return;
                }
                return;
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return;
            }
            qf.a.a(this, th);
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        a0 a0Var = this.f49237a;
        if (qf.a.b(this)) {
            return;
        }
        try {
            super.onPreExecute();
            s sVar = s.f49201a;
            if (a0Var.f49111a == null) {
                a0Var.f49111a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.f49237a + "}";
        kotlin.jvm.internal.m.e(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
