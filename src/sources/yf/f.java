package yf;

import android.app.Activity;
import android.os.Bundle;
import b1.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import lf.i;
import lf.j;
import lf.l;
import lf.n;
import ns.o;
import re.i0;
import re.s;
import re.v;
import wf.h;
import wf.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class f extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f57753i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f57754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f57755h;

    static {
        i.Share.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Activity activity, int i11) {
        super(activity, i11);
        m.f(activity, "activity");
        this.f57754g = true;
        this.f57755h = o.b(new c(this, 2), new c(this, 1), new c(this, 4), new c(this, 0), new c(this, 3));
        j.f40039b.r(i11, new k(i11));
    }

    public static final void e(f fVar, Activity activity, xf.d dVar, d dVar2) {
        String str;
        if (fVar.f57754g) {
            dVar2 = d.AUTOMATIC;
        }
        int i11 = e.f57752a[dVar2.ordinal()];
        String str2 = "unknown";
        if (i11 == 1) {
            str = "automatic";
        } else if (i11 != 2) {
            str = i11 != 3 ? "unknown" : "native";
        } else {
            str = "web";
        }
        l lVarU = v.u(dVar.getClass());
        if (lVarU == h.SHARE_DIALOG) {
            str2 = "status";
        } else if (lVarU == h.PHOTOS) {
            str2 = "photo";
        } else if (lVarU == h.VIDEO) {
            str2 = "video";
        }
        se.m mVar = new se.m(activity, s.b());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        if (i0.c()) {
            mVar.g("fb_share_dialog_show", bundle);
        }
    }

    @Override // lf.n
    public lf.a a() {
        return new lf.a(this.f40070d);
    }

    @Override // lf.n
    public List c() {
        return this.f57755h;
    }

    public boolean f() {
        return false;
    }

    public f(p pVar, int i11) {
        super(pVar, i11);
        this.f57754g = true;
        this.f57755h = o.b(new c(this, 2), new c(this, 1), new c(this, 4), new c(this, 0), new c(this, 3));
        j.f40039b.r(i11, new k(i11));
    }
}
