package n3;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f43142a = new ThreadLocal();

    public static Typeface a(Typeface typeface, r rVar, Context context) {
        if (typeface == null) {
            return null;
        }
        if (rVar.f43172a.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = f43142a;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b2.d.i(rVar, context));
        return paint.getTypeface();
    }
}
