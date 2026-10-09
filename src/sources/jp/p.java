package jp;

import android.content.Intent;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.ui.learn.AdVideoPromptActivity;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements y6.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdVideoPromptActivity f36523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36524b;

    public p(AdVideoPromptActivity adVideoPromptActivity, String str) {
        this.f36523a = adVideoPromptActivity;
        this.f36524b = str;
    }

    @Override // y6.h0
    public final void H(boolean z11) {
        int i11 = AdVideoPromptActivity.V;
        if (z11) {
            AdVideoPromptActivity adVideoPromptActivity = this.f36523a;
            if (adVideoPromptActivity.S == null) {
                o oVar = new o(adVideoPromptActivity, (long) ((hj.g) adVideoPromptActivity.j()).f32587d.getProgress(), 0);
                adVideoPromptActivity.S = oVar;
                oVar.start();
            }
        }
    }

    @Override // y6.h0
    public final void k(int i11) {
        int i12 = AdVideoPromptActivity.V;
        AdVideoPromptActivity adVideoPromptActivity = this.f36523a;
        if (i11 == 3) {
            o oVar = new o(adVideoPromptActivity, (long) ((hj.g) adVideoPromptActivity.j()).f32587d.getProgress(), 1);
            adVideoPromptActivity.S = oVar;
            oVar.start();
        } else {
            if (i11 != 4) {
                return;
            }
            adVideoPromptActivity.finish();
            Intent intent = new Intent(adVideoPromptActivity, (Class<?>) Subscription2Activity.class);
            intent.putExtra(INTENTS.EXTRA_STRING, "purchase_ads");
            adVideoPromptActivity.startActivity(intent);
            adVideoPromptActivity.m().c("jxz_finish_watch_purchase_ads", new ar.a(this.f36524b, 8));
        }
    }
}
