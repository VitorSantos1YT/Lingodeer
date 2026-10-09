package tf;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.FacebookException;
import java.util.ArrayList;
import lf.c1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends e0 {
    public static final Parcelable.Creator<p> CREATOR = new b(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f52209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f52210d;

    public p(w wVar) {
        this.f52166b = wVar;
        this.f52210d = "get_token";
    }

    @Override // tf.e0
    public final void b() {
        o oVar = this.f52209c;
        if (oVar != null) {
            oVar.f52205d = false;
            oVar.f52204c = null;
            this.f52209c = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // tf.e0
    public final String e() {
        return this.f52210d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:25:0x004c A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:8:0x001c, B:13:0x0025, B:25:0x004c, B:28:0x0056, B:19:0x0043, B:16:0x0033), top: B:49:0x001c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #1 {all -> 0x008b, blocks: (B:8:0x001c, B:13:0x0025, B:25:0x004c, B:28:0x0056, B:19:0x0043, B:16:0x0033), top: B:49:0x001c, inners: #0 }] */
    @Override // tf.e0
    public final int m(t request) {
        int i11;
        Intent intentE;
        boolean z11;
        kotlin.jvm.internal.m.f(request, "request");
        Context contextE = d().e();
        if (contextE == null) {
            contextE = re.s.a();
        }
        o oVar = new o(contextE, request);
        this.f52209c = oVar;
        synchronized (oVar) {
            try {
                if (!oVar.f52205d) {
                    int i12 = oVar.K;
                    c1 c1Var = c1.f39979a;
                    if (qf.a.b(c1.class)) {
                        i11 = 0;
                        if (i11 == -1) {
                            intentE = c1.e(oVar.f52202a);
                            if (intentE == null) {
                                z11 = false;
                            } else {
                                oVar.f52205d = true;
                                oVar.f52202a.bindService(intentE, oVar, 1);
                                z11 = true;
                            }
                        }
                    } else {
                        try {
                            i11 = c1.f39979a.k(c1.f39980b, new int[]{i12}).f7470b;
                        } catch (Throwable th2) {
                            qf.a.a(c1.class, th2);
                            i11 = 0;
                        }
                        if (i11 == -1) {
                            intentE = c1.e(oVar.f52202a);
                            if (intentE == null) {
                                z11 = false;
                            } else {
                                oVar.f52205d = true;
                                oVar.f52202a.bindService(intentE, oVar, 1);
                                z11 = true;
                            }
                        }
                    }
                }
                z11 = false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z11) {
            return 0;
        }
        o20.i iVar = d().f52232e;
        if (iVar != null) {
            View view = ((x) iVar.f44522b).f52239e;
            if (view == null) {
                kotlin.jvm.internal.m.n("progressBar");
                throw null;
            }
            view.setVisibility(0);
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.e eVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.e(20, this, request);
        o oVar2 = this.f52209c;
        if (oVar2 != null) {
            oVar2.f52204c = eVar;
        }
        return 1;
    }

    public final void n(t request, Bundle result) {
        v vVar;
        re.h hVar;
        kotlin.jvm.internal.m.f(request, "request");
        kotlin.jvm.internal.m.f(result, "result");
        try {
            re.b bVarF = md.a.f(result, re.g.FACEBOOK_APPLICATION_SERVICE, request.f52217d);
            String str = request.Q;
            String string = result.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string == null || string.length() == 0 || str == null || str.length() == 0) {
                hVar = null;
            } else {
                try {
                    hVar = new re.h(string, str);
                } catch (Exception e8) {
                    throw new FacebookException(e8.getMessage());
                }
            }
            vVar = new v(request, u.SUCCESS, bVarF, hVar, null, null);
        } catch (FacebookException e10) {
            t tVar = d().f52234t;
            String message = e10.getMessage();
            ArrayList arrayList = new ArrayList();
            if (message != null) {
                arrayList.add(message);
            }
            vVar = new v(tVar, u.ERROR, null, TextUtils.join(": ", arrayList), null);
        }
        d().d(vVar);
    }

    public p(Parcel parcel) {
        super(parcel);
        this.f52210d = "get_token";
    }
}
