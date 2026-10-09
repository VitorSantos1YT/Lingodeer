package f3;

import android.content.ClipData;
import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;
import fb.g0;
import g2.f0;
import g3.v;
import java.util.function.Consumer;
import l1.t;
import ry.l;
import rz.e0;
import v3.k;
import w2.a0;
import y2.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements z4.e, z4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26615b;

    public i(int i11) {
        this.f26614a = i11;
        switch (i11) {
            case 1:
                this.f26615b = LogSessionId.LOG_SESSION_ID_NONE;
                break;
            default:
                this.f26615b = t.B(Boolean.FALSE);
                break;
        }
    }

    @Override // z4.g
    public ClipData a() {
        return ((ContentInfo) this.f26615b).getClip();
    }

    @Override // z4.e
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f26615b).setLinkUri(uri);
    }

    @Override // z4.e
    public z4.h build() {
        return new z4.h(new i(((ContentInfo.Builder) this.f26615b).build()));
    }

    @Override // z4.e
    public void c(int i11) {
        ((ContentInfo.Builder) this.f26615b).setFlags(i11);
    }

    @Override // z4.g
    public int d() {
        return ((ContentInfo) this.f26615b).getFlags();
    }

    @Override // z4.g
    public ContentInfo e() {
        return (ContentInfo) this.f26615b;
    }

    @Override // z4.g
    public int f() {
        return ((ContentInfo) this.f26615b).getSource();
    }

    public void g(AndroidComposeView androidComposeView, v vVar, vy.i iVar, Consumer consumer) {
        n1.e eVar = new n1.e(new j[16]);
        ef.e.J(vVar.a(), 0, new h(1, 8, n1.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
        l.g0(eVar.f43112a, qx.b.h(b.f26594c, b.f26595d), 0, eVar.f43114c);
        int i11 = eVar.f43114c;
        j jVar = (j) (i11 == 0 ? null : eVar.f43112a[i11 - 1]);
        if (jVar == null) {
            return;
        }
        k kVar = jVar.f26618c;
        d dVar = new d(jVar.f26616a, kVar, e0.c(iVar), this, androidComposeView);
        k1 k1Var = jVar.f26619d;
        f2.c cVarE = a0.h(k1Var).E(k1Var, true);
        long jC = kVar.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, f0.B(g0.A(cVarE)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), dVar);
        scrollCaptureTarget.setScrollBounds(f0.B(kVar));
        consumer.accept(scrollCaptureTarget);
    }

    public void h(LogSessionId logSessionId) {
        b7.a.j(((LogSessionId) this.f26615b).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.f26615b = logSessionId;
    }

    @Override // z4.e
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f26615b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f26614a) {
            case 3:
                return "ContentInfoCompat{" + ((ContentInfo) this.f26615b) + "}";
            default:
                return super.toString();
        }
    }

    public i(ContentInfo contentInfo) {
        this.f26614a = 3;
        contentInfo.getClass();
        this.f26615b = contentInfo;
    }

    public i(ClipData clipData, int i11) {
        this.f26614a = 2;
        this.f26615b = z4.d.a(clipData, i11);
    }
}
