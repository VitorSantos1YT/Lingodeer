package pd;

import com.android.volley.VolleyError;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f46799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VolleyError f46800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46801d;

    public l(Object obj, a aVar) {
        this.f46801d = false;
        this.f46798a = obj;
        this.f46799b = aVar;
        this.f46800c = null;
    }

    public l(VolleyError volleyError) {
        this.f46801d = false;
        this.f46798a = null;
        this.f46799b = null;
        this.f46800c = volleyError;
    }
}
