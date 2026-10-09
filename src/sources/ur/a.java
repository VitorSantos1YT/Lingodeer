package ur;

import android.os.Bundle;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;
import com.bumptech.glide.e;
import com.google.firebase.Firebase;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ParametersBuilder;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.m;
import qy.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f53061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f53062g;

    public a(String str, String str2, int i11, int i12, int i13, int i14, boolean z11) {
        this.f53056a = str;
        this.f53057b = str2;
        this.f53058c = i11;
        this.f53059d = i12;
        this.f53060e = i13;
        this.f53061f = i14;
        this.f53062g = z11;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ui_language", this.f53056a);
        bundle.putString("language", this.f53057b);
        if (this.f53062g) {
            bundle.putString("course", "lv_2");
            return bundle;
        }
        if (this.f53059d != -1) {
            bundle.putString("course", "tv");
            return bundle;
        }
        if (this.f53060e != -1) {
            bundle.putString("course", "cr");
            return bundle;
        }
        if (this.f53061f != -1) {
            bundle.putString("course", "fl");
            return bundle;
        }
        bundle.putString("course", "lv_1");
        return bundle;
    }

    public final void b(String str, fz.a aVar) {
        AdjustEvent adjustEvent = new AdjustEvent(str);
        for (String str2 : a().keySet()) {
            adjustEvent.addCallbackParameter(str2, a().getString(str2));
        }
        for (String str3 : ((Bundle) aVar.invoke()).keySet()) {
            adjustEvent.addCallbackParameter(str3, ((Bundle) aVar.invoke()).getString(str3));
        }
        Adjust.trackEvent(adjustEvent);
    }

    public final void c(String str, fz.a aVar) {
        Object objL;
        try {
            objL = AnalyticsKt.a(Firebase.f17711a);
        } catch (Throwable th2) {
            objL = e.l(th2);
        }
        if (objL instanceof n) {
            objL = null;
        }
        FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) objL;
        if (firebaseAnalytics == null) {
            return;
        }
        if (this.f53058c == -1) {
            firebaseAnalytics.a(null);
        } else {
            firebaseAnalytics.a(a());
        }
        Bundle bundle = (Bundle) aVar.invoke();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            Objects.toString(bundle.get(it.next()));
        }
        firebaseAnalytics.f17763a.h(null, str, bundle, false);
    }

    public final void d(String screenName) {
        Object objL;
        m.f(screenName, "screenName");
        try {
            objL = AnalyticsKt.a(Firebase.f17711a);
        } catch (Throwable th2) {
            objL = e.l(th2);
        }
        if (objL instanceof n) {
            objL = null;
        }
        FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) objL;
        if (firebaseAnalytics == null) {
            return;
        }
        if (this.f53058c == -1) {
            firebaseAnalytics.a(null);
        } else {
            firebaseAnalytics.a(a());
        }
        Bundle bundle = new ParametersBuilder().f17764a;
        bundle.putString("screen_name", screenName);
        firebaseAnalytics.f17763a.h(null, "screen_view", bundle, false);
    }
}
