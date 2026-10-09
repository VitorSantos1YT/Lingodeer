package wf;

import android.content.Intent;
import android.os.Bundle;
import b7.e0;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import fr.p3;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.m;
import lf.a1;
import lf.c1;
import re.i0;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements lf.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55122a;

    public /* synthetic */ k(int i11) {
        this.f55122a = i11;
    }

    @Override // lf.h
    public final boolean a(Intent intent, int i11) {
        lf.a aVar;
        FacebookException facebookExceptionJ;
        Bundle extras;
        Bundle bundle;
        int i12 = this.f55122a;
        UUID uuidI = c1.i(intent);
        if (uuidI == null) {
            aVar = null;
        } else {
            p3 p3Var = lf.a.f39957d;
            synchronized (p3Var) {
                if (qf.a.b(lf.a.class)) {
                    aVar = null;
                    if (aVar == null && m.a(aVar.a(), uuidI) && aVar.b() == i12) {
                        p3Var.y(null);
                    } else {
                        aVar = null;
                    }
                } else {
                    try {
                        aVar = lf.a.f39958e;
                    } catch (Throwable th2) {
                        qf.a.a(lf.a.class, th2);
                        aVar = null;
                    }
                    if (aVar == null) {
                    }
                    aVar = null;
                }
            }
        }
        boolean zContainsKey = false;
        if (aVar == null) {
            return false;
        }
        UUID callId = aVar.a();
        m.f(callId, "callId");
        File fileE = a1.e(callId, false);
        if (fileE != null) {
            cz.k.R(fileE);
        }
        if (intent != null) {
            if (qf.a.b(c1.class)) {
                bundle = null;
            } else {
                try {
                    if (!qf.a.b(c1.class)) {
                        try {
                            Bundle bundleH = c1.h(intent);
                            zContainsKey = bundleH != null ? bundleH.containsKey("error") : intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
                        } catch (Throwable th3) {
                            qf.a.a(c1.class, th3);
                        }
                    }
                    if (zContainsKey) {
                        Bundle bundleH2 = c1.h(intent);
                        bundle = bundleH2 != null ? bundleH2.getBundle("error") : intent.getExtras();
                    } else {
                        bundle = null;
                    }
                } catch (Throwable th4) {
                    qf.a.a(c1.class, th4);
                }
            }
            facebookExceptionJ = c1.j(bundle);
        } else {
            facebookExceptionJ = null;
        }
        if (facebookExceptionJ != null) {
            if (facebookExceptionJ instanceof FacebookOperationCanceledException) {
                qx.b.x("cancelled", null);
                return true;
            }
            qx.b.x("error", facebookExceptionJ.getMessage());
            return true;
        }
        if (intent == null || qf.a.b(c1.class)) {
            extras = null;
        } else {
            try {
                int iN = c1.n(intent);
                extras = intent.getExtras();
                if (c1.o(iN) && extras != null) {
                    extras = extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
                }
            } catch (Throwable th5) {
                qf.a.a(c1.class, th5);
                extras = null;
            }
        }
        if (extras == null) {
            return true;
        }
        String string = extras.containsKey("completionGesture") ? extras.getString("completionGesture") : extras.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
        if (string != null && !"post".equalsIgnoreCase(string)) {
            if ("cancel".equalsIgnoreCase(string)) {
                qx.b.x("cancelled", null);
                return true;
            }
            qx.b.x("error", new FacebookException("UnknownError").getMessage());
            return true;
        }
        if (extras.containsKey("postId")) {
            extras.getString("postId");
        } else if (extras.containsKey("com.facebook.platform.extra.POST_ID")) {
            extras.getString("com.facebook.platform.extra.POST_ID");
        } else {
            extras.getString("post_id");
        }
        se.m mVar = new se.m(s.a(), (String) null);
        Bundle bundleE = e0.e("fb_share_dialog_outcome", "succeeded");
        if (!i0.c()) {
            return true;
        }
        mVar.g("fb_share_dialog_result", bundleE);
        return true;
    }
}
