package lf;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f40066f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f40067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1.p f40068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f40069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public re.m f40071e;

    public n(Activity activity, int i11) {
        kotlin.jvm.internal.m.f(activity, "activity");
        this.f40067a = activity;
        this.f40068b = null;
        this.f40070d = i11;
        this.f40071e = null;
    }

    public abstract a a();

    public final Activity b() {
        Activity activity = this.f40067a;
        if (activity != null) {
            return activity;
        }
        b1.p pVar = this.f40068b;
        if (pVar != null) {
            return pVar.w();
        }
        return null;
    }

    public abstract List c();

    public final void d(xf.d dVar) {
        Intent intent;
        a aVarA;
        if (this.f40069c == null) {
            this.f40069c = c();
        }
        List list = this.f40069c;
        kotlin.jvm.internal.m.d(list, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
        Iterator it = list.iterator();
        while (true) {
            intent = null;
            if (!it.hasNext()) {
                aVarA = null;
                break;
            }
            yf.c cVar = (yf.c) it.next();
            if (cVar.a(dVar, true)) {
                try {
                    aVarA = cVar.b(dVar);
                    break;
                } catch (FacebookException e8) {
                    a aVarA2 = a();
                    k.i(aVarA2, e8);
                    aVarA = aVarA2;
                }
            }
        }
        if (aVarA == null) {
            aVarA = a();
            k.i(aVarA, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        }
        if (b() instanceof i.j) {
            ComponentCallbacks2 componentCallbacks2B = b();
            kotlin.jvm.internal.m.d(componentCallbacks2B, "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            i.i activityResultRegistry = ((i.j) componentCallbacks2B).getActivityResultRegistry();
            kotlin.jvm.internal.m.e(activityResultRegistry, "registryOwner.activityResultRegistry");
            re.m mVar = this.f40071e;
            if (!qf.a.b(aVarA)) {
                try {
                    intent = aVarA.f39961c;
                } catch (Throwable th2) {
                    qf.a.a(aVarA, th2);
                }
            }
            if (intent != null) {
                int iB = aVarA.b();
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                i.h hVarD = activityResultRegistry.d(nv.p.j(iB, "facebook-dialog-request-"), new androidx.fragment.app.e1(7), new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(mVar, iB, yVar));
                yVar.f38361a = hVarD;
                hVarD.a(intent);
                aVarA.c();
            }
            aVarA.c();
            return;
        }
        b1.p pVar = this.f40068b;
        if (pVar == null) {
            Activity activity = this.f40067a;
            if (activity != null) {
                if (!qf.a.b(aVarA)) {
                    try {
                        intent = aVarA.f39961c;
                    } catch (Throwable th3) {
                        qf.a.a(aVarA, th3);
                    }
                }
                activity.startActivityForResult(intent, aVarA.b());
                aVarA.c();
                return;
            }
            return;
        }
        if (!qf.a.b(aVarA)) {
            try {
                intent = aVarA.f39961c;
            } catch (Throwable th4) {
                qf.a.a(aVarA, th4);
            }
        }
        int iB2 = aVarA.b();
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) pVar.f3800b;
        if (k0Var != null) {
            k0Var.startActivityForResult(intent, iB2);
        } else {
            Fragment fragment = (Fragment) pVar.f3801c;
            if (fragment != null) {
                fragment.startActivityForResult(intent, iB2);
            }
        }
        aVarA.c();
    }

    public n(b1.p pVar, int i11) {
        this.f40068b = pVar;
        this.f40067a = null;
        this.f40070d = i11;
        if (pVar.w() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
