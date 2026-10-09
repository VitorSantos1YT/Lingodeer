package g5;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f28779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HiddenActivity hiddenActivity, int i11, int i12) {
        super(1);
        this.f28778a = i12;
        this.f28779b = hiddenActivity;
        this.f28780c = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f28778a) {
            case 0:
                HiddenActivity hiddenActivity = this.f28779b;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                try {
                    hiddenActivity.f1443b = true;
                    hiddenActivity.startIntentSenderForResult(beginSignInResult.f8427a.getIntentSender(), this.f28780c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e8) {
                    ResultReceiver resultReceiver = hiddenActivity.f1442a;
                    m.c(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e8.getMessage());
                }
                break;
            case 1:
                HiddenActivity hiddenActivity2 = this.f28779b;
                SavePasswordResult savePasswordResult = (SavePasswordResult) obj;
                try {
                    hiddenActivity2.f1443b = true;
                    hiddenActivity2.startIntentSenderForResult(savePasswordResult.f8463a.getIntentSender(), this.f28780c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f1442a;
                    m.c(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
                }
                break;
            case 2:
                HiddenActivity hiddenActivity3 = this.f28779b;
                PendingIntent result = (PendingIntent) obj;
                m.f(result, "result");
                try {
                    hiddenActivity3.f1443b = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.f28780c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e11) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f1442a;
                    m.c(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", gkbGsXmgaxRjJ.CfRElj + e11.getMessage());
                }
                break;
            default:
                HiddenActivity hiddenActivity4 = this.f28779b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                try {
                    hiddenActivity4.f1443b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f28780c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e12) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f1442a;
                    m.c(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e12.getMessage());
                }
                break;
        }
        return b0.f48488a;
    }
}
