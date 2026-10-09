package tf;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.p0;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookServiceException;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.math.BigInteger;
import java.util.Random;
import lf.j1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i0 {
    public static final Parcelable.Creator<c> CREATOR = new b(0);
    public static boolean L;
    public final String H;
    public final re.g K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f52146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f52147f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f52148t;

    public c(Parcel parcel) {
        super(parcel, 1);
        this.H = "custom_tab";
        this.K = re.g.CHROME_CUSTOM_TAB;
        this.f52147f = parcel.readString();
        this.f52148t = lf.k.g(super.g());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // tf.e0
    public final String e() {
        return this.H;
    }

    @Override // tf.e0
    public final String g() {
        return this.f52148t;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f A[Catch: JSONException -> 0x0070, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0070, blocks: (B:24:0x0056, B:27:0x005f), top: B:69:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    @Override // tf.i0, tf.e0
    public final boolean j(int i11, int i12, Intent intent) {
        t tVar;
        String stringExtra;
        Bundle bundleE;
        String string;
        String string2;
        String string3;
        int i13;
        String string4;
        boolean zA = false;
        if (intent != null) {
            int i14 = CustomTabMainActivity.f7704c;
            if (!intent.getBooleanExtra("CustomTabMainActivity.no_activity_exception", false)) {
                if (i11 == 1 && (tVar = d().f52234t) != null) {
                    if (i12 == -1) {
                        s(tVar, null, new FacebookOperationCanceledException());
                        return false;
                    }
                    if (intent != null) {
                        int i15 = CustomTabMainActivity.f7704c;
                        stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
                    } else {
                        stringExtra = null;
                    }
                    if (stringExtra != null && (oz.x.s0(stringExtra, "fbconnect://cct.", false) || oz.x.s0(stringExtra, super.g(), false))) {
                        Uri uri = Uri.parse(stringExtra);
                        bundleE = j1.E(uri.getQuery());
                        bundleE.putAll(j1.E(uri.getFragment()));
                        try {
                            string4 = bundleE.getString("state");
                            if (string4 == null) {
                                zA = kotlin.jvm.internal.m.a(new JSONObject(string4).getString("7_challenge"), this.f52147f);
                            }
                        } catch (JSONException unused) {
                        }
                        if (zA) {
                            string = bundleE.getString("error");
                            if (string == null) {
                                string = bundleE.getString("error_type");
                            }
                            string2 = bundleE.getString("error_msg");
                            if (string2 == null) {
                                string2 = bundleE.getString("error_message");
                            }
                            if (string2 == null) {
                                string2 = bundleE.getString("error_description");
                            }
                            string3 = bundleE.getString("error_code");
                            if (string3 != null) {
                                try {
                                    i13 = Integer.parseInt(string3);
                                } catch (NumberFormatException unused2) {
                                    i13 = -1;
                                }
                            } else {
                                i13 = -1;
                            }
                            if (!j1.y(string) && j1.y(string2) && i13 == -1) {
                                if (bundleE.containsKey("access_token")) {
                                    s(tVar, bundleE, null);
                                } else {
                                    re.s.d().execute(new androidx.fragment.app.d(this, tVar, bundleE, 16));
                                }
                            } else if ((string == null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) || i13 == 4201) {
                                s(tVar, null, new FacebookOperationCanceledException());
                            } else {
                                s(tVar, null, new FacebookServiceException(new re.r(i13, string, string2), string2));
                            }
                        } else {
                            s(tVar, null, new FacebookException(SemtNwfPgIhi.ISTqKJzKEPfjg));
                        }
                    }
                    return true;
                }
            }
        } else if (i11 == 1) {
            if (i12 == -1) {
                s(tVar, null, new FacebookOperationCanceledException());
                return false;
            }
            if (intent != null) {
                int i16 = CustomTabMainActivity.f7704c;
                stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            } else {
                stringExtra = null;
            }
            if (stringExtra != null) {
                Uri uri2 = Uri.parse(stringExtra);
                bundleE = j1.E(uri2.getQuery());
                bundleE.putAll(j1.E(uri2.getFragment()));
                string4 = bundleE.getString("state");
                if (string4 == null) {
                    zA = kotlin.jvm.internal.m.a(new JSONObject(string4).getString("7_challenge"), this.f52147f);
                }
                if (zA) {
                    s(tVar, null, new FacebookException(SemtNwfPgIhi.ISTqKJzKEPfjg));
                } else {
                    string = bundleE.getString("error");
                    if (string == null) {
                        string = bundleE.getString("error_type");
                    }
                    string2 = bundleE.getString("error_msg");
                    if (string2 == null) {
                        string2 = bundleE.getString("error_message");
                    }
                    if (string2 == null) {
                        string2 = bundleE.getString("error_description");
                    }
                    string3 = bundleE.getString("error_code");
                    if (string3 != null) {
                        i13 = Integer.parseInt(string3);
                    } else {
                        i13 = -1;
                    }
                    if (!j1.y(string)) {
                        if (string == null) {
                            s(tVar, null, new FacebookServiceException(new re.r(i13, string, string2), string2));
                        } else {
                            s(tVar, null, new FacebookServiceException(new re.r(i13, string, string2), string2));
                        }
                    } else if (string == null) {
                        s(tVar, null, new FacebookServiceException(new re.r(i13, string, string2), string2));
                    } else {
                        s(tVar, null, new FacebookServiceException(new re.r(i13, string, string2), string2));
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // tf.e0
    public final void l(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f52147f);
    }

    @Override // tf.e0
    public final int m(t request) {
        kotlin.jvm.internal.m.f(request, "request");
        h0 h0Var = request.N;
        w wVarD = d();
        String str = this.f52148t;
        if (str.length() == 0) {
            return 0;
        }
        Bundle bundleO = o(request);
        String str2 = request.f52217d;
        bundleO.putString("redirect_uri", str);
        if (h0Var == h0.INSTAGRAM) {
            bundleO.putString("app_id", str2);
        } else {
            bundleO.putString("client_id", str2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.m.e(string, "e2e.toString()");
        bundleO.putString("e2e", string);
        h0 h0Var2 = h0.INSTAGRAM;
        if (h0Var == h0Var2) {
            bundleO.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else {
            if (request.f52215b.contains("openid")) {
                bundleO.putString("nonce", request.Q);
            }
            bundleO.putString("response_type", "id_token,token,signed_request,graph_domain");
        }
        bundleO.putString("code_challenge", request.S);
        a aVar = request.T;
        bundleO.putString("code_challenge_method", aVar != null ? aVar.name() : null);
        bundleO.putString("return_scopes", "true");
        bundleO.putString("auth_type", request.H);
        bundleO.putString("login_behavior", request.f52214a.name());
        re.s sVar = re.s.f49201a;
        bundleO.putString("sdk", "android-18.1.3");
        bundleO.putString("sso", "chrome_custom_tab");
        bundleO.putString("cct_prefetching", re.s.m ? "1" : "0");
        if (request.O) {
            bundleO.putString("fx_app", h0Var.toString());
        }
        if (request.P) {
            bundleO.putString("skip_dedupe", "true");
        }
        String str3 = request.L;
        if (str3 != null) {
            bundleO.putString("messenger_page_id", str3);
            bundleO.putString("reset_messenger_state", request.M ? "1" : "0");
        }
        if (L) {
            bundleO.putString("cct_over_app_switch", "1");
        }
        if (re.s.m) {
            if (h0Var == h0Var2) {
                qp.b bVar = d.f52151b;
                jh.h.o(j1.a(lf.k.e(), "oauth/authorize", bundleO));
            } else {
                qp.b bVar2 = d.f52151b;
                jh.h.o(j1.a(lf.k.d(), re.s.e() + "/dialog/oauth", bundleO));
            }
        }
        p0 p0VarE = wVarD.e();
        if (p0VarE == null) {
            return 0;
        }
        Intent intent = new Intent(p0VarE, (Class<?>) CustomTabMainActivity.class);
        int i11 = CustomTabMainActivity.f7704c;
        intent.putExtra("CustomTabMainActivity.extra_action", "oauth");
        intent.putExtra("CustomTabMainActivity.extra_params", bundleO);
        String strB = this.f52146e;
        if (strB == null) {
            strB = lf.k.b();
            this.f52146e = strB;
        }
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", strB);
        intent.putExtra("CustomTabMainActivity.extra_targetApp", h0Var.toString());
        x xVar = wVarD.f52230c;
        if (xVar != null) {
            xVar.startActivityForResult(intent, 1);
        }
        return 1;
    }

    @Override // tf.i0
    public final re.g p() {
        return this.K;
    }

    @Override // tf.e0, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        super.writeToParcel(dest, i11);
        dest.writeString(this.f52147f);
    }

    public c(w wVar) {
        this.f52166b = wVar;
        this.H = "custom_tab";
        this.K = re.g.CHROME_CUSTOM_TAB;
        String string = new BigInteger(100, new Random()).toString(32);
        kotlin.jvm.internal.m.e(string, "BigInteger(length * 5, r).toString(32)");
        this.f52147f = string;
        L = false;
        this.f52148t = lf.k.g(super.g());
    }
}
