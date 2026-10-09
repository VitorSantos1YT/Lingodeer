package lf;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.WebDialog$setUpWebView$1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends p1 {
    public static final /* synthetic */ int Q = 0;
    public boolean P;

    public static void g(t tVar) {
        super.cancel();
    }

    @Override // lf.p1
    public final Bundle c(String str) {
        Bundle bundleE = j1.E(Uri.parse(str).getQuery());
        String string = bundleE.getString("bridge_args");
        bundleE.remove("bridge_args");
        if (!j1.y(string)) {
            try {
                bundleE.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", g.a(new JSONObject(string)));
            } catch (JSONException unused) {
                re.s sVar = re.s.f49201a;
            }
        }
        String string2 = bundleE.getString("method_results");
        bundleE.remove("method_results");
        if (!j1.y(string2)) {
            try {
                bundleE.putBundle("com.facebook.platform.protocol.RESULT_ARGS", g.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                re.s sVar2 = re.s.f49201a;
            }
        }
        bundleE.remove("version");
        bundleE.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", c1.l());
        return bundleE;
    }

    @Override // lf.p1, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = this.f40093d;
        if (!this.M || this.K || webDialog$setUpWebView$1 == null || !webDialog$setUpWebView$1.isShown()) {
            super.cancel();
        } else {
            if (this.P) {
                return;
            }
            this.P = true;
            webDialog$setUpWebView$1.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new b2.a(this, 28), 1500L);
        }
    }
}
