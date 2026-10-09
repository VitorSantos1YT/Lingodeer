package jf;

import android.view.View;
import cf.i;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import oz.x;
import re.s;
import we.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f36329e = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f36330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f36331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f36332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36333d;

    public f(View view, View view2, String str) {
        this.f36330a = h.e(view);
        this.f36331b = new WeakReference(view2);
        this.f36332c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        m.e(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f36333d = x.q0(lowerCase, "activity", BuildConfig.VERSION_NAME);
    }

    public final void a() {
        if (!qf.a.b(this)) {
            try {
                View view = (View) this.f36331b.get();
                View view2 = (View) this.f36332c.get();
                if (view != null && view2 != null) {
                    try {
                        String strD = c.d(view2);
                        String strB = b.b(view2, strD);
                        if (strB != null && !a.a(strB, strD)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("view", c.b(view, view2));
                            jSONObject.put("screenname", this.f36333d);
                            try {
                                if (!qf.a.b(this)) {
                                    try {
                                        try {
                                            s.d().execute(new i(jSONObject, strD, this, strB, 5));
                                        } catch (Throwable th2) {
                                            th = th2;
                                            try {
                                                qf.a.a(this, th);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                qf.a.a(this, th);
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            m.f(view, "view");
            View.OnClickListener onClickListener = this.f36330a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            a();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
