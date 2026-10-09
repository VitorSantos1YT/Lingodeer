package lf;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f40077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Exception[] f40078c = new Exception[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f40079d;

    public n1(p1 p1Var, String str, Bundle bundle) {
        this.f40079d = p1Var;
        this.f40076a = str;
        this.f40077b = bundle;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [lf.m1] */
    public final String[] a(Void... p4) {
        if (!qf.a.b(this)) {
            try {
                kotlin.jvm.internal.m.f(p4, "p0");
                String[] stringArray = this.f40077b.getStringArray("media");
                if (stringArray != null) {
                    final String[] strArr = new String[stringArray.length];
                    this.f40078c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    Date date = re.b.N;
                    re.b bVarX = ns.o.x();
                    try {
                        int length = stringArray.length;
                        for (final int i11 = 0; i11 < length; i11++) {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((re.z) it.next()).cancel(true);
                                }
                            } else {
                                Uri uri = Uri.parse(stringArray[i11]);
                                if (j1.z(uri)) {
                                    strArr[i11] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    ?? r9 = new re.u() { // from class: lf.m1
                                        @Override // re.u
                                        public final void a(re.b0 b0Var) {
                                            String[] strArr2 = strArr;
                                            int i12 = i11;
                                            try {
                                                re.r rVar = b0Var.f49125c;
                                                String str = "Error staging photo.";
                                                if (rVar != null) {
                                                    String strA = rVar.a();
                                                    if (strA != null) {
                                                        str = strA;
                                                    }
                                                    throw new FacebookGraphResponseException(b0Var, str);
                                                }
                                                JSONObject jSONObject = b0Var.f49124b;
                                                if (jSONObject == null) {
                                                    throw new FacebookException("Error staging photo.");
                                                }
                                                String strOptString = jSONObject.optString("uri");
                                                if (strOptString == null) {
                                                    throw new FacebookException("Error staging photo.");
                                                }
                                                strArr2[i12] = strOptString;
                                                countDownLatch.countDown();
                                            } catch (Exception e8) {
                                                this.f40078c[i12] = e8;
                                            }
                                        }
                                    };
                                    kotlin.jvm.internal.m.e(uri, "uri");
                                    concurrentLinkedQueue.add(qx.b.A(bVarX, uri, r9).d());
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((re.z) it2.next()).cancel(true);
                        }
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return null;
            }
        }
        return null;
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.f40077b;
        p1 p1Var = this.f40079d;
        if (qf.a.b(this)) {
            return;
        }
        try {
            ProgressDialog progressDialog = p1Var.f40094e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            for (Exception exc : this.f40078c) {
                if (exc != null) {
                    p1Var.e(exc);
                    return;
                }
            }
            if (strArr == null) {
                p1Var.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List listA = ry.l.A(strArr);
            if (listA.contains(null)) {
                p1Var.e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            j1.F(bundle, new JSONArray((Collection) listA));
            p1Var.f40090a = j1.a(k.d(), re.s.e() + "/dialog/" + this.f40076a, bundle).toString();
            ImageView imageView = p1Var.f40095f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            p1Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            b((String[]) obj);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
