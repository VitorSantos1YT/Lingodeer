package p9;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f46644b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f46645c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f46646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PreferenceScreen f46649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f46650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f46651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f46652j;

    public d0(Context context) {
        this.f46643a = context;
        this.f46648f = context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor a() {
        if (!this.f46647e) {
            return b().edit();
        }
        if (this.f46646d == null) {
            this.f46646d = b().edit();
        }
        return this.f46646d;
    }

    public final SharedPreferences b() {
        if (this.f46645c == null) {
            this.f46645c = this.f46643a.getSharedPreferences(this.f46648f, 0);
        }
        return this.f46645c;
    }
}
