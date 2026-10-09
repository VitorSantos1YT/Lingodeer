package com.android.billingclient.api;

import a0.b2;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.fragment.app.e1;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivityV2 extends f.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i.c f7448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i.c f7449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i.c f7450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResultReceiver f7451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ResultReceiver f7452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ResultReceiver f7453f;

    @Override // f.n, n4.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7448a = registerForActivityResult(new e1(5), new a5.j(this, 7));
        this.f7449b = registerForActivityResult(new e1(5), new dm.a(this, 7));
        this.f7450c = registerForActivityResult(new e1(5), new b2(this, 7));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f7451d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f7452e = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f7453f = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
                return;
            }
            return;
        }
        zzc.h("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f7451d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            i.c cVar = this.f7448a;
            kotlin.jvm.internal.m.f(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            kotlin.jvm.internal.m.e(intentSender, "pendingIntent.intentSender");
            cVar.a(new i.k(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f7452e = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            i.c cVar2 = this.f7449b;
            kotlin.jvm.internal.m.f(pendingIntent2, "pendingIntent");
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            kotlin.jvm.internal.m.e(intentSender2, "pendingIntent.intentSender");
            cVar2.a(new i.k(intentSender2, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f7453f = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            i.c cVar3 = this.f7450c;
            kotlin.jvm.internal.m.f(pendingIntent3, "pendingIntent");
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            kotlin.jvm.internal.m.e(intentSender3, "pendingIntent.intentSender");
            cVar3.a(new i.k(intentSender3, null, 0, 0));
        }
    }

    @Override // f.n, n4.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f7451d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f7452e;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f7453f;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
    }
}
