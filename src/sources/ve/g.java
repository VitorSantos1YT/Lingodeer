package ve;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import lf.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f53993f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static g f53994g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f53995a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f53996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f53997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f53998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f53999e;

    public g() {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        m.e(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f53996b = setNewSetFromMap;
        this.f53997c = new LinkedHashSet();
        this.f53998d = new HashSet();
        this.f53999e = new HashMap();
    }

    public final void a(Activity activity) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f53996b.add(activity);
            this.f53998d.clear();
            HashSet hashSet = (HashSet) this.f53999e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f53998d = hashSet;
            }
            if (qf.a.b(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    b();
                } else {
                    this.f53995a.post(new i0(this, 20));
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
            }
        } catch (Throwable th3) {
            qf.a.a(this, th3);
        }
    }

    public final void b() {
        if (qf.a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.f53996b) {
                if (activity != null) {
                    this.f53997c.add(new f(ef.e.s(activity), this.f53995a, this.f53998d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public final void c(Activity activity) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f53996b.remove(activity);
                this.f53997c.clear();
                HashMap map = this.f53999e;
                Integer numValueOf = Integer.valueOf(activity.hashCode());
                Object objClone = this.f53998d.clone();
                m.d(objClone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                map.put(numValueOf, (HashSet) objClone);
                this.f53998d.clear();
                return;
            }
            throw new FacebookException(kHfjNGauVgdF.DfZumPSJXinO);
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
