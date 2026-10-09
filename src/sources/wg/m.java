package wg;

import android.os.Bundle;
import android.webkit.WebView;
import java.util.Map;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f55147b = new m(1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i11, int i12) {
        super(i11);
        this.f55148a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f55148a) {
            case 0:
                kotlin.jvm.internal.m.f((WebView) obj, "it");
                return b0.f48488a;
            default:
                Map it = (Map) obj;
                kotlin.jvm.internal.m.f(it, "it");
                r rVar = new r(h.f55133a);
                rVar.f55165d.setValue((String) it.get("pagetitle"));
                rVar.f55162a.setValue((String) it.get("lastloaded"));
                rVar.f55168g = (Bundle) it.get("bundle");
                return rVar;
        }
    }
}
