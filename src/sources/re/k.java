package re;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static k f49182e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile k f49184g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6.b f49185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Parcelable f49187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tw.c f49181d = new tw.c(29);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g0 f49183f = new g0(0);

    public /* synthetic */ k(x6.b bVar, Object obj) {
        this.f49185a = bVar;
        this.f49186b = obj;
    }

    public void a(f0 f0Var, boolean z11) {
        boolean zEquals;
        SharedPreferences sharedPreferences = (SharedPreferences) ((n9.q) this.f49186b).f43673b;
        f0 f0Var2 = (f0) this.f49187c;
        this.f49187c = f0Var;
        if (z11) {
            if (f0Var != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", f0Var.f49148a);
                    jSONObject.put("first_name", f0Var.f49149b);
                    jSONObject.put("middle_name", f0Var.f49150c);
                    jSONObject.put("last_name", f0Var.f49151d);
                    jSONObject.put("name", f0Var.f49152e);
                    Uri uri = f0Var.f49153f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = f0Var.f49154t;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (f0Var2 == null) {
            zEquals = f0Var == null;
        } else {
            zEquals = f0Var2.equals(f0Var);
        }
        if (zEquals) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", f0Var2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", f0Var);
        this.f49185a.c(intent);
    }
}
