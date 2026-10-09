package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f7442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7447f;

    public final Intent a(zzie zzieVar, long j11) {
        Intent intentB = b();
        intentB.putExtra("RESPONSE_CODE", 6);
        intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        i iVarA = j.a();
        iVarA.f7515a = 6;
        iVarA.f7517c = "An internal error occurred.";
        j jVarA = iVarA.a();
        int i11 = h0.f7514a;
        intentB.putExtra("FAILURE_LOGGING_PAYLOAD", h0.b(zzieVar, 2, jVarA, null, zzil.BROADCAST_ACTION_UNSPECIFIED).b());
        intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentB.putExtra("billingClientTransactionId", j11);
        intentB.putExtra("wasServiceAutoReconnected", this.f7447f);
        return intentB;
    }

    public final Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        zzie zzieVar;
        Intent intentA;
        Bundle extras;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 100 || i11 == 110) {
            int i13 = zzc.e(intent, "ProxyBillingActivity").f7519a;
            if (i12 == -1) {
                i12 = -1;
            }
            if (intent == null) {
                if (i12 == -1) {
                    zzieVar = zzie.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                } else if (i12 == 0) {
                    zzieVar = zzie.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                } else if (i12 == 3) {
                    zzieVar = zzie.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
                } else if (i12 != 4) {
                    zzieVar = i12 != 5 ? zzie.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzie.NULL_DATA_WITH_ON_CREATE_RUNTIME_EXCEPTION_RESULT_CODE;
                } else {
                    zzieVar = zzie.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
                }
                intentA = a(zzieVar, this.f7446e);
            } else if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentA = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intentA.setPackage(getApplicationContext().getPackageName());
                    intentA.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    Intent intentB = b();
                    intentB.putExtras(intent.getExtras());
                    intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentA = intentB;
                }
                intentA.putExtra("billingClientTransactionId", this.f7446e);
                intentA.putExtra("wasServiceAutoReconnected", this.f7447f);
            } else {
                intentA = a(zzie.NULL_BUNDLE_IN_ACTIVITY_RESULT, this.f7446e);
            }
            if (i11 == 110) {
                intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentA);
        } else if (i11 == 101) {
            int i14 = zzc.f12272a;
            int i15 = (intent == null || (extras = intent.getExtras()) == null) ? 0 : extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
            ResultReceiver resultReceiver = this.f7442a;
            if (resultReceiver != null) {
                resultReceiver.send(i15, intent == null ? null : intent.getExtras());
            }
        } else {
            int i16 = zzc.f12272a;
        }
        this.f7443b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            zzc.h("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f7443b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f7442a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f7444c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f7445d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.f7446e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f7447f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        zzc.h("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f7445d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f7444c = true;
                this.f7445d = 110;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f7442a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f7445d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.f7446e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f7447f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.f7443b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f7445d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            int i11 = zzc.f12272a;
            ResultReceiver resultReceiver = this.f7442a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentA = a(zzie.INTENT_SENDER_EXCEPTION, this.f7446e);
                if (this.f7444c) {
                    intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentA);
            }
            this.f7443b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f7443b) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.f7444c) {
                intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i11 = this.f7445d;
            if (i11 == 110 || i11 == 100) {
                intentB.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentB.putExtra("billingClientTransactionId", this.f7446e);
            }
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f7442a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f7443b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f7444c);
        bundle.putInt("activity_code", this.f7445d);
        bundle.putLong("billingClientTransactionId", this.f7446e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f7447f);
    }
}
