package com.google.firebase.appcheck.internal;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.components.Lazy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultFirebaseAppCheck f17844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17845c;

    public /* synthetic */ a(DefaultFirebaseAppCheck defaultFirebaseAppCheck, Object obj, int i11) {
        this.f17843a = i11;
        this.f17844b = defaultFirebaseAppCheck;
        this.f17845c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    @Override // java.lang.Runnable
    public final void run() {
        String string;
        DefaultAppCheckToken defaultAppCheckToken;
        switch (this.f17843a) {
            case 0:
                AppCheckToken appCheckToken = (AppCheckToken) this.f17845c;
                Lazy lazy = this.f17844b.f17810e.f17833a;
                if (!(appCheckToken instanceof DefaultAppCheckToken)) {
                    ((SharedPreferences) lazy.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", appCheckToken.b()).putString("com.google.firebase.appcheck.TOKEN_TYPE", StorageHelper.TokenType.UNKNOWN_APP_CHECK_TOKEN.name()).apply();
                } else {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) lazy.get()).edit();
                    DefaultAppCheckToken defaultAppCheckToken2 = (DefaultAppCheckToken) appCheckToken;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("token", defaultAppCheckToken2.f17801a);
                        jSONObject.put("receivedAt", defaultAppCheckToken2.f17802b);
                        jSONObject.put("expiresIn", defaultAppCheckToken2.f17803c);
                        string = jSONObject.toString();
                    } catch (JSONException e8) {
                        e8.getMessage();
                        string = null;
                    }
                    editorEdit.putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", string).putString("com.google.firebase.appcheck.TOKEN_TYPE", StorageHelper.TokenType.DEFAULT_APP_CHECK_TOKEN.name()).apply();
                }
                break;
            default:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f17845c;
                DefaultFirebaseAppCheck defaultFirebaseAppCheck = this.f17844b;
                Lazy lazy2 = defaultFirebaseAppCheck.f17810e.f17833a;
                String string2 = ((SharedPreferences) lazy2.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string3 = ((SharedPreferences) lazy2.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string2 == null || string3 == null) {
                    defaultAppCheckToken = null;
                } else {
                    try {
                        int i11 = StorageHelper.AnonymousClass1.f17834a[StorageHelper.TokenType.valueOf(string2).ordinal()];
                        if (i11 == 1) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(string3);
                                defaultAppCheckToken = new DefaultAppCheckToken(jSONObject2.getString("token"), jSONObject2.getLong("expiresIn"), jSONObject2.getLong("receivedAt"));
                            } catch (JSONException e10) {
                                e10.getMessage();
                                defaultAppCheckToken = null;
                            }
                        } else if (i11 != 2) {
                            defaultAppCheckToken = null;
                        } else {
                            defaultAppCheckToken = DefaultAppCheckToken.c(string3);
                        }
                    } catch (IllegalArgumentException e11) {
                        e11.getMessage();
                        ((SharedPreferences) lazy2.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                        defaultAppCheckToken = null;
                    }
                }
                if (defaultAppCheckToken != null) {
                    defaultFirebaseAppCheck.f17818n = defaultAppCheckToken;
                }
                taskCompletionSource.setResult(null);
                break;
        }
    }
}
