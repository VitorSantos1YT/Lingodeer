package re;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.facebook.FacebookException;
import com.lingodeer.R;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import lf.f1;
import lf.j1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qp.m3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f49130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f49131e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        this.f49127a = i11;
        this.f49128b = obj;
        this.f49129c = obj2;
        this.f49130d = obj3;
        this.f49131e = obj4;
    }

    @Override // re.u
    public final void a(b0 b0Var) {
        JSONArray jSONArrayOptJSONArray;
        JSONException jSONException;
        switch (this.f49127a) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f49128b;
                HashSet hashSet = (HashSet) this.f49129c;
                HashSet hashSet2 = (HashSet) this.f49130d;
                HashSet hashSet3 = (HashSet) this.f49131e;
                JSONObject jSONObject = b0Var.f49126d;
                if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) != null) {
                    atomicBoolean.set(true);
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("permission");
                            String status = jSONObjectOptJSONObject.optString("status");
                            if (!j1.y(strOptString) && !j1.y(status)) {
                                kotlin.jvm.internal.m.e(status, "status");
                                Locale US = Locale.US;
                                kotlin.jvm.internal.m.e(US, "US");
                                String lowerCase = status.toLowerCase(US);
                                kotlin.jvm.internal.m.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                                int iHashCode = lowerCase.hashCode();
                                if (iHashCode != -1309235419) {
                                    if (iHashCode != 280295099) {
                                        if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                            hashSet2.add(strOptString);
                                        }
                                    } else if (lowerCase.equals("granted")) {
                                        hashSet.add(strOptString);
                                    }
                                } else if (lowerCase.equals("expired")) {
                                    hashSet3.add(strOptString);
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                se.b bVar = (se.b) this.f49128b;
                y yVar = (y) this.f49129c;
                se.y yVar2 = (se.y) this.f49130d;
                com.android.billingclient.api.c0 c0Var = (com.android.billingclient.api.c0) this.f49131e;
                if (!qf.a.b(se.j.class)) {
                    try {
                        se.j.e(bVar, yVar, b0Var, yVar2, c0Var);
                    } catch (Throwable th2) {
                        qf.a.a(se.j.class, th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                final tf.k kVar = (tf.k) this.f49128b;
                final String str = (String) this.f49129c;
                final Date date = (Date) this.f49130d;
                final Date date2 = (Date) this.f49131e;
                if (!kVar.W.get()) {
                    r rVar = b0Var.f49125c;
                    if (rVar != null) {
                        FacebookException facebookException = rVar.K;
                        if (facebookException == null) {
                            facebookException = new FacebookException();
                        }
                        kVar.y(facebookException);
                    } else {
                        try {
                            JSONObject jSONObject2 = b0Var.f49124b;
                            if (jSONObject2 == null) {
                                try {
                                    jSONObject2 = new JSONObject();
                                } catch (JSONException e8) {
                                    jSONException = e8;
                                    kVar.y(new FacebookException(jSONException));
                                }
                            }
                            final String string = jSONObject2.getString("id");
                            kotlin.jvm.internal.m.e(string, "jsonObject.getString(\"id\")");
                            final m3 m3VarA = tf.c0.a(jSONObject2);
                            String string2 = jSONObject2.getString("name");
                            kotlin.jvm.internal.m.e(string2, "jsonObject.getString(\"name\")");
                            tf.i iVar = kVar.Z;
                            if (iVar != null) {
                                kf.b.a(iVar.f52182b);
                            }
                            lf.e0 e0VarB = lf.h0.b(s.b());
                            if (!kotlin.jvm.internal.m.a(e0VarB != null ? Boolean.valueOf(e0VarB.f40001e.contains(f1.RequireConfirm)) : null, Boolean.TRUE) || kVar.f52192b0) {
                                kVar.v(string, m3VarA, str, date, date2);
                            } else {
                                kVar.f52192b0 = true;
                                String string3 = kVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_title);
                                kotlin.jvm.internal.m.e(string3, "resources.getString(R.st…login_confirmation_title)");
                                String string4 = kVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_continue_as);
                                kotlin.jvm.internal.m.e(string4, "resources.getString(R.st…confirmation_continue_as)");
                                String string5 = kVar.getResources().getString(R.string.com_facebook_smart_login_confirmation_cancel);
                                kotlin.jvm.internal.m.e(string5, "resources.getString(R.st…ogin_confirmation_cancel)");
                                String str2 = String.format(string4, Arrays.copyOf(new Object[]{string2}, 1));
                                AlertDialog.Builder builder = new AlertDialog.Builder(kVar.getContext());
                                builder.setMessage(string3).setCancelable(true).setNegativeButton(str2, new DialogInterface.OnClickListener() { // from class: tf.g
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                        k this$0 = kVar;
                                        kotlin.jvm.internal.m.f(this$0, "this$0");
                                        String userId = string;
                                        kotlin.jvm.internal.m.f(userId, "$userId");
                                        m3 permissions = m3VarA;
                                        kotlin.jvm.internal.m.f(permissions, "$permissions");
                                        String accessToken = str;
                                        kotlin.jvm.internal.m.f(accessToken, "$accessToken");
                                        this$0.v(userId, permissions, accessToken, date, date2);
                                    }
                                }).setPositiveButton(string5, new tf.h(kVar, 0));
                                builder.create().show();
                            }
                        } catch (JSONException e10) {
                            jSONException = e10;
                        }
                    }
                    break;
                }
                break;
        }
    }
}
