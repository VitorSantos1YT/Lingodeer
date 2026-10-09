package tf;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements re.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f52168b;

    public /* synthetic */ f(k kVar, int i11) {
        this.f52167a = i11;
        this.f52168b = kVar;
    }

    @Override // re.u
    public final void a(re.b0 b0Var) {
        switch (this.f52167a) {
            case 0:
                k kVar = this.f52168b;
                if (!kVar.W.get()) {
                    re.r rVar = b0Var.f49125c;
                    if (rVar != null) {
                        int i11 = rVar.f49196c;
                        if (i11 == 1349174 || i11 == 1349172) {
                            kVar.B();
                        } else if (i11 == 1349152) {
                            i iVar = kVar.Z;
                            if (iVar != null) {
                                kf.b.a(iVar.f52182b);
                            }
                            t tVar = kVar.f52193c0;
                            if (tVar == null) {
                                kVar.x();
                            } else {
                                kVar.D(tVar);
                            }
                        } else if (i11 != 1349173) {
                            FacebookException facebookException = rVar.K;
                            if (facebookException == null) {
                                facebookException = new FacebookException();
                            }
                            kVar.y(facebookException);
                        } else {
                            kVar.x();
                        }
                    } else {
                        try {
                            JSONObject jSONObject = b0Var.f49124b;
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            String string = jSONObject.getString("access_token");
                            kotlin.jvm.internal.m.e(string, "resultObject.getString(\"access_token\")");
                            kVar.z(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        } catch (JSONException e8) {
                            kVar.y(new FacebookException(e8));
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                k kVar2 = this.f52168b;
                if (!kVar2.f52191a0) {
                    re.r rVar2 = b0Var.f49125c;
                    if (rVar2 != null) {
                        FacebookException facebookException2 = rVar2.K;
                        if (facebookException2 == null) {
                            facebookException2 = new FacebookException();
                        }
                        kVar2.y(facebookException2);
                    } else {
                        JSONObject jSONObject2 = b0Var.f49124b;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        i iVar2 = new i();
                        try {
                            String string2 = jSONObject2.getString("user_code");
                            iVar2.f52182b = string2;
                            iVar2.f52181a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                            iVar2.f52183c = jSONObject2.getString("code");
                            iVar2.f52184d = jSONObject2.getLong("interval");
                            kVar2.C(iVar2);
                        } catch (JSONException e10) {
                            kVar2.y(new FacebookException(e10));
                        }
                    }
                    break;
                }
                break;
        }
    }
}
