package cd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f6826d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6829c;

    public a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f6828b = str;
        } else {
            this.f6828b = str.concat("/");
        }
        this.f6829c = map;
        if (callback instanceof View) {
            this.f6827a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f6827a = null;
        }
    }
}
