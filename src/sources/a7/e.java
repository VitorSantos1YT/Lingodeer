package a7;

import android.os.Bundle;
import android.text.Spanned;
import b7.f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f438e;

    static {
        String str = f0.f3975a;
        f434a = Integer.toString(0, 36);
        f435b = Integer.toString(1, 36);
        f436c = Integer.toString(2, 36);
        f437d = Integer.toString(3, 36);
        f438e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i11, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f434a, spanned.getSpanStart(obj));
        bundle2.putInt(f435b, spanned.getSpanEnd(obj));
        bundle2.putInt(f436c, spanned.getSpanFlags(obj));
        bundle2.putInt(f437d, i11);
        if (bundle != null) {
            bundle2.putBundle(f438e, bundle);
        }
        return bundle2;
    }
}
