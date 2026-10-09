package ef;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import org.json.JSONObject;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f25514b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile i f25515c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f25516a = com.bumptech.glide.d.v(h.f25513a);

    public final SharedPreferences a() {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            Object value = this.f25516a.getValue();
            kotlin.jvm.internal.m.e(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public final void b(Activity activity) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            kotlin.jvm.internal.m.e(intent, "activity.intent");
            c(intent, data);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    public final void c(Intent intent, Uri uri) {
        String string;
        if (qf.a.b(this)) {
            return;
        }
        try {
            String string2 = null;
            if (qf.a.b(this)) {
                string = null;
            } else {
                try {
                    String queryParameter = uri.getQueryParameter("al_applink_data");
                    if (queryParameter == null) {
                        string = null;
                    } else {
                        try {
                            string = new JSONObject(queryParameter).getString("campaign_ids");
                        } catch (Exception unused) {
                            string = null;
                        }
                    }
                } catch (Throwable th2) {
                    qf.a.a(this, th2);
                }
            }
            if (string == null) {
                if (!qf.a.b(this)) {
                    try {
                        Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
                        if (bundleExtra != null) {
                            string2 = bundleExtra.getString("campaign_ids");
                        }
                    } catch (Throwable th3) {
                        qf.a.a(this, th3);
                    }
                }
                string = string2;
            }
            if (string != null) {
                a().edit().putString("campaign_ids", string).apply();
            }
        } catch (Throwable th4) {
            qf.a.a(this, th4);
        }
    }
}
