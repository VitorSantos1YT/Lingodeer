package tf;

import am.rVFB.LwKl;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lf.j1;
import lt.AJC.PQgum;
import qp.m4;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ServiceConnection {
    public final String H;
    public final int K;
    public final String L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f52202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l.g f52203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.e f52204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f52205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Messenger f52206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f52207f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f52208t;

    public final void a(Bundle bundle) {
        if (this.f52205d) {
            this.f52205d = false;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.e eVar = this.f52204c;
            if (eVar != null) {
                p pVar = (p) eVar.f8173b;
                t request = (t) eVar.f8174c;
                kotlin.jvm.internal.m.f(request, "$request");
                o oVar = pVar.f52209c;
                if (oVar != null) {
                    oVar.f52204c = null;
                }
                pVar.f52209c = null;
                o20.i iVar = pVar.d().f52232e;
                if (iVar != null) {
                    View view = ((x) iVar.f44522b).f52239e;
                    if (view == null) {
                        kotlin.jvm.internal.m.n("progressBar");
                        throw null;
                    }
                    view.setVisibility(8);
                }
                if (bundle != null) {
                    List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = ry.r.f50854a;
                    }
                    Set<String> set = request.f52215b;
                    if (set == null) {
                        set = ry.t.f50856a;
                    }
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains("openid") && (string == null || string.length() == 0)) {
                        pVar.d().l();
                        return;
                    }
                    if (stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            pVar.n(request, bundle);
                            return;
                        }
                        o20.i iVar2 = pVar.d().f52232e;
                        if (iVar2 != null) {
                            View view2 = ((x) iVar2.f44522b).f52239e;
                            if (view2 == null) {
                                kotlin.jvm.internal.m.n("progressBar");
                                throw null;
                            }
                            view2.setVisibility(0);
                        }
                        String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        j1.p(string3, new m4(bundle, pVar, request, 4));
                        return;
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        pVar.a("new_permissions", TextUtils.join(",", hashSet));
                    }
                    request.f52215b = hashSet;
                }
                pVar.d().l();
            }
        }
    }

    public o(Context context, t request) {
        kotlin.jvm.internal.m.f(request, "request");
        String str = request.f52217d;
        String str2 = request.Q;
        kotlin.jvm.internal.m.f(str, LwKl.pwsEBgOry);
        Context applicationContext = context.getApplicationContext();
        this.f52202a = applicationContext != null ? applicationContext : context;
        this.f52207f = 65536;
        this.f52208t = 65537;
        this.H = str;
        this.K = 20121101;
        this.L = str2;
        this.f52203b = new l.g(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.m.f(name, "name");
        kotlin.jvm.internal.m.f(service, "service");
        this.f52206e = new Messenger(service);
        Bundle bundle = new Bundle();
        bundle.putString(PQgum.TsolKcjCex, this.H);
        String str = this.L;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message messageObtain = Message.obtain((Handler) null, this.f52207f);
        messageObtain.arg1 = this.K;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f52203b);
        try {
            Messenger messenger = this.f52206e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kotlin.jvm.internal.m.f(componentName, anrPHlQ.BBGBIE);
        this.f52206e = null;
        try {
            this.f52202a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
