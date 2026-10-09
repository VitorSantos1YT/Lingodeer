package androidx.credentials.playservices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.zbk;
import com.google.android.gms.auth.api.identity.zbx;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.internal.p000authapi.zbaj;
import com.google.android.gms.internal.p000authapi.zbat;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.android.d;
import dt.Xk.wuoM;
import g5.c;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1441c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ResultReceiver f1442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1443b;

    public final void a(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i11);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f1442a;
        if (resultReceiver != null) {
            resultReceiver.send(i12, bundle);
        }
        this.f1443b = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        m.f(outState, "outState");
        outState.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f1443b);
        super.onSaveInstanceState(outState);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i11 = 0;
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f1442a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        if (bundle != null) {
            this.f1443b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
        if (!this.f1443b) {
            if (stringExtra != null) {
                final int i12 = 2;
                final int i13 = 3;
                Task taskAddOnFailureListener = null;
                final int i14 = 1;
                switch (stringExtra.hashCode()) {
                    case -441061071:
                        if (stringExtra.equals(wuoM.zLQxYKkBIn)) {
                            BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (beginSignInRequest != null) {
                                taskAddOnFailureListener = new zbat(this, new zbx()).c(beginSignInRequest).addOnSuccessListener(new d(new c(this, intExtra, 0), 24)).addOnFailureListener(new OnFailureListener(this) { // from class: g5.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ HiddenActivity f28777b;

                                    {
                                        this.f28777b = this;
                                    }

                                    @Override // com.google.android.gms.tasks.OnFailureListener
                                    public final void onFailure(Exception e8) {
                                        String str;
                                        String str2;
                                        int i15 = i13;
                                        HiddenActivity this$0 = this.f28777b;
                                        switch (i15) {
                                            case 0:
                                                int i16 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver2 = this$0.f1442a;
                                                m.c(resultReceiver2);
                                                this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e8.getMessage());
                                                break;
                                            case 1:
                                                int i17 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver3 = this$0.f1442a;
                                                m.c(resultReceiver3);
                                                this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e8.getMessage());
                                                break;
                                            case 2:
                                                int i18 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str2 = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver4 = this$0.f1442a;
                                                m.c(resultReceiver4);
                                                this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e8.getMessage());
                                                break;
                                            default:
                                                int i19 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str2 = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver5 = this$0.f1442a;
                                                m.c(resultReceiver5);
                                                this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e8.getMessage());
                                                break;
                                        }
                                    }
                                });
                            }
                            if (taskAddOnFailureListener == null) {
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 15545322:
                        if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                            final PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra2 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (publicKeyCredentialCreationOptions != null) {
                                int i15 = Fido.f9215a;
                                final Fido2ApiClient fido2ApiClient = new Fido2ApiClient(this, Fido2ApiClient.f9216l, Api.ApiOptions.f8664h, new ApiExceptionMapper());
                                TaskApiCall.Builder builderA = TaskApiCall.a();
                                builderA.f8761a = new RemoteCall(fido2ApiClient, publicKeyCredentialCreationOptions) { // from class: com.google.android.gms.fido.fido2.zzc

                                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                                    public final /* synthetic */ PublicKeyCredentialCreationOptions f9316a;

                                    {
                                        this.f9316a = publicKeyCredentialCreationOptions;
                                    }

                                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                                    public final void a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                                        zzf zzfVar = new zzf(taskCompletionSource);
                                        com.google.android.gms.internal.fido.zzs zzsVar = (com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) anyClient).y();
                                        Parcel parcelG = zzsVar.g();
                                        ClassLoader classLoader = com.google.android.gms.internal.fido.zzc.f9678a;
                                        parcelG.writeStrongBinder(zzfVar);
                                        com.google.android.gms.internal.fido.zzc.c(parcelG, this.f9316a);
                                        zzsVar.h(parcelG, 1);
                                    }
                                };
                                builderA.f8764d = 5407;
                                taskAddOnFailureListener = fido2ApiClient.b(0, builderA.a()).addOnSuccessListener(new d(new c(this, intExtra2, 2), 21)).addOnFailureListener(new OnFailureListener(this) { // from class: g5.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ HiddenActivity f28777b;

                                    {
                                        this.f28777b = this;
                                    }

                                    @Override // com.google.android.gms.tasks.OnFailureListener
                                    public final void onFailure(Exception e8) {
                                        String str;
                                        String str2;
                                        int i16 = i11;
                                        HiddenActivity this$0 = this.f28777b;
                                        switch (i16) {
                                            case 0:
                                                int i17 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver2 = this$0.f1442a;
                                                m.c(resultReceiver2);
                                                this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e8.getMessage());
                                                break;
                                            case 1:
                                                int i18 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver3 = this$0.f1442a;
                                                m.c(resultReceiver3);
                                                this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e8.getMessage());
                                                break;
                                            case 2:
                                                int i19 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str2 = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver4 = this$0.f1442a;
                                                m.c(resultReceiver4);
                                                this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e8.getMessage());
                                                break;
                                            default:
                                                int i110 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str2 = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver5 = this$0.f1442a;
                                                m.c(resultReceiver5);
                                                this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e8.getMessage());
                                                break;
                                        }
                                    }
                                });
                            }
                            if (taskAddOnFailureListener == null) {
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1246634622:
                        if (stringExtra.equals("CREATE_PASSWORD")) {
                            SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra3 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (savePasswordRequest != null) {
                                taskAddOnFailureListener = new zbaj(this, new zbk()).c(savePasswordRequest).addOnSuccessListener(new d(new c(this, intExtra3, 1), 22)).addOnFailureListener(new OnFailureListener(this) { // from class: g5.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ HiddenActivity f28777b;

                                    {
                                        this.f28777b = this;
                                    }

                                    @Override // com.google.android.gms.tasks.OnFailureListener
                                    public final void onFailure(Exception e8) {
                                        String str;
                                        String str2;
                                        int i16 = i14;
                                        HiddenActivity this$0 = this.f28777b;
                                        switch (i16) {
                                            case 0:
                                                int i17 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver2 = this$0.f1442a;
                                                m.c(resultReceiver2);
                                                this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e8.getMessage());
                                                break;
                                            case 1:
                                                int i18 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver3 = this$0.f1442a;
                                                m.c(resultReceiver3);
                                                this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e8.getMessage());
                                                break;
                                            case 2:
                                                int i19 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str2 = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver4 = this$0.f1442a;
                                                m.c(resultReceiver4);
                                                this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e8.getMessage());
                                                break;
                                            default:
                                                int i110 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str2 = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver5 = this$0.f1442a;
                                                m.c(resultReceiver5);
                                                this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e8.getMessage());
                                                break;
                                        }
                                    }
                                });
                            }
                            if (taskAddOnFailureListener == null) {
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1980564212:
                        if (stringExtra.equals("SIGN_IN_INTENT")) {
                            GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra("REQUEST_TYPE");
                            int intExtra4 = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
                            if (getSignInIntentRequest != null) {
                                taskAddOnFailureListener = new zbat(this, new zbx()).d(getSignInIntentRequest).addOnSuccessListener(new d(new c(this, intExtra4, 3), 23)).addOnFailureListener(new OnFailureListener(this) { // from class: g5.b

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ HiddenActivity f28777b;

                                    {
                                        this.f28777b = this;
                                    }

                                    @Override // com.google.android.gms.tasks.OnFailureListener
                                    public final void onFailure(Exception e8) {
                                        String str;
                                        String str2;
                                        int i16 = i12;
                                        HiddenActivity this$0 = this.f28777b;
                                        switch (i16) {
                                            case 0:
                                                int i17 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver2 = this$0.f1442a;
                                                m.c(resultReceiver2);
                                                this$0.a(resultReceiver2, str, "During create public key credential, fido registration failure: " + e8.getMessage());
                                                break;
                                            case 1:
                                                int i18 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                                                ResultReceiver resultReceiver3 = this$0.f1442a;
                                                m.c(resultReceiver3);
                                                this$0.a(resultReceiver3, str, "During save password, found password failure response from one tap " + e8.getMessage());
                                                break;
                                            case 2:
                                                int i19 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str2 = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver4 = this$0.f1442a;
                                                m.c(resultReceiver4);
                                                this$0.a(resultReceiver4, str2, "During get sign-in intent, failure response from one tap: " + e8.getMessage());
                                                break;
                                            default:
                                                int i110 = HiddenActivity.f1441c;
                                                m.f(this$0, "this$0");
                                                m.f(e8, "e");
                                                str2 = ((e8 instanceof ApiException) && h5.a.f31805a.contains(Integer.valueOf(((ApiException) e8).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                                                ResultReceiver resultReceiver5 = this$0.f1442a;
                                                m.c(resultReceiver5);
                                                this$0.a(resultReceiver5, str2, "During begin sign in, failure response from one tap: " + e8.getMessage());
                                                break;
                                        }
                                    }
                                });
                            }
                            if (taskAddOnFailureListener == null) {
                                finish();
                                return;
                            }
                            return;
                        }
                        break;
                }
            }
            finish();
        }
    }
}
